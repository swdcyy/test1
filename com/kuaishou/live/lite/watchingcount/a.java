package com.kuaishou.live.lite.watchingcount.a;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService;
import wy1.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import o56.a;
import w51.a;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import ha1.b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$b;
import xd3.c;
import android.widget.TextView;
import java.util.Objects;
import wy1.v;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCFeedPush;
import lf3.g;
import hf3.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveWatchingList;
import wy1.k;
import ec3.f;
import msd.a;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import mq5.h;
import mq5.b;
import ds5.c;
import ds5.a;
import sj3.b;
import sj3.l;
import com.kuaishou.livestream.message.nano.LiveStreamActivityMessages$SCActivityLiveInfo;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import wy1.c;
import erd.g;
import crd.b;
import o83.i;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import crd.a;
import com.kuaishou.live.common.core.component.watchingcount.updater.a;
import e93.f;
import lnc.b9;

public final class a extends ViewController	// class@000bb1
{
    public final LiveLiteAnchorInfoAreaService j;
    public final e k;
    public final int l;

    public void a(LiveLiteAnchorInfoAreaService p0,e p1,int p2){
       a.p(p0, "anchorInfoAreaService");
       a.p(p1, "watchingCountController");
       super();
       this.j = p0;
       this.k = p1;
       this.l = p2;
    }
    public void F2(){
       v k;
       a uoa = a.class;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, uoa, str)) {
          return;
       }
       if (a.d() && a.L()) {
          return;
       }
       View view = b.d(new FrameLayout(this.D2()), this.l, false);
       a.o(view, "rootView");
       c uoc = PatchProxy.applyOneRefs(view, this, uoa, "5");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c(view);
       }
       this.j.b(uoc);
       TextView textView = view.findViewById(R.id.lite_watching_count_view);
       a tk = this.k;
       Objects.requireNonNull(tk);
       e uoe = e.class;
       if (!PatchProxy.applyVoid(objArray, tk, uoe, "3")) {
          v ov = v.class;
          if (!PatchProxy.applyVoid(objArray, tk, ov, str)) {
             if (!PatchProxy.applyVoid(objArray, tk, ov, "4")) {
                k = tk.d;
                if (k != null) {
                   k.u0(310, LiveStreamMessages$SCFeedPush.class, tk.w);
                   tk.d.u0(340, LiveStreamMessages$SCLiveWatchingList.class, tk.x);
                }
             }
             if (a.L()) {
                k = tk.k;
                if (k != null) {
                   k.setVisibility(8);
                }
             }
             k ok = new k(tk);
             if (f.h()) {
                tk.i.E4("LiveWatchingCountController::updateInfoToExceptionClues", ok);
             }else {
                ok.invoke();
             }
          }
          tk.C.Km(tk.G);
          tk.B.gd(tk.I);
          tk.A.b(tk.H);
          if (!PatchProxy.applyVoid(objArray, tk, uoe, "12") && tk.f() == 2) {
             tk.d.u0(596, LiveStreamActivityMessages$SCActivityLiveInfo.class, tk.J);
          }
          LiveStreamFeedWrapper mEntity = tk.h.mEntity;
          if (mEntity != null) {
             LiveStreamFeed mLiveStreamM = mEntity.mLiveStreamModel;
             if (mLiveStreamM != null) {
                mLiveStreamM.startSyncWithFragment(tk.c.m());
             }
          }
          if (!PatchProxy.applyVoid(objArray, tk, uoe, "10") && tk.F == null) {
             tk.F = RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new c(tk));
          }
          tk.m();
       }
       this.k.k = textView;
       if (i.a()) {
          ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = a1.e(0x41f00000);
          }
          textView.setTextSize(1, 12.00f);
       }
       return;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "4")) {
          return;
       }
       a tk = this.k;
       Objects.requireNonNull(tk);
       e uoe = e.class;
       if (!PatchProxy.applyVoid(objArray, tk, uoe, "5")) {
          if (!PatchProxy.applyVoid(objArray, tk, v.class, "3")) {
             tk.u.d();
             tk.n();
             tk.d.o(310, tk.w);
             tk.d.o(340, tk.x);
             tk.k();
             tk.g().reset();
             f.g(tk.b);
          }
          if (!PatchProxy.applyVoid(objArray, tk, uoe, "11")) {
             b9.a(tk.F);
             tk.F = objArray;
          }
          tk.C.le(tk.G);
          tk.B.fo(tk.I);
          tk.A.c(tk.H);
          f.g(tk.D);
          tk.d.o(596, tk.J);
       }
       return;
    }
    public void K2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "3")) {
          return;
       }
       a tk = this.k;
       Objects.requireNonNull(tk);
       if (!PatchProxy.applyVoid(objArray, tk, v.class, "2")) {
          tk.n();
          if (!PatchProxy.applyVoid(objArray, tk, v.class, "17")) {
             LiveStreamFeedWrapper mEntity = tk.h.mEntity;
             if (mEntity != null) {
                LiveStreamFeed mLiveStreamM = mEntity.mLiveStreamModel;
                if (mLiveStreamM != null) {
                   mLiveStreamM.fireSync();
                }
             }
          }
          tk.t = false;
       }
       return;
    }
    public void L2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "2")) {
          return;
       }
       a tk = this.k;
       Objects.requireNonNull(tk);
       if (!PatchProxy.applyVoid(objArray, tk, e.class, "4")) {
          tk.t = true;
          tk.q();
       }
       return;
    }
}
