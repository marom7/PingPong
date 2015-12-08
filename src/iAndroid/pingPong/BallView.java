package iAndroid.pingPong;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;


public class BallView extends View {

	private Ball theBall;
    private Paint ballPaint;

	public BallView(Context context, Ball newBall) {
		super(context);
		this.theBall = newBall;
	}
	
	private Paint getBallPaint()
	{
	    if (ballPaint == null)
	    {
	        ballPaint = new Paint();
	        ballPaint.setStrokeWidth(2);
	        ballPaint.setColor(Color.GREEN);
	    }
	   return ballPaint;
	}
		
	@Override
	public void onDraw(Canvas canvas) 
	{
        // Drawing the ball
     	canvas.drawCircle(theBall.getX(), theBall.getY(), theBall.getRadus(), 
     																getBallPaint());
     	
	}
}

