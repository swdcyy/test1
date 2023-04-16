package com.kwai.slide.play.detail.information.profilefollow.ProfileFollowManager;
import com.kwai.slide.play.detail.information.profilefollow.ProfileFollowManager$a;
import nsd.u;
import com.kwai.slide.play.detail.information.profilefollow.ProfileFollowManager$Companion$enable$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.slide.play.detail.information.profilefollow.ProfileFollowManager$Companion$sProfileFollowConfig$2;
import java.lang.Object;
import eoc.h;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mr7.a;

public final class ProfileFollowManager	// class@0017fe
{
    public final h a;
    public boolean b;
    public boolean c;
    public int d;
    public boolean e;
    public static final p f;
    public static final p g;
    public static final ProfileFollowManager$a h;

    static {
       ProfileFollowManager.h = new ProfileFollowManager$a(null);
       ProfileFollowManager.f = s.c(ProfileFollowManager$Companion$enable$2.INSTANCE);
       ProfileFollowManager.g = s.c(ProfileFollowManager$Companion$sProfileFollowConfig$2.INSTANCE);
    }
    public void ProfileFollowManager(){
       super();
       this.a = new h(Boolean.FALSE);
    }
    public final h a(){
       return this.a;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, ProfileFollowManager.class, "4")) {
          return;
       }
       this.d = this.d + 1;
       this.c();
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, ProfileFollowManager.class, "5")) {
          return;
       }
       ProfileFollowManager ta = this.a;
       boolean b = (this.e != null && (this.d <= ProfileFollowManager.h.b().mExposureQuantity && (this.b == null && this.c == null)))? true: false;
       ta.c(Boolean.valueOf(b));
       return;
    }
}
