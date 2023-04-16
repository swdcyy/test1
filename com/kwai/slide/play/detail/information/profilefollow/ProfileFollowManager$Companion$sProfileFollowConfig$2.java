package com.kwai.slide.play.detail.information.profilefollow.ProfileFollowManager$Companion$sProfileFollowConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import mr7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class ProfileFollowManager$Companion$sProfileFollowConfig$2 extends Lambda implements a	// class@0017fc
{
    public static final ProfileFollowManager$Companion$sProfileFollowConfig$2 INSTANCE;

    static {
       ProfileFollowManager$Companion$sProfileFollowConfig$2.INSTANCE = new ProfileFollowManager$Companion$sProfileFollowConfig$2();
    }
    public void ProfileFollowManager$Companion$sProfileFollowConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, ProfileFollowManager$Companion$sProfileFollowConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("profileInternalFollowControl", a.class, new a());
    }
}
