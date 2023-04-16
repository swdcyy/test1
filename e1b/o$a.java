package e1b.o$a;
import qvb.q;
import e1b.o;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import e1b.n;
import qvb.p;
import y0b.h;
import nl8.a;

public class o$a implements q	// class@0025f8
{
    public final o b;

    public void o$a(o p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "3")) {
          return;
       }
       this.b.a9(p0, p1);
       return;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(o$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, o$a.class, "1")) {
          return;
       }
       this.b.c9(p0);
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       if (PatchProxy.isSupport(o$a.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, o$a.class, "4")) {
          return;
       }
       this.b.Z8();
       return;
    }
    public void v2(boolean p0,boolean p1){
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "2")) {
          return;
       }
       o$a tb = this.b;
       tb.d9(p0, tb.W8().m());
       return;
    }
}
