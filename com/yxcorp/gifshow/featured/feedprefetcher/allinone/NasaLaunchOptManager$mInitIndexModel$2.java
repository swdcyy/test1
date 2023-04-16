package com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptManager$mInitIndexModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptIndexModel;
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
import java.util.concurrent.atomic.AtomicReference;

public final class NasaLaunchOptManager$mInitIndexModel$2 extends Lambda implements a	// class@000fa2
{
    public static final NasaLaunchOptManager$mInitIndexModel$2 INSTANCE;

    static {
       NasaLaunchOptManager$mInitIndexModel$2.INSTANCE = new NasaLaunchOptManager$mInitIndexModel$2();
    }
    public void NasaLaunchOptManager$mInitIndexModel$2(){
       super(0);
    }
    public final NasaLaunchOptIndexModel invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       Object obj = PatchProxy.apply(objArray, this, NasaLaunchOptManager$mInitIndexModel$2.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.applyOneRefs(NasaLaunchOptIndexModel.class, objArray, g.class, str);
       if (obj1 != patchProxyRe) {
       }else {
          str = "";
          String str1 = g.a.getString("launchOptIndex", str);
          obj1 = (str1 == null || str1 == str)? objArray: b.a(str1, NasaLaunchOptIndexModel.class);
       }
       NasaLaunchOptManager.b(NasaLaunchOptManager.m).incrementAndGet();
       AtomicReference c = NasaLaunchOptManager.c;
       if (obj1 != null) {
          objArray = obj1.getPhotoId();
       }
       c.set(objArray);
       return obj1;
    }
    public Object invoke(){
       return this.invoke();
    }
}
