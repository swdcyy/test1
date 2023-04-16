package gf1.f$a;
import ft5.d;
import gf1.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class f$a implements d	// class@0024be
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, f$a.class, "3")) {
          return;
       }
       f$a ta = this.a;
       if (ta.a != null) {
          ta.b();
       }
       return;
    }
    public void onDismiss(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "2")) {
          return;
       }
       f$a ta = this.a;
       ta.b = false;
       ta.a(false);
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "1")) {
          return;
       }
       f$a ta = this.a;
       ta.b = true;
       ta.a(true);
       return;
    }
}
