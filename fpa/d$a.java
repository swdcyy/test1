package fpa.d$a;
import ov5.a;
import fpa.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.library.widget.popup.common.c;

public final class d$a implements a	// class@0029b1
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,int p1,boolean p2){
       d$a ta = this.a;
       ta.b = false;
       ta.e = null;
    }
    public void b(int p0,boolean p1){
       if (PatchProxy.isSupport(d$a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, d$a.class, "1")) {
          return;
       }
       if (p0 != 119 && p0 != 120) {
          d$a ta = this.a;
          ta.b = true;
          d e = ta.e;
          if (e != null) {
             e.o();
          }
       }
       return;
    }
}
