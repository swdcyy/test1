package com.yxcorp.gifshow.activity.share.presenter.y1$c;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.activity.share.presenter.y1;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class y1$c implements View$OnTouchListener	// class@00145b
{
    public final y1 b;

    public void y1$c(y1 p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, y1$c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (p1.getAction() == 1 || p1.getAction() == 3) {
          return true;
       }
       return false;
    }
}
