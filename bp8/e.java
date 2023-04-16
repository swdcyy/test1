package bp8.e;
import cq8.b;
import java.lang.Object;
import gx4.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tachikoma.core.component.network.Network;
import java.util.Map;
import cq8.a;
import java.lang.Boolean;
import java.util.Objects;
import iq8.r;
import java.lang.Integer;
import iq8.a;
import com.tkruntime.v8.V8Function;
import java.lang.Number;
import com.tkruntime.v8.utils.V8ObjectUtilsQuick;

public class e implements b	// class@000442
{

    public void e(){
       super();
    }
    public Object a(f p0){
       Network network = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (network != PatchProxyResult.class) {
       }else {
          network = new Network(p0);
       }
       return network;
    }
    public void b(Object p0,Map p1){
       a.b(this, p0, p1);
    }
    public boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0xc9e135a5:
             if (p0.equals("scheme")) {
                i = 0;
             }
             break;
           case 0xd55db52c:
             if (p0.equals("bodyParameters")) {
                i = 1;
             }
             break;
           case 0xf018e719:
             if (p0.equals("userInfo")) {
                i = 2;
             }
             break;
           case 0x30f5a8:
             if (p0.equals("host")) {
                i = 3;
             }
             break;
           case 0x346425:
             if (p0.equals("path")) {
                i = 4;
             }
             break;
           case 0x1b57c1ea:
             if (p0.equals("parameters")) {
                i = 5;
             }
             break;
           case 0x2f676f86:
             if (p0.equals("headers")) {
                i = 6;
             }
             break;
           case 0x7bdaa546:
             if (p0.equals("timeoutInterval")) {
                i = 7;
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
           case 1:
           default:
             return false;
       }
       return true;
    }
    public boolean d(String p0){
       return a.h(this, p0);
    }
    public Object e(Object p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p1);
       int i = -1;
       switch (p1.hashCode()){
           case 0xc9e135a5:
             if (p1.equals("scheme")) {
                i = 0;
             }
             break;
           case 0xd55db52c:
             if (p1.equals("bodyParameters")) {
                i = 1;
             }
             break;
           case 0xf018e719:
             if (p1.equals("userInfo")) {
                i = 2;
             }
             break;
           case 0x30f5a8:
             if (p1.equals("host")) {
                i = 3;
             }
             break;
           case 0x346425:
             if (p1.equals("path")) {
                i = 4;
             }
             break;
           case 0x1b57c1ea:
             if (p1.equals("parameters")) {
                i = 5;
             }
             break;
           case 0x2f676f86:
             if (p1.equals("headers")) {
                i = 6;
             }
             break;
           case 0x7bdaa546:
             if (p1.equals("timeoutInterval")) {
                i = 7;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return p0.scheme;
           case 1:
             return p0.bodyParameters;
           case 2:
             return p0.userInfo;
           case 3:
             return p0.host;
           case 4:
             return p0.path;
           case 5:
             return p0.parameters;
           case 6:
             return p0.headers;
           case 7:
             return Integer.valueOf(p0.timeoutInterval);
           default:
             r.a();
             return null;
       }
    }
    public Object f(Object p0,String p1,Object[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p1);
       if (!p1.equals("get")) {
          if (!p1.equals("post")) {
             r.a();
             return null;
          }else {
             p0.post(a.a(p2, 0));
             return null;
          }
       }else {
          p0.get(a.a(p2, 0));
          return null;
       }
    }
    public void g(Object p0,String p1,Object p2){
       a.a(this, p0, p1, p2);
    }
    public int h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Objects.requireNonNull(p0);
       if (!p0.equals("get") && !p0.equals("post")) {
          return 0;
       }
       return 1;
    }
    public String i(){
       return "0";
    }
    public boolean k(Object p0,String p1,Object p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(p1);
       int i = -1;
       boolean b = false;
       switch (p1.hashCode()){
           case 0xc9e135a5:
             if (p1.equals("scheme")) {
                i = 0;
             }
             break;
           case 0xd55db52c:
             if (p1.equals("bodyParameters")) {
                i = 1;
             }
             break;
           case 0xf018e719:
             if (p1.equals("userInfo")) {
                i = 2;
             }
             break;
           case 0x30f5a8:
             if (p1.equals("host")) {
                i = 3;
             }
             break;
           case 0x346425:
             if (p1.equals("path")) {
                i = 4;
             }
             break;
           case 0x1b57c1ea:
             if (p1.equals("parameters")) {
                i = 5;
             }
             break;
           case 0x2f676f86:
             if (p1.equals("headers")) {
                i = 6;
             }
             break;
           case 0x7bdaa546:
             if (p1.equals("timeoutInterval")) {
                i = 7;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             p0.setScheme(p2);
          label_00c9 :
             b = true;
             break;
           case 1:
             p0.setBody(V8ObjectUtilsQuick.getValue(p2));
             goto label_00c9 ;
             break;
           case 2:
             p0.setUserInfo(V8ObjectUtilsQuick.getValue(p2));
             goto label_00c9 ;
             break;
           case 3:
             p0.setHost(p2);
             goto label_00c9 ;
             break;
           case 4:
             p0.setPath(p2);
             goto label_00c9 ;
             break;
           case 5:
             p0.setParams(V8ObjectUtilsQuick.getValue(p2));
             goto label_00c9 ;
             break;
           case 6:
             p0.setHeader(V8ObjectUtilsQuick.getValue(p2));
             goto label_00c9 ;
             break;
           case 7:
             p0.setInterval(a.m(p2));
             goto label_00c9 ;
             break;
           default:
             r.a();
       }
       return b;
    }
    public String l(){
       return "scheme,headers,host,path,bodyParameters,timeoutInterval,parameters,userInfo,get,post";
    }
}
