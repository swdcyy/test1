package com.kuaishou.live.audience.component.broadcastbanner.overroomv2.a;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.a$c;
import nsd.u;
import hf3.a;
import ry1.b;
import or5.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedList;
import java.util.ArrayList;
import kx0.a;
import java.util.BitSet;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.a$f;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.a$e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.protobuf.livestream.nano.SCLiveOverRoomMessageV2;
import lf3.g;
import brd.t;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.a$a;
import erd.g;
import crd.b;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.a$b;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.Observer;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import nx0.i;
import nx0.y;
import com.kuaishou.protobuf.livestream.nano.LiveOverRoomMessageDisplayInfo;
import java.lang.CharSequence;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import kotlin.collections.ArraysKt___ArraysKt;
import lx0.a;
import qd1.a;
import qd1.a$a;
import lnc.a1;
import nx0.m;
import java.util.Map;
import com.yxcorp.utility.TextUtils;
import d61.v;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.AbsoluteSizeSpan;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.component.broadcastbanner.LiveAdjustSuperscriptSpan;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import d61.o;
import o02.f;
import o02.e;
import cjd.e;
import erd.o;
import bp6.a;
import mx0.e;
import brd.a0;
import z1.e;
import nx0.h;
import lnc.i3;
import java.lang.Number;
import k2b.u1;
import java.lang.Throwable;
import java.util.Collection;
import ekd.q;
import mx0.b;
import brd.e0;
import erd.c;
import t45.d;
import brd.z;
import nx0.j;
import nx0.k;

public final class a	// class@000a5e
{
    public final LinkedList a;
    public final ArrayList b;
    public boolean c;
    public List d;
    public i e;
    public b f;
    public b g;
    public b h;
    public b i;
    public b j;
    public final a k;
    public final BitSet l;
    public final MutableLiveData m;
    public final LiveData n;
    public final g o;
    public final Observer p;
    public final a q;
    public final b r;
    public static final a$c s;

