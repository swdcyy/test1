package com.kuaishou.live.multiinteract.rtc.a$a;
import mh3.d$a;
import com.kuaishou.live.multiinteract.rtc.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lh3.a;
import crd.b;
import oh3.j;
import yg3.a$c;
import android.util.Size;
import yg3.a$b;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import lh3.h;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import lh3.h$a;
import oh3.i;
import cjd.e;
import erd.o;
import lh3.f;
import lh3.e;
import erd.g;

public class a$a implements d$a	// class@000cfe
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(){
       t ot;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$a.class, "1")) {
          return;
       }
       a$a ta = this.a;
       ta.c.c(ta.g);
       j.a(this.a.a);
       a$c a = this.a.e.a;
       Size size = (a != null)? a.a(): objArray;
       i3 oi3 = i3.f();
       int i = 0;
       int width = (size != null)? size.getWidth(): 0;
       oi3.c("width", Integer.valueOf(width));
       int height = (size != null)? size.getHeight(): 0;
       oi3.c("height", Integer.valueOf(height));
       ta = this.a;
       a g = ta.g;
       a h = ta.h;
       a i1 = ta.i;
       String str = oi3.toString();
       a$c b = this.a.e.b;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray1 = new Object[]{Integer.valueOf(g),h,i1,str,Boolean.valueOf(b),objArray};
          ot = PatchProxy.apply(objArray1, objArray, oh, "2");
          if (ot != PatchProxyResult.class) {
          label_00a3 :
             ta.a = ot.map(new e()).subscribe(new f(this), new e(this));
             return;
          }
       }
       ot = h.a().e(i.a("n/live/interactiveChat/ready", g), g, h, i1, str, b, null);
       goto label_00a3 ;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       a$a ta = this.a;
       ta.c.a(ta.g, 1, ta.h);
       return;
    }
}
