package iAndroid.pingPong;

import iAndroid.pingPong.BallView;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;



public class PingPongView extends View {
	private BallView ballV;
	private SkilletView skilletV1, skilletV2;
	//private Context context;
	
	public PingPongView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		//this.context = context;
	}
	
	public void setFormsView(BallView viewB, SkilletView viewS1, SkilletView viewS2)
	{
	    this.ballV = viewB;
	    this.skilletV1 = viewS1;
	    this.skilletV2 = viewS2;
	}
	
	@Override
	public void onDraw(Canvas canvas) {
		// Drawing the ball & skillet.
		this.ballV.onDraw(canvas);
		this.skilletV1.onDraw(canvas);
		this.skilletV2.onDraw(canvas);

	    }
	}


