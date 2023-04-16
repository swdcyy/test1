package com.kuaishou.live.core.show.hourlytrank.e;
import com.kuaishou.live.core.show.hourlytrank.e$a;
import nsd.u;
import hf3.a;
import brd.t;
import java.lang.Object;
import crd.a;
import java.lang.String;
import com.kwai.framework.abtest.f;
import com.kuaishou.live.core.show.hourlytrank.e$d;
import com.kuaishou.live.core.show.hourlytrank.e$c;
import com.kuaishou.live.core.show.hourlytrank.e$j;
import com.kuaishou.live.core.show.hourlytrank.e$i;
import com.kuaishou.live.core.show.hourlytrank.e$e;
import com.kuaishou.live.core.show.hourlytrank.e$f;
import com.kuaishou.live.core.show.hourlytrank.e$g;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveDistrictRankInfo;
import com.kuaishou.livestream.message.nano.SCLivePopularityRankInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCGzoneLiveHourRankInfo;
import com.kuaishou.live.core.basic.model.LiveHourlyRankPendantPriorityInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import java.lang.StringBuilder;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kuaishou.live.core.show.hourlytrank.e$h;
import java.util.Comparator;
import java.util.Iterator;
import com.kuaishou.live.core.show.hourlytrank.e$b;
import s00.b$a;
import s00.b;

public final class e	// class@000c0d
{
    public a a;
    public boolean b;
    public LiveStreamMessages$SCLiveDistrictRankInfo c;
    public SCLivePopularityRankInfo d;
    public LiveStreamMessages$SCGzoneLiveHourRankInfo e;
    public e$b f;
    public boolean g;
    public boolean h;
    public final g i;
    public final g j;
    public final g k;
    public final g l;
    public final g m;
    public final g n;
    public final g o;
    public final a p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final t t;
    public final t u;
    public static final e$a v;

    static {
       e.v = new e$a(null);
    }
    public void e(a p0,boolean p1,boolean p2,boolean p3,t p4,t p5){
       super();
       this.p = p0;
       this.q = p1;
       this.r = p2;
       this.s = p3;
       this.t = p4;
       this.u = p5;
       this.a = new a();
       this.g = f.a("isHourlyRankEntryVisibleCtrEnable");
       this.i = new e$d(this);
       this.j = new e$c(this);
       this.k = new e$j(this);
       this.l = new e$i(this);
       this.m = new e$e(this);
       this.n = new e$f(this);
       this.o = new e$g(this);
    }
    public final int a(MessageNano p0){
       LiveStreamMessages$SCLiveDistrictRankInfo priority;
       if (p0 instanceof LiveStreamMessages$SCLiveDistrictRankInfo) {
          priority = p0.priority;
       }else if(p0 instanceof SCLivePopularityRankInfo){
          priority = p0.priority;
       }else if(p0 instanceof LiveStreamMessages$SCGzoneLiveHourRankInfo){
          priority = p0.priority;
       }else {
          priority = Integer.MAX_VALUE;
       }
       return priority;
    }
    public final void b(LiveHourlyRankPendantPriorityInfo p0){
       SCLivePopularityRankInfo sCLivePopula;
       String str1;
       LiveLogTag hOURLY_RANK;
       LiveLogTag liveLogTag;
       SCLivePopularityRankInfo sCLivePopula1;
       e c;
       LiveStreamMessages$SCLiveDistrictRankInfo currentTimes;
       e d;
       e e;
       MessageNano[] messageNanoA;
       Iterator iterator;
       MessageNano messageNano;
       e f;
       byte[] uobyteArray;
       boolean b = this;
       LiveHourlyRankPendantPriorityInfo obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(obj, b, uoe, "1")) {
          return;
       }
       boolean b1 = true;
       b.b = b1;
       if (obj != null) {
          LiveHourlyRankPendantPriorityInfo districtRank = obj.districtRankInfoPBString;
          LiveStreamMessages$SCLiveDistrictRankInfo sCLiveDistri = PatchProxy.applyOneRefs(districtRank, b, uoe, "2");
          String str = null;
          if (sCLiveDistri != patchProxyRe) {
          }else if(districtRank != null){
             byte[] uobyteArray1 = b.c(districtRank);
             try{
                sCLiveDistri = LiveStreamMessages$SCLiveDistrictRankInfo.parseFrom(uobyteArray1);
             }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e0){
                sCLiveDistri = str;
             }
          }else {
             goto label_0030 ;
          }
       }
    }
    public final byte[] c(String p0){
       byte[] uobyteArray;
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          uobyteArray = b.a().a(p0);
       }catch(java.lang.Exception e0){
          uobyteArray = null;
       }
       return uobyteArray;
    }
    public final void d(LiveStreamMessages$SCLiveDistrictRankInfo p0){
       boolean b1;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "10")) {
          return;
       }
       LiveLogTag hOURLY_RANK = LiveLogTag.HOURLY_RANK;
       hOURLY_RANK.appendTag("LiveHourlyRankPendantDataManager");
       LiveLogTag liveLogTag = hOURLY_RANK;
       int i = 1;
       boolean b = (p0 == null)? true: false;
       b.S(liveLogTag, "[district] try publish district rank info", "rankInfo == null", Boolean.valueOf(b));
       if (p0 != null) {
          Object obj = PatchProxy.apply(null, this, uoe, "9");
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else if(this.g != null && this.h != null){
             b1 = 1;
          }else {
             b1 = 0;
          }
          hOURLY_RANK.appendTag("LiveHourlyRankPendantDataManager");
          b.T(hOURLY_RANK, "[district] check districtRankEntry visible", "isHourlyRankEntryRemoteCtrEnabled", Boolean.valueOf(this.g), "isRemoteDisableHourlyRankEntry", Boolean.valueOf(this.h));
          if (this.b == null || b1) {
             i = 0;
          }
          b1 = i;
          if (b1) {
             uoe = this.f;
             if (uoe != null) {
                uoe.c(p0);
             }
          }
          this.c = p0;
       }
       return;
    }
}