    static {
       a.s = new a$c(null);
    }
    public void a(a p0,b p1,b p2){
       a.p(p0, "liveLongConnection");
       a.p(p1, "liveAudienceStatusObtainService");
       a.p(p2, "feedService");
       super();
       this.q = p0;
       this.r = p2;
       this.a = new LinkedList();
       this.b = new ArrayList();
       this.c = true;
       this.k = new a();
       this.l = new BitSet();
       MutableLiveData mutableLiveD = new MutableLiveData(Boolean.FALSE);
       this.m = mutableLiveD;
       this.n = mutableLiveD;
       a$f uof = new a$f(this);
       this.o = uof;
       a$e uoe = new a$e(this);
       this.p = uoe;
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
       }else {
          p0.u0(746, SCLiveOverRoomMessageV2.class, uof);
       }
       this.f = p1.W().subscribe(new a$a(this));
       this.g = p1.T3().subscribe(new a$b(this));
       LiveData liveData = Transformations.distinctUntilChanged(mutableLiveD);
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       liveData.observeForever(uoe);
       return;
    }
    public final void a(int p0){
       boolean b;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "8")) {
          return;
       }
       b.S(LiveLogTag.LIVE_OVER_ROOM_v2.appendTag("LiveAudienceOverRoomV2Model"), "addDisableFlag", "flag", Integer.valueOf(p0));
       this.l.set(p0);
       a tm = this.m;
       b = (this.l.cardinality() > 0)? true: false;
       tm.setValue(Boolean.valueOf(b));
       return;
    }
    public final void b(SCLiveOverRoomMessageV2 p0){
       a a;
       a uoa1;
       LiveOverRoomMessageDisplayInfo iconUrl;
       SCLiveOverRoomMessageV2 obj2;
       List list3;
       int i1;
       a$a obj3;
       a uoa3;
       Object obj4;
       a obj = this;
       LiveOverRoomMessageDisplayInfo obj1 = p0;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, uoa, "17")) {
          return;
       }
       a = obj.a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = PatchProxy.applyOneRefs(obj1, obj, uoa, "18");
       if (oi != patchProxyRe) {
          uoa1 = a;
       }else {
          SCLiveOverRoomMessageV2 displayInfo = obj1.displayInfo;
          LiveOverRoomMessageDisplayInfo displayText = displayInfo.displayText;
          LiveOverRoomMessageDisplayInfo displayDurat = displayInfo.displayDuration;
          LiveOverRoomMessageDisplayInfo backgroundDu = displayInfo.backgroundDuration;
          CharSequence uCharSequenc = this.d(p0);
          if (uCharSequenc == null) {
             iconUrl = obj1.displayInfo.userName;
          }
          CharSequence uCharSequenc1 = uCharSequenc;
          a.o(uCharSequenc1, "getDisplayCoinText\(scOve¡­sage.displayInfo.userName");
          CDNUrl[] uCDNUrlArray = e0.i(obj1.displayInfo.headUrl);
          a.o(uCDNUrlArray, "CDNUtil.parsePicUrl\(scOv¡­sage.displayInfo.headUrl\)");
          List list = ArraysKt___ArraysKt.uy(uCDNUrlArray);
          boolean b = (this.d(p0) != null)? true: false;
          displayInfo = obj1.displayInfo;
          LiveOverRoomMessageDisplayInfo enableDispla = displayInfo.enableDisplayLiveIcon;
          iconUrl = displayInfo.iconUrl;
          List list1 = (iconUrl != null)? ArraysKt___ArraysKt.uy(iconUrl): 0;
          displayInfo = obj1.displayInfo;
          obj = new a();
          LiveOverRoomMessageDisplayInfo liveOverRoom = displayInfo.enableHeadIconInCircle;
          displayInfo = obj1.bizType;
          LiveOverRoomMessageDisplayInfo liveOverRoom1 = displayInfo.noticeText;
          a uoa2 = a.class;
          if (PatchProxy.isSupport(uoa2)) {
             uoa1 = a;
             obj1 = PatchProxy.applyOneRefs(Integer.valueOf(displayInfo), obj, uoa2, "1");
             if (obj1 != patchProxyRe) {
             }else {
             label_0095 :
                int i2 = 0x7f0613d5;
                int i3 = 0x7f0613d6;
                if (displayInfo != 1) {
                   int i4 = 0x7f0614b4;
                   int i5 = 0x7f0614b3;
                   if (displayInfo != 2 && displayInfo != 3) {
                      if (displayInfo != 4) {
                         if (displayInfo != 7) {
                            if (displayInfo != 9) {
                               obj3 = PatchProxy.apply(null, obj, uoa2, "2");
                               if (obj3 != patchProxyRe) {
                                  uoa3 = obj3;
                               }else {
                                  obj3 = new a$a();
                                  obj3.e(a1.a(i2));
                                  obj3.f(a1.a(i3));
                                  obj3.b(a1.a(R.color.arg_RES_7f061c32));
                                  obj3.c(a1.a(i2));
                                  obj3.d(a1.a(i3));
                                  uoa3 = obj3.a();
                               }
                            }else {
                               obj4 = PatchProxy.apply(null, obj, uoa2, "7");
                               if (obj4 != patchProxyRe) {
                                  uoa3 = obj4;
                               }else {
                                  obj3 = new a$a();
                                  obj3.b(a1.a(R.color.arg_RES_7f061c32));
                                  obj3.c(a1.a(R.color.arg_RES_7f0614da));
                                  obj3.d(a1.a(R.color.arg_RES_7f0614db));
                                  uoa3 = obj3.a();
                               }
                            }
                         }else {
                            obj4 = PatchProxy.apply(null, obj, uoa2, "6");
                            if (obj4 != patchProxyRe) {
                               uoa3 = obj4;
                            }else {
                               obj3 = new a$a();
                               obj3.e(a1.a(i2));
                               obj3.f(a1.a(i3));
                               obj3.b(a1.a(R.color.arg_RES_7f061c32));
                               obj3.c(a1.a(R.color.arg_RES_7f061b29));
                               obj3.d(a1.a(R.color.arg_RES_7f061b29));
                               uoa3 = obj3.a();
                            }
                         }
                      }else {
                         obj4 = PatchProxy.apply(null, obj, uoa2, "4");
                         if (obj4 != patchProxyRe) {
                            uoa3 = obj4;
                         }else {
                            obj3 = new a$a();
                            obj3.b(a1.a(R.color.arg_RES_7f061c32));
                            obj3.c(a1.a(i5));
                            obj3.d(a1.a(i4));
                            uoa3 = obj3.a();
                         }
                      }
                   }else {
                      obj4 = PatchProxy.apply(null, obj, uoa2, "5");
                      if (obj4 != patchProxyRe) {
                         uoa3 = obj4;
                      }else {
                         obj3 = new a$a();
                         obj3.e(a1.a(i5));
                         obj3.f(a1.a(i4));
                         obj3.b(a1.a(R.color.arg_RES_7f061c32));
                         obj3.c(a1.a(i5));
                         obj3.d(a1.a(i4));
                         uoa3 = obj3.a();
                      }
                   }
                }else {
                   Object[] objArray1 = null;
                   obj = PatchProxy.apply(objArray1, obj, uoa2, "3");
                   if (obj != patchProxyRe) {
                   label_0214 :
                      a.m(obj2);
                      a.o(obj2, "LiveBroadcastBannerStyle¡­verRoomMessage.bizType\)!!");
                      Object[] objArray = iconUrl;
                      y oy = new y(null, displayText, displayDurat, null, backgroundDu, uCharSequenc1, list, b, enableDispla, list1, liveOverRoom1, liveOverRoom, obj2);
                      obj2 = p0;
                      obj1 = obj2.displayInfo.displayUrl;
                      a.o(obj1, "scOverRoomMessage.displayInfo.displayUrl");
                      List list2 = ArraysKt___ArraysKt.uy(obj1);
                      SCLiveOverRoomMessageV2 displayInfo1 = obj2.displayInfo;
                      LiveOverRoomMessageDisplayInfo preloadBefor = displayInfo1.preloadBeforeFileName;
                      LiveOverRoomMessageDisplayInfo defaultPrelo = displayInfo1.defaultPreloadBeforeFileName;
                      if (displayInfo1.enableBackgroundWebpV2 != null) {
                         obj1 = displayInfo1.backgroundWebpV2;
                         a.o(obj1, "scOverRoomMessage.displayInfo.backgroundWebpV2");
                         list3 = ArraysKt___ArraysKt.uy(obj1);
                      }else {
                         obj1 = displayInfo1.backgroundWebp;
                         a.o(obj1, "scOverRoomMessage.displayInfo.backgroundWebp");
                         list3 = ArraysKt___ArraysKt.uy(obj1);
                      }
                      displayInfo1 = obj2.displayInfo;
                      m om = new m(list2, preloadBefor, defaultPrelo, list3, displayInfo1.preloadAfterFileName, displayInfo1.defaultPreloadAfterFileName, displayInfo1.enablePreload);
                      displayInfo = obj2.messageId;
                      displayInfo1 = obj2.displayInfo;
                      displayText = displayInfo1.bizTypeValue;
                      SCLiveOverRoomMessageV2 messageType = obj2.messageType;
                      LiveOverRoomMessageDisplayInfo toLiveStream = displayInfo1.toLiveStreamId;
                      LiveOverRoomMessageDisplayInfo linkV2 = displayInfo1.linkV2;
                      backgroundDu = displayInfo1.exptag;
                      LiveOverRoomMessageDisplayInfo serverExpTag = displayInfo1.serverExpTag;
                      obj1 = displayInfo1.extraMessage;
                      int i = 15;
                      if (obj1 != null) {
                         String str = obj1.get("sourceType");
                         if (TextUtils.x(str)) {
                            i = v.e(str, i);
                         }
                         i1 = i;
                      }else {
                         i1 = 15;
                      }
                      obj1 = obj2.displayInfo.extraMessage;
                      String str1 = (obj1 != null)? obj1.get("sourceUrl"): objArray;
                      obj2 = obj2.displayInfo;
                      LiveOverRoomMessageDisplayInfo broadcastInf = obj2.broadcastInfo;
                      enableDispla = obj2.extraMessage;
                      String str2 = (enableDispla != null)? enableDispla.get("extraLogParam"): objArray;
                      i oi1 = new i(displayInfo, displayText, messageType, toLiveStream, linkV2, backgroundDu, serverExpTag, i1, str1, broadcastInf, enableDispla, str2, oi, v18);
                      b.S(LiveLogTag.LIVE_OVER_ROOM_v2.appendTag("LiveAudienceOverRoomV2Model"), "parse signal to local message", "parsedMessage", obj2);
                      oi = obj2;
                   }else {
                      obj3 = new a$a();
                      obj3.e(a1.a(i2));
                      obj3.f(a1.a(i3));
                      obj3.b(a1.a(R.color.arg_RES_7f061c32));
                      obj3.c(a1.a(i2));
                      obj3.d(a1.a(i3));
                      obj = obj3.a();
                      goto label_0214 ;
                   }
                }
             }
          }else {
             uoa1 = a;
             goto label_0095 ;
          }
          obj2 = obj1;
          iconUrl = 0;
          goto label_0214 ;
       }
       uoa1.add(oi);
       this.h();
       return;
    }
    public final LiveData c(){
       return this.n;
    }
    public final CharSequence d(SCLiveOverRoomMessageV2 p0){
       String obj = PatchProxy.applyOneRefs(p0, this, a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       CharSequence uCharSequenc = null;
       if (p0.bizType != 7) {
          return uCharSequenc;
       }
       LiveOverRoomMessageDisplayInfo extraMessage = p0.displayInfo.extraMessage;
       if (extraMessage != null) {
          obj = extraMessage.get("showNumber");
          String str = extraMessage.get("showUnitText");
          if (!TextUtils.x(obj) && !TextUtils.x(str)) {
             SpannableStringBuilder spannableStr = new SpannableStringBuilder(obj);
             int i = spannableStr.length();
             spannableStr.setSpan(new ForegroundColorSpan(a1.a(R.color.arg_RES_7f061bbe)), 0, i, 17);
             spannableStr.setSpan(new AbsoluteSizeSpan(16, true), 0, i, 17);
             spannableStr.append(' '+str);
             spannableStr.setSpan(new ForegroundColorSpan(a1.a(R.color.arg_RES_7f0620c7)), i, spannableStr.length(), 17);
             spannableStr.setSpan(new AbsoluteSizeSpan(10, true), i, spannableStr.length(), 17);
             spannableStr.setSpan(new LiveAdjustSuperscriptSpan(0x3df5c28f), i, spannableStr.length(), 17);
             return spannableStr;
          }
       }
       return uCharSequenc;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       b.P(LiveLogTag.LIVE_OVER_ROOM_v2.appendTag("LiveAudienceOverRoomV2Model"), "startPoll");
       this.e = null;
       this.h();
       return;
    }
    public final void f(int p0){
       boolean b;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "9")) {
          return;
       }
       b.S(LiveLogTag.LIVE_OVER_ROOM_v2.appendTag("LiveAudienceOverRoomV2Model"), "removeDisableFlag", "flag", Integer.valueOf(p0));
       this.l.clear(p0);
       a tm = this.m;
       b = (this.l.cardinality() > 0)? true: false;
       tm.setValue(Boolean.valueOf(b));
       return;
    }
    public final void g(i p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "6")) {
          return;
       }
       LiveLogTag lIVE_OVER_RO = LiveLogTag.LIVE_OVER_ROOM_v2;
       lIVE_OVER_RO.appendTag("LiveAudienceOverRoomV2Model");
       b.T(lIVE_OVER_RO, "reportLivePortalMessage", "overRoomMessage", p0, "reportType", Integer.valueOf(p1));
       if (p0 != null) {
          String str = a.a.q(p0.a());
          LiveStreamFeedWrapper liveStreamFe = this.r.r5();
          a.o(liveStreamFe, "feedService.liveStreamFeedWrapper");
          o.c(liveStreamFe.getLiveStreamId(), p1, 6, str);
          LiveStreamFeedWrapper liveStreamFe1 = this.r.r5();
          a.o(liveStreamFe1, "feedService.liveStreamFeedWrapper");
          this.i = e.a().C(liveStreamFe1.getLiveStreamId(), p1, 6, str).map(new e()).subscribe(new a(), new a());
       }
       return;
    }
    public final void h(){
       a0 uoa0;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "14")) {
          return;
       }
       LiveLogTag lIVE_OVER_RO = LiveLogTag.LIVE_OVER_ROOM_v2;
       lIVE_OVER_RO.appendTag("LiveAudienceOverRoomV2Model");
       LiveLogTag liveLogTag = lIVE_OVER_RO;
       k ok = null;
       boolean b = (this.e == null)? true: false;
       b.T(liveLogTag, "try to poll new message", "currentMessage is null", Boolean.valueOf(b), "messageQueue is empty", Boolean.valueOf(this.a.isEmpty()));
       if (this.e != null) {
          return;
       }else if(!this.a.isEmpty()){
          i oi = this.a.poll();
          this.e = oi;
          a.m(oi);
          if (!PatchProxy.applyVoidOneRefs(oi, this, uoa, "15")) {
             i n = oi.n;
             y oy = oi.g();
             int i = oi.d();
             String str = oi.c();
             if (PatchProxy.isSupport(e.class)) {
                uoa0 = PatchProxy.applyFourRefs(n, oy, Integer.valueOf(i), str, null, e.class, "1");
                if (uoa0 != PatchProxyResult.class) {
                }else if(n.g != null){
                   e uoe = e.a(n.b, n.c);
                   oy.j(uoe.a);
                   e uoe1 = e.a(n.e, n.f);
                   oy.i(uoe1.a);
                   int i1 = uoe.b.intValue();
                   int i2 = uoe1.b.intValue();
                   if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i), str, null, h.class, "7")) {
                      i3 oi3 = i3.f();
                      oi3.c("pre_part_preload_resource", Integer.valueOf(i1));
                      oi3.c("after_part_preload_resource", Integer.valueOf(i2));
                      oi3.c("over_room_biz_type", Integer.valueOf(i));
                      oi3.d("over_room_message_id", str);
                      String str1 = oi3.e();
                      u1.R("LIVE_OVER_ROOM_PRELOAD_EVENT", str1, 3);
                   }
                   if (TextUtils.x(oy.a())) {
                      uoa0 = a0.s(new Throwable("after part preload resource not available!"));
                   }else {
                      uoa0 = a0.B(oy);
                   }
                }else if(q.f(n.a())){
                   uoa0 = a0.s(new Throwable("after part urls not available!"));
                }else if(!q.f(n.b())){
                   String[] stringArray = new String[ok];
                   objArray = n.b().toArray(stringArray);
                }
                String[] stringArray1 = new String[ok];
                uoa0 = a0.g0(e.c(objArray), e.c(n.a().toArray(stringArray1)), new b(oy));
             }else {
                goto label_0085 ;
             }
             this.h = uoa0.G(d.a).R(new j(this, oi), new k(this, oi));
          }
       }
       return;
    }
}
