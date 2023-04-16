package com.yxcorp.gifshow.album.home.AlbumFragment;
import com.yxcorp.gifshow.album.IAlbumMainFragment;
import dc7.c;
import com.yxcorp.gifshow.album.preview.PreviewViewPager$b;
import com.kwai.moved.ks_page.fragment.KsAlbumTabHostFragment;
import com.yxcorp.gifshow.album.home.AlbumFragment$a;
import nsd.u;
import com.yxcorp.gifshow.album.home.AlbumListFragment;
import r79.a;
import w69.k0;
import java.util.List;
import com.yxcorp.gifshow.album.IAlbumMainFragment$g;
import com.yxcorp.gifshow.album.IAlbumMainFragment$IPreviewIntentConfig;
import o79.b;
import com.yxcorp.gifshow.album.AlbumPerformanceOptOption;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import w69.f;
import w69.b;
import w69.d;
import w69.k;
import ga9.c;
import j79.a;
import tyc.q0;
import java.util.ArrayList;
import com.yxcorp.gifshow.album.home.AlbumTitleBarAnimationViewStub;
import z69.s;
import com.yxcorp.gifshow.album.home.BottomContainerStub;
import java.lang.Object;
import o79.i;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.album.home.AlbumHomeFragment;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import kotlin.jvm.internal.a;
import o79.l;
import java.lang.Number;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetFragmentViewBinder;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import android.view.Window;
import android.app.Activity;
import android.view.ViewGroup;
import android.content.Context;
import android.content.res.Resources;
import com.yxcorp.utility.RomUtils;
import android.content.ContentResolver;
import android.provider.Settings$Global;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumHomeFragmentViewBinder;
import com.yxcorp.gifshow.album.widget.ScrollableLayout;
import android.widget.LinearLayout;
import java.lang.Math;
import usd.q;
import z69.n;
import java.lang.Runnable;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import q79.d;
import com.yxcorp.utility.Log;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.slider.SliderPositionerLayout;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment;
import androidx.fragment.app.c;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import nsd.r0;
import java.util.Arrays;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumFragmentViewBinder;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.album.IAlbumMainFragment$a;
import java.lang.IllegalStateException;
import java.lang.IllegalArgumentException;
import ga9.b;
import com.yxcorp.gifshow.base.fragment.AlbumBaseFragment;
import kotlin.TypeCastException;
import kotlin.text.StringsKt__StringsKt;
import dc7.e;
import java.lang.Throwable;
import ic7.b;
import androidx.lifecycle.MutableLiveData;
import java.lang.Float;
import android.graphics.Color;
import java.util.Collection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import w69.l0;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import com.kwai.library.widget.viewpager.tabstrip.a;
import r79.c;
import com.yxcorp.gifshow.models.QMedia;
import ec7.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import z69.f;
import com.yxcorp.gifshow.album.IAlbumMainFragment$d;
import java.util.HashMap;
import kzc.d;
import u07.t$a;
import u07.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import w69.i0;
import com.yxcorp.gifshow.album.viewbinder.AbsSelectedContainerViewBinder;
import com.kwai.moved.ks_page.fragment.AttrAnimProgressFragment;
import androidx.fragment.app.DialogFragment;
import android.widget.Button;
import com.yxcorp.gifshow.album.home.AlbumFragment$f;
import androidx.fragment.app.AlbumKwaiDialogFragment;
import com.yxcorp.gifshow.album.IAlbumMainFragment$h;
import io.reactivex.subjects.PublishSubject;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.album.home.AlbumFragment$g;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.album.home.AlbumFragment$h;
import com.yxcorp.gifshow.album.home.AlbumFragment$i;
import com.yxcorp.gifshow.album.home.AlbumFragment$k;
import com.yxcorp.gifshow.album.home.AlbumFragment$j;
import mrd.a;
import m79.c;
import kotlin.Pair;
import m79.g;
import crd.b;
import k79.f$a;
import k79.f;
import w69.e0;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewModelStore;
import androidx.activity.ComponentActivity;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.yxcorp.gifshow.album.widget.SizeAdjustableTextView;
import android.widget.TextView;
import android.graphics.Typeface;
import z69.m;
import android.view.View$OnClickListener;
import android.os.Bundle;
import com.yxcorp.gifshow.album.selected.interact.a;
import s79.a;
import l79.m;
import brd.t;
import com.kwai.moved.components.util.d;
import g79.a;
import w69.p0;
import brd.z;
import q79.f;
import q79.g;
import erd.g;
import w69.b0;
import q79.h;
import q79.i;
import o79.q;
import android.content.Intent;
import java.io.Serializable;
import ekd.j0;
import com.yxcorp.gifshow.album.preview.MediaPreviewInfo;
import com.yxcorp.gifshow.album.home.AlbumFragment$b;
import com.yxcorp.gifshow.album.home.AlbumFragment$c;
import w69.u0;
import java.lang.System;
import w69.g;
import w69.n0;
import q79.j;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import java.util.Map;
import o79.d;
import com.kuaishou.ax2c.PreLoader;
import com.kuaishou.ax2c.PreloadParam$Builder;
import com.kuaishou.ax2c.PreloadParam;
import kuaishou.perf.page.impl.d;
import wv8.a;
import w79.b;
import p79.c;
import android.animation.ObjectAnimator;
import com.yxcorp.gifshow.album.widget.AlbumSelectRecyclerView;
import androidx.recyclerview.widget.RecyclerView$r;
import cc7.a;
import ha9.c;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.album.IBadMediaChecker;
import com.yxcorp.gifshow.album.selected.interact.AlbumSelectListenerDelegate;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.album.home.AlbumFragment$onViewCreated$$inlined$also$lambda$1;
import msd.p;
import com.yxcorp.gifshow.album.home.AlbumFragment$d;
import androidx.viewpager.widget.ViewPager$i;
import androidx.viewpager.widget.ViewPager;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.album.home.AlbumFragment$e;
import android.view.ViewOutlineProvider;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.gifshow.album.IAlbumMainFragment$c;
import z69.u;
import p79.f;
import com.yxcorp.gifshow.album.IAlbumMainFragment$b;
import w69.d0;
import com.yxcorp.gifshow.album.widget.LoadingView;
import com.yxcorp.gifshow.album.IAlbumMainFragment$f;
import com.yxcorp.gifshow.album.IAlbumMainFragment$e;
import h3.a;

public class AlbumFragment extends KsAlbumTabHostFragment implements IAlbumMainFragment, c, PreviewViewPager$b	// class@0019f8
{
    public k A;
    public AlbumLimitOption B;
    public f C;
    public b D;
    public k0 E;
    public List F;
    public IAlbumMainFragment$f G;
    public IAlbumMainFragment$e H;
    public IAlbumMainFragment$a I;
    public IAlbumMainFragment$h J;
    public IAlbumMainFragment$d K;
    public IAlbumMainFragment$c L;
    public int M;
    public List N;
    public List O;
    public boolean P;
    public String Q;
    public String R;
    public int S;
    public final q0 T;
    public String U;
    public final AlbumTitleBarAnimationViewStub U0;
    public String V;
    public final s V0;
    public boolean W;
    public final BottomContainerStub W0;
    public String X;
    public boolean X0;
    public d Y;
    public boolean Y0;
    public final List Z;
    public int Z0;
    public AlbumSelectedContainer a1;
    public boolean b1;
    public int c1;
    public i0 d1;
    public int e1;
    public boolean f1;
    public HashMap g1;
    public final String r;
    public ImageView s;
    public View t;
    public d0 u;
    public n0 v;
    public boolean w;
    public AttrAnimProgressFragment x;
    public AlbumListFragment y;
    public a z;
    public static final AlbumFragment$a h1;

