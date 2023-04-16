package com.yxcorp.gifshow.profile.helper.guide.PendantAvatarProcessor$a;
import com.yxcorp.gifshow.widget.m;
import java.lang.String;
import com.kwai.library.widget.gravityeffect.KwaiGravityEffectButton;
import com.yxcorp.gifshow.profile.helper.guide.PendantAvatarProcessor;
import com.kwai.feature.api.social.profile.model.PendantAvatarContent;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import m3c.a;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import z5c.y1;
import k2b.h;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import z5c.b0;
import k2b.e0;
import wkd.b;
import nf6.i;
import kotlin.jvm.internal.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.net.Uri;
import ekd.x0;
import android.content.Context;
import android.content.Intent;
import android.app.Activity;

public final class PendantAvatarProcessor$a extends m	// class@00133d
{
    public final String c;
    public final KwaiGravityEffectButton d;
    public final PendantAvatarProcessor e;
    public final PendantAvatarContent f;

    public void PendantAvatarProcessor$a(String p0,KwaiGravityEffectButton p1,PendantAvatarProcessor p2,PendantAvatarContent p3){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, PendantAvatarProcessor$a.class, "1")) {
          return;
       }
       PendantAvatarProcessor$a te = this.e;
       a b = te.b;
       ProfileParam mUser = te.d.mUser;
       if (!PatchProxy.applyVoidTwoRefs(b, mUser, null, y1.class, "90")) {
          h oh = h.k("AUTHOR_PENDANT_VIDEO_REC");
          oh.c(b0.f(mUser.getId()));
          oh.i(b);
       }
       b = this.e.b;
       a.o(b, "mBaseFragment");
       Intent intent = b.a(0x66dce92a).a(b.getActivity(), x0.f(this.c));
       if (intent != null) {
          b = this.e.b;
          a.o(b, "mBaseFragment");
          FragmentActivity activity = b.getActivity();
          if (activity != null) {
             activity.startActivity(intent);
          }
       }
       PatchProxy.onMethodExit(PendantAvatarProcessor$a.class, "1");
       return;
    }
}
