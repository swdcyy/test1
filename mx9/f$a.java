package mx9.f$a;
import d6a.a;
import mx9.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.entity.QPhoto;

public class f$a extends a	// class@003092
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "2")) {
          return;
       }
       k1.m(this.b.j);
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "1")) {
          return;
       }
       f c = this.b.c;
       if (c != null && c.numberOfComments() > 0x2710) {
          k1.r(this.b.j, 500);
       }
       return;
    }
}
