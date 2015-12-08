package iAndroid.pingPong;

//import java.io.charset.Charset;
//import java.io.charset.CharsetDecoder;

//import android.R.string;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
//import android.widget.Toast;

public class SkilletView extends View {
	private Skillet theSkillet;
    private Paint SkilletPaint;

	public SkilletView(Context context, Skillet newSkillet) {
		super(context);
		this.theSkillet = newSkillet;
		//Toast.makeText(context, "" + theSkillet.getY() , Toast.LENGTH_LONG).show();
	}
	
	private Paint getSkilletPaint()
	{
	    if (SkilletPaint == null)
	    {
	    	SkilletPaint = new Paint();
	    	SkilletPaint.setStrokeWidth(2);
	    	SkilletPaint.setColor(Color.YELLOW);
	    }
	   return SkilletPaint;
	}
		
	@Override
	public void onDraw(Canvas canvas) 
	{
        // Drawing the Skillet
     	canvas.drawRect(this.theSkillet.getX(), this.theSkillet.getY(),
     			this.theSkillet.getX()+10, this.theSkillet.getY()+ this.theSkillet.getLen()
     			, getSkilletPaint());
	}
}

