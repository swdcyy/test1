package com.yxcorp.gifshow.music.RobustHorizontalSlideView;
import com.kwai.library.widget.scrollview.HorizontalSlideView;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.HorizontalScrollView;
import android.view.View;

public final class RobustHorizontalSlideView extends HorizontalSlideView	// class@001fd6
{

    public void RobustHorizontalSlideView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void RobustHorizontalSlideView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void RobustHorizontalSlideView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RobustHorizontalSlideView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "ev");
       if (!this.b() || p0.getActionMasked()) {
          return super.onInterceptTouchEvent(p0);
       }
       float x = p0.getX();
       int width = this.getWidth();
       View secondView = this.getSecondView();
       boolean b = false;
       int width1 = (secondView != null)? secondView.getWidth(): 0;
       if (x - (float)(width - width1) < 0) {
          b = true;
       }
       return b;
    }
}
