package com.yxcorp.gifshow.profile.presenter.profile.page.dialog.c;
import java.lang.Runnable;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.e;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo;
import w2c.a;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.profile.dialog.ProfileBottomDialogFragment;
import c5c.b;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import c5c.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.dialog.ProfileBottomSwitchDialogFragment;
import qa9.q;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.bottom.sheet.BottomSheetParams;
import qa9.s;
import brd.t;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.b;
import erd.r;
import c5c.i;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.profile.dialog.ProfileBottomDialogSwitchTwoButtonFragment;
import c5c.d;
import x3c.b;
import java.util.List;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import com.yxcorp.gifshow.profile.model.response.UserProfileResponseMeta;
import x3c.c;
import java.util.Collection;
import ekd.q;
import lnc.b9;
import com.yxcorp.gifshow.profile.common.event.RxPageBus$ThreadMode;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.a;
import erd.o;
import c5c.j;
import kzc.d;
import u07.t$a;
import lnc.a1;
import java.lang.CharSequence;
import dj2.b;
import u07.u;
import c5c.g;
import c5c.h;
import u07.a;
import x07.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import c5c.l;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.profile.dialog.AnnualAlbumProfileDialogFragment;
import c5c.e;
import com.yxcorp.gifshow.profile.dialog.ProfileDialogFragment;
import c5c.f;
import l3c.e;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import v2c.e;
import v2c.g;
import z5c.y1;
import z5c.x1;
import io.reactivex.internal.functions.Functions;
import l3c.c;
import java.util.Iterator;
import dx5.e;

public final class c implements Runnable	// class@001579
{
    public final e b;
    public final ProfileDialogInfo c;
    public final a d;

