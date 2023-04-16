package com.yxcorp.gifshow.easteregg.manager.BusinessConfigManager$businessConfigs$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.easteregg.manager.BusinessConfigManager$businessConfigs$2$a;
import java.lang.reflect.Type;
import el.a;
import z9a.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;

public final class BusinessConfigManager$businessConfigs$2 extends Lambda implements a	// class@001ace
{
    public static final BusinessConfigManager$businessConfigs$2 INSTANCE;

    static {
       BusinessConfigManager$businessConfigs$2.INSTANCE = new BusinessConfigManager$businessConfigs$2();
    }
    public void BusinessConfigManager$businessConfigs$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       Object[] objArray = null;
       Type obj = PatchProxy.apply(objArray, this, BusinessConfigManager$businessConfigs$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new BusinessConfigManager$businessConfigs$2$a().getType();
       String str = a.a.getString(b.d("user")+"businessConfigs", "");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       return objArray;
    }
}
