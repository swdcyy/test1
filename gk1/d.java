package gk1.d;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import yj1.c;
import com.kuaishou.live.common.core.component.gift.domain.slot.view.LiveGiftSlotItemView;
import vj1.a;
import com.kuaishou.live.common.core.component.gift.giftNaming.springNaming.LiveGiftSpringNamingModel;
import gk1.d$a;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiftSlotAnimManager;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gk1.d$b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import crd.a;
import com.kuaishou.live.common.core.component.gift.domain.slot.view.a;
import com.kuaishou.live.common.core.component.gift.domain.slot.view.LiveGiftSlotItemView$b;
import android.view.View;
import android.view.View$OnClickListener;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService$a;
import jb3.a;
import com.kuaishou.live.common.core.component.gift.domain.slot.view.LiveGiftSlotBaseView;
import com.kuaishou.live.common.core.component.gift.domain.slot.view.b;
import yj1.b;
import com.kuaishou.live.common.core.component.gift.domain.slot.data.GiftSlotMessage;
import xj1.a;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import yb6.d;
import android.widget.RelativeLayout;
import wj1.d;
import com.kuaishou.live.basic.model.QLiveMessage;
import fk1.a;
import java.lang.Boolean;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.protobuf.livestream.nano.LivePrivilegeState;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import android.widget.ImageView;
import hk1.a;
import msd.l;
import com.kuaishou.live.common.core.basic.tools.l;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Runnable;
import java.lang.Integer;
import com.kwai.framework.model.user.UserInfo;
import b61.b;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import android.content.res.Resources;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.models.Gift;
import android.graphics.Bitmap;
import cm1.a;
import java.util.List;
import lnc.a1;
import com.kuaishou.live.core.basic.widget.LiveGradientBackgroundView;
import com.kuaishou.live.core.basic.widget.LiveGradientBorderView;
import java.lang.IllegalArgumentException;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import com.kuaishou.livestream.message.nano.SCLiveGiftTitleChangeInfo;
import com.kuaishou.live.common.core.component.gift.domain.slot.springnaming.LiveGiftSlotSpringNamingView;
import com.kuaishou.livestream.message.nano.LiveGiftTitleInfo;
import com.kuaishou.live.common.core.component.gift.domain.slot.springnaming.LiveGiftSlotSpringNamingView$SpringNamingStyle;
import a2.c0;
import ak1.c;
import java.lang.Number;
import java.lang.System;
import yj1.a;
import kotlin.jvm.internal.a;
import xg1.a;
import gk1.c;
import gk1.a;

public class d extends ViewController	// class@00250f
{
    public final int j;
    public final LiveGiftSlotAnimManager k;
    public final c l;
    public final a m;
    public final LiveLiteGestureService n;
    public LiveGiftSlotItemView o;
    public GiftSlotMessage p;
    public a q;
    public int r;
    public long s;
    public boolean t;
    public LiveGiftSpringNamingModel u;
    public final b v;
    public b w;

