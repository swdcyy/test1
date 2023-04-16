package com.kuaishou.tuna_live.plugin.TunaLiveNoticePerfLogger;
import cy5.a;
import com.kuaishou.tuna_live.plugin.TunaLiveNoticePerfLogger$a;
import nsd.u;
import com.kuaishou.tuna_live.plugin.TunaLiveNoticePerfLogger$Companion$NEED_REPORT_PERFORMANCE$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import java.lang.Integer;
import lnc.i3;
import java.lang.Number;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import com.kuaishou.tuna_logger.KsgLogTunaLiveTag;
import java.util.List;
import com.kuaishou.tuna_live.plugin.TunaLiveNoticePerfLogger$report$1;
import c15.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import xx5.g;
import zx5.a;
import zx5.e;
import com.kuaishou.tuna_live.plugin.TunaLiveNoticePerfLogger$report$$inlined$let$lambda$1;
import zx5.a$a;

public final class TunaLiveNoticePerfLogger implements a	// class@001160
{
    public long a;
    public long b;
    public long c;
    public long d;
    public static final p e;
    public static final TunaLiveNoticePerfLogger$a f;

    static {
       TunaLiveNoticePerfLogger.f = new TunaLiveNoticePerfLogger$a(null);
       TunaLiveNoticePerfLogger.e = s.c(TunaLiveNoticePerfLogger$Companion$NEED_REPORT_PERFORMANCE$2.INSTANCE);
    }
    public void TunaLiveNoticePerfLogger(){
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, TunaLiveNoticePerfLogger.class, "3")) {
          return;
       }
       this.c = SystemClock.elapsedRealtime();
       return;
    }
    public void b(String p0,int p1){
       long l;
       TunaLiveNoticePerfLogger tunaLiveNoti = TunaLiveNoticePerfLogger.class;
       if (PatchProxy.isSupport(tunaLiveNoti) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, tunaLiveNoti, "5")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.c("stage", Integer.valueOf(p1));
       oi3.d("business_type", TextUtils.I(p0));
       int i = 0;
       if (p1 != 1) {
          l = (p1 != 2)? i: this.d;
       }else {
          l = this.b;
       }
       if (l - i < 0) {
          return;
       }else {
          oi3.c("cost", Long.valueOf(l));
          l = oi3.e();
          b.f(KsgLogTunaLiveTag.COMMON_NOTICE.appendTag("tuna_live_notice_render"), new TunaLiveNoticePerfLogger$report$1(l));
          TunaLiveNoticePerfLogger$a f = TunaLiveNoticePerfLogger.f;
          Objects.requireNonNull(f);
          Boolean uBoolean = PatchProxy.apply(null, f, TunaLiveNoticePerfLogger$a.class, "1");
          if (uBoolean == PatchProxyResult.class) {
             uBoolean = TunaLiveNoticePerfLogger.e.getValue();
          }
          if (uBoolean.booleanValue()) {
             g og = d.a(-174493078);
             if (og != null) {
                e uoe = og.PB(a.class);
                if (uoe != null) {
                   a$a.a(uoe, "tuna_live_notice_render", false, new TunaLiveNoticePerfLogger$report$$inlined$let$lambda$1(l), 2, null);
                }
             }
          }
          return;
       }
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, TunaLiveNoticePerfLogger.class, "2")) {
          return;
       }
       if (this.a - null > 0) {
          this.b = SystemClock.elapsedRealtime() - this.a;
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, TunaLiveNoticePerfLogger.class, "1")) {
          return;
       }
       this.a = SystemClock.elapsedRealtime();
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, TunaLiveNoticePerfLogger.class, "4")) {
          return;
       }
       if (this.c - null > 0) {
          this.d = SystemClock.elapsedRealtime() - this.c;
       }
       return;
    }
}
