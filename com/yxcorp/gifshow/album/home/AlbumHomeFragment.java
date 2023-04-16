package com.yxcorp.gifshow.album.home.AlbumHomeFragment;
import dc7.c;
import w69.l0;
import com.kwai.moved.ks_page.fragment.KsAlbumTabHostFragment;
import com.yxcorp.gifshow.album.home.AlbumHomeFragment$a;
import nsd.u;
import java.util.ArrayList;
import com.yxcorp.gifshow.album.home.AlbumHomeFragment$albumOptionHolder$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.album.home.ScrollableHeaderStub;
import z69.t;
import android.os.Handler;
import com.yxcorp.gifshow.album.home.AlbumHomeFragment$headerBannerListener$2;
import q79.d;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.kwai.library.widget.viewpager.tabstrip.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.CharSequence;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import ga9.b;
import r79.a;
import ga9.c;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumHomeFragmentViewBinder;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.base.fragment.AlbumBaseFragment;
import java.util.List;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import java.lang.Integer;
import java.util.Collection;
import w69.f;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Number;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import w69.k;
import o79.i;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import w69.g0;
import k79.a;
import java.util.Map;
import kotlin.TypeCastException;
import w69.e;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import android.view.View;
import android.view.View$OnLayoutChangeListener;
import s79.a;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.trello.rxlifecycle3.components.support.RxFragment;
import k79.f;
import k79.f$b;
import android.widget.HorizontalScrollView;
import java.lang.Boolean;
import w69.d;
import w69.d0;
import z69.a0;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import z69.p;
import androidx.viewpager.widget.ViewPager$i;
import androidx.viewpager.widget.ViewPager;
import z69.q;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$e;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.view.ViewTreeObserver;
import z69.r;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import com.yxcorp.gifshow.album.home.AlbumHomeFragment$b;
import com.yxcorp.gifshow.album.home.AlbumHomeFragment$c;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.album.home.AlbumHomeFragment$d;
import kotlin.collections.ArraysKt___ArraysKt;
import o79.a;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import o79.q;
import o79.d;
import android.widget.LinearLayout;
import android.graphics.Rect;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;

public final class AlbumHomeFragment extends KsAlbumTabHostFragment implements c, l0	// class@0019ff
{
    public int A;
    public IAlbumMainFragment$f B;
    public boolean C;
    public View$OnLayoutChangeListener D;
    public t E;
    public final p F;
    public HashMap G;
    public List r;
    public final List s;
    public d t;
    public final p u;
    public d0 v;
    public final List w;
    public final ScrollableHeaderStub x;
    public int y;
    public int z;
    public static final AlbumHomeFragment$a H;

