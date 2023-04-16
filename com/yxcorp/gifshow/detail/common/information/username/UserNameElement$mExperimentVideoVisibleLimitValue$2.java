package com.yxcorp.gifshow.detail.common.information.username.UserNameElement$mExperimentVideoVisibleLimitValue$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.model.VisibilityExpirationConfig;
import uw9.c;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;

public final class UserNameElement$mExperimentVideoVisibleLimitValue$2 extends Lambda implements a	// class@00146d
{
    public static final UserNameElement$mExperimentVideoVisibleLimitValue$2 INSTANCE;

    static {
       UserNameElement$mExperimentVideoVisibleLimitValue$2.INSTANCE = new UserNameElement$mExperimentVideoVisibleLimitValue$2();
    }
    public void UserNameElement$mExperimentVideoVisibleLimitValue$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object[] objArray = null;
       VisibilityExpirationConfig obj = PatchProxy.apply(objArray, this, UserNameElement$mExperimentVideoVisibleLimitValue$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = VisibilityExpirationConfig.class;
       String str = c.a.getString("visibilityExpirationConfig", "null");
       Object[] objArray1 = (str == null || str == "")? objArray: b.a(str, obj);
       if (objArray1 != null) {
          objArray = objArray1.tag;
       }
       return objArray;
    }
}
