package mu1.k;
import yh3.a;
import java.lang.String;
import mu1.i;
import mu1.g;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import java.lang.Object;
import mu1.k$a;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import mu1.f;
import mu1.f$b;
import mu1.f$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Long;

public class k extends a	// class@003226
{
    public final MutableLiveData a;
    public final i$a b;
    public final i c;
    public final g d;
    public final MutableLiveData e;
    public final MutableLiveData f;
    public final String g;
    public n0 h;
    public final boolean i;
    public final boolean j;

    public void k(String p0,i p1,g p2){
       super();
       this.a = new MutableLiveData();
       Boolean fALSE = Boolean.FALSE;
       this.e = new MutableLiveData(fALSE);
       this.f = new MutableLiveData(fALSE);
       this.g = p0;
       this.i = p2.b();
       this.j = p2.e();
       this.c = p1;
       this.d = p2;
       k$a uoa = new k$a(this, p0);
       this.b = uoa;
       Objects.requireNonNull(p1);
       if (PatchProxy.applyVoidOneRefs(uoa, p1, i.class, "6")) {
       }else {
          p1.b.add(uoa);
       }
       return;
    }
    public void onCleared(){
       String str = "7";
       if (PatchProxy.applyVoid(null, this, k.class, str)) {
          return;
       }
       k tc = this.c;
       k tb = this.b;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(tb, tc, i.class, str) && tb != null) {
          tc.b.remove(tb);
       }
       return;
    }
    public void u0(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "6")) {
          return;
       }
       if (p0 instanceof f$b) {
          if (this.i != null) {
             this.d.f1("2");
          }
          this.c.b(this.w0(this.g), this.j, true);
       }
       if (p0 instanceof f$a) {
          this.d.f1("1");
          this.c.b(this.w0(this.g), this.j, false);
       }
       return;
    }
    public final boolean v0(boolean p0,long p1){
       if (!p0) {
          return false;
       }
       if (!p1) {
          return false;
       }
       return true;
    }
    public final long w0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return Long.parseLong(p0);
    }
}
