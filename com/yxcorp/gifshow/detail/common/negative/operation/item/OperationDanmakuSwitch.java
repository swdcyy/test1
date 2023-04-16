package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDanmakuSwitch;
import mf5.w0;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDanmakuSwitch$a;
import nsd.u;
import v6a.m0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDanmakuSwitch$1;
import msd.a;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDanmakuSwitch$2;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDanmakuSwitch$3;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import f6a.a;
import km5.i;
import xx9.a;
import com.kwai.feature.api.danmaku.DanmakuSwitchUtil;
import kf5.g;
import lnc.a1;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.Pair;
import java.lang.Integer;
import dz9.i;
import qrd.l1;
import f6a.c;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import java.lang.CharSequence;
import e17.i;
import com.kwai.feature.api.danmaku.DanmakuUtil;
import mm5.c;
import k2b.e0;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import lm5.e;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import dz9.j;
import erd.g;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDanmakuSwitch$b;

public final class OperationDanmakuSwitch extends w0	// class@001479
{
    public final BaseFragment C;
    public final QPhoto D;
    public b E;
    public b F;
    public final m0 G;
    public final SlidePageConfig H;
    public static final OperationDanmakuSwitch$a I;

    static {
       OperationDanmakuSwitch.I = new OperationDanmakuSwitch$a(null);
    }
    public void OperationDanmakuSwitch(m0 p0,SlidePageConfig p1){
       a.p(p0, "callerContext");
       a.p(p1, "pageConfig");
       super("danmaku_switch");
       this.G = p0;
       this.H = p1;
       this.C = p0.b;
       this.D = p0.c.mPhoto;
       this.T(R.string.arg_RES_7f10484e);
       int i = 0x7f080aef;
       int i1 = (this.X())? 0x7f080aef: 0x7f080afd;
       this.L(i1);
       if (!this.X()) {
          i = 0x7f080afe;
       }
       this.P(i);
       if (this.X() && this.E()) {
          this.R(true);
          this.Q(new OperationDanmakuSwitch$1(this));
       }else {
          this.O(new OperationDanmakuSwitch$2(this));
          this.H(this.E());
          this.V(R.drawable.arg_RES_7f080aea);
          this.r = true;
          this.s = new OperationDanmakuSwitch$3(this);
       }
       return;
    }
    public boolean D(){
       OperationDanmakuSwitch obj = PatchProxy.apply(null, this, OperationDanmakuSwitch.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (!this.E()) {
          obj = this.D;
          a.o(obj, "photo");
          if (a.b(obj)) {
             a c = this.G.c;
             a.o(c, "callerContext.mPhotoDetailParam");
             if (i.e(c, i, 2, null) && (!this.G.r.c() && (this.G.c.showDanmkuSwitch != null && !DanmakuSwitchUtil.b(this.D)))) {
             label_0052 :
                i = true;
             }
          }
       }else {
          goto label_0052 ;
       }
       return i;
    }
    public boolean E(){
       OperationDanmakuSwitch obj = PatchProxy.apply(null, this, OperationDanmakuSwitch.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.D;
       a.o(obj, "photo");
       int i = 0;
       if (a.b(obj) && !this.G.r.c()) {
          a c = this.G.c;
          if (c.showDanmkuSwitch != null) {
             a.o(c, "callerContext.mPhotoDetailParam");
             if (i.f(c, i, 2, null)) {
                i = true;
             }
          }
       }
       return i;
    }
    public final void W(boolean p0,g p1){
       String str;
       List dataList;
       Iterator iterator;
       Pair pair1;
       int i2;
       OperationDanmakuSwitch operationDan = OperationDanmakuSwitch.class;
       if (PatchProxy.isSupport(operationDan) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, operationDan, "6")) {
          return;
       }
       if (p0) {
          str = a1.p(R.string.arg_RES_7f103cb8);
          a.o(str, "CommonUtil.string\(R.stri¡­nel_element_danmaku_tips\)");
          this.Z(str);
       }else {
          str = a1.p(R.string.arg_RES_7f103cb5);
          a.o(str, "CommonUtil.string\(R.stri¡­ement_danmaku_close_tips\)");
          this.Z(str);
       }
       if (p1 != null) {
          p1.c(this.A());
       }
       str = "danmaku_setting";
       Pair pair = null;
       if (p0) {
          if (p1 != null) {
             dataList = p1.getDataList();
             if (dataList != null) {
                iterator = dataList.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      pair1 = iterator.next();
                      if (!a.g(pair1.A(), str)) {
                         continue ;
                      }
                   }else {
                      pair1 = pair;
                   }
                label_006d :
                   if (pair1 != null) {
                      return;
                   }else {
                      int i = 1;
                      if (p1 != null) {
                         List dataList1 = p1.getDataList();
                         if (dataList1 != null) {
                            Iterator iterator1 = dataList1.iterator();
                            int i1 = 0;
                            while (iterator1.hasNext()) {
                               Object obj = iterator1.next();
                               if (a.g(obj.A(), "danmaku_switch")) {
                                  pair = new Pair(Integer.valueOf(i1), obj);
                               }
                               i1 = i1 + 1;
                            }
                            if (pair != null) {
                               Integer first = pair.getFirst();
                               if (first != null) {
                                  i2 = first.intValue() + i;
                               label_00b6 :
                                  if (p1 != null) {
                                     i oi = new i(this.G, this.H);
                                     if (this.X() && i2 == p1.getDataList().size()) {
                                        oi.I(2);
                                        if (this.k() == 3) {
                                           this.I(i);
                                        }else {
                                           this.I(0);
                                        }
                                     }
                                     p1.b(i2, oi);
                                  }
                               }
                            }
                         }
                      }
                      i2 = 0;
                      goto label_00b6 ;
                   }
                }
             }
          }
          pair1 = pair;
          goto label_006d ;
       }else if(p1 != null){
          dataList = p1.getDataList();
          if (dataList != null) {
             iterator = dataList.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   Object obj1 = iterator.next();
                   if (a.g(obj1.A(), str)) {
                      pair = obj1;
                   }
                }
                if (pair != null) {
                   p1.d(pair);
                   break ;
                }
             }
          }
       }
       return;
    }
    public final boolean X(){
       Object obj = PatchProxy.apply(null, this, OperationDanmakuSwitch.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!c.a() || (this.H.a0() || c.b()))? true: false;
       return b;
    }
    public final boolean Y(){
       Object obj = PatchProxy.apply(null, this, OperationDanmakuSwitch.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return DanmakuSwitchUtils.h.f();
    }
    public final void Z(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OperationDanmakuSwitch.class, "7")) {
          return;
       }
       i.g(R.style.arg_RES_7f11066a, p0, true, true);
       return;
    }
    public void d(w0 p0,g p1){
       OperationDanmakuSwitch tC;
       OperationDanmakuSwitch tD;
       OperationDanmakuSwitch operationDan = OperationDanmakuSwitch.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, operationDan, "3")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       if (this.X() && !this.E()) {
          p1.a();
          this.Z(DanmakuUtil.b(this.D));
          tC = this.C;
          a.o(tC, "fragment");
          tD = this.D;
          a.o(tD, "photo");
          c.a.a(tC, tD, DanmakuSwitchUtil.b(this.D), DanmakuSwitchUtils.h.g(this.D), false, "PLAYER_PANEL_POPUP");
          return;
       }else {
          int i = this.Y() ^ 0x01;
          if (!PatchProxy.isSupport(operationDan) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(i), p1, this, operationDan, "5")) {
             OperationDanmakuSwitch tE = this.E;
             if (tE != null) {
                tE.dispose();
             }
             this.E = RxBus.f.g(e.class, RxBus$ThreadMode.MAIN).subscribe(new j(this, i, p1));
             DanmakuSwitchUtils.h.a(i);
             tC = this.C;
             a.o(tC, "fragment");
             tD = this.D;
             a.o(tD, "photo");
             c.a.a(tC, tD, true, i, false, "PLAYER_PANEL_SHARE");
          }
          return;
       }
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, OperationDanmakuSwitch.class, "9")) {
          return;
       }
       OperationDanmakuSwitch tE = this.E;
       if (tE != null) {
          tE.dispose();
       }
       tE = this.F;
       if (tE != null) {
          tE.dispose();
       }
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, OperationDanmakuSwitch.class, "8")) {
          return;
       }
       this.F = RxBus.f.g(e.class, RxBus$ThreadMode.MAIN).subscribe(new OperationDanmakuSwitch$b(this));
       c a = c.a;
       OperationDanmakuSwitch tC = this.C;
       a.o(tC, "fragment");
       OperationDanmakuSwitch tD = this.D;
       a.o(tD, "photo");
       boolean b = this.E();
       boolean b1 = (this.E() && this.Y())? true: false;
       a.b(tC, tD, b, b1, false);
       return;
    }
}
