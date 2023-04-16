package com.kuaishou.live.core.show.guestactivity.c;
import com.kuaishou.live.core.show.guestactivity.b$b;
import com.kuaishou.live.core.show.guestactivity.LiveAudienceGuestActivityTopListPresenterV2;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import n92.c;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import kq3.a;
import c22.a;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import com.kuaishou.live.webview.a;
import n92.k;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;

public final class c implements b$b	// class@000bd2
{
    public final LiveAudienceGuestActivityTopListPresenterV2 a;

    public void c(LiveAudienceGuestActivityTopListPresenterV2 p0){
       this.a = p0;
    }
    public final void a(String p0){
       c ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, LiveAudienceGuestActivityTopListPresenterV2.class, "14")) {
       }else {
          ClientContent$LiveStreamPackage liveStreamPa = ta.W0.Z2.a();
          Object obj = null;
          if (!PatchProxy.applyVoidOneRefs(liveStreamPa, obj, c.class, "6")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LIVE_PROGRAM_BUTTON";
             u1.u(1, uElementPack, c.a(liveStreamPa, obj));
          }
          if (TextUtils.x(p0)) {
             b.Z(LiveLogTag.LIVE_GUEST_ACTIVITY, "click url is null");
          }else {
             a uoa = a.b(ta.getActivity(), ta.W0.Z2.b().getChildFragmentManager(), ta.W0);
             uoa.f("live-guest-activity-fragment");
             uoa.b.setPortraitHeightRatio(0x3f4ccccd).setLayoutType("0").setInOutAnimation(0).setDimAmount(0);
             a uoa1 = a.c();
             uoa1.f(new k(ta));
             ta.Q = uoa1.h(p0, uoa);
          }
       }
       return;
    }
}
