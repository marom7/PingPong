// VER 1.0 - 01.01.13 By MM
package iAndroid.pingPong;
//import java.util.Random;

public class Skillet {
	private int x;
	private int y;
	private int length;
	Ball theBall;  
	private int maxWidth;
	//private Random rnd;
	//private boolean ballRight;
	// Receive the start position of the skillet and
	public Skillet (int startX, int startY, int length, Ball gameBall)
	{
		this.x = startX;
		this.y = startY;
		this.length = length;
		this.maxWidth = PingPong_GameActivity.screenWidth;
		this.theBall = gameBall;
		//this.rnd = new Random();
	}

	// Return the skillet horizontal position
	public int getX()
	{
		return this.x;
	}

	// Return the skillet vertical position
	public int getY()
	{
		return this.y;
	}
	
	public int getLen()
	{
		return this.length;
	}
	
	public void moveSkillet()
    {		
		
		//int random=this.rnd.nextInt(10);
		// Skillet I + II
		if( (theBall.getDirection()=="right" && this.x> 0.8*this.maxWidth) ||  //$NON-NLS-1$
				(theBall.getDirection()=="left" && this.x< 0.2*this.maxWidth)	) //$NON-NLS-1$
		{
				if ((this.y+this.length/2) < theBall.getY())
						this.y=this.y+2;
				if ((this.y+this.length/2)> theBall.getY())
					if (this.y>2) 
						this.y=this.y-2;
		}
       //double BallDeg = Math.toDegrees(Math.atan(1)) ;
     }
}
