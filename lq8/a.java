package lq8.a;
import cq8.d;
import java.lang.String;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import cq8.b;
import iq8.r;
import lq8.e;
import lq8.b;
import lq8.f;

public class a implements d	// class@002d93
{
    public final ConcurrentHashMap a;
    public static final String[] b;

    static {
       String[] stringArray = new String[]{"TKScoreView","TKLottieImageView","TKBlurImage"};
       a.b = stringArray;
    }
    public void a(){
       super();
       this.a = new ConcurrentHashMap(5);
    }
    public ConcurrentHashMap a(){
       return this.a;
    }
    public String[] b(){
       return a.b;
    }
    public boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0x62e73fa0:
             if (p0.equals("TKScoreView")) {
                i = 0;
             }
             break;
           case 0x6d2b9c7d:
             if (p0.equals("TKBlurImage")) {
                i = 1;
             }
             break;
           case 0x6f86f64a:
             if (p0.equals("TKLottieImageView")) {
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
             return false;
       }
       return true;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.a.clear();
       return;
    }
    public b init(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0x62e73fa0:
             if (p0.equals("TKScoreView")) {
                i = 0;
             }
             break;
           case 0x6d2b9c7d:
             if (p0.equals("TKBlurImage")) {
                i = 1;
             }
             break;
           case 0x6f86f64a:
             if (p0.equals("TKLottieImageView")) {
                i = 2;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             f uof = new f();
             this.a.put("TKScoreView", uof);
             return uof;
           case 1:
             b uob = new b();
             this.a.put("TKBlurImage", uob);
             return uob;
           case 2:
             e uoe = new e();
             this.a.put("TKLottieImageView", uoe);
             return uoe;
           default:
             r.a();
             return null;
       }
    }
    public void init(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       String[] b = a.b;
       int len = b.length;
       int i = 0;
       while (i < len) {
          object oobject = b[i];
          if (!this.a.contains(oobject)) {
             this.init(oobject);
          }
          i = i + 1;
       }
       return;
    }
}
