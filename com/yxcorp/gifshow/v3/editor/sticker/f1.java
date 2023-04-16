package com.yxcorp.gifshow.v3.editor.sticker.f1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashSet;
import com.yxcorp.gifshow.v3.editor.sticker.q0;
import com.yxcorp.gifshow.v3.editor.sticker.f1$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import qtc.a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import java.lang.Integer;
import itc.n3;
import com.yxcorp.gifshow.v3.editor.sticker.e1;
import erd.g;
import crd.b;
import brd.t;
import itc.m3;
import com.yxcorp.gifshow.v3.editor.sticker.d1;
import java.util.Set;
import com.yxcorp.gifshow.v3.editor.sticker.h1;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.i;
import com.kuaishou.edit.draft.Workspace$Type;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import java.util.List;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import z8c.e;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.utility.n;
import androidx.recyclerview.widget.RecyclerView$n;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import x59.e;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import x59.e$d;
import android.view.View;
import ekd.m1;
import mrd.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;

public class f1 extends PresenterV2	// class@00124c
{
    public final e$d A;
    public RecyclerView p;
    public Set q;
    public a r;
    public i s;
    public c t;
    public EditorDelegate u;
    public a v;
    public a w;
    public e x;
    public final e$c y;
    public boolean z;

    public void f1(){
       super();
       this.q = new HashSet();
       this.y = q0.a;
       this.z = false;
       this.A = new f1$a(this);
    }
    public void E8(){
       f1 uof1 = f1.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof1, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uof1, "5")) {
          if (this.w == null) {
             this.w = ViewModelProviders.of(this.u.getContext()).get(a.class);
          }
          if (this.w.s0().getValue() != null && this.w.s0().getValue().intValue() == 2) {
             this.P8();
          }else {
             this.X7(this.v.subscribe(new n3(this), e1.b));
          }
       }
       this.X7(this.r.subscribe(new m3(this), d1.b));
       this.q.add(this.y);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f1.class, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, h1.class, "15")) {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("sticker_sequence", b.e(h1.c));
          g.a(uEditor);
       }
       this.q.remove(this.y);
       return;
    }
    public final void P8(){
       f1 uof1 = f1.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof1, "6")) {
          return;
       }
       f1 tw = this.w;
       Object obj = PatchProxy.apply(objArray, this, uof1, "7");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): h1.d(this.s.f().getType());
       this.R8(tw.q0(b, h1.k(this.t.v()), h1.j(this.t.v()), false));
       return;
    }
    public final void R8(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f1.class, "8")) {
          return;
       }
       if (this.z == null) {
          this.p.setLayoutManager(new NpaLinearLayoutManager(this.getContext(), 0, 0));
          if (this.p.getItemDecorationCount()) {
             this.p.removeItemDecorationAt(0);
          }
          this.p.addItemDecoration(new e(0, n.c(a.a().a(), 20.00f), 0));
          this.p.getParent().getLayoutParams().topMargin = n.c(a.a().a(), 0);
          this.z = true;
       }
       if (this.x == null) {
          e uoe = new e(p0, n.c(a.a().a(), 50.00f));
          this.x = uoe;
          uoe.Y0(this.q);
       }
       f1 tx = this.x;
       if (this.p.getAdapter() != tx) {
          this.p.setAdapter(tx);
       }
       this.x.a1(p0);
       this.x.Z0(this.A);
       this.x.k0();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f1.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0a70);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f1.class, "1")) {
          return;
       }
       this.q = this.r8("STICKER_LISTENERS");
       this.r = this.r8("SELECT_STICKER_EVENT");
       this.s = this.r8("EDITOR_HELPER_CONTRACT");
       this.u = this.r8("EDITOR_DELEGATE");
       this.v = this.r8("STICKER_REQUEST_EVENT");
       this.t = this.r8("WORKSPACE");
       return;
    }
}
