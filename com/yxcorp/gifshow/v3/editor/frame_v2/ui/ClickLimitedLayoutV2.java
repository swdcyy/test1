package com.yxcorp.gifshow.v3.editor.frame_v2.ui.ClickLimitedLayoutV2;
import android.widget.FrameLayout;
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
import faa.a;
import q87.c;
import android.os.SystemClock;
import java.lang.StringBuilder;
import android.view.ViewGroup;

public final class ClickLimitedLayoutV2 extends FrameLayout	// class@000fa3
{
    public final long b;
    public long c;
    public HashMap d;

    public void ClickLimitedLayoutV2(Context p0){
       a.p(p0, "context");
       super(p0);
       this.b = 300;
    }
    public void ClickLimitedLayoutV2(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.b = 300;
    }
    public void ClickLimitedLayoutV2(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = 300;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ClickLimitedLayoutV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       if (!p0.getAction()) {
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().s("ClickLimitedLayoutV2", "onInterceptTouchEvent\(\) called with: event = [ ACTION_DOWN ]", objArray);
          if ((SystemClock.elapsedRealtime() - this.c) - this.b < 0) {
             Object[] objArray1 = new Object[i];
             a.D().s("ClickLimitedLayoutV2", "onInterceptTouchEvent\(\) timeInterval = "+(SystemClock.elapsedRealtime() - this.c), objArray1);
             return true;
          }else {
             this.c = SystemClock.elapsedRealtime();
          }
       }
       return super.onInterceptTouchEvent(p0);
    }
}
