package com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkScoreProgressBar$a;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkScoreProgressBar;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkScoreProgressBar$b;

public class LiveMultiPkScoreProgressBar$a extends GestureDetector$SimpleOnGestureListener	// class@00167b
{
    public final LiveMultiPkScoreProgressBar b;

    public void LiveMultiPkScoreProgressBar$a(LiveMultiPkScoreProgressBar p0){
       this.b = p0;
       super();
    }
    public boolean onDown(MotionEvent p0){
       return true;
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       LiveMultiPkScoreProgressBar$a obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkScoreProgressBar$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidOneRefs(p0, obj, LiveMultiPkScoreProgressBar.class, "3") && obj.h > null) {
          LiveMultiPkScoreProgressBar o = obj.o;
          if (o != null) {
             boolean b = (p0.getX() - (float)obj.h <= 0)? true: false;
             o.p2(b);
          }
       }
       return true;
    }
}
