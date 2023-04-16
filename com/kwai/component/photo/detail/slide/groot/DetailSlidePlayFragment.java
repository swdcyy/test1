package com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import dd5.k;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import ed5.a;
import dd5.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import dd5.m;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import java.util.HashMap;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayActivity;
import az6.a;
import android.os.SystemClock;
import rh5.a;
import rh5.b;
import java.lang.Boolean;
import zv6.t;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import dd5.p;
import dd5.b$b;
import dd5.b;
import hd5.d;
import ed5.e;
import java.util.Objects;
import com.kwai.slide.play.detail.dispatcher.slide.SlideDispatchAssist;
import java.lang.Long;
import jh5.a;
import ih5.a0;
import ih5.a0$a;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import dw6.b;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import android.app.Activity;
import ih5.o;
import eh5.j;
import ih5.k;
import eh5.l;
import ih5.b;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import java.lang.Integer;
import nw6.f;
import cw6.b;
import zv6.t$a;
import com.kwai.component.taskdispatcher.slide.SlideDispatchHelper;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import java.lang.StringBuilder;
import xf6.d;
import com.kwai.component.taskdispatcher.slide.strategy.SlideTaskDispatcher;
import ih5.g;
import ih5.c0;

public abstract class DetailSlidePlayFragment extends GrootBaseFragment implements k	// class@000a54
{
    public final e A;
    public int B;
    public int C;
    public SlideDispatchAssist D;
    public boolean E;
    public PhotoDetailParam x;
    public SlidePlayViewModel y;
    public m z;

