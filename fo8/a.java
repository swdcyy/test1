package fo8.a;
import cq8.b;
import java.lang.Object;
import gx4.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tachikoma.component.storage.LocalStorage;
import java.util.Map;
import cq8.a;
import java.util.Objects;
import iq8.r;
import iq8.a;
import com.tkruntime.v8.V8Function;
import java.lang.Number;

public class a implements b	// class@002336
{

    public void a(){
       super();
    }
    public Object a(f p0){
       LocalStorage localStorage = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (localStorage != PatchProxyResult.class) {
       }else {
          localStorage = new LocalStorage(p0);
       }
       return localStorage;
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
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p1);
       int i = -1;
       switch (p1.hashCode()){
           case 0xfb80e389:
             if (p1.equals("getItem")) {
                i = 0;
             }
             break;
           case 0x5a5b64d:
             if (p1.equals("clear")) {
                i = 1;
             }
             break;
           case 0x417605b7:
             if (p1.equals("removeItem")) {
                i = 2;
             }
             break;
           case 0x764baa95:
             if (p1.equals("setItem")) {
                i = 3;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             p0.getItem(a.a(p2, 0), a.a(p2, 1));
             return null;
           case 1:
             p0.clear();
             return null;
           case 2:
             p0.removeItem(a.a(p2, 0));
             return null;
           case 3:
             p0.setItem(a.a(p2, 0), a.a(p2, 1), a.a(p2, 2));
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
           case 0xfb80e389:
             if (p0.equals("getItem")) {
                i = 0;
             }
             break;
           case 0x5a5b64d:
             if (p0.equals("clear")) {
                i = 1;
             }
             break;
           case 0x417605b7:
             if (p0.equals("removeItem")) {
                i = 2;
             }
             break;
           case 0x764baa95:
             if (p0.equals("setItem")) {
                i = 3;
             }
             break;
           default:
       }
       switch (i){
           case 0:
           case 2:
           case 3:
           case 1:
           default:
             return 0;
       }
       return 1;
    }
    public String i(){
       return "0";
    }
    public boolean k(Object p0,String p1,Object p2){
       return a.c(this, p0, p1, p2);
    }
    public String l(){
       return "clear,setItem,getItem,removeItem";
    }
}
