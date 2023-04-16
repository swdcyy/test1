package com.kuaishou.live.core.voiceparty.playway.ktv.KtvMicSeatViewController;
import zu2.e;
import com.kuaishou.live.viewcontroller.ViewController;
import ss2.e;
import msd.t;
import ss2.h;
import hf3.a;
import ku2.b;
import ru2.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.playway.ktv.KtvMicSeatViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.playway.ktv.KtvMicSeatViewController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.playway.ktv.KtvMicSeatViewController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import nu2.a;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.playway.ktv.KtvMicSeatViewController$viewModelDelegate$$inlined$viewModels$2;
import android.animation.Animator;
import java.util.Objects;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.animation.PropertyValuesHolder;
import lnc.a1;
import qt2.b;
import android.animation.ObjectAnimator;
import com.kuaishou.live.basic.widget.LiveUserView;
import android.view.ViewGroup;
import us2.d;
import android.content.Context;
import ts2.f;
import ts2.h;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.FixLinearLayoutManager;
import nsd.u;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$l;
import k17.b;
import java.lang.Integer;
import java.lang.Number;
import yx2.j;
import androidx.recyclerview.widget.RecyclerView$n;
import rs2.c;
import android.app.Activity;
import us2.a;
import androidx.lifecycle.LiveData;
import us2.b;
import androidx.lifecycle.LifecycleOwner;
import brd.t;
import java.lang.Iterable;
import java.util.Iterator;
import mu2.m;
import mu2.i;
import android.view.View$OnClickListener;
import android.widget.TextView;
import mu2.j;
import android.widget.ImageView;
import mu2.k;
import mu2.l;
import androidx.lifecycle.Observer;
import xh3.l;
import com.kuaishou.live.core.voiceparty.playway.ktv.view.binding.KtvViewDataBinding$bind$5;
import msd.l;
import xh3.a;
import com.kuaishou.live.core.voiceparty.playway.ktv.view.binding.KtvViewDataBinding$bind$6;
import xh3.g;
import xh3.h;
import z0.a;
import androidx.lifecycle.Transformations;
import xh3.j;
import mu2.a;
import mu2.b;
import com.kuaishou.live.core.voiceparty.playway.ktv.view.binding.KtvViewDataBinding$bind$9;
import xh3.f;
import xh3.d;
import xh3.e;
import com.airbnb.lottie.LottieAnimationView;
import mu2.c;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.core.voiceparty.playway.ktv.view.binding.KtvViewDataBinding$bind$11;
import androidx.lifecycle.LifecycleObserver;
import mu2.d;
import mu2.e;
import mu2.f;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import mu2.g;
import mu2.h;
import com.kuaishou.live.core.voiceparty.emoji.play.VoicePartyEmojiPlayInfo;
import ss2.f;
import com.kwai.framework.model.user.UserInfo;
import qrd.p;

public final class KtvMicSeatViewController extends ViewController implements e	// class@00185f
{
    public final p j;
    public h k;
    public LiveUserView l;
    public ViewGroup m;
    public final e n;
    public final t o;
    public final h p;
    public final a q;
    public final b r;
    public final a s;
    public final boolean t;

