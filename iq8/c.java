package iq8.c;
import cq8.b;
import java.lang.Object;
import gx4.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tachikoma.core.utility.Console;
import java.util.Map;
import cq8.a;
import java.util.Objects;
import iq8.r;
import iq8.a;
import java.lang.Number;

public class c implements b	// class@00270c
{

    public void c(){
       super();
    }
    public Object a(f p0){
       Console uConsole = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (uConsole != PatchProxyResult.class) {
       }else {
          uConsole = new Console(p0);
       }
       return uConsole;
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
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p1);
       int i = -1;
       switch (p1.hashCode()){
           case 0x1a344:
             if (p1.equals("log")) {
                i = 0;
             }
             break;
           case 0x3164ae:
             if (p1.equals("info")) {
                i = 1;
             }
             break;
           case 0x379286:
             if (p1.equals("warn")) {
                i = 2;
             }
             break;
           case 0x5c4d208:
             if (p1.equals("error")) {
                i = 3;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             p0.log(a.a(p2, 0));
             return null;
           case 1:
             p0.info(a.a(p2, 0));
             return null;
           case 2:
             p0.warn(a.a(p2, 0));
             return null;
           case 3:
             p0.error(a.a(p2, 0));
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
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0x1a344:
             if (p0.equals("log")) {
                i = 0;
             }
             break;
           case 0x3164ae:
             if (p0.equals("info")) {
                i = 1;
             }
             break;
           case 0x379286:
             if (p0.equals("warn")) {
                i = 2;
             }
             break;
           case 0x5c4d208:
             if (p0.equals("error")) {
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
       return "log,warn,info,error";
    }
}
