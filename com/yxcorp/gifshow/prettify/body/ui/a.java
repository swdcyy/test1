package com.yxcorp.gifshow.prettify.body.ui.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.prettify.body.ui.a$b;
import nsd.u;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.prettify.body.ui.a$c;
import n1c.l;
import p0c.b;
import com.yxcorp.gifshow.prettify.body.model.BodySlimmingViewModel;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import com.yxcorp.gifshow.prettify.body.model.BodySlimmingPanelItem;
import java.util.Collection;
import trd.y;
import com.kwai.robust.PatchProxy;
import x0c.c;
import java.lang.Integer;
import java.util.HashMap;
import x0c.d;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import xyb.a;
import q87.c;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.prettify.body.model.BodySlimmingViewModel$a;
import java.util.List;
import y0c.f$a;
import y0c.f;
import y0c.i;
import k2b.e0;
import java.lang.Runnable;
import t45.c;
import x0c.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import a17.g;
import lnc.a1;
import com.kwai.library.widget.popup.sheet.SheetItemStatus;
import java.lang.CharSequence;
import java.util.Collections;
import a17.c$a;
import android.app.Activity;
import a17.f;
import com.yxcorp.gifshow.prettify.body.ui.a$d;
import a17.b$b;
import com.yxcorp.gifshow.prettify.body.ui.a$e;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import y0c.j;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.prettify.body.ui.a$a;
import android.view.View;
import com.yxcorp.utility.n;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwai.library.widget.progressbar.DownloadProgressBar;
import android.graphics.drawable.Drawable;
import bld.b;
import ekd.r;
import bld.c;
import n1c.i;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import n1c.e;
import n1c.n;
import jd.c;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.graphics.Typeface;
import android.content.res.ColorStateList;
import androidx.core.graphics.drawable.a;
import android.widget.ImageView$ScaleType;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.prettify.body.ui.BodySlimmingAdapter$BodySlimmingHolder$onBind$2;
import msd.l;
import y0c.b;
import android.view.View$OnClickListener;
import android.widget.ProgressBar;
import com.yxcorp.gifshow.util.resource.ResourceDownloadProgressHelper;
import t16.a;
import com.yxcorp.gifshow.util.resource.ResourceDownloadProgressHelper$DownloadID;
import java.lang.Enum;
import y0c.d;
import com.yxcorp.gifshow.util.resource.ResourceDownloadProgressHelper$b;
import y0c.c;
import android.view.ViewGroup;
import android.content.Context;
import i2b.a;

public final class a extends RecyclerView$Adapter	// class@00113e
{
    public final BodySlimmingViewModel e;
    public View f;
    public ArrayList g;
    public int h;
    public boolean i;
    public final BaseFragment j;
    public final a$c k;
    public l l;
    public b m;
    public static final a$b n;

