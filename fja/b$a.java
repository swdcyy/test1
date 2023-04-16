package fja.b$a;
import qvb.q;
import fja.b;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.pymk.f;
import a7c.h;
import qvb.a;
import android.view.View;
import com.yxcorp.utility.n;

public class b$a implements q	// class@002949
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       b$a tb;
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       p1 = false;
       if (p0) {
          this.b.D = p1;
       }
       if (p0 && this.b.B.s().isEmpty()) {
          View[] viewArray = new View[]{tb.u,tb.A};
          tb = this.b;
          n.Z(8, viewArray);
       }
       return;
    }
}
