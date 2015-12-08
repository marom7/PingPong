package iAndroid.pingPong;

public class Ball {
	private int x;
	private int y;
	private int rad;
	
	private int maxWidth;
	private int maxHeight;
	private boolean movingRight;
	private boolean movingBottom;

	// Receive the start position of the ball and
	public Ball (int startX, int startY, int startRad,int screenWidth, int screenHight) 		 
	{
		this.x = startX;
		this.y = startY;
		this.rad = startRad;
		
		this.maxWidth = screenWidth;
		this.maxHeight = screenHight;
        this.movingBottom = false;
        this.movingRight = false;
	}

	// Return the ball horizontal position
	public int getX()
	{
		return this.x;
	}

	// Return the ball vertical position
	public int getY()
	{
		return this.y;
	}
	
	public int getRadus()
	{
		return this.rad;
	}
	
	public String getDirection()
	{		
		if (this.movingRight)
			return "right";
		return "left";
	}
	
	// Moving the ball one step.
	public void moveBall()
    {
        // Moving the ball
        if (movingRight)
            this.x++;
        else
            this.x--;
	
        if (movingBottom)
            this.y++;
        else
            this.y--;
        
        // Check if we need to change the ball direction horizontally
        if (this.x >= this.maxWidth-21)// -21
            this.movingRight = false;
        else if(this.x <= 31) //21
            this.movingRight = true;


        // Check if we need to change the ball direction vertically
        if (this.y >= this.maxHeight- 65)
            this.movingBottom = false;
        else if (this.y <= 10)
            this.movingBottom = true;
    }
}