    public void d(LiveLiteGestureService p0,c p1,LiveGiftSlotItemView p2,a p3,int p4,boolean p5,LiveGiftSpringNamingModel p6){
       super();
       this.r = 0;
       this.s = 0;
       this.v = new d$a(this);
       this.w = null;
       this.m = p3;
       this.j = p4;
       this.o = p2;
       this.l = p1;
       this.n = p0;
       this.t = p5;
       p2.setConfig(p3);
       this.k = new LiveGiftSlotAnimManager(this, p4, p3);
       this.u = p6;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       d to = this.o;
       d tn = this.n;
       d$b uob = new d$b(this);
       Objects.requireNonNull(to);
       a uoa = PatchProxy.applyTwoRefs(tn, uob, to, LiveGiftSlotItemView.class, "3");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
          LiveGiftSlotItemView q = to.q;
          uoa.c(tn.a(q, true, a.a(q, new a(to, uob))));
          LiveGiftSlotBaseView h = to.h;
          uoa.c(tn.a(h, true, a.a(h, new b(to, uob))));
       }
       this.w = uoa;
       this.b3(this.v);
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       d tw = this.w;
       if (tw != null) {
          tw.dispose();
       }
       this.e3(this.v);
       return;
    }
    public void V2(GiftSlotMessage p0,a p1){
       int b;
       GiftSlotMessage mGift;
       int width;
       Bitmap uBitmap;
       String str5;
       int[] ointArray1;
       float[] uofloatArray1;
       LiveGiftSlotBaseView k1;
       LiveGiftSlotItemView s;
       a n;
       a o4;
       GiftSlotMessage mGiftSlotSel;
       CDNUrl[] uCDNUrlArray;
       long l = this;
       LiveGiftSlotAnimManager obj = p0;
       LiveGiftSlotItemView obj1 = p1;
       String str = "9";
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, l, d.class, str)) {
          return;
       }
       if (l.t != null) {
          b.Z(LiveGiftTag.GIFT_SLOT, "[LiveGiftSlotItemVC][addGiftSlot] : mDisableGiftSlot == true 槽位不允许被展示");
          return;
       }else {
          l.s = d.a();
          l.p = obj;
          l.q = obj1;
          int i = 1;
          l.d3(i);
          int i1 = 0;
          l.o.setVisibility(i1);
          int[] ointArray = l.m.d().i(obj);
          l.o.e(obj.mComboCount);
          l.o.d(obj.mCount);
          d o = l.o;
          b = a.c(obj, i1);
          Objects.requireNonNull(o);
          if (!PatchProxy.isSupport(LiveGiftSlotItemView.class) || (!PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), obj, o, LiveGiftSlotItemView.class, "12") && o.s.u != null)) {
             if (b) {
                mGift = obj.mGiftSlotSelfAvatarRingImageUrls;
                mGiftSlotSel = obj.mGiftSlotSelfAvatarRingDynamicImageUrls;
             }else {
                QLiveMessage mLiveAudienc = obj.mLiveAudienceState;
                if (mLiveAudienc != null) {
                   LiveAudienceState livePrivileg = mLiveAudienc.livePrivilegeState;
                   if (livePrivileg != null) {
                      LivePrivilegeState avatarFrame = livePrivileg.avatarFrame;
                      if (avatarFrame != null) {
                         uCDNUrlArray = e0.i(avatarFrame);
                         mGiftSlotSel = e0.i(obj.mLiveAudienceState.livePrivilegeState.avatarFrameAnimation);
                      }
                   }
                }
                uCDNUrlArray = null;
                mGiftSlotSel = null;
             }
             o.i.setVisibility(i1);
             l.d(o.i, mGiftSlotSel, i, new a(o, mGift), l.f());
          }
          d o1 = l.o;
          QLiveMessage mUser = obj.mUser;
          mGift = obj.mGift;
          GiftSlotMessage mNewGiftSlot = obj.mNewGiftSlotStyle;
          float[] uofloatArray = l.m.d().a(ointArray.length);
          Objects.requireNonNull(o1);
          String str1 = "2";
          int i2 = 2;
          int i3 = 4;
          if (PatchProxy.isSupport(LiveGiftSlotItemView.class)) {
             Object[] objArray = new Object[]{mUser,mGift,Integer.valueOf(mNewGiftSlot),ointArray,uofloatArray};
             if (!PatchProxy.applyVoid(objArray, o1, LiveGiftSlotItemView.class, str1)) {
             label_00e6 :
                if (mUser != null) {
                   o1.c.setText(b.c(mUser));
                   g.d(o1.g, mUser, HeadImageSize.MIDDLE);
                }else {
                   b.Z(LiveGiftTag.GIFT_SLOT, "[LiveGiftSlotItemView][bindInfo] userInfo is null");
                }
                Object[] objArray1 = new Object[i];
                String str2 = "";
                objArray1[i1] = str2;
                StringBuilder str3 = o1.getResources().getString(0x7f104649, objArray1);
                String str4 = (mGift == null)? str2: mGift.mName;
                o1.d.setText(str3+str4);
                if (mGift != null) {
                   uBitmap = a.b(mGift.mId);
                }else {
                   b.Z(LiveGiftTag.GIFT_SLOT, "[LiveGiftSlotItemView][bindInfo] cachedGift is null");
                   uBitmap = null;
                }
                o1.h.setVisibility(i1);
                if (uBitmap != null) {
                   o1.h.setImageBitmap(uBitmap);
                }else if(mGift != null){
                   Gift mImageUrl = mGift.mImageUrl;
                   if (mImageUrl != null) {
                      o1.h.P(mImageUrl);
                   }
                }
                o1.h.setImageResource(R.drawable.arg_RES_7f080355);
                if (PatchProxy.isSupport(LiveGiftSlotItemView.class)) {
                   str5 = str1;
                   if (!PatchProxy.applyVoidThreeRefs(Integer.valueOf(mNewGiftSlot), ointArray, uofloatArray, o1, LiveGiftSlotItemView.class, "4")) {
                   }
                }else {
                   str5 = str1;
                   int i4 = 2;
                }
             }
          }else {
             goto label_00e6 ;
          }
          l.o.g(obj.mNewGiftSlotStyle, obj.mCount, obj.mComboCount, a.c(obj, i1));
          l.o.h(obj.mNewGiftSlotStyle);
          l.o.setVisibility(i1);
          d o2 = l.o;
          SCLiveGiftTitleChangeInfo sCLiveGiftTi = l.u.a();
          Objects.requireNonNull(o2);
          if (!PatchProxy.applyVoidTwoRefs(sCLiveGiftTi, obj, o2, LiveGiftSlotItemView.class, str)) {
             if (sCLiveGiftTi != null) {
                SCLiveGiftTitleChangeInfo info = sCLiveGiftTi.info;
                if (info != null && info.length) {
                   b = info.length;
                   width = 0;
                   while (true) {
                      if (width < b) {
                         if (info[width].giftId == obj.mGiftId) {
                            break ;
                         }else {
                            width = width + 1;
                         }
                      }
                   }
                   if (i) {
                      o2.r.setStyle(LiveGiftSlotSpringNamingView$SpringNamingStyle.LiteStyle);
                      o2.r.d(sCLiveGiftTi);
                   }else {
                      obj1 = o2.r;
                      Objects.requireNonNull(obj1);
                      if (!PatchProxy.applyVoid(null, obj1, LiveGiftSlotSpringNamingView.class, "7")) {
                         obj1.b.setVisibility(4);
                      }
                   }
                }
             }
             i = 0;
             goto label_024b ;
          }
          d k = l.k;
          d o3 = l.o;
          GiftSlotMessage mDisplayDura = obj.mDisplayDuration;
          Objects.requireNonNull(k);
          obj = LiveGiftSlotAnimManager.class;
          if (!PatchProxy.isSupport(obj) || !PatchProxy.applyVoidTwoRefs(o3, Integer.valueOf(mDisplayDura), k, obj, "4")) {
             width = o3.getWidth();
             if (!width) {
                obj = k.w;
                if (obj != null) {
                   obj.b();
                }
                k.w = c0.a(o3, new c(k, o3, mDisplayDura));
             }else {
                k.d(o3, o3.getComboView(), o3.getGiftIconView(), width, mDisplayDura);
             }
          }
          return;
       }
    }
    public long W2(){
       Object obj = PatchProxy.apply(null, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (System.currentTimeMillis() - this.s);
    }
    public String X2(){
       d tp = this.p;
       if (tp == null) {
          return null;
       }
       return tp.mMergeKey;
    }
    public int Y2(){
       return this.j;
    }
    public int Z2(){
       return this.r;
    }
    public boolean a3(){
       Object obj = PatchProxy.apply(null, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.o.getVisibility())? true: false;
       return b;
    }
    public void b3(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "12")) {
          return;
       }
       d tk = this.k;
       Objects.requireNonNull(tk);
       if (!PatchProxy.applyVoidOneRefs(p0, tk, LiveGiftSlotAnimManager.class, "2")) {
          LiveGiftSlotAnimManager c = tk.c;
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoidOneRefs(p0, c, a.class, "7")) {
             a.p(p0, "listener");
             c.a.b(p0);
          }
       }
       return;
    }
    public void c3(GiftSlotMessage p0,a p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "11")) {
          return;
       }
       if (this.t != null) {
          b.Z(LiveGiftTag.GIFT_SLOT, "[LiveGiftSlotItemVC][replaceGiftSlot] : mDisableGiftSlot == true 槽位不允许被展示");
          return;
       }else {
          this.l.a(this.p, p0, p2, this.j);
          this.p = p0;
          this.q = p1;
          d tk = this.k;
          d to = this.o;
          c uoc = new c(this, p0);
          Objects.requireNonNull(tk);
          if (!PatchProxy.applyVoidFourRefs(p0, p1, to, uoc, tk, LiveGiftSlotAnimManager.class, "5")) {
             tk.c();
             tk.b(to, p0, p1, uoc, true);
          }
          return;
       }
    }
    public void d3(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "3")) {
          return;
       }
       uod = this.r;
       this.r = p0;
       this.l.i(this.Y2(), uod, this.r);
       return;
    }
    public void e3(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "13")) {
          return;
       }
       if (p0 != null) {
          d tk = this.k;
          Objects.requireNonNull(tk);
          if (!PatchProxy.applyVoidOneRefs(p0, tk, LiveGiftSlotAnimManager.class, "3")) {
             LiveGiftSlotAnimManager c = tk.c;
             Objects.requireNonNull(c);
             if (!PatchProxy.applyVoidOneRefs(p0, c, a.class, "8")) {
                a.p(p0, "listener");
                c.a.c(p0);
             }
          }
       }
       return;
    }
}
