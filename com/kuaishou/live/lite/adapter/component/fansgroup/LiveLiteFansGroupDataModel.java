package com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel$d;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.feed.LiveFansGroupRelationInfoResponse;
import com.kwai.component.fansgroup.utils.FansGroupKswitchUtil;
import l95.b;
import l95.a;
import l95.c;
import com.kuaishou.live.lite.LiveLiteParam;
import e93.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.android.live.model.LiveStreamModel$SpecialLive;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Map;
import java.lang.Long;
import java.util.HashMap;
import n91.f;
import java.lang.System;
import fg6.a;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;
import z12.x;
import java.lang.StringBuilder;
import va1.l0;
import mrd.a;
import crd.b;
import lnc.b9;
import g73.a;
import va1.f;
import xp5.g;
import com.yxcorp.utility.TextUtils;
import cjd.e;
import erd.o;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel$a;
import erd.g;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel$b;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel$c;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel$updateCanShowFansGroupInfo$1;
import msd.a;
import tb7.b;
import java.lang.Integer;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel$updateFansGroupLevel$1;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel$updateFansGroupMedalType$1;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel$updateFansGroupStatus$1;
import java.lang.Number;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel$updateSuperFansGroupStatus$1;

public final class LiveLiteFansGroupDataModel	// class@001d90
{
    public final String a;
    public final MutableLiveData b;
    public final MutableLiveData c;
    public final MutableLiveData d;
    public final MutableLiveData e;
    public final MutableLiveData f;
    public final MutableLiveData g;
    public final MutableLiveData h;
    public o i;
    public a j;
    public f k;
    public a l;
    public b m;
    public b n;
    public b o;
    public b p;
    public b q;
    public b r;
    public b s;
    public b t;
    public b u;
    public boolean v;
    public long w;
    public long x;
    public long y;
    public final g z;

