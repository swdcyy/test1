package com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.LiveGiftBoxDialogVC;
import ui1.m;
import si1.e;
import com.kuaishou.live.viewcontroller.ViewController;
import vq5.d;
import zg1.g;
import zg1.d;
import zg1.e;
import pi1.a;
import z1.k;
import om1.e;
import ni1.a;
import ih1.f;
import qi1.b;
import yi1.b;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bottom.LiveGiftBoxPaymentManager;
import si1.a;
import java.util.List;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ah1.c;
import lj1.c;
import nsd.u;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.LiveGiftBoxDialogVC$viewModel$2;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.LiveGiftBoxDialogVC$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import qi1.g;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.LiveGiftBoxDialogVC$$special$$inlined$viewModels$2;
import msd.a;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.app.Activity;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView;
import android.view.View;
import android.content.Context;
import i2b.a;
import android.view.ViewGroup;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.LiveGiftBoxDialogVC$a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView$d;
import qi1.a;
import qrd.p;
import ri1.a;
import com.kuaishou.live.common.core.component.gift.giftpanel.LiveGiftPanelVC;
import java.util.Map;
import tl1.a;
import java.util.Objects;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import oi1.b;
import si1.c;
import qi1.d;
import si1.b;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bottom.LiveGiftBoxBottomBarVC;
import qi1.c;
import ui1.o;
import ti1.i;
import com.kwai.framework.model.user.QCurrentUser;
import lnc.a1;
import ih1.s;
import ih1.c;
import ui1.m$a;
import ul1.a;
import ch1.c;
import ch1.b;
import com.yxcorp.gifshow.models.Gift;
import qi1.f;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftNumberSelectDialog;
import java.lang.Integer;
import androidx.fragment.app.KwaiDialogFragment;
import qi1.e;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import ni1.c;
import ul1.d;
import wl1.j;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import java.util.HashMap;
import lj1.b;
import ch1.d;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import rm1.i;
import java.lang.Number;
import lj1.a;
import jj1.a;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.component.gift.domain.recharge.LiveGiftRechargeManager;
import sj1.a;
import jm1.a;
import rw1.a;
import o56.c;
import o56.a;
import android.app.Application;

public final class LiveGiftBoxDialogVC extends ViewController implements m, e	// class@0011e4
{
    public final a A;
    public final f B;
    public final b C;
    public final k D;
    public final b E;
    public final LiveGiftSendModel F;
    public final LiveGiftBoxPaymentManager G;
    public final k H;
    public final a I;
    public final List J;
    public final LiveGiftBoxConfig K;
    public final c j;
    public a k;
    public c l;
    public LiveGiftPanelVC m;
    public LiveGiftBoxBottomBarVC n;
    public LiveGiftBoxPopupView o;
    public final p p;
    public final d q;
    public final g r;
    public final d s;
    public final e t;
    public final a u;
    public final k v;
    public final k w;
    public final k x;
    public final k y;
    public final e z;

