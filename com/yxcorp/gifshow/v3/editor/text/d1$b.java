package com.yxcorp.gifshow.v3.editor.text.d1$b;
import ooc.r0;
import com.yxcorp.gifshow.v3.editor.text.d1;
import java.lang.Object;
import ooc.q0;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import android.view.View;
import android.os.Bundle;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import uwc.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.util.Map;
import xsc.c;
import t36.f;
import com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener;
import htc.a;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import java.util.List;
import com.yxcorp.gifshow.v3.previewer.EditorBasePreviewFragment;
import r1c.h;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import tkd.b;
import tkd.d;
import uxb.u;
import uv8.o$b;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import uxb.d;
import java.util.Collection;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.yxcorp.gifshow.v3.f;
import com.kuaishou.edit.draft.Workspace$Type;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.editor.text.t0;
import wpc.y;
import qsc.g;
import java.util.Objects;
import android.content.Intent;
import android.app.Activity;
import com.yxcorp.gifshow.v3.editor.text.subtitle.m;
import wba.p0;
import ovc.b;
import com.yxcorp.gifshow.v3.editor.text.font.FontVMDelegate;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import wpc.a0;
import androidx.fragment.app.Fragment;
import nwc.e;
import com.yxcorp.gifshow.v3.previewer.listener.EditorFragmentBackPressedPriorityEnum;
import nwc.a;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextDownloadHelper;
import eb7.a;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper;
import crd.a;
import com.yxcorp.gifshow.v3.v;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.i;
import qr4.m$k0;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.v3.previewer.ktv.p;
import h69.j;
import hba.a;
import java.util.Iterator;
import com.kuaishou.edit.draft.Text;
import com.kuaishou.edit.draft.FeatureId;
import qaa.a;
import com.kuaishou.edit.draft.Cover;
import java.util.LinkedHashSet;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextRepo;
import huc.d;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel$a;

public class d1$b implements r0	// class@0013b8
{
    public FontViewModel b;
    public DynamicTextViewModel c;
    public final d1 d;

