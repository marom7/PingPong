package iAndroid.pingPong;

import iAndroid.pingPong.Ball;
import iAndroid.pingPong.BallView;
import iAndroid.pingPong.SkilletView;
import iAndroid.pingPong.PingPongView;
import android.app.Activity;
import android.os.Bundle;
//import android.widget.TextView;

public class PingPong_GameActivity extends Activity {
	private PingPongView gameView;
	private Ball gameBall;
	private Skillet gameSkillet_one;
	private Skillet gameSkillet_two;
	private PingPongGame_Ball gameBallThread;
	private PingPongGame_Skillets gameSkilletsThread;
	final int Rad = 10; 
	// Getting the screen width & height
    public static int screenWidth ;
    public static int screenHeight ;
   // public static TextView textview;
    // Called when the activity is first created. 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        screenWidth = this.getWindowManager().getDefaultDisplay().getWidth();
        screenHeight = this.getWindowManager().getDefaultDisplay().getHeight();
        // Creating the ball
		gameBall = new Ball(screenWidth / 2,
							screenHeight / 2, Rad,  
							screenWidth, 
							screenHeight);

        // Creating the ball & the tow Skillets objects.
		gameSkillet_one = new Skillet(20, 250, 100, gameBall);
		gameSkillet_two = new Skillet(screenWidth -20, 250,100, gameBall);
		
		// Creating the ball view, and giving it the gameBall as a parameter
        BallView ballView = new BallView(this, gameBall);
		// Creating the ball , and giving it them as a parameters.
        SkilletView skilletView1 = new SkilletView(this, gameSkillet_one);
        SkilletView skilletView2 = new SkilletView(this, gameSkillet_two);
        
        // Creating the game view
        this.gameView = new PingPongView(this);
        // Give the gameView our ballView & skillets.
        gameView.setFormsView(ballView, skilletView1, skilletView2);
        // Setting the gameView as the main view for the PingPong activity.
        //setContentView(textview);
        setContentView(gameView);

        // PLAY THE GAME:
        gameBallThread = 
        	new PingPongGame_Ball(gameBall, gameView); 
        gameSkilletsThread = 
        	new PingPongGame_Skillets(gameSkillet_one,  gameSkillet_two,  gameView);			
        // Starting the thread !
        gameBallThread.start();
        gameSkilletsThread.start();
//      Stop the thread !
        gameBallThread.interrupt();
        gameSkilletsThread.interrupt();
    }
}



