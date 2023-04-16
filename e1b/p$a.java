package e1b.p$a;
import qvb.q;
import e1b.p;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import e1b.s;
import qvb.p;

public class p$a implements q	// class@0025fa
{
    public final p b;

    public void p$a(p p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p$a uoa = p$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "3")) {
          return;
       }
       this.b.Z8(p0, p1);
       return;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(p$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, p$a.class, "1")) {
          return;
       }
       this.b.b9(p0);
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       if (PatchProxy.isSupport(p$a.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, p$a.class, "4")) {
          return;
       }
       this.b.Y8();
       return;
    }
    public void v2(boolean p0,boolean p1){
       p$a uoa = p$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "2")) {
          return;
       }
       this.b.c9(p0, p1);
       return;
    }
}
