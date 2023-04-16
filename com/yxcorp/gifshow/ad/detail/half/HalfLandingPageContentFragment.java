package com.yxcorp.gifshow.ad.detail.half.HalfLandingPageContentFragment;
import com.yxcorp.gifshow.ad.half.BottomSheetContainerFragment$b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.ad.detail.half.HalfLandingPageContentFragment$a;
import nsd.u;
import lnc.a1;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import bz8.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import t29.d;
import kotlin.jvm.internal.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import y8c.g;
import java.util.HashMap;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import bz8.o;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;
import z8c.e;
import androidx.recyclerview.widget.RecyclerView$n;
import bz8.a;
import bz8.e;
import qrd.l1;
import bz8.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class HalfLandingPageContentFragment extends BaseFragment implements BottomSheetContainerFragment$b	// class@001558
{
    public PresenterV2 j;
    public final g k;
    public RecyclerView l;
    public f m;
    public o n;
    public HashMap o;
    public static final int p;
    public static final HalfLandingPageContentFragment$a q;

    static {
       HalfLandingPageContentFragment.q = new HalfLandingPageContentFragment$a(null);
       HalfLandingPageContentFragment.p = a1.e(4.00f);
    }
    public void HalfLandingPageContentFragment(){
       super(null, null, null, null, 15, null);
       this.k = super();
    }
    public int G6(){
       Object obj = PatchProxy.apply(null, this, HalfLandingPageContentFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return 0;
    }
    public void Ib(int p0){
       if (PatchProxy.isSupport(HalfLandingPageContentFragment.class)) {
          PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HalfLandingPageContentFragment.class, "9");
       }
       return;
    }
    public Fragment R1(){
       return this;
    }
    public void jb(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HalfLandingPageContentFragment.class, "7")) {
          return;
       }
       a.p(p0, "listener");
       this.k.b = p0;
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, HalfLandingPageContentFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "inflater");
       super.onCreateView(p0, p1, p2);
       return a.g(p0, 0x7f0d05a8, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, HalfLandingPageContentFragment.class, "6")) {
          return;
       }
       HalfLandingPageContentFragment tj = this.j;
       if (tj != null) {
          tj.destroy();
       }
       tj = this.m;
       if (tj != null) {
          tj.Z0();
       }
       super.onDestroyView();
       if (!PatchProxy.applyVoid(null, this, HalfLandingPageContentFragment.class, "11")) {
          tj = this.o;
          if (tj != null) {
             tj.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       HalfLandingPageContentFragment tj;
       View view;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HalfLandingPageContentFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       ViewModel viewModel = ViewModelProviders.of(this.requireActivity()).get(o.class);
       a.o(viewModel, "ViewModelProviders.of\(re¡­ingViewModel::class.java\)");
       this.n = viewModel;
       int i = 0;
       if (!PatchProxy.applyVoidOneRefs(p0, this, HalfLandingPageContentFragment.class, "4")) {
          RecyclerView recyclerView = p0.findViewById(R.id.recycler_view);
          this.l = recyclerView;
          e uoe = new e(1, HalfLandingPageContentFragment.p, i);
          if (recyclerView != null) {
             recyclerView.addItemDecoration(uoe);
          }
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, HalfLandingPageContentFragment.class, "3") && this.j == null) {
          PresenterV2 presenterV2 = new PresenterV2();
          presenterV2.U7(new a());
          presenterV2.U7(new e());
          view = this.getView();
          a.m(view);
          presenterV2.f(view);
          this.j = presenterV2;
       }
       if (!PatchProxy.applyVoid(objArray, this, HalfLandingPageContentFragment.class, "5")) {
          if (this.m == null) {
             HalfLandingPageContentFragment tk = this.k;
             HalfLandingPageContentFragment tn1 = this.n;
             if (tn1 == null) {
                a.S("mHalfLandingViewModel");
             }
             this.m = new f(tk, tn1);
          }
          tj = this.l;
          if (tj != null) {
             tj.setLayoutManager(new LinearLayoutManager(this.getActivity()));
          }
          tj = this.l;
          if (tj != null) {
             tj.setAdapter(this.m);
          }
          tj.c = this.m;
       }
       tj = this.j;
       if (tj != null) {
          Object[] objArray1 = new Object[2];
          objArray1[0] = this.k;
          HalfLandingPageContentFragment tn = this.n;
          if (tn == null) {
             a.S("mHalfLandingViewModel");
          }
          objArray1[1] = tn;
          tj.i(objArray1);
       }
       return;
    }
}
