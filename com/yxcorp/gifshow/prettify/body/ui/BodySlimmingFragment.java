package com.yxcorp.gifshow.prettify.body.ui.BodySlimmingFragment;
import com.yxcorp.gifshow.prettify.body.ui.a$c;
import com.kwai.feature.post.api.fragment.FlyWheelBaseFragment;
import com.yxcorp.gifshow.prettify.body.ui.BodySlimmingFragment$a;
import nsd.u;
import n1c.l;
import android.util.SparseArray;
import com.yxcorp.gifshow.prettify.body.model.BodySlimmingPanelItem;
import y0c.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import y0c.f;
import java.util.Objects;
import y0c.f$a;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import y0c.h;
import k2b.e0;
import java.lang.Runnable;
import t45.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcorp.gifshow.prettify.body.model.BodySlimmingViewModel;
import androidx.lifecycle.ViewModel;
import o0c.d;
import p0c.b;
import i2b.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.prettify.body.ui.a;
import x0c.a;
import x0c.c;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import kotlin.collections.ArraysKt___ArraysKt;
import usd.q;
import java.lang.Boolean;
import com.kwai.feature.post.api.widget.PrettifyDoubleSeekBar;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import k1c.c;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.y;
import android.view.ViewStub;
import y0c.e;
import com.kwai.feature.post.api.widget.PrettifyDoubleSeekBar$a;
import xyb.a;
import java.lang.RuntimeException;
import java.lang.Throwable;
import w46.b;
import android.content.Context;
import lnc.a1;
import k17.b;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p0c.e;
import oe6.e;
import java.lang.StringBuilder;
import q87.c;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Integer;

public final class BodySlimmingFragment extends FlyWheelBaseFragment implements a$c	// class@001138
{
    public ScrollToCenterRecyclerView n;
    public BodySlimmingViewModel o;
    public PrettifyDoubleSeekBar p;
    public ViewStub q;
    public b r;
    public l s;
    public final SparseArray t;
    public static final BodySlimmingFragment$a u;

