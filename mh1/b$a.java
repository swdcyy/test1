package mh1.b$a;
import ol1.p;
import mh1.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import ol1.n;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lh1.a;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.live.external.invoke.deserializer.gift.GiftPanelItemViewData;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kuaishou.live.external.invoke.deserializer.gift.GiftPanelItemPromptInfo;
import android.app.Activity;
import java.util.Objects;
import s51.c;
import ug1.p;
import lp3.c;
import lp3.e;
import mk1.h;
import jh1.d;
import jh1.a;
import jh1.c;
import p91.m;
import ug1.u;
import mh1.a;
import java.lang.Runnable;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import kh1.a;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import lnc.a1;
import android.view.View;
import java.lang.Boolean;
import jh1.e;
import java.lang.CharSequence;
import android.text.TextUtils;

public class b$a implements p	// class@003175
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$a.class, "3")) {
          return;
       }
       b$a ta = this.a;
       ta.A = objArray;
       int i = 8;
       if (ta.z.getVisibility() == i) {
          return;
       }
       this.a.z.setVisibility(i);
       this.a.z.setTranslationY(0);
       return;
    }
    public n b(GiftTab p0,GiftPanelItem p1){
       b$a a;
       c uoc1;
       Object obj = this;
       ClientContent$GiftPackage obj1 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj2 = PatchProxy.applyTwoRefs(p0, obj1, obj, b$a.class, "2");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       n on = null;
       if (!obj.c(obj1)) {
          this.a();
          return on;
       }else {
          Context context = obj.a.getContext();
          if (context == null) {
             return on;
          }
          obj2 = PatchProxy.applyOneRefs(obj1, on, a.class, "1");
          if (obj2 != patchProxyRe) {
          }else {
             obj2 = new a();
             if (p1.getGift() != null) {
                obj2.a = p1.getGift().mId;
             }
             GiftPanelItem mGiftPanelIt = obj1.mGiftPanelItemViewData;
             if (mGiftPanelIt != null) {
                obj2.b = mGiftPanelIt.mName;
                obj2.c = new ArrayList();
                if (!q.f(obj1.mGiftPanelItemViewData.mPicUrls)) {
                   obj2.c.addAll(obj1.mGiftPanelItemViewData.mPicUrls);
                }
             }
             mGiftPanelIt = obj1.mGiftPanelItemPromptInfo;
             if (mGiftPanelIt != null) {
                obj2.d = mGiftPanelIt.mTitle;
                obj2.e = mGiftPanelIt.mDescription;
                obj2.f = mGiftPanelIt.mOkText;
                obj2.g = mGiftPanelIt.mCancelText;
                obj2.h = mGiftPanelIt.mGiftItemHintActionInfo;
                obj2.i = mGiftPanelIt.mGiftDetailHintDescription;
                obj2.j = mGiftPanelIt.mGiftDetailHintRuleUrl;
                obj2.k = mGiftPanelIt.mGiftDetailHintBackgroudColors;
                obj2.l = mGiftPanelIt.mBannerClickToast;
             }
          }
          Object obj3 = obj2;
          a = obj.a;
          Activity activity = a.getActivity();
          b$a a1 = obj.a;
          b v = a1.v;
          b w = a1.w;
          Objects.requireNonNull(a1);
          c uoc = c.class;
          Gift obj4 = PatchProxy.apply(on, a1, b.class, "4");
          if (obj4 != patchProxyRe) {
             uoc = obj4;
          }else {
             b y = a1.y;
             if (y != null) {
                uoc1 = y.d.a(uoc);
             }else {
                b x = a1.x;
                uoc1 = (x != null)? x.n.a(uoc): on;
             }
             uoc = uoc1;
          }
          obj4 = p1.getGift();
          d uod = d.class;
          if (PatchProxy.isSupport(uod)) {
             Object[] objArray = new Object[]{context,activity,v,w,uoc,obj3,obj4};
             uoc1 = PatchProxy.apply(objArray, on, uod, "1");
             if (uoc1 != patchProxyRe) {
             label_0109 :
                a.A = uoc1;
                obj.a.z.post(new a(obj));
                ClientContent$LiveStreamPackage liveStreamPa = obj.a.v.a();
                obj1 = a.a(p1.getGift());
                if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, obj1, on, a.class, "1")) {
                   a.p(liveStreamPa, "liveStreamPackage");
                   a.p(obj1, "giftPackage");
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "GIFT_PANEL_BANNER";
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   uContentPack.liveStreamPackage = liveStreamPa;
                   uContentPack.giftPackage = obj1;
                   u1.u0(5, uElementPack, uContentPack);
                }
                n on1 = new n(obj.a.z, a1.e(8.00f), a1.e(8.00f), a1.e(12.00f), 0);
                return obj1;
             }
          }
          uoc1 = new c(context, activity, v, w, uoc, obj3, obj4);
          goto label_0109 ;
       }
    }
    public boolean c(GiftPanelItem p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = e.class;
       Object obj1 = PatchProxy.applyOneRefs(p0, null, obj, "2");
       boolean b = false;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          Object obj2 = PatchProxy.applyOneRefs(p0, null, obj, "1");
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else if(p0 != null && (p0.getGift() != null && (p0.mGiftPanelItemViewData == null || p0.mGiftPanelItemPromptInfo == null))){
             b1 = false;
          }else {
             b1 = true;
          }
          if (b1 && !TextUtils.isEmpty(p0.mGiftPanelItemPromptInfo.mGiftDetailHintDescription)) {
             b = true;
          }
       }
       return b;
    }
}
