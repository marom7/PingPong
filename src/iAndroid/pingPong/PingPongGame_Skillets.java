package iAndroid.pingPong;

public class PingPongGame_Skillets extends Thread{
	private Skillet gameSkillet1;
	private Skillet gameSkillet2;
	private PingPongView gameView;
	
	public PingPongGame_Skillets(Skillet skilletOne, Skillet skilletTwo, 
													PingPongView mainView)
    {
        this.gameSkillet1= skilletOne;
        this.gameSkillet2= skilletTwo;
        this.gameView = mainView;
        
    }
    @Override
    public void run()
    {
        while (true)	{
	        this.gameSkillet1.moveSkillet();
	        this.gameSkillet2.moveSkillet();
        
        this.gameView.postInvalidate();
	        try
	        {
	          PingPongGame_Skillets.sleep(2);
	        }
        	catch (InterruptedException e)
	        {
	         // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
        }
    }
 }

