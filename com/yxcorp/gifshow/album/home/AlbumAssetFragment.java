package com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import z69.y;
import j79.d;
import z69.x;
import com.yxcorp.gifshow.base.fragment.AlbumBaseFragment;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$a;
import nsd.u;
import dc7.i;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$mType$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$mSceneType$2;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$mScaleType$2;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$mIsDefault$2;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$mSupportDivider$2;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$mIsSelectedDataScrollToCenter$2;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$mColumnCount$2;
import o79.m;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$b;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.utility.Log;
import kotlin.jvm.internal.a;
import r79.a;
import q79.d;
import w69.k;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetFragmentViewBinder;
import androidx.recyclerview.widget.RecyclerView;
import z69.l;
import p79.c;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import android.animation.ValueAnimator;
import th0.e;
import android.animation.TimeInterpolator;
import p79.d;
import p79.f;
import android.animation.Animator$AnimatorListener;
import p79.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.ViewGroup;
import java.lang.Number;
import java.util.List;
import com.yxcorp.gifshow.slider.SliderPositionerLayout;
import kotlin.TypeCastException;
import a79.a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import ec7.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.StringBuilder;
import k79.f;
import k79.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Math;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import b79.i;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.models.QMedia;
import r79.c;
import java.lang.CharSequence;
import m79.c;
import ha9.c;
import kotlin.collections.CollectionsKt___CollectionsKt;
import crd.b;
import brd.a0;
import q79.c;
import java.util.concurrent.Callable;
import g79.a;
import w69.p0;
import brd.z;
import z69.j;
import z69.k;
import erd.g;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import java.util.HashMap;
import java.util.Map;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import o79.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import w69.x;
import w69.f;
import w69.b;
import w69.f0;
import w69.c;
import android.app.Activity;
import io.reactivex.android.schedulers.a;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$m;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$n;
import com.yxcorp.gifshow.album.widget.LoadingView;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$o;
import android.view.View$OnClickListener;
import io.reactivex.subjects.PublishSubject;
import n79.b;
import java.lang.Float;
import m79.g;
import z69.w;
import e17.i;
import e17.s;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import w69.d;
import android.os.Bundle;
import j79.a;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import j79.c;
import com.yxcorp.gifshow.album.selected.interact.a;
import com.yxcorp.gifshow.album.selected.interact.a$a;
import java.lang.Exception;
import ga9.b;
import ga9.c;
import androidx.lifecycle.ViewModel;
import brd.t;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$c;
import java.lang.Runnable;
import k79.f$a;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$fetchTimeListFromLoader$$inlined$let$lambda$1;
import msd.l;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$d;
import jlb.b;
import q79.k;
import w69.d0;
import android.content.Intent;
import zsd.u;
import w69.v0;
import android.content.Context;
import z69.g;
import w69.v0$a;
import android.media.MediaScannerConnection;
import k79.j;
import java.io.File;
import java.lang.Long;
import java.text.SimpleDateFormat;
import ekd.n0;
import android.media.ExifInterface;
import java.lang.Throwable;
import android.text.TextUtils;
import java.util.Date;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcorp.gifshow.album.home.AlbumHomeFragment;
import java.lang.RuntimeException;
import ic7.b;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$i;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$j;
import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;
import o79.f;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import k79.p;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl;
import com.yxcorp.gifshow.album.repo.AssetsLoaderImpl;
import com.yxcorp.gifshow.album.repo.ImageLoaderImpl;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl;
import com.yxcorp.gifshow.album.widget.LoadingCircle;
import android.widget.TextView;
import com.trello.rxlifecycle3.components.support.RxFragment;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.album.preview.b$a;
import com.yxcorp.gifshow.album.preview.b;
import o79.i;
import androidx.recyclerview.widget.RecyclerView$l;
import z69.v;
import androidx.recyclerview.widget.RecyclerView$n;
import t79.a;
import com.yxcorp.gifshow.album.widget.NpaGridLayoutManager;
import z69.a;
import androidx.recyclerview.widget.GridLayoutManager$b;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView$s;
import z69.b;
import z69.c;
import java.util.Collection;
import w69.e0;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$k;
import com.yxcorp.gifshow.album.widget.UserTouchRecyclerView;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$l;
import kotlin.Pair;
import w69.b0;
import z69.h;
import z69.i;
import android.widget.ImageView;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.slider.SliderView;
import kotlin.jvm.internal.Ref$ObjectRef;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import z69.d;
import com.yxcorp.gifshow.slider.SliderPositionerLayout$a;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import android.view.ViewTreeObserver;
import hjc.c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import k79.f$b;
import java.lang.Iterable;
import trd.a0;
import java.util.ArrayList;
import java.util.Iterator;
import trd.u;
import o79.q;
import b79.c;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectAlbumAssetItemViewBinder;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import kotlin.jvm.internal.Ref$BooleanRef;
import gr8.b;
import brd.x;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$e;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$f;
import erd.a;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$g;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$h;

public class AlbumAssetFragment extends AlbumBaseFragment implements y, d, x	// class@0019eb
{
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public b F;
    public boolean G;
    public boolean H;
    public String I;
    public SliderPositionerLayout J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public f O;
    public b P;
    public List Q;
    public boolean R;
    public b S;
    public z T;
    public b U;
    public m V;
    public final int W;
    public final AlbumAssetFragment$b X;
    public HashMap Y;
    public final p i;
    public final p j;
    public final p k;
    public final p l;
    public final p m;
    public final p n;
    public final p o;
    public String p;
    public boolean q;
    public boolean r;
    public boolean s;
    public d t;
    public int u;
    public int v;
    public a w;
    public b x;
    public b y;
    public int z;
    public static final AlbumAssetFragment$a Z;

