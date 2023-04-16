package com.yxcorp.gifshow.growth.kpop.ext.util.KPopDataUtil;
import com.yxcorp.gifshow.growth.kpop.ext.util.KPopDataUtil$mSharedPreferences$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.growth.kpop.ext.model.KPopShowRecord;
import java.lang.System;
import fg6.a;
import com.google.gson.Gson;
import android.content.SharedPreferences;
import com.kwai.android.common.ext.SharePreferenceExtKt;
import java.lang.Throwable;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import zsd.u;
import nsd.u;

public final class KPopDataUtil	// class@001415
{
    public static final p a;
    public static final KPopDataUtil b;

    static {
       KPopDataUtil.b = new KPopDataUtil();
       KPopDataUtil.a = s.c(KPopDataUtil$mSharedPreferences$2.INSTANCE);
    }
    public void KPopDataUtil(){
       super();
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KPopDataUtil.class, "4")) {
          return;
       }
       a.p(p0, "kwaiBubbleId");
       Object[] objArray = new Object[0];
       w.C().w("KPopDataUtil", "addKPopShowCount kwaiBubbleId="+p0, objArray);
       KPopShowRecord kPopShowReco = this.b(p0);
       kPopShowReco.setShowCountToday((kPopShowReco.getShowCountToday() + 1));
       kPopShowReco.setShowCountTotal((kPopShowReco.getShowCountTotal() + 1));
       long l = System.currentTimeMillis();
       try{
          kPopShowReco.setLastShowTime(l);
          SharePreferenceExtKt.put(this.c(), "SP_KEY_KPOP_SHOW_RECORD"+p0, a.a.q(kPopShowReco));
       }catch(java.lang.Exception e6){
          w.C().e("KPopDataUtil", "addKPopShowCount err", e6);
       }
       return;
    }
    public final KPopShowRecord b(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, KPopDataUtil.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "kwaiBubbleId");
       p0 = this.c().getString("SP_KEY_KPOP_SHOW_RECORD"+p0, null);
       obj = (p0 == null || u.S1(p0))? 1: null;
       if (obj) {
          KPopShowRecord kPopShowReco = new KPopShowRecord(0, 0, 0, 7, null);
       }else {
          try{
             KPopShowRecord kPopShowReco1 = a.a.h(p0, KPopShowRecord.class);
          }catch(java.lang.Exception e0){
             KPopShowRecord kPopShowReco2 = new KPopShowRecord(0, 0, 0, 7, null);
          }
       }
    }
    public final SharedPreferences c(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KPopDataUtil kPopDataUtil = KPopDataUtil.class;
       Object obj = PatchProxy.apply(null, this, kPopDataUtil, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, kPopDataUtil, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = KPopDataUtil.a.getValue();
       }
       return obj1;
    }
}
