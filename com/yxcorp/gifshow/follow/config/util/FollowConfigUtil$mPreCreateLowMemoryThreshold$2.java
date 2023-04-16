package com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mPreCreateLowMemoryThreshold$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Float;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class FollowConfigUtil$mPreCreateLowMemoryThreshold$2 extends Lambda implements a	// class@0010b2
{
    public static final FollowConfigUtil$mPreCreateLowMemoryThreshold$2 INSTANCE;

    static {
       FollowConfigUtil$mPreCreateLowMemoryThreshold$2.INSTANCE = new FollowConfigUtil$mPreCreateLowMemoryThreshold$2();
    }
    public void FollowConfigUtil$mPreCreateLowMemoryThreshold$2(){
       super(0);
    }
    public final Float invoke(){
       Object obj = PatchProxy.apply(null, this, FollowConfigUtil$mPreCreateLowMemoryThreshold$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("preCreateLowMemoryThreshold", Float.TYPE, Float.valueOf(0));
    }
    public Object invoke(){
       return this.invoke();
    }
}