    public void LiveLiteFansGroupDataModel(){
       super();
       this.a = "LiteFansGroupDataModel";
       this.b = new MutableLiveData();
       this.c = new MutableLiveData();
       this.d = new MutableLiveData();
       this.e = new MutableLiveData();
       this.f = new MutableLiveData();
       this.g = new MutableLiveData();
       this.h = new MutableLiveData();
       this.z = new LiveLiteFansGroupDataModel$d(this);
    }
    public static t d(LiveLiteFansGroupDataModel p0,boolean p1,boolean p2,boolean p3,boolean p4,int p5,Object p6){
       if (p5 & 0x01) {
          p1 = false;
       }
       if (p5 & 0x02) {
          p2 = false;
       }
       if (p5 & 0x04) {
          p3 = false;
       }
       if (p5 & 0x08) {
          p4 = true;
       }
       return p0.c(p1, p2, p3, p4);
    }
    public static void m(LiveLiteFansGroupDataModel p0,boolean p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = true;
       }
       p0.l(p1, p2);
       return;
    }
    public static void o(LiveLiteFansGroupDataModel p0,int p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = true;
       }
       p0.n(p1, p2);
       return;
    }
    public static void r(LiveLiteFansGroupDataModel p0,int p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = true;
       }
       p0.q(p1, p2);
       return;
    }
    public static void u(LiveLiteFansGroupDataModel p0,boolean p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = true;
       }
       p0.t(p1, p2);
       return;
    }
    public final void a(){
       LiveStreamFeed liveStreamFe;
       boolean b2;
       Long longx1;
       LiveStreamModel mIsGRPRCusto;
       LiveStreamModel$SpecialLive mQuizLive;
       Object obj = this;
       LiveLiteFansGroupDataModel liveLiteFans = LiveLiteFansGroupDataModel.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, liveLiteFans, "8")) {
          return;
       }
       LiveFansGroupRelationInfoResponse liveFansGrou = this.f();
       boolean b = true;
       if (!PatchProxy.applyVoidOneRefs(liveFansGrou, obj, liveLiteFans, "22") && FansGroupKswitchUtil.b()) {
          b uob = new b(b, "Entrance", "FETCH_FEED");
          if (liveFansGrou != null) {
             a uoa = new a();
             uoa.d(liveFansGrou.mStatus);
             uoa.b(liveFansGrou.mFansGroupLevel);
             uoa.c(liveFansGrou.mFansGroupMedalType);
             uoa.a(liveFansGrou.mCanShowSuperFansGroupInfo);
             uoa.a(liveFansGrou.mHasJoinSuperFansGroup);
             uob.e(uoa);
          }
          c.a(uob);
       }
       liveFansGrou = this.f();
       if (liveFansGrou != null) {
          boolean b1 = false;
          obj.n(liveFansGrou.mFansGroupLevel, b1);
          obj.p(liveFansGrou.mFansGroupMedalType, b1);
          obj.q(liveFansGrou.mStatus, b1);
          obj.t(liveFansGrou.mHasJoinSuperFansGroup, b1);
          LiveLiteFansGroupDataModel j = obj.j;
          if (j != null) {
             LiveLiteParam liveLitePara = j.ok();
             if (liveLitePara != null) {
                liveStreamFe = liveLitePara.getLiveStreamFeed();
             label_007c :
                LiveFansGroupRelationInfoResponse obj1 = PatchProxy.applyTwoRefs(liveFansGrou, liveStreamFe, obj, liveLiteFans, "9");
                if (obj1 != PatchProxyResult.class) {
                   b2 = obj1.booleanValue();
                }else if(liveStreamFe != null){
                   LiveStreamFeed mLiveStreamM = liveStreamFe.mLiveStreamModel;
                   if (mLiveStreamM != null) {
                      mIsGRPRCusto = mLiveStreamM.mIsGRPRCustomized;
                   label_0097 :
                      if (liveStreamFe != null) {
                         LiveStreamFeed mLiveStreamM1 = liveStreamFe.mLiveStreamModel;
                         if (mLiveStreamM1 != null) {
                            LiveStreamModel mSpecialLive = mLiveStreamM1.mSpecialLive;
                            if (mSpecialLive != null) {
                               mQuizLive = mSpecialLive.mQuizLive;
                            label_00a5 :
                               boolean b3 = (mQuizLive != null)? true: false;
                               LiveLiteLogTag lITE_FANS_GR = LiveLiteLogTag.LITE_FANS_GROUP;
                               lITE_FANS_GR.appendTag(obj.a);
                               LiveLiteLogTag liveLiteLogT = lITE_FANS_GR;
                               Boolean uBoolean = Boolean.valueOf(liveFansGrou.mCanShowFansGroupInfo);
                               if (liveStreamFe != null) {
                                  liveStreamFe = liveStreamFe.mLiveStreamModel;
                                  if (liveStreamFe != null) {
                                     objArray = Boolean.valueOf(liveStreamFe.mIsGRPRCustomized);
                                  }
                               }
                               b.U(liveLiteLogT, "checkCanShowFansGroup", "info.mCanShowFansGroupInfo", uBoolean, "isGRPRCustomizedLive", objArray, "isQuizLive", Boolean.valueOf(b3));
                               if (liveFansGrou.mCanShowFansGroupInfo == null || (mIsGRPRCusto != null || b3)) {
                                  b = 0;
                               }
                               b2 = b;
                            }
                         }
                      }
                      mQuizLive = objArray;
                      goto label_00a5 ;
                   }
                }
                mIsGRPRCusto = 1;
                goto label_0097 ;
                obj.l(b2, b1);
                obj1 = liveFansGrou.mUrlRequestDelayMsMap;
                long l = 0;
                if (obj1 != null) {
                   Long longx = obj1.get("/fansGroup/v2/lite/enterLiveRoom");
                   long l1 = (longx != null)? longx.longValue(): l;
                   obj.w = l1;
                   longx1 = obj1.get("/fansGroup/v2/lite/fetchFansGroupInfo");
                   l1 = (longx1 != null)? longx1.longValue(): l;
                   obj.x = l1;
                }
                obj1 = liveFansGrou.mUrlRequestBreakMsMap;
                if (obj1 != null) {
                   longx1 = obj1.get("/fansGroup/v2/lite/fetchFansGroupInfo");
                   if (longx1 != null) {
                      l = longx1.longValue();
                   }
                   obj.y = l;
                }
             }
          }
          liveStreamFe = objArray;
          goto label_007c ;
       }
       return;
    }
    public final String b(){
       HashMap obj = PatchProxy.apply(null, this, LiveLiteFansGroupDataModel.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       LiveLiteFansGroupDataModel tk = this.k;
       long l = (tk != null)? tk.s(): System.currentTimeMillis();
       obj.put("reportTimeMs", Long.valueOf(l));
       String str = a.a.q(obj);
       a.o(str, "Gsons.KWAI_GSON.toJson\(map\)");
       return str;
    }
    public final t c(boolean p0,boolean p1,boolean p2,boolean p3){
       long l;
       if (PatchProxy.isSupport(LiveLiteFansGroupDataModel.class)) {
          Object obj = PatchProxy.applyFourRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, LiveLiteFansGroupDataModel.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.f() == null) {
          t ot = t.just(Boolean.FALSE);
          a.o(ot, "Observable.just\(false\)");
          return ot;
       }else if(p3){
          l = this.x + x.B(this.y);
       }else {
          l = 0;
       }
       l0.n("是否要延时="+p3+", \n固定延时="+this.x+", \n打散总时间="+this.y+", \n总延时="+l);
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<Boolean>\(\)");
       b9.a(this.t);
       a uoa1 = f.a(a.class);
       LiveLiteFansGroupDataModel tj = this.j;
       String liveStreamId = (tj != null)? tj.getLiveStreamId(): null;
       this.t = uoa1.c(TextUtils.k(liveStreamId), p1, p2, p0).map(new e()).delaySubscription(l, TimeUnit.MILLISECONDS).observeOn(d.a).doOnNext(new LiveLiteFansGroupDataModel$a(this)).subscribe(new LiveLiteFansGroupDataModel$b(uoa), new LiveLiteFansGroupDataModel$c(this, uoa));
       return uoa;
    }
    public final LiveData e(){
       return this.e;
    }
    public final LiveFansGroupRelationInfoResponse f(){
       Object[] objArray = null;
       LiveLiteFansGroupDataModel obj = PatchProxy.apply(objArray, this, LiveLiteFansGroupDataModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j;
       if (obj != null) {
          LiveLiteParam liveLitePara = obj.ok();
          if (liveLitePara != null) {
             LiveStreamFeed liveStreamFe = liveLitePara.getLiveStreamFeed();
             if (liveStreamFe != null) {
                objArray = liveStreamFe.mLiveLiteFansGroupRelationInfo;
             }
          }
       }
       return objArray;
    }
    public final LiveData g(){
       return this.f;
    }
    public final LiveData h(){
       return this.b;
    }
    public final LiveData i(){
       return this.c;
    }
    public final LiveData j(){
       return this.d;
    }
    public final LiveData k(){
       return this.h;
    }
    public final void l(boolean p0,boolean p1){
       LiveLiteFansGroupDataModel liveLiteFans = LiveLiteFansGroupDataModel.class;
       if (PatchProxy.isSupport(liveLiteFans) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, liveLiteFans, "10")) {
          return;
       }
       b.j(new LiveLiteFansGroupDataModel$updateCanShowFansGroupInfo$1(this, p0, p1));
       return;
    }
    public final void n(int p0,boolean p1){
       LiveLiteFansGroupDataModel liveLiteFans = LiveLiteFansGroupDataModel.class;
       if (PatchProxy.isSupport(liveLiteFans) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, liveLiteFans, "11")) {
          return;
       }
       b.j(new LiveLiteFansGroupDataModel$updateFansGroupLevel$1(this, p0, p1));
       return;
    }
    public final void p(int p0,boolean p1){
       LiveLiteFansGroupDataModel liveLiteFans = LiveLiteFansGroupDataModel.class;
       if (PatchProxy.isSupport(liveLiteFans) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, liveLiteFans, "13")) {
          return;
       }
       b.j(new LiveLiteFansGroupDataModel$updateFansGroupMedalType$1(this, p0, p1));
       return;
    }
    public final void q(int p0,boolean p1){
       LiveLiteFansGroupDataModel liveLiteFans = LiveLiteFansGroupDataModel.class;
       if (PatchProxy.isSupport(liveLiteFans) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, liveLiteFans, "12")) {
          return;
       }
       if (p0 > 0) {
          b.j(new LiveLiteFansGroupDataModel$updateFansGroupStatus$1(this, p0, p1));
       }
       return;
    }
    public final void s(Integer p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteFansGroupDataModel.class, "4")) {
          return;
       }
       LiveLiteLogTag lITE_FANS_GR = LiveLiteLogTag.LITE_FANS_GROUP;
       lITE_FANS_GR.appendTag(this.a);
       b.T(lITE_FANS_GR, "updateIntimacyInfo", "level", p0, "status", p1);
       if (p0 != null) {
          LiveLiteFansGroupDataModel.o(this, p0.intValue(), false, 2, null);
       }
       if (p1 != null) {
          LiveLiteFansGroupDataModel.r(this, p1.intValue(), false, 2, null);
       }
       return;
    }
    public final void t(boolean p0,boolean p1){
       LiveLiteFansGroupDataModel liveLiteFans = LiveLiteFansGroupDataModel.class;
       if (PatchProxy.isSupport(liveLiteFans) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, liveLiteFans, "14")) {
          return;
       }
       b.j(new LiveLiteFansGroupDataModel$updateSuperFansGroupStatus$1(this, p0, p1));
       return;
    }
}
