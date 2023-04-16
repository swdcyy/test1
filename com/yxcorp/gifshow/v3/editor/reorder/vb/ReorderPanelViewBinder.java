package com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder;
import ei0.a;
import androidx.fragment.app.Fragment;
import android.view.View;
import uwc.b;
import com.yxcorp.gifshow.v3.editor.reorder.vm.ReorderViewModel;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView;
import k17.b;
import ctc.e;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import com.kuaishou.edit.draft.EditConfig;
import btc.a;
import p79.h;
import th0.n;
import android.animation.TimeInterpolator;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.y;
import qrd.l1;
import androidx.recyclerview.widget.RecyclerView$n;
import x59.g;
import com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder$a;
import tyc.e0;
import tyc.m3;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.m$e;
import com.yxcorp.gifshow.v3.widget.CenterLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import ysc.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ctc.d;
import android.view.View$OnTouchListener;
import di0.b;
import com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder$b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder$c;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder$d;
import com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder$e;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder$f;
import com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder$g;
import com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder$h;
import androidx.lifecycle.Lifecycle;
import com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder$10;
import androidx.lifecycle.LifecycleObserver;
import faa.a;
import q87.c;
import java.util.Objects;
import dtc.d;
import t36.f$a;
import t36.f;
import atc.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.Asset;
import java.lang.Integer;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder$i;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.StringBuilder;
import w46.b;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$Type;

public final class ReorderPanelViewBinder extends a	// class@0011b7
{
    public final RecyclerView c;
    public final View d;
    public final View e;
    public m f;
    public w1 g;
    public g h;
    public final a i;
    public final b j;
    public int k;
    public a l;
    public boolean m;
    public Intent n;
    public final Fragment o;
    public final b p;
    public final ReorderViewModel q;
    public final EditorDelegate r;