    static {
       a.n = new a$b(null);
    }
    public void a(BaseFragment p0,a$c p1,l p2,b p3){
       BodySlimmingViewModel uBodySlimmin = BodySlimmingViewModel.class;
       a.p(p0, "fragment");
       String str = "prettifyForbidHelper";
       a.p(p2, str);
       a.p(p3, "bodyOption");
       super();
       this.j = p0;
       this.k = p1;
       this.l = p2;
       this.m = p3;
       FragmentActivity activity = p0.getActivity();
       a.m(activity);
       ViewModel viewModel = ViewModelProviders.of(activity).get(uBodySlimmin);
       a.o(viewModel, "ViewModelProviders.of\(fr¡­ingViewModel::class.java\)");
       this.e = viewModel;
       ArrayList uArrayList = new ArrayList();
       this.g = uArrayList;
       y.s0(uArrayList, viewModel.r0());
       if (!this.l.b()) {
          this.h = viewModel.b;
       }
       a tl = this.l;
       if (!PatchProxy.applyVoidTwoRefs(p0, tl, viewModel, uBodySlimmin, "2")) {
          a.p(p0, "lifecycleOwner");
          a.p(tl, str);
          int i = 0;
          if (!tl.b()) {
             BodySlimmingViewModel n = viewModel.n;
             int len = n.length;
             for (int i1 = 0; i1 < len; i1 = i1 + 1) {
                object oobject = n[i1];
                if (viewModel.l.containsKey(Integer.valueOf(oobject.p()))) {
                   Integer integer = viewModel.l.get(Integer.valueOf(oobject.p()));
                   int i2 = (integer != null)? integer.intValue(): 0;
                   oobject.t(i2);
                }
                oobject.b(p0, new d(viewModel, oobject));
             }
          }else {
             Object[] objArray = new Object[i];
             a.D().A("BodySlimming", "Prettify is now forbidden, ignore value change", objArray);
          }
       }
       return;
    }
    public final void J0(int p0,BodySlimmingPanelItem p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "9")) {
          return;
       }
       uoa = this.h;
       if (uoa != p0) {
          Boolean fALSE = Boolean.FALSE;
          this.m0(uoa, fALSE);
          this.m0(p0, fALSE);
          this.h = p0;
       }
       uoa = this.k;
       if (uoa != null) {
          uoa.p4(p1, p0, this.i);
       }
       if (this.i != null || !p0) {
          uoa = this.e;
          Objects.requireNonNull(uoa);
          BodySlimmingViewModel uBodySlimmin = BodySlimmingViewModel.class;
          if (!PatchProxy.isSupport(uBodySlimmin) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uoa, uBodySlimmin, "8")) {
             uoa.G0(uoa.o[p0]);
          }
          LinkedHashSet linkedHashSe = new LinkedHashSet();
          linkedHashSe.addAll(this.e.v0());
          Iterator iterator = linkedHashSe.iterator();
          while (iterator.hasNext()) {
             iterator.next().D8(p1, p0);
          }
       }
       return;
    }
    public final BodySlimmingPanelItem K0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object obj1 = this.g.get(p0);
       a.o(obj1, "dataList[position]");
       return obj1;
    }
    public final int L0(BodySlimmingPanelItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "item");
       return this.g.indexOf(p0);
    }
    public final boolean M0(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return BodySlimmingViewModel.r.a().isEmpty();
    }
    public final void N0(int p0,boolean p1){
       f$a a;
       boolean b;
       f$a a1;
       boolean b1;
       a uoa3;
       MutableLiveData mutableLiveD;
       Integer value;
       Integer value1;
       Object obj = this;
       int i = p0;
       f$a uoa = f$a.class;
       a uoa1 = a.class;
       if (PatchProxy.isSupport(uoa1) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), obj, uoa1, "8")) {
          return;
       }
       if (obj.l.b()) {
          return;
       }
       Object obj1 = obj.g.get(i);
       a.o(obj1, "dataList[position]");
       if (obj1.g()) {
          return;
       }
       a = f.a;
       a j = obj.j;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidTwoRefs(obj1, j, a, uoa, "1")) {
          a.p(obj1, "item");
          a.p(j, "page");
          c.a(new i(obj1, j));
       }
       a e = obj.e;
       Objects.requireNonNull(e);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       BodySlimmingViewModel uBodySlimmin = BodySlimmingViewModel.class;
       if (PatchProxy.isSupport(uBodySlimmin)) {
          Object[] obj2 = PatchProxy.applyOneRefs(Integer.valueOf(p0), e, uBodySlimmin, "6");
          if (obj2 != patchProxyRe) {
             b = obj2.booleanValue();
          }else if(a.g(e.o[i], e.m)){
             obj2 = null;
             BodySlimmingViewModel obj3 = PatchProxy.apply(obj2, e, uBodySlimmin, "9");
             if (obj3 != patchProxyRe) {
                b1 = obj3.booleanValue();
             }else {
                obj3 = e.n;
                int len1 = obj3.length;
                int i2 = 0;
                while (true) {
                   if (i2 < len1) {
                      object oobject = obj3[i2];
                      if (e.l.containsKey(Integer.valueOf(oobject.p()))) {
                         value = e.l.get(Integer.valueOf(oobject.p()));
                         a uoa4 = oobject.n();
                         if (uoa4 != null) {
                            MutableLiveData mutableLiveD1 = uoa4.c();
                            if (mutableLiveD1 != null) {
                               value1 = mutableLiveD1.getValue();
                            label_00db :
                               int i3 = a.g(value1, value) ^ 1;
                               if (i3) {
                               label_0100 :
                                  b1 = false;
                               }
                            }
                         }
                         value1 = obj2;
                         goto label_00db ;
                      }else {
                         uoa3 = oobject.n();
                         if (uoa3 != null) {
                            mutableLiveD = uoa3.c();
                            if (mutableLiveD != null) {
                               value = mutableLiveD.getValue();
                            label_00f7 :
                               if (value == null || value.intValue()) {
                                  goto label_0100 ;
                               }
                            }
                         }
                         Object[] objArray = obj2;
                         goto label_00f7 ;
                      }
                      i2 = i2 + 1;
                   }else {
                      b1 = true;
                   }
                }
             }
             if (!b1) {
                Object obj4 = PatchProxy.apply(obj2, e, uBodySlimmin, "10");
                if (obj4 != patchProxyRe) {
                   b = obj4.booleanValue();
                }else {
                   BodySlimmingViewModel n = e.n;
                   int len = n.length;
                   int i1 = 0;
                   while (true) {
                      if (i1 < len) {
                         uoa3 = n[i1].n();
                         if (uoa3 != null) {
                            mutableLiveD = uoa3.c();
                            if (mutableLiveD != null) {
                               value = mutableLiveD.getValue();
                            label_0133 :
                               if (value == null || value.intValue()) {
                                  b = false;
                               }else {
                                  i1 = i1 + 1;
                               }
                            }
                         }
                         value = obj2;
                         goto label_0133 ;
                      }else {
                         b = true;
                      }
                   }
                }
                if (!b) {
                   b = true;
                }
             }
          }
       label_0146 :
          b = false;
       }else {
          goto label_0081 ;
       }
       if (b && !p1) {
          FragmentActivity activity = obj.j.getActivity();
          if (activity != null) {
             String str = a1.p(R.string.arg_RES_7f104b43);
             a.o(str, "CommonUtil.string\(R.stri¡­ng_alert_key_confirm_new\)");
             List list = Collections.singletonList(new g(str, SheetItemStatus.Primary));
             a.o(list, "Collections.singletonLis¡­ary\n          \)\n        \)");
             c$a uoa2 = f.a(new c$a(activity));
             uoa2.n0(a1.p(R.string.arg_RES_7f104b44));
             uoa2.j0(list);
             uoa2.g0(R.string.cancel);
             uoa2.i0(new a$d(activity, obj, i, obj1));
             uoa2.J(new a$e(activity));
             uoa2.X();
             a1 = f.a;
             Objects.requireNonNull(a1);
             if (!PatchProxy.applyVoidOneRefs(activity, a1, uoa, "3")) {
                a.p(activity, "page");
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "QUICK_THIN_DIALOG";
                c.a(new j(activity, uElementPack));
             }
          }
       }else {
          obj.J0(i, obj1);
       }
       return;
    }
    public int f0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0 = (this.K0(p0).g())? 2: 1;
       return p0;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.g.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       int b1;
       DownloadProgressBar uDownloadPro1;
       int max;
       Object obj = this;
       int i = p1;
       View view = p0;
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(view, Integer.valueOf(p1), obj, uoa, "4")) {
          a.p(view, "holder");
          a$a obj1 = obj.g.get(i);
          a.o(obj1, "dataList[position]");
          a j = obj.j;
          Objects.requireNonNull(view);
          a$a uoa1 = a$a.class;
          boolean b = true;
          if (!PatchProxy.applyVoidTwoRefs(obj1, j, view, uoa1, "1")) {
             a.p(obj1, "panelItem");
             a.p(j, "owner");
             view.a = view.itemView.findViewById(0x7f0a381a);
             b1 = 2;
             if (obj1.g()) {
                View[] viewArray = new View[]{view.c,view.b,view.e,view.a};
                n.Z(8, viewArray);
                n.Y(view.d, 0, 0);
             }else {
                a$a e = view.e;
                if (e != null) {
                   int i1 = (obj1.k())? 0: 8;
                   e.setVisibility(i1);
                }
                e = view.c;
                if (e != null) {
                   e.setText(a1.p(obj1.c()));
                }
                view.f = view.itemView.findViewById(0x7f0a0c1b);
                view.g = view.itemView.findViewById(0x7f0a0c1c);
                int i2 = obj1.f();
                Drawable uDrawable = a1.f(i2);
                Object[] objArray = null;
                if (view.h.m.a()) {
                   if (!PatchProxy.applyVoid(objArray, view, uoa1, "2")) {
                      uoa1 = view.c;
                      if (uoa1 != null) {
                         uoa1.setTextColor(a1.a(R.color.arg_RES_7f061c3d));
                      }
                      uoa1 = view.c;
                      if (uoa1 != null) {
                         b uob = new b();
                         uob.v(r.d((int)15.30f, a1.a(R.color.arg_RES_7f0601cb)));
                         uob.g(i.a());
                         uoa1.setBackground(uob.a());
                      }
                   }
                   if (uDrawable != null) {
                      e = view.b;
                      if (e != null) {
                         j = e.getHierarchy();
                         if (j != null) {
                            j.u(t$b.h);
                         }
                      }
                      a$a b2 = view.b;
                      if (b2 != null) {
                         b2.z(i2, -1, -1, n.d(), null);
                      }
                      e = view.b;
                      if (e != null) {
                         e.setBackground(a1.f(R.drawable.arg_RES_7f081d2d));
                      }
                   }
                }else {
                   uoa1 = view.c;
                   if (uoa1 != null) {
                      uoa1.setTypeface(objArray, obj1.isSelected());
                   }
                   if (uDrawable != null) {
                      int[] ointArray = new int[b1];
                      ointArray[0] = a1.a(0x7f060751);
                      ointArray[b] = a1.a(0x7f061c32);
                      int[][] ointArray1 = new int[][b1];
                      int[] ointArray2 = new int[b];
                      ointArray2[0] = 0x10102fe;
                      ointArray1[0] = ointArray2;
                      ointArray2 = new int[0];
                      ointArray1[b] = ointArray2;
                      a.o(uDrawable, new ColorStateList(ointArray1, ointArray));
                      uoa1 = view.b;
                      if (uoa1 != null) {
                         uoa1.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
                      }
                      uoa1 = view.b;
                      if (uoa1 != null) {
                         uoa1.setImageDrawable(uDrawable);
                      }
                   }
                }
             label_0187 :
                obj1.l(new BodySlimmingAdapter$BodySlimmingHolder$onBind$2(view, obj1));
             }
          }
          if (!obj1.g()) {
             j = obj.k;
             if (j != null) {
                j.q7(obj1, i);
             }
             view.itemView.setOnClickListener(new b(obj, i));
             KwaiImageView kwaiImageVie = view.b();
             if (kwaiImageVie != null) {
                kwaiImageVie.setVisibility(0);
             }
             DownloadProgressBar uDownloadPro = view.c();
             if (uDownloadPro != null) {
                uDownloadPro.setVisibility(8);
             }
             ImageView imageView = view.d();
             if (imageView != null) {
                imageView.setVisibility(8);
             }
             obj.l.d(view.itemView);
             RecyclerView$ViewHolder itemView = view.itemView;
             String str = "holder.itemView";
             a.o(itemView, str);
             b1 = (i == obj.h)? true: false;
             itemView.setSelected(b1);
             itemView = view.itemView;
             a.o(itemView, str);
             if (itemView.isSelected() && !obj.l.b()) {
                j = obj.k;
                if (j != null) {
                   j.p4(obj1, i, this.M0());
                }
             }
             obj1 = view.a;
             if (obj1 != null) {
                if (i != obj.h) {
                   b = false;
                }
                obj1.setSelected(b);
             }
             RecyclerView$ViewHolder itemView1 = view.itemView;
             a.o(itemView1, str);
             if (itemView1.isSelected() && (i && !this.M0())) {
                if (!PatchProxy.applyVoidOneRefs(view, obj, uoa, "10")) {
                   ArrayList uArrayList = BodySlimmingViewModel.r.a();
                   uDownloadPro1 = view.c();
                   max = (uDownloadPro1 != null)? uDownloadPro1.getMax(): 0;
                   ResourceDownloadProgressHelper.d().a(new a(n.b(obj.m.f), "inner_resource"), ResourceDownloadProgressHelper$DownloadID.BODY_DOWNLOAD_ID.name(), uArrayList, new d(obj, view, max));
                }
                if (view.c() != null) {
                   float f = ResourceDownloadProgressHelper.d().c(ResourceDownloadProgressHelper$DownloadID.BODY_DOWNLOAD_ID.name());
                   if (f - 0xbf800000) {
                      uDownloadPro1 = view.c();
                      max = (uDownloadPro1 != null)? uDownloadPro1.getMax(): 0;
                      DownloadProgressBar uDownloadPro2 = view.c();
                      if (uDownloadPro2 != null) {
                         uDownloadPro2.setProgress((int)(f * (float)max));
                      }
                   }
                   DownloadProgressBar uDownloadPro3 = view.c();
                   if (uDownloadPro3 != null) {
                      uDownloadPro3.setProgressArcColor(a1.a(R.color.arg_RES_7f061fda));
                   }
                   uDownloadPro3 = view.c();
                   if (uDownloadPro3 != null) {
                      uDownloadPro3.setProgressArcBackgroundColor(a1.a(R.color.arg_RES_7f061c14));
                   }
                   uDownloadPro3 = view.c();
                   if (uDownloadPro3 != null) {
                      uDownloadPro3.setVisibility(0);
                   }
                }
                ImageView imageView1 = view.d();
                if (imageView1 != null) {
                   imageView1.setOnClickListener(new c(obj));
                }
             }
          }
       }
    label_02bf :
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       a$a uoa1;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          uoa1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2");
          if (uoa1 != PatchProxyResult.class) {
          label_0053 :
             return uoa1;
          }
       }
       a.p(p0, "parent");
       if (p1 == 1) {
          p1 = (this.m.a())? 0x7f0d1198: 0x7f0d1197;
       }else if(this.m.a()){
          p1 = 0x7f0d11a0;
       }else {
          p1 = 0x7f0d119f;
       }
       View view = a.d(p0.getContext(), p1, p0, false);
       a.o(view, "itemView");
       uoa1 = new a$a(this, view);
       goto label_0053 ;
    }
}
