package com.kwai.slide.play.detail.information.profilefollow.ProfileFollowManager$Companion$enable$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.slide.play.detail.information.profilefollow.ProfileFollowManager;
import mr7.a;
import com.kwai.slide.play.detail.information.profilefollow.ProfileFollowManager$a;

public final class ProfileFollowManager$Companion$enable$2 extends Lambda implements a	// class@0017fb
{
    public static final ProfileFollowManager$Companion$enable$2 INSTANCE;

    static {
       ProfileFollowManager$Companion$enable$2.INSTANCE = new ProfileFollowManager$Companion$enable$2();
    }
    public void ProfileFollowManager$Companion$enable$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, ProfileFollowManager$Companion$enable$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ProfileFollowManager.h.b().mShowFocus;
    }
}