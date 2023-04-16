package com.kuaishou.live.core.show.floatingwindow.i;
import java.lang.Object;
import wp5.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.Arrays;
import pp.c;
import com.kuaishou.android.live.log.b;
import va1.n0;
import lnc.a1;

public class i	// class@000b87
{

    public void i(){
       super();
    }
    public static int[] a(d p0){
       int i;
       d uod = null;
       Object obj = PatchProxy.applyOneRefs(p0, uod, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          uod = p0.a;
       }
       i = 2;
       if (uod == null || uod.length != i) {
          uod = new int[i];
          uod[0] = n0.f();
          uod[1] = a1.d(0x7f07076e);
       }else {
          b.c0(LiveLogTag.FLOATING_WINDOW, "get delegate location success", "location ", Arrays.toString(uod));
       }
       return uod;
    }
}