    public void LiveGiftBoxDialogVC(d p0,g p1,d p2,e p3,a p4,k p5,k p6,k p7,k p8,e p9,a p10,f p11,b p12,k p13,b p14,LiveGiftSendModel p15,LiveGiftBoxPaymentManager p16,k p17,a p18,List p19,LiveGiftBoxConfig p20){
       Object obj = p0;
       Object obj1 = p1;
       Object obj2 = p2;
       Object obj3 = p3;
       Object obj4 = p4;
       Object obj5 = p5;
       Object obj6 = p6;
       Object obj7 = p7;
       Object obj8 = p8;
       Object obj9 = p9;
       Object obj10 = p10;
       Object obj11 = p11;
       Object obj12 = p12;
       Object obj13 = p13;
       a.p(obj, "routerManager");
       a.p(obj1, "fragmentServiceAdapter");
       a.p(obj2, "dialogNotifyServiceAdapter");
       a.p(obj3, "dialogServiceAdapter");
       a.p(obj4, "loginDependency");
       a.p(obj5, "currentUser");
       a.p(obj6, "liveStreamId");
       a.p(obj7, "giftApiRequestPathService");
       a.p(obj8, "liveModel");
       a.p(obj9, "sendGiftTracer");
       a.p(obj10, "giftBoxParam");
       a.p(obj11, "giftBoxRepo");
       a.p(obj12, "listener");
       a.p(obj13, "dialogType");
       a.p(p14, "topBarSwitchModel");
       a.p(p15, "giftSendModel");
       a.p(p16, "paymentManager");
       a.p(p17, "giftRechargeManager");
       a.p(p18, "topBarVCManager");
       a.p(p19, "handleButtonVisibleInterceptors");
       a.p(p20, "giftBoxConfig");
       super();
       ViewController viewControll = this;
       viewControll.q = obj;
       viewControll.r = obj1;
       viewControll.s = obj2;
       viewControll.t = obj3;
       viewControll.u = obj4;
       viewControll.v = obj5;
       viewControll.w = obj6;
       viewControll.x = obj7;
       viewControll.y = obj8;
       viewControll.z = obj9;
       viewControll.A = obj10;
       viewControll.B = obj11;
       viewControll.C = obj12;
       viewControll.D = obj13;
       viewControll.E = p14;
       viewControll.F = p15;
       viewControll.G = p16;
       viewControll.H = p17;
       viewControll.I = p18;
       viewControll.J = p19;
       viewControll.K = p20;
       c uoc = new c("receiverModel", p10.a(), null, 1, 4, 0);
       viewControll.j = obj;
       viewControll.p = new ViewModelLazy(m0.d(g.class), new LiveGiftBoxDialogVC$$special$$inlined$viewModels$2(new LiveGiftBoxDialogVC$$special$$inlined$viewModels$1(viewControll)), new LiveGiftBoxDialogVC$viewModel$2(viewControll));
    }
    public void D0(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxDialogVC.class, "18")) {
          return;
       }
       this.C.D0();
       return;
    }
    public void F2(){
       boolean b;
       ViewGroup viewGroup1;
       LiveGiftBoxPopupView liveGiftBoxP = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveGiftBoxDialogVC liveGiftBoxD = LiveGiftBoxDialogVC.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, liveGiftBoxP, liveGiftBoxD, "2")) {
          return;
       }
       b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxDialogVC][onCreate]");
       LiveGiftBoxPopupView liveGiftBoxP1 = LiveGiftBoxPopupView.g(this.B2(), R.layout.arg_RES_7f0d0b1f);
       a.o(liveGiftBoxP1, "LiveGiftBoxPopupView.new¡­t_box_dialog_layout\n    \)");
       liveGiftBoxP.o = liveGiftBoxP1;
       liveGiftBoxP.R2(liveGiftBoxP1);
       View view = a.a(this.B2(), R.layout.arg_RES_7f0d0b32);
       a.o(view, "KwaiLayoutInflater.infla¡­alog_content_layout\n    \)");
       liveGiftBoxP1.setContentView(view);
       liveGiftBoxP1.setDragEnable(false);
       liveGiftBoxP1.setMaxScrollDuration(liveGiftBoxP.K.g);
       liveGiftBoxP1.setOnDismissListener(new LiveGiftBoxDialogVC$a(liveGiftBoxP));
       a uoa = new a(view);
       String str = "1";
       g og = PatchProxy.apply(objArray, liveGiftBoxP, liveGiftBoxD, str);
       if (og == patchProxyRe) {
          og = liveGiftBoxP.p.getValue();
       }
       if (!PatchProxy.applyVoidTwoRefs(liveGiftBoxP, og, uoa, a.class, str)) {
          a.p(liveGiftBoxP, "lifecycleOwner");
          a.p(og, "viewModel");
       }
       if (!PatchProxy.applyVoidTwoRefs(liveGiftBoxP, view, liveGiftBoxP, liveGiftBoxD, "4")) {
          if (!PatchProxy.applyVoidTwoRefs(liveGiftBoxP, view, liveGiftBoxP, liveGiftBoxD, "5")) {
             viewGroup1 = view.findViewById(R.id.container_background);
             a uoa1 = new a();
             liveGiftBoxP.k = uoa1;
             a.o(viewGroup1, "backgroundContainer");
             liveGiftBoxP.y2(viewGroup1, uoa1);
          }
          if (!PatchProxy.applyVoidTwoRefs(liveGiftBoxP, view, liveGiftBoxP, liveGiftBoxD, "7")) {
             viewGroup1 = view.findViewById(R.id.container_panel);
             LiveGiftPanelVC liveGiftPane = new LiveGiftPanelVC(liveGiftBoxP.K, liveGiftBoxP.B, liveGiftBoxP.w, liveGiftBoxP.x, liveGiftBoxP.v, liveGiftBoxP.A.e(), liveGiftBoxP.A.c(), liveGiftBoxP.A.g());
             liveGiftBoxP.m = og;
             og.Y2(liveGiftBoxP.C);
             a.o(viewGroup1, "panelContainer");
             liveGiftBoxP.y2(viewGroup1, og);
          }
          LiveGiftBoxDialogVC e = liveGiftBoxP.E;
          Objects.requireNonNull(e);
          c obj = PatchProxy.apply(objArray, e, b.class, str);
          b = (obj != patchProxyRe)? obj.booleanValue(): a.g(e.a(), Boolean.TRUE) ^ 0x01;
          if (b) {
             liveGiftBoxP.K.e().a(liveGiftBoxP.K.e().a);
             if (!PatchProxy.applyVoidTwoRefs(liveGiftBoxP, view, liveGiftBoxP, liveGiftBoxD, "6")) {
                ViewGroup viewGroup = view.findViewById(R.id.container_top_bar);
                obj = new c(liveGiftBoxP, new d(liveGiftBoxP), liveGiftBoxP.C, liveGiftBoxP.I);
                liveGiftBoxP.l = obj;
                a.o(viewGroup, "topBarContainer");
                liveGiftBoxP.y2(viewGroup, obj);
             }
          }else {
             liveGiftBoxP.K.e().a(liveGiftBoxP.K.e().b);
          }
          if (!PatchProxy.applyVoidTwoRefs(liveGiftBoxP, view, liveGiftBoxP, liveGiftBoxD, "8")) {
             View view1 = view.findViewById(0x7f0a092a);
             LiveGiftBoxBottomBarVC liveGiftBoxB = new LiveGiftBoxBottomBarVC(liveGiftBoxP.B, liveGiftBoxP.G, liveGiftBoxP.v, liveGiftBoxP.A.c(), liveGiftBoxP.A.b(), new c(liveGiftBoxP), liveGiftBoxP.J, this, liveGiftBoxP.K);
             liveGiftBoxP.n = v12;
             a.o(view1, "bottomContainer");
             liveGiftBoxP.y2(view1, v12);
          }
       }
       return;
    }
    public void J0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxDialogVC.class, "24")) {
          return;
       }
       this.C.J0(p0);
       Object obj = this.v.get();
       a.o(obj, "currentUser.get\(\)");
       if (obj.isLogined()) {
          if (p0 != null) {
             this.q.r4(p0, this.D2());
          }
       }else {
          p0 = a1.p(R.string.arg_RES_7f102d6e);
          a.o(p0, "CommonUtil.string\(R.stri¡­e_vip_grade_login_prompt\)");
          this.V2(p0, "live_gift_vip_grade", 196);
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxDialogVC.class, "3")) {
          return;
       }
       b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxDialogVC][onDestroy]");
       this.B.d().clear();
       this.B.b().clear();
       return;
    }
    public void M(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxDialogVC.class, "26")) {
          return;
       }
       a.p(p0, "count");
       m$a.a(this, p0);
       return;
    }
    public void O1(View p0){
       LiveGiftNumberSelectDialog liveGiftNumb;
       LiveGiftBoxDialogVC liveGiftBoxD = LiveGiftBoxDialogVC.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveGiftBoxD, "17")) {
          return;
       }
       a.p(p0, "view");
       this.C.O1(p0);
       LiveGiftBoxDialogVC tm = this.m;
       Object obj = null;
       a uoa = (tm != null)? tm.V2(): obj;
       if (uoa == null) {
          b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxDialogVC][onBatchClick]selectItem is null");
          return;
       }else if(uoa.b().a().a() != 1){
          Gift gift = uoa.b().b();
          if (gift == null) {
             b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxDialogVC][onBatchClick]gift is null");
             return;
          }else if(PatchProxy.applyVoidTwoRefs(p0, gift, this, liveGiftBoxD, "22")){
             Gift mMaxBatchCou = gift.mMaxBatchCount;
             f uof = new f(this, gift);
             if (PatchProxy.isSupport(LiveGiftNumberSelectDialog.class)) {
                liveGiftNumb = PatchProxy.applyTwoRefs(Integer.valueOf(mMaxBatchCou), uof, obj, LiveGiftNumberSelectDialog.class, "2");
                if (liveGiftNumb != PatchProxyResult.class) {
                label_0085 :
                   liveGiftNumb.v = p0;
                   liveGiftNumb.t = new e(this);
                   liveGiftNumb.show(this.r.b(), "showBatchCountDialog");
                }
             }
             liveGiftNumb = new LiveGiftNumberSelectDialog();
             liveGiftNumb.kh("maxBatchCount", mMaxBatchCou);
             liveGiftNumb.x = uof;
             goto label_0085 ;
          }
       }
       return;
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxDialogVC.class, "25")) {
          return;
       }
       this.C.P();
       return;
    }
    public final void V2(String p0,String p1,int p2){
       if (PatchProxy.isSupport(LiveGiftBoxDialogVC.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, LiveGiftBoxDialogVC.class, "21")) {
          return;
       }
       this.u.b(this.D2(), p1, p2, p0);
       return;
    }
    public final k W2(){
       return this.D;
    }
    public final c X2(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LiveGiftBoxDialogVC.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       c uoc = this.j.a();
       int i = this.A.f();
       LiveGiftBoxDialogVC tm = this.m;
       a uoa = (tm != null)? tm.V2(): objArray;
       LiveGiftBoxDialogVC tm1 = this.m;
       d uod = (tm1 != null)? tm1.W2(): objArray;
       LiveGiftBoxDialogVC tn = this.n;
       int i1 = (tn != null)? tn.V2(): 1;
       LiveGiftBoxDialogVC tm2 = this.m;
       if (tm2 != null) {
          String obj1 = PatchProxy.apply(objArray, tm2, LiveGiftPanelVC.class, "8");
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else {
             LiveGiftPanelVC j = tm2.j;
             Objects.requireNonNull(j);
             objArray = PatchProxy.apply(objArray, j, j.class, "8");
             if (objArray != patchProxyRe) {
             }else {
                objArray = new LinkedHashMap();
                Iterator iterator = j.l.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   obj1 = uEntry.getKey();
                   LiveGiftSortType liveGiftSort = uEntry.getValue().a();
                   if (liveGiftSort != null) {
                      objArray.put(obj1, liveGiftSort);
                   }
                }
             }
          }
       }
       c uoc1 = new c(uoc, i, uoa, uod, i1, objArray);
       return obj;
    }
    public void h2(){
       LiveGiftSortType liveGiftSort;
       String str3;
       Object obj = this;
       LiveGiftBoxDialogVC liveGiftBoxD = LiveGiftBoxDialogVC.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, liveGiftBoxD, "16")) {
          return;
       }
       obj.C.h2();
       LiveGiftBoxDialogVC m = obj.m;
       a uoa = (m != null)? m.V2(): objArray;
       if (uoa == null) {
          b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxDialogVC][onHandleClick]selectItem is null");
          return;
       }else if(uoa.b().a().a() != 1){
          String str = uoa.d();
          c uoc = uoa.b();
          if (!PatchProxy.applyVoidTwoRefs(str, uoc, obj, liveGiftBoxD, "23")) {
             Gift gift = uoc.b();
             Object obj1 = obj.j.a();
             if (gift == null || obj1 == null) {
                b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxDialogVC][onSendGiftClick]selectGift"+gift+",receiver"+obj1);
             }else {
                c uoc1 = this.X2();
                HashMap hashMap = new HashMap();
                a uoa1 = uoc1.c();
                int i = 0;
                int i1 = (uoa1 != null)? uoa1.c(): 0;
                hashMap.put("pager_index", Integer.valueOf(i1));
                uoa1 = uoc1.c();
                if (uoa1 != null) {
                   i = uoa1.a();
                }
                hashMap.put("gift_index", Integer.valueOf(i));
                Map map = uoc1.f();
                if (map != null) {
                   liveGiftSort = map.get(str);
                   if (liveGiftSort != null) {
                   label_00a0 :
                      hashMap.put("gift_host_tab_sort_type", liveGiftSort);
                      LiveGiftBoxDialogVC f = obj.F;
                      LiveGiftBoxDialogVC n = obj.n;
                      i = (n != null)? n.V2(): 1;
                      String str1 = uoc.c();
                      String str2 = uoc.e();
                      d uod = uoc1.d();
                      if (uod != null) {
                         uod = uod.b();
                         if (uod != null) {
                            str3 = uod.a();
                            if (str3 != null) {
                            label_00d2 :
                               LiveSendGiftBaseTraceInfo liveSendGift = obj.z.o6();
                               a.o(liveSendGift, "sendGiftTracer.generateTraceInfo\(\)");
                               LiveSendGiftBaseTraceInfo liveSendGift1 = i.a(liveSendGift, uoc1);
                               Object obj2 = obj.y.get();
                               a.o(obj2, "liveModel.get\(\)");
                               int i2 = obj2.intValue();
                               b uob = new b(gift, i, str1, false, str2, obj1, str3, false, null, "LIVE_ROOM_EXPAND_GIFT_DIALOG_SEND_GIFT", liveSendGift1, 4, uoc1.e(), hashMap, i2, null, 0x8180, null);
                               LiveGiftSendModel.g(f, v11, null, 2, null);
                            }
                         }
                      }
                      str3 = "NormalGift";
                      goto label_00d2 ;
                   }
                }
                liveGiftSort = LiveGiftSortType.DEFAULT;
                goto label_00a0 ;
             }
          }
       }
       return;
    }
    public void p1(Integer p0,int p1){
       LiveGiftBoxDialogVC liveGiftBoxD = LiveGiftBoxDialogVC.class;
       if (PatchProxy.isSupport(liveGiftBoxD) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, liveGiftBoxD, "20")) {
          return;
       }
       this.C.p1(p0, p1);
       return;
    }
    public void u0(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxDialogVC.class, "19")) {
          return;
       }
       this.C.u0();
       LiveGiftRechargeManager obj = this.v.get();
       a.o(obj, "currentUser.get\(\)");
       if (obj.isLogined()) {
          obj = this.H.get();
          obj.a("LIVE_LITE_ROOM_SEND_GIFT", new a(obj.e.e(), obj.e));
       }else {
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          String str = uoc.a().getString(R.string.arg_RES_7f10307a);
          a.o(str, "AppEnv.get\(\).appContext.¡­gin_prompt_live_recharge\)");
          this.V2(str, "lite_live_gift_recharge", 43);
       }
       return;
    }
}
