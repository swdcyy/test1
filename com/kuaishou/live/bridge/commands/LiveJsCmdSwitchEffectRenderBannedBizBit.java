package com.kuaishou.live.bridge.commands.LiveJsCmdSwitchEffectRenderBannedBizBit;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import java.lang.Integer;
import java.lang.Object;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import trd.s0;
import com.kuaishou.live.bridge.commands.LiveJsCmdSwitchEffectRenderBannedBizBit$effectService$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kuaishou.live.bridge.commands.LiveJsCmdSwitchEffectRenderBannedBizBit$a;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import ekd.k1;
import o63.j$a;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import java.lang.Boolean;
import java.lang.Long;
import kotlin.jvm.internal.a;
import eg1.e;
import nq5.a;
import h71.r;
import java.lang.Runnable;

public final class LiveJsCmdSwitchEffectRenderBannedBizBit extends AbstractLiveJsCommand	// class@000e02
{
    public final String e;
    public final boolean f;
    public final Map g;
    public final int h;
    public final int i;
    public final p j;
    public final Object k;

    public void LiveJsCmdSwitchEffectRenderBannedBizBit(){
       super();
       this.e = "LiveJsCmdSwitchEffectRenderBannedBizBit";
       this.f = a.t().u("SOURCE_LIVE").d("enableEffectRenderBannedByKRN", false);
       this.g = s0.k(r0.a(Integer.valueOf(1), Integer.valueOf(0x80000)));
       this.h = -1;
       this.i = -2;
       this.j = s.c(new LiveJsCmdSwitchEffectRenderBannedBizBit$effectService$2(this));
       this.k = new Object();
    }
    public Class a(){
       return LiveJsCmdSwitchEffectRenderBannedBizBit$a.class;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, LiveJsCmdSwitchEffectRenderBannedBizBit.class, "2")) {
          return;
       }
       b.Z(LiveLogTag.GIFT, this.e+" onDestroy");
       k1.n(this.k);
       return;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveJsCmdSwitchEffectRenderBannedBizBit.class, "3");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       LiveLogTag gIFT = LiveLogTag.GIFT;
       b.Z(gIFT, this.e+" onExecute");
       if (this.f == null) {
          b.B(gIFT, this.e+" onExecute KSwitch blocked");
          return m.g.c("KSwitch blocked");
       }else if(p0 instanceof LiveJsCmdSwitchEffectRenderBannedBizBit$a && (p0.a() == null || p0.c() == null)){
          b.B(gIFT, this.e+" onExecute invalid params type");
          return m.g.c("invalid params type");
       }else {
          Integer integer = this.g.get(p0.a());
          if (integer == null) {
             b.B(gIFT, this.e+" onExecute invalid banBiz");
             return m.g.c("invalid banBiz");
          }else if(p0.c().booleanValue()){
             if (p0.b() == null) {
                b.B(gIFT, this.e+" onExecute empty timeoutMs");
                return m.g.a(this.h, "empty timeoutMs");
             }else if(p0.b().longValue() - false <= 0){
                b.B(gIFT, this.e+" onExecute invalid timeoutMs");
                return m.g.a(this.i, "invalid timeoutMs");
             }
          }
          if (p0.c().booleanValue()) {
             int i = integer.intValue();
             p0 = p0.b();
             a.m(p0);
             long l = p0.longValue();
             p0 = LiveJsCmdSwitchEffectRenderBannedBizBit.class;
             if (!PatchProxy.isSupport(p0) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Long.valueOf(l), this, p0, "5")) {
                b.Z(gIFT, this.e+" banEffect: "+i+", banTimeout: "+l);
                this.m().S0((long)i);
                k1.n(this.k);
                k1.s(new r(this, i), this.k, l);
             }
          }else {
             this.n(integer.intValue());
          }
          return m$a.g(m.g, null, false, 3, null);
       }
    }
    public final e m(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdSwitchEffectRenderBannedBizBit.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
    public final void n(int p0){
       LiveJsCmdSwitchEffectRenderBannedBizBit liveJsCmdSwi = LiveJsCmdSwitchEffectRenderBannedBizBit.class;
       if (PatchProxy.isSupport(liveJsCmdSwi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveJsCmdSwi, "4")) {
          return;
       }
       b.Z(LiveLogTag.GIFT, this.e+" permitEffect "+p0);
       this.m().j1((long)p0);
       k1.n(this.k);
       return;
    }
}
