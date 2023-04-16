package com.facebook.react.views.art.ARTSurfaceViewManager$a;
import lg.e;
import java.lang.Object;
import lg.g;
import com.facebook.yoga.YogaMeasureMode;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.IllegalStateException;

public final class ARTSurfaceViewManager$a implements e	// class@001395
{

    public void ARTSurfaceViewManager$a(){
       super();
    }
    public long a(g p0,float p1,YogaMeasureMode p2,float p3,YogaMeasureMode p4){
       if (PatchProxy.isSupport(ARTSurfaceViewManager$a.class)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(p1),p2,Float.valueOf(p3),p4};
          p0 = PatchProxy.apply(objArray, this, ARTSurfaceViewManager$a.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.longValue();
          }
       }
       throw new IllegalStateException("SurfaceView should have explicit width and height set");
    }
}