    static {
       AlbumFragment.h1 = new AlbumFragment$a(null);
    }
    public void AlbumFragment(){
       AlbumFragment uAlbumFragme = this;
       super();
       uAlbumFragme.r = "albumListFragment";
       uAlbumFragme.y = new AlbumListFragment();
       a uoa = new a(null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, 0xffff, null);
       uAlbumFragme.z = v1;
       uAlbumFragme.M = -1;
       uAlbumFragme.T = new q0();
       uAlbumFragme.W = true;
       uAlbumFragme.Z = new ArrayList();
       uAlbumFragme.U0 = new AlbumTitleBarAnimationViewStub(uAlbumFragme);
       uAlbumFragme.V0 = new s(uAlbumFragme);
       uAlbumFragme.W0 = new BottomContainerStub(uAlbumFragme);
       uAlbumFragme.Z0 = -1;
    }
    public static void Uh(AlbumFragment p0,boolean p1,int p2,int p3,boolean p4,boolean p5,int p6,Object p7){
       String obj3;
       View view;
       int height;
       int scrollY;
       AlbumFragment a;
       int i8;
       PatchProxyResult patchProxyRe1;
       int i9;
       boolean i10;
       AbsAlbumHomeFragmentViewBinder uAbsAlbumHom;
       int i11;
       Object obj9;
       AlbumHomeFragment uAlbumHomeFr2;
       List list1;
       Iterator iterator1;
       Fragment uFragment;
       AlbumFragment obj10;
       int i12;
       AlbumAssetFragment uAlbumAssetF;
       Object obj = p0;
       boolean b = p1;
       boolean i = 0x7f0704f2;
       int i1 = (p6 & 0x02)? i.c(i): p2;
       AlbumHomeFragment uAlbumHomeFr = -1;
       int i2 = (p6 & 0x04)? -1: p3;
       int i3 = 0;
       boolean b1 = (p6 & 0x08)? false: p4;
       boolean b2 = (p6 & 0x10)? false: p5;
       Objects.requireNonNull(p0);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       int i4 = 2;
       boolean i5 = 1;
       if (PatchProxy.isSupport(AlbumFragment.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p1),Integer.valueOf(i1),Integer.valueOf(i2),Boolean.valueOf(b1),Boolean.valueOf(b2)};
          if (!PatchProxy.applyVoid(objArray, obj, AlbumFragment.class, "80")) {
          label_006d :
             if (p0.getActivity() != null) {
                String str = "AlbumAssetFragment";
                n obj1 = null;
                if (b) {
                   AlbumHomeFragment uAlbumHomeFr1 = p0.zh();
                   if (uAlbumHomeFr1 != null) {
                      List list = uAlbumHomeFr1.ch();
                      if (list != null) {
                         Iterator iterator = list.iterator();
                         while (iterator.hasNext()) {
                            ViewGroup obj2 = iterator.next();
                            if (!obj2 instanceof AlbumAssetFragment) {
                            }else {
                               obj3 = obj2;
                               int i6 = b2 ^ 0x01;
                               AlbumFragment obj4 = obj3;
                               Object obj5 = obj3;
                               int i7 = i6;
                               Object obj6 = obj2;
                               AlbumAssetFragment.Lh(obj4, true, i1, i7, 0, 8, 0);
                               obj4 = obj.A;
                               if (obj4 == null) {
                                  a.S("mAlbumUIOptions");
                               }
                               if (obj4.w()) {
                                  obj4 = obj.B;
                                  if (obj4 == null) {
                                     a.S("mAlbumLimitOptions");
                                  }
                                  if (!obj4.v()) {
                                     i.d(80.00f);
                                  }
                               }
                               if (i2 >= 0) {
                                  l ol = l.class;
                                  if (PatchProxy.isSupport(AlbumAssetFragment.class)) {
                                     ScrollableLayout obj7 = PatchProxy.applyTwoRefs(Integer.valueOf(i2), Integer.valueOf(i1), obj5, AlbumAssetFragment.class, "55");
                                     if (obj7 != patchProxyRe) {
                                        i4 = obj7.intValue();
                                        obj5 = 1;
                                     label_0220 :
                                        uAlbumHomeFr = p0.zh();
                                        if (uAlbumHomeFr != null) {
                                           view = uAlbumHomeFr.uh().l();
                                           height = (view != null)? view.getHeight(): 0;
                                           obj7 = uAlbumHomeFr.uh().j();
                                           scrollY = (obj7 != null)? obj7.getScrollY(): 0;
                                           height = height - scrollY;
                                           View view1 = uAlbumHomeFr.uh().l();
                                           scrollY = (view1 != null)? view1.getHeight(): null;
                                           if (height > i4) {
                                              obj7 = uAlbumHomeFr.uh().j();
                                              scrollY = (obj7 != null)? obj7.getScrollY(): 0;
                                              scrollY = scrollY + i4;
                                           }
                                           if (height > 0 && i4 > 0) {
                                              a = obj.A;
                                              if (a == null) {
                                                 a.S("mAlbumUIOptions");
                                              }
                                              if (a.X == null) {
                                                 ScrollableLayout scrollableLa = uAlbumHomeFr.uh().j();
                                                 if (scrollableLa != null) {
                                                    scrollableLa.i(scrollY);
                                                 }
                                              }
                                           }
                                        }else {
                                           height = 0;
                                        }
                                     label_0288 :
                                        i4 = i4 - q.n(Math.min(height, i4), i3);
                                        view = p0.getView();
                                        if (view != null) {
                                           i8 = obj1;
                                           obj3 = str;
                                           patchProxyRe1 = patchProxyRe;
                                           i9 = i2;
                                           obj1 = new n(obj6, i4, p0, i1, b2, i9);
                                           view.postDelayed(scrollY, 0);
                                        }else {
                                           i8 = obj1;
                                           obj3 = str;
                                           patchProxyRe1 = patchProxyRe;
                                           i9 = i2;
                                           i10 = -1;
                                        }
                                        obj1 = i8;
                                        str = obj3;
                                        patchProxyRe = patchProxyRe1;
                                        i2 = i9;
                                        i4 = 2;
                                        i3 = 0;
                                        uAlbumHomeFr = -1;
                                        i5 = 1;
                                     }
                                  }
                                  RecyclerView recyclerView = obj5.qh().q();
                                  if (recyclerView != null) {
                                     RecyclerView$ViewHolder viewHolder = recyclerView.findViewHolderForAdapterPosition(i2);
                                     if (viewHolder != null) {
                                        viewHolder = viewHolder.itemView;
                                        if (viewHolder != null) {
                                           a.h(viewHolder, "getViewBinder\(\).mQMediaR\x20\x02w\n            ?: return 0\x00");
                                           int[] ointArray = new int[i4];
                                           viewHolder.getLocationOnScreen(ointArray);
                                           if (obj5.getActivity() != null) {
                                              FragmentActivity activity = obj5.getActivity();
                                              if (activity == null) {
                                                 a.L();
                                              }
                                              obj2 = PatchProxy.applyOneRefs(activity, obj1, ol, "5");
                                              if (obj2 != patchProxyRe) {
                                                 i5 = obj2.booleanValue();
                                              }else {
                                                 obj2 = activity.getWindow().getDecorView();
                                                 if (obj2 != null) {
                                                    i5 = 0;
                                                    while (true) {
                                                       if (i5 < obj2.getChildCount()) {
                                                          obj2.getChildAt(i5).getContext().getPackageName();
                                                          if (obj2.getChildAt(i5).getId() != uAlbumHomeFr && ("navigationBarBackground").equals(activity.getResources().getResourceEntryName(obj2.getChildAt(i5).getId()))) {
                                                             i5 = true;
                                                          }else {
                                                             i5 = i5 + 1;
                                                             uAlbumHomeFr = -1;
                                                          }
                                                       }
                                                    }
                                                 }
                                                 i5 = false;
                                              }
                                              if (i5) {
                                                 Context context = obj5.getContext();
                                                 if (context == null) {
                                                    a.L();
                                                 }
                                                 Object obj8 = PatchProxy.applyOneRefs(context, obj1, ol, "1");
                                                 if (obj8 != patchProxyRe) {
                                                    i4 = obj8.intValue();
                                                    i = 1;
                                                 }else {
                                                    obj8 = PatchProxy.applyOneRefs(context, obj1, ol, "2");
                                                    if (obj8 != patchProxyRe) {
                                                       i11 = obj8.booleanValue();
                                                    label_01b2 :
                                                       i5 = i11;
                                                       i = 1;
                                                    }else if(RomUtils.q()){
                                                       obj8 = PatchProxy.applyOneRefs(context, obj1, ol, "4");
                                                       if (obj8 != patchProxyRe) {
                                                          i11 = obj8.booleanValue();
                                                          goto label_01b2 ;
                                                       }else {
                                                          i11 = Settings$Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", i3);
                                                          i = 1;
                                                          if (!i11 || i11 == i) {
                                                          label_01f7 :
                                                             i5 = true;
                                                          }
                                                       }
                                                    }else {
                                                       i = 1;
                                                       obj8 = PatchProxy.applyOneRefs(context, obj1, ol, "3");
                                                       if (obj8 != patchProxyRe) {
                                                          i5 = obj8.booleanValue();
                                                       }else if(!Settings$Global.getInt(context.getContentResolver(), "navigationbar_is_min", i3)){
                                                          goto label_01f7 ;
                                                       }
                                                    }
                                                    i5 = false;
                                                    if (i5) {
                                                       i4 = n.q(context);
                                                    }else {
                                                    label_0202 :
                                                       i4 = 0;
                                                    }
                                                 }
                                              }else {
                                              label_0201 :
                                                 i = 1;
                                                 goto label_0202 ;
                                              }
                                           }else {
                                              goto label_0201 ;
                                           }
                                           i11 = ointArray[i] + viewHolder.getHeight();
                                           i11 = i11 + i4;
                                           View rootView = viewHolder.getRootView();
                                           a.h(rootView, "itemView.rootView");
                                           i11 = i11 - rootView.getHeight();
                                           i4 = i11 + i1;
                                           if (i4 > 0) {
                                              goto label_0220 ;
                                           }else {
                                           label_021f :
                                              i4 = 0;
                                              goto label_0220 ;
                                           }
                                        }
                                     }
                                  }
                               }
                            label_021e :
                               obj5 = 1;
                               goto label_021f ;
                            }
                         }
                      }
                   }
                   obj9 = obj1;
                   obj3 = str;
                   patchProxyRe1 = patchProxyRe;
                   i = true;
                }else {
                   obj9 = obj1;
                   obj3 = str;
                   patchProxyRe1 = patchProxyRe;
                   i = true;
                   AlbumFragment s = obj.s;
                   if (s != null) {
                      ViewPropertyAnimator viewProperty = s.animate();
                      if (viewProperty != null) {
                         viewProperty = viewProperty.rotation(0);
                         if (viewProperty != null) {
                            viewProperty.start();
                         }
                      }
                   }
                   uAlbumHomeFr2 = p0.zh();
                   if (uAlbumHomeFr2 != null) {
                      list1 = uAlbumHomeFr2.ch();
                      if (list1 != null) {
                         iterator1 = list1.iterator();
                         while (iterator1.hasNext()) {
                            uFragment = iterator1.next();
                            if (obj.z.m().r()) {
                               obj10 = obj.Y;
                               if (obj10 != null) {
                                  List list2 = obj10.m();
                                  if (list2 != null && !list2.size()) {
                                  label_0329 :
                                     uAlbumAssetF = null;
                                  label_032a :
                                     obj10 = obj.A;
                                     if (obj10 == null) {
                                        a.S("mAlbumUIOptions");
                                     }
                                     if (obj10.w() || uAlbumAssetF) {
                                        obj10 = obj.B;
                                        if (obj10 == null) {
                                           a.S("mAlbumLimitOptions");
                                        }
                                        if (!obj10.v() || obj.z.m().j() == i) {
                                           if (!uFragment instanceof AlbumAssetFragment) {
                                              uFragment = obj9;
                                           }
                                           Fragment uFragment1 = uFragment;
                                           if (uFragment1 != null) {
                                              i10 = true;
                                              AlbumFragment a1 = obj.A;
                                              if (a1 == null) {
                                                 a.S("mAlbumUIOptions");
                                              }
                                              AlbumAssetFragment.Lh(uFragment1, i10, a1.s(), true, 0, 8, null);
                                           }
                                        }
                                     }
                                     if (!uFragment instanceof AlbumAssetFragment) {
                                        uFragment = obj9;
                                     }
                                     if (uFragment != null) {
                                        boolean b3 = true;
                                        if (PatchProxy.isSupport(AlbumAssetFragment.class) && (PatchProxy.applyVoidTwoRefs(Integer.valueOf(0), Boolean.TRUE, uFragment, AlbumAssetFragment.class, "41") || (uFragment.q == null || uFragment.getView() == null))) {
                                           continue ;
                                        }else {
                                           Log.g(obj3, "removeFooter");
                                           AlbumAssetFragment t1 = uFragment.t;
                                           if (t1 == null) {
                                              a.S("vm");
                                           }
                                           i9 = t1.s0().m().a() + 0;
                                           AlbumAssetFragment.Lh(uFragment, false, i9, b3, 0, 8, null);
                                        }
                                     }
                                  }
                               }
                               uAlbumAssetF = 1;
                               goto label_032a ;
                            }else {
                               goto label_0329 ;
                            }
                         }
                      }
                   }
                }
                if (obj.X0 != b) {
                   uAlbumHomeFr2 = p0.zh();
                   if (uAlbumHomeFr2 != null) {
                      list1 = uAlbumHomeFr2.ch();
                      if (list1 != null) {
                         iterator1 = list1.iterator();
                         while (iterator1.hasNext()) {
                            uFragment = iterator1.next();
                            if (!uFragment instanceof AlbumAssetFragment) {
                               continue ;
                            }else {
                               Objects.requireNonNull(uFragment);
                               if (PatchProxy.isSupport(AlbumAssetFragment.class) && (PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), uFragment, AlbumAssetFragment.class, "43") || (PatchProxy.isSupport(AlbumAssetFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), uFragment, AlbumAssetFragment.class, "84")))) {
                                  continue ;
                               }else if(uFragment.K != null){
                                  if (PatchProxy.isSupport(AlbumAssetFragment.class)) {
                                     obj10 = PatchProxy.applyOneRefs(Boolean.valueOf(p1), uFragment, AlbumAssetFragment.class, "85");
                                     if (obj10 != patchProxyRe1) {
                                        i12 = obj10.intValue();
                                        obj10 = 0x7f0704f2;
                                     }else {
                                     label_044f :
                                        i12 = i.c(R.dimen.arg_RES_7f0704f2);
                                        RecyclerView recyclerView1 = uFragment.qh().q();
                                        Integer integer = (recyclerView1 != null)? Integer.valueOf(recyclerView1.getHeight()): obj9;
                                        if (integer == null) {
                                           a.L();
                                        }
                                        i3 = integer.intValue();
                                        AlbumAssetFragment t = uFragment.t;
                                        if (t == null) {
                                           a.S("vm");
                                        }
                                        i2 = t.s0().m().s();
                                        Log.g(obj3, uFragment.mh()+" containerShow="+b+", rv="+i3+", "+"bottomContainerHeight="+i12+", remainSize="+i2);
                                        if (b) {
                                           i12 = i3 - i12;
                                           if (uFragment.Bh()) {
                                              i12 = i12 + i2;
                                           }
                                        }else {
                                           i12 = i12 + i3;
                                           if (uFragment.Bh()) {
                                              i12 = i12 - i2;
                                           }
                                        }
                                     }
                                  }else {
                                     goto label_044f ;
                                  }
                                  AlbumAssetFragment j = uFragment.J;
                                  if (j != null) {
                                     j.setHeight(i12);
                                  }
                               }else {
                                  Log.b(obj3, "tab"+uFragment.nh()+" slider has not inited, reset next time");
                                  uFragment.L = i;
                               }
                            }
                         }
                      }
                   }
                   obj.X0 = b;
                }
             }
          }
       }else {
          goto label_006d ;
       }
       return;
    }
    public static void qh(AlbumFragment p0,boolean p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = false;
       }
       p0.ph(p1);
       return;
    }
    public final String Ah(){
       String str1;
       AlbumFragment obj = PatchProxy.apply(null, this, AlbumFragment.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.A;
       String str = "mAlbumUIOptions";
       if (obj == null) {
          a.S(str);
       }
       if (TextUtils.x(obj.l())) {
          str1 = i.p(R.string.arg_RES_7f1018aa);
          a.h(str1, "CommonUtil.string\(R.string.ksalbum_next\)");
       }else {
          obj = this.A;
          if (obj == null) {
             a.S(str);
          }
          str1 = obj.l();
          if (str1 == null) {
             a.L();
          }
       }
       return str1;
    }
    public View B3(){
       Object[] objArray = null;
       View obj = PatchProxy.apply(objArray, this, AlbumFragment.class, "89");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getView();
       if (obj != null) {
          objArray = obj.findViewById(R.id.picked_layout);
       }
       return objArray;
    }
    public final MediaPreviewFragment Bh(){
       Fragment obj = PatchProxy.apply(null, this, AlbumFragment.class, "82");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getChildFragmentManager().findFragmentById(R.id.preview_frame);
       if (obj != null) {
          a.h(obj, "childFragmentManager.fin\x20\x02iew_frame\) ?: return null\x00");
          if (obj instanceof MediaPreviewFragment) {
             return obj;
          }else {
             c childFragmen = obj.getChildFragmentManager();
             a.h(childFragmen, "f.childFragmentManager");
             List fragments = childFragmen.getFragments();
             a.h(fragments, "f.childFragmentManager.fragments");
             Iterator iterator = fragments.iterator();
             while (iterator.hasNext()) {
                Fragment uFragment = iterator.next();
                if (uFragment instanceof MediaPreviewFragment) {
                   return uFragment;
                }
             }
          }
       }
       return null;
    }
    public void C8(IAlbumMainFragment$IPreviewIntentConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumFragment.class, "87")) {
          return;
       }
       if (p0 != null) {
          AlbumFragment tz = this.z;
          Objects.requireNonNull(tz);
          if (!PatchProxy.applyVoidOneRefs(p0, tz, a.class, "7")) {
             a.q(p0, "<set-?>");
             tz.d = p0;
          }
       }
       return;
    }
    public final String Ch(){
       AlbumFragment obj = PatchProxy.apply(null, this, AlbumFragment.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.A;
       if (obj == null) {
          a.S("mAlbumUIOptions");
       }
       k d = obj.D;
       if (d == null) {
          d = "";
       }
       return d;
    }
    public final long Dh(){
       AlbumFragment obj = PatchProxy.apply(null, this, AlbumFragment.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.A;
       if (obj == null) {
          a.S("mAlbumUIOptions");
       }
       return obj.C;
    }
    public void Eb(){
       if (PatchProxy.applyVoid(null, this, AlbumFragment.class, "111")) {
          return;
       }
       AlbumFragment ta1 = this.a1;
       if (ta1 != null) {
          ta1.R();
       }
       return;
    }
    public void Ec(boolean p0){
       if (PatchProxy.isSupport(AlbumFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AlbumFragment.class, "93")) {
          return;
       }
       AlbumHomeFragment uAlbumHomeFr = this.zh();
       if (uAlbumHomeFr != null && (!PatchProxy.isSupport(AlbumHomeFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uAlbumHomeFr, AlbumHomeFragment.class, "29"))) {
          ScrollableLayout scrollableLa = uAlbumHomeFr.uh().j();
          if (scrollableLa != null) {
             scrollableLa.setInterceptTouchEventWhenDragTop(p0);
          }
       }
       return;
    }
    public RecyclerView Ed(){
       Object[] objArray = null;
       AlbumHomeFragment obj = PatchProxy.apply(objArray, this, AlbumFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.zh();
       if (obj != null) {
          Fragment uFragment = obj.t();
          if (uFragment != null) {
             if (!uFragment instanceof AlbumAssetFragment) {
                uFragment = objArray;
             }
             if (uFragment != null) {
                AbsAlbumAssetFragmentViewBinder uAbsAlbumAss = uFragment.qh();
                if (uAbsAlbumAss != null) {
                   objArray = uAbsAlbumAss.q();
                }
             }
          }
       }
       return objArray;
    }
    public final String Eh(){
       int i1;
       String str1;
       AlbumFragment obj = PatchProxy.apply(null, this, AlbumFragment.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.A;
       String str = "mAlbumUIOptions";
       if (obj == null) {
          a.S(str);
       }
       if (obj.z != null) {
          obj = this.Y;
          int i = 0;
          if (obj != null) {
             List list = obj.m();
             if (list != null) {
                i1 = list.size();
             label_002e :
                AlbumFragment tA = this.A;
                if (tA == null) {
                   a.S(str);
                }
                if (!TextUtils.x(tA.n()) && !i1) {
                   obj = this.A;
                   if (obj == null) {
                      a.S(str);
                   }
                   return obj.n();
                }else {
                   tA = this.A;
                   if (tA == null) {
                      a.S(str);
                   }
                   if (TextUtils.x(tA.u())) {
                      str = i.p(R.string.arg_RES_7f1018cf);
                      a.h(str, "CommonUtil.string\(R.stri…salbum_select_m_n_photos\)");
                      Object[] objArray = new Object[2];
                      objArray[0] = Integer.valueOf(i1);
                      obj = this.B;
                      if (obj == null) {
                         a.S("mAlbumLimitOptions");
                      }
                      objArray[1] = Integer.valueOf(obj.d());
                      str1 = String.format(str, Arrays.copyOf(objArray, 2));
                      a.o(str1, "java.lang.String.format\(format, *args\)");
                   }else {
                      tA = this.A;
                      if (tA == null) {
                         a.S(str);
                      }
                      str = tA.u();
                      if (str == null) {
                         a.L();
                      }
                      Object[] objArray1 = new Object[]{Integer.valueOf(i1)};
                      str1 = String.format(str, Arrays.copyOf(objArray1, 1));
                      a.o(str1, "java.lang.String.format\(format, *args\)");
                   }
                   return str1;
                }
             }
          }
          i1 = 0;
          goto label_002e ;
       }else {
          obj = this.A;
          if (obj == null) {
             a.S(str);
          }
          return obj.u();
       }
    }
    public final float Fh(){
       AlbumFragment obj = PatchProxy.apply(null, this, AlbumFragment.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.A;
       if (obj == null) {
          a.S("mAlbumUIOptions");
       }
       return obj.p;
    }
    public void Gc(){
       e uoe;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AlbumFragment.class, "54")) {
          return;
       }
       if (this.s == null) {
          return;
       }
       if (this.Y0 == null) {
          return;
       }
       boolean b = true;
       if (this.Gh().m() != null) {
          n.Y(this.Gh().m(), 0, b);
       }
       n.Y(this.Gh().k(), 4, b);
       AlbumFragment ts = this.s;
       if (ts != null) {
          ViewPropertyAnimator viewProperty = ts.animate();
          if (viewProperty != null) {
             viewProperty = viewProperty.rotation(0);
             if (viewProperty != null) {
                viewProperty.start();
             }
          }
       }
       if (this.z.d().g()) {
          uoe = this.getChildFragmentManager().beginTransaction();
          a.h(uoe, "childFragmentManager.beginTransaction\(\)");
          uoe.y(R.anim.arg_RES_7f010063, 0x7f010065);
          uoe.s(this.y).m();
          this.Y0 = false;
          ts = this.I;
          if (ts != null) {
             ts.b();
          }
          return;
       }else {
          try{
             FragmentActivity activity = this.getActivity();
             if (activity != null) {
                c supportFragm = activity.getSupportFragmentManager();
                if (supportFragm != null) {
                   objArray = supportFragm.beginTransaction();
                label_0092 :
                   if (objArray != null) {
                      objArray.y(R.anim.arg_RES_7f010063, 0x7f010065);
                   }
                   if (objArray != null) {
                      uoe = objArray.s(this.y);
                      if (uoe != null) {
                         uoe.m();
                      }
                   }
                   this.Y0 = false;
                   ts = this.I;
                   if (ts != null) {
                      ts.b();
                   }
                }else {
                   goto label_0092 ;
                }
             }else {
                goto label_0092 ;
             }
          }catch(java.lang.IllegalArgumentException e0){
             this.Hh(e0);
          }catch(java.lang.IllegalStateException e0){
             this.Ih(e0);
          }
          return;
       }
    }
    public AbsAlbumFragmentViewBinder Gh(){
       b obj = PatchProxy.apply(null, this, AlbumFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Xg();
       if (obj != null) {
          return obj;
       }
       throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.viewbinder.AbsAlbumFragmentViewBinder");
    }
    public final void Hh(IllegalArgumentException p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumFragment.class, "56")) {
          return;
       }
       String message = p0.getMessage();
       if (message != null) {
          if (!StringsKt__StringsKt.O2(message, "No view found for id", false, 2, null)) {
             message = null;
          }
          if (message != null) {
             throw new IllegalArgumentException("set true value to AlbumFragmentOption\'s nestFragment option");
          }
       }
       throw p0;
    }
    public void I3(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumFragment.class, "57")) {
          return;
       }
       super.I3(p0);
       if (p0 instanceof k0) {
          this.E = p0;
          this.z.q(p0);
       }
       return;
    }
    public final void Ih(IllegalStateException p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumFragment.class, "55")) {
          return;
       }
       String message = p0.getMessage();
       if (message == null || StringsKt__StringsKt.O2(message, "Restarter must be created only during", false, 2, null) != true) {
          throw p0;
       }
       b.a(p0);
       AlbumFragment tY = this.Y;
       if (tY != null) {
          MutableLiveData mutableLiveD = tY.r0();
          if (mutableLiveD != null) {
             mutableLiveD.setValue(Boolean.FALSE);
          }
       }
       return;
    }
    public void Jf(boolean p0){
       if (PatchProxy.isSupport(AlbumFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AlbumFragment.class, "92")) {
          return;
       }
       AlbumHomeFragment uAlbumHomeFr = this.zh();
       if (uAlbumHomeFr != null && (PatchProxy.isSupport(AlbumHomeFragment.class) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uAlbumHomeFr, AlbumHomeFragment.class, "28") && uAlbumHomeFr.wh()))) {
          ScrollableLayout scrollableLa = uAlbumHomeFr.uh().j();
          if (scrollableLa != null) {
             boolean b = true;
             if (p0) {
                ScrollableLayout scrollableLa1 = uAlbumHomeFr.uh().j();
                if (scrollableLa1 != null && scrollableLa1.e() == b) {
                label_005a :
                   scrollableLa.h(b, false);
                }
             }
             b = false;
             goto label_005a ;
          }
       }
       return;
    }
    public final void Jh(){
       if (PatchProxy.applyVoid(null, this, AlbumFragment.class, "4")) {
          return;
       }
       this.z.c().a = (this.z.o())? this.u: this.u;
       return;
    }
    public void K7(float p0){
       if (PatchProxy.isSupport(AlbumFragment.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, AlbumFragment.class, "105")) {
          return;
       }
       int i = (int)(q.t(q.m(p0, 0), 0x3f800000) * (float)255);
       AbsAlbumFragmentViewBinder uAbsAlbumFra = this.Gh();
       if (uAbsAlbumFra != null) {
          uAbsAlbumFra = uAbsAlbumFra.i;
          if (uAbsAlbumFra != null) {
             uAbsAlbumFra.setBackgroundColor(Color.argb(i, 0, 0, 0));
          }
       }
       return;
    }
    public final void Kh(){
       if (PatchProxy.applyVoid(null, this, AlbumFragment.class, "27")) {
          return;
       }
       AlbumFragment tF = this.F;
       int i = 1;
       if (tF != null && (tF.isEmpty() ^ i) == i) {
          return;
       }
       Log.b("AlbumFragment", "initAlbumTabs\(\) called");
       Integer[] integerArray = new Integer[i];
       int i1 = 0;
       integerArray[i1] = Integer.valueOf(i1);
       this.F = CollectionsKt__CollectionsKt.P(integerArray);
       tF = this.N;
       if (tF != null) {
          if (tF == null) {
             a.L();
          }
          if (tF.isEmpty() ^ i) {
             tF = this.N;
             if (tF == null) {
                a.L();
             }
             Iterator iterator = tF.iterator();
             while (iterator.hasNext()) {
                l0 ol0 = iterator.next();
                AlbumFragment tF1 = this.F;
                if (tF1 == null) {
                   a.L();
                }
                tF1.add(Integer.valueOf(i));
             }
          }
       }
       int i2 = this.z.d().e();
       if (i2 && i2 != i) {
          i2 = 0;
       }
       AlbumFragment tF2 = this.F;
       i = (tF2 != null)? tF2.size(): 0;
       if (i2 >= 0 && i2 < i) {
          i1 = i2;
       }
       this.n = i1;
       return;
    }
    public final void Lh(){
       if (PatchProxy.applyVoid(null, this, AlbumFragment.class, "28")) {
          return;
       }
       AlbumFragment tF = this.F;
       int i = 1;
       if (tF == null || (tF != null && tF.isEmpty() == i)) {
          Log.b("AlbumFragment", "makeSureTabsIsNotEmpty");
          Integer[] integerArray = new Integer[i];
          integerArray[0] = Integer.valueOf(0);
          this.F = CollectionsKt__CollectionsKt.P(integerArray);
       }
       return;
    }
    public void Ma(int p0){
       this.c1 = p0;
    }
    public final boolean Mh(){
       AlbumFragment obj = PatchProxy.apply(null, this, AlbumFragment.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.A;
       if (obj == null) {
          a.S("mAlbumUIOptions");
       }
       return obj.m;
    }
    public void Nd(boolean p0){
       View obj;
       if (PatchProxy.isSupport(AlbumFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AlbumFragment.class, "102")) {
          return;
       }
       int i = 0;
       if (PatchProxy.isSupport(KsAlbumTabHostFragment.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(i), this, KsAlbumTabHostFragment.class, "10");
          if (obj != PatchProxyResult.class) {
          }else {
          label_0033 :
             KsAlbumTabHostFragment tl = this.l;
             obj = (tl == null)? null: tl.b(i);
          }
       }else {
          goto label_0033 ;
       }
       if (obj != null) {
          obj = obj.e();
          if (obj != null) {
             if (!p0) {
                i = 8;
             }
             obj.setVisibility(i);
          }
       }
       return;
    }
    public final boolean Nh(){
       AlbumFragment obj = PatchProxy.apply(null, this, AlbumFragment.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.A;
       if (obj == null) {
          a.S("mAlbumUIOptions");
       }
       return obj.o;
    }
    public void O2(){
       if (PatchProxy.applyVoid(null, this, AlbumFragment.class, "47")) {
          return;
       }
       this.Th();
       return;
    }
    public final boolean Oh(){
       AlbumFragment obj = PatchProxy.apply(null, this, AlbumFragment.class, "61");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.A;
       if (obj == null) {
          a.S("mAlbumUIOptions");
       }
       return obj.r;
    }
    public final boolean Ph(){
       AlbumFragment obj = PatchProxy.apply(null, this, AlbumFragment.class, "68");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.A;
       if (obj == null) {
          a.S("mAlbumUIOptions");
       }
       return obj.A;
    }
    public final boolean Qh(){
       AlbumFragment obj = PatchProxy.apply(null, this, AlbumFragment.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.A;
       if (obj == null) {
          a.S("mAlbumUIOptions");
       }
       return obj.f;
    }
    public boolean R4(boolean p0){
       int[] obj;
       if (PatchProxy.isSupport(AlbumFragment.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, AlbumFragment.class, "110");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.z.k();
       if (obj != null) {
          String str = (!obj.length)? 1: null;
          if (!str) {
             AlbumFragment tY = this.Y;
             if (tY != null) {
                MutableLiveData mutableLiveD = tY.z0();
                if (mutableLiveD != null) {
                   mutableLiveD.setValue(Boolean.valueOf(p0));
                }
             }
             return true;
          }
       }
       Log.g("AlbumFragment", "toggleSceneTabs failed, sceneTabList is null or empty.");
       return false;
    }
    public final void Rh(){
       if (PatchProxy.applyVoid(null, this, AlbumFragment.class, "96")) {
          return;
       }
       AlbumHomeFragment uAlbumHomeFr = this.zh();
       if (uAlbumHomeFr != null) {
          List list = uAlbumHomeFr.ch();
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                Fragment uFragment = iterator.next();
                if (!uFragment instanceof AlbumAssetFragment) {
                   uFragment = null;
                }
                if (uFragment != null) {
                   uFragment.Ch();
                }
             }
          }
       }
       return;
    }
    public void S4(){
       if (PatchProxy.applyVoid(null, this, AlbumFragment.class, "84")) {
          return;
       }
       this.w = false;
       AlbumFragment tY = this.Y;
       if (tY != null) {
          if (tY.K0(this.getActivity())) {
             tY = this.Y;
             if (tY != null) {
                tY.V0();
             }
          }else {
             this.x8();
             this.oh();
          }
       }
       return;
    }
    public boolean Sc(){
       Fragment obj = PatchProxy.apply(null, this, AlbumFragment.class, "106");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getChildFragmentManager().findFragmentById(R.id.preview_frame);
       boolean b = false;
       if (obj != null) {
          a.h(obj, "childFragmentManager.fin\x20\x02ew_frame\) ?: return false\x00");
          if (obj instanceof MediaPreviewFragment) {
             if (obj.isVisible() && !obj.kh()) {
                b = true;
             }
             return b;
          }else {
             c childFragmen = obj.getChildFragmentManager();
             a.h(childFragmen, "f.childFragmentManager");
             List fragments = childFragmen.getFragments();
             a.h(fragments, "f.childFragmentManager.fragments");
             Iterator iterator = fragments.iterator();
             while (iterator.hasNext()) {
                Fragment uFragment = iterator.next();
                if (uFragment instanceof MediaPreviewFragment) {
                   if (uFragment.isVisible() && !uFragment.kh()) {
                      b = true;
                      break ;
                   }
                }
             }
          }
       }
       return b;
    }
    public View Sg(){
       Object obj = PatchProxy.apply(null, this, AlbumFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Gh().l();
    }
    public final void Sh(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumFragment.class, "95")) {
          return;
       }
       if (!p0 instanceof QMedia) {
          return;
       }
       AlbumHomeFragment uAlbumHomeFr = this.zh();
       if (uAlbumHomeFr != null) {
          List list = uAlbumHomeFr.ch();
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                Fragment uFragment = iterator.next();
                Fragment uFragment1 = null;
                Fragment uFragment2 = (!uFragment instanceof AlbumAssetFragment)? uFragment1: uFragment;
                if (uFragment2 != null) {
                   RecyclerView obj = p0;
                   AlbumHomeFragment uAlbumHomeFr1 = this.zh();
                   if (uAlbumHomeFr1 != null) {
                      uFragment1 = uAlbumHomeFr1.t();
                   }
                   int i = 1;
                   int i1 = a.g(uFragment, uFragment1) ^ i;
                   if (PatchProxy.isSupport(AlbumAssetFragment.class) && PatchProxy.applyVoidTwoRefs(obj, Boolean.valueOf(i1), uFragment2, AlbumAssetFragment.class, "45")) {
                      continue ;
                   }else {
                      a.q(obj, "media");
                      AlbumAssetFragment w = uFragment2.w;
                      String str = "mAssetListAdapter";
                      if (w == null) {
                         a.S(str);
                      }
                      int i2 = w.N0(obj);
                      String str1 = "notifyItemChanged ";
                      if (i2 >= 0) {
                         Log.g("AlbumAssetFragment", str1+i2);
                         obj = uFragment2.qh().q();
                         if (obj != null && !obj.getScrollState()) {
                            obj = uFragment2.qh().q();
                            if (obj == null || obj.isComputingLayout() != i) {
                               AlbumAssetFragment w1 = uFragment2.w;
                               if (w1 == null) {
                                  a.S(str);
                               }
                               w1.m0(i2, Boolean.valueOf(i1));
                            }
                         }
                         RecyclerView recyclerView = uFragment2.qh().q();
                         if (recyclerView != null) {
                            recyclerView.post(new f(uFragment2, i2, i1));
                         }
                      }else {
                         Log.g("AlbumAssetFragment", str1+obj.path+" not find in list");
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public void Ta(IAlbumMainFragment$d p0){
       this.K = p0;
    }
    public final void Th(){
       if (PatchProxy.applyVoid(null, this, AlbumFragment.class, "75")) {
          return;
       }
       AlbumHomeFragment uAlbumHomeFr = this.zh();
       if (uAlbumHomeFr != null) {
          List list = uAlbumHomeFr.ch();
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                Fragment uFragment = iterator.next();
                if (!uFragment instanceof AlbumAssetFragment) {
                   uFragment = null;
                }
                if (uFragment != null) {
                   uFragment.Ih(0);
                }
             }
          }
       }
       return;
    }
    public void U6(List p0){
       this.O = p0;
    }
    public void Vg(){
       if (PatchProxy.applyVoid(null, this, AlbumFragment.class, "115")) {
          return;
       }
       AlbumFragment tg1 = this.g1;
       if (tg1 != null) {
          tg1.clear();
       }
       return;
    }
    public final void Vh(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AlbumFragment.class, "33")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          p1 = (TextUtils.x(p1))? i.p(R.string.arg_RES_7f1018b0): String.valueOf(p1);
          d uod = new d(activity);
          uod.z0(p0);
          uod.T0(p1);
          f.e(uod).Y(PopupInterface.a);
       }
       return;
    }
    public void Wb(i0 p0){
       this.d1 = p0;
    }
    public b Wg(){
       AbsAlbumFragmentViewBinder uAbsAlbumFra = PatchProxy.apply(null, this, AlbumFragment.class, "8");
       if (uAbsAlbumFra != PatchProxyResult.class) {
       }else {
          uAbsAlbumFra = c.b(this.z.n(), AbsAlbumFragmentViewBinder.class, this, 0, 4, null);
          AbsSelectedContainerViewBinder uAbsSelected = c.b(this.z.n(), AbsSelectedContainerViewBinder.class, this, 0, 4, null);
          Objects.requireNonNull(uAbsAlbumFra);
          if (!PatchProxy.applyVoidOneRefs(uAbsSelected, uAbsAlbumFra, AbsAlbumFragmentViewBinder.class, "1")) {
             a.q(uAbsSelected, "viewBinder");
             uAbsAlbumFra.j = uAbsSelected;
          }
       }
       return uAbsAlbumFra;
    }
    public final void Wh(c p0){
       AlbumFragment tx;
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumFragment.class, "76")) {
          return;
       }
       int i = 1;
       this.e1 = this.e1 + i;
       if (this.x == null) {
          AttrAnimProgressFragment uAttrAnimPro = new AttrAnimProgressFragment();
          this.x = uAttrAnimPro;
          uAttrAnimPro.kh(this.getString(R.string.arg_RES_7f1018a5));
          tx = this.x;
          if (tx != null) {
             tx.setCancelable(false);
          }
          tx = this.X;
          if (tx != null) {
             tx = (tx.length() > 0)? 1: null;
             if (tx == i) {
                tx = this.x;
                if (tx != null) {
                   String str = this.getString(R.string.arg_RES_7f101896);
                   if (PatchProxy.applyOneRefs(str, tx, AttrAnimProgressFragment.class, "3") != PatchProxyResult.class) {
                   }else {
                      tx.y = str;
                      tx.z = 0;
                      uAttrAnimPro = tx.u;
                      if (uAttrAnimPro != null) {
                         uAttrAnimPro.setText(str);
                      }
                   }
                }
                tx = this.x;
                if (tx != null) {
                   tx.D = new AlbumFragment$f(this);
                }
             }
          }
       }
    label_006d :
       if (p0 != null) {
          tx = this.x;
          if (tx != null) {
             tx.show(p0, "photo_pick_progress");
          }
       }
       Log.g("AlbumFragment", this.x+" showLoadingDialog, progressDialogShowCount="+this.e1);
       return;
    }
    public KsAlbumTabHostFragment Xe(){
       Object[] objArray;
       List obj = PatchProxy.apply(null, this, AlbumFragment.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.ch();
       if (obj != null) {
          Iterator iterator = obj.iterator();
          while (true) {
             if (iterator.hasNext()) {
                objArray = iterator.next();
                if (!objArray instanceof AlbumHomeFragment) {
                   continue ;
                }
             }else {
                objArray = null;
             }
          }
          return objArray;
       }else {
          objArray = null;
       }
       if (objArray instanceof KsAlbumTabHostFragment) {
          goto label_0035 ;
       }else {
          return null;
       }
    }
    public final boolean Xh(){
       AlbumFragment obj = PatchProxy.apply(null, this, AlbumFragment.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.A;
       if (obj == null) {
          a.S("mAlbumUIOptions");
       }
       return obj.B;
    }
    public void Y4(List p0){
       this.N = p0;
    }
    public void Yc(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AlbumFragment.class, "112")) {
          return;
       }
       AlbumFragment ta1 = this.a1;
       if (ta1 != null && !PatchProxy.applyVoid(objArray, ta1, AlbumSelectedContainer.class, "27")) {
          ta1.D.clear();
       }
       return;
    }
    public b Yg(){
       return this.Gh();
    }
    public final boolean Yh(c p0){
       AlbumFragment obj = PatchProxy.applyOneRefs(p0, this, AlbumFragment.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "media");
       obj = this.J;
       boolean b = (obj != null)? obj.a(p0): p0.isVideoType();
       return b;
    }
    public void Zf(float p0){
       if (PatchProxy.isSupport(AlbumFragment.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, AlbumFragment.class, "50")) {
          return;
       }
       this.V0.e.onNext(Float.valueOf(p0));
       return;
    }
    public ViewModel Zg(){
       return this.Y;
    }
    public final void Zh(){
       if (PatchProxy.applyVoid(null, this, AlbumFragment.class, "43")) {
          return;
       }
       Log.g("AlbumFragment", "startObserve called\(\)");
       AlbumFragment tY = this.Y;
       if (tY != null) {
          tY.C0().observe(this, new AlbumFragment$g(this));
          tY.v0().observe(this, new AlbumFragment$h(this));
          tY.y0().observe(this, new AlbumFragment$i(this));
          tY.x0().observe(this, AlbumFragment$k.b);
          tY.z0().observe(this, new AlbumFragment$j(this));
       }
       return;
    }
    public void ah(int p0){
       Iterator iterator;
       if (PatchProxy.isSupport(AlbumFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AlbumFragment.class, "10")) {
          return;
       }
       super.ah(p0);
       Log.g("AlbumFragment", "fragment LoadFinish");
       List list = this.ch();
       if (list != null) {
          iterator = list.iterator();
          while (iterator.hasNext()) {
             Fragment uFragment = iterator.next();
             if (uFragment instanceof AlbumHomeFragment) {
                uFragment.B = this.G;
             }
          }
       }
       iterator.i = this.L;
       return;
    }
    public AlbumBaseFragment b(){
       return this;
    }
    public void bb(float p0){
       if (PatchProxy.isSupport(AlbumFragment.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, AlbumFragment.class, "46")) {
          return;
       }
       this.U0.j.onNext(Float.valueOf(p0));
       return;
    }
    public void d3(boolean p0){
       if (PatchProxy.isSupport(AlbumFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AlbumFragment.class, "103")) {
          return;
       }
       AlbumFragment ta1 = this.a1;
       if (ta1 != null) {
          AlbumSelectedContainer.c0(ta1, p0, false, false, false, 12, null);
       }
       return;
    }
    public void d7(){
       if (PatchProxy.applyVoid(null, this, AlbumFragment.class, "108")) {
          return;
       }
       AlbumFragment tY = this.Y;
       if (tY != null && !PatchProxy.applyVoid(null, tY, d.class, "8")) {
          tY.G.z();
          tY.G.j0();
          d g = tY.G;
          Objects.requireNonNull(g);
          if (!PatchProxy.applyVoid(null, g, c.class, "11")) {
             Log.g("AlbumSelectControllerImpl", "clearSelectState...");
             g.Q().setValue(new Pair(Integer.valueOf(0), null));
          }
          tY.v0().setValue(null);
          g = tY.i;
          if (g != null) {
             tY.j.setValue(g);
             tY.k.setValue("tab_all");
          }
          tY.l.setValue(Boolean.FALSE);
          g og = new g(0, 0, 0, 0, null, false, 63, null);
          tY.n.onNext(v3);
          tY.q.setValue(null);
          tY.r = null;
          g = tY.t;
          if (g != null) {
             g.dispose();
          }
          tY.t = null;
          g = tY.u;
          if (g != null) {
             g.dispose();
          }
          tY.u = null;
          tY.w.setValue(Integer.valueOf(0));
          g = tY.v;
          if (g != null) {
             g.g(tY.F);
          }
          tY.v = null;
          g = tY.x;
          if (g != null) {
             g.dispose();
          }
          tY.x = null;
       }
       return;
    }
    public void db(QMedia p0,int p1){
       if (PatchProxy.isSupport(AlbumFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, AlbumFragment.class, "113")) {
          return;
       }
       a.q(p0, "qMedia");
       AlbumHomeFragment uAlbumHomeFr = this.zh();
       Fragment uFragment = (uAlbumHomeFr != null)? uAlbumHomeFr.t(): null;
       if (uFragment != null) {
          uFragment.w6(p1);
          return;
       }else {
          throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.home.AlbumAssetFragment");
       }
    }
    public void e6(boolean p0){
       AlbumFragment ts;
       if (PatchProxy.isSupport(AlbumFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AlbumFragment.class, "101")) {
          return;
       }
       if (p0) {
          ts = this.s;
          if (ts != null) {
             ts.setVisibility(0);
          }
       }else {
          ts = this.s;
          if (ts != null) {
             ts.setVisibility(8);
          }
       }
       return;
    }
    public void e9(boolean p0){
       Boolean value;
       if (PatchProxy.isSupport(AlbumFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AlbumFragment.class, "109")) {
          return;
       }
       AlbumFragment tY = this.Y;
       if (tY != null) {
          MutableLiveData mutableLiveD = tY.P0();
          if (mutableLiveD != null) {
             value = mutableLiveD.getValue();
             if (value != null) {
             label_002c :
                a.h(value, "mViewModel?.isHeaderList\x20\x02ainerShow?.value ?: false\x00");
                if (p0 != value.booleanValue()) {
                   tY = this.Y;
                   if (tY != null) {
                      mutableLiveD = tY.P0();
                      if (mutableLiveD != null) {
                         mutableLiveD.setValue(Boolean.valueOf(p0));
                      }
                   }
                }
                return;
             }
          }
       }
       value = Boolean.FALSE;
       goto label_002c ;
    }
    public void f5(e0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumFragment.class, "83")) {
          return;
       }
       AlbumFragment tW0 = this.W0;
       tW0.f = p0;
       if (tW0.g != null) {
          tW0.h();
       }
       return;
    }
    public void f6(IAlbumMainFragment$a p0){
       this.I = p0;
    }
    public FrameLayout fa(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       AlbumFragment obj = PatchProxy.apply(objArray, this, AlbumFragment.class, "100");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a1;
       if (obj != null) {
          objArray = PatchProxy.apply(objArray, obj, AlbumSelectedContainer.class, "22");
          if (objArray != patchProxyRe) {
          }else {
             objArray = obj.y();
          }
       }
       return objArray;
    }
    public String getTaskId(){
       Object obj = PatchProxy.apply(null, this, AlbumFragment.class, "85");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.d().l();
    }
    public void hd(){
       if (PatchProxy.applyVoid(null, this, AlbumFragment.class, "17")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          ViewModelStore viewModelSto = activity.getViewModelStore();
          if (viewModelSto != null) {
             viewModelSto.clear();
          }
       }
       return;
    }
    public List ih(){
       ArrayList obj = PatchProxy.apply(null, this, AlbumFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.Kh();
       obj = new ArrayList();
       AlbumFragment tN = this.N;
       AlbumFragment tF = this.F;
       if (tF != null) {
          Iterator iterator = tF.iterator();
          int i = 0;
          while (iterator.hasNext()) {
             SizeAdjustableTextView obj1 = iterator.next();
             int i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             int i2 = obj1.intValue();
             Log.b("AlbumFragment", "getTabFragmentDelegates: create type="+i2);
             int i3 = 1;
             if (i2) {
                if (i2 == i3 && tN != null) {
                   i = i - 1;
                   obj.add(tN.get(i).G3(this.getContext()));
                }
             }else {
                b uob = PatchProxy.apply(null, this, AlbumFragment.class, "25");
                if (uob != PatchProxyResult.class) {
                }else {
                   i2 = 0x7f0d06db;
                   View view = i.h(this.getContext(), i2, null, false);
                   if (view == null) {
                      view = i.m(this.getContext(), i2, null);
                   }
                   i2 = 0x7f0a3caa;
                   if (view != null) {
                      SizeAdjustableTextView sizeAdjustab = view.findViewById(i2);
                      if (sizeAdjustab != null) {
                         sizeAdjustab.setText(this.sh());
                      }
                   }
                   if (view != null) {
                      obj1 = view.findViewById(i2);
                      if (obj1 != null) {
                         obj1.setTypeface(null, i3);
                      }
                   }
                   ImageView imageView = (view != null)? view.findViewById(R.id.album_indicator): null;
                   this.s = imageView;
                   if (imageView != null) {
                      imageView.setVisibility(false);
                   }
                   PagerSlidingTabStrip$d uod = new PagerSlidingTabStrip$d(this.sh(), view);
                   uod.i(new m(this));
                   uob = new b(uod, AlbumHomeFragment.class, this.getArguments());
                }
                obj.add(uob);
             }
             i = i1;
          }
       }
       return obj;
    }
    public void ja(){
       if (PatchProxy.applyVoid(null, this, AlbumFragment.class, "107")) {
          return;
       }
       AlbumHomeFragment uAlbumHomeFr = this.zh();
       if (uAlbumHomeFr != null) {
          List list = uAlbumHomeFr.ch();
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                Fragment uFragment = iterator.next();
                if (!uFragment instanceof AlbumAssetFragment) {
                   uFragment = null;
                }
                if (uFragment != null) {
                   AlbumHomeFragment uAlbumHomeFr1 = this.zh();
                   Fragment uFragment1 = (uAlbumHomeFr1 != null)? uAlbumHomeFr1.t(): null;
                   if (!a.g(uFragment, uFragment1) || PatchProxy.applyVoid(null, uFragment, AlbumAssetFragment.class, "28")) {
                      continue ;
                   }
                }
                uFragment.Mh(uFragment.z, true);
             }
          }
       }
       return;
    }
    public a m8(){
       return this.Y;
    }
    public final void nh(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AlbumFragment.class, "31")) {
          return;
       }
       this.Z.add(this.U0);
       this.Z.add(this.W0);
       Iterator obj = PatchProxy.apply(objArray, this, AlbumFragment.class, "37");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          AlbumFragment tA = this.A;
          if (tA == null) {
             a.S("mAlbumUIOptions");
          }
          b = tA.n;
       }
       if (b != null) {
          this.Z.add(this.V0);
       }
       obj = this.Z.iterator();
       while (obj.hasNext()) {
          obj.next().b(this.Y);
       }
       return;
    }
    public int o5(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       AlbumFragment obj = PatchProxy.apply(objArray, this, AlbumFragment.class, "98");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.a1;
       if (obj != null) {
          Object obj1 = PatchProxy.apply(objArray, obj, AlbumSelectedContainer.class, "58");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          }else {
             AlbumSelectedContainer v = obj.v;
             if (v == null) {
                a.S("mSelectedAdapter");
             }
             i = v.Z0();
          }
       }else {
          i = 0;
       }
       return i;
    }
    public final void oh(){
       if (PatchProxy.applyVoid(null, this, AlbumFragment.class, "40")) {
          return;
       }
       AlbumFragment tY = this.Y;
       boolean b = false;
       if (tY != null) {
          FragmentActivity activity = this.getActivity();
          String obj = PatchProxy.applyOneRefs(activity, tY, d.class, "33");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = "AlbumAssetViewModel";
             if (activity == null) {
                Log.g(obj, "checkPermission: activity is null");
             }else if(tY.K0(activity)){
                b = true;
             }else if(!tY.c.d().h()){
                Log.b(obj, "checkPermission: requestPermission == false");
             }else if(tY.t != null){
                Log.b(obj, "checkPermission: mPermissionDisposable not null");
             }else {
                Log.b(obj, "checkPermission: ");
                String str = "android.permission.WRITE_EXTERNAL_STORAGE";
                if (tY.c.d().m != null) {
                   tY.t = d.a(activity, tY.c.d().n, str).observeOn(a.c.i().b()).subscribe(new f(tY), new g(tY));
                }else {
                   a c = a.c;
                   tY.t = c.g().b(activity, str).observeOn(c.i().b()).subscribe(new h(tY), new i(tY));
                }
             }
          }
       }
       this.b1 = b;
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumFragment.class, "9")) {
          return;
       }
       super.onActivityCreated(p0);
       q.b(this.getActivity());
       return;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(AlbumFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, AlbumFragment.class, "15")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (p0 == 772) {
          if (!PatchProxy.applyVoidOneRefs(p2, this, AlbumFragment.class, "20")) {
             ArrayList uArrayList = (p2 != null)? j0.e(p2, "album_preview_select_data"): null;
             Log.b("AlbumFragment", "updateFromPreview: mediaList="+uArrayList);
             if (uArrayList != null) {
                Iterator iterator = uArrayList.iterator();
                while (iterator.hasNext()) {
                   MediaPreviewInfo mediaPreview = iterator.next();
                   AlbumFragment tY = this.Y;
                   if (tY != null) {
                      tY.l(mediaPreview.getMedia());
                   }
                   if (mediaPreview.getSelectIndex() >= 0) {
                      tY = this.Y;
                      if (tY != null) {
                         tY.h0(mediaPreview.getMedia());
                      }
                   }
                }
             }
          }
          return;
       }else {
          List list = this.ch();
          if (list != null) {
             Iterator iterator1 = list.iterator();
             while (iterator1.hasNext()) {
                Fragment uFragment = iterator1.next();
                if (uFragment != null) {
                   uFragment.onActivityResult(p0, p1, p2);
                }
             }
          }
          return;
       }
    }
    public boolean onBackPressed(){
       c obj = PatchProxy.apply(null, this, AlbumFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getChildFragmentManager();
       a.h(obj, "childFragmentManager");
       List fragments = obj.getFragments();
       if (fragments != null) {
          Iterator iterator = fragments.iterator();
          while (true) {
             if (iterator.hasNext()) {
                Fragment uFragment = iterator.next();
                if (uFragment instanceof c && uFragment.onBackPressed()) {
                   return true;
                }
                continue ;
             }
          }
          return false;
       }
       if (this.y.isAdded() && this.y.isVisible()) {
          Log.g("AlbumLog", "在相册页按back按钮");
          this.Gc();
          return true;
       }else {
          goto label_005c ;
       }
    }
    public void onBindClickEvent(){
       if (PatchProxy.applyVoid(null, this, AlbumFragment.class, "16")) {
          return;
       }
       ImageView imageView = this.Gh().m();
       if (imageView != null) {
          imageView.setOnClickListener(new AlbumFragment$b(this));
       }
       AbsSelectedContainerViewBinder uAbsSelected = this.Gh().q();
       if (uAbsSelected != null) {
          Button uButton = uAbsSelected.l();
          if (uButton != null) {
             uButton.setOnClickListener(new AlbumFragment$c(this));
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       AlbumFragment tY;
       AlbumFragment tC;
       Iterator iterator;
       b a;
       ArrayList uArrayList;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumFragment.class, "2")) {
          return;
       }
       String str = "AlbumFragment";
       Log.b(str, "onCreate:"+this+" savedInstanceState="+p0);
       u0 c = u0.c;
       Objects.requireNonNull(c);
       Object[] objArray = null;
       String str1 = "1";
       if (!PatchProxy.applyVoid(objArray, c, u0.class, str1)) {
          u0.a = System.currentTimeMillis();
       }
       this.z.p(this.getArguments());
       this.Kh();
       this.Jh();
       g.c = this.z.n().c;
       this.z.c().f(this.W0.j());
       this.z.c().h(this.v);
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          this.Y = ViewModelProviders.of(activity, new j(this.z)).get(uod);
          Log.b(str, "onCreate: mViewModel="+this.Y);
          tY = this.Y;
          if (tY != null && !PatchProxy.applyVoid(objArray, tY, uod, "44")) {
             tY.G.j0();
          }
          tY = this.Y;
          if (tY == null) {
             a.L();
          }
          AlbumFragment tz = this.z;
          Objects.requireNonNull(tY);
          if (!PatchProxy.applyVoidOneRefs(tz, tY, uod, str1)) {
             a.q(tz, "value");
             tY.c = tz;
             uod = tY.G;
             Objects.requireNonNull(uod);
             if (!PatchProxy.applyVoidOneRefs(tz, uod, c.class, "27")) {
                a.q(tz, "<set-?>");
                uod.d = tz;
             }
             tY.b.setValue(Boolean.valueOf(tz.e().v()));
          }
          AlbumFragment tY1 = this.Y;
          if (tY1 != null) {
             tY1.E = this.d1;
          }
       }
       super.onCreate(p0);
       boolean b = true;
       if (!PatchProxy.applyVoid(objArray, this, AlbumFragment.class, "5")) {
          uArrayList = this.z.d().i();
          tY = this.Y;
          if (uArrayList != null && ((uArrayList.isEmpty() ^ b) == b && tY != null)) {
             iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                tY.I0().put(iterator.next(), Boolean.TRUE);
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, AlbumFragment.class, "3")) {
          tC = this.Y;
          if (tC != null) {
             tC.h = this.O;
          }
          if (!this.z.d().c()) {
             uArrayList = this.z.d().i();
             if (uArrayList != null && (uArrayList.isEmpty() ^ b) == b) {
                this.O = objArray;
             }
          }
       }
    label_0174 :
       k ok = this.z.m();
       this.A = ok;
       String str2 = "mAlbumUIOptions";
       if (ok == null) {
          a.S(str2);
       }
       this.S = ok.f();
       this.B = this.z.e();
       this.C = this.z.d();
       this.D = this.z.b();
       tC = this.C;
       if (tC == null) {
          a.S("mAlbumFragmentOptions");
       }
       String str3 = tC.l();
       d.a = str3;
       Log.g(str, "on create mTaskId:"+str3);
       tC = this.A;
       if (tC == null) {
          a.S(str2);
       }
       this.U = tC.e();
       tC = this.A;
       if (tC == null) {
          a.S(str2);
       }
       this.V = tC.e;
       tC = this.A;
       if (tC == null) {
          a.S(str2);
       }
       this.W = tC.z();
       tC = this.A;
       if (tC == null) {
          a.S(str2);
       }
       this.Q = tC.a;
       tC = this.A;
       if (tC == null) {
          a.S(str2);
       }
       this.R = tC.b;
       tC = this.A;
       if (tC == null) {
          a.S(str2);
       }
       this.X = tC.p();
       tC = this.C;
       if (tC == null) {
          a.S("mAlbumFragmentOptions");
       }
       this.w = tC.h;
       tC = this.A;
       if (tC == null) {
          a.S(str2);
       }
       this.P = tC.v();
       if (!g.c) {
          iterator = this.z.n().c().iterator();
          while (iterator.hasNext()) {
             PreLoader.getInstance().preload(new PreloadParam$Builder(this.getActivity()).setUseMutableContext(b).addLayoutId(iterator.next().intValue()).build());
          }
       }
       tC = this.C;
       if (tC == null) {
          a.S("mAlbumFragmentOptions");
       }
       this.Z0 = tC.a();
       if (this.w == null) {
          this.oh();
       }
       d.d("albumOpt").h("clickToLoadData");
       d.d("albumOpt").g("loadDataToRenderFinish");
       tC = this.Y;
       if (tC == null) {
          a.L();
       }
       if (tC.K0(this.getActivity())) {
          this.b1 = b;
          tC = this.Y;
          if (tC != null) {
             tC.M0();
          }
          tC = this.Y;
          if (tC != null && tC.J0() == b) {
             tC = this.Y;
             if (tC == null) {
                a.L();
             }
             tC.V0();
          }
       }
    label_02b9 :
       if (!a.b.a()) {
          str3 = this.z.e().a();
          a = b.a;
          a.c("AlbumFragment#onCreate", str3, a.a(str3));
       }
       return;
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AlbumFragment.class, "14")) {
          return;
       }
       super.onDestroy();
       Log.g("AlbumFragment", "onDestroy "+this);
       if (!PatchProxy.applyVoid(objArray, this, AlbumFragment.class, "44")) {
          Log.g("AlbumFragment", "stopObserve called\(\)");
          AlbumFragment tY = this.Y;
          if (tY != null) {
             tY.C0().removeObservers(this);
             tY.v0().removeObservers(this);
             tY.y0().removeObservers(this);
             tY.x0().removeObservers(this);
          }
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, AlbumFragment.class, "13")) {
          return;
       }
       super.onDestroyView();
       Log.g("AlbumFragment", "onDestroyView");
       Iterator iterator = this.z.n().c().iterator();
       while (iterator.hasNext()) {
          int[] ointArray = new int[]{iterator.next().intValue()};
          PreLoader.getInstance().clear(ointArray);
       }
       this.z.q(null);
       if (this.isAdded()) {
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
       }
       if (!PatchProxy.applyVoid(null, this, AlbumFragment.class, "32")) {
          iterator = this.Z.iterator();
          while (iterator.hasNext()) {
             iterator.next().g();
          }
       }
       AlbumFragment ta1 = this.a1;
       if (ta1 != null) {
          ta1.m();
       }
       ta1 = this.a1;
       if (ta1 != null) {
          AlbumSelectedContainer uAlbumSelect = AlbumSelectedContainer.class;
          if (!PatchProxy.applyVoid(null, ta1, uAlbumSelect, "52")) {
             Log.b("MediaSelectManager", "destroy\(\) called");
             if (!PatchProxy.applyVoid(null, ta1, uAlbumSelect, "53")) {
                View view = ta1.C();
                if (!PatchProxy.applyVoidOneRefs(view, null, c.class, "9") && view != null) {
                   int i = 0x7f0a1626;
                   ObjectAnimator tag = view.getTag(i);
                   if (tag != null) {
                      tag.removeAllListeners();
                      view.setTag(i, null);
                   }
                }
             }
             ta1.D().removeOnScrollListener(ta1.A);
             AlbumSelectedContainer z = ta1.z;
             if (z != null) {
                z.p = null;
             }
             if (!PatchProxy.applyVoid(null, ta1, uAlbumSelect, "67")) {
                uAlbumSelect = ta1.u;
                if (uAlbumSelect == null) {
                   a.S("mViewModel");
                }
                uAlbumSelect.B().removeObserver(ta1.S);
             }
          }
       }
       this.x = null;
       this.Vg();
       return;
    }
    public void onResume(){
       AlbumFragment tY;
       boolean b1;
       int i1;
       c uoc;
       ArrayList uArrayList;
       Iterator iterator;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AlbumFragment.class, "11")) {
          return;
       }
       super.onResume();
       boolean b = true;
       int i = 0;
       if (this.b1 == null) {
          tY = this.Y;
          if (tY == null) {
             a.L();
          }
          if (tY.K0(this.getActivity())) {
             this.b1 = b;
             tY = this.A;
             if (tY == null) {
                a.S("mAlbumUIOptions");
             }
             b1 = tY.z();
             this.W = b1;
             if (b1) {
                tY = this.s;
                if (tY != null) {
                   tY.setVisibility(i);
                }
             }else {
                tY = this.s;
                if (tY != null) {
                   tY.setVisibility(8);
                }
             }
          }
       }
    label_004c :
       tY = this.Y;
       if (tY != null) {
          List obj = PatchProxy.apply(objArray, tY, d.class, "67");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
             d g = tY.G;
             Objects.requireNonNull(g);
             obj = PatchProxy.apply(objArray, g, c.class, "20");
             if (obj != patchProxyRe) {
                b1 = obj.booleanValue();
             }else if(g.d.d().b()){
                obj = g.B().t();
                if (obj != null) {
                   uArrayList = new ArrayList();
                   iterator = obj.iterator();
                   while (iterator.hasNext()) {
                      Object obj2 = iterator.next();
                      if (g.d.e().b().isBadMediaInfo(obj2)) {
                         uArrayList.add(obj2);
                      }
                   }
                }else {
                   uArrayList = objArray;
                }
                if (uArrayList != null) {
                   if (!(uArrayList.isEmpty() ^ b)) {
                      uArrayList = objArray;
                   }
                   if (uArrayList != null) {
                      iterator = uArrayList.iterator();
                      c uoc1 = null;
                      while (iterator.hasNext()) {
                         uoc1 = iterator.next();
                         g.B().w(uoc1);
                         g.e.b(uoc1, g.d0(uoc1));
                         Log.g("AlbumSelectControllerImpl", "filterUnExistSelectedFiles: remove "+uoc1);
                         uoc1 = 1;
                      }
                      uoc = uoc1;
                   }
                }
             }
          label_0104 :
             uoc = null;
          }
          if (b1 != null) {
             tY = this.E;
             if (tY != null) {
                tY.g(i);
             }
          }
       }
    label_010e :
       if (this.dh() != null) {
          View view = this.dh();
          Object obj1 = PatchProxy.apply(objArray, this, AlbumFragment.class, "39");
          if (obj1 != patchProxyRe) {
             i1 = obj1.intValue();
          }else {
             AlbumFragment tA = this.A;
             if (tA == null) {
                a.S("mAlbumUIOptions");
             }
             if (tA.c() != -1) {
                tA = this.A;
                if (tA == null) {
                   a.S("mAlbumUIOptions");
                }
                i1 = tA.c();
             }else {
                i1 = 0xff000000;
             }
          }
          view.setBackgroundColor(i1);
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, AlbumFragment.class, "12")) {
          return;
       }
       super.onStop();
       this.ph(true);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       List list;
       AlbumFragment ta1;
       AlbumFragment ta11;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AlbumFragment.class, "6")) {
          return;
       }
       a.q(p0, "view");
       Log.b("AlbumFragment", "onViewCreated begin savedInstanceState="+p1);
       super.onViewCreated(p0, p1);
       this.t = p0.findViewById(0x7f0a3014);
       Ref$IntRef intRef = new Ref$IntRef();
       int i = 0;
       intRef.element = i;
       AlbumFragment tC = this.C;
       String str = "mAlbumFragmentOptions";
       if (tC == null) {
          a.S(str);
       }
       ArrayList uArrayList = tC.j();
       int i1 = (uArrayList != null)? uArrayList.size(): 0;
       ImageView imageView = null;
       if (i1 > 0) {
          AlbumFragment tY = this.Y;
          if (tY != null) {
             list = (uArrayList != null)? CollectionsKt___CollectionsKt.J5(uArrayList): imageView;
             tY.g0(list);
          }
          intRef.element = i1;
       }
       AbsSelectedContainerViewBinder uAbsSelected = this.Gh().q();
       if (uAbsSelected == null) {
          a.L();
       }
       AlbumSelectedContainer uAlbumSelect = new AlbumSelectedContainer(this, uAbsSelected);
       this.a1 = uAlbumSelect;
       uAlbumSelect.Y(this.Z0);
       tC = this.Y;
       list = (tC != null)? tC.m(): imageView;
       if (this.P == null) {
          ta1 = this.a1;
          if (ta1 != null) {
             ta1.m();
          }
       }
       ta1 = this.C;
       if (ta1 == null) {
          a.S(str);
       }
       int[] ointArray = ta1.k();
       if (ointArray != null) {
          AlbumFragment$onViewCreated$$inlined$also$lambda$1 oonViewCreat = 3;
          if (ointArray[i] != oonViewCreat) {
             ta1 = this.C;
             if (ta1 == null) {
                a.S(str);
             }
             if (ta1.a() != oonViewCreat) {
                ta1 = this.X;
                if (ta1 != null) {
                   ta1 = (ta1.length() > 0)? 1: null;
                   if (ta1) {
                      ta1 = this.C;
                      if (ta1 == null) {
                         a.S(str);
                      }
                      if (ta1.e() != 1) {
                         this.Wh(this.getFragmentManager());
                      }else {
                         this.f1 = true;
                      }
                   }
                }
             }
          }
       }
    label_00d7 :
       if (list != null) {
          if (!(list.isEmpty() ^ 1)) {
             ImageView imageView2 = imageView;
          }
          if (list != null) {
             this.Wh(this.getFragmentManager());
             this.f1 = i;
             AlbumFragment tY1 = this.Y;
             if (tY1 != null) {
                tY1.L0(this, list, intRef.element, new AlbumFragment$onViewCreated$$inlined$also$lambda$1(this, intRef));
             }
             ta11 = this.a1;
             if (ta11 != null) {
                ta11.W(list);
             }
          }
       }
    label_0102 :
       this.mh(new AlbumFragment$d(this));
       ViewPager viewPager = this.Gh().p();
       if (viewPager != null) {
          viewPager.setOffscreenPageLimit(2);
       }
       if (this.Mh()) {
          ViewGroup viewGroup = this.Gh().n();
          if (viewGroup != null) {
             viewGroup.removeView(this.Gh().m());
          }
          this.Gh().u(imageView);
       }
       if (!this.Nh()) {
          Resources resources = this.getResources();
          int i2 = 0x7f080f88;
          FragmentActivity activity = this.getActivity();
          Resources$Theme theme = (activity != null)? activity.getTheme(): imageView;
          Drawable drawable = resources.getDrawable(i2, theme);
          tC = this.t;
          if (tC != null) {
             tC.setBackground(drawable);
          }
       }else {
          ta11 = this.t;
          if (ta11 != null) {
             ta11.setOutlineProvider(new AlbumFragment$e(this));
          }
          ta11 = this.t;
          if (ta11 != null) {
             ta11.setClipToOutline(1);
          }
       }
       if (this.Qh()) {
          TextView textView = this.Gh().o();
          if (textView != null) {
             textView.setText(this.th());
          }
          textView = this.Gh().o();
          if (textView != null) {
             textView.setVisibility(i);
          }
       }
       if (this.W == null) {
          ta11 = this.s;
          if (ta11 != null) {
             ta11.setVisibility(8);
          }
       }
       ta11 = this.F;
       if (ta11 != null && ta11.size() == 1) {
          PagerSlidingTabStrip pagerSliding = this.jh();
          a.h(pagerSliding, "tabStrip");
          pagerSliding.v(i);
       }
       ta11 = this.Q;
       if (ta11 != null) {
          if (ta11.length() > 0) {
             i = 1;
          }
          if (i) {
             imageView = ta11;
          }
          if (imageView != null) {
             this.Vh(imageView, this.R);
          }
       }
       ta11 = this.A;
       String str1 = "mAlbumUIOptions";
       if (ta11 == null) {
          a.S(str1);
       }
       if (ta11.g() != -1) {
          ImageView imageView1 = this.Gh().m();
          if (imageView1 != null) {
             tC = this.A;
             if (tC == null) {
                a.S(str1);
             }
             imageView1.setImageResource(tC.g());
          }
       }
       this.Zh();
       this.nh();
       return;
    }
    public void pd(QMedia p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumFragment.class, "97")) {
          return;
       }
       a.q(p0, "media");
       AlbumFragment tY = this.Y;
       if (tY != null) {
          tY.Z(p0);
       }
       AlbumHomeFragment uAlbumHomeFr = this.zh();
       if (uAlbumHomeFr != null) {
          List list = uAlbumHomeFr.ch();
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                Fragment uFragment = iterator.next();
                Object[] objArray = null;
                if (!uFragment instanceof AlbumAssetFragment) {
                   uFragment = objArray;
                }
                if (uFragment == null || PatchProxy.applyVoid(objArray, uFragment, AlbumAssetFragment.class, "33")) {
                   continue ;
                }else {
                   RecyclerView recyclerView = uFragment.qh().q();
                   int i = 0;
                   if (recyclerView != null) {
                      recyclerView.scrollToPosition(i);
                   }
                   RecyclerView recyclerView1 = uFragment.qh().q();
                   if (recyclerView1 != null) {
                      objArray = recyclerView1.getLayoutManager();
                   }
                   if (objArray != null) {
                      objArray.scrollToPositionWithOffset(i, i);
                   }else {
                      throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                   }
                }
             }
          }
       }
       return;
    }
    public void pf(IAlbumMainFragment$c p0){
       this.L = p0;
    }
    public final void ph(boolean p0){
       AlbumFragment tx;
       if (PatchProxy.isSupport(AlbumFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AlbumFragment.class, "77")) {
          return;
       }
       this.e1 = this.e1 - 1;
       Log.g("AlbumFragment", "dismissLoadingDialog, progressDialogShowCount="+this.e1);
       if (p0) {
          this.e1 = 0;
          tx = this.x;
          if (tx != null) {
             tx.dismiss();
          }
       }else if(this.e1 <= null){
          tx = this.x;
          if (tx != null) {
             tx.dismiss();
          }
       }
       return;
    }
    public final a rh(){
       return this.z;
    }
    public void s5(float p0){
       if (PatchProxy.isSupport(AlbumFragment.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, AlbumFragment.class, "45")) {
          return;
       }
       this.U0.i.onNext(Float.valueOf(p0));
       return;
    }
    public final String sh(){
       Object[] objArray1;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, AlbumFragment.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Log.b("AlbumFragment", "getDefaultAlbumName\(\) called");
       this.Lh();
       obj = this.getString(R.string.arg_RES_7f101895);
       a.h(obj, "getString\(R.string.ksalbum_camera_album\)");
       AlbumFragment tC = this.C;
       if (tC == null) {
          a.S("mAlbumFragmentOptions");
       }
       int[] ointArray = tC.k();
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
       tC = this.U;
       if (tC != null) {
          if (tC.length() > 0) {
             i = 1;
          }
          if (i) {
             objArray = tC;
          }
          if (objArray != null) {
             objArray1 = objArray;
          }
       }
       return objArray1;
    }
    public void t3(boolean p0){
       int height;
       int i;
       if (PatchProxy.isSupport(AlbumFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AlbumFragment.class, "104")) {
          return;
       }
       AlbumFragment tW0 = this.W0;
       Objects.requireNonNull(tW0);
       BottomContainerStub uBottomConta = BottomContainerStub.class;
       if (!PatchProxy.isSupport(uBottomConta) || (PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), tW0, uBottomConta, "6") || (tW0.f != null && tW0.i() != null))) {
          uBottomConta = null;
          if (p0) {
             View view = tW0.i();
             if (view == null) {
                a.L();
             }
             height = view.getHeight();
          }else {
             height = 0;
          }
          if (p0) {
             i = 0;
          }else {
             View view2 = tW0.i();
             if (view2 == null) {
                a.L();
             }
             i = view2.getHeight();
          }
          if (!p0) {
             uBottomConta = tW0.f;
             if (uBottomConta == null) {
                a.L();
             }
             if (!uBottomConta.k3()) {
                LifecycleOwner lifecycleOwn = tW0.e();
                uBottomConta = tW0.f;
                if (uBottomConta == null) {
                   a.L();
                }
                AlbumFragment.Uh(lifecycleOwn, p0, (int)uBottomConta.Se(), 0, false, false, 28, null);
             }
          }else {
             View view1 = tW0.i();
             if (view1 != null) {
                view1.setVisibility(uBottomConta);
             }
          }
          c.i(tW0.i(), height, i, p0, new u(tW0, p0));
       }
    label_00a2 :
       return;
    }
    public void ta(IAlbumMainFragment$h p0){
       this.J = p0;
    }
    public final String th(){
       Object[] objArray1;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, AlbumFragment.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Log.b("AlbumFragment", "getDefaultAlbumSubtitle\(\) called");
       this.Lh();
       obj = this.getString(R.string.arg_RES_7f1018d1);
       a.h(obj, "getString\(R.string.ksalbum_subtitle\)");
       AlbumFragment tV = this.V;
       if (tV != null) {
          int i = (tV.length() > 0)? 1: 0;
          if (i) {
             objArray = tV;
          }
          if (objArray != null) {
             objArray1 = objArray;
          }
       }
       return objArray1;
    }
    public void u3(IAlbumMainFragment$g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumFragment.class, "90")) {
          return;
       }
       this.z.c = p0;
       return;
    }
    public void uc(l0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumFragment.class, "52")) {
          return;
       }
       a.q(p0, "subTab");
       Fragment uFragment = this.t();
       if (!uFragment instanceof AlbumHomeFragment) {
          uFragment = null;
       }
       if (uFragment != null) {
          b[] uobArray = new b[]{p0.G3(this.getContext())};
          List list = CollectionsKt__CollectionsKt.P(uobArray);
          if (!PatchProxy.applyVoidOneRefs(list, uFragment, KsAlbumTabHostFragment.class, "27")) {
             uFragment.l.z(list);
             uFragment.j.q();
          }
       }
       return;
    }
    public final int uh(){
       return this.S;
    }
    public void v5(IAlbumMainFragment$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumFragment.class, "88")) {
          return;
       }
       this.z.l().add(p0);
       return;
    }
    public final int vh(){
       return this.c1;
    }
    public final AlbumSelectedContainer wh(){
       return this.a1;
    }
    public void x3(d0 p0){
       this.u = p0;
    }
    public void x4(){
       if (PatchProxy.applyVoid(null, this, AlbumFragment.class, "94")) {
          return;
       }
       AlbumHomeFragment uAlbumHomeFr = this.zh();
       if (uAlbumHomeFr != null) {
          List list = uAlbumHomeFr.ch();
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                Fragment uFragment = iterator.next();
                if (!uFragment instanceof AlbumAssetFragment) {
                   uFragment = null;
                }
                if (uFragment != null) {
                   if (!uFragment.isVisible()) {
                      uFragment = null;
                   }
                   if (uFragment == null || PatchProxy.applyVoid(null, uFragment, AlbumAssetFragment.class, "34")) {
                      continue ;
                   }else {
                      Log.b("AlbumAssetFragment", "showEmptyView\(\) called");
                      uFragment.sh();
                      LoadingView loadingView = uFragment.qh().k();
                      if (loadingView != null) {
                         loadingView.setVisibility(8);
                      }
                      LinearLayout linearLayout = uFragment.qh().m();
                      if (linearLayout != null) {
                         linearLayout.setVisibility(0);
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public void x6(IAlbumMainFragment$f p0){
       this.G = p0;
    }
    public void x8(){
       if (PatchProxy.applyVoid(null, this, AlbumFragment.class, "91")) {
          return;
       }
       if (!this.isVisible()) {
          return;
       }
       AlbumHomeFragment uAlbumHomeFr = this.zh();
       if (uAlbumHomeFr != null) {
          List list = uAlbumHomeFr.ch();
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                Fragment uFragment = iterator.next();
                if (!uFragment instanceof AlbumAssetFragment) {
                   uFragment = null;
                }
                if (uFragment != null) {
                   if (!uFragment.isVisible()) {
                      uFragment = null;
                   }
                   if (uFragment == null || PatchProxy.applyVoid(null, uFragment, AlbumAssetFragment.class, "29")) {
                      continue ;
                   }else {
                      AlbumAssetFragment w = uFragment.w;
                      if (w == null) {
                         a.S("mAssetListAdapter");
                      }
                      if (!w.getItemCount()) {
                         Log.b("AlbumAssetFragment", "showLoadingIfListEmpty: show loading");
                         LoadingView loadingView = uFragment.qh().k();
                         if (loadingView != null) {
                            loadingView.a();
                         }
                         loadingView = uFragment.qh().k();
                         if (loadingView != null) {
                            loadingView.setVisibility(0);
                         }
                         LinearLayout linearLayout = uFragment.qh().m();
                         if (linearLayout != null) {
                            linearLayout.setVisibility(8);
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public final IAlbumMainFragment$e xh(){
       return this.H;
    }
    public void y5(IAlbumMainFragment$e p0){
       this.H = p0;
    }
    public void y8(){
       int i;
       if (PatchProxy.applyVoid(null, this, AlbumFragment.class, "86")) {
          return;
       }
       if (this.getActivity() == null || (this.isAdded() && this.a1 != null)) {
          AlbumFragment tY = this.Y;
          if (tY != null) {
             tY.z();
          }
          tY = this.a1;
          if (tY != null) {
             tY.m();
          }
          tY = this.a1;
          if (tY != null) {
             AlbumSelectedContainer.f0(tY, 0, 1, null);
          }
          if (!PatchProxy.applyVoid(null, this, AlbumFragment.class, "99")) {
             AlbumHomeFragment uAlbumHomeFr = this.zh();
             if (uAlbumHomeFr != null) {
                List list = uAlbumHomeFr.ch();
                if (list != null) {
                   Iterator iterator = list.iterator();
                   while (iterator.hasNext()) {
                      Fragment uFragment = iterator.next();
                      if (!uFragment instanceof AlbumAssetFragment) {
                         uFragment = null;
                      }
                      if (uFragment != null) {
                         uFragment.Ih(0);
                         uFragment.Ch();
                      }
                   }
                }
             }
          }
          ViewPager viewPager = this.Gh().p();
          if (viewPager != null) {
             a adapter = viewPager.getAdapter();
             if (adapter != null) {
                i = adapter.j();
             label_0082 :
                if (i > 0) {
                   viewPager = this.Gh().p();
                   if (viewPager != null) {
                      viewPager.setCurrentItem(0);
                   }
                }
             }
          }
          i = 0;
          goto label_0082 ;
       }
    label_0091 :
       return;
    }
    public final List yh(){
       return this.O;
    }
    public final AlbumHomeFragment zh(){
       Object[] objArray;
       List obj = PatchProxy.apply(null, this, AlbumFragment.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.ch();
       if (obj != null) {
          Iterator iterator = obj.iterator();
          while (true) {
             if (iterator.hasNext()) {
                objArray = iterator.next();
                if (!objArray instanceof AlbumHomeFragment) {
                   continue ;
                }
             }else {
                objArray = null;
             }
          }
          return objArray;
       }else {
          objArray = null;
       }
       if (objArray instanceof AlbumHomeFragment) {
          goto label_0035 ;
       }else {
          return null;
       }
    }
}