    public void DetailSlidePlayFragment(){
       super();
       this.A = new a();
       this.E = false;
    }
    public boolean D5(){
       return j.a(this);
    }
    public void I(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DetailSlidePlayFragment.class, "9")) {
          return;
       }
       DetailSlidePlayFragment ty = this.y;
       int i = (ty != null)? ty.e1(): 0;
       this.B = i;
       if (i > 1) {
          this.C = this.C + 1;
          this.z.o();
          ty = this.z;
          HashMap hashMap = PatchProxy.apply(objArray, this, DetailSlidePlayFragment.class, "11");
          if (hashMap != PatchProxyResult.class) {
          }else {
             hashMap = new HashMap();
             DetailSlidePlayFragment tx = this.x;
             if (tx != null) {
                hashMap.put("bizType", String.valueOf(tx.getBizType()));
                PhotoDetailParam mPhoto = this.x.mPhoto;
                if (mPhoto != null) {
                   hashMap.put("photoType", String.valueOf(mPhoto.getType()));
                   hashMap.put("photoId", String.valueOf(this.x.mPhoto.getPhotoId()));
                }
             }
             hashMap.put("useCount", String.valueOf(this.C));
             hashMap.put("page", this.o());
          }
          ty.b(hashMap);
          this.z.n(this.o());
          this.z.q("becomesAttachedOnPageSelected");
          this.vh("scroll", 1);
       }
       super.I();
       if (this.B > 1) {
          this.z.e("becomesAttachedOnPageSelected");
       }
       if (this.getActivity() instanceof SlidePlayActivity) {
          this.getActivity().w3(this.x);
       }
       return;
    }
    public void a0(){
       if (PatchProxy.applyVoid(null, this, DetailSlidePlayFragment.class, "10")) {
          return;
       }
       long l = SystemClock.currentThreadTimeMillis();
       super.a0();
       this.vh("scroll", false);
       if (this.B > 1) {
          this.z.c();
       }
       a uoa = new a();
       uoa.mFunctionName = "DetailSlidePlayFragment - performViewItemDidAppear";
       uoa.mContainer = "DetailSlidePlayFragment";
       uoa.mStartTime = l;
       uoa.mEndTime = SystemClock.currentThreadTimeMillis();
       b.b("FEATURED_PAGE").a(uoa);
       return;
    }
    public boolean fh(){
       DetailSlidePlayFragment obj = PatchProxy.apply(null, this, DetailSlidePlayFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.y;
       boolean b = true;
       if (obj == null) {
          return b;
       }
       GrootBaseFragment tt = this.t;
       if (tt == -1) {
          if (obj.t() != this) {
             b = false;
          }
          return b;
       }else if(tt == obj.j()){
          b = false;
       }
       return b;
    }
    public boolean jh(){
       DetailSlidePlayFragment obj = PatchProxy.apply(null, this, DetailSlidePlayFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.x;
       boolean b = (obj != null && obj.enableSlidePlay())? true: false;
       return b;
    }
    public boolean kh(){
       DetailSlidePlayFragment obj = PatchProxy.apply(null, this, DetailSlidePlayFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.x;
       boolean b = (obj != null && obj.isThanos())? true: false;
       return b;
    }
    public void mh(){
       if (PatchProxy.applyVoid(null, this, DetailSlidePlayFragment.class, "14")) {
          return;
       }
       this.y.t1().k(this);
       return;
    }
    public void nh(){
       if (PatchProxy.applyVoid(null, this, DetailSlidePlayFragment.class, "12")) {
          return;
       }
       this.y.t1().o(this, "DetailSlidePlayFragment.AttachListenersTag");
       return;
    }
    public void oh(){
       if (PatchProxy.applyVoid(null, this, DetailSlidePlayFragment.class, "13")) {
          return;
       }
       this.y.t1().s(this, "DetailSlidePlayFragment.DetachListenersTag");
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailSlidePlayFragment.class, "7")) {
          return;
       }
       super.onActivityCreated(p0);
       this.y.t1().d(this);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailSlidePlayFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.y = SlidePlayViewModel.S0(this.getParentFragment());
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       SlideDispatchAssist this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       m obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, DetailSlidePlayFragment.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = p.b(this.getParentFragment());
       this.z = obj;
       b$b uob = new b$b();
       uob.b(false);
       obj.j(uob.a(), this);
       this.z.m(true);
       this.A.b().start();
       DetailSlidePlayFragment tD = this.D;
       if (tD != null) {
          long l = SystemClock.elapsedRealtime();
          Objects.requireNonNull(tD);
          this = SlideDispatchAssist.class;
          if (!PatchProxy.isSupport(this) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), tD, this, "14")) {
             tD.f.c = l;
          }
          a0 uoa0 = a0.class;
          a0$a obj1 = PatchProxy.applyOneRefs(this, null, uoa0, "1");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = a0.e;
             Objects.requireNonNull(obj1);
             obj1 = PatchProxy.applyOneRefs(this, obj1, a0$a.class, "1");
             if (obj1 != patchProxyRe) {
             }else {
                a.p(this, "fragment");
                ViewModel viewModel = ViewModelProviders.of(this).get(uoa0);
                a.o(viewModel, "ViewModelProviders.of\(fr¡­tageRecorder::class.java\)");
                obj1 = viewModel;
             }
          }
          long l1 = -1;
          obj1.a = l1;
          obj1.b = l1;
          obj1.c = l1;
          obj1.d = l1;
       }
       if (this.ch() != null) {
          this.x = this.ch().d("KEY_PHOTO_DETAIL_PARAM");
       }
       if (p1 instanceof KwaiGrootViewPager) {
          this.k = p1;
       }
       if (this.jh() && this.k == null) {
          this.k = this.getActivity().findViewById(0x7f0a111a);
       }
       if (this.jh() && (this.k == null && !this.getActivity().isFinishing())) {
          this.getActivity().finish();
       }
    label_00f0 :
       return super.onCreateView(p0, p1, p2);
    }
    public void onDestroyView(){
       Object obj = this;
       SlideDispatchAssist slideDispatc = SlideDispatchAssist.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, DetailSlidePlayFragment.class, "8")) {
          return;
       }
       DetailSlidePlayFragment d = obj.D;
       if (d != null) {
          Objects.requireNonNull(d);
          if (PatchProxy.applyVoid(objArray, d, slideDispatc, "7") || (d.f.d() && d.m())) {
             SlideDispatchAssist.l(d, d.f.a(), o.a, false, 4, null);
             d.f(d.f.a());
             d.g(d.f.a(), k.a, true, true);
          }
       }
       super.onDestroyView();
       d = obj.D;
       if (d != null) {
          Objects.requireNonNull(d);
          if (PatchProxy.applyVoid(objArray, d, slideDispatc, "8") || (!d.f.d() || (!d.m() && d.n()))) {
             DetailSlidePlayFragment uDetailSlide = d;
             SlideDispatchAssist.l(uDetailSlide, d.f.a(), o.a, false, 4, null);
             d.f(d.f.a());
             uDetailSlide.g(d.f.a(), b.a, true, true);
          }
       }
    label_00a4 :
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DetailSlidePlayFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.A.b().a();
       return;
    }
    public void ph(){
       if (PatchProxy.applyVoid(null, this, DetailSlidePlayFragment.class, "15")) {
          return;
       }
       this.y.t1().v(this);
       return;
    }
    public e qe(){
       return this.A;
    }
    public void qh(){
       if (PatchProxy.applyVoid(null, this, DetailSlidePlayFragment.class, "6")) {
          return;
       }
       this.t = -1;
       if (this.ch() != null) {
          this.t = this.ch().c;
       }
       if (this.jh()) {
          GrootBaseFragment tk = this.k;
          if (tk != null && this.t == tk.getCurrentItem()) {
             if (this.sh() != null) {
                this.uh();
             }
             t ot = this.y.t1();
             GrootBaseFragment tt = this.t;
             Objects.requireNonNull(ot);
             t ot1 = t.class;
             if (!PatchProxy.isSupport(ot1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(tt), ot, ot1, "46")) {
                ot = ot.g;
                if (ot != null) {
                   f b = ot.b;
                   if (b != null) {
                      b.r0(tt, false);
                      b.q0(tt, false);
                      b.r0(tt, true);
                      b.q0(tt, true);
                   }
                }
             }
             this.y.t1().h();
             this.y.t1().g();
          }
       }else {
          this.I();
          this.a0();
       }
       return;
    }
    public final PhotoDetailParam rh(){
       return this.x;
    }
    public a sh(){
       Object[] objArray = null;
       DetailSlidePlayFragment obj = PatchProxy.apply(objArray, this, DetailSlidePlayFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.D;
       if (obj != null) {
          objArray = obj.f;
       }
       return objArray;
    }
    public SlideDispatchAssist th(SlidePlayViewModel p0){
       a obj3;
       boolean b1;
       Object obj = this;
       t obj1 = p0;
       t$a uoa = t$a.class;
       t ot = t.class;
       c0 obj2 = PatchProxy.applyOneRefs(obj1, obj, DetailSlidePlayFragment.class, "3");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       obj2 = null;
       if (obj1 != null) {
          t ot1 = p0.t1();
          long l = SystemClock.elapsedRealtime();
          Objects.requireNonNull(ot1);
          if (PatchProxy.isSupport(ot)) {
             obj3 = PatchProxy.applyTwoRefs(obj, Long.valueOf(l), ot1, ot, "53");
             if (obj3 != PatchProxyResult.class) {
             }else {
             label_003b :
                ot1 = ot1.f;
                if (ot1 != null) {
                   if (PatchProxy.isSupport(uoa)) {
                      obj3 = PatchProxy.applyTwoRefs(obj, Long.valueOf(l), ot1, uoa, "1");
                      if (obj3 != PatchProxyResult.class) {
                      }
                   }
                   t$a a = ot1.a;
                   boolean b = SlideDispatchHelper.f();
                   obj3 = PatchProxy.apply(obj2, obj2, SlideDispatchHelper.class, "10");
                   if (obj3 != PatchProxyResult.class) {
                      b1 = obj3.booleanValue();
                   }else {
                      Object[] objArray = new Object[0];
                      DispatchLogger.d.w("DispatchStrategyUtil", "sEnableDispatchPresenterGroup-> "+SlideDispatchHelper.k(), objArray);
                      b1 = 1;
                      boolean b2 = (!SlideDispatchHelper.k() || (d.A() == -1 || d.A() == b1))? true: false;
                      b1 = b2;
                   }
                   obj3 = new a(a, l, b, b1, SlideDispatchHelper.d());
                   ot1.c.put(obj, new g(v14));
                   obj3 = v14;
                }else {
                   obj3 = obj2;
                }
             }
          }else {
             goto label_003b ;
          }
          if (obj3 != null) {
             SlideDispatchAssist slideDispatc = new SlideDispatchAssist(obj, obj3);
             obj1 = p0.t1();
             Objects.requireNonNull(obj1);
             Object obj4 = PatchProxy.applyOneRefs(obj, obj1, ot, "51");
             if (obj4 != PatchProxyResult.class) {
                obj2 = obj4;
             }else {
                obj1 = obj1.f;
                if (obj1 != null) {
                   Object obj5 = PatchProxy.applyOneRefs(obj, obj1, uoa, "25");
                   obj2 = (obj5 != PatchProxyResult.class)? obj5: obj1.c.get(obj);
                }
             }
             slideDispatc.a(obj2);
             return slideDispatc;
          }
       }
       return obj2;
    }
    public void uh(){
    }
    public void vh(String p0,boolean p1){
       if (PatchProxy.isSupport(DetailSlidePlayFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, DetailSlidePlayFragment.class, "20")) {
          return;
       }
       DetailSlidePlayFragment tz = this.z;
       if (tz == null) {
          return;
       }
       if (p1) {
          tz.p(p0);
       }else {
          tz.d(p0);
       }
       return;
    }
    public void wh(String p0,boolean p1){
       if (PatchProxy.isSupport(DetailSlidePlayFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, DetailSlidePlayFragment.class, "19")) {
          return;
       }
       DetailSlidePlayFragment tz = this.z;
       if (tz == null) {
          return;
       }
       if (p1) {
          tz.q(p0);
       }else {
          tz.e(p0);
       }
       return;
    }
}
