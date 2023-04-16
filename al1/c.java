package al1.c;
import im8.g;
import k51.c;
import lnc.a1;
import java.util.HashSet;
import al1.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import al1.a;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper$a;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper;
import android.view.View;
import al1.c$b;
import com.kuaishou.live.common.core.component.gift.data.giftbox.honornaming.LiveGiftItemHintItem;
import com.kuaishou.live.common.core.component.gift.data.giftbox.honornaming.LiveGiftItemHintExtInfo;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import al1.h;
import com.kwai.robust.PatchProxyResult;
import ol1.a;
import p91.m;
import java.lang.Number;
import lp3.e;
import by1.a;
import lp3.c;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.common.core.component.gift.data.giftbox.honornaming.LiveGiftItemHintDisplayInfo;
import com.kuaishou.live.common.core.component.gift.data.giftbox.honornaming.LiveGiftItemHintGiftNaming;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.basic.widget.LiveCustomViewFlipper;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.ViewFlipper;
import al1.g;
import java.util.Map;
import java.util.HashMap;
import ug1.u;

public class c extends c implements g	// class@0000ca
{
    public m p;
    public u q;
    public a r;
    public LiveCustomViewFlipper s;
    public HashSet t;
    public p u;
    public static String sLivePresenterClassName = "LiveGiftBoxHonorNamingPresenter";
    public static final int v;

    static {
       c.v = a1.e(44.00f);
    }
    public void c(){
       super();
       this.t = new HashSet();
       this.u = new c$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.s.a(new a(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       this.t.clear();
       return;
    }
    public void P8(View p0){
       c$b c;
       ClientContent$LiveStreamPackage liveStreamPa;
       ClientContent$GiftPackage giftPackage;
       ClientContent$UserPackage userPackage;
       LiveGiftItemHintItem mDescription;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "7")) {
          return;
       }
       c$b uob = (p0 == null)? null: p0.getTag();
       if (uob instanceof c$b && !this.t.contains(uob.a)) {
          this.t.add(uob.a);
          c = uob.c;
          LiveGiftItemHintItem mExtInfo = c.mExtInfo;
          if (mExtInfo != null && mExtInfo.activityTitleGift != null) {
             uob = uob.b;
             if (PatchProxy.applyVoidTwoRefs(uob, c, this, uoc, "13") || (uob != null && uob.getGift() != null)) {
                liveStreamPa = this.S8();
                giftPackage = this.R8(uob.getGift());
                userPackage = this.V8(c);
                mDescription = c.mDescription;
                if (!PatchProxy.applyVoidFourRefs(liveStreamPa, giftPackage, userPackage, mDescription, null, h.class, "1")) {
                   h.b("GIFT_PANEL_BANNER", mDescription, liveStreamPa, giftPackage, userPackage, "2859510");
                }
             }
          }else {
             uob = uob.b;
             if (PatchProxy.applyVoidTwoRefs(uob, c, this, uoc, "10") || (uob != null && uob.getGift() != null)) {
                liveStreamPa = this.S8();
                giftPackage = this.R8(uob.getGift());
                userPackage = this.V8(c);
                mDescription = c.mDescription;
                if (!PatchProxy.applyVoidFourRefs(liveStreamPa, giftPackage, userPackage, mDescription, null, h.class, "3")) {
                   h.b("GIFT_HINT_CARD", mDescription, liveStreamPa, giftPackage, userPackage, "2457706");
                }
             }
          }
       }
       return;
    }
    public final ClientContent$GiftPackage R8(Gift p0){
       ClientContent$GiftPackage obj = PatchProxy.applyOneRefs(p0, this, c.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$GiftPackage();
       obj.identity = String.valueOf(p0.mId);
       obj.position = this.r.d(p0);
       Gift mMagicFaceId = p0.mMagicFaceId;
       if (mMagicFaceId > 0) {
          obj.type = 3;
          obj.magicFaceId = mMagicFaceId;
       }else {
          obj.type = 1;
       }
       return obj;
    }
    public final ClientContent$LiveStreamPackage S8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       ClientContent$LiveStreamPackage obj = PatchProxy.apply(null, this, uoc, "14");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.p.a();
       Object obj1 = PatchProxy.apply(null, this, uoc, "15");
       long l = (obj1 != patchProxyRe)? obj1.longValue(): this.p.t5().a(a.class).ea();
       obj.audienceNumber = l;
       return obj;
    }
    public final ClientContent$UserPackage V8(LiveGiftItemHintItem p0){
       ClientContent$UserPackage obj = PatchProxy.applyOneRefs(p0, this, c.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$UserPackage();
       obj.identity = TextUtils.k(this.W8(p0));
       return obj;
    }
    public String W8(LiveGiftItemHintItem p0){
       if (p0 != null) {
          p0 = p0.mDisplayInfo;
          if (p0 != null) {
             LiveGiftItemHintDisplayInfo mGiftNaming = p0.mGiftNaming;
             if (mGiftNaming != null) {
                LiveGiftItemHintGiftNaming mUserInfo = mGiftNaming.mUserInfo;
                if (mUserInfo != null) {
                   return mUserInfo.mId;
                }
             }
          }
       }
       return null;
    }
    public void doBindView(View p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uoc, "5")) {
          this.s = new LiveCustomViewFlipper(this.getContext());
          this.s.setLayoutParams(new FrameLayout$LayoutParams(-2, c.v));
          this.s.setFlipInterval(6000);
          this.s.setInAnimation(this.getContext(), R.anim.arg_RES_7f0100ac);
          this.s.setOutAnimation(this.getContext(), R.anim.arg_RES_7f0100ad);
          this.s.requestLayout();
          this.s.setVisibility(8);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c.class, new g());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.q8(m.class);
       this.r = this.r8("LIVE_GIFT_PANE_RIGHT_TOP_BANNER_SERVICE");
       this.q = this.q8(u.class);
       return;
    }
}
