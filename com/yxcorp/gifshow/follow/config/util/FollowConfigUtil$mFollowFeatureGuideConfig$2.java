package com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mFollowFeatureGuideConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.follow.config.model.FollowFeatureGuideConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kha.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;

public final class FollowConfigUtil$mFollowFeatureGuideConfig$2 extends Lambda implements a	// class@0010ad
{
    public static final FollowConfigUtil$mFollowFeatureGuideConfig$2 INSTANCE;

    static {
       FollowConfigUtil$mFollowFeatureGuideConfig$2.INSTANCE = new FollowConfigUtil$mFollowFeatureGuideConfig$2();
    }
    public void FollowConfigUtil$mFollowFeatureGuideConfig$2(){
       super(0);
    }
    public final FollowFeatureGuideConfig invoke(){
       Object[] objArray = null;
       FollowFeatureGuideConfig obj = PatchProxy.apply(objArray, this, FollowConfigUtil$mFollowFeatureGuideConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = FollowFeatureGuideConfig.class;
       String str = a.a.getString("selectionFollowConnectionSwitches", "");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
