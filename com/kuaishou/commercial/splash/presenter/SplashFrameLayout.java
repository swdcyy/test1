package com.kuaishou.commercial.splash.presenter.SplashFrameLayout;
import com.kuaishou.commercial.drawloggerwidget.DispatchDrawFrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.SystemClock;
import yx.j0;
import android.view.View;

public class SplashFrameLayout extends DispatchDrawFrameLayout	// class@0015d0
{
    public boolean c;
    public long d;

    public void SplashFrameLayout(Context p0){
       super(p0);
    }
    public void SplashFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SplashFrameLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.c == null) {
          return super.onTouchEvent(p0);
       }
       String str = "touch event blocked by me";
       if (!PatchProxy.applyVoidOneRefs(str, this, SplashFrameLayout.class, "2")) {
          long l = SystemClock.elapsedRealtime();
          if ((l - this.d) - 2000 > 0) {
             Object[] objArray = new Object[0];
             j0.f("SplashFrameLayout", str, objArray);
             this.d = l;
          }
       }
       return true;
    }
}
