package y96.c;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import java.lang.UnsupportedOperationException;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.lang.Number;
import wkd.b;
import ob6.p;
import ob6.f;
import com.kwai.framework.network.keyconfig.ApiFeature;

public class c	// class@00284c
{
    public static final long a;
    public static final int b;

    static {
       c.a = TimeUnit.SECONDS.toMillis(5);
    }
    public void c(){
       super();
    }
    public static boolean a(ClientEvent$ElementPackage p0){
       ClientEvent$ElementPackage obj = PatchProxy.applyOneRefs(p0, null, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.action2;
       if (obj != null && obj.contains("SF2020")) {
          return true;
       }
       p0 = p0.params;
       if (p0 != null && p0.contains("SF2020")) {
          return true;
       }
       return false;
    }
    public static void b(){
       if (PatchProxy.applyVoid(null, null, c.class, "1")) {
          return;
       }
       if (SystemUtil.L(a.b())) {
          return;
       }
       throw new UnsupportedOperationException("This method should only be called in main process.");
    }
    public static boolean c(ClientEvent$UrlPackage p0){
       ClientEvent$UrlPackage obj = PatchProxy.applyOneRefs(p0, null, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.page2;
       if (obj != null && obj.contains("SF2020")) {
          return true;
       }
       obj = p0.subPages;
       if (obj != null && obj.contains("SF2020")) {
          return true;
       }
       p0 = p0.params;
       if (p0 != null && p0.contains("SF2020")) {
          return true;
       }
       return false;
    }
    public static long d(){
       Object obj = PatchProxy.apply(null, null, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = b.a(0x36463d96).i().f(ApiFeature.CLIENT_LOG);
       if (!l) {
          l = c.a;
       }
       return l;
    }
    public static long e(){
       Object obj = PatchProxy.apply(null, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return b.a(0x36463d96).i().f(ApiFeature.REAL_LOG);
    }
}