    public void d1$b(d1 p0){
       this.d = p0;
       super();
    }
    public void Z(){
       q0.q(this);
    }
    public void b(c p0){
       q0.j(this, p0);
    }
    public void c(View p0,Bundle p1,BaseEditorFragment p2){
       q0.p(this, p0, p1, p2);
    }
    public void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d1$b.class, "5")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (PostExperimentUtils.A(p0.w0())) {
          return;
       }
       f.t0(this.d.f, p0.t0(), c.class);
       f.t0(this.d.h, p0.t0(), VideoFrameChangeListener.class);
       f.t0(this.d.i, p0.t0(), a.class);
       if (this.d.h(p0) != null) {
          this.d.h(p0).J().l0();
       }
       return;
    }
    public void d0(){
       q0.g(this);
    }
    public void e(boolean p0){
       q0.a(this, p0);
    }
    public List f(){
       return q0.c(this);
    }
    public void g(int p0){
       q0.i(this, p0);
    }
    public void h(EditorBasePreviewFragment p0,c p1){
       q0.m(this, p0, p1);
    }
    public void i(){
       q0.l(this);
    }
    public List j(h p0,boolean p1){
       ArrayList obj;
       d1$b uob = d1$b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uob, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       obj.addAll(d.a(-1527502188).AV(p0, this.d.c().w0(), null, null));
       return obj;
    }
    public void m(LayoutInflater p0,ViewGroup p1,Bundle p2,View p3,BaseEditorFragment p4){
       Object[] objArray;
       TextElementViewBinder obj = this;
       object oobject = p3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d1 uod1 = d1.class;
       d1$b uob = d1$b.class;
       int i = 0;
       int i1 = 1;
       if (PatchProxy.isSupport(uob)) {
          objArray = new Object[]{p0,p1,p2,oobject,p4};
          if (PatchProxy.applyVoid(objArray, obj, uob, "3")) {
             return;
          }
       }
       if (PostExperimentUtils.A(obj.d.c().w0())) {
          return;
       }else if(f.F(p4)){
          uob = obj.d;
          f.o0(uob.f, uob.c().t0(), c.class);
       }else if(!obj.d.j()){
          uob = obj.d;
          f.o0(uob.h, uob.c().t0(), VideoFrameChangeListener.class);
       }
       if (obj.d.c().w0().a1() == Workspace$Type.ALBUM_MOVIE) {
          uob = obj.d;
          f.o0(uob.i, uob.c().t0(), a.class);
       }
       if (obj.d.k()) {
          obj.d.c().u0().U7(new t0(f.p0(obj.d.c().t0(), y.class), f.p0(obj.d.c().t0(), g.class)));
       }
       uob = obj.d;
       Objects.requireNonNull(uob);
       objArray = null;
       o$b obj1 = PatchProxy.apply(objArray, uob, uod1, "9");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): f.b(uob.c().w0(), uob.a.getIntent());
       if (b) {
          obj.d.c().u0().U7(new m());
       }
       if (p0.c(obj.d.c().w0())) {
          obj.d.c().u0().U7(new b());
       }
       d1$b d = obj.d;
       boolean b1 = f.F(p4);
       Objects.requireNonNull(d);
       if (PatchProxy.isSupport(uod1) && (!PatchProxy.applyVoidTwoRefs(oobject, Boolean.valueOf(b1), d, uod1, "2") && d.h(d.c()) == null)) {
          b = 0;
          obj1 = d.d;
          Object obj2 = PatchProxy.apply(objArray, d, uod1, "6");
          FontVMDelegate uFontVMDeleg = (obj2 != patchProxyRe)? obj2: new FontVMDelegate(ViewModelProviders.of(d.a).get(FontViewModel.class));
          TextElementViewModel textElementV = d.i();
          f uof = f.p0(d.c().t0(), a0.class);
          int i2 = 0;
          int i3 = 0;
          int i4 = d.j() ^ 0x01;
          boolean b2 = d.k();
          int i5 = (!d.j() && !p0.c(d.c().w0()))? 1: 0;
          obj = v14;
          TextElementViewBinder textElementV1 = new TextElementViewBinder(b, obj1, uFontVMDeleg, p3, textElementV, uof, i2, i3, b1, i4, b2, i5, p0.c(d.c().w0()));
          d.c().v0().add(obj);
          d.c().s0().a(EditorFragmentBackPressedPriorityEnum.TEXT_PANEL_SHOW, obj);
       }
       return;
    }
    public void onActivityDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d1$b.class, "6")) {
          return;
       }
       d1$b tb = this.b;
       if (tb != null) {
          tb.C0();
       }
       tb = this.c;
       if (tb != null) {
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, DynamicTextViewModel.class, "12")) {
             Object[] objArray1 = new Object[0];
             a.D().w("DynamicTextViewModel", "stopDownloadTasks", objArray1);
             DynamicTextDownloadHelper uDynamicText = tb.s0();
             Objects.requireNonNull(uDynamicText);
             if (!PatchProxy.applyVoid(objArray, uDynamicText, DynamicTextDownloadHelper.class, "4")) {
                uDynamicText.c().c();
             }
             tb.r0().dispose();
          }
       }
       return;
    }
    public void onActivityResume(){
       q0.h(this);
    }
    public void p(boolean p0){
       q0.k(this, p0);
    }
    public void s(Bundle p0){
       c uoc1;
       boolean b1;
       List list;
       d1$b uob = d1$b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "1")) {
          return;
       }
       FontViewModel uFontViewMod = ViewModelProviders.of(this.d.a).get(FontViewModel.class);
       this.b = uFontViewMod;
       boolean b = false;
       uFontViewMod.y0(b);
       uFontViewMod = (v.f() != null && v.f().d1().F().b.G != null)? 1: 0;
       c uoc = (v.f() != null && v.f().v().getSource() == Workspace$Source.REEDIT)? 1: null;
       d1$b uob1 = (v.f() != null && p.i(v.f().a1()))? 1: null;
       int i = (uFontViewMod || uoc)? 1: 0;
       ArrayList uArrayList = new ArrayList();
       if (i | j.j(v.f())) {
          uoc1 = v.f();
          if (!PatchProxy.applyVoidTwoRefs(uArrayList, uoc1, null, d1.class, "3")) {
             ArrayList uArrayList1 = new ArrayList();
             if (uoc1 != null && uoc1.W0() != null) {
                uArrayList1 = uoc1.W0().o();
             }
             Iterator iterator = uArrayList1.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next().getFeatureId());
             }
             uArrayList1 = new ArrayList();
             if (uoc1 != null && uoc1.s0() != null) {
                list = uoc1.s0().o();
             }
             Iterator iterator1 = list.iterator();
             while (iterator1.hasNext()) {
                iterator = iterator1.next().getTextsList().iterator();
                while (iterator.hasNext()) {
                   uArrayList.add(iterator.next().getFeatureId());
                }
             }
             LinkedHashSet linkedHashSe = new LinkedHashSet(uArrayList.size());
             linkedHashSe.addAll(uArrayList);
             uArrayList.clear();
             uArrayList.addAll(linkedHashSe);
          }
       }
       this.c = ViewModelProviders.of(this.d.a).get(DynamicTextViewModel.class);
       if (PostExperimentUtils.t1() && !uob1) {
          uoc1.d = this.b;
       }
       d1$b tc = this.c;
       uoc1 = PatchProxy.apply(null, this, uob, "2");
       if (uoc1 != PatchProxyResult.class) {
          b1 = uoc1.booleanValue();
       }else if(DynamicTextRepo.b && (!d.k().size() || f.C(this.d.a.getIntent()))){
          b = 1;
       }
       b1 = b;
       tc.q0(b1, uArrayList, f.C(this.d.a.getIntent()), true, null);
       return;
    }
    public void u(boolean p0,String p1){
       q0.d(this, p0, p1);
    }
}
