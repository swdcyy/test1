package com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoDispatcherPresenter$mKrnEventListener$2$a;
import oj0.a;
import com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoDispatcherPresenter$mKrnEventListener$2;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import java.lang.Double;
import ek2.o;
import com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoDispatcherPresenter;
import kotlin.jvm.internal.a;
import fq5.b;
import t02.a0;
import ek2.o$a;
import java.lang.Integer;
import ek2.l;
import java.lang.reflect.Type;
import el.a;
import pm8.a;
import java.util.HashMap;
import java.lang.Long;
import java.lang.Number;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.System;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import ek2.m;
import ek2.n;

public final class LiveAudienceStayInfoDispatcherPresenter$mKrnEventListener$2$a implements a	// class@0010ab
{
    public final LiveAudienceStayInfoDispatcherPresenter$mKrnEventListener$2 b;

    public void LiveAudienceStayInfoDispatcherPresenter$mKrnEventListener$2$a(LiveAudienceStayInfoDispatcherPresenter$mKrnEventListener$2 p0){
       this.b = p0;
       super();
    }
    public final void W(Map p0){
       HashMap hashMap;
       boolean b;
       SharedPreferences a;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceStayInfoDispatcherPresenter$mKrnEventListener$2$a.class, "1")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_STAY_INFO, "Krn Event value", "value", p0);
       if (p0 != null) {
          String str = "bizType";
          if (p0.containsKey(str)) {
             p0 = p0.get(str);
             Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Double");
             double d = p0.doubleValue();
             o$a d1 = o.d;
             int i = (int)d;
             LiveAudienceStayInfoDispatcherPresenter s = this.b.this$0.S;
             if (s == null) {
                a.S("mLivePlayCallerContext");
             }
             b uob = s.b();
             a.o(uob, "mLivePlayCallerContext.liveBasicContext");
             String str1 = uob.d();
             a.o(str1, "mLivePlayCallerContext.l¡­BasicContext.anchorUserId");
             Objects.requireNonNull(d1);
             o$a uoa = o$a.class;
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), str1, d1, uoa, "2")) {
                a.p(str1, "userId");
                d1 = a.z(new l().getType());
                if (d1 == null) {
                   hashMap = new HashMap();
                }
                long l = 0;
                Long longx = hashMap.get(Integer.valueOf(i));
                if (longx != null) {
                   l = longx.longValue();
                }
                b = DateUtils.H(l);
                hashMap.put(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis()));
                a = a.a;
                SharedPreferences$Editor uEditor = a.edit();
                uEditor.putString("liveAudienceStayInfoFrequencyLastShowTimeMap", b.e(hashMap));
                g.a(uEditor);
                hashMap = a.A(new m().getType());
                if (hashMap == null) {
                   hashMap = new HashMap();
                }
                Integer integer = hashMap.get(Integer.valueOf(i));
                Integer integer1 = Integer.valueOf(i);
                int i1 = (integer != null && b)? integer.intValue() + 1: 1;
                hashMap.put(integer1, Integer.valueOf(i1));
                uEditor = a.edit();
                uEditor.putString("liveAudienceStayInfoFrequencyShowTimesPerDayAllAuthorMap", b.e(hashMap));
                g.a(uEditor);
                hashMap = a.B(new n().getType());
                if (hashMap == null) {
                   hashMap = new HashMap();
                }
                HashMap hashMap1 = hashMap.get(Integer.valueOf(i));
                if (hashMap1 == null || !b) {
                   hashMap1 = new HashMap();
                }
                Integer integer2 = hashMap1.get(str1);
                if (integer2 != null) {
                   hashMap1.put(str1, Integer.valueOf((integer2.intValue() + 1)));
                }else {
                   hashMap1.put(str1, Integer.valueOf(1));
                }
                hashMap.put(Integer.valueOf(i), hashMap1);
                SharedPreferences$Editor uEditor1 = a.edit();
                uEditor1.putString("liveAudienceStayInfoFrequencyShowTimesPerDayOneAuthorMap", b.e(hashMap));
                g.a(uEditor1);
             }
          }
       }
       return;
    }
}
