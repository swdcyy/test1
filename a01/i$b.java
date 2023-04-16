package a01.i$b;
import fl1.a;
import a01.i;
import z1.k;
import vg1.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lz0.c;
import java.lang.Boolean;
import android.view.View;
import tk1.b;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.PrivilegeGift;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import t02.a0;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeInfo;
import hm2.a$b;
import zy1.a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.app.Activity;
import com.kuaishou.live.external.invoke.deserializer.gift.GiftPanelItemPromptInfo;
import com.kuaishou.live.external.invoke.deserializer.gift.LiveGiftItemHintActionInfo;
import a01.g;
import a01.h;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.yxcorp.gifshow.models.Gift;
import vi1.a;
import u07.t$a;
import java.lang.CharSequence;
import u07.f;
import a01.d;
import java.lang.Runnable;
import u07.u;
import a01.c;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public class i$b extends a	// class@000010
{
    public final i c;

    public void i$b(i p0,k p1,c p2){
       this.c = p0;
       super(p1, p2);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, i$b.class, "5")) {
          return;
       }
       this.c.f1("live_privilege_gift");
       return;
    }
    public void h(boolean p0){
       i$b uob = i$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (!p0 && this.c.F != null) {
          return;
       }
       this.c.c9();
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, i$b.class, "2")) {
          return;
       }
       this.c.k9(this.g());
       return;
    }
    public void j(boolean p0,int p1){
       i$b uob = i$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uob, "6")) {
          return;
       }
       uob = this.c;
       if (uob.F != null) {
          uob.y9(p0, p1);
       }
       return;
    }
    public boolean k(PrivilegeGift p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "3";
       i$b obj = PatchProxy.applyOneRefs(p0, this, i$b.class, str);
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.c;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, i.class, str);
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          LiveWealthGradeInfo liveWealthGr = obj.w.i2.yb();
          b = (a.b() && (liveWealthGr != null && p0.canSendPrivilegeGift(liveWealthGr.mCurrentGrade)))? true: false;
       }
       return b;
    }
    public void l(PrivilegeGift p0){
       Runnable runnable;
       String str = "4";
       if (PatchProxy.applyVoidOneRefs(p0, this, i$b.class, str)) {
          return;
       }
       i$b tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(p0, tc, i.class, str)) {
          if (tc.getContext() != null && tc.getActivity() != null) {
             PrivilegeGift mGiftPanelIt = p0.mGiftPanelItemPromptInfo;
             if (mGiftPanelIt != null) {
                GiftPanelItemPromptInfo mGiftItemHin = mGiftPanelIt.mGiftItemHintActionInfo;
                if (mGiftItemHin != null) {
                   LiveGiftItemHintActionInfo mActionType = mGiftItemHin.mActionType;
                   LiveGiftItemHintActionInfo mLink = mGiftItemHin.mLink;
                   if (mActionType != 4) {
                      runnable = (mActionType != 5)? null: new g(tc, mLink);
                   }else {
                      runnable = new h(tc, mLink);
                   }
                   if (runnable != null) {
                      b.d0(LiveLogTag.GIFT, "showPrivilegeGiftActivityPromptDialog show", "type", Integer.valueOf(mActionType), "link", mLink);
                      a.b(tc.w.Z2.a(), String.valueOf(p0.mId));
                      t$a uoa = new t$a(tc.getActivity());
                      uoa.z0(p0.mGiftPanelItemPromptInfo.mDescription);
                      uoa.T0(p0.mGiftPanelItemPromptInfo.mOkText);
                      uoa = f.e(uoa);
                      uoa.R0(p0.mGiftPanelItemPromptInfo.mCancelText);
                      uoa.u0(new d(tc, runnable, p0));
                      uoa.t0(new c(tc, p0));
                      uoa.X();
                   }
                }
             }
          }
          b.B(LiveLogTag.GIFT, "showPrivilegeGiftActivityPromptDialog can not get action");
       }
       return;
    }
}
