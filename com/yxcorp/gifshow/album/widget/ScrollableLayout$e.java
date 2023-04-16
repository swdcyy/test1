package com.yxcorp.gifshow.album.widget.ScrollableLayout$e;
import android.view.animation.Interpolator;
import th0.e;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class ScrollableLayout$e implements Interpolator	// class@001b0e
{
    public final e a;

    public void ScrollableLayout$e(e p0){
       this.a = p0;
       super();
    }
    public final float getInterpolation(float p0){
       if (PatchProxy.isSupport(ScrollableLayout$e.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, ScrollableLayout$e.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return this.a.getInterpolation(p0);
    }
}
