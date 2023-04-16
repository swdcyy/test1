package com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateEditorFragmentV2;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateEditorFragmentV2$a;
import java.util.ArrayList;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import kotlin.jvm.internal.a;
import com.kuaishou.edit.draft.Workspace$Type;
import itc.l0;
import itc.v;
import euc.j;
import euc.c;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$d;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import i2b.a;
import android.view.ViewParent;
import java.util.Objects;
import java.util.HashMap;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import buc.i;
import androidx.lifecycle.ViewModel;
import ooc.h1;
import guc.i;
import guc.f;
import androidx.lifecycle.LifecycleOwner;
import guc.k;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder;
import guc.g;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateAssetIndicatorViewBinder;
import guc.a;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateStickerViewBinder;

public final class PicTemplateEditorFragmentV2 extends BaseEditorFragment	// class@00133c
{
    public final String G;
    public PresenterV2 H;
    public final PicTemplateEditorFragmentV2$a I;
    public final ArrayList J;
    public final boolean K;
    public HashMap L;

    public void PicTemplateEditorFragmentV2(){
       super();
       this.G = "picTemplateEditorV2";
       this.I = new PicTemplateEditorFragmentV2$a();
       this.J = new ArrayList();
       this.K = PostExperimentUtils.w();
    }
    public String E7(){
       return "Template";
    }
    public void fh(){
       PicTemplateEditorFragmentV2 tH;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PicTemplateEditorFragmentV2.class, "5")) {
          return;
       }
       Iterator iterator = this.J.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       this.H = new PresenterV2();
       EditorDelegate uEditorDeleg = this.kh();
       a.o(uEditorDeleg, "editorDelegate");
       String str = "mPresenter";
       if (uEditorDeleg.getType() != Workspace$Type.SINGLE_PICTURE && !PatchProxy.applyVoid(objArray, this, PicTemplateEditorFragmentV2.class, "6")) {
          v.c(this.I);
          if (this.K == null) {
             tH = this.H;
             if (tH == null) {
                a.S(str);
             }
             tH.U7(new j());
             tH = this.H;
             if (tH == null) {
                a.S(str);
             }
             tH.U7(new c());
          }
       }
       tH = this.H;
       if (tH == null) {
          a.S(str);
       }
       tH.f(this.q);
       tH = this.H;
       if (tH == null) {
          a.S(str);
       }
       objArray = new Object[]{this.I,this.hh()};
       tH.i(objArray);
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplateEditorFragmentV2.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(PicTemplateEditorFragmentV2.class, null);
       return objectsByTag;
    }
    public String getTitle(){
       String obj = PatchProxy.apply(null, this, PicTemplateEditorFragmentV2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a1.p(R.string.arg_RES_7f100b2b);
       a.o(obj, "CommonUtil.string\(R.stri¡­_atlas_template_entrance\)");
       return obj;
    }
    public void gh(){
       if (PatchProxy.applyVoid(null, this, PicTemplateEditorFragmentV2.class, "7")) {
          return;
       }
       Iterator iterator = this.J.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       PicTemplateEditorFragmentV2 tH = this.H;
       if (tH == null) {
          a.S("mPresenter");
       }
       tH.unbind();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PicTemplateEditorFragmentV2.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       BaseEditorFragment tq = this.q;
       if (tq == null) {
          this.q = a.g(p0, 0x7f0d1146, p1, false);
       }else {
          String str = "mViewRoot";
          a.o(tq, str);
          if (tq.getParent() != null) {
             BaseEditorFragment tq1 = this.q;
             a.o(tq1, str);
             if (tq1.getParent() instanceof ViewGroup) {
                tq1 = this.q;
                a.o(tq1, str);
                ViewParent parent = tq1.getParent();
                Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                parent.removeView(this.q);
             }
          }
       }
       PicTemplateEditorFragmentV2 tI = this.I;
       Objects.requireNonNull(tI);
       if (!PatchProxy.applyVoidOneRefs(this, tI, PicTemplateEditorFragmentV2$a.class, "2")) {
          a.p(this, "<set-?>");
          tI.v = this;
       }
       tI = this.I;
       tI.c = this.G;
       tI.d = a1.p(0x7f100b2b);
       return this.q;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, PicTemplateEditorFragmentV2.class, "8")) {
          return;
       }
       super.onDestroyView();
       PicTemplateEditorFragmentV2 tH = this.H;
       if (tH == null) {
          a.S("mPresenter");
       }
       tH.destroy();
       if (!PatchProxy.applyVoid(null, this, PicTemplateEditorFragmentV2.class, "11")) {
          tH = this.L;
          if (tH != null) {
             tH.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PicTemplateEditorFragmentV2.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       EditorDelegate uEditorDeleg = this.kh();
       a.o(uEditorDeleg, "editorDelegate");
       ViewModel viewModel = ViewModelProviders.of(uEditorDeleg.q()).get(i.class);
       a.o(viewModel, "ViewModelProviders.of\(ed¡­oreViewModel::class.java\)");
       if (!PatchProxy.applyVoidTwoRefs(p0, viewModel, this, PicTemplateEditorFragmentV2.class, "4")) {
          this.J.add(new h1(this, p0));
          this.J.add(new i(this, viewModel, p0));
          this.J.add(new f(this, viewModel, p0));
          this.J.add(new k(this, viewModel, p0));
          this.J.add(new PicTemplateListViewBinder(this, viewModel, p0));
          EditorDelegate uEditorDeleg2 = this.kh();
          a.o(uEditorDeleg2, "editorDelegate");
          if (uEditorDeleg2.getType() == Workspace$Type.SINGLE_PICTURE) {
             this.J.add(new g(this, viewModel, p0));
          }else {
             this.J.add(new PicTemplateAssetIndicatorViewBinder(this, viewModel, p0));
             this.J.add(new a(this, viewModel, p0));
          }
          if (this.K != null) {
             EditorDelegate uEditorDeleg3 = this.kh();
             a.o(uEditorDeleg3, "editorDelegate");
             this.J.add(new PicTemplateStickerViewBinder(this, viewModel, p0, uEditorDeleg3));
          }
       }
       EditorDelegate uEditorDeleg1 = this.kh();
       a.o(uEditorDeleg1, "editorDelegate");
       uEditorDeleg1.u();
       this.fh();
       return;
    }
}