    static {
       BodySlimmingFragment.u = new BodySlimmingFragment$a(null);
    }
    public void BodySlimmingFragment(){
       super();
       this.s = new l();
       this.t = new SparseArray();
    }
    public void D8(BodySlimmingPanelItem p0,int p1){
       a.b(this, p0, p1);
    }
    public String E7(){
       return "SlimmingBody";
    }
    public final void ch(){
       if (PatchProxy.applyVoid(null, this, BodySlimmingFragment.class, "11")) {
          return;
       }
       if (this.t.size() > 0) {
          f$a a = f.a;
          BodySlimmingFragment tt = this.t;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidTwoRefs(this, tt, a, f$a.class, "5")) {
             a.p(this, "page");
             a.p(tt, "shownItems");
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "BODY_MATERIAL";
             JsonObject jsonObject = new JsonObject();
             JsonArray jsonArray = new JsonArray();
             int i1 = tt.size();
             for (int i = 0; i < i1; i = i + 1) {
                JsonObject jsonObject1 = new JsonObject();
                jsonObject1.c0("item", tt.get(tt.keyAt(i)).a());
                jsonArray.G(jsonObject1);
             }
             jsonObject.G("show_items", jsonArray);
             uElementPack.params = jsonObject.toString();
             c.a(new h(this, uElementPack));
          }
          this.t.clear();
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, BodySlimmingFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       FragmentActivity activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       this.o = ViewModelProviders.of(activity).get(BodySlimmingViewModel.class);
       BodySlimmingFragment tr = this.r;
       String str = "bodyOption";
       if (tr == null) {
          a.S(str);
       }
       d uod = tr.c();
       if (uod != null) {
          uod.W5();
       }
       tr = this.r;
       if (tr == null) {
          a.S(str);
       }
       return a.g(p0, tr.a, p1, false);
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BodySlimmingFragment.class, "7")) {
          return;
       }
       this.ch();
       BodySlimmingFragment tn = this.n;
       a.m(tn);
       RecyclerView$Adapter adapter = tn.getAdapter();
       Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.yxcorp.gifshow.prettify.body.ui.BodySlimmingAdapter");
       if (!PatchProxy.applyVoid(objArray, adapter, a.class, "11")) {
          a e = adapter.e;
          a j = adapter.j;
          a l = adapter.l;
          Objects.requireNonNull(e);
          if (!PatchProxy.applyVoidTwoRefs(j, l, e, BodySlimmingViewModel.class, "3")) {
             a.p(j, "lifecycleOwner");
             a.p(l, "prettifyForbidHelper");
             BodySlimmingViewModel n = e.n;
             int len = n.length;
             int i = 0;
             int i1 = 0;
             while (i1 < len) {
                a uoa = n[i1].n();
                if (uoa != null) {
                   MutableLiveData mutableLiveD = uoa.c();
                   if (mutableLiveD != null) {
                      mutableLiveD.removeObservers(j);
                   }
                }
                i1 = i1 + 1;
             }
             if (!l.b()) {
                e.b = q.n(ArraysKt___ArraysKt.df(e.o, e.p.getValue()), i);
             }
             BodySlimmingViewModel o = e.o;
             int len1 = o.length;
             for (; i < len1; i = i + 1) {
                o[i].d();
             }
          }
       }
       super.onDestroyView();
       tn = this.r;
       if (tn == null) {
          a.S("bodyOption");
       }
       d uod = tn.c();
       if (uod != null) {
          uod.f5();
       }
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(BodySlimmingFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BodySlimmingFragment.class, "6")) {
          return;
       }
       super.onHiddenChanged(p0);
       if (!p0 && this.s.b()) {
          this.s.e();
       }
       BodySlimmingFragment tp = this.p;
       if (tp == null) {
          return;
       }else {
          String str = "seekBar";
          if (tp == null) {
             a.S(str);
          }
          if (!tp.getVisibility()) {
             tp = this.p;
             if (tp == null) {
                a.S(str);
             }
             tp.a((p0 ^ 0x01));
             if (!p0 && this.s.b()) {
                tp = this.p;
                if (tp == null) {
                   a.S(str);
                }
                tp.setVisibility(4);
             }
          }
       label_005c :
          if (!p0) {
             if (!PatchProxy.applyVoid(null, this, BodySlimmingFragment.class, "10")) {
                tp = this.n;
                a.m(tp);
                RecyclerView$LayoutManager layoutManage = tp.getLayoutManager();
                Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int i = layoutManage.i0();
                int i1 = layoutManage.c();
                if (i >= 0 && (i1 >= i && i <= i1)) {
                   BodySlimmingFragment tn = this.n;
                   a.m(tn);
                   RecyclerView$Adapter adapter = tn.getAdapter();
                   Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.yxcorp.gifshow.prettify.body.ui.BodySlimmingAdapter");
                   this.q7(adapter.K0(i), i);
                   while (i != i1) {
                      i = i + 1;
                   }
                }
             }
          }else {
             this.ch();
          }
          tp = this.r;
          if (tp == null) {
             a.S("bodyOption");
          }
          d uod = tp.c();
          if (uod != null) {
             uod.v6(p0);
          }
          return;
       }
    }
    public void onViewCreated(View p0,Bundle p1){
       String str;
       BodySlimmingFragment tn;
       BodySlimmingFragment tn1;
       BodySlimmingViewModel m;
       Object[] objArray1;
       View view;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BodySlimmingFragment.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.t.clear();
       BodySlimmingFragment ts = this.s;
       boolean i = 3;
       BodySlimmingFragment tr = this.r;
       if (tr == null) {
          a.S("bodyOption");
       }
       ts.a(i, tr.d);
       if (this.s.b()) {
          this.s.e();
       }
       ScrollToCenterRecyclerView scrollToCent = p0.findViewById(R.id.body_slimming_list);
       this.n = scrollToCent;
       a.m(scrollToCent);
       RecyclerView$l itemAnimator = scrollToCent.getItemAnimator();
       Objects.requireNonNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
       i = false;
       itemAnimator.K(i);
       if (!PatchProxy.applyVoidOneRefs(p0, this, BodySlimmingFragment.class, "4") && !this.s.b()) {
          view = p0.findViewById(R.id.body_slimming_seek_bar_view_stub);
          a.o(view, "rootView.findViewById\(R.¡­mming_seek_bar_view_stub\)");
          this.q = view;
          if (view == null) {
             a.S("seekBarStub");
          }
          view = view.inflate();
          Objects.requireNonNull(view, "null cannot be cast to non-null type com.kwai.feature.post.api.widget.PrettifyDoubleSeekBar");
          this.p = view;
          view.setOnSeekBarChangeListener(new e(this));
          ts = this.o;
          str = "seekBar";
          if (ts != null) {
             MutableLiveData mutableLiveD = ts.q0();
             if (mutableLiveD != null) {
                BodySlimmingPanelItem value = mutableLiveD.getValue();
                if (value != null && !value.m()) {
                   ts = this.p;
                   if (ts == null) {
                      a.S(str);
                   }
                   ts.setVisibility(8);
                }
             }
          }
          ts = this.o;
          if (ts != null) {
             tn = this.p;
             if (tn == null) {
                a.S(str);
             }
             ts.H0(tn);
          }
       }
    label_00c8 :
       ts = this.n;
       str = "BodySlimming";
       if (ts == null) {
          Object[] objArray = new Object[i];
          a.D().u(str, new RuntimeException("seek¡¢hint and list is not null"), objArray);
          return;
       }else {
          a.m(ts);
          ts.setLayoutManager(new LinearLayoutManager(p0.getContext(), i, i));
          ts = this.r;
          if (ts == null) {
             a.S("bodyOption");
          }
          int i1 = (ts.a())? 0x7f0703d5: 0x7f0703d4;
          tn = this.n;
          a.m(tn);
          tn.addItemDecoration(new b(i, a1.d(i1), a1.d(i1)));
          ts = this.n;
          a.m(ts);
          ts.setHasFixedSize(true);
          BodySlimmingFragment ts1 = this.s;
          BodySlimmingFragment tr1 = this.r;
          if (tr1 == null) {
             a.S("bodyOption");
          }
          a uoa = new a(this, this, ts1, tr1);
          ts1 = this.n;
          a.m(ts1);
          ts1.setAdapter(uoa);
          e obj = PatchProxy.applyOneRefs(uoa, this, BodySlimmingFragment.class, "5");
          if (obj != PatchProxyResult.class) {
             i = obj.booleanValue();
          }else {
             ts1 = this.r;
             if (ts1 == null) {
                a.S("bodyOption");
             }
             obj = ts1.b();
             if (obj == null || (obj.c() == 5 && e.M())) {
                e.A0(i);
                int i2 = (int)obj.a();
                tr1 = this.o;
                if (tr1 != null) {
                   switch (i2){
                       case 1:
                         m = tr1.m;
                         break;
                       case 2:
                         m = tr1.d;
                         break;
                       case 3:
                         m = tr1.e;
                         break;
                       case 4:
                         m = tr1.f;
                         break;
                       case 5:
                         m = tr1.g;
                         break;
                       case 6:
                         m = tr1.h;
                         break;
                       case 7:
                         m = tr1.i;
                         break;
                       case 8:
                         m = tr1.j;
                         break;
                       default:
                         m = null;
                   }
                   if (m != null) {
                      i2 = uoa.L0(m);
                      if (i2 < 0) {
                         objArray1 = new Object[i];
                         a.D().s(str, "guide item not it list: "+m.a(), objArray1);
                      }else {
                         BodySlimmingFragment tn2 = this.n;
                         a.m(tn2);
                         tn2.x(i2);
                         if (obj.b()) {
                            uoa.N0(i2, i);
                         }
                         i = true;
                      }
                   }
                }
                objArray1 = new Object[i];
                a.D().t(str, "wrong guide position "+i2, objArray1);
             }
          }
       label_01de :
          if (!i) {
             tn1 = this.n;
             a.m(tn1);
             tn1.x(uoa.h);
          }
          Bundle arguments = this.getArguments();
          if (arguments != null) {
             String str1 = "fragment_tab_key";
             if (SerializableHook.getSerializable(arguments, str1) == null) {
                return;
             }else {
                Serializable serializable = SerializableHook.getSerializable(arguments, str1);
                Objects.requireNonNull(serializable, "null cannot be cast to non-null type kotlin.IntArray");
                if (serializable.length >= 1) {
                   return;
                }else {
                   ts = this.q;
                   if (ts == null) {
                      a.S("seekBarStub");
                   }
                   ViewGroup$LayoutParams layoutParams = ts.getLayoutParams();
                   Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                   layoutParams.bottomMargin = layoutParams.bottomMargin - a1.e(45.00f);
                   tn1 = this.q;
                   if (tn1 == null) {
                      a.S("seekBarStub");
                   }
                   tn1.setLayoutParams(layoutParams);
                }
             }
          }
          ts = this.r;
          if (ts == null) {
             a.S("bodyOption");
          }
          d uod = ts.c();
          if (uod != null) {
             uod.q4(p0, p1);
          }
          return;
       }
    }
    public void p4(BodySlimmingPanelItem p0,int p1,boolean p2){
       BodySlimmingFragment tp;
       if (PatchProxy.isSupport(BodySlimmingFragment.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, BodySlimmingFragment.class, "8")) {
          return;
       }
       a.p(p0, "item");
       BodySlimmingFragment tn = this.n;
       if (tn != null) {
          tn.x(q.n(p1, 0));
       }
       String str = "seekBar";
       if (!p0.m() || !p2) {
          tp = this.p;
          if (tp == null) {
             a.S(str);
          }
          tp.setVisibility(8);
       }else {
          tp = this.o;
          if (tp != null) {
             BodySlimmingFragment tp1 = this.p;
             if (tp1 == null) {
                a.S(str);
             }
             tp.H0(tp1);
          }
       }
       return;
    }
    public void q7(BodySlimmingPanelItem p0,int p1){
       if (PatchProxy.isSupport(BodySlimmingFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, BodySlimmingFragment.class, "9")) {
          return;
       }
       a.p(p0, "item");
       if (this.t.get(p1) == null && !p0.g()) {
          this.t.put(p1, p0);
       }
       return;
    }
}
