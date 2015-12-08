package iAndroid.pingPong;

public class PingPongGame extends Thread {
	private Ball gameBall;
	private Skillet gameSkillet;
	private PingPongView gameView;
	
	public PingPongGame(Ball theBall, Skillet theSkillet, PingPongView mainView)
    {
        this.gameBall = theBall;
        this.gameSkillet= theSkillet;
        this.gameView = mainView;
        //
    }
	
    @Override
    
    public void run()
    {
    	
        while (true)	{
        this.gameBall.moveBall();
        this.gameView.postInvalidate();
        //     this.gameSkillet.moveSkillet();
        //     this.gameView.postInvalidate();
	        try
	        {
	          PingPongGame.sleep(1);
	        }
        	catch (InterruptedException e)
	        {
	         // TODO Auto-generated catch block
	            e.printStackTrace();
	            //marom
	        }
        }
    }
 }
