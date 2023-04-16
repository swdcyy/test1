package com.yxcorp.gifshow.v3.editor.clip_v3.view.ClipFragmentV3;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.clip_v3.view.ClipFragmentV3$b;
import opc.f;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tvc.f;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import android.os.Bundle;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.util.Set;
import com.yxcorp.gifshow.v3.editor.clip_v3.view.ClipFragmentV3$a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.utility.RomUtils;
import android.graphics.Paint;
import npc.l;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import android.content.Context;
import java.util.Objects;
import k2b.e0;
import apc.a;
import com.yxcorp.gifshow.v3.editor.clip_v3.ClipUtils;
import com.yxcorp.gifshow.v3.editor.clip_v3.view.TimelineAxisViewBinderV2;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.clip_v3.view.TimelineAxisViewBinder;
import ooc.h1;
import npc.c;
import java.util.HashMap;

public final class ClipFragmentV3 extends BaseEditorFragment	// class@000e12
{
    public f G;
    public i H;
    public final List I;
    public l J;
    public final Observer K;
    public HashMap L;

    public void ClipFragmentV3(){
       super();
       this.I = new ArrayList();
       this.K = new ClipFragmentV3$b(this);
    }
    public static final f yh(ClipFragmentV3 p0){
       p0 = p0.G;
       if (p0 == null) {
          a.S("clipViewModel");
       }
       return p0;
    }
    public String E7(){
       return "ClipPanel";
    }
    public void fh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ClipFragmentV3.class, "7")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ClipFragmentV3.class, "4")) {
          ClipFragmentV3 tG = this.G;
          if (tG == null) {
             a.S("clipViewModel");
          }
          tG.r0().observe(this, this.K);
       }
       Iterator iterator = this.I.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ClipFragmentV3.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(ClipFragmentV3.class, null);
       return objectsByTag;
    }
    public String getTitle(){
       String obj = PatchProxy.apply(null, this, ClipFragmentV3.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a1.p(R.string.arg_RES_7f100c90);
       a.o(obj, "CommonUtil.string\(R.stri¡­dit_tab_cut_speed_rotate\)");
       return obj;
    }
    public void gh(){
       if (PatchProxy.applyVoid(null, this, ClipFragmentV3.class, "8")) {
          return;
       }
       this.zh();
       Iterator iterator = this.I.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       return;
    }
    public int lh(){
       return 1;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipFragmentV3.class, "1")) {
          return;
       }
       super.onCreate(p0);
       ClipFragmentV3 tH = this.H;
       if (tH == null) {
          a.S("editorHelperContract");
       }
       EditorDelegate uEditorDeleg = tH.f();
       a.o(uEditorDeleg, "editorHelperContract.editorDelegate");
       ViewModel viewModel = ViewModelProviders.of(uEditorDeleg.q()).get(f.class);
       a.o(viewModel, "ViewModelProviders.of\(ed¡­pViewModelV2::class.java\)");
       this.G = viewModel;
       if (PostExperimentUtils.R0()) {
          this.qh().add(new ClipFragmentV3$a(this));
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       BaseEditorFragment this;
       ClipFragmentV3 tI;
       BaseEditorFragment this1;
       ClipFragmentV3 this1;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ClipFragmentV3.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       boolean b = false;
       this.q = a.g(p0, 0x7f0d04b6, p1, b);
       if (RomUtils.s()) {
          this.q.setLayerType(1, null);
       }
       this = this.q;
       String str = "mViewRoot";
       a.o(this, str);
       ClipFragmentV3 tH = this.H;
       String str1 = "editorHelperContract";
       if (tH == null) {
          a.S(str1);
       }
       ClipFragmentV3 tH1 = this.H;
       if (tH1 == null) {
          a.S(str1);
       }
       VideoSDKPlayerView videoSDKPlay = tH1.j();
       a.m(videoSDKPlay);
       a.o(videoSDKPlay, "editorHelperContract.videoSDKPlayerView!!");
       tH1 = this.H;
       if (tH1 == null) {
          a.S(str1);
       }
       EditorDelegate uEditorDeleg = tH1.f();
       a.o(uEditorDeleg, "editorHelperContract.editorDelegate");
       BaseFragment uBaseFragmen = uEditorDeleg.q();
       a.o(uBaseFragmen, "editorHelperContract.edi¡­\n        .previewFragment");
       Context context = uBaseFragmen.getContext();
       Objects.requireNonNull(context, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
       Context uContext = context;
       Objects.requireNonNull(ClipUtils.c);
       l ol = new l(this, this, tH, videoSDKPlay, uContext, new a(b));
       this.J = this.q;
       if (PostExperimentUtils.R0()) {
          tI = this.I;
          tH1 = this.H;
          if (tH1 == null) {
             a.S(str1);
          }
          uEditorDeleg = tH1.f();
          a.o(uEditorDeleg, "editorHelperContract.editorDelegate");
          uBaseFragmen = uEditorDeleg.q();
          a.o(uBaseFragmen, "editorHelperContract.edi¡­\n        .previewFragment");
          this1 = this.q;
          a.o(this1, str);
          tI.add(new TimelineAxisViewBinderV2(uBaseFragmen, this, this1));
       }else {
          tI = this.I;
          tH1 = this.H;
          if (tH1 == null) {
             a.S(str1);
          }
          uEditorDeleg = tH1.f();
          a.o(uEditorDeleg, "editorHelperContract.editorDelegate");
          uBaseFragmen = uEditorDeleg.q();
          a.o(uBaseFragmen, "editorHelperContract.edi¡­\n        .previewFragment");
          this1 = this.q;
          a.o(this1, str);
          tI.add(new TimelineAxisViewBinder(uBaseFragmen, this, this1));
       }
       BaseEditorFragment tq = this.q;
       a.o(tq, str);
       this.I.add(new h1(this, tq));
       tI = this.I;
       ClipFragmentV3 tJ = this.J;
       if (tJ == null) {
          a.S("mTimelinePanelViewBinder");
       }
       tI.add(tJ);
       tI = this.I;
       this1 = this.H;
       if (this1 == null) {
          a.S(str1);
       }
       VideoSDKPlayerView this11 = this1.j();
       a.m(this11);
       a.o(this11, "editorHelperContract.videoSDKPlayerView!!");
       ClipFragmentV3 this2 = this.H;
       if (this2 == null) {
          a.S(str1);
       }
       EditorDelegate uEditorDeleg1 = this2.f();
       a.o(uEditorDeleg1, "editorHelperContract.editorDelegate");
       BaseFragment uBaseFragmen1 = uEditorDeleg1.q();
       a.o(uBaseFragmen1, "editorHelperContract.edi¡­rDelegate.previewFragment");
       this = this.q;
       a.o(this, str);
       tI.add(new c(this11, uBaseFragmen1, this, this));
       Set set = this.qh();
       ClipFragmentV3 tJ1 = this.J;
       if (tJ1 == null) {
          a.S("mTimelinePanelViewBinder");
       }
       set.add(tJ1);
       this.fh();
       return this.q;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, ClipFragmentV3.class, "10")) {
          return;
       }
       super.onDestroyView();
       this.zh();
       if (!PatchProxy.applyVoid(null, this, ClipFragmentV3.class, "14")) {
          ClipFragmentV3 tL = this.L;
          if (tL != null) {
             tL.clear();
          }
       }
       return;
    }
    public final void zh(){
       if (PatchProxy.applyVoid(null, this, ClipFragmentV3.class, "5")) {
          return;
       }
       ClipFragmentV3 tG = this.G;
       if (tG == null) {
          a.S("clipViewModel");
       }
       tG.r0().removeObserver(this.K);
       return;
    }
}
