package com.kwai.nearby.config.utils.LocalConfigUtil$enableNearbySlideAvatarEnterLiveSquareSwitch$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.SystemUtil;
import xf6.i;
import com.kwai.sdk.switchconfig.a;

public final class LocalConfigUtil$enableNearbySlideAvatarEnterLiveSquareSwitch$2 extends Lambda implements a	// class@000f74
{
    public static final LocalConfigUtil$enableNearbySlideAvatarEnterLiveSquareSwitch$2 INSTANCE;

    static {
       LocalConfigUtil$enableNearbySlideAvatarEnterLiveSquareSwitch$2.INSTANCE = new LocalConfigUtil$enableNearbySlideAvatarEnterLiveSquareSwitch$2();
    }
    public void LocalConfigUtil$enableNearbySlideAvatarEnterLiveSquareSwitch$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LocalConfigUtil$enableNearbySlideAvatarEnterLiveSquareSwitch$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (SystemUtil.K()) {
          int i = i.g("ENABLE_NEARBY_SLIDE_AVATAR_ENTER_LIVE_SQUARE_SWITCH");
          if (i != b) {
             b = (i != 2)? a.t().d("enableNearbySlideAvatarEnterLiveSquareSwitch", false): false;
          }
       }else {
          b = a.t().d("enableNearbySlideAvatarEnterLiveSquareSwitch", false);
       }
       return b;
    }
}
