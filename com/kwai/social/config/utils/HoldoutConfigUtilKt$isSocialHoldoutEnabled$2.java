package com.kwai.social.config.utils.HoldoutConfigUtilKt$isSocialHoldoutEnabled$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xf6.i;
import com.kwai.social.startup.holdout.model.SocialHoldoutConfig;
import mw4.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;

public final class HoldoutConfigUtilKt$isSocialHoldoutEnabled$2 extends Lambda implements a	// class@000f45
{
    public static final HoldoutConfigUtilKt$isSocialHoldoutEnabled$2 INSTANCE;

    static {
       HoldoutConfigUtilKt$isSocialHoldoutEnabled$2.INSTANCE = new HoldoutConfigUtilKt$isSocialHoldoutEnabled$2();
    }
    public void HoldoutConfigUtilKt$isSocialHoldoutEnabled$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object[] objArray = null;
       SocialHoldoutConfig obj = PatchProxy.apply(objArray, this, HoldoutConfigUtilKt$isSocialHoldoutEnabled$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!i.c("KEY_ENABLE_SOCIAL_HOLDOUT")) {
          obj = SocialHoldoutConfig.class;
          String str = a.a.getString("SocialHoldoutConfig", "");
          if (str != null && str != "") {
             objArray = b.a(str, obj);
          }
          obj = (objArray != null)? objArray.enableSocialHoldout: null;
          if (obj == null) {
          label_003e :
             return b;
          }
       }
       b = true;
       goto label_003e ;
    }
}
