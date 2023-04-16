package jp8.a;
import cq8.b;
import java.lang.Object;
import gx4.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tachikoma.core.component.toast.TKToast;
import java.util.Map;
import cq8.a;
import java.lang.Boolean;
import java.util.Objects;
import iq8.r;
import java.lang.Number;

public class a implements b	// class@00299a
{

    public void a(){
       super();
    }
    public Object a(f p0){
       TKToast tKToast = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (tKToast != PatchProxyResult.class) {
       }else {
          tKToast = new TKToast(p0);
       }
       return tKToast;
    }
    public void b(Object p0,Map p1){
       a.b(this, p0, p1);
    }
    public boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(p0);
       if (!p0.equals("content")) {
          return false;
       }
       return true;
    }
    public boolean d(String p0){
       return a.h(this, p0);
    }
    public Object e(Object p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p1);
       if (p1.equals("content")) {
          return p0.content;
       }
       r.a();
       return null;
    }
    public Object f(Object p0,String p1,Object[] p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "6");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       Objects.requireNonNull(p1);
       if (!p1.equals("show")) {
          r.a();
          return null;
       }else {
          p0.show();
          return null;
       }
    }
    public void g(Object p0,String p1,Object p2){
       a.a(this, p0, p1, p2);
    }
    public int h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Objects.requireNonNull(p0);
       if (!p0.equals("show")) {
          return 0;
       }
       return 1;
    }
    public String i(){
       return "0";
    }
    public boolean k(Object p0,String p1,Object p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       Objects.requireNonNull(p1);
       if (!p1.equals("content")) {
          b = false;
          r.a();
       }else {
          p0.content = p2;
       }
       return b;
    }
    public String l(){
       return "content,show";
    }
}
