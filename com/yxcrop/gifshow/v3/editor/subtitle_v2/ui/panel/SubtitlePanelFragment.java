package com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitlePanelFragment;
import and.a;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import java.util.ArrayList;
import lnc.a1;
import android.animation.ValueAnimator;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitlePanelFragment$timelineFragment$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitlePanelFragment$b;
import java.lang.String;
import zmd.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import xld.a;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import tvc.f;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import hnd.f;
import gnd.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.vb.SubtitlePanelOperatorVB;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.List;
import ooc.h1;
import cnd.b;
import cnd.a;
import java.util.HashMap;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitlePanelFragment$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.util.Objects;
import hka.a;

public final class SubtitlePanelFragment extends BaseEditorFragment implements a	// class@000aef
{
    public f G;
    public final List H;
    public final ValueAnimator I;
    public final p J;
    public SubtitlePanelOperatorVB K;
    public final Observer L;
    public HashMap M;

    public void SubtitlePanelFragment(){
       super();
       this.H = new ArrayList();
       int[] ointArray = new int[]{a1.e(0x439f0000),a1.e(196.00f)};
       this.I = ValueAnimator.ofInt(ointArray);
       this.J = s.c(new SubtitlePanelFragment$timelineFragment$2(this));
       this.L = new SubtitlePanelFragment$b(this);
    }
    public String E7(){
       return "CaptionsPanel";
    }
    public void O7(a p0,a p1){
       View view;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SubtitlePanelFragment.class, "14")) {
          return;
       }
       a.p(p0, "newState");
       a.p(p1, "lastState");
       if (p0.s() != p1.s()) {
          if (p0.s()) {
             this.I.start();
             view = this.getView();
             if (view != null) {
                view.setVisibility(8);
             }
          }else {
             this.I.reverse();
             view = this.getView();
             if (view != null) {
                view.setVisibility(0);
             }
             this.kh().M(a1.d(R.dimen.arg_RES_7f0703a5), 0, 0, true);
          }
       }
       return;
    }
    public void fh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SubtitlePanelFragment.class, "7")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, SubtitlePanelFragment.class, "9")) {
          SubtitlePanelFragment tG = this.G;
          if (tG == null) {
             a.S("subtitleViewModel");
          }
          tG.r0().observe(this, this.L);
       }
       Set set = this.qh();
       SubtitlePanelFragment tK = this.K;
       if (tK == null) {
          a.S("subtitlePanelOperatorVB");
       }
       set.add(tK);
       Iterator iterator = this.H.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SubtitlePanelFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(SubtitlePanelFragment.class, null);
       return objectsByTag;
    }
    public String getTitle(){
       String obj = PatchProxy.apply(null, this, SubtitlePanelFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a1.p(R.string.arg_RES_7f104b22);
       a.o(obj, "CommonUtil.string\(R.string.subtitle_new_list\)");
       return obj;
    }
    public void gh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SubtitlePanelFragment.class, "8")) {
          return;
       }
       Set set = this.qh();
       SubtitlePanelFragment tK = this.K;
       if (tK == null) {
          a.S("subtitlePanelOperatorVB");
       }
       set.remove(tK);
       Iterator iterator = this.H.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       if (!PatchProxy.applyVoid(objArray, this, SubtitlePanelFragment.class, "10")) {
          SubtitlePanelFragment tG = this.G;
          if (tG == null) {
             a.S("subtitleViewModel");
          }
          tG.r0().removeObserver(this.L);
       }
       this.kh().M(0, 0, 0, 0);
       return;
    }
    public int lh(){
       return 6;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitlePanelFragment.class, "4")) {
          return;
       }
       super.onCreate(p0);
       this.G = b.a(this);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SubtitlePanelFragment.class, "5");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(p0, R.layout.arg_RES_7f0d0515, p1, false);
       this.q = view;
       a.o(view, "mViewRoot");
       EditorDelegate uEditorDeleg = this.kh();
       a.o(uEditorDeleg, "editorDelegate");
       BaseFragment uBaseFragmen = uEditorDeleg.q();
       a.o(uBaseFragmen, "editorDelegate.previewFragment");
       SubtitlePanelOperatorVB subtitlePane = new SubtitlePanelOperatorVB(this, view, uBaseFragmen);
       this.K = subtitlePane;
       this.H.add(subtitlePane);
       BaseEditorFragment tq = this.q;
       a.o(tq, "mViewRoot");
       this.H.add(new h1(this, tq));
       tq = this.q;
       a.o(tq, "mViewRoot");
       this.H.add(new b(this, tq));
       tq = this.q;
       a.o(tq, "mViewRoot");
       EditorDelegate uEditorDeleg1 = this.kh();
       a.o(uEditorDeleg1, "editorDelegate");
       BaseFragment uBaseFragmen1 = uEditorDeleg1.q();
       a.o(uBaseFragmen1, "editorDelegate.previewFragment");
       this.H.add(new a(this, tq, uBaseFragmen1));
       this.fh();
       return this.q;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, SubtitlePanelFragment.class, "16")) {
       }else {
          SubtitlePanelFragment tM = this.M;
          if (tM != null) {
             tM.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SubtitlePanelFragment.class, "6")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       SubtitlePanelFragment tI = this.I;
       a.o(tI, "mOpenPanelAnim");
       tI.setDuration(300);
       this.I.addUpdateListener(new SubtitlePanelFragment$a(p0));
       return;
    }
    public final void yh(){
       if (PatchProxy.applyVoid(null, this, SubtitlePanelFragment.class, "12")) {
          return;
       }
       EditorDelegate uEditorDeleg = this.kh();
       a.o(uEditorDeleg, "editorDelegate");
       BaseFragment uBaseFragmen = uEditorDeleg.q();
       Objects.requireNonNull(uBaseFragmen, "null cannot be cast to non-null type com.yxcorp.gifshow.fragment.component.BackPressable");
       uBaseFragmen.onBackPressed();
       return;
    }
}
