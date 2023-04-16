package cra.b$a;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.protobuf.log.nano.ClientExtInfo$RecoExtInfo;
import wkd.b;
import kotlin.jvm.internal.a;
import x96.c;
import java.util.List;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.client.log.packages.nano.ClientBase$ApplicationPackage;
import java.util.Collection;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.Context;
import skd.a;
import com.google.protobuf.nano.MessageNano;
import ekd.s;
import com.kwai.framework.security.LogEncryptor;
import android.util.Base64;
import yma.a;
import yma.b;
import brd.t;
import brd.z;
import lrd.b;
import cra.b$a$a;
import cra.b$a$b;
import erd.g;
import crd.b;
import cra.b;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class b$a implements Runnable	// class@002377
{
    public final int b;

    public void b$a(int p0){
       this.b = p0;
       super();
    }
    public final void run(){
       long l1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$a.class, "1")) {
          return;
       }
       ClientExtInfo$RecoExtInfo recoExtInfo = new ClientExtInfo$RecoExtInfo();
       List obj = b.a(-587602830);
       a.o(obj, "Singleton.get\(AppInstalledCollector::class.java\)");
       obj = obj.c();
       Object[] objArray1 = new Object[0];
       w.C().w("AppListUploadUtil", "appList: "+obj, objArray1);
       a.o(obj, "appList");
       ClientBase$ApplicationPackage[] uApplication = new ClientBase$ApplicationPackage[0];
       Object[] objArray2 = obj.toArray(uApplication);
       Objects.requireNonNull(objArray2, "null cannot be cast to non-null type kotlin.Array<T>");
       recoExtInfo.app = objArray2;
       Object[] objArray3 = new Object[0];
       w.C().w("AppListUploadUtil", "appList.toTypedArray\(\): "+recoExtInfo.app, objArray3);
       long l = b.a(-587602830);
       a.o(l, "Singleton.get\(AppInstalledCollector::class.java\)");
       _monitor_enter(l);
       Object obj1 = PatchProxy.apply(objArray, l, c.class, "11");
       if (obj1 != PatchProxyResult.class) {
          l1 = obj1.longValue();
          _monitor_exit(l);
       }else if(!l.c - -1){
          l.c = a.b(l.a, "APP_SP").getLong("K_APP_TM", 0);
       }
       l1 = l.c;
       _monitor_exit(l);
       w ow = w.C();
       String str = "AppListUploadUtil";
       String str1 = "appListCacheTime: "+l1;
       objArray3 = new Object[0];
       try{
          ow.w(str, str1, objArray3);
          byte[] uobyteArray = s.b(MessageNano.toByteArray(recoExtInfo));
          a.o(uobyteArray, "content");
          String str2 = Base64.encodeToString(LogEncryptor.c.a(uobyteArray), 2);
          objArray3 = new Object[0];
          w.C().w("AppListUploadUtil", "extInfoString: "+str2, objArray3);
          Object obj2 = b.a(-1257347683);
          a.o(obj2, "Singleton.get\(GrowthApi::class.java\)");
          obj2.b().n(str2, this.b, l1).observeOn(b.c()).subscribeOn(b.c()).subscribe(b$a$a.b, b$a$b.b);
       }catch(java.lang.IllegalArgumentException e0){
          b.a(b.b, 0);
          ExceptionHandler.handleCaughtException(e0);
       }
       return;
    }
}