    public void ReorderPanelViewBinder(Fragment p0,View p1,b p2,ReorderViewModel p3,EditorDelegate p4){
       int a;
       a.p(p0, "fragment");
       a.p(p1, "rootView");
       a.p(p2, "previewViewModel");
       a.p(p3, "reorderViewModel");
       a.p(p4, "mEditorDelegate");
       super(p1);
       this.o = p0;
       this.p = p2;
       this.q = p3;
       this.r = p4;
       View view = p1.findViewById(R.id.thumb_recyclerview);
       a.o(view, "rootView.findViewById\(R.id.thumb_recyclerview\)");
       this.c = view;
       View view1 = p1.findViewById(R.id.iv_delete);
       a.o(view1, "rootView.findViewById\(R.id.iv_delete\)");
       this.d = view1;
       p1 = p1.findViewById(R.id.ll_add_segment);
       a.o(p1, "rootView.findViewById\(R.id.ll_add_segment\)");
       this.e = p1;
       a = e.a;
       b uob = new b(0, e.b, e.b, a);
       this.j = uob;
       boolean b = true;
       this.m = b;
       c uoc = p4.N();
       a.o(uoc, "mEditorDelegate.workspaceDraft");
       Workspace workspace = uoc.v();
       if (workspace != null) {
          EditConfig editConfig = workspace.getEditConfig();
          if (editConfig != null && editConfig.getDisableAddImage() == b) {
             p1.setVisibility(8);
          label_0085 :
             a uoa = new a();
             uoa.X(0);
             uoa.Y(new n());
             uoa.z(300);
             uoa.x(0);
             uoa.K(0);
             this.l = uoa;
             if (!view.getItemDecorationCount()) {
                view.addItemDecoration(uob);
             }
             g og = p4.d();
             a.o(og, "mEditorDelegate.bitmapFilterRendererManager");
             this.h = og;
             ReorderPanelViewBinder$a uoa1 = new ReorderPanelViewBinder$a(this, new e0(), 12);
             this.g = uoa1;
             m om = new m(uoa1);
             this.f = om;
             om.f(view);
             view.setLayoutManager(new CenterLayoutManager(p0.getContext(), 0, 0, a));
             c uoc1 = p4.N();
             a.o(uoc1, "mEditorDelegate.workspaceDraft");
             a uoa2 = new a(this.h, uoc1);
             this.i = uoa2;
             view.setAdapter(uoa2);
             view.setItemAnimator(this.l);
             if (!PatchProxy.applyVoid(null, this, ReorderPanelViewBinder.class, "6")) {
                p1.setOnTouchListener(new d(this));
             }
             p3.q0().observe(p0, new ReorderPanelViewBinder$b(this));
             p3.p0().observe(p0, new ReorderPanelViewBinder$c(this));
             p2.s0().observe(p0, new ReorderPanelViewBinder$d(this));
             view1.setOnClickListener(new ReorderPanelViewBinder$e(this));
             p1.setOnClickListener(new ReorderPanelViewBinder$f(this));
             uoa2.h = new ReorderPanelViewBinder$g(this);
             p3.c.observe(p0, ReorderPanelViewBinder$h.b);
             p0.getLifecycle().addObserver(new ReorderPanelViewBinder$10(this));
             return;
          }
       }
       p1.setVisibility(0);
       goto label_0085 ;
    }
    public void B(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ReorderPanelViewBinder.class, "9")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       String str = "> onAttach\(\)";
       a.D().w("ReorderPanelViewBinder", str, objArray1);
       this.m = true;
       ReorderPanelViewBinder tq = this.q;
       Objects.requireNonNull(tq);
       String str1 = "1";
       if (!PatchProxy.applyVoid(objArray, tq, ReorderViewModel.class, str1)) {
          Object[] objArray2 = new Object[i];
          a.D().w("ReorderViewModel", str, objArray2);
          tq.k.s0(d.a);
          ReorderViewModel m = tq.m;
          Objects.requireNonNull(m);
          if (!PatchProxy.applyVoid(objArray, m, a.class, str1)) {
             m.d();
             Object[] objArray4 = new Object[i];
             a.D().w("ReorderAssetRepo", "attach", objArray4);
          }
          tq.j.d(tq.h);
          tq.i.S0();
          if (tq.d.isEmpty()) {
             Iterator iterator = tq.m.b().iterator();
             while (iterator.hasNext()) {
                tq.d.add(iterator.next().getAlbumId());
             }
          }
          Object[] objArray3 = new Object[i];
          a.D().w("ReorderViewModel", "onAttach", objArray3);
       }
       this.k = 2;
       this.q.n(this.p.q0());
       this.F(true);
       return;
    }
    public void C(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ReorderPanelViewBinder.class, "10")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       String str = "> onDetach\(\)";
       a.D().w("ReorderPanelViewBinder", str, objArray1);
       this.m = false;
       ReorderPanelViewBinder tq = this.q;
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoid(objArray, tq, ReorderViewModel.class, "17")) {
          Object[] objArray2 = new Object[0];
          a.D().w("ReorderViewModel", str, objArray2);
          ReorderViewModel m = tq.m;
          Objects.requireNonNull(m);
          if (!PatchProxy.applyVoid(objArray, m, a.class, "14")) {
             objArray1 = new Object[0];
             a.D().w("ReorderAssetRepo", "detach", objArray1);
          }
          tq.j.c(tq.h);
          tq.e = false;
          objArray = new Object[0];
          a.D().w("ReorderViewModel", "onDetach", objArray);
       }
       this.F(0);
       return;
    }
    public final void D(int p0){
       RecyclerView$LayoutManager layoutManage;
       ReorderPanelViewBinder reorderPanel = ReorderPanelViewBinder.class;
       if (PatchProxy.isSupport(reorderPanel) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, reorderPanel, "7")) {
          return;
       }
       boolean i = 0;
       if (this.c.getAdapter() != null) {
          RecyclerView$Adapter adapter = this.c.getAdapter();
          a.m(adapter);
          a.o(adapter, "mRecyclerView.adapter!!");
          if (p0 < adapter.getItemCount() && p0 >= 0) {
             if (!this.c.getWidth() || !this.c.getChildCount()) {
                this.c.getViewTreeObserver().addOnGlobalLayoutListener(new ReorderPanelViewBinder$i(this, p0));
                return;
             }else {
                reorderPanel = this.k;
                if (reorderPanel != null) {
                   i = true;
                   if (reorderPanel != i && reorderPanel != 2) {
                      if (reorderPanel == 3) {
                         this.c.scrollToPosition(p0);
                      }
                   }else {
                      layoutManage = this.c.getLayoutManager();
                      Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                      layoutManage.H(i);
                      this.c.smoothScrollToPosition(p0);
                   }
                }else {
                   layoutManage = this.c.getLayoutManager();
                   Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                   layoutManage.H(i);
                   this.c.smoothScrollToPosition(p0);
                }
                return;
             }
          }
       }
       Object[] objArray = new Object[i];
       a.D().t("ReorderPanelViewBinder", "selectItemToCenter: error, selectedIndex is "+p0+". ", objArray);
       return;
    }
    public final void E(AtomicInteger p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReorderPanelViewBinder.class, "5")) {
          return;
       }
       if (a.g(this.p.s0().getValue(), p0) ^ 0x01) {
          this.p.s0().setValue(p0);
       }
       if (a.g(this.q.p0().getValue(), p0) ^ 0x01) {
          this.q.p0().setValue(p0);
       }
       return;
    }
    public final void F(boolean p0){
       ReorderPanelViewBinder reorderPanel = ReorderPanelViewBinder.class;
       if (PatchProxy.isSupport(reorderPanel) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, reorderPanel, "8")) {
          return;
       }
       if (this.p.t0().getValue() != Workspace$Type.ATLAS) {
          this.p.M0().setValue(Boolean.valueOf(p0));
       }
       return;
    }
}
