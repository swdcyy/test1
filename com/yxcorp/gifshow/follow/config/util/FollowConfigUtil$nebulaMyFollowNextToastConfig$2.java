package com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$nebulaMyFollowNextToastConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.follow.config.model.FollowNextToastConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kha.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;

public final class FollowConfigUtil$nebulaMyFollowNextToastConfig$2 extends Lambda implements a	// class@0010b4
{
    public static final FollowConfigUtil$nebulaMyFollowNextToastConfig$2 INSTANCE;

    static {
       FollowConfigUtil$nebulaMyFollowNextToastConfig$2.INSTANCE = new FollowConfigUtil$nebulaMyFollowNextToastConfig$2();
    }
    public void FollowConfigUtil$nebulaMyFollowNextToastConfig$2(){
       super(0);
    }
    public final FollowNextToastConfig invoke(){
       Object[] objArray = null;
       FollowNextToastConfig obj = PatchProxy.apply(objArray, this, FollowConfigUtil$nebulaMyFollowNextToastConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = FollowNextToastConfig.class;
       String str = a.a.getString("myfollowNextToast", "");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
