package com.kuaishou.live.core.basic.activity.r;
import msd.a;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.log.LiveLogTag;
import tj3.k;
import tj3.e;
import tj3.r;
import java.lang.Long;
import tj3.i;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import d61.a0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import yp.x;
import f3b.o;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import com.yxcorp.gifshow.action.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;
import com.kuaishou.live.core.basic.activity.LiveSlideActivity;
import r12.h;
import com.kuaishou.live.common.core.basic.degrade.j;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.live.core.basic.activity.t;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import d61.g;
import com.kuaishou.live.core.basic.activity.LivePlayLoader;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$d;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kuaishou.live.core.basic.activity.LivePlayStage;
import m02.k1;
import m02.s0;
import kotlin.jvm.internal.a;
import kotlin.Pair;
import java.util.List;
import trd.u0;
import java.util.ArrayList;
import java.lang.Iterable;
import java.lang.Number;
import m02.j1;
import java.util.Comparator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Collection;
import q91.a;
import lnc.i3;
import k2b.u1;
import t02.a0;
import com.google.gson.JsonObject;
import hf3.a;
import qrd.l1;

public final class r implements a	// class@001851
{
    public final LivePlayFragment b;

    public void r(LivePlayFragment p0){
       this.b = p0;
    }
    public final Object invoke(){
       boolean b;
       LivePlayFragment f1;
       long l1;
       r tb = this.b;
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b.d0(LiveLogTag.LIVE_PLUGIN_LOAD_MOCK, "uploadAudienceStatEvent", "startTime1", Long.valueOf(tb.V.x().m()), "startTime2", Long.valueOf(tb.V.h().h()));
       LiveAudienceParam mPhoto = tb.F.mPhoto;
       Object obj = null;
       LivePlayFragment obj1 = PatchProxy.applyOneRefs(mPhoto, obj, a0.class, "1");
       String str = 1;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(x.l(mPhoto)){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          mPhoto = tb.F.mPhoto;
          obj1 = tb.V;
          int i = 13;
          String str1 = o.i(i);
          if (!PatchProxy.applyVoidThreeRefs(mPhoto, obj1, str1, null, a0.class, "2")) {
             RealAction$ExtParams uExtParams = RealAction$ExtParams.newInstance();
             uExtParams.mActualPlayDuration = a0.d(obj1);
             c.f(str1, i, mPhoto, str1, uExtParams);
          }
       }
       k ok = tb.V.x();
       if (tb.getActivity() instanceof LivePlayActivity || tb.getActivity() instanceof LiveSlideActivity) {
          ok.V(h.a, tb.D1);
          ok.W(h.b, tb.C1);
       }
       ok.k0(tb.g1);
       ok.a0("liveAudienceDegradeInfo", j.c());
       ok.a0("live_dispatch_feed_timestamp", k0.a(tb.H.mEntity.mLiveStreamModel, t.a).or(Long.valueOf(0)).toString());
       ok.b0("is_biz_presenter_scatter", tb.O);
       ok.b0("is_multi_tab_style", tb.c1);
       ok.b0("is_professional_merchant", g.j(tb.F.mPhoto));
       obj1 = tb.y1;
       if (obj1 != null) {
          LivePlayLoader f = obj1.f;
          ok.V(h.c, f.d);
          ok.W(h.d, f.b);
          ok.W(h.f, f.e);
          ok.V(h.e, f.g);
          if (f.h != null) {
             ok.Z("live_load_view_async_strategy", (long)f.i);
          }
          if (f.c > 0) {
             ok.B0((tb.C1 + f.b));
             ok.h0((f.c + f.f));
             ok.u0 = tb.E1;
          }
          Iterator iterator = f.a.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             LivePlayStage key = uEntry.getKey();
             tb.T.a(key, uEntry.getValue().longValue());
          }
       }
       obj1 = tb.T;
       s0 os0 = new s0(ok);
       Objects.requireNonNull(obj1);
       k1 ok1 = k1.class;
       if (!PatchProxy.applyVoidOneRefs(os0, obj1, ok1, "2")) {
          a.p(os0, "uploadHandle");
          Object[] objArray = PatchProxy.apply(obj, obj1, ok1, "3");
          if (objArray != patchProxyRe) {
          }else {
             ArrayList uArrayList = new ArrayList();
             Iterator iterator1 = u0.D1(obj1.a).iterator();
             while (iterator1.hasNext()) {
                Object obj2 = iterator1.next();
                Object obj3 = (obj2.getSecond().longValue() > 0)? 1: null;
                if (obj3) {
                   uArrayList.add(obj2);
                }
             }
             Pair[] pairArray = new Pair[false];
             Object[] objArray1 = CollectionsKt___CollectionsKt.f5(uArrayList, new j1()).toArray(pairArray);
             Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
             objArray = objArray1;
          }
          f1 = (!objArray.length)? 1: null;
          if (!f1) {
             int i1 = objArray.length - str;
             while (i1 >= 0) {
                long l = objArray[i1].getSecond().longValue();
                int i2 = i1 - 1;
                l1 = (i2 >= 0)? objArray[i2].getSecond().longValue(): 0;
                l = l - l1;
                String key1 = objArray[i1].getFirst().getKey();
                if (l1 > 0 && (l > 0 && key1 != null)) {
                   os0.invoke(key1, Long.valueOf(l));
                }
             label_0216 :
                i1 = i2;
             }
          }
       }
       tb.F.mStartRenderTimeMs = ok.v0;
       f1 = tb.F;
       if (!PatchProxy.applyVoidOneRefs(f1, obj, a.class, "5")) {
          i3 oi3 = i3.f();
          oi3.c("startLiveTimeMs", Long.valueOf(a.e(f1)));
          oi3.c("startTvcTimeMs", Long.valueOf(f1.mTvcShowStartTimeMs));
          oi3.c("endTvcTimeMs", Long.valueOf(f1.mTvcShowEndTimeMs));
          oi3.c("requestTvcStartTimeMs", Long.valueOf(f1.mRequestTvcStartTimeMs));
          oi3.c("requestTvcEndTimeMs", Long.valueOf(f1.mRequestTvcEndTimeMs));
          oi3.c("requestTvcType", Long.valueOf(f1.mTvcRequestType));
          oi3.c("liveStartRenderTimeMs", Long.valueOf(f1.mStartRenderTimeMs));
          u1.R("LIVE_PLAY_CLICK_TO_RENDER_EVENT", oi3.e(), 3);
          f1.mTvcShowEndTimeMs = 0;
          f1.mTvcShowStartTimeMs = 0;
          f1.mRequestTvcStartTimeMs = 0;
          f1.mRequestTvcEndTimeMs = 0;
          f1.mTvcRequestType = -1;
       }
       f1 = tb.K;
       if (f1 != null) {
          ok.s0(f1.C.C0());
       }
       tb.V.w();
       ok.f0();
       tb.Y0 = false;
       return l1.a;
    }
}
