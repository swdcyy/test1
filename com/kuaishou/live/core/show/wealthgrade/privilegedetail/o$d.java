package com.kuaishou.live.core.show.wealthgrade.privilegedetail.o$d;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.o;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradePrivilegeResponse$LiveWealthGradePrivilegeInfo;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeInfo;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradePrivilegeTipsInfo;
import u07.t$a;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradePrivilegeTips;
import java.lang.CharSequence;
import u07.f;
import w07.l;
import android.view.ViewGroup;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public class o$d extends m	// class@00127c
{
    public final o c;

    public void o$d(o p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$d.class, "1")) {
          return;
       }
       o$d tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, o.class, "13") && tc.getActivity() != null) {
          o a = tc.A;
          if (a != null) {
             LiveWealthGradePrivilegeResponse$LiveWealthGradePrivilegeInfo mLiveWealthG = a.mLiveWealthGradeInfo;
             if (mLiveWealthG != null) {
                LiveWealthGradePrivilegeResponse$LiveWealthGradePrivilegeInfo mMessageInfo = a.mMessageInfo;
                if (mMessageInfo != null) {
                   LiveWealthGradePrivilegeTipsInfo mLightOffMes = (mLiveWealthG.mIsGradeLightOff != null)? mMessageInfo.mLightOffMessageInfo: mMessageInfo.mSendGiftMessageInfo;
                   if (mLightOffMes != null) {
                      t$a uoa = new t$a(tc.getActivity());
                      uoa.X0(mLightOffMes.mTitle);
                      uoa.S0(R.string.arg_RES_7f1012a9);
                      uoa.z0(mLightOffMes.mContent);
                      t$a uoa1 = f.e(uoa);
                      uoa1.a0(tc.D);
                      uoa1.C(tc.p);
                      uoa1.Y(PopupInterface.a);
                   }
                }
             }
          }
       }
       return;
    }
}
