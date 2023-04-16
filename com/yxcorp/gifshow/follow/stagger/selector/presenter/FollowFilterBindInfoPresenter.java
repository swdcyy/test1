package com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterBindInfoPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterBindInfoPresenter$a;
import nsd.u;
import mrd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import xq6.a;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterBindInfoPresenter$mSizerContainer$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterBindInfoPresenter$mSelectorViewGroup$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterBindInfoPresenter$d;
import erd.g;
import crd.b;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import yvb.e;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.panel.sizer.view.MaxHeightFrameLayout;
import android.app.Activity;
import com.yxcorp.utility.n;
import ekd.i;
import android.content.Context;
import lnc.a1;
import java.util.HashMap;
import java.util.Objects;
import androidx.fragment.app.Fragment;
import wq6.d;
import as6.a;
import zq6.r;
import bo5.a;
import zq6.p;
import gsa.e0;
import xvb.c;
import com.kwai.kcube.KCubeContainerFragment;
import wq6.f;
import zq6.b;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterBindInfoPresenter$c;
import zq6.u;
import zq6.s;
import xq6.b;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.follow.model.FilterBox;
import java.lang.StringBuilder;
import java.lang.Integer;
import com.yxcorp.gifshow.follow.model.FilterOption;
import kotlin.Pair;
import tja.a;
import com.yxcorp.gifshow.refresh.RefreshType;
import rja.c;
import com.yxcorp.gifshow.panel.sizer.view.SizerSectionView;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterBindInfoPresenter$b;
import yvb.e$b;
import android.view.View;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import io.reactivex.subjects.PublishSubject;
import y0b.n;
import o0b.a;
import y0b.s;
import y0b.h;
import java.lang.Long;

public final class FollowFilterBindInfoPresenter extends PresenterV2	// class@001231
{
    public c p;
    public HomeFollowFragment q;
    public List r;
    public HashMap s;
    public HashMap t;
    public PublishSubject u;
    public final a v;
    public final a w;
    public final p x;
    public final p y;
    public static final FollowFilterBindInfoPresenter$a z;