    static {
       AlbumAssetFragment.Z = new AlbumAssetFragment$a(null);
    }
    public void AlbumAssetFragment(){
       super(null, 1, null);
       this.i = s.c(new AlbumAssetFragment$mType$2(this));
       this.j = s.c(new AlbumAssetFragment$mSceneType$2(this));
       this.k = s.c(new AlbumAssetFragment$mScaleType$2(this));
       this.l = s.c(new AlbumAssetFragment$mIsDefault$2(this));
       this.m = s.c(new AlbumAssetFragment$mSupportDivider$2(this));
       this.n = s.c(new AlbumAssetFragment$mIsSelectedDataScrollToCenter$2(this));
       this.o = s.c(new AlbumAssetFragment$mColumnCount$2(this));
       this.z = -1;
       this.E = true;
       this.V = new m(800, 1200, 8);
       this.W = 50;
       this.X = new AlbumAssetFragment$b(this);
    }
    public static void Lh(AlbumAssetFragment p0,boolean p1,int p2,boolean p3,int p4,int p5,Object p6){
       RecyclerView recyclerView;
       int i1;
       int i = 0;
       if (p5 & 0x04) {
          p3 = false;
       }
       if (p5 & 0x08) {
          p4 = 300;
       }
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(AlbumAssetFragment.class) || !PatchProxy.applyVoidFourRefs(Boolean.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), Integer.valueOf(p4), p0, AlbumAssetFragment.class, "42")) {
          String str = "AlbumAssetFragment";
          Log.g(str, "updateFooter");
          p6 = p0.t;
          String str1 = "vm";
          if (p6 == null) {
             a.S(str1);
          }
          p2 = p2 - p6.s0().m().a();
          p6 = p0.t;
          if (p6 == null) {
             a.S(str1);
          }
          p2 = p2 - p6.s0().m().O;
          if (p3) {
             recyclerView = p0.qh().q();
             l ol = new l(p0);
             if (!PatchProxy.isSupport(c.class) || (!PatchProxy.applyVoidFourRefs(recyclerView, Integer.valueOf(p2), Integer.valueOf(p4), ol, null, c.class, "6") && recyclerView != null)) {
                p6 = (recyclerView.getLayoutParams() instanceof ViewGroup$MarginLayoutParams)? recyclerView.getLayoutParams().bottomMargin: 0;
                int[] ointArray = new int[]{p6,p2};
                p6 = ValueAnimator.ofInt(ointArray);
                p6.setDuration((long)p4);
                p6.setInterpolator(new e());
                recyclerView.setTag(R.id.album_view_list, p6);
                p6.addListener(new d(recyclerView, p2, ol));
                p6.addUpdateListener(new b(recyclerView));
                p6.start();
             }
          }else {
             recyclerView = p0.qh().q();
             ViewGroup$LayoutParams layoutParams = (recyclerView != null)? recyclerView.getLayoutParams(): null;
             if (layoutParams != null) {
                if (!p1) {
                   p2 = 0;
                }
                layoutParams.bottomMargin = p2;
                RecyclerView recyclerView1 = p0.qh().q();
                if (recyclerView1 != null) {
                   recyclerView1.setLayoutParams(layoutParams);
                }
                AlbumAssetFragment t = p0.t;
                if (t == null) {
                   a.S(str1);
                }
                Integer integer = t.s0().m().x();
                if (integer != null) {
                   integer = integer.intValue();
                   Log.g(str, "init slider after animation end");
                   AlbumAssetFragment q = p0.Q;
                   if (q != null) {
                      p0.th(integer, q);
                      t = p0.J;
                      if (t != null) {
                         t.d();
                      }
                   }
                   p0.L = i;
                   p0.M = i;
                }
             }else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
             }
          }
       label_0130 :
          p0.q = p1;
       }
       return;
    }
    public static final a ch(AlbumAssetFragment p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("mAssetListAdapter");
       }
       return p0;
    }
    public static void xh(AlbumAssetFragment p0,boolean p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = false;
       }
       p0.wh(p1);
       return;
    }
    public final boolean Ah(){
       AlbumAssetFragment obj = PatchProxy.apply(null, this, AlbumAssetFragment.class, "91");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.t;
       if (obj == null) {
          a.S("vm");
       }
       return obj.s0().m().j;
    }
    public final boolean Bh(){
       boolean b;
       AlbumAssetFragment obj = PatchProxy.apply(null, this, AlbumAssetFragment.class, "86");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.t;
       String str = "vm";
       if (obj == null) {
          a.S(str);
       }
       if (obj.s0().m().w()) {
          obj = this.t;
          if (obj == null) {
             a.S(str);
          }
          if (obj.s0().e().v()) {
             obj = this.t;
             if (obj == null) {
                a.S(str);
             }
             if (obj.s0().m().j() == 2) {
             label_0058 :
                b = false;
             label_0059 :
                return b;
             }
          }
          b = true;
          goto label_0059 ;
       }else {
          goto label_0058 ;
       }
    }
    public final void Ch(){
       if (PatchProxy.applyVoid(null, this, AlbumAssetFragment.class, "47")) {
          return;
       }
       Log.g("AlbumAssetFragment", "整体刷新相册页");
       AlbumAssetFragment tw = this.w;
       String str = "mAssetListAdapter";
       if (tw == null) {
          a.S(str);
       }
       AlbumAssetFragment tw1 = this.w;
       if (tw1 == null) {
          a.S(str);
       }
       tw.q0(0, tw1.getItemCount(), Boolean.FALSE);
       return;
    }
    public final void Dh(){
       if (PatchProxy.applyVoid(null, this, AlbumAssetFragment.class, "15")) {
          return;
       }
       Log.g("AlbumAssetFragment", "onPermissionGranted "+this.nh());
       int i = this.nh();
       String str = this.mh();
       AlbumAssetFragment tt = this.t;
       if (tt == null) {
          a.S("vm");
       }
       a.a(i, str, tt.s0().e()).reset();
       AlbumAssetFragment tt1 = this.t;
       if (tt1 == null) {
          a.S("vm");
       }
       tt1.M0();
       tt1 = this.t;
       if (tt1 == null) {
          a.S("vm");
       }
       if (tt1.J0()) {
          tt1 = this.t;
          if (tt1 == null) {
             a.S("vm");
          }
          if (!tt1.Q0()) {
             tt1 = this.t;
             if (tt1 == null) {
                a.S("vm");
             }
             tt1.V0();
          }
       }
       this.Fh();
       AlbumAssetFragment.xh(this, false, 1, null);
       this.G = false;
       return;
    }
    public final void Eh(){
       RecyclerView recyclerView1;
       Integer integer;
       if (PatchProxy.applyVoid(null, this, AlbumAssetFragment.class, "38")) {
          return;
       }
       RecyclerView recyclerView = this.qh().q();
       RecyclerView$LayoutManager layoutManage = (recyclerView != null)? recyclerView.getLayoutManager(): null;
       if (!layoutManage instanceof LinearLayoutManager) {
          layoutManage = null;
       }
       if (layoutManage != null) {
          int i = layoutManage.i0();
          int i1 = layoutManage.c();
          int i2 = Math.max((i - this.W), 0);
          int i3 = this.W + i;
          AlbumAssetFragment tw = this.w;
          if (tw == null) {
             a.S("mAssetListAdapter");
          }
          i3 = Math.min(i3, tw.getItemCount());
          while (i2 < i3) {
             if (i <= i2 && i1 >= i2) {
                recyclerView1 = this.qh().q();
                if (recyclerView1 != null) {
                   RecyclerView$ViewHolder viewHolder = recyclerView1.findViewHolderForAdapterPosition(i2);
                   if (viewHolder != null) {
                      a.h(viewHolder, "getViewBinder\(\).mQMediaR\x20\x02ion\(position\) ?: continue\x00");
                      if (viewHolder instanceof i && viewHolder.d != null) {
                         tw = this.w;
                         if (tw == null) {
                            a.S("mAssetListAdapter");
                         }
                         tw.m0(i2, Boolean.TRUE);
                      }
                   }
                }
             }else {
                recyclerView1 = this.qh().q();
                if (recyclerView1 != null) {
                   RecyclerView$Adapter adapter = recyclerView1.getAdapter();
                   if (adapter != null) {
                      integer = Integer.valueOf(adapter.f0(i2));
                   label_0097 :
                      if (integer != null && integer.intValue() == 1) {
                         tw = this.w;
                         if (tw == null) {
                            a.S("mAssetListAdapter");
                         }
                         tw.m0(i2, Boolean.TRUE);
                      }
                   }
                }
                integer = null;
                goto label_0097 ;
             }
             i2 = i2 + 1;
          }
       }
       return;
    }
    public final void Fh(){
       if (PatchProxy.applyVoid(null, this, AlbumAssetFragment.class, "65")) {
          return;
       }
       LinearLayout linearLayout = this.qh().m();
       if (linearLayout != null) {
          linearLayout.setVisibility(8);
       }
       RecyclerView recyclerView = this.qh().q();
       if (recyclerView != null) {
          recyclerView.setVisibility(0);
       }
       return;
    }
    public void Ga(int p0){
       if (PatchProxy.isSupport(AlbumAssetFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AlbumAssetFragment.class, "49")) {
          return;
       }
       if (p0 < 0) {
          return;
       }
       AlbumAssetFragment tt = this.t;
       if (tt == null) {
          a.S("vm");
       }
       int i = this.nh();
       String str = this.mh();
       Objects.requireNonNull(tt);
       if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(i), Integer.valueOf(p0), str, tt, d.class, "27")) {
          Log.g("AlbumAssetViewModel", "toggleSelect\(\) called with: type = ["+i+"] index = ["+p0+']');
          QMedia qMedia = tt.G0(i, p0, str);
          if (qMedia != null) {
             tt.Z(qMedia);
          }
       }
       return;
    }
    public final void Gh(){
       a c;
       d uod = d.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AlbumAssetFragment.class, "71")) {
          return;
       }
       AlbumAssetFragment tp = this.p;
       String str = "vm";
       AlbumAssetFragment uAlbumAssetF = 1;
       if (tp != null) {
          int i = (tp.length() > 0)? 1: 0;
          if (!i) {
             tp = objArray;
          }
          if (tp != null) {
          label_006a :
             if (tp != null) {
                AlbumAssetFragment uAlbumAssetF1 = (tp.length() > 0)? 1: null;
                if (uAlbumAssetF1 && this.E != null) {
                   Log.b("AlbumAssetFragment", "scrollToPath: "+tp+", canScrollToPath="+this.E);
                   if (!PatchProxy.applyVoidOneRefs(tp, this, AlbumAssetFragment.class, "32")) {
                      if (tp.length() <= 0) {
                         uAlbumAssetF = null;
                      }
                      if (uAlbumAssetF) {
                         objArray = tp;
                      }
                      uAlbumAssetF = this.F;
                      if (uAlbumAssetF != null) {
                         uAlbumAssetF.dispose();
                      }
                      uAlbumAssetF = this.t;
                      if (uAlbumAssetF == null) {
                         a.S(str);
                      }
                      AlbumAssetFragment tw = this.w;
                      if (tw == null) {
                         a.S("mAssetListAdapter");
                      }
                      List list = tw.O0();
                      a.h(list, "mAssetListAdapter.list");
                      Objects.requireNonNull(uAlbumAssetF);
                      a0 uoa0 = PatchProxy.applyTwoRefs(objArray, list, uAlbumAssetF, uod, "39");
                      if (uoa0 != patchProxyRe) {
                      }else {
                         a.q(list, "adapterList");
                         c = a.c;
                         uoa0 = a0.y(new c(list, objArray)).T(c.i().d()).G(c.i().b());
                         a.h(uoa0, "Single.fromCallable {\n  …kInner.schedulers.main\(\)\)");
                      }
                      this.F = uoa0.R(new j(this, tp), k.b);
                   }
                }
             }
          label_011a :
             return;
          }
       }
       tp = this.t;
       if (tp == null) {
          a.S(str);
       }
       Objects.requireNonNull(tp);
       Object obj = PatchProxy.apply(objArray, tp, uod, "58");
       if (obj != patchProxyRe) {
       }else {
          d g = tp.G;
          Objects.requireNonNull(g);
          obj = PatchProxy.apply(objArray, g, c.class, "21");
          if (obj != patchProxyRe) {
          }else {
             List list1 = g.B().t();
             if (list1 != null) {
                c uoc = CollectionsKt___CollectionsKt.e3(list1);
                if (uoc != null) {
                   obj = uoc.getPath();
                }
             }
             obj = objArray;
          }
       }
       tp = obj;
       goto label_006a ;
    }
    public final void Hh(){
       if (PatchProxy.applyVoid(null, this, AlbumAssetFragment.class, "68")) {
          return;
       }
       AlbumAssetFragment tt = this.t;
       String str = "vm";
       if (tt == null) {
          a.S(str);
       }
       if (a.g(tt.z0().getValue(), Boolean.TRUE)) {
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          Boolean uBoolean = tt.I0().get(this.mh());
          if (uBoolean == null) {
             uBoolean = Boolean.FALSE;
          }
          a.h(uBoolean, "vm.scrollToSelectedMarkMap[mSceneType] ?: false");
          if (uBoolean.booleanValue()) {
             tt = this.t;
             if (tt == null) {
                a.S(str);
             }
             if (tt.u0()) {
                tt = this.t;
                if (tt == null) {
                   a.S(str);
                }
                tt.I0().put(this.mh(), Boolean.FALSE);
                Log.g("AlbumAssetFragment", "scrollToPathIfNeed...."+this.mh());
                this.Gh();
             }
          }
       }else {
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          if (tt.u0()) {
             Log.g("AlbumAssetFragment", "scrollToPathIfNeed...."+this.mh());
             this.Gh();
          }
       }
    label_00b1 :
       return;
    }
    public final void Ih(int p0){
       if (PatchProxy.isSupport(AlbumAssetFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AlbumAssetFragment.class, "31")) {
          return;
       }
       if (p0 >= 0) {
          AlbumAssetFragment tw = this.w;
          if (tw != null) {
             if (tw == null) {
                a.S("mAssetListAdapter");
             }
             if (p0 < tw.getItemCount() && this.qh().q() != null) {
                Log.b("AlbumAssetFragment", "scrollToPosition: "+p0);
                RecyclerView recyclerView = this.qh().q();
                if (recyclerView != null) {
                   recyclerView.scrollToPosition(p0);
                }
             }
          }
       }
    label_0058 :
       return;
    }
    public final void Jh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AlbumAssetFragment.class, "76")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          if (!PatchProxy.applyVoid(objArray, objArray, d.class, "18")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CLICK_TAKE_PICTURE";
             uElementPack.type = 1;
             ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
             uClickEvent.type = 1;
             uClickEvent.elementPackage = uElementPack;
             ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
             uClickEvent.urlPackage = urlPackage;
             urlPackage.params = "task_id="+d.a;
             a.c.f().e(uClickEvent);
          }
          AlbumAssetFragment tt = this.t;
          String str = "vm";
          if (tt == null) {
             a.S(str);
          }
          f q = tt.s0().d().q;
          if (q == null) {
             tt = this.t;
             if (tt == null) {
                a.S(str);
             }
             if (tt.s0().b().d()) {
                q = "CAMERA_TYPE_SHOOT_IMAGE";
             }else {
                q = "CAMERA_TYPE_SHARE";
             }
          }
          f uof = q;
          tt = this.y;
          if (tt != null) {
             tt.dispose();
          }
          a c = a.c;
          a.h(activity, "activity");
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          String str1 = tt.s0().b().e();
          Objects.requireNonNull(c);
          a0 uoa0 = PatchProxy.applyThreeRefs(activity, uof, str1, c, a.class, "9");
          if (uoa0 != PatchProxyResult.class) {
          }else {
             a.q(activity, "activity");
             a.q(uof, "cameraType");
             c.a();
             c b = a.b;
             if (b == null) {
                a.S("mConfiguration");
             }
             f0 uof0 = b.a();
             if (uof0.a()) {
                uoa0 = uof0.b(activity, uof, str1);
             }else {
                uoa0 = objArray;
             }
          }
          if (uoa0 != null) {
             uoa0 = uoa0.G(a.c());
             if (uoa0 != null) {
                objArray = uoa0.R(new AlbumAssetFragment$m(activity, this), new AlbumAssetFragment$n(this));
             }
          }
          this.y = objArray;
       }
       return;
    }
    public final void Kh(){
       LinearLayout linearLayout;
       RecyclerView recyclerView;
       View view;
       if (PatchProxy.applyVoid(null, this, AlbumAssetFragment.class, "64")) {
          return;
       }
       String str = "AlbumAssetFragment";
       Log.b(str, "updateEmptyViewVisibilityIfNeed");
       LoadingView loadingView = this.qh().k();
       if (loadingView != null) {
          loadingView.setVisibility(8);
       }
       AlbumAssetFragment tw = this.w;
       if (tw == null) {
          a.S("mAssetListAdapter");
       }
       if (tw.P0()) {
          Log.b(str, "emptyView show...."+this.mh());
          this.sh();
          linearLayout = this.qh().m();
          if (linearLayout != null) {
             linearLayout.setVisibility(0);
          }
          recyclerView = this.qh().q();
          if (recyclerView != null) {
             recyclerView.setVisibility(8);
          }
          if (this.R != null) {
             view = this.qh().p();
             if (view != null) {
                view.setVisibility(8);
             }
          }else {
             AlbumAssetFragment tt = this.t;
             if (tt == null) {
                a.S("vm");
             }
             if (!tt.s0().d().h()) {
                view = this.qh().p();
                if (view != null) {
                   view.setVisibility(0);
                }
                view = this.qh().p();
                if (view != null) {
                   view.setOnClickListener(new AlbumAssetFragment$o(this));
                }
             }else {
                view = this.qh().p();
                if (view != null) {
                   view.setVisibility(8);
                }
             }
          }
       }else {
          Log.b(str, "emptyView dismiss...."+this.mh());
          linearLayout = this.qh().m();
          if (linearLayout != null) {
             linearLayout.setVisibility(8);
          }
          recyclerView = this.qh().q();
          if (recyclerView != null) {
             recyclerView.setVisibility(0);
          }
       }
    label_00f1 :
       return;
    }
    public final void Mh(int p0,boolean p1){
       if (PatchProxy.isSupport(AlbumAssetFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, AlbumAssetFragment.class, "95")) {
          return;
       }
       if (this.z != p0 || p1) {
          this.z = p0;
          RecyclerView recyclerView = this.qh().q();
          if (recyclerView != null) {
             RecyclerView$LayoutManager layoutManage = recyclerView.getLayoutManager();
             if (layoutManage != null) {
                layoutManage.scrollToPosition(p0);
             }
          }
          AlbumAssetFragment tt = this.t;
          if (tt == null) {
             a.S("vm");
          }
          tt.D0().onNext(b.g(new b(), this.qh().q(), p0, null, false, 12, null));
       }
       return;
    }
    public boolean Pe(){
       return w.a(this);
    }
    public void Tb(int p0,c p1){
       if (PatchProxy.isSupport(AlbumAssetFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, AlbumAssetFragment.class, "22")) {
          return;
       }
       this.Mh(this.zh(p0), false);
       return;
    }
    public void Ub(c p0){
       c uoc1;
       String str2;
       Object obj = this;
       AlbumSelectedContainer obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, AlbumAssetFragment.class, "52")) {
          return;
       }
       a.q(obj1, "item");
       AlbumAssetFragment t = obj.t;
       String str = "vm";
       if (t == null) {
          a.S(str);
       }
       try{
          if (t.S0()) {
             t = obj.t;
             if (t == null) {
                a.S(str);
             }
             String str1 = t.o0(obj1);
             if (str1 != null) {
                s.h(str1);
                return;
             }else {
                t = obj.t;
                if (t == null) {
                   a.S(str);
                }
                t.T0(obj1);
             }
          }else {
             Fragment parentFragme = this.getParentFragment();
             c uoc = null;
             parentFragme = (parentFragme != null)? parentFragme.getParentFragment(): uoc;
             if (!parentFragme instanceof AlbumFragment) {
                uoc1 = uoc;
             }
             if (uoc1 != null) {
                AlbumAssetFragment t1 = obj.t;
                if (t1 == null) {
                   a.S(str);
                }
                List list = t1.H0(this.nh(), this.mh());
                d.f(obj1.type, obj1.position, "photo");
                t1 = obj.t;
                if (t1 == null) {
                   a.S(str);
                }
                Bundle uBundle = t1.s0().c().b();
                if (uBundle != null) {
                   str2 = uBundle.getString("album_custom_param_page_name");
                   if (str2 != null) {
                   label_009b :
                      a.h(str2, "vm.albumOptionHolder.cus\x20\x02NAME\)\n              ?: \"\"\x00");
                      AbsAlbumAssetFragmentViewBinder uAbsAlbumAss = (str2.length() > 0)? 1: null;
                      if (uAbsAlbumAss) {
                         d.d();
                      }
                      g og = b.g(new b(), this.qh().q(), obj1.position, Float.valueOf(p0.getRatio()), false, 8, null);
                      t1 = obj.t;
                      if (t1 == null) {
                         a.S(str);
                      }
                      if (t1.s0().i().b()) {
                         AlbumAssetFragment t2 = obj.t;
                         if (t2 == null) {
                            a.S(str);
                         }
                         QMedia qMedia = uoc1.b();
                         int i = obj.dh(obj1.position);
                         int i1 = this.nh();
                         obj1 = uoc1.wh();
                         if (obj1 != null) {
                            uoc = obj1.L();
                         }
                         t2.f0(qMedia, i, list, i1, og, null, uoc);
                      }else {
                         AlbumAssetFragment t3 = obj.t;
                         if (t3 == null) {
                            a.S(str);
                         }
                         a$a.b(t3, uoc1.b(), obj.dh(obj1.position), list, this.nh(), og, this, null, 64, null);
                      }
                   }
                }
                str2 = "";
                goto label_009b ;
             }
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
    public void Vg(){
       if (PatchProxy.applyVoid(null, this, AlbumAssetFragment.class, "97")) {
          return;
       }
       AlbumAssetFragment tY = this.Y;
       if (tY != null) {
          tY.clear();
       }
       return;
    }
    public void W6(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumAssetFragment.class, "50")) {
          return;
       }
       a.q(p0, "item");
       AlbumAssetFragment tt = this.t;
       if (tt == null) {
          a.S("vm");
       }
       tt.Z(p0);
       return;
    }
    public b Wg(){
       b uob = PatchProxy.apply(null, this, AlbumAssetFragment.class, "21");
       if (uob == PatchProxyResult.class) {
          AlbumAssetFragment tt = this.t;
          if (tt == null) {
             a.S("vm");
          }
          uob = c.b(tt.s0().n(), AbsAlbumAssetFragmentViewBinder.class, this, 0, 4, null);
       }
       return uob;
    }
    public b Yg(){
       return this.qh();
    }
    public ViewModel Zg(){
       AlbumAssetFragment obj = PatchProxy.apply(null, this, AlbumAssetFragment.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t;
       if (obj == null) {
          a.S("vm");
       }
       return obj;
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, AlbumAssetFragment.class, "39")) {
          return;
       }
       super.n1();
       this.H = false;
       AlbumAssetFragment tw = this.w;
       if (tw == null) {
          a.S("mAssetListAdapter");
       }
       tw.p1();
       Log.g("AlbumAssetFragment", "onPageUnSelect "+this.nh());
       RecyclerView recyclerView = this.qh().q();
       if (recyclerView != null) {
          recyclerView.setNestedScrollingEnabled(false);
       }
       return;
    }
    public final int dh(int p0){
       AlbumAssetFragment obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(AlbumAssetFragment.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, AlbumAssetFragment.class, "18");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       obj = this.w;
       if (obj != null) {
          if (obj == null) {
             a.S("mAssetListAdapter");
          }
          Objects.requireNonNull(obj);
          a uoa = a.class;
          if (PatchProxy.isSupport(uoa)) {
             Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, uoa, "11");
             if (obj1 != patchProxyRe) {
                p0 = obj1.intValue();
             }
          }
          Integer integer = obj.l.get(Integer.valueOf(p0));
          if (integer != null) {
             p0 = integer.intValue();
          }
       }
       return p0;
    }
    public final void eh(int p0){
       if (PatchProxy.isSupport(AlbumAssetFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AlbumAssetFragment.class, "40")) {
          return;
       }
       if (this.q != null) {
          return;
       }
       if (this.getView() == null) {
          return;
       }
       Log.g("AlbumAssetFragment", "addFooter");
       AlbumAssetFragment.Lh(this, true, p0, false, 0, 12, null);
       return;
    }
    public final void fh(){
       if (PatchProxy.applyVoid(null, this, AlbumAssetFragment.class, "70")) {
          return;
       }
       this.yh("cancelScrollToPath....");
       this.E = false;
       this.p = null;
       AlbumAssetFragment tF = this.F;
       if (tF != null) {
          tF.dispose();
       }
       this.x();
       return;
    }
    public final void gh(int p0){
       if (PatchProxy.isSupport(AlbumAssetFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AlbumAssetFragment.class, "74")) {
          return;
       }
       AlbumAssetFragment tt = this.t;
       if (tt == null) {
          a.S("vm");
       }
       if (tt.s0().d().r != null) {
          RecyclerView recyclerView = this.qh().q();
          if (recyclerView != null) {
             recyclerView.post(new AlbumAssetFragment$c(this, p0));
          }
       }
       return;
    }
    public final void hh(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumAssetFragment.class, "62")) {
          return;
       }
       if (p0 != null) {
          AlbumAssetFragment tP = this.P;
          if (tP == null || tP.isDisposed()) {
             p0.a(this.X);
             tP = this.t;
             if (tP == null) {
                a.S("vm");
             }
             Integer integer = tP.s0().m().x();
             if (integer != null) {
                this.P = p0.e(new AlbumAssetFragment$fetchTimeListFromLoader$$inlined$let$lambda$1(this, p0)).subscribe(new AlbumAssetFragment$d(integer.intValue(), this, p0));
             }
          }
       }
       return;
    }
    public final boolean ih(QMedia p0,b p1){
       k obj = PatchProxy.applyTwoRefs(p0, p1, this, AlbumAssetFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = k.a;
       String str = (p1 != null)? p1.c(): null;
       return obj.a(p0, str);
    }
    public final float jh(){
       AlbumAssetFragment obj = PatchProxy.apply(null, this, AlbumAssetFragment.class, "82");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.t;
       if (obj == null) {
          a.S("vm");
       }
       d0 uod0 = obj.s0().c().c();
       float f = 0;
       if (this.vh() && uod0 != null) {
          f = (float)uod0.h();
       }
       return f;
    }
    public final int kh(){
       Object obj = PatchProxy.apply(null, this, AlbumAssetFragment.class, "7");
       if (obj == PatchProxyResult.class) {
          obj = this.o.getValue();
       }
       return obj.intValue();
    }
    public final boolean lh(){
       Object obj = PatchProxy.apply(null, this, AlbumAssetFragment.class, "4");
       if (obj == PatchProxyResult.class) {
          obj = this.l.getValue();
       }
       return obj.booleanValue();
    }
    public final String mh(){
       Object obj = PatchProxy.apply(null, this, AlbumAssetFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
    public final int nh(){
       Object obj = PatchProxy.apply(null, this, AlbumAssetFragment.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.i.getValue();
       }
       return obj.intValue();
    }
    public final int oh(){
       AlbumAssetFragment obj = PatchProxy.apply(null, this, AlbumAssetFragment.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.t;
       String str = "vm";
       if (obj == null) {
          a.S(str);
       }
       boolean b = obj.s0().a();
       AlbumAssetFragment tt = this.t;
       if (tt == null) {
          a.S(str);
       }
       if (tt.s0().r()) {
          b = b + 1;
       }
       return b;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumAssetFragment.class, "23")) {
          return;
       }
       super.onActivityCreated(p0);
       boolean booleanx = (p0 != null)? p0.getBoolean("load_finish_state"): false;
       this.r = booleanx;
       return;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       long l;
       String absolutePath;
       long l1;
       ExifInterface uExifInterfa;
       Object obj = this;
       v0 obj1 = p2;
       if (PatchProxy.isSupport(AlbumAssetFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, AlbumAssetFragment.class, "26")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (p1 != -1) {
          return;
       }
       if (p0 == 256 && !PatchProxy.applyVoidOneRefs(obj1, obj, AlbumAssetFragment.class, "77")) {
          AlbumAssetFragment i = obj.I;
          Object[] objArray = null;
          if (i != null) {
             if (u.S1(i) ^ 0x01) {
                obj1 = new v0(this.getContext(), i, super(obj));
                if (!PatchProxy.applyVoid(objArray, obj1, v0.class, "1")) {
                   obj1.a.connect();
                }
             }
          }else if(obj1 != null){
             i = obj.t;
             if (i == null) {
                a.S("vm");
             }
             String dataString = p2.getDataString();
             Objects.requireNonNull(i);
             if (!PatchProxy.applyVoidOneRefs(dataString, i, d.class, "35") && dataString != null) {
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                j oj = j.class;
                QMedia qMedia = PatchProxy.applyOneRefs(dataString, objArray, oj, "10");
                if (qMedia != patchProxyRe) {
                }else {
                   try{
                      a.q(dataString, "photoPath");
                      File uFile = new File(dataString);
                      l = (long)uFile.hashCode();
                      absolutePath = uFile.getAbsolutePath();
                      l1 = uFile.lastModified();
                      String absolutePath1 = uFile.getAbsolutePath();
                      a.h(absolutePath1, "file.absolutePath");
                      if (PatchProxy.isSupport(oj)) {
                         long SimpleDateFormat oj1 = PatchProxy.applyTwoRefs(Long.valueOf(l1), absolutePath1, objArray, oj, "9");
                         if (oj1 != patchProxyRe) {
                            oj1 = oj1.longValue();
                         label_010b :
                            l1 = oj1;
                         }else {
                         label_00d9 :
                            a.q(absolutePath1, "filePath");
                            oj1 = n0.c("yyyy:MM:dd HH:mm:ss");
                            try{
                               uExifInterfa = new ExifInterface(absolutePath1);
                            }catch(java.io.IOException e0){
                               Log.k(e0);
                            }
                            if (uExifInterfa != null) {
                               String attribute = uExifInterfa.getAttribute("DateTime");
                               if (!TextUtils.isEmpty(attribute)) {
                                  Date uDate = oj1.parse(attribute);
                                  a.h(uDate, "sDateFormat.parse\(dateStr\)");
                                  oj1 = uDate.getTime();
                                  goto label_010b ;
                               }
                            }
                         }
                      }else {
                         goto label_00d9 ;
                      }
                   }catch(java.text.ParseException e0){
                      Log.k(e0);
                   }
                   QMedia qMedia1 = new QMedia(l, absolutePath, 0, l1, 0);
                   qMedia = v6;
                }
                i.Z(qMedia);
                Log.b("AlbumAssetViewModel", "addPhotoToListIfNeed path = "+dataString);
             }
          }
       }
    label_0134 :
       return;
    }
    public void onBindClickEvent(){
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumAssetFragment.class, "12")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          ViewModel viewModel = ViewModelProviders.of(activity).get(d.class);
          a.h(viewModel, "ViewModelProviders.of\(it…setViewModel::class.java\)");
          this.t = viewModel;
       }
       super.onCreate(p0);
       AlbumAssetFragment tt = this.t;
       String str = "vm";
       if (tt == null) {
          a.S(str);
       }
       this.p = tt.s0().m().p();
       boolean b = true;
       this.B = b;
       if (!this.getParentFragment() instanceof AlbumHomeFragment) {
          b.a(new RuntimeException("AlbumAssetFragment wrong parent fragment, parent ="+this.getParentFragment()));
          return;
       }else {
          Log.b("AlbumAssetFragment_LIFE", "onCreate "+this.nh()+' '+this.mh()+", f="+this.hashCode());
          Boolean uBoolean = PatchProxy.apply(null, this, AlbumAssetFragment.class, "5");
          if (uBoolean == PatchProxyResult.class) {
             uBoolean = this.m.getValue();
          }
          if (uBoolean.booleanValue()) {
             AlbumAssetFragment tt1 = this.t;
             if (tt1 == null) {
                a.S(str);
             }
             if (tt1.s0().m().d0 != null) {
                this.C = b;
             }
          }
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          this.R = tt.K0(this.getActivity());
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          tt.C0().observe(this, new AlbumAssetFragment$i(this));
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          this.S = tt.v0().getValue();
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          tt.v0().observe(this, new AlbumAssetFragment$j(this));
          return;
       }
    }
    public Animation onCreateAnimation(int p0,boolean p1,int p2){
       if (PatchProxy.isSupport(AlbumAssetFragment.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Integer.valueOf(p2), this, AlbumAssetFragment.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!p1 && this.getParentFragment() != null) {
          AlphaAnimation uAlphaAnimat = new AlphaAnimation(0x3f800000, 0x3f800000);
          uAlphaAnimat.setDuration((long)300);
          return uAlphaAnimat;
       }else {
          return super.onCreateAnimation(p0, p1, p2);
       }
    }
    public void onDestroy(){
       Object[] objArray;
       long l;
       if (PatchProxy.applyVoid(null, this, AlbumAssetFragment.class, "17")) {
          return;
       }
       super.onDestroy();
       Log.g("AlbumAssetFragment_LIFE", "onDestroy mType="+this.nh()+" , mSceneType="+this.mh()+", f="+this.hashCode());
       AlbumAssetFragment tw = this.w;
       if (tw != null) {
          if (tw == null) {
             a.S("mAssetListAdapter");
          }
          Objects.requireNonNull(tw);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          f uof = f.class;
          if (!PatchProxy.applyVoid(null, tw, a.class, "32")) {
             a o = tw.o;
             Objects.requireNonNull(o);
             a obj = PatchProxy.apply(null, o, uof, "2");
             int i1 = (obj != patchProxyRe)? obj.intValue(): o.a.get();
             obj = tw.o;
             Objects.requireNonNull(obj);
             Object obj1 = PatchProxy.apply(null, obj, uof, "3");
             String str = null;
             if (obj1 != patchProxyRe) {
                l = obj1.longValue();
             }else {
                int i2 = obj.a.get();
                long l1 = obj.b.get();
                l = (i2 > 0)? l1 / (long)i2: str;
             }
             if (PatchProxy.isSupport(d.class) && (!PatchProxy.applyVoidThreeRefs(Integer.valueOf(i1), Long.valueOf(l), Boolean.TRUE, null, d.class, "8") && l - str > 0)) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.a0("totalCnt", Integer.valueOf(i1));
                jsonObject.a0("averageTimeMs", Long.valueOf(l));
                jsonObject.H("isNewUi", Boolean.TRUE);
                a.c.f().logCustomEvent("album_video_thumbnail_decode_time", jsonObject.toString());
             }
             tw.f1();
          }
       }
       int i = this.nh();
       if (i) {
          if (i != 1) {
             if (i != 2) {
                if (i == 4) {
                   tw = this.O;
                   if (!tw instanceof p) {
                      objArray = null;
                   }
                   if (objArray != null) {
                      objArray.close();
                   }
                }
             }else {
                tw = this.O;
                if (!tw instanceof AssetsLoaderImpl) {
                   objArray = null;
                }
                if (objArray != null) {
                   objArray.close();
                }
             }
          }else {
             tw = this.O;
             if (!tw instanceof ImageLoaderImpl) {
                objArray = null;
             }
             if (objArray != null) {
                objArray.close();
             }
          }
       }else {
          tw = this.O;
          if (!tw instanceof VideoLoaderImpl) {
             objArray = null;
          }
          if (objArray != null) {
             objArray.close();
          }
       }
    label_013f :
       tw = this.P;
       if (tw != null) {
          tw.dispose();
       }
       this.P = null;
       tw = this.y;
       if (tw != null) {
          tw.dispose();
       }
       this.y = null;
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, AlbumAssetFragment.class, "16")) {
          return;
       }
       AlbumAssetFragment tO = this.O;
       if (tO != null) {
          tO.g(this.X);
       }
       tO = this.x;
       if (tO != null) {
          tO.dispose();
       }
       tO = this.U;
       if (tO != null) {
          tO.dispose();
       }
       super.onDestroyView();
       Log.g("AlbumAssetFragment_LIFE", "onDestroyView mType="+this.nh()+" , mSceneType="+this.mh()+", f="+this.hashCode());
       this.Vg();
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(AlbumAssetFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AlbumAssetFragment.class, "25")) {
          return;
       }
       super.onHiddenChanged(p0);
       if (!p0 && this.s != null) {
          p0 = false;
          this.s = p0;
          LoadingView loadingView = this.qh().k();
          if (loadingView != null) {
             Object obj = null;
             if (!PatchProxy.isSupport(LoadingView.class) || !PatchProxy.applyVoidTwoRefs(Boolean.TRUE, obj, loadingView, LoadingView.class, "3")) {
                if (loadingView.b == null) {
                   loadingView.a();
                }
                loadingView.setVisibility(p0);
                LoadingView b = loadingView.b;
                try{
                   b.setVisibility(p0);
                   loadingView.c.setText(obj);
                }catch(java.lang.Exception e3){
                   e3.printStackTrace();
                }
                loadingView.c.setCompoundDrawablesWithIntrinsicBounds(p0, p0, p0, p0);
                if (TextUtils.isEmpty(obj)) {
                   loadingView.c.setVisibility(8);
                }else {
                   loadingView.c.setVisibility(p0);
                }
             }
          }
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, AlbumAssetFragment.class, "14")) {
          return;
       }
       Log.g("AlbumAssetFragment", "onResume mType="+this.nh()+" , mSceneType="+this.mh());
       super.onResume();
       if (this.R == null) {
          AlbumAssetFragment tt = this.t;
          if (tt == null) {
             a.S("vm");
          }
          if (tt.K0(this.getActivity())) {
             this.R = true;
             this.Dh();
          }
       }
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumAssetFragment.class, "24")) {
          return;
       }
       a.q(p0, "outState");
       super.onSaveInstanceState(p0);
       p0.putBoolean("load_finish_state", this.r);
       return;
    }
    public void onStop(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AlbumAssetFragment.class, "54")) {
          return;
       }
       super.onStop();
       if (!PatchProxy.applyVoid(objArray, this, AlbumAssetFragment.class, "93")) {
          LoadingView loadingView = this.qh().k();
          if (loadingView != null && !loadingView.getVisibility()) {
             loadingView = this.qh().k();
             if (loadingView != null) {
                loadingView.setVisibility(8);
             }
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       AlbumAssetFragment t;
       int b2;
       RecyclerView recyclerView1;
       int i;
       b$a a;
       boolean paddingTop;
       String this;
       boolean b = this;
       Bundle obj = p0;
       if (PatchProxy.applyVoidTwoRefs(obj, p1, b, AlbumAssetFragment.class, "13")) {
          return;
       }
       a.q(obj, "view");
       super.onViewCreated(p0, p1);
       Log.g("AlbumAssetFragment_LIFE", "onViewCreated mType="+this.nh()+" , mSceneType="+this.mh()+", f="+this.hashCode());
       b.s = true;
       Object[] objArray = null;
       boolean b1 = false;
       if (!PatchProxy.applyVoid(objArray, b, AlbumAssetFragment.class, "87")) {
          Log.b("AlbumAssetFragment", "initRecyclerView "+this.nh());
          i = this.kh();
          AlbumAssetFragment t1 = b.t;
          if (t1 == null) {
             a.S("vm");
          }
          b$a uoa = b.b(i, t1.s0().m().i());
          a = uoa.a;
          int i1 = i.c(R.dimen.arg_RES_7f0704eb);
          b.u = uoa.c;
          b2 = 2;
          b.v = Math.max(((i.j() / b.u) / b2), b2);
          recyclerView1 = this.qh().q();
          if (recyclerView1 != null) {
             int paddingLeft = recyclerView1.getPaddingLeft();
             paddingTop = recyclerView1.getPaddingTop();
             int right = recyclerView1.getRight();
             int bottom = recyclerView1.getBottom();
             AlbumAssetFragment t2 = b.t;
             if (t2 == null) {
                a.S("vm");
             }
             recyclerView1.setPadding(paddingLeft, paddingTop, right, (bottom + t2.s0().m().a()));
          }
          RecyclerView recyclerView2 = this.qh().q();
          if (recyclerView2 != null) {
             recyclerView2.setItemAnimator(objArray);
             v ov = new v(a, this.kh(), b.C);
             ov.a = b1;
             AlbumAssetFragment t3 = b.t;
             if (t3 == null) {
                a.S("vm");
             }
             ov.b = t3.s0().r();
             recyclerView2.addItemDecoration(ov);
             recyclerView2.addItemDecoration(new a(this.kh(), b1, b2, objArray));
             NpaGridLayoutManager npaGridLayou = new NpaGridLayoutManager(recyclerView2.getContext(), this.kh());
             npaGridLayou.m1(new a(recyclerView2, b, a, i1));
             recyclerView2.setLayoutManager(npaGridLayou);
             recyclerView2.setHasFixedSize(true);
             recyclerView2.getRecycledViewPool().k(true, b.W);
             recyclerView2.setItemViewCacheSize(b.W);
             t = b.t;
             if (t == null) {
                a.S("vm");
             }
             paddingTop = t.s0().e().v();
             t3 = b.t;
             if (t3 == null) {
                a.S("vm");
             }
             Number number = PatchProxy.apply(objArray, b, AlbumAssetFragment.class, "3");
             if (number == PatchProxyResult.class) {
                number = b.k.getValue();
             }
             RecyclerView recyclerView3 = recyclerView2;
             a uoa1 = new a(this, t3, paddingTop, number.intValue(), b.u, a, this, b.C, i1, this.kh());
             b.w = v8;
             this = "mAssetListAdapter";
             if (this.lh()) {
                t = b.w;
                if (t == null) {
                   a.S(this);
                }
                t.o1();
                b.H = true;
             }
             t = b.w;
             if (t == null) {
                a.S(this);
             }
             recyclerView3.setAdapter(t);
          }
          t = b.t;
          if (t == null) {
             a.S("vm");
          }
          t.R0().observe(b, super(b));
          t = b.t;
          if (t == null) {
             a.S("vm");
          }
          t.P0().observe(b, new c(b));
       }
       this.Fh();
       obj = this.getArguments();
       if (obj != null) {
          RecyclerView recyclerView = this.qh().q();
          if (recyclerView != null) {
             recyclerView.setNestedScrollingEnabled(obj.getBoolean("NestedScrollingEnabled"));
          }
       }
       t = b.t;
       if (t == null) {
          a.S("vm");
       }
       List list = t.m();
       if (list != null && (list.isEmpty() ^ true) == 1) {
          b.eh(i.c(R.dimen.arg_RES_7f0704f2));
       }
       t = b.t;
       if (t == null) {
          a.S("vm");
       }
       e0 uoe0 = t.s0().c().a();
       if (uoe0 != null) {
          if (!(uoe0.k3() ^ true)) {
             uoe0 = null;
          }
          if (uoe0 != null) {
             t = b.t;
             if (t == null) {
                a.S("vm");
             }
             uoe0 = t.s0().c().a();
             if (uoe0 == null) {
                a.L();
             }
             b.eh(i.d(uoe0.Se()));
          }
       }
       t = b.t;
       if (t == null) {
          a.S("vm");
       }
       b.x = t.m.subscribe(new AlbumAssetFragment$k(b));
       if (this.lh()) {
          b.ah(this.nh());
          AlbumAssetFragment.xh(b, false, true, null);
       }else {
          b.G = true;
          t = b.t;
          if (t == null) {
             a.S("vm");
          }
          if (t.s0().d().c() && this.nh() == 3) {
             AlbumAssetFragment.xh(b, false, true, null);
          }
       }
       if (this.Bh()) {
          b2 = true;
          t = b.t;
          if (t == null) {
             a.S("vm");
          }
          AlbumAssetFragment.Lh(this, b2, t.s0().m().s(), false, 0, 12, null);
       }
       recyclerView1 = this.qh().q();
       if (recyclerView1 != null) {
          AlbumAssetFragment$l ol = new AlbumAssetFragment$l(b);
          if (!PatchProxy.applyVoidOneRefs(ol, recyclerView1, UserTouchRecyclerView.class, "10")) {
             a.q(ol, "listener");
             recyclerView1.getOnScrollListenerList().add(ol);
          }
          return;
       }else {
          throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.widget.UserTouchRecyclerView");
       }
    }
    public final float ph(){
       Object obj = PatchProxy.apply(null, this, AlbumAssetFragment.class, "83");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float f = this.jh();
       float f1 = (this.C != null)? (float)i.c(0x7f0704eb): 0;
       Log.g("AlbumAssetFragment", "topBannerPaddingStart="+f+", dividerPaddingStart="+f1);
       return (f + f1);
    }
    public void qd(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AlbumAssetFragment.class, "48")) {
          return;
       }
       AlbumAssetFragment tt = this.t;
       String str = "vm";
       if (tt == null) {
          a.S(str);
       }
       if (!tt.r()) {
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          tt.Q().setValue(new Pair(Integer.valueOf(-1), objArray));
          return;
       }else if(PatchProxy.applyVoid(objArray, this, AlbumAssetFragment.class, "75")){
          a obj = PatchProxy.apply(objArray, this, AlbumAssetFragment.class, "78");
          str = "android.permission.CAMERA";
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             FragmentActivity activity = this.getActivity();
             if (activity != null) {
                a.h(activity, "it");
                b = a.c.g().h(activity, str);
             }else {
                b = false;
             }
          }
          if (b) {
             this.Jh();
          }else {
             obj = a.c;
             t ot = obj.g().a(this, str);
             if (ot != null) {
                t ot1 = ot.observeOn(obj.i().b());
                if (ot1 != null) {
                   ot1.subscribe(new h(this), i.b);
                }
             }
          }
       }
    label_0095 :
       return;
    }
    public AbsAlbumAssetFragmentViewBinder qh(){
       b obj = PatchProxy.apply(null, this, AlbumAssetFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Xg();
       if (obj != null) {
          return obj;
       }
       throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetFragmentViewBinder");
    }
    public final d rh(){
       AlbumAssetFragment obj = PatchProxy.apply(null, this, AlbumAssetFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t;
       if (obj == null) {
          a.S("vm");
       }
       return obj;
    }
    public final void sh(){
       boolean b;
       TextView textView1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AlbumAssetFragment.class, "92")) {
          return;
       }
       Log.b("AlbumAssetFragment", "initEmptyView "+this.nh());
       int i = 0x7f081b03;
       if (this.nh()) {
          if (this.Ah()) {
             ImageView imageView = this.qh().l();
             if (imageView != null) {
                imageView.setImageResource(i);
             }
          }
          TextView textView = this.qh().o();
          i = 1;
          String str = "vm";
          if (textView != null) {
             String str1 = PatchProxy.apply(objArray, this, AlbumAssetFragment.class, "88");
             if (str1 != patchProxyRe) {
             }else {
                str1 = this.getString(R.string.arg_RES_7f1018ab);
                a.h(str1, "getString\(R.string.ksalbum_no_image_found\)");
                AlbumAssetFragment tt1 = this.t;
                if (tt1 == null) {
                   a.S(str);
                }
                k g = tt1.s0().m().g;
                if (g != null) {
                   int i1 = (g.length() > 0)? 1: 0;
                   if (!i1) {
                      g = objArray;
                   }
                   if (g != null) {
                      str1 = g;
                   }
                }
             }
             textView.setText(str1);
          }
          AlbumAssetFragment obj = PatchProxy.apply(objArray, this, AlbumAssetFragment.class, "90");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             obj = this.t;
             if (obj == null) {
                a.S(str);
             }
             b = obj.s0().m().i;
          }
          if (b != null) {
             textView = this.qh().o();
             if (textView != null) {
                textView.setTextColor(this.getResources().getColor(R.color.arg_RES_7f060b46));
             }
             textView = this.qh().n();
             if (textView != null) {
                Object[] objArray1 = PatchProxy.apply(objArray, this, AlbumAssetFragment.class, "89");
                if (objArray1 != patchProxyRe) {
                }else {
                   String str2 = this.getString(R.string.arg_RES_7f1018d9);
                   a.h(str2, "getString\(R.string.ksalb…are_no_photos_within_24h\)");
                   AlbumAssetFragment tt = this.t;
                   if (tt == null) {
                      a.S(str);
                   }
                   k h = tt.s0().m().h;
                   if (h != null) {
                      if (h.length() <= 0) {
                         i = 0;
                      }
                      if (i) {
                         objArray = h;
                      }
                      if (objArray != null) {
                         objArray1 = objArray;
                      }
                   }
                   objArray1 = str2;
                }
                textView.setText(objArray1);
             }
             textView1 = this.qh().n();
             if (textView1 != null) {
                textView1.setVisibility(0);
             }
          }
       }else if(this.Ah()){
          ImageView imageView1 = this.qh().l();
          if (imageView1 != null) {
             imageView1.setImageResource(i);
          }
       }
       textView1 = this.qh().o();
       if (textView1 != null) {
          textView1.setText(this.getString(R.string.arg_RES_7f1018ae));
       }
    label_014b :
       return;
    }
    public final void th(int p0,List p1){
       SliderPositionerLayout g;
       if (PatchProxy.isSupport(AlbumAssetFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, AlbumAssetFragment.class, "79")) {
          return;
       }
       String str = "AlbumAssetFragment";
       Log.g(str, this.mh()+" initSlider sliderType="+p0+", timeList.size="+p1.size());
       if (this.lh() && (this.L != null && this.M == null)) {
          return;
       }
       if (p1.isEmpty()) {
          return;
       }
       if (!PatchProxy.isSupport(AlbumAssetFragment.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, AlbumAssetFragment.class, "80")) {
          Log.g(str, "initSliderLayout");
          boolean b = false;
          this.K = b;
          AbsAlbumAssetFragmentViewBinder a = this.qh().a;
          if (a != null && this.qh().q() != null) {
             Object[] objArray = null;
             ViewGroup viewGroup = (!a instanceof ViewGroup)? objArray: a;
             if (viewGroup != null) {
                AlbumAssetFragment tJ = this.J;
                if (tJ != null) {
                   if (!PatchProxy.applyVoid(objArray, tJ, SliderPositionerLayout.class, "16")) {
                      SliderPositionerLayout g1 = tJ.g;
                      if (g1 == null) {
                         a.S("targetRecycler");
                      }
                      g1.removeOnScrollListener(tJ.B);
                      tJ.n.getSliderStateListeners().remove(tJ.C);
                      tJ.w = objArray;
                   }
                   viewGroup.removeView(this.J);
                }
                Context context = a.getContext();
                a.h(context, "context");
                SliderPositionerLayout sliderPositi = new SliderPositionerLayout(context, p0);
                this.J = sliderPositi;
                sliderPositi.setStartPadding(this.ph());
                Ref$ObjectRef objectRef = new Ref$ObjectRef();
                objectRef.element = objArray;
                int i = -1;
                if (viewGroup instanceof RelativeLayout) {
                   RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(i, i);
                   layoutParams.addRule(11);
                   objectRef.element = layoutParams;
                }else if(viewGroup instanceof FrameLayout){
                   FrameLayout$LayoutParams layoutParams1 = new FrameLayout$LayoutParams(i, i);
                   layoutParams1.gravity = 5;
                   objectRef.element = layoutParams1;
                }
                AlbumAssetFragment tJ1 = this.J;
                if (tJ1 != null) {
                   tJ1.setLayoutParams(objectRef.element);
                   AlbumAssetFragment tt = this.t;
                   String str1 = "vm";
                   if (tt == null) {
                      a.S(str1);
                   }
                   tJ1.l = tt.s0().m().h();
                   tJ1.h = this.C;
                   tt = this.t;
                   if (tt == null) {
                      a.S(str1);
                   }
                   tJ1.i = tt.s0().a();
                   tJ1.j = this.vh();
                   tJ1.setHeaderHeight(this.jh());
                   RecyclerView recyclerView = this.qh().q();
                   if (recyclerView == null) {
                      a.L();
                   }
                   tJ = PatchProxy.applyOneRefs(recyclerView, tJ1, SliderPositionerLayout.class, "3");
                   if (tJ != PatchProxyResult.class) {
                   }else {
                      a.q(recyclerView, "recyclerView");
                      tJ1.g = recyclerView;
                      tJ = tJ1;
                   }
                   tJ.setEmmitRecyclerScrollThreshold((this.u / 8));
                   d uod = new d(tJ1, objectRef, viewGroup, this, p0, p1);
                   tJ1.setReadyCallback(recyclerView);
                   viewGroup.addView(tJ1);
                   if (!PatchProxy.applyVoidOneRefs(p1, tJ1, SliderPositionerLayout.class, "7")) {
                      a.q(p1, "timeList");
                      Log.g("Slider", "refresh");
                      boolean booleanx = tJ1.t.getBoolean("album_show_slider_guide", true);
                      tJ1.u = booleanx;
                      if (booleanx) {
                         g.a(tJ1.t.edit().putBoolean("album_show_slider_guide", b));
                      }
                      g = tJ1.g;
                      if (g == null) {
                         a.S("targetRecycler");
                      }
                      ViewTreeObserver viewTreeObse = g.getViewTreeObserver();
                      viewTreeObse.addOnGlobalLayoutListener(new c(tJ1, p1, viewTreeObse));
                   }
                }
             }
          }
       }
    label_01c9 :
       return;
    }
    public void u(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AlbumAssetFragment.class, "35")) {
          return;
       }
       super.n1();
       Log.g("AlbumAssetFragment", "onPageSelect "+this.nh()+"， "+this.mh());
       this.H = true;
       RecyclerView recyclerView = this.qh().q();
       if (recyclerView != null) {
          recyclerView.setNestedScrollingEnabled(true);
       }
       AlbumAssetFragment tw = this.w;
       String str = "mAssetListAdapter";
       if (tw == null) {
          a.S(str);
       }
       tw.o1();
       this.Eh();
       if (a.g(this.mh(), "tab_all") ^ true) {
          tw = this.t;
          if (tw == null) {
             a.S("vm");
          }
          if (tw.s0().d().c()) {
             tw = this.O;
             if (tw != null && tw.b() == true) {
                this.wh(true);
             }else if(this.G != null){
                this.G = false;
                this.yh("onPageSelect, need to refresh");
                this.wh(true);
             }else {
                this.yh("onPageSelect, check and refresh");
                tw = this.O;
                if (tw != null) {
                   f$b.a(tw, false, true, objArray);
                }
                tw = this.w;
                if (tw == null) {
                   a.S(str);
                }
                if (tw.i1()) {
                   if (!PatchProxy.applyVoid(objArray, this, AlbumAssetFragment.class, "69")) {
                      this.yh("enableScrollToPath....");
                      this.E = true;
                   }
                   this.Hh();
                }
             }
          }else {
             goto label_0086 ;
          }
       }else {
          goto label_0086 ;
       }
       return;
    }
    public final void uh(){
       if (PatchProxy.applyVoid(null, this, AlbumAssetFragment.class, "60")) {
          return;
       }
       AlbumAssetFragment tt = this.t;
       String str = "vm";
       if (tt == null) {
          a.S(str);
       }
       Integer integer = tt.s0().m().x();
       if (integer != null) {
          int i = integer.intValue();
          AlbumAssetFragment tw = this.w;
          if (tw == null) {
             a.S("mAssetListAdapter");
          }
          List list = tw.O0();
          a.h(list, "mAssetListAdapter.list");
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = a0.a1(list, QMedia.class).iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             Object obj1 = obj;
             AlbumAssetFragment tt1 = this.t;
             if (tt1 == null) {
                a.S(str);
             }
             if (this.ih(obj1, tt1.v0().getValue())) {
                uArrayList.add(obj);
             }
          }
          ArrayList uArrayList1 = new ArrayList(u.Y(uArrayList, 10));
          iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             uArrayList1.add(Long.valueOf(iterator.next().mModified));
          }
          this.th(i, uArrayList1);
       }
       return;
    }
    public void vb(int p0){
       List obj;
       QMedia qMedia;
       CharSequence uCharSequenc1;
       String str2;
       CharSequence uCharSequenc2;
       d uod = d.class;
       if (PatchProxy.isSupport(AlbumAssetFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AlbumAssetFragment.class, "51")) {
          return;
       }
       p0 = this.dh(p0);
       int i = 0;
       int i1 = (p0 < 0)? 0: p0;
       if (this.getActivity() != null) {
          AlbumAssetFragment tt = this.t;
          String str = "vm";
          if (tt == null) {
             a.S(str);
          }
          try{
             CharSequence uCharSequenc = null;
             if (tt.S0()) {
                tt = this.t;
                if (tt == null) {
                   a.S(str);
                }
                i = this.nh();
                String str1 = this.mh();
                Objects.requireNonNull(tt);
                if (PatchProxy.isSupport(uod)) {
                   obj = PatchProxy.applyThreeRefs(Integer.valueOf(i), Integer.valueOf(i1), str1, tt, d.class, "21");
                   if (obj != PatchProxyResult.class) {
                      uCharSequenc = obj;
                   }else {
                   label_006b :
                      QMedia qMedia1 = tt.G0(i, i1, str1);
                      if (qMedia1 != null) {
                         tt.o0(qMedia1);
                      }
                   }
                }else {
                   goto label_006b ;
                }
                if (uCharSequenc != null) {
                   s.h(uCharSequenc);
                   return;
                }else {
                   tt = this.t;
                   if (tt == null) {
                      a.S(str);
                   }
                   i = this.nh();
                   str = this.mh();
                   Objects.requireNonNull(tt);
                   if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(i), Integer.valueOf(i1), str, tt, d.class, "29")) {
                      qMedia = tt.G0(i, i1, str);
                      if (qMedia != null) {
                         tt.T0(qMedia);
                      }
                   }
                }
             }else {
                Fragment parentFragme = this.getParentFragment();
                parentFragme = (parentFragme != null)? parentFragme.getParentFragment(): uCharSequenc;
                if (!parentFragme instanceof AlbumFragment) {
                   uCharSequenc1 = uCharSequenc;
                }
                if (uCharSequenc1 != null) {
                   AlbumAssetFragment tt1 = this.t;
                   if (tt1 == null) {
                      a.S(str);
                   }
                   obj = tt1.H0(this.nh(), this.mh());
                   qMedia = (obj != null)? obj.get(i1): uCharSequenc;
                   if (qMedia != null) {
                      d.f(qMedia.type, i1, "photo");
                      tt1 = this.t;
                      if (tt1 == null) {
                         a.S(str);
                      }
                      Bundle uBundle = tt1.s0().c().b();
                      if (uBundle != null) {
                         str2 = uBundle.getString("album_custom_param_page_name");
                         if (str2 != null) {
                         label_010e :
                            a.h(str2, "vm.albumOptionHolder.cus\x20\x02ME\)\n                ?: \"\"\x00");
                            if (str2.length() > 0) {
                               i = 1;
                            }
                            if (i) {
                               d.d();
                            }
                            b uob = new b();
                            RecyclerView recyclerView = this.qh().q();
                            int i2 = i1 + this.oh();
                            qMedia = obj.get(i1);
                            Float uFloat = (qMedia != null)? Float.valueOf(qMedia.getRatio()): uCharSequenc;
                            g og = b.g(uob, recyclerView, i2, uFloat, false, 8, null);
                            tt1 = this.t;
                            if (tt1 == null) {
                               a.S(str);
                            }
                            if (tt1.s0().i().b()) {
                               tt1 = this.t;
                               if (tt1 == null) {
                                  a.S(str);
                               }
                               AlbumBaseFragment uAlbumBaseFr = uCharSequenc1.b();
                               int i3 = this.nh();
                               AlbumSelectedContainer uAlbumSelect = uCharSequenc1.wh();
                               c uoc = (uAlbumSelect != null)? uAlbumSelect.L(): uCharSequenc;
                               tt1.f0(uAlbumBaseFr, i1, obj, i3, og, null, uoc);
                            }else {
                               tt1 = this.t;
                               if (tt1 == null) {
                                  a.S(str);
                               }
                               a$a.b(tt1, uCharSequenc1.b(), i1, obj, this.nh(), og, this, null, 64, null);
                            }
                         }
                      }
                      str2 = "";
                      goto label_010e ;
                   }else {
                      throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.models.QMedia");
                   }
                }
             }
          }catch(java.lang.Exception e14){
             e14.printStackTrace();
          }
       }
    }
    public final boolean vh(){
       AlbumAssetFragment obj = PatchProxy.apply(null, this, AlbumAssetFragment.class, "81");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.t;
       String str = "vm";
       if (obj == null) {
          a.S(str);
       }
       boolean b = obj.s0().o();
       AlbumAssetFragment tt = this.t;
       if (tt == null) {
          a.S(str);
       }
       d0 uod0 = tt.s0().c().c();
       AlbumAssetFragment tt1 = this.t;
       if (tt1 == null) {
          a.S(str);
       }
       Boolean value = tt1.P0().getValue();
       if (value == null) {
          value = Boolean.FALSE;
       }
       a.h(value, "vm.isHeaderListContainerShow.value ?: false");
       boolean b1 = value.booleanValue();
       boolean b2 = q.a.m(Integer.valueOf(this.nh()), this.mh());
       b = (b && (uod0 != null && (b1 && b2)))? true: false;
       return b;
    }
    public void w6(int p0){
       if (PatchProxy.isSupport(AlbumAssetFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AlbumAssetFragment.class, "53")) {
          return;
       }
       RecyclerView recyclerView = this.qh().q();
       if (recyclerView != null) {
          RecyclerView$ViewHolder viewHolder = recyclerView.findViewHolderForAdapterPosition(p0);
          if (viewHolder != null && (viewHolder instanceof c && viewHolder.e() instanceof MultiSelectAlbumAssetItemViewBinder)) {
             viewHolder.e().w(true);
             CompatImageView uCompatImage = viewHolder.e().p();
             if (uCompatImage != null) {
                uCompatImage.performClick();
             }
          }
       }
       return;
    }
    public final void wh(boolean p0){
       int i;
       Object[] obj;
       int i2;
       AlbumAssetFragment obj1;
       if (PatchProxy.isSupport(AlbumAssetFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AlbumAssetFragment.class, "59")) {
          return;
       }
       this.yh("loadFirstPageMedias\(\) ,isRefresh = "+p0);
       AlbumAssetFragment tt = this.t;
       String str = "vm";
       if (tt == null) {
          a.S(str);
       }
       if (tt.K0(this.getActivity())) {
          tt = this.w;
          String str1 = "mAssetListAdapter";
          if (tt == null) {
             a.S(str1);
          }
          tt.Z0();
          tt = this.w;
          if (tt == null) {
             a.S(str1);
          }
          tt.b1();
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, AlbumAssetFragment.class, "37")) {
             tt = this.O;
             if (tt != null) {
                tt.g(this.X);
             }
             i = this.nh();
             String str2 = this.mh();
             AlbumAssetFragment tt2 = this.t;
             if (tt2 == null) {
                a.S(str);
             }
             this.O = a.a(i, str2, tt2.s0().e());
          }
          i = this.nh();
          int i1 = 2;
          if (i) {
             if (i != 1) {
                if (i != i1) {
                   if (i == 4) {
                      tt = this.O;
                      if (!tt instanceof p) {
                         obj = objArray;
                      }
                      if (obj != null) {
                         obj.n();
                      }
                   }
                }else {
                   tt = this.O;
                   if (!tt instanceof AssetsLoaderImpl) {
                      obj = objArray;
                   }
                   if (obj != null) {
                      obj.m();
                   }
                }
             }else {
                tt = this.O;
                if (!tt instanceof ImageLoaderImpl) {
                   obj = objArray;
                }
                if (obj != null) {
                   obj.m();
                }
             }
          }else {
             tt = this.O;
             if (!tt instanceof VideoLoaderImpl) {
                obj = objArray;
             }
             if (obj != null) {
                obj.m();
             }
          }
       label_00d1 :
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          if (tt.s0().d().c() && (a.g(this.mh(), "tab_all") ^ 1)) {
             AlbumAssetFragment tO = this.O;
             if (tO != null && (!p0 || tO.b())) {
                Log.g("AlbumAssetFragment", "start load all media...."+this.mh());
                tt = this.U;
                if (tt != null) {
                   tt.dispose();
                }
                Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
                uBooleanRef.element = true;
                a c = a.c;
                this.U = f$b.b(tO, 0, 0, null, 7, null).subscribeOn(c.i().c()).observeOn(c.i().b()).compose(this.ge()).doOnNext(new AlbumAssetFragment$e(uBooleanRef, this, p0)).doOnComplete(new AlbumAssetFragment$f(this, p0)).subscribe(AlbumAssetFragment$g.b, AlbumAssetFragment$h.b);
             }
          }else {
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             obj = PatchProxy.apply(objArray, this, AlbumAssetFragment.class, "67");
             if (obj != patchProxyRe) {
                i2 = obj.intValue();
             }else {
                obj = PatchProxy.apply(objArray, this, AlbumAssetFragment.class, "66");
                if (obj != patchProxyRe) {
                   i2 = obj.intValue();
                }else {
                   AlbumAssetFragment tt1 = this.t;
                   if (tt1 == null) {
                      a.S(str);
                   }
                   i2 = tt1.s0().m().h();
                   tt = this.t;
                   if (tt == null) {
                      a.S(str);
                   }
                   i = tt.s0().m().h();
                   obj1 = this.t;
                   if (obj1 == null) {
                      a.S(str);
                   }
                   i2 = i2 * ((i.j() / b.b(i, obj1.s0().m().i()).c) + i1);
                }
                tt = this.O;
                i = (tt != null)? tt.i(): 0;
                i2 = Math.min(i2, i);
             }
             tt = this.O;
             if (tt != null) {
                List list = tt.f(0, (i2 - 1));
                AlbumAssetFragment tw = this.w;
                if (tw == null) {
                   a.S(str1);
                }
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   obj1 = iterator.next();
                   if (obj1 instanceof QMedia) {
                      uArrayList.add(obj1);
                   }
                }
                tw.l1(uArrayList);
                tt.d(1);
                this.hh(this.O);
             }
          }
       }else {
          this.Kh();
       }
    label_0226 :
       return;
    }
    public final void x(){
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AlbumAssetFragment.class, "94")) {
          return;
       }
       if (!this.isDetached() && this.getParentFragment() != null) {
          Log.b("AlbumAssetFragment", "hideLoading");
          Fragment parentFragme = this.getParentFragment();
          parentFragme = (parentFragme != null)? parentFragme.getParentFragment(): objArray;
          if (parentFragme != null) {
             AlbumFragment.qh(parentFragme, false, 1, objArray);
          }else {
             throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.home.AlbumFragment");
          }
       }
       return;
    }
    public final void yh(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumAssetFragment.class, "36")) {
          return;
       }
       Log.g("AlbumAssetFragment", p0+"..type="+this.nh()+", mSceneType="+this.mh());
       return;
    }
    public final int zh(int p0){
       AlbumAssetFragment obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(AlbumAssetFragment.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, AlbumAssetFragment.class, "19");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       obj = this.w;
       if (obj != null) {
          if (obj == null) {
             a.S("mAssetListAdapter");
          }
          Objects.requireNonNull(obj);
          a uoa = a.class;
          if (PatchProxy.isSupport(uoa)) {
             Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, uoa, "12");
             if (obj1 != patchProxyRe) {
                p0 = obj1.intValue();
             }
          }
          Integer integer = obj.m.get(Integer.valueOf(p0));
          if (integer != null) {
             p0 = integer.intValue();
          }
       }
       return p0;
    }
}
