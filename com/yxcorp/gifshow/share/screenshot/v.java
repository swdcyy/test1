package com.yxcorp.gifshow.share.screenshot.v;
import android.view.View$OnTouchListener;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import com.yxcorp.gifshow.share.screenshot.ScreenShotShareDialog;

public final class v implements View$OnTouchListener	// class@001c69
{
    public static final v b;

    static {
       v.b = new v();
    }
    public void v(){
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       if (!p1.getAction()) {
          p0.setAlpha(0x3f000000);
       }else if(p1.getAction() == 1){
          p0.setAlpha(0x3f800000);
       }
       return false;
    }
}
