package q56.d;
import x97.d;
import com.yxcorp.retrofit.f;
import java.lang.Object;
import za6.b;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.retrofit.e;
import java.util.HashMap;
import okhttp3.Request;
import java.lang.CharSequence;
import android.text.TextUtils;

public class d implements d	// class@002232
{
    public f a;
    public b b;

    public void d(f p0){
       super();
       this.a = p0;
    }
    public void d(b p0){
       super();
       this.b = p0;
    }
    public Map a(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (e.h().e()) {
          return this.b.h();
       }
       return this.a.a();
    }
    public Map b(){
       HashMap obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (e.h().e()) {
          return this.b.d();
       }
       obj = new HashMap();
       this.a.d(obj);
       return obj;
    }
    public String c(Request p0,Map p1,Map p2){
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (e.h().e()) {
          this.b.g(p0, p1, p2, null);
       }else {
          obj = "client_salt";
          String str = p1.remove(obj);
          if (TextUtils.isEmpty(str)) {
             str = p2.remove(obj);
          }
          this.a.c(p0, p1, p2, str, null);
       }
       return "";
    }
    public void d(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       if (e.h().e()) {
          p0.putAll(this.b.e());
          return;
       }else {
          this.a.j(p0);
          return;
       }
    }
    public Map e(){
       HashMap obj = PatchProxy.apply(null, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (e.h().e()) {
          return this.b.c();
       }
       obj = new HashMap();
       this.a.b(obj);
       return obj;
    }
}
