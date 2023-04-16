package go8.a;
import cq8.b;
import java.lang.Object;
import gx4.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tachikoma.component.toast.Toast;
import java.util.Map;
import cq8.a;
import java.util.Objects;
import iq8.r;
import iq8.a;
import com.tkruntime.v8.V8Object;
import java.lang.Number;

public class a implements b	// class@0024ab
{

    public void a(){
       super();
    }
    public Object a(f p0){
       Toast toast = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (toast != PatchProxyResult.class) {
       }else {
          toast = new Toast(p0);
       }
       return toast;
    }
    public void b(Object p0,Map p1){
       a.b(this, p0, p1);
    }
    public boolean c(String p0){
       return a.i(this, p0);
    }
    public boolean d(String p0){
       return a.h(this, p0);
    }
    public Object e(Object p0,String p1){
       return a.f(this, p0, p1);
    }
    public Object f(Object p0,String p1,Object[] p2){
       int this;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p1);
       int i = -1;
       int i1 = 2;
       this = 1;
       switch (p1.hashCode()){
           case 0xaf968b71:
             if (p1.equals("custom")) {
                i = 0;
             }
             break;
           case 0x30dd42:
             if (p1.equals("hide")) {
                i = 1;
             }
             break;
           case 0x35dafd:
             if (p1.equals("show")) {
                i = 2;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             p0.custom(a.a(p2, 0), a.a(p2, this), a.a(p2, i1), a.m(a.c(p2, 3)));
             return null;
           case 1:
             p0.hide();
             return null;
           case 2:
             p0.show(a.a(p2, 0), a.a(p2, this));
             return null;
           default:
             r.a();
             return null;
       }
    }
    public void g(Object p0,String p1,Object p2){
       a.a(this, p0, p1, p2);
    }
    public int h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0xaf968b71:
             if (p0.equals("custom")) {
                i = 0;
             }
             break;
           case 0x30dd42:
             if (p0.equals("hide")) {
                i = 1;
             }
             break;
           case 0x35dafd:
             if (p0.equals("show")) {
                i = 2;
             }
             break;
           default:
       }
       switch (i){
           case 0:
           case 2:
           case 1:
           default:
             return 0;
       }
       return 1;
    }
    public String i(){
       return "1";
    }
    public boolean k(Object p0,String p1,Object p2){
       return a.c(this, p0, p1, p2);
    }
    public String l(){
       return "show,hide,custom";
    }
}
