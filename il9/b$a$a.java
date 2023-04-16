package il9.b$a$a;
import il9.b$b;
import il9.b$a;
import il9.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import il9.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$a;

public class b$a$a implements b$b	// class@002864
{
    public final e a;
    public final b$a b;

    public void b$a$a(b$a p0,e p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b$a$a.class, "5")) {
          return;
       }
       this.b.f.a();
       return;
    }
    public boolean b(boolean p0){
       b$a$a uoa$a = b$a$a.class;
       if (PatchProxy.isSupport(uoa$a)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa$a, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       uoa$a = this.b;
       uoa$a.n = p0;
       return uoa$a.f.b(p0);
    }
    public void c(int p0,boolean p1){
       b$a$a uoa$a = b$a$a.class;
       if (PatchProxy.isSupport(uoa$a) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uoa$a, "4")) {
          return;
       }
       this.b.f.c(p0, p1);
       b$a$a tb = this.b;
       tb.n = true;
       if (tb.i != null) {
          b$a$a ta = this.a;
          b$a h = tb.h;
          if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(ta, h, Integer.valueOf(p0), null, b.class, "7")) {
             e z = ta.z;
             int i = 3;
             if (!TextUtils.x(z) && p0 == i) {
                b.e(z, h, true, CdnResource$ResourceKey.combo_number_0);
             }
             z = ta.A;
             if (!TextUtils.x(z) && p0 == i) {
                b.e(z, h, true, CdnResource$ResourceKey.combo_text_0);
             }
             String str = PatchProxy.apply(null, ta, e.class, "1");
             if (str != PatchProxyResult.class) {
             }else {
                str = ta.y.getKsOrderId();
             }
             if (!TextUtils.x(str) && p0 == 1) {
                b.e(str, h, true, CdnResource$ResourceKey.combo_particle);
             }
          }
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, b$a$a.class, "2")) {
          return;
       }
       this.b.f.d();
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, b$a$a.class, "6")) {
          return;
       }
       this.b.f.e();
       return;
    }
    public boolean f(){
       Object obj = PatchProxy.apply(null, this, b$a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.f.f();
    }
}
