package ao5.c;
import java.lang.Object;
import ao5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.kcube.TabIdentifier;
import java.util.List;
import android.content.Intent;
import ao5.d;

public abstract class c	// class@00030c
{
    public b a;
    public b b;
    public static boolean c;

    public void c(){
       super();
    }
    public b a(){
       Object obj = PatchProxy.apply(null, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(this.g(), this.h());
    }
    public final void b(Intent p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "2")) {
          return;
       }
       this.d(p0, p1);
       return;
    }
    public final b c(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d(p0, null);
    }
    public final b d(Intent p0,d p1){
       b obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e();
       if (obj == null || !obj.j()) {
          obj = this.i(p0, p1);
          this.j(obj, p1);
       }else if(p1 != null){
          p1.a(obj);
       }
       return obj;
    }
    public final b e(){
       return this.a;
    }
    public b f(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          this.b = this.k();
       }
       return this.b;
    }
    public abstract TabIdentifier g();
    public abstract List h();
    public abstract b i(Intent p0,d p1);
    public final void j(b p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "5")) {
          return;
       }
       this.a = p0;
       if (p0.f() != 2) {
          this.b = p0;
       }
       if (p1 != null) {
          p1.a(this.a);
       }
       return;
    }
    public abstract b k();
}
