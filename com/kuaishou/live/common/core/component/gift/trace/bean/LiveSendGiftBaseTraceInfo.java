package com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import mm1.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.gift.DrawingGift;
import nm1.g;
import km1.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.live.core.show.gift.DrawingGift$Point;
import nm1.g$a;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Number;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.yxcorp.gifshow.models.Gift;
import com.kwai.framework.model.user.QCurrentUser;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import ht5.b;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;

public class LiveSendGiftBaseTraceInfo extends c	// class@001323
{
    public int comboKey;
    public boolean disableMockEffect;
    public boolean disableMockFeed;
    public boolean drawable;
    public int giftBatchCount;
    public int giftBoxPanelType;
    public int giftBoxSourceType;
    public int giftComboCount;
    public String giftDrawing;
    public int giftEntrySubType;
    public int giftEntryType;
    public long giftType;
    public boolean mIsLowDevice;
    public String mSendExtraInfo;
    public String magicFaceId;
    public int originGiftId;
    public String position;
    public int price;
    public int priceType;
    public int receiverType;
    public String receiverUid;
    public String senderUserId;

    public void LiveSendGiftBaseTraceInfo(long p0){
       super(p0);
       this.receiverType = 1;
    }
    public void LiveSendGiftBaseTraceInfo(String p0,long p1){
       super(p0, p1);
       this.receiverType = 1;
    }
    public void A(String p0){
       this.receiverUid = p0;
    }
    public void B(String p0){
       this.mSendExtraInfo = p0;
    }
    public void C(String p0){
       this.senderUserId = p0;
    }
    public String a(){
       return "LiveGift";
    }
    public Object clone(){
       Object obj = PatchProxy.apply(null, this, LiveSendGiftBaseTraceInfo.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.clone();
    }
    public String d(){
       return "SEND_GIFT_TRACE";
    }
    public LiveSendGiftBaseTraceInfo h(DrawingGift p0){
       int i3;
       g og = g.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSendGiftBaseTraceInfo.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          b.P(b.a, "[LiveSendGiftTraceInfo][fill]DrawingGift is null");
          return this;
       }else {
          int i = 1;
          this.giftComboCount = i;
          DrawingGift mPoints = p0.mPoints;
          int i1 = 0;
          int i2 = (mPoints == null)? 0: mPoints.size();
          this.giftBatchCount = i2;
          String str = PatchProxy.applyOneRefs(p0, null, og, "3");
          if (str != PatchProxyResult.class) {
          }else if(p0.mPoints == null){
             str = "";
          }else {
             ArrayList uArrayList = new ArrayList();
             Iterator iterator1 = p0.mPoints.iterator();
             int i4 = 0;
             while (iterator1.hasNext()) {
                DrawingGift$Point point = iterator1.next();
                if (point == null) {
                   continue ;
                }else if(i4 == null || i4.id != point.mGiftId){
                   i4 = new g$a(point);
                   uArrayList.add(i4);
                }else {
                   int i5 = i4.count + i;
                   i4.count = i5;
                }
             }
             str = a.a.q(uArrayList);
          }
          this.giftDrawing = str;
          DrawingGift$Point obj1 = PatchProxy.applyOneRefs(p0, null, og, "2");
          if (obj1 != PatchProxyResult.class) {
             i3 = obj1.intValue();
          }else {
             Iterator iterator = p0.mPoints.iterator();
             while (iterator.hasNext()) {
                obj1 = iterator.next();
                if (obj1 == null) {
                   continue ;
                }
                i1 = i1 + obj1.mPrice;
             }
             i3 = i1;
          }
          this.price = i3;
          return this;
       }
    }
    public LiveSendGiftBaseTraceInfo i(GiftMessage p0){
       UserInfo obj = PatchProxy.applyOneRefs(p0, this, LiveSendGiftBaseTraceInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.w(p0.mGiftId);
       this.v(String.valueOf(p0.mMagicFaceId));
       this.o(p0.mIsDrawingGift);
       this.n(p0.mComboKey);
       this.r(p0.mComboCount);
       this.p(p0.mCount);
       this.u(p0.mType);
       obj = p0.getUser();
       if (obj != null) {
          this.C(obj.mId);
       }else {
          this.C("");
       }
       p0 = p0.mDrawingGift;
       if (p0 != null) {
          this.h(p0);
       }
       return this;
    }
    public LiveSendGiftBaseTraceInfo j(Gift p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSendGiftBaseTraceInfo.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p0 == null) {
          b.P(b.a, "[LiveSendGiftTraceInfo][fill]gift is null");
          return this;
       }else {
          this.w(p0.mId);
          this.v(String.valueOf(p0.mMagicFaceId));
          this.disableMockEffect = p0.mDisableMockEffect;
          this.disableMockFeed = p0.mDisableMockFeed;
          this.o(p0.mDrawable);
          obj = PatchProxy.applyOneRefs(p0, null, g.class, "1");
          if (obj != patchProxyRe) {
             i = obj.intValue();
          }else if(p0.isNebulaCreditGift()){
             i = 3;
          }else if(p0.isKShellGift()){
             i = 2;
          }else {
             i = 1;
          }
          this.priceType = i;
          if (i == 1) {
             this.y(p0.mPrice);
          }else {
             this.y(p0.mVirtualPrice);
          }
          this.u(p0.mGiftType);
          this.C(QCurrentUser.me().getId());
          this.mIsLowDevice = b.a(-404437045).g();
          return this;
       }
    }
    public LiveSendGiftBaseTraceInfo k(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSendGiftBaseTraceInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          b.P(b.a, "[LiveSendGiftTraceInfo][fill]httpSendGiftParams is null");
          return this;
       }else {
          this.j(p0.a);
          this.p(p0.b);
          this.n(p0.d);
          this.r(p0.c);
          this.q(p0.h);
          if (this.giftEntryType == null) {
             this.t(p0.e);
          }
          p0 = p0.o;
          if (p0 == null) {
             this.A("");
          }else {
             this.A(p0.mId);
          }
          return this;
       }
    }
    public boolean l(){
       return this.drawable;
    }
    public boolean m(){
       Object obj = PatchProxy.apply(null, this, LiveSendGiftBaseTraceInfo.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.l() && !TextUtils.x(this.giftDrawing))? true: false;
       return b;
    }
    public void n(int p0){
       this.comboKey = p0;
    }
    public void o(boolean p0){
       this.drawable = p0;
    }
    public void p(int p0){
       if (PatchProxy.isSupport(LiveSendGiftBaseTraceInfo.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveSendGiftBaseTraceInfo.class, "2")) {
          return;
       }
       if (!this.m()) {
          this.giftBatchCount = p0;
       }
       return;
    }
    public void q(int p0){
       this.giftBoxSourceType = p0;
    }
    public void r(int p0){
       if (PatchProxy.isSupport(LiveSendGiftBaseTraceInfo.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveSendGiftBaseTraceInfo.class, "1")) {
          return;
       }
       if (!this.m()) {
          this.giftComboCount = p0;
       }
       return;
    }
    public void s(int p0){
       this.giftEntrySubType = p0;
    }
    public void t(int p0){
       this.giftEntryType = p0;
    }
    public void u(long p0){
       this.giftType = p0;
    }
    public void v(String p0){
       this.magicFaceId = p0;
    }
    public void w(int p0){
       this.originGiftId = p0;
    }
    public void x(String p0){
       this.position = p0;
    }
    public void y(int p0){
       if (PatchProxy.isSupport(LiveSendGiftBaseTraceInfo.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveSendGiftBaseTraceInfo.class, "3")) {
          return;
       }
       if (!this.m()) {
          this.price = p0;
       }
       return;
    }
    public void z(int p0){
       this.receiverType = p0;
    }
}
