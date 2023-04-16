package au6.e;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import q87.d;
import com.kwai.logger.KwaiLog;

public final class e	// class@0003b5
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public static void b(e p0,String p1,String p2,Throwable p3,int p4,Object p5){
       if (p4 & 0x01) {
          p1 = "ShareSDK_ZZ";
       }
       if (p4 & 0x04) {
          p3 = null;
       }
       p0.a(p1, p2, p3);
       return;
    }
    public static void d(e p0,String p1,String p2,int p3,Object p4){
       p1 = (p3 & 0x01)? "ShareSDK_ZZ": null;
       p0.c(p1, p2);
       return;
    }
    public final void a(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e.class, "2")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "msg");
       KwaiLog.a(KwaiLog.j("share_sdk", 16, p0, p1, p2));
       return;
    }
    public final void c(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "1")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "msg");
       Object[] objArray = new Object[0];
       KwaiLog.a(KwaiLog.k("share_sdk", 4, p0, p1, objArray));
       return;
    }
}