    public void c(e p0,ProfileDialogInfo p1,a p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       e q;
       ProfileBottomDialogFragment profileBotto;
       d obj;
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       if (tb.P8()) {
          e uoe = e.class;
          String str = "7";
          if (!PatchProxy.applyVoidTwoRefs(tc, td, tb, uoe, str)) {
             ProfileDialogInfo mDialogPosit = tc.mDialogPosition;
             int i = 2;
             if (mDialogPosit == i) {
                ProfileDialogInfo mDialogStyle = tc.mDialogStyle;
                if (mDialogStyle == i) {
                   profileBotto = ProfileBottomDialogFragment.th(tc, tb.q, mDialogStyle);
                   profileBotto.k0(new b(td));
                   profileBotto.Cb(tb.p.getFragmentManager(), "ProfileDialogBottomTemplate");
                }
             }
             if (mDialogPosit == i) {
                mDialogPosit = tc.mDialogStyle;
                if (mDialogPosit == 3) {
                   profileBotto = ProfileBottomDialogFragment.th(tc, tb.q, mDialogPosit);
                   profileBotto.k0(new c(td));
                   profileBotto.Cb(tb.p.getFragmentManager(), "ProfileDialogBottomTemplateLabel");
                }
             }
             mDialogPosit = tc.mDialogStyle;
             if (mDialogPosit == 4) {
                Activity activity = tb.getActivity();
                e q1 = tb.q;
                q oq = PatchProxy.applyThreeRefs(activity, tc, q1, null, ProfileBottomSwitchDialogFragment.class, "1");
                if (oq != PatchProxyResult.class) {
                }else {
                   Bundle uBundle = new Bundle();
                   SerializableHook.putSerializable(uBundle, "USER_PROFILE_DIALOG_INFO", tc);
                   SerializableHook.putSerializable(uBundle, "USER_PROFILE_DIALOG_USER", q1);
                   oq = s.c(activity.getSupportFragmentManager(), ProfileBottomSwitchDialogFragment.class, "ProfileBottomSwitchDialogFragment", uBundle, BottomSheetParams.ofStateless().setCancelable(false, false).setNeedPageLogger(false));
                }
                tb.X7(oq.e().filter(b.b).subscribe(new i(td)));
             }else {
                String str1 = "1";
                UserProfileResponseMeta userProfileR = null;
                if (mDialogPosit == 5) {
                   uoe = tb.q;
                   ProfileBottomDialogSwitchTwoButtonFragment profileBotto1 = PatchProxy.applyTwoRefs(tc, uoe, userProfileR, ProfileBottomDialogSwitchTwoButtonFragment.class, str1);
                   if (profileBotto1 != PatchProxyResult.class) {
                   }else {
                      profileBotto1 = new ProfileBottomDialogSwitchTwoButtonFragment();
                      profileBotto1.w = tc;
                      profileBotto1.x = uoe;
                   }
                   profileBotto1.k0(new d(td));
                   profileBotto1.Cb(tb.p.getFragmentManager(), "ProfileDialogBottomTemplateSwitchTwoButton");
                }else if(mDialogPosit == 6){
                   uoe = tb.t;
                   obj = PatchProxy.applyOneRefs(uoe, userProfileR, b.class, str);
                   if (obj != PatchProxyResult.class) {
                   }else if(uoe != null){
                      UserProfileResponseMeta userProfileR1 = c.d(uoe);
                      if (userProfileR1 != null) {
                         userProfileR = userProfileR1.mProfileEmptyUserGuideInfoList;
                      }
                   }
                   obj = userProfileR;
                   if (!q.f(obj)) {
                      tb.u = tc;
                      b9.a(tb.v);
                      tb.v = tb.r.g("PROFILE_CAN_SHOW_EDIT_DIALOG", RxPageBus$ThreadMode.MAIN, 1).map(a.b).subscribe(new j(tb));
                   }else {
                      b9.a(tb.v);
                      tb.R8(tc);
                   }
                }else if(mDialogPosit == 7){
                   if (!PatchProxy.applyVoidOneRefs(tc, tb, uoe, "9")) {
                      Activity activity1 = tb.getActivity();
                      if (activity1 != null) {
                         obj = new d(activity1);
                         obj.Z0(170);
                         obj.B0(R.drawable.arg_RES_7f082115);
                         obj.X0(a1.p(R.string.arg_RES_7f100247));
                         obj.z0(tc.mSubTitle);
                         obj.T0(a1.p(R.string.arg_RES_7f101286));
                         obj.R0(a1.p(R.string.arg_RES_7f103e49));
                         obj.s0(b.b);
                         obj.u0(new g(tb));
                         obj.t0(new h(tb, activity1));
                         t$a uoa = a.c(obj);
                         uoa.V0(1);
                         uoa.L(new b(R.layout.arg_RES_7f0d0eef));
                         uoa.Y(new l(tb));
                      }
                   }
                }else if(tc.mSubBizId == 1){
                   uoe = tb.q;
                   AnnualAlbumProfileDialogFragment uAnnualAlbum = PatchProxy.applyTwoRefs(tc, uoe, userProfileR, AnnualAlbumProfileDialogFragment.class, str1);
                   if (uAnnualAlbum != PatchProxyResult.class) {
                   }else {
                      uAnnualAlbum = new AnnualAlbumProfileDialogFragment();
                      uAnnualAlbum.u = tc;
                      uAnnualAlbum.v = uoe;
                   }
                   uAnnualAlbum.k0(new e(td));
                   if (uAnnualAlbum.th(tc)) {
                      uAnnualAlbum.Cb(tb.p.getFragmentManager(), "AnnualAlbumProfileTemplate");
                   }
                }else {
                   ProfileDialogFragment profileDialo = ProfileDialogFragment.uh(tc, tb.q);
                   profileDialo.k0(new f(td));
                   profileDialo.Cb(tb.p.getFragmentManager(), "ProfileDialogTemplate");
                }
             }
          }
       label_020a :
          q = tb.q;
          _monitor_enter(e.class);
          if (PatchProxy.applyVoidThreeRefs(tb.getActivity(), tc, q, null, e.class, "3")) {
             _monitor_exit(e.class);
          }else {
             g.e(KsLogProfileTag.COMMON_DIALOG.appendTag("ProfileDialogHelper"), "showDialog");
             y1.r(q, tc);
             x1.a(q.getId(), 1, tc.mSubBizId, 1, tc.mExtParamsStatics).subscribe(Functions.d(), new c(q, tc));
             Iterator iterator = e.a.iterator();
             while (iterator.hasNext()) {
                uoe = iterator.next();
             }
             _monitor_exit(e.class);
          }
       }
       return;
    }
}