    static {
       FollowFilterBindInfoPresenter.z = new FollowFilterBindInfoPresenter$a(null);
    }
    public void FollowFilterBindInfoPresenter(){
       super();
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<SkinInfo>\(\)");
       this.v = uoa;
       this.w = new a();
       this.x = s.c(new FollowFilterBindInfoPresenter$mSizerContainer$2(this));
       this.y = s.c(new FollowFilterBindInfoPresenter$mSelectorViewGroup$2(this));
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, FollowFilterBindInfoPresenter.class, "14")) {
          return;
       }
       c.i(KsLogFollowTag.FOLLOW_SELECTOR.appendTag("FollowFilterBindInfoPresenter"), "onBind");
       this.X7(RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new FollowFilterBindInfoPresenter$d(this)));
       this.S8();
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, FollowFilterBindInfoPresenter.class, "16")) {
          return;
       }
       FollowFilterBindInfoPresenter ts = this.s;
       if (ts == null) {
          a.S("mFilterMapAdapter");
       }
       Iterator iterator = ts.entrySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().getValue().onDestroy();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, FollowFilterBindInfoPresenter.class, "15")) {
          return;
       }
       this.w.c();
       return;
    }
    public final ViewGroup P8(){
       Object obj = PatchProxy.apply(null, this, FollowFilterBindInfoPresenter.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.y.getValue();
    }
    public final MaxHeightFrameLayout R8(){
       Object obj = PatchProxy.apply(null, this, FollowFilterBindInfoPresenter.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.x.getValue();
    }
    public final void S8(){
       e0 uoe0;
       int b;
       int i;
       FilterBox mOptions;
       Pair pair;
       Fragment parentFragme;
       Object obj = this;
       FollowFilterBindInfoPresenter uFollowFilte = FollowFilterBindInfoPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, uFollowFilte, "17")) {
          return;
       }
       String str = "FollowFilterBindInfoPresenter";
       c.i(KsLogFollowTag.FOLLOW_SELECTOR.appendTag(str), "initView ");
       if (!PatchProxy.applyVoid(objArray, obj, uFollowFilte, "18")) {
          Activity activity = this.getActivity();
          if (activity != null) {
             double d = (double)n.t(activity) * 0x3fe8000000000000;
             b = (!i.e(activity))? n.A(activity): 0;
             d = d - (double)b;
             d = d - (double)a1.d(0x7f070313);
             b = (int)d;
             if (this.R8().getMaxHeight() != b) {
                this.R8().setMaxHeight(b);
             }
          }
       }
       this.P8().removeAllViews();
       FollowFilterBindInfoPresenter t = obj.t;
       String str1 = "mFilterMapBox";
       if (t == null) {
          a.S(str1);
       }
       t.clear();
       t = obj.s;
       String str2 = "mFilterMapAdapter";
       if (t == null) {
          a.S(str2);
       }
       t.clear();
       t = obj.q;
       String str3 = "mFragment";
       if (t == null) {
          a.S(str3);
       }
       Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
       d uod = a.e(t);
       r or = (uod != null)? uod.e0(): objArray;
       String str4 = "HomeTopStateId.TAB_BAR_VIEW_INFO";
       if (or != null) {
          p e = a.e;
          a.o(e, str4);
          uoe0 = or.d(e);
       }else {
          uoe0 = objArray;
       }
       if (uoe0 != null) {
          this.P8().setBackgroundColor(uoe0.k);
          obj.v.onNext(new c(uoe0.b, uoe0.a));
       }
       uFollowFilte = PatchProxy.apply(objArray, obj, uFollowFilte, "20");
       if (uFollowFilte != PatchProxyResult.class) {
       }else {
          uFollowFilte = obj.q;
          if (uFollowFilte == null) {
             a.S(str3);
          }
          while (true) {
             if (uFollowFilte != null) {
                if (!uFollowFilte instanceof KCubeContainerFragment) {
                   parentFragme = uFollowFilte.getParentFragment();
                }
             }else {
                parentFragme = objArray;
             }
          }
       }
       f uof = a.j(uFollowFilte);
       if (uof != null) {
          b uob = uof.y();
          if (uob != null) {
             p e1 = a.e;
             a.o(e1, str4);
             obj.w.a(uob.b(e1, new FollowFilterBindInfoPresenter$c(obj)));
          }
       }
       uFollowFilte = obj.r;
       if (uFollowFilte == null) {
          a.S("mBoxes");
       }
       b = true;
       if (uFollowFilte != null) {
          Iterator iterator = uFollowFilte.iterator();
          i = 0;
          while (iterator.hasNext()) {
             FollowFilterBindInfoPresenter obj1 = iterator.next();
             int i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             if (obj1 != null) {
                List list = KsLogFollowTag.FOLLOW_SELECTOR.appendTag(str);
                StringBuilder str5 = "boxOption Size: ";
                mOptions = obj1.mOptions;
                Integer integer = (mOptions != null)? Integer.valueOf(mOptions.size()): objArray;
                c.i(list, str5+integer);
                FilterBox mOptions1 = obj1.mOptions;
                if (mOptions1 != null) {
                   Iterator iterator1 = mOptions1.iterator();
                   int i2 = 0;
                   while (true) {
                      if (iterator1.hasNext()) {
                         a obj2 = iterator1.next();
                         if (obj2.mIsDefault != null) {
                            pair = new Pair(Integer.valueOf(i2), obj2);
                         label_0176 :
                            if (pair != null) {
                               pair.getSecond().mSelected = b;
                               FollowFilterBindInfoPresenter p = obj.p;
                               if (p != null) {
                                  obj2 = v15;
                                  a uoa = v15;
                                  obj2 = new a(pair.getSecond(), new Pair(Integer.valueOf(i), pair.getFirst()), null, false, 4, null);
                                  p.r(uoa);
                               }
                            }
                         }else {
                            i2 = i2 + 1;
                         }
                      }else {
                         pair = objArray;
                         goto label_0176 ;
                      }
                   }
                }
                SizerSectionView sizerSection = new SizerSectionView(this.getContext());
                sizerSection.setDecorationPaddingTop(0);
                sizerSection.setSkinInfoBehaviorSubject(obj.v);
                sizerSection.F = obj1.isDisplayTextNotEmpty();
                sizerSection.E = b;
                sizerSection.setData(obj1);
                sizerSection.getSectionAdapter().r1(new FollowFilterBindInfoPresenter$b(obj1, i, obj1, obj));
                this.P8().addView(sizerSection);
                FollowFilterBindInfoPresenter t1 = obj.t;
                if (t1 == null) {
                   a.S(str1);
                }
                t1.put(Integer.valueOf(i), obj1);
                obj1 = obj.s;
                if (obj1 == null) {
                   a.S(str2);
                }
                e sectionAdapt = sizerSection.getSectionAdapter();
                a.o(sectionAdapt, "sizerSectionView.sectionAdapter");
                obj1.put(Integer.valueOf(i), sectionAdapt);
             }
             i = i1;
             objArray = null;
          }
       }
       uFollowFilte = obj.p;
       if (uFollowFilte != null) {
          FollowFilterBindInfoPresenter t2 = obj.t;
          if (t2 == null) {
             a.S(str1);
          }
          if (!PatchProxy.applyVoidOneRefs(t2, uFollowFilte, c.class, "23")) {
             if (t2 != null && !t2.isEmpty()) {
                b = false;
             }
             if (!b) {
                uFollowFilte.e.clear();
                uFollowFilte.d.clear();
                String[] stringArray = new String[]{"default","time","friend","favoriteFollowing"};
                List list1 = CollectionsKt__CollectionsKt.L(stringArray);
                Iterator iterator2 = t2.entrySet().iterator();
                while (iterator2.hasNext()) {
                   Map$Entry uEntry = iterator2.next();
                   if (uEntry.getValue() == null) {
                   }else {
                      FilterBox value = uEntry.getValue();
                      a.m(value);
                      value = value.mOptions;
                      a.o(value, "entry.value!!.mOptions");
                      Iterator iterator3 = value.iterator();
                      i = 0;
                      while (iterator3.hasNext()) {
                         FilterOption uFilterOptio = iterator3.next();
                         if (list1.contains(uFilterOptio.mName)) {
                            uFilterOptio = uFilterOptio.mName;
                            a.o(uFilterOptio, "value.mName");
                            uFollowFilte.e.put(uFilterOptio, new Pair(uEntry.getKey(), Integer.valueOf(i)));
                         }
                         i = i + 1;
                      }
                   }
                }
                uFollowFilte.d.putAll(t2);
             }
          }
       }
       this.P8().setPadding(0, 0, 0, 0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, FollowFilterBindInfoPresenter.class, "13")) {
          return;
       }
       FollowFilterBindInfoPresenter obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.q = obj;
       obj = this.r8("FOLLOW_FILTER_ITEM_CLICK");
       a.o(obj, "inject\(FollowFilterAcces¡­FOLLOW_FILTER_ITEM_CLICK\)");
       this.u = obj;
       obj = this.r8("FOLLOW_FILTER_BOXES");
       a.o(obj, "inject\(FollowFilterAccessIds.FOLLOW_FILTER_BOXES\)");
       this.r = obj;
       obj = this.r8("FOLLOW_FILTER_MAP_BOX");
       a.o(obj, "inject\(FollowFilterAcces¡­ds.FOLLOW_FILTER_MAP_BOX\)");
       this.t = obj;
       obj = this.r8("FOLLOW_FILTER_MAP_ADAPTER");
       a.o(obj, "inject\(FollowFilterAcces¡­OLLOW_FILTER_MAP_ADAPTER\)");
       this.s = obj;
       obj = this.q;
       String str = "mFragment";
       if (obj == null) {
          a.S(str);
       }
       n on = obj.Q8();
       String str1 = "mFragment.ksPage";
       a.o(on, str1);
       a uoa = on.C();
       FollowFilterBindInfoPresenter tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       n on1 = tq.Q8();
       a.o(on1, str1);
       s os = on1.G();
       a.o(os, "mFragment.ksPage.moduleContext");
       this.p = uoa.a(Long.valueOf(os.g()), "FOLLOW_FILTER_STATE", c.class);
       return;
    }
}
