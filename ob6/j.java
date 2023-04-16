package ob6.j;
import pb6.h;
import ob6.j$a;
import nsd.u;
import java.lang.Object;
import o56.c;
import o56.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ta6.c;
import java.lang.StringBuilder;
import q87.c;
import ob6.k;
import com.google.common.collect.ImmutableList;
import ob6.k$a;
import wkd.b;
import ob6.p;
import ob6.h;
import com.kwai.framework.network.keyconfig.BaseConfig;
import java.lang.Long;

public class j implements h	// class@001fef
{
    public final boolean a;
    public static final j$a b;

    static {
       j.b = new j$a(null);
    }
    public void j(){
       super();
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       this.a = SystemUtil.L(uoc.a());
    }
    public void a(String p0){
       Long longx;
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       a.p(p0, "path");
       Object[] objArray = new Object[0];
       c.C().w("KeyConfigBlockingGetter", "mainProcess "+this.a+", path: "+p0, objArray);
       if (this.a != null && ((a.g("/rest/system/keyconfig", p0) ^ 0x01) && !k.a.a().contains(p0))) {
          h oh = b.a(0x36463d96).g();
          c uoc = c.C();
          StringBuilder str = "serverTimestamp: ";
          if (oh != null) {
             oh = oh.mBaseConfig;
             if (oh != null) {
                longx = Long.valueOf(oh.g());
             label_007c :
                Object[] objArray1 = new Object[0];
                uoc.w("KeyConfigBlockingGetter", str+longx, objArray1);
             }
          }
          longx = null;
          goto label_007c ;
       }
    label_0088 :
       return;
    }
}
