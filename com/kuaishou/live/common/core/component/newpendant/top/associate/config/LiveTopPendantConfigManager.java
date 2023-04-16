package com.kuaishou.live.common.core.component.newpendant.top.associate.config.LiveTopPendantConfigManager;
import ks5.f;
import yu1.a;
import java.lang.Object;
import yu1.d;
import yu1.g;
import yu1.c;
import ok.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.feature.api.live.merchant.top.config.LiveTopPendantAreaConfig;
import ks5.k;
import ks5.b;
import com.kwai.feature.api.live.merchant.top.config.LiveTopPendantItemConfig;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Integer;
import com.kuaishou.android.live.log.b;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.live.common.core.component.newpendant.top.associate.config.a;
import com.kuaishou.live.common.core.component.newpendant.top.associate.config.b;
import com.kuaishou.live.common.core.component.newpendant.top.associate.config.c;
import com.kuaishou.live.common.core.component.newpendant.top.associate.config.d;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import crd.b;
import lnc.b9;
import brd.t;
import com.kwai.framework.model.user.QCurrentUser;
import wg3.a;
import android.content.SharedPreferences;
import ekd.k1;
import java.util.concurrent.TimeUnit;
import cjd.e;
import erd.o;
import yu1.e;
import com.kuaishou.live.common.core.component.newpendant.top.associate.config.h;
import erd.g;
import java.util.HashMap;
import java.lang.StringBuilder;
import aq5.d;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import xp5.a;
import hz1.a;
import cs3.a;
import com.kuaishou.live.common.core.component.newpendant.top.associate.config.e;
import com.kuaishou.live.common.core.component.newpendant.top.associate.config.f;
import com.kuaishou.live.common.core.component.newpendant.top.associate.config.LiveTopPendantConfigManager$DefaultAreaItemConfig;
import java.util.ArrayList;
import s81.a;
import java.lang.reflect.Type;
import km8.b;
import aq5.b;
import ds5.e;
import yu1.f;
import ds5.c;
import ds5.a;

public class LiveTopPendantConfigManager implements f	// class@0016bf
{
    public final a a;
    public b b;
    public LiveTopPendantAreaConfig c;
    public HashMap d;
    public k e;
    public final b f;
    public c g;
    public g h;
    public c i;

