package com.yxcorp.gifshow.detail.common.danmaku.topguide.a;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.BaseOpenCloseGuideElement;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.a$a;
import nsd.u;
import jh5.a;
import lq7.c;
import rp7.a;
import rd5.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils;
import nm5.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;
import qp7.b;
import qp7.t0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import com.yxcorp.gifshow.entity.QPhoto;
import qp7.x0;
import oq7.j;
import com.kwai.slide.play.detail.danmaku.content.DanmakuPositionType;
import lq7.a;
import lnc.a1;
import java.util.Objects;
import pp7.b;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import sm5.a;
import com.kwai.framework.model.user.QCurrentUser;
import xf6.d;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kwai.feature.api.danmaku.model.DanmakuInfo;
import nm5.e;
import sm5.c;
import java.lang.System;
import java.lang.Number;
import java.lang.StringBuilder;
import android.content.SharedPreferences;
import qp7.g;
import lq7.d;
import qp7.c;
import oq7.i;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.a$b;
import erd.g;
import crd.b;
import crd.a;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.a$c;
import com.yxcorp.gifshow.util.rx.RxBus;
import lm5.d;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.a$d;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.a$e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.api.danmaku.DanmakuSwitchUtil;
import nm5.m;
import com.kwai.feature.api.danmaku.DanmakuUtil;

public final class a extends BaseOpenCloseGuideElement	// class@0013fe
{
    public boolean D;
    public boolean E;
    public boolean F;
    public static final a$a G;

    static {
       a.G = new a$a(null);
    }
    public void a(a p0){
       super(c.b, p0);
       this.F = true;
    }
    public void r0(e p0){
       boolean b;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "5")) {
          return;
       }
       a.p(p0, "event");
       g og = DanmakuExperimentUtils.U.d();
       if (og != null) {
          String obj = PatchProxy.apply(null, this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(super.n0() && (this.E == null && this.F != null)){
             b = true;
          }else {
             b = false;
          }
          if (b && Math.abs((p0.a - (long)(og.startShowTime * 1000))) - (long)500 < 0) {
             this.c0();
             if (this.H().l0()) {
                if (this.q0().isHdr()) {
                   this.E().h(DanmakuPositionType.TRENDING_HDR);
                }else {
                   this.E().h(DanmakuPositionType.TRENDING_NORMAL);
                }
             }else if(this.q0().isHdr()){
                this.E().h(DanmakuPositionType.HDR);
             }else {
                this.E().h(DanmakuPositionType.NORMAL);
             }
             obj = a1.p(R.string.arg_RES_7f100973);
             a.o(obj, "CommonUtil.string\(R.stri¡­ose_switch_more_exciting\)");
             this.E().i(obj);
             j oj = this.E();
             obj = a1.p(R.string.arg_RES_7f100972);
             a.o(obj, "CommonUtil.string\(R.string.danmaku_close_switch\)");
             Objects.requireNonNull(oj);
             if (!PatchProxy.applyVoidOneRefs(obj, oj, j.class, "11")) {
                a.p(obj, "text");
                oj.i.f(obj);
             }
             this.E().j(-6.00f);
             this.E().k(og.a());
          }
       }
    label_00f9 :
       return;
    }
    public void s0(){
       boolean b1;
       boolean b2;
       long l1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "1")) {
          return;
       }
       if (DanmakuSwitchUtils.h.d()) {
          a b = a.b;
          QPhoto qPhoto = this.q0();
          Objects.requireNonNull(b);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          a uoa = a.class;
          QCurrentUser obj = PatchProxy.applyOneRefs(qPhoto, b, uoa, "6");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
             obj = QCurrentUser.ME;
             a.o(obj, "QCurrentUser.ME");
             if (obj.isLogined()) {
                CommonMeta obj1 = PatchProxy.applyOneRefs(qPhoto, b, uoa, "5");
                if (obj1 != patchProxyRe) {
                   b2 = obj1.booleanValue();
                }else if(!d.r("DANMAKU_CLOSE_GUIDE_OPEN")){
                   if (qPhoto != null) {
                      obj1 = qPhoto.getCommonMeta();
                      if (obj1 != null) {
                         DanmakuInfo uDanmakuInfo = e.a(obj1);
                         if (uDanmakuInfo == null || uDanmakuInfo.mPhotoDanmakuCloseGuide != 1) {
                         }
                      }else {
                      }
                   }else {
                   }
                }
                b2 = true;
                if (b2 && (a.a() && !c.a(qPhoto))) {
                   long l = System.currentTimeMillis();
                   QCurrentUser obj2 = PatchProxy.apply(objArray, b, uoa, "2");
                   if (obj2 != patchProxyRe) {
                      l1 = obj2.longValue();
                   }else {
                      long l2 = 0;
                      if (d.r("DANMAKU_CLOSE_GUIDE_TIME")) {
                         l1 = l2;
                      }else {
                         obj2 = QCurrentUser.ME;
                         a.o(obj2, "QCurrentUser.ME");
                         if (!obj2.isLogined()) {
                            l1 = Long.MAX_VALUE;
                         }else {
                            QCurrentUser mE = QCurrentUser.ME;
                            a.o(mE, "QCurrentUser.ME");
                            l1 = a.a.getLong("DANMAKU_CLOSE_GUIDE_LAST_SHOW_TIMESTAMP"+mE.getId(), l2);
                         }
                      }
                   }
                   if ((l - l1) - (long)0x5265c00 > 0) {
                      b1 = true;
                   }
                }
             }
          label_00d6 :
             b1 = false;
          }
          if (b1) {
             super.s0();
             this.D().f(28.00f);
             this.C.c(this.A().c(new a$b(this)));
             this.C.c(this.A().b(new a$c(this)));
             this.C.c(RxBus.f.f(d.class).observeOn(d.a).subscribe(new a$d(this)));
             this.C.c(this.D().j(new a$e(this)));
          }
       }
       return;
    }
    public void t0(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       super.t0();
       this.D().f(0);
       this.D = false;
       this.E = false;
       return;
    }
    public boolean u0(){
       DanmakuUtil uDanmakuUtil;
       Object[] objArray = null;
       CommonMeta obj = PatchProxy.apply(objArray, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (TextUtils.x(this.q0().getDisclaimerMessage()) && DanmakuSwitchUtil.b(this.q0())) {
          obj = this.q0().getCommonMeta();
          if (obj != null) {
             objArray = e.a(obj);
          }
          if (!m.e(objArray)) {
             uDanmakuUtil = null;
          label_0046 :
             if (DanmakuExperimentUtils.U.C()) {
                b = uDanmakuUtil;
             }else if(uDanmakuUtil || DanmakuUtil.g.o(this.q0())){
                b = true;
             }
             return b;
          }
       }
    label_0045 :
       uDanmakuUtil = 1;
       goto label_0046 ;
    }
}
