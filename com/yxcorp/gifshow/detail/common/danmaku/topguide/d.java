package com.yxcorp.gifshow.detail.common.danmaku.topguide.d;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.BaseOpenCloseGuideElement;
import jh5.a;
import lq7.c;
import rp7.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.c;
import qp7.b;
import oq7.i;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.b;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import lm5.d;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import tx9.c;
import qp7.g;
import lq7.d;
import tx9.d;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import rd5.e;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.danmaku.model.DanmakuInfo;
import nm5.e;
import sm5.d;
import java.lang.Boolean;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import com.kwai.feature.api.danmaku.model.PhotoDanmakuGuideConfig;
import java.lang.Math;
import qp7.x0;
import oq7.j;
import nm5.g;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils;
import com.kwai.feature.api.danmaku.DanmakuSwitchUtil;

public class d extends BaseOpenCloseGuideElement	// class@001401
{
    public boolean D;
    public static int E = 500;

    public void d(a p0){
       super(c.d, p0);
    }
    public void o0(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       super.o0();
       this.j(this.A().c(new b(this)));
       this.j(this.A().b(new c(this)));
       this.j(RxBus.f.f(d.class).observeOn(a.c()).subscribe(new c(this)));
       d uod = this.D();
       d uod1 = new d(this);
       Objects.requireNonNull(uod);
       b uob = PatchProxy.applyOneRefs(uod1, uod, d.class, "10");
       if (uob != PatchProxyResult.class) {
       }else {
          a.p(uod1, "onNext");
          uob = uod.e.subscribe(uod1);
          a.o(uob, "mShowSendDanmakuOpenBubble.subscribe\(onNext\)");
       }
       this.j(uob);
       return;
    }
    public void r0(e p0){
       boolean b;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "6")) {
          return;
       }
       if (this.B.getCommonMeta() == null || (e.a(this.B.getCommonMeta()) != null && e.a(this.B.getCommonMeta()).mPhotoDanmakuGuideConfig != null)) {
          DanmakuInfo uDanmakuInfo = e.a(this.B.getCommonMeta());
          int i = 1;
          if (d.e(this.B) == i && d.a()) {
             Object obj = PatchProxy.apply(null, this, uod, "5");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(super.n0() && this.D == null){
                i = 0;
             }
             b = i;
             if (b && (!DanmakuSwitchUtils.h.d() && (Math.abs((p0.a - ((long)uDanmakuInfo.mPhotoDanmakuGuideConfig.getStartShowTime() * 1000))) - (long)d.E < 0 && !d.b(this.B)))) {
                this.c0();
                this.E().k(DanmakuExperimentUtils.i().a());
                if (!this.v0() && d.h(this.B) != null) {
                   this.E().i(d.h(this.B));
                }
             }
          }
       }
    label_00c3 :
       return;
    }
    public void t0(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       super.t0();
       this.D = false;
       return;
    }
    public boolean u0(){
       Object obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!DanmakuSwitchUtils.h.d() && (DanmakuSwitchUtil.b(this.B) && (!d.c(this.B) || !d.i(this.B))))? true: false;
       return b;
    }
    public final boolean v0(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return d.j(this.B);
    }
}
