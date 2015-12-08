package iAndroid.pingPong;

public class PingPongGame_Ball extends Thread {
	private Ball gameBall;
	private PingPongView gameView;
	
	public PingPongGame_Ball(Ball theBall, PingPongView mainView)
    {
        this.gameBall = theBall;
        this.gameView = mainView;
        
    }
    @Override
    public void run()
    {
        while (true)	{
        this.gameBall.moveBall();
 
        this.gameView.postInvalidate();
	        try
	        {
	          PingPongGame_Ball.sleep(2);
	        }
        	catch (InterruptedException e)
	        {
	         // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
        }
    }
 }