    static {
       AlbumHomeFragment.H = new AlbumHomeFragment$a(null);
    }
    public void AlbumHomeFragment(){
       super();
       this.s = new ArrayList();
       this.u = s.c(new AlbumHomeFragment$albumOptionHolder$2(this));
       this.w = new ArrayList();
       this.x = new ScrollableHeaderStub(this);
       this.y = -1;
       this.A = -1;
       this.E = new t(null, 1, null);
       this.F = s.c(new AlbumHomeFragment$headerBannerListener$2(this));
    }
    public static final d nh(AlbumHomeFragment p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mViewModel");
       }
       return p0;
    }
    public b G3(Context p0){
       p0 = PatchProxy.applyOneRefs(p0, this, AlbumHomeFragment.class, "24");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new b(new PagerSlidingTabStrip$d(this.th(), this.th()), AlbumHomeFragment.class, this.getArguments());
    }
    public void Vg(){
       if (PatchProxy.applyVoid(null, this, AlbumHomeFragment.class, "35")) {
          return;
       }
       AlbumHomeFragment tG = this.G;
       if (tG != null) {
          tG.clear();
       }
       return;
    }
    public b Wg(){
       AbsAlbumHomeFragmentViewBinder uAbsAlbumHom = PatchProxy.apply(null, this, AlbumHomeFragment.class, "7");
       if (uAbsAlbumHom != PatchProxyResult.class) {
       }else {
          uAbsAlbumHom = c.b(this.qh().n(), AbsAlbumHomeFragmentViewBinder.class, this, 0, 4, null);
       }
       return uAbsAlbumHom;
    }
    public b Yg(){
       return this.uh();
    }
    public ViewModel Zg(){
       AlbumHomeFragment obj = PatchProxy.apply(null, this, AlbumHomeFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t;
       if (obj == null) {
          a.S("mViewModel");
       }
       return obj;
    }
    public AlbumBaseFragment b(){
       return this;
    }
    public List ih(){
       String str2;
       String str3;
       k q;
       ArrayList obj = PatchProxy.apply(null, this, AlbumHomeFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.vh();
       obj = new ArrayList();
       AlbumHomeFragment tr = this.r;
       if (tr != null) {
          Fragment parentFragme = this.getParentFragment();
          if (parentFragme != null) {
             List list = parentFragme.yh();
             if (list != null && (!tr.contains(Integer.valueOf(3)) && (list.isEmpty() ^ 1))) {
                ArrayList uArrayList = this.qh().d().i();
                if (uArrayList != null && uArrayList.isEmpty() == true) {
                   tr.add(Integer.valueOf(3));
                }
             }
          label_005a :
             Iterator iterator = tr.iterator();
             int i = 0;
             while (iterator.hasNext()) {
                k obj1 = iterator.next();
                int i1 = i + 1;
                if (i < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                int i2 = obj1.intValue();
                String str = "AlbumHomeFragment";
                Log.b(str, "getTabFragmentDelegates: create type="+i2);
                String str1 = "CommonUtil.string\(R.stri¡­bum_album_tab_tiltle_all\)";
                int i3 = 0x7f101891;
                if (i2) {
                   if (i2 != 1) {
                      if (i2 != 2) {
                         if (i2 != 3) {
                            str2 = 4;
                            if (i2 != str2) {
                               Log.d(str, "getTabFragmentDelegates: wrong type="+i2);
                            }else {
                               obj1 = this.qh().m().T;
                               if (obj1 == null) {
                                  str3 = i.p(R.string.arg_RES_7f1018cb);
                                  a.h(str3, "CommonUtil.string\(R.string.ksalbum_screenshot\)");
                               }
                               if (this.qh().d().c() && !tr.contains(Integer.valueOf(2))) {
                                  str3 = i.p(i3);
                                  a.h(str3, str1);
                               }
                               obj.add(this.ph(str3, AlbumAssetFragment.class, str2));
                            }
                         }else {
                            Fragment parentFragme1 = this.getParentFragment();
                            if (parentFragme1 != null) {
                               List list1 = parentFragme1.yh();
                               if (list1 != null) {
                                  Iterator iterator1 = list1.iterator();
                                  while (iterator1.hasNext()) {
                                     l0 ol0 = iterator1.next();
                                     obj.add(ol0.G3(this.getContext()));
                                     if (ol0 instanceof g0) {
                                        a.h.put(this.sh(i), ol0);
                                     }
                                  }
                               }
                            }else {
                               throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.home.AlbumFragment");
                            }
                         }
                      }else {
                         q = this.qh().m().Q;
                         if (q == null) {
                            q = i.p(i3);
                            a.h(q, str1);
                         }
                         obj.add(this.ph(q, AlbumAssetFragment.class, 2));
                      }
                   }else {
                      q = this.qh().m().S;
                      if (q == null) {
                         str2 = i.p(R.string.arg_RES_7f1018b9);
                         a.h(str2, "CommonUtil.string\(R.string.ksalbum_photograph\)");
                      }
                      if (this.qh().d().c() && !tr.contains(Integer.valueOf(2))) {
                         str2 = i.p(i3);
                         a.h(str2, str1);
                      }
                      obj.add(this.ph(str2, AlbumAssetFragment.class, 1));
                   }
                }else {
                   q = this.qh().m().R;
                   if (q == null) {
                      str2 = i.p(R.string.arg_RES_7f1018db);
                      a.h(str2, "CommonUtil.string\(R.string.ksalbum_video\)");
                   }
                   if (this.qh().d().c() && !tr.contains(Integer.valueOf(2))) {
                      str2 = i.p(i3);
                      a.h(str2, str1);
                   }
                   obj.add(this.ph(str2, AlbumAssetFragment.class, 0));
                }
                i = i1;
             }
          }else {
             throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.home.AlbumFragment");
          }
       }
       return obj;
    }
    public final void oh(){
       if (PatchProxy.applyVoid(null, this, AlbumHomeFragment.class, "30")) {
          return;
       }
       e uoe = this.x.j();
       if (uoe != null) {
          uoe.l3();
       }
       return;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(AlbumHomeFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, AlbumHomeFragment.class, "12")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       List list = this.ch();
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             Fragment uFragment = iterator.next();
             if (uFragment != null) {
                uFragment.onActivityResult(p0, p1, p2);
             }
          }
       }
       return;
    }
    public void onBindClickEvent(){
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumHomeFragment.class, "3")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          ViewModel viewModel = ViewModelProviders.of(activity).get(d.class);
          a.h(viewModel, "ViewModelProviders.of\(it¡­setViewModel::class.java\)");
          this.t = viewModel;
       }
       super.onCreate(p0);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, AlbumHomeFragment.class, "11")) {
          return;
       }
       super.onDestroy();
       View view = this.getView();
       if (view != null) {
          view.removeOnLayoutChangeListener(this.D);
       }
       return;
    }
    public void onDestroyView(){
       Iterator iterator;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AlbumHomeFragment.class, "10")) {
          return;
       }
       super.onDestroyView();
       if (!PatchProxy.applyVoid(objArray, this, AlbumHomeFragment.class, "14")) {
          iterator = this.w.iterator();
          while (iterator.hasNext()) {
             iterator.next().g();
          }
       }
       c childFragmen = this.getChildFragmentManager();
       a.h(childFragmen, "childFragmentManager");
       List fragments = childFragmen.getFragments();
       a.h(fragments, "childFragmentManager.fragments");
       iterator = fragments.iterator();
       while (iterator.hasNext()) {
          e uoe = this.getChildFragmentManager().beginTransaction();
          a.h(uoe, "childFragmentManager.beginTransaction\(\)");
          uoe.u(iterator.next());
          uoe.m();
       }
       this.Vg();
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, AlbumHomeFragment.class, "9")) {
          return;
       }
       super.onPause();
       this.E.b();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, AlbumHomeFragment.class, "8")) {
          return;
       }
       super.onResume();
       if (this.E.a()) {
          List list = this.ch();
          a.h(list, "aliveFragments");
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             Fragment uFragment = iterator.next();
             if (!uFragment instanceof AlbumAssetFragment) {
                uFragment = null;
             }
             if (uFragment == null || PatchProxy.applyVoid(null, uFragment, AlbumAssetFragment.class, "27")) {
                continue ;
             }else {
                AlbumAssetFragment o = uFragment.O;
                if (o != null) {
                   f$b.a(o, false, 1, null);
                }
                uFragment.hh(uFragment.O);
             }
          }
       }
       this.E.c();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       KsAlbumTabHostFragment tj;
       Object[] objArray;
       AlbumSelectedContainer uAlbumSelect;
       int i;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AlbumHomeFragment.class, "4")) {
          return;
       }
       a.q(p0, "view");
       this.vh();
       super.onViewCreated(p0, p1);
       Fragment parentFragme = this.getParentFragment();
       String str = "null cannot be cast to non-null type com.yxcorp.gifshow.album.home.AlbumFragment";
       if (parentFragme == null) {
          throw new TypeCastException(str);
       }
       AlbumHomeFragment tt = this.t;
       if (tt == null) {
          a.S("mViewModel");
       }
       d0 uod0 = (tt.s0().o())? null: parentFragme.u;
       this.v = uod0;
       AlbumHomeFragment tr = this.r;
       if (tr != null && (tr.size() == 1 && this.qh().d().k != null)) {
          tj = this.j;
          a.h(tj, "mTabStrip");
          tj.setVisibility(8);
       }
    label_005d :
       if (PatchProxy.applyVoid(null, this, AlbumHomeFragment.class, "20") || (!this.isDetached() && this.isAdded())) {
          tj.f = this.qh().d().l();
          tr = this.r;
          i = (tr != null)? tr.size(): 0;
          if (i >= 0) {
             int i2 = 0;
             this.x.g.add(Boolean.FALSE);
             while (i2 != i) {
                i2 = i2 + 1;
             }
          }
          if (this.wh()) {
             tr = this.x;
             tr.e = this.v;
             this.w.add(tr);
          }else if(PatchProxy.applyVoid(null, this, AlbumHomeFragment.class, "21")){
             uod0 = this.qh().c().c();
             if (uod0 != null) {
                a0 uoa0 = PatchProxy.apply(null, this, AlbumHomeFragment.class, "2");
                if (uoa0 == PatchProxyResult.class) {
                   uoa0 = this.F.getValue();
                }
                uod0.f(uoa0);
             }
          }
          Iterator iterator = this.w.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             AlbumHomeFragment tt2 = this.t;
             if (tt2 == null) {
                a.S("mViewModel");
             }
             uoa.b(tt2);
          }
          if (this.wh()) {
             e uoe = this.x.j();
             if (uoe != null) {
                AlbumHomeFragment tt3 = this.t;
                if (tt3 == null) {
                   a.S("mViewModel");
                }
                Boolean value1 = tt3.A0().getValue();
                if (value1 == null) {
                   value1 = Boolean.FALSE;
                }
                uoe.d(value1.booleanValue());
             }
          }
       }
    label_012e :
       if (!PatchProxy.applyVoid(null, this, AlbumHomeFragment.class, "15")) {
          this.mh(new p(this));
          parentFragme = this.getParentFragment();
          if (parentFragme != null) {
             List list = parentFragme.yh();
             i = (list != null)? list.size(): 0;
             Fragment parentFragme1 = this.getParentFragment();
             if (parentFragme1 != null) {
                i = i + parentFragme1.vh();
                AlbumHomeFragment tt1 = this.t;
                if (tt1 == null) {
                   a.S("mViewModel");
                }
                Boolean value = tt1.z0().getValue();
                if (value == null) {
                   value = Boolean.FALSE;
                }
                a.h(value, "mViewModel.enableSceneClassify.value ?: false");
                boolean b = value.booleanValue();
                ViewPager viewPager = this.uh().k();
                if (viewPager != null) {
                   int i1 = 2;
                   if (!b) {
                      i1 = i1 + i;
                   }
                   viewPager.setOffscreenPageLimit(i1);
                }
                this.j.a(new q(this));
                tj = this.j;
                a.h(tj, "mTabStrip");
                tj.getViewTreeObserver().addOnGlobalLayoutListener(new r(this));
             }else {
                throw new TypeCastException(str);
             }
          }else {
             throw new TypeCastException(str);
          }
       }
       parentFragme = this.getParentFragment();
       if (!parentFragme instanceof AlbumFragment) {
          objArray = null;
       }
       if (objArray != null) {
          uAlbumSelect = objArray.wh();
          if (uAlbumSelect != null) {
             AlbumSelectedContainer.f0(uAlbumSelect, 0, 1, null);
          }
       }
       this.D = new AlbumHomeFragment$b(this);
       uAlbumSelect = this.getView();
       if (uAlbumSelect != null) {
          uAlbumSelect.addOnLayoutChangeListener(this.D);
       }
       if (this.qh().m().y() != -1) {
          this.j.setIndicatorColor(this.qh().m().y());
       }
       tr = this.t;
       if (tr == null) {
          a.S("mViewModel");
       }
       tr.P0().observe(this, new AlbumHomeFragment$c(this));
       tr = this.t;
       if (tr == null) {
          a.S("mViewModel");
       }
       tr.A0().observe(this, new AlbumHomeFragment$d(this));
       return;
    }
    public final b ph(String p0,Class p1,int p2){
       PagerSlidingTabStrip$d obj;
       if (PatchProxy.isSupport(AlbumHomeFragment.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, AlbumHomeFragment.class, "25");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PagerSlidingTabStrip$d(p0, p0);
       Bundle uBundle = new Bundle();
       uBundle.putInt("album_type", p2);
       if (p2 == 2) {
          uBundle.putBoolean("NestedScrollingEnabled", true);
          uBundle.putBoolean("ALBUM_SUPPORT_DIVIDER", true);
       }
       if (p2 == this.y) {
          uBundle.putBoolean("is_default", true);
       }
       return new b(obj, p1, uBundle);
    }
    public final a qh(){
       Object obj = PatchProxy.apply(null, this, AlbumHomeFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.getValue();
    }
    public final ScrollableHeaderStub rh(){
       return this.x;
    }
    public final String sh(int p0){
       AlbumHomeFragment obj;
       if (PatchProxy.isSupport(AlbumHomeFragment.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, AlbumHomeFragment.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.t;
       if (obj == null) {
          a.S("mViewModel");
       }
       ArrayList uArrayList = obj.s0().d().i();
       if (uArrayList != null) {
          int i = 1;
          if ((uArrayList.isEmpty() ^ i) == i) {
             AlbumHomeFragment tr = this.r;
             String str = null;
             int i1 = (tr != null)? tr.size(): 0;
             if (uArrayList.size() != i1) {
                Log.d("AlbumHomeFragment", "getSceneTypeByPosition: sceneTypeList.size != albumTabSize!! "+uArrayList.size()+" != "+i1);
                return "tab_all";
             }else if(p0 < 0 || p0 >= i1){
                StringBuilder str1 = "getSceneTypeByPosition: position is wrong, position="+p0+", max=";
                AlbumHomeFragment tr1 = this.r;
                if (tr1 != null) {
                   str = tr1.size();
                }
                Log.d("AlbumHomeFragment", str1+str);
             }else {
                Object obj1 = uArrayList.get(p0);
                a.h(obj1, "sceneTypeList[position]");
                return obj1;
             }
          }
       }
       return "tab_all";
    }
    public final String th(){
       Object[] objArray1;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, AlbumHomeFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getString(R.string.arg_RES_7f101895);
       a.h(obj, "getString\(R.string.ksalbum_camera_album\)");
       int[] ointArray = this.qh().d().k();
       int i = 0;
       if (ointArray != null && ointArray.length == 1) {
          int i1 = ointArray[i];
          if (i1 == 1) {
             obj = this.getString(R.string.arg_RES_7f101893);
             a.h(obj, "getString\(R.string.ksalbum_all_photos\)");
          }else if(!i1){
             objArray1 = this.getString(R.string.arg_RES_7f101894);
             a.h(objArray1, "getString\(R.string.ksalbum_all_videos\)");
          }
       }
       String str = this.qh().m().e();
       if (str != null) {
          if (str.length() > 0) {
             i = 1;
          }
          if (i) {
             objArray = str;
          }
          if (objArray != null) {
             objArray1 = objArray;
          }
       }
       return objArray1;
    }
    public AbsAlbumHomeFragmentViewBinder uh(){
       b obj = PatchProxy.apply(null, this, AlbumHomeFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Xg();
       if (obj != null) {
          return obj;
       }
       throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.viewbinder.AbsAlbumHomeFragmentViewBinder");
    }
    public final void vh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AlbumHomeFragment.class, "26")) {
          return;
       }
       AlbumHomeFragment tr = this.r;
       int i = 1;
       if (tr != null && (tr.isEmpty() ^ i) == i) {
          return;
       }
       Log.b("AlbumHomeFragment", "initAlbumTabs\(\) called");
       int[] ointArray = this.qh().d().k();
       List list = (ointArray != null)? ArraysKt___ArraysKt.Cy(ointArray): objArray;
       this.r = list;
       if (!PatchProxy.applyVoid(objArray, this, AlbumHomeFragment.class, "27")) {
          AlbumHomeFragment tr3 = this.r;
          if (tr3 == null || tr3.isEmpty() == i) {
             int[] b = a.b;
             a.h(b, "AlbumConstants.IMAGE_AND_VIDEO_TABS");
             this.r = ArraysKt___ArraysKt.Cy(b);
             Log.b("AlbumHomeFragment", "makeSureTabsIsNotEmpty: using default tabs="+this.r);
          }
       }
       this.qh().e().M(q.e(this.qh().d().k()));
       AlbumHomeFragment tr1 = this.r;
       if (!PatchProxy.applyVoidOneRefs(tr1, objArray, d.class, "40")) {
          ArrayList uArrayList = new ArrayList();
          if (tr1 != null && tr1.contains(Integer.valueOf(4))) {
             uArrayList.add("tab_screenshot");
          }else {
             uArrayList.add("");
          }
          d.s(uArrayList);
       }
       int i1 = this.qh().d().a();
       this.y = i1;
       tr1 = this.r;
       if (tr1 != null) {
          Iterator iterator = tr1.iterator();
          int i2 = 0;
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             int i3 = i2 + 1;
             if (i2 < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             if (obj.intValue() == i1) {
                this.n = i2;
                Log.b("AlbumHomeFragment", "initAlbumTabs: set tab select position ="+this.n);
             }
             i2 = i3;
          }
       }
       KsAlbumTabHostFragment tn = this.n;
       if (tn >= null) {
          tr1 = this.r;
          i = (tr1 != null)? tr1.size(): 0;
          if (tn <= i) {
          label_013c :
             Log.b("AlbumHomeFragment", "initAlbumTabs: mInitTabPosition="+this.n);
             return;
          }
       }
       Log.d("AlbumHomeFragment", "IllegalData mInitTabPosition:"+this.n);
       this.n = 0;
       AlbumHomeFragment tr2 = this.r;
       if (tr2 == null) {
          a.L();
       }
       this.y = tr2.get(0).intValue();
       goto label_013c ;
    }
    public final boolean wh(){
       boolean b = (this.v != null)? true: false;
       return b;
    }
    public final void xh(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, AlbumHomeFragment.class, "16")) {
          return;
       }
       AlbumHomeFragment tt = this.t;
       if (tt == null) {
          a.S("mViewModel");
       }
       Boolean value = tt.z0().getValue();
       if (value == null) {
          value = Boolean.FALSE;
       }
       a.h(value, "mViewModel.enableSceneClassify.value ?: false");
       if (!value.booleanValue()) {
          return;
       }else {
          PagerSlidingTabStrip i = this.j.i;
          ArrayList uArrayList = this.qh().d().i();
          if (uArrayList == null) {
             uArrayList = CollectionsKt__CollectionsKt.E();
          }
          if (i > null && i == uArrayList.size()) {
             ArrayList uArrayList1 = new ArrayList();
             int i1 = 0;
             while (i1 < i) {
                KsAlbumTabHostFragment tj = this.j;
                View childAt = tj.g.getChildAt(i1);
                if (childAt == null) {
                   b = false;
                }else {
                   Rect rect = new Rect();
                   tj.getHitRect(rect);
                   b = childAt.getLocalVisibleRect(rect);
                }
                if (b) {
                   Object obj = uArrayList.get(i1);
                   a.h(obj, "sceneTypeList[i]");
                   uArrayList1.add(obj);
                }
                i1 = i1 + 1;
             }
             tt = this.s;
             if (a.g(uArrayList1, tt) ^ 0x01) {
                d.s(uArrayList1);
                tt.clear();
                tt.addAll(uArrayList1);
             }
          }
          return;
       }
    }
    public final void yh(int p0){
       if (PatchProxy.isSupport(AlbumHomeFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AlbumHomeFragment.class, "32")) {
          return;
       }
       ViewPager viewPager = this.uh().k();
       ViewGroup$LayoutParams layoutParams = (viewPager != null)? viewPager.getLayoutParams(): null;
       if (layoutParams != null) {
          layoutParams.height = p0;
       }
       ViewPager viewPager1 = this.uh().k();
       if (viewPager1 != null) {
          viewPager1.setLayoutParams(layoutParams);
       }
       return;
    }
}