    public void KtvMicSeatViewController(e p0,t p1,h p2,a p3,b p4,a p5,boolean p6){
       a.p(p0, "micSeatDataManager");
       a.p(p1, "micSeatPendantsFactory");
       a.p(p2, "micSeatLongConnection");
       a.p(p3, "liveLongConnection");
       a.p(p4, "ktvActionDelegate");
       a.p(p5, "micSeatActionDelegate");
       super();
       this.n = p0;
       this.o = p1;
       this.p = p2;
       this.q = p3;
       this.r = p4;
       this.s = p5;
       this.t = p6;
       this.j = new ViewModelLazy(m0.d(a.class), new KtvMicSeatViewController$viewModelDelegate$$inlined$viewModels$2(new KtvMicSeatViewController$viewModelDelegate$$inlined$viewModels$1(this)), new KtvMicSeatViewController$$special$$inlined$viewModelDelegate$1(new KtvMicSeatViewController$viewModel$2(this)));
    }
    public static Animator V2(KtvMicSeatViewController p0,a p1,int p2,Object p3){
       Objects.requireNonNull(p0);
       ObjectAnimator objectAnimat = PatchProxy.applyOneRefs(null, p0, KtvMicSeatViewController.class, "6");
       if (objectAnimat != PatchProxyResult.class) {
       }else {
          PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{b.f((float)a1.e(0x41f00000), 0),b.a()};
          objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0.P2(), propertyValu);
          a.o(objectAnimat, "ObjectAnimator.ofPropert¡­l.inAlphaProperty\(\)\n    \)");
          objectAnimat.setDuration(80);
       }
       return objectAnimat;
    }
    public void F2(){
       c uoc;
       KtvViewDataBinding$bind$6 this;
       LiveUserView liveUserView = this;
       KtvMicSeatViewController ktvMicSeatVi = KtvMicSeatViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, liveUserView, ktvMicSeatVi, "2")) {
          return;
       }
       liveUserView.Q2(R.layout.arg_RES_7f0d0e52);
       liveUserView.l = liveUserView.A2(0x7f0a037c);
       liveUserView.m = liveUserView.A2(0x7f0a2783);
       d uod = new d(this.D2(), liveUserView.n);
       Iterator obj = PatchProxy.applyOneRefs(uod, liveUserView, ktvMicSeatVi, "3");
       int i = 0;
       if (obj != PatchProxyResult.class) {
          uoc = obj;
       }else {
          RecyclerView recyclerView = liveUserView.A2(R.id.mic_seats_view);
          FixLinearLayoutManager uFixLinearLa = new FixLinearLayoutManager(this.D2(), a1.d(0x7f07031d), a1.d(0x7f07032a), 0, 8, null);
          recyclerView.setLayoutManager(v1);
          recyclerView.setItemAnimator(objArray);
          recyclerView.addItemDecoration(new b(i, j.a(recyclerView, Integer.valueOf(6))));
          uoc = new c(liveUserView, this.B2(), b.a(uod), recyclerView);
       }
       liveUserView.k = uoc;
       ktvMicSeatVi = liveUserView.o;
       KtvMicSeatViewController n = liveUserView.n;
       if (uoc == null) {
          a.S("micSeatViewManager");
       }
       t ot = t.empty();
       a.o(ot, "Observable.empty\(\)");
       obj = ktvMicSeatVi.invoke(this, n, uod, uoc, ot, this).iterator();
       while (obj.hasNext()) {
          liveUserView.z2(obj.next());
       }
       m om = new m(this.P2(), liveUserView.t, liveUserView.r, liveUserView.s);
       a uoa = this.W2();
       if (!PatchProxy.applyVoidTwoRefs(liveUserView, uoa, om, m.class, "1")) {
          a.p(liveUserView, "lifecycleOwner");
          a.p(uoa, "viewModel");
          om.a.setOnClickListener(new i(om));
          om.b.setOnClickListener(new j(uoa));
          om.c.setOnClickListener(new k(uoa));
          uoa.g.observe(liveUserView, new l(om));
          l.e(om.d, this, uoa.w0(), false, 4, null);
          a.a(om.d, liveUserView, uoa.w0(), KtvViewDataBinding$bind$5.INSTANCE);
          m e = om.e;
          LiveData liveData = uoa.w0();
          this = KtvViewDataBinding$bind$6.INSTANCE;
          KtvViewDataBinding$bind$6 uobind$6 = this;
          KtvViewDataBinding$bind$6 uobind$61 = this;
          String str = "liveData";
          if (!PatchProxy.applyVoidFourRefs(e, this, liveData, uobind$6, null, g.class, "4")) {
             a.p(e, "$this$bindTextRes");
             a.p(liveUserView, "lifecycleOwner");
             a.p(liveData, str);
             a.p(uobind$61, "map");
             LiveData liveData2 = Transformations.map(liveData, new h(uobind$61));
             a.o(liveData2, "crossinline transform: \(¡­p\(this\) { transform\(it\) }");
             liveData2.observe(liveUserView, new j(e));
          }
          LiveData liveData1 = Transformations.map(uoa.w0(), new a());
          a.h(liveData1, "Transformations.map\(this\) { transform\(it\) }");
          String str1 = str;
          l.e(om.e, this, liveData1, false, 4, false);
          g.a(om.c, liveUserView, uoa.f);
          liveData1 = Transformations.map(uoa.w0(), new b(om));
          a.h(liveData1, "Transformations.map\(this\) { transform\(it\) }");
          l.e(om.c, this, liveData1, false, 4, null);
          m f = om.f;
          LiveData this1 = uoa.w0();
          KtvViewDataBinding$bind$9 iNSTANCE = KtvViewDataBinding$bind$9.INSTANCE;
          int i1 = 4;
          int i2 = -1;
          f uof = f.class;
          if (PatchProxy.isSupport(uof)) {
             Object[] objArray1 = new Object[]{f,liveUserView,this1,Integer.valueOf(i2),iNSTANCE};
             if (PatchProxy.applyVoid(objArray1, null, uof, "2")) {
             label_01fe :
                l.e(om.f, this, uoa.w0(), false, 4, null);
                uoa.w0().observe(liveUserView, super(om));
                this.getLifecycle().addObserver(new KtvViewDataBinding$bind$11(om));
                uoa.u0().observe(liveUserView, new d(om));
                om.a.setOnClickListener(new e(om));
                uoa.j.observe(liveUserView, new f(om));
                uoa.k.observe(liveUserView, new g(om));
                uoa.l.observe(liveUserView, new h(om));
             }
          }
          a.p(f, "$this$bindAnimationFromUrl");
          a.p(liveUserView, "lifecycleOwner");
          a.p(this1, str1);
          a.p(iNSTANCE, "map");
          this1 = Transformations.map(this1, new d(iNSTANCE));
          a.h(this1, "Transformations.map\(this\) { transform\(it\) }");
          this1.observe(liveUserView, new e(f, i2));
          goto label_01fe ;
       }
       return;
    }
    public View Q1(VoicePartyEmojiPlayInfo p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       VoicePartyEmojiPlayInfo obj = PatchProxy.applyOneRefs(p0, this, KtvMicSeatViewController.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "playInfo");
       View view = null;
       if (!p0.isGuestEmoji() || p0.mFromMicSeatID == p0.mToMicSeatID) {
          return view;
       }
       obj = p0.mSenderUID;
       a uoa = this.W2();
       Objects.requireNonNull(uoa);
       View view1 = PatchProxy.apply(view, uoa, a.class, "1");
       if (view1 != patchProxyRe) {
       }else {
          f value = uoa.d.getValue();
          if (value != null) {
             UserInfo userInfo = value.c();
             if (userInfo != null) {
                view = userInfo.mId;
             }
          }
          view1 = view;
       }
       if (a.g(obj, view1)) {
          KtvMicSeatViewController tl = this.l;
          if (tl == null) {
             a.S("avatarView");
          }
          return tl;
       }else {
          KtvMicSeatViewController tk = this.k;
          if (tk == null) {
             a.S("micSeatViewManager");
          }
          return tk.b(p0.mFromMicSeatID);
       }
    }
    public ViewGroup W0(){
       KtvMicSeatViewController obj = PatchProxy.apply(null, this, KtvMicSeatViewController.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m;
       if (obj == null) {
          a.S("emojiContainer");
       }
       return obj;
    }
    public final a W2(){
       Object obj = PatchProxy.apply(null, this, KtvMicSeatViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
