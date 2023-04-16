package com.yxcrop.gifshow.v3.editor.crop.CropEditorFragment;
import c35.i;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcrop.gifshow.v3.editor.crop.CropEditorFragment$b;
import java.util.ArrayList;
import java.lang.String;
import com.kuaishou.viewbinder.IViewBinder;
import com.yxcrop.gifshow.v3.editor.crop.vb.AbsCropFragmentVB;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import q46.t;
import c35.c;
import qxc.c;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Set;
import java.util.Objects;
import com.yxcrop.gifshow.v3.editor.crop.vm.CropViewModel;
import qld.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import maa.a;
import haa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import rld.d;
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;
import qld.d;
import java.util.concurrent.Callable;
import brd.a0;
import qld.e;
import qld.f;
import erd.g;
import crd.b;
import faa.a;
import q87.c;
import java.util.List;
import lnc.k1;
import qld.i;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import nld.a;
import pld.b;
import t36.f;
import java.util.HashMap;
import rwc.i;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.kuaishou.edit.draft.AssetSegment;
import vpc.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.AssetSegment$b;
import java.util.Map;
import ei0.a;
import lnc.d1;
import kotlin.Pair;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import com.kuaishou.viewbinder.BaseViewBinder;
import android.content.res.Resources;
import io.reactivex.subjects.PublishSubject;
import lld.c;
import com.yxcrop.gifshow.v3.editor.crop.n;
import brd.t;
import com.yxcorp.gifshow.widget.adv.model.f;
import com.yxcorp.gifshow.v3.editor.i;
import uwc.b;
import lwc.h;
import wpc.b;
import zpc.j;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import vpc.b;
import qsc.g;
import com.yxcrop.gifshow.v3.editor.crop.CropEditorFragment$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import sld.a;
import rwc.j;
import sld.d;
import java.util.LinkedHashSet;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public class CropEditorFragment extends BaseEditorFragment implements i	// class@000a0d
{
    public CropEditorFragment$b G;
    public PresenterV2 H;
    public CropViewModel I;
    public ArrayList J;
    public static final int K;

    public void CropEditorFragment(){
       super();
       this.G = new CropEditorFragment$b(this);
       this.J = new ArrayList();
    }
    public String E7(){
       return "Crop";
    }
    public IViewBinder O1(){
       return this.yh();
    }
    public IViewBinder V5(int p0){
       AbsCropFragmentVB uAbsCropFrag;
       if (PatchProxy.isSupport(CropEditorFragment.class)) {
          uAbsCropFrag = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, CropEditorFragment.class, "1");
          if (uAbsCropFrag != PatchProxyResult.class) {
          label_002f :
             return uAbsCropFrag;
          }
       }
       uAbsCropFrag = c.a(t.c(this.getActivity().getIntent()), AbsCropFragmentVB.class, this);
       goto label_002f ;
    }
    public void fh(){
       i obj;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CropEditorFragment.class, "4")) {
          return;
       }
       Object[] objArray1 = new Object[]{this.G,this.hh()};
       int i = 0;
       int i1 = 1;
       this.H.i(objArray1);
       this.qh().add(this.I);
       CropEditorFragment tI = this.I;
       Objects.requireNonNull(tI);
       if (!PatchProxy.applyVoid(objArray, tI, CropViewModel.class, "3")) {
          CropViewModel q = tI.q;
          Objects.requireNonNull(q);
          String str = "1";
          if (!PatchProxy.applyVoid(objArray, q, a.class, str)) {
             a.c(q.f).c0();
             if (d.a.b()) {
                q.d.setValue(Boolean.FALSE);
                a0.y(new d(q)).R(new e(q), f.b);
             }
             Object[] objArray2 = new Object[i];
             a.D().w("CropAssetRepo", "attach", objArray2);
          }
          String str1 = "mEditorPictureList";
          tI.g = k1.b(tI.p0(i1), str1);
          q = tI.b;
          i oi = new i();
          i oi1 = PatchProxy.apply(objArray, oi, i.class, str);
          if (oi1 != PatchProxyResult.class) {
          }else {
             oi1 = oi.a;
             a.o(oi1, "list");
          }
          q.setValue(oi1);
          Iterator iterator1 = tI.q.h().iterator();
          while (iterator1.hasNext()) {
             obj = iterator1.next();
             i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             tI.e.add(tI.o0(i, obj));
             tI.f.add(tI.o0(i, obj));
             i = i1;
          }
          tI.p.d(tI.m);
          tI.h.clear();
          CropViewModel g = tI.g;
          if (g == null) {
             a.S(str1);
          }
          iterator1 = g.iterator();
          while (iterator1.hasNext()) {
             obj = iterator1.next();
             Size size = obj.i();
             String identifier = obj.c().getIdentifier();
             a.o(identifier, "it.assetSegment.identifier");
             GeneratedMessageLite generatedMes = obj.c().toBuilder().build();
             a.o(generatedMes, "it.assetSegment.toBuilder\(\).build\(\)");
             tI.h.put(identifier, new c(generatedMes, new Size(size.b, size.c), obj.d()));
          }
       }
       Iterator iterator = this.J.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       this.I.v0(this.G.g);
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CropEditorFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(CropEditorFragment.class, null);
       return objectsByTag;
    }
    public void gh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CropEditorFragment.class, "5")) {
          return;
       }
       Iterator iterator = this.J.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       this.H.unbind();
       this.qh().remove(this.I);
       CropEditorFragment tI = this.I;
       Objects.requireNonNull(tI);
       if (!PatchProxy.applyVoid(objArray, tI, CropViewModel.class, "6")) {
          CropViewModel q = tI.q;
          Objects.requireNonNull(q);
          if (!PatchProxy.applyVoid(objArray, q, a.class, "24")) {
             q.a.b();
             Object[] objArray1 = new Object[0];
             a.D().w("CropAssetRepo", "detach", objArray1);
          }
          tI.e.clear();
          tI.f.clear();
          tI.d.setValue(new Pair(Boolean.FALSE, Boolean.FALSE));
          tI.i = -1;
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, CropEditorFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = super.onCreateView(p0, p1, p2);
       this.q = view;
       return view;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CropEditorFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       CropEditorFragment tH = this.H;
       if (tH != null) {
          tH.destroy();
          this.H = objArray;
       }
       tH = this.I;
       Objects.requireNonNull(tH);
       if (!PatchProxy.applyVoid(objArray, tH, CropViewModel.class, "7")) {
          CropViewModel q = tH.q;
          Objects.requireNonNull(q);
          if (!PatchProxy.applyVoid(objArray, q, a.class, "25")) {
             q.i.c(q.e);
          }
       }
       this.yh().onDestroy();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CropEditorFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       CropEditorFragment tG = this.G;
       tG.b = this;
       tG.e = this.getResources().getString(0x7f100bc0);
       tG.j = PublishSubject.g();
       this.G.j.subscribe(new c(this), n.b);
       CropEditorFragment$b f = this.G.f;
       if (f != null && f.i() != null) {
          this.G.h = new b(this.G.f.b(), this.G.f.l().w0());
       }
       PresenterV2 presenterV2 = new PresenterV2();
       this.H = presenterV2;
       presenterV2.U7(new j());
       this.H.f(this.q);
       this.I = ViewModelProviders.of(this, new CropEditorFragment$a(this, f.p0(this.t.u(), b.class), f.p0(this.t.u(), g.class))).get(CropViewModel.class);
       this.J.add(new a(this, this.yh(), this.I, this.G.k));
       d uod = new d(this, p0, this.t, this.I, this.qh(), this.yh(), this.G.l);
       this.J.add(v8);
       this.fh();
       return;
    }
    public AbsCropFragmentVB yh(){
       return this.n;
    }
}
