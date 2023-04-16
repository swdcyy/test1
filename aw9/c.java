package aw9.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import qsd.d;

public final class c	// class@0002c7
{

    public static final float a(float p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), null, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return (float)((double)d.H0((p0 * (float)100)) / 100.00f);
    }
}
