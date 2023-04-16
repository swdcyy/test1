package fka.e;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import fka.f;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fka.e$a;
import java.lang.Integer;
import java.lang.StringBuilder;
import jga.c;
import fka.a;

public class e	// class@00161b
{
    public final AtomicInteger a;
    public f b;
    public f c;
    public static e d;

    static {
       e.d = new e();
    }
    public void e(){
       super();
       this.a = new AtomicInteger(0);
       this.b = null;
       this.c = null;
    }
    public static e a(){
       return e.d;
    }
    public static boolean g(f p0){
       boolean b = (p0 != null && p0.a == null)? true: false;
       return b;
    }
    public static boolean h(f p0){
       boolean b = true;
       if (p0 == null || p0.a != b) {
          b = false;
       }
       return b;
    }
    public static boolean i(f p0){
       boolean b = (p0 != null && p0.a == 2)? true: false;
       return b;
    }
    public String b(){
       Object obj = PatchProxy.apply(null, this, e.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d().a;
    }
    public String c(int p0){
       e$a uoa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "13");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (PatchProxy.isSupport(uoe)) {
          uoa = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "16");
          if (uoa != patchProxyRe) {
          label_003a :
             return uoa.a;
          }
       }
       uoa = this.e(new f(2, p0, "TriggerNode"));
       goto label_003a ;
    }
    public e$a d(){
       Object obj = PatchProxy.apply(null, this, e.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e(null);
    }
    public final e$a e(f p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       e$a obj = PatchProxy.applyOneRefs(p0, this, uoe, "17");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, this, uoe, "19");
       if (obj != patchProxyRe) {
       }else {
          e tb = this.b;
          StringBuilder str = "";
          StringBuilder str1 = "";
          while (tb != null) {
             if (tb.c()) {
                str = str+tb.b()+",";
             }
             str1 = str1+tb.toString()+",";
             tb = tb.g;
          }
          if (str.length() > 0) {
             str.deleteCharAt((str.length() - 1));
          }
          obj = new e$a(str, str1);
       }
       if (!e.i(p0)) {
          return obj;
       }else {
          Object obj1 = PatchProxy.applyTwoRefs(obj, p0, this, uoe, "18");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else if(p0.c()){
             obj.a = obj.a+","+p0.b();
             obj.b = obj.b+","+p0.toString();
          }
          return obj;
       }
    }
    public final void f(f p0){
       e tc = this.c;
       p0.f = tc;
       tc.g = p0;
       this.c = p0;
    }
    public void j(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "6")) {
          return;
       }
       if (p0 != null) {
          f uof = new f(1, 0, "elementNode");
          uof.e = p0;
          this.k(uof);
       }
       return;
    }
    public final void k(f p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "10")) {
          return;
       }
       if (!e.i(p0)) {
          if (this.b == null) {
             if (!e.g(p0) || (p0.i == 1 || e.h(p0))) {
                this.c = p0;
                this.b = p0;
             }
          }else if(e.g(p0)){
             Object[] objArray = null;
             a obj = PatchProxy.apply(objArray, this, uoe, "20");
             if (obj != PatchProxyResult.class) {
                objArray = obj;
             }else {
                uoe = this.c;
                while (uoe != null) {
                   if (e.g(uoe)) {
                      objArray = uoe;
                      break ;
                   }
                   f f = uoe.f;
                }
             }
             obj = p0.i;
             if (objArray != null || (obj == 1 || (objArray != null && (obj - objArray.i) == 1))) {
                this.f(p0);
             }
          }else {
             this.f(p0);
          }
       }
       return;
    }
}
