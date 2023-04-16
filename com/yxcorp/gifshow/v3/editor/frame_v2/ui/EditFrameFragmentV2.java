package com.yxcorp.gifshow.v3.editor.frame_v2.ui.EditFrameFragmentV2;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.frame_v2.ui.EditFrameFragmentV2$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import tvc.f;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import java.util.Set;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import android.os.Bundle;
import brc.d;
import xvc.f;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.frame_v2.network.EditFrameRepo;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import brc.c;
import androidx.lifecycle.ViewModel;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import dzc.a;
import android.content.Context;
import i2b.a;
import zqc.g;
import com.yxcorp.gifshow.v3.editor.i;
import java.util.List;
import zqc.k;
import ooc.h1;
import java.util.Objects;
import jn9.b;
import java.util.HashMap;
import com.yxcorp.gifshow.fragment.PostBaseFragment;

public final class EditFrameFragmentV2 extends BaseEditorFragment	// class@000fa5
{
    public c G;
    public i H;
    public EditFrameRepo I;
    public final List J;
    public a K;
    public g L;
    public final Observer M;
    public HashMap N;

    public void EditFrameFragmentV2(){
       super();
       this.J = new ArrayList();
       this.M = new EditFrameFragmentV2$a(this);
    }
    public String E7(){
       return "CanvasPanel";
    }
    public void fh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EditFrameFragmentV2.class, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, EditFrameFragmentV2.class, "4")) {
          EditFrameFragmentV2 tG = this.G;
          if (tG == null) {
             a.S("viewModel");
          }
          tG.r0().observe(this, this.M);
       }
       Iterator iterator = this.J.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       Set set = this.qh();
       EditFrameFragmentV2 tL = this.L;
       if (tL == null) {
          a.S("frameViewBinder");
       }
       set.add(tL);
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditFrameFragmentV2.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(EditFrameFragmentV2.class, null);
       return objectsByTag;
    }
    public String getTitle(){
       String obj = PatchProxy.apply(null, this, EditFrameFragmentV2.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a1.p(R.string.arg_RES_7f100b50);
       a.o(obj, "CommonUtil.string\(R.string.edit_canvas\)");
       return obj;
    }
    public void gh(){
       if (PatchProxy.applyVoid(null, this, EditFrameFragmentV2.class, "7")) {
          return;
       }
       this.yh();
       Iterator iterator = this.J.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       Set set = this.qh();
       EditFrameFragmentV2 tL = this.L;
       if (tL == null) {
          a.S("frameViewBinder");
       }
       set.remove(tL);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditFrameFragmentV2.class, "1")) {
          return;
       }
       super.onCreate(p0);
       EditFrameFragmentV2 tI = this.I;
       if (tI == null) {
          a.S("frameRepo");
       }
       BaseEditorFragment tt = this.t;
       a.o(tt, "mEditorDelegate");
       f uof = tt.f();
       a.o(uof, "mEditorDelegate.editRepo");
       ViewModel viewModel = ViewModelProviders.of(this, new d(tI, uof)).get(c.class);
       a.o(viewModel, "ViewModelProviders.of\(\n ¡­eViewModelV2::class.java\)");
       this.G = viewModel;
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, EditFrameFragmentV2.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       if (p1 != null) {
          Context context = p1.getContext();
          a.o(context, "container.context");
          this.K = new a(context);
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d0346, p1, false);
       this.q = view;
       a.o(view, "mViewRoot");
       EditFrameFragmentV2 tK = this.K;
       EditorDelegate uEditorDeleg = this.kh();
       a.o(uEditorDeleg, "editorDelegate");
       EditFrameFragmentV2 tH = this.H;
       if (tH == null) {
          a.S("editorHelperContract");
       }
       g og = new g(view, this, tK, uEditorDeleg, tH);
       this.L = p0;
       BaseEditorFragment tq = this.q;
       a.o(tq, "mViewRoot");
       tq.setClickable(true);
       EditFrameFragmentV2 tJ = this.J;
       EditFrameFragmentV2 tL = this.L;
       if (tL == null) {
          a.S("frameViewBinder");
       }
       tJ.add(tL);
       BaseEditorFragment tq1 = this.q;
       a.o(tq1, "mViewRoot");
       this.J.add(new k(tq1, this));
       tq1 = this.q;
       a.o(tq1, "mViewRoot");
       this.J.add(new h1(this, tq1));
       return this.q;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, EditFrameFragmentV2.class, "8")) {
          return;
       }
       super.onDestroyView();
       EditFrameFragmentV2 tL = this.L;
       if (tL == null) {
          a.S("frameViewBinder");
       }
       Objects.requireNonNull(tL);
       if (!PatchProxy.applyVoid(null, tL, g.class, "5")) {
          g f = tL.f;
          if (f == null) {
             a.S("mAdapter");
          }
          f.z();
       }
       this.yh();
       tL = this.K;
       if (tL != null) {
          tL.a();
       }
       this.K = null;
       if (!PatchProxy.applyVoid(null, this, EditFrameFragmentV2.class, "13")) {
          tL = this.N;
          if (tL != null) {
             tL.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EditFrameFragmentV2.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.fh();
       return;
    }
    public final void yh(){
       if (PatchProxy.applyVoid(null, this, EditFrameFragmentV2.class, "5")) {
          return;
       }
       EditFrameFragmentV2 tG = this.G;
       if (tG == null) {
          a.S("viewModel");
       }
       tG.r0().removeObserver(this.M);
       return;
    }
}