    public void LiveTopPendantConfigManager(a p0){
       super();
       this.f = new d(this);
       this.h = new g();
       this.i = c.a.get();
       this.a = p0;
    }
    public int a(){
       LiveTopPendantAreaConfig obj = PatchProxy.apply(null, this, LiveTopPendantConfigManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.e().mRotationIntervalMs;
       if (obj <= null) {
          int i = 6000;
       }
       return obj;
    }
    public void b(k p0){
       this.e = p0;
    }
    public LiveTopPendantItemConfig c(b p0){
       LiveTopPendantItemConfig obj = PatchProxy.applyOneRefs(p0, this, LiveTopPendantConfigManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e().getLiveTopPendantItemConfig(p0.getBizId());
       LiveLogTag lIVE_TOP_PEN = LiveLogTag.LIVE_TOP_PENDANT_OPTIMIZATION;
       lIVE_TOP_PEN.appendTag("LiveTopPendantConfigManager");
       b.T(lIVE_TOP_PEN, "getLiveTopPendantItemConfig", "pendantBizId", Integer.valueOf(p0.getBizId()), "config", obj);
       return obj;
    }
    public void d(boolean p0){
       t ot;
       t ot1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveTopPendantConfigManager liveTopPenda = LiveTopPendantConfigManager.class;
       if (PatchProxy.isSupport(liveTopPenda) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveTopPenda, "7")) {
          return;
       }
       LiveTopPendantConfigManager ta = this.a;
       Objects.requireNonNull(ta);
       Object obj = PatchProxy.apply(null, ta, a.class, "2");
       boolean b = (obj != patchProxyRe)? obj.booleanValue(): k0.d(ta.a, a.a, b.a, c.a, d.a).or(Boolean.FALSE).booleanValue();
       if (b) {
          b.B(LiveLogTag.LIVE_TOP_PENDANT_OPTIMIZATION, "server disable associate area config");
          return;
       }else {
          b9.a(this.b);
          b = this.a.c();
          if (PatchProxy.isSupport(liveTopPenda)) {
             ot = PatchProxy.applyTwoRefs(Boolean.valueOf(b), Boolean.valueOf(p0), this, liveTopPenda, "8");
             if (ot != patchProxyRe) {
             }else {
             label_0076 :
                LiveTopPendantAreaConfig mVersion = this.e().mVersion;
                if (b) {
                   ot1 = this.i.b(QCurrentUser.me().getId(), this.g(), mVersion);
                }else {
                   t ot2 = this.i.a(QCurrentUser.me().getId(), this.g(), mVersion);
                   if (p0) {
                      long l = 0;
                      long longx = a.a.getLong("userAssociateRequestMaxDelayMillis", l);
                      if (longx - l > 0) {
                         ot1 = ot2.delaySubscription(k1.k(longx), TimeUnit.MILLISECONDS);
                      }
                   }
                   ot = ot2;
                }
                ot = ot1;
             }
          }else {
             goto label_0076 ;
          }
          this.b = ot.map(new e()).subscribe(new e(this), h.b);
          return;
       }
    }
    public final LiveTopPendantAreaConfig e(){
       LiveTopPendantAreaConfig obj = PatchProxy.apply(null, this, LiveTopPendantConfigManager.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d.get(this.f());
       if (obj == null) {
          LiveTopPendantConfigManager tc = this.c;
       }
       return obj;
    }
    public final String f(){
       String obj = PatchProxy.apply(null, this, LiveTopPendantConfigManager.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.a.c())? "ANCHOR": "AUDIENCE";
       return obj+"_"+this.g();
    }
    public int g(){
       boolean b;
       boolean b1;
       a f;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveTopPendantConfigManager obj = PatchProxy.apply(null, this, LiveTopPendantConfigManager.class, "10");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       d obj1 = PatchProxy.apply(null, obj, uoa, "6");
       int i = 0;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(obj.d()){
          b = false;
       }else {
          obj1 = obj.a();
          AnchorBizRelation vOICE_PARTY = (obj.c())? AnchorBizRelation.VOICE_PARTY: AudienceBizRelation.VOICE_PARTY;
          b = obj1.r2(vOICE_PARTY);
       }
       int i1 = 1;
       if (b) {
          i1 = 3;
       }else {
          obj = this.a;
          Objects.requireNonNull(obj);
          Object obj2 = PatchProxy.apply(null, obj, uoa, "5");
          if (obj2 != patchProxyRe) {
             b = obj2.booleanValue();
          }else if(!obj.c()){
             f = obj.a;
             if (f != null && f.isGRPRCustomizedLive()) {
                b = true;
             }
          }
          b = false;
          if (b) {
             i1 = 4;
          }else {
             obj = this.a;
             Objects.requireNonNull(obj);
             obj2 = PatchProxy.apply(null, obj, uoa, "4");
             if (obj2 != patchProxyRe) {
                b = obj2.booleanValue();
             }else if(!obj.c()){
                f = obj.f;
                if (f != null && f.y4().b()) {
                   b = true;
                }
             }
             b = false;
             if (!b) {
                obj = this.a;
                Objects.requireNonNull(obj);
                Object obj3 = PatchProxy.apply(null, obj, uoa, "3");
                if (obj3 != patchProxyRe) {
                   b1 = obj3.booleanValue();
                }else if(obj.c()){
                   uoa = obj.b;
                   if (uoa != null && uoa.d()) {
                      i = 1;
                   }
                   b1 = i;
                }else {
                   b1 = k0.b(obj.a, e.a, f.a).or(Boolean.FALSE).booleanValue();
                }
                if (b1) {
                   i1 = 2;
                }else {
                   i1 = 5;
                }
             }
          }
       }
       return i1;
    }
    public void init(){
       Type a;
       LiveTopPendantConfigManager liveTopPenda = LiveTopPendantConfigManager.class;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, liveTopPenda, str)) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, liveTopPenda, "5")) {
          this.c = new LiveTopPendantAreaConfig();
          this.c.mTopPendantItemList = new ArrayList(LiveTopPendantConfigManager$DefaultAreaItemConfig.values().length);
          LiveTopPendantConfigManager$DefaultAreaItemConfig[] uDefaultArea = LiveTopPendantConfigManager$DefaultAreaItemConfig.values();
          int len = uDefaultArea.length;
          for (int i = 0; i < len; i = i + 1) {
             object oobject = uDefaultArea[i];
             LiveTopPendantItemConfig liveTopPenda1 = new LiveTopPendantItemConfig();
             liveTopPenda1.mBizId = oobject.getBizId();
             liveTopPenda1.mPriority = oobject.getPriority();
             liveTopPenda1.mOrder = oobject.getLayoutOrder();
             liveTopPenda1.mIsAlignLeft = oobject.isAlignLeft();
             this.c.mTopPendantItemList.add(liveTopPenda1);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, liveTopPenda, "6")) {
          LiveTopPendantConfigManager th = this.h;
          Objects.requireNonNull(th);
          HashMap hashMap = PatchProxy.apply(objArray, th, g.class, str);
          if (hashMap != PatchProxyResult.class) {
          }else {
             a = g.a;
             String str1 = a.a.getString("liveCacheTopPendantConfigMap", "");
             hashMap = (str1 == null || str1 == "")? objArray: b.a(str1, a);
          }
          this.d = hashMap;
          if (hashMap == null) {
             hashMap = new HashMap();
             this.d = hashMap;
             this.h.a(hashMap);
          }
       }
       if (this.a.c()) {
          this.d(false);
       }
       if (!PatchProxy.applyVoid(objArray, this, liveTopPenda, "12")) {
          if (this.a.d()) {
             this.d(false);
          }else {
             d uod = this.a.a();
             LiveTopPendantConfigManager tf = this.f;
             a[] uoaArray = new a[1];
             AnchorBizRelation vOICE_PARTY = (this.a.c())? AnchorBizRelation.VOICE_PARTY: AudienceBizRelation.VOICE_PARTY;
             uoaArray[0] = vOICE_PARTY;
             uod.u5(tf, uoaArray);
             if (!this.a.c() && this.a.b() != null) {
                if (this.g == null) {
                   this.g = new f(this);
                }
                this.a.b().gd(this.g);
             }
          }
       }
       return;
    }
    public void release(){
       LiveTopPendantConfigManager liveTopPenda = LiveTopPendantConfigManager.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveTopPenda, "4")) {
          return;
       }
       b9.a(this.b);
       this.e = objArray;
       if (!PatchProxy.applyVoid(objArray, this, liveTopPenda, "13") && !this.a.d()) {
          d uod = this.a.a();
          LiveTopPendantConfigManager tf = this.f;
          a[] uoaArray = new a[1];
          AnchorBizRelation vOICE_PARTY = (this.a.c())? AnchorBizRelation.VOICE_PARTY: AudienceBizRelation.VOICE_PARTY;
          uoaArray[0] = vOICE_PARTY;
          uod.G5(tf, uoaArray);
          if (!this.a.c() && (this.a.b() != null && this.g != null)) {
             this.a.b().fo(this.g);
          }
       }
    label_0062 :
       return;
    }
}
