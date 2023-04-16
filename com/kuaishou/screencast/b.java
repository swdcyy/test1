package com.kuaishou.screencast.b;
import com.kuaishou.screencast.d$a;
import com.kuaishou.screencast.c;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ew4.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Runnable;
import ekd.k1;
import ew4.e;
import java.lang.Integer;
import ew4.d;

public class b implements d$a	// class@000f04
{
    public final c a;

    public void b(c p0){
       this.a = p0;
       super();
    }
    public void a(ArrayList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("ScreencastManager", "onDevicesAvailable\(\) called with: devicesInfo = ["+p0.size()+"]", objArray);
       b ta = this.a;
       if (ta.c == null) {
          k1.r(ta.i, 0x2710);
       }
       if (p0.equals(this.a.c)) {
          return;
       }else {
          ta = this.a;
          ta.c = p0;
          ta.d = p0;
          k1.o(new e(this, p0));
          return;
       }
    }
    public void d(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("ScreencastManager", "onPlayInfo\(\) called with: code = ["+p0+"]", objArray);
       k1.o(new d(this, p0));
       return;
    }
}
