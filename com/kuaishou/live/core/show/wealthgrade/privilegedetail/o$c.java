package com.kuaishou.live.core.show.wealthgrade.privilegedetail.o$c;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.o;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradePrivilegeResponse$LiveWealthGradePrivilegeInfo;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradePrivilegeTipsInfo;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradePrivilegeTips;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import u07.t$a;
import u07.f;
import w07.l;
import android.view.ViewGroup;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import hm2.k;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import k2b.u1;

public class o$c extends m	// class@00127b
{
    public final o c;

    public void o$c(o p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       o a;
       LiveWealthGradePrivilegeResponse$LiveWealthGradePrivilegeInfo mLiveWealthG;
       LiveWealthGradeInfo mCurrentGrad;
       LiveWealthGradePrivilegeTipsInfo mSettingMess;
       if (PatchProxy.applyVoidOneRefs(p0, this, o$c.class, "1")) {
          return;
       }
       o$c tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, o.class, "11")) {
          a = tc.A;
          if (a != null) {
             mLiveWealthG = a.mMessageInfo;
             if (mLiveWealthG != null) {
                mSettingMess = mLiveWealthG.mSettingMessageInfo;
             label_0028 :
                if (tc.getActivity() == null || (mSettingMess == null || (!TextUtils.x(mSettingMess.mTitle) && !TextUtils.x(mSettingMess.mContent)))) {
                   t$a uoa = new t$a(tc.getActivity());
                   uoa.X0(mSettingMess.mTitle);
                   uoa.S0(R.string.arg_RES_7f1012a9);
                   uoa.z0(mSettingMess.mContent);
                   t$a uoa1 = f.e(uoa);
                   uoa1.a0(tc.D);
                   uoa1.C(tc.p);
                   uoa1.Y(PopupInterface.a);
                }
             }
          }
          mSettingMess = objArray;
          goto label_0028 ;
       }
    label_006d :
       tc = this.c;
       a = tc.A;
       if (a != null) {
          mLiveWealthG = a.mLiveWealthGradeInfo;
          if (mLiveWealthG != null) {
             mCurrentGrad = mLiveWealthG.mCurrentGrade;
          label_007b :
             ClientContent$LiveStreamPackage liveStreamPa = tc.P8();
             k ok = k.class;
             if (!PatchProxy.isSupport(ok) || (!PatchProxy.applyVoidTwoRefs(liveStreamPa, Integer.valueOf(mCurrentGrad), objArray, ok, "12") && liveStreamPa != null)) {
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = liveStreamPa;
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "PRIVILEGE_SETTING_BUTTON";
                i3 oi3 = i3.f();
                oi3.c("user_level", Integer.valueOf(mCurrentGrad));
                uElementPack.params = oi3.toString();
                u1.u(1, uElementPack, uContentPack);
             }
             return;
          }
       }
       mCurrentGrad = 0;
       goto label_007b ;
    }
}
