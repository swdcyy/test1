package dq8.b;
import cq8.b;
import java.lang.Object;
import gx4.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tachikoma.core.module.TKWebCardBridgeImpl;
import java.util.Map;
import cq8.a;
import java.util.Objects;
import iq8.r;
import iq8.a;
import com.tkruntime.v8.V8Function;
import java.lang.Number;

public class b implements b	// class@0020e0
{

    public void b(){
       super();
    }
    public Object a(f p0){
       TKWebCardBridgeImpl tKWebCardBri = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (tKWebCardBri != PatchProxyResult.class) {
       }else {
          tKWebCardBri = new TKWebCardBridgeImpl(p0);
       }
       return tKWebCardBri;
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
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p1);
       int i = -1;
       switch (p1.hashCode()){
           case 0xbf3e3ac4:
             if (p1.equals("registerProgressListener")) {
                i = 0;
             }
             break;
           case 0xfb7e5820:
             if (p1.equals("getData")) {
                i = 1;
             }
             break;
           case 0x1a344:
             if (p1.equals("log")) {
                i = 2;
             }
             break;
           case 0x30dd42:
             if (p1.equals("hide")) {
                i = 3;
             }
             break;
           case 0x5a5ddf8:
             if (p1.equals("close")) {
                i = 4;
             }
             break;
           case 0x697f145:
             if (p1.equals("trace")) {
                i = 5;
             }
             break;
           case 0x38b81db3:
             if (p1.equals("convert")) {
                i = 6;
             }
             break;
           case 0x4cb0b761:
             if (p1.equals("pageStatus")) {
                i = 7;
             }
             break;
           case 0x5756e504:
             if (p1.equals("handleAdUrl")) {
                i = 8;
             }
             break;
           case 0x6ee6e198:
             if (p1.equals("nonActionbarClick")) {
                i = 9;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             p0.registerProgressListener(a.a(p2, 0));
             return null;
           case 1:
             return p0.getData();
           case 2:
             p0.log(a.a(p2, 0));
             return null;
           case 3:
             p0.hide();
             return null;
           case 4:
             p0.close();
             return null;
           case 5:
             p0.trace(a.a(p2, 0));
             return null;
           case 6:
             p0.convert();
             return null;
           case 7:
             p0.pageStatus(a.a(p2, 0));
             return null;
           case 8:
             p0.handleAdUrl(a.a(p2, 0));
             return null;
           case 9:
             p0.nonActionbarClick(a.a(p2, 0));
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
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0xbf3e3ac4:
             if (p0.equals("registerProgressListener")) {
                i = 0;
             }
             break;
           case 0xfb7e5820:
             if (p0.equals("getData")) {
                i = 1;
             }
             break;
           case 0x1a344:
             if (p0.equals("log")) {
                i = 2;
             }
             break;
           case 0x30dd42:
             if (p0.equals("hide")) {
                i = 3;
             }
             break;
           case 0x5a5ddf8:
             if (p0.equals("close")) {
                i = 4;
             }
             break;
           case 0x697f145:
             if (p0.equals("trace")) {
                i = 5;
             }
             break;
           case 0x38b81db3:
             if (p0.equals("convert")) {
                i = 6;
             }
             break;
           case 0x4cb0b761:
             if (p0.equals("pageStatus")) {
                i = 7;
             }
             break;
           case 0x5756e504:
             if (p0.equals("handleAdUrl")) {
                i = 8;
             }
             break;
           case 0x6ee6e198:
             if (p0.equals("nonActionbarClick")) {
                i = 9;
             }
             break;
           default:
       }
       switch (i){
           case 0:
           case 2:
           case 3:
           case 4:
           case 5:
           case 6:
           case 7:
           case 8:
           case 9:
             return 1;
           case 1:
             return 2;
           default:
             return 0;
       }
    }
    public String i(){
       return "0";
    }
    public boolean k(Object p0,String p1,Object p2){
       return a.c(this, p0, p1, p2);
    }
    public String l(){
       return "nonActionbarClick,convert,registerProgressListener,hide,trace,log,handleAdUrl,getData,pageStatus,close";
    }
}
