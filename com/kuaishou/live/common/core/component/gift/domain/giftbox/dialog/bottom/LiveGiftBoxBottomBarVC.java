package com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bottom.LiveGiftBoxBottomBarVC;
import com.kuaishou.live.viewcontroller.ViewController;
import ih1.f;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bottom.LiveGiftBoxPaymentManager;
import z1.k;
import ui1.o;
import java.util.List;
import ui1.m;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bottom.LiveGiftBoxBottomBarVC$viewModel$2;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bottom.LiveGiftBoxBottomBarVC$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import ui1.n;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bottom.LiveGiftBoxBottomBarVC$$special$$inlined$viewModels$2;
import msd.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bottom.LiveGiftBoxBottomBarVC$a;
import com.kwai.robust.PatchProxy;
import ui1.l;
import android.view.View;
import ui1.c;
import android.view.View$OnClickListener;
import ekd.m1;
import com.kuaishou.live.core.show.gift.LiveGiftResourcePathConstant;
import com.yxcorp.gifshow.image.KwaiImageView;
import l12.d;
import va1.f0;
import ui1.d;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import ekd.d0;
import android.widget.TextView;
import ui1.e;
import ui1.f;
import lnc.a1;
import ui1.g;
import ui1.h;
import ui1.i;
import ui1.j;
import ui1.k;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGradientRotateButton;
import ui1.a;
import ui1.b;
import tl1.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import qrd.p;
import ui1.n$a$e;
import ui1.n$a;
import ui1.n$a$b;
import java.lang.Boolean;
import ui1.n$a$c;
import ul1.a;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveGiftBoxBottomBarVC extends ViewController	// class@0011fd
{
    public final p j;
    public final LiveGiftBoxBottomBarVC$a k;
    public final f l;
    public final LiveGiftBoxPaymentManager m;
    public final k n;
    public int o;
    public final int p;
    public final o q;
    public final List r;
    public final m s;
    public final LiveGiftBoxConfig t;

    public void LiveGiftBoxBottomBarVC(f p0,LiveGiftBoxPaymentManager p1,k p2,int p3,int p4,o p5,List p6,m p7,LiveGiftBoxConfig p8){
       a.p(p0, "giftBoxRepo");
       a.p(p1, "paymentManager");
       a.p(p2, "currentUser");
       a.p(p5, "dependency");
       a.p(p6, "handleButtonVisibleInterceptors");
       a.p(p7, "listener");
       a.p(p8, "giftBoxConfig");
       super();
       this.l = p0;
       this.m = p1;
       this.n = p2;
       this.o = p3;
       this.p = p4;
       this.q = p5;
       this.r = p6;
       this.s = p7;
       this.t = p8;
       this.j = new ViewModelLazy(m0.d(n.class), new LiveGiftBoxBottomBarVC$$special$$inlined$viewModels$2(new LiveGiftBoxBottomBarVC$$special$$inlined$viewModels$1(this)), new LiveGiftBoxBottomBarVC$viewModel$2(this));
       this.k = new LiveGiftBoxBottomBarVC$a(this);
    }
    public void F2(){
       LiveGiftBoxBottomBarVC liveGiftBoxB = LiveGiftBoxBottomBarVC.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveGiftBoxB, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0b1b);
       l ol = new l(this.P2(), this.s, this.t);
       n on = this.W2();
       if (!PatchProxy.applyVoidTwoRefs(this, on, ol, l.class, "1")) {
          a.p(this, "lifecycleOwner");
          a.p(on, "viewModel");
          ol.l.D0();
          m1.a(ol.a, new c(on), R.id.layout_recharge);
          f0.a(ol.b, LiveGiftResourcePathConstant.LIVE_GIFT_KCOIN_NORMAL_NEW);
          on.a.observe(this, new d(ol));
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          ol.d.setTypeface(d0.a("alte-din.ttf", uoc.a()));
          on.b.observe(this, new e(ol));
          on.c.observe(this, new f(ol));
          ol.e.setTextColor(a1.a(R.color.arg_RES_7f060751));
          on.e.observe(this, new g(ol));
          on.d.observe(this, new h(ol));
          m1.a(ol.h, new i(ol, on), R.id.layout_gift_number);
          on.g.observe(this, new j(ol));
          on.u0().observe(this, new k(ol));
          ol.g.setEffectDisabled(true);
          m1.a(ol.g, new a(on), R.id.btn_handle);
          on.h.observe(this, new b(ol));
       }
       if (!PatchProxy.applyVoid(objArray, this, liveGiftBoxB, "5")) {
          this.q.c(this.k);
       }
       return;
    }
    public void J2(){
       LiveGiftBoxBottomBarVC liveGiftBoxB = LiveGiftBoxBottomBarVC.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveGiftBoxB, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, liveGiftBoxB, "6")) {
          this.q.d(this.k);
       }
       return;
    }
    public void M2(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxBottomBarVC.class, "3")) {
          return;
       }
       this.m.a();
       return;
    }
    public final int V2(){
       Integer obj = PatchProxy.apply(null, this, LiveGiftBoxBottomBarVC.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.W2().u0().getValue();
       int i = (obj != null)? obj.intValue(): 1;
       return i;
    }
    public final n W2(){
       Object obj = PatchProxy.apply(null, this, LiveGiftBoxBottomBarVC.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
    public final void X2(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxBottomBarVC.class, "11")) {
          return;
       }
       this.W2().v0(new n$a$e(false));
       return;
    }
    public final void Y2(int p0){
       LiveGiftBoxBottomBarVC liveGiftBoxB = LiveGiftBoxBottomBarVC.class;
       if (PatchProxy.isSupport(liveGiftBoxB) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveGiftBoxB, "8")) {
          return;
       }
       this.W2().v0(new n$a$b(p0));
       return;
    }
    public final void Z2(boolean p0){
       LiveGiftBoxBottomBarVC liveGiftBoxB = LiveGiftBoxBottomBarVC.class;
       if (PatchProxy.isSupport(liveGiftBoxB) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveGiftBoxB, "7")) {
          return;
       }
       this.W2().v0(new n$a$c(p0));
       return;
    }
    public final void a3(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxBottomBarVC.class, "10")) {
          return;
       }
       if (this.q.a() == null) {
          b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxBottomBarVC][showHandleButton]giftInfo is null");
          return;
       }else {
          this.W2().v0(new n$a$e(true));
          return;
       }
    }
}
