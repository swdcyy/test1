package com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptManager$mInitRealModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jea.g;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptManager;
import java.util.concurrent.atomic.AtomicInteger;

public final class NasaLaunchOptManager$mInitRealModel$2 extends Lambda implements a	// class@000fa3
{
    public static final NasaLaunchOptManager$mInitRealModel$2 INSTANCE;

    static {
       NasaLaunchOptManager$mInitRealModel$2.INSTANCE = new NasaLaunchOptManager$mInitRealModel$2();
    }
    public void NasaLaunchOptManager$mInitRealModel$2(){
       super(0);
    }
    public final QPhoto invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, NasaLaunchOptManager$mInitRealModel$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.applyOneRefs(QPhoto.class, objArray, g.class, "5");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else {
          String str = g.a.getString("launchOptModel", "");
          if (str != null && str != "") {
             objArray = b.a(str, QPhoto.class);
          }
       }
       NasaLaunchOptManager.b(NasaLaunchOptManager.m).incrementAndGet();
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
