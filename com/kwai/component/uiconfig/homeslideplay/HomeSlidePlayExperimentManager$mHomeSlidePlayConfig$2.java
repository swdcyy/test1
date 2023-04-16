package com.kwai.component.uiconfig.homeslideplay.HomeSlidePlayExperimentManager$mHomeSlidePlayConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.uiconfig.homeslideplay.HomeSlidePlayConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import th5.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;

public final class HomeSlidePlayExperimentManager$mHomeSlidePlayConfig$2 extends Lambda implements a	// class@000bdc
{
    public static final HomeSlidePlayExperimentManager$mHomeSlidePlayConfig$2 INSTANCE;

    static {
       HomeSlidePlayExperimentManager$mHomeSlidePlayConfig$2.INSTANCE = new HomeSlidePlayExperimentManager$mHomeSlidePlayConfig$2();
    }
    public void HomeSlidePlayExperimentManager$mHomeSlidePlayConfig$2(){
       super(0);
    }
    public final HomeSlidePlayConfig invoke(){
       Object[] objArray = null;
       HomeSlidePlayConfig obj = PatchProxy.apply(objArray, this, HomeSlidePlayExperimentManager$mHomeSlidePlayConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = HomeSlidePlayConfig.class;
       String str = b.a.getString("SlidePlayConfig", "");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       if (objArray == null) {
          objArray = new HomeSlidePlayConfig();
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
