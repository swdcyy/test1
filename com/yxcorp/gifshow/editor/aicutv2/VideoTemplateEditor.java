package com.yxcorp.gifshow.editor.aicutv2.VideoTemplateEditor;
import voc.n;
import woc.a;
import com.yxcorp.gifshow.editor.aicutv2.VideoTemplateEditor$aiCutEditorDelegate$1;
import msd.a;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import bca.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import voc.o;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import jn9.b;
import jn9.d;
import mn9.b;
import java.util.List;
import nsd.u;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.lifecycle.LifecycleOwner;
import java.util.Objects;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$d;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateFragment;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.v3.editor.j;
import com.yxcorp.gifshow.v3.editor.i;
import h69.j;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import dca.s;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import aw9.c0;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.editor.aicutv2.VideoTemplateEditor$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.v3.editor.BaseEditor$a;
import java.lang.Number;
import xoc.c;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kuaishou.edit.draft.Workspace$Type;
import tvc.f;
import androidx.lifecycle.LiveData;
import cca.b;
import cca.a;
import lnc.g7;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadingEditAction;
import xvc.b;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadListAction;
import java.util.Set;
import java.util.Iterator;
import voc.y;
import gka.g;

public final class VideoTemplateEditor extends n	// class@001b75
{
    public final a u;
    public a v;
    public b w;
    public VideoSDKPlayerView x;

    public void VideoTemplateEditor(){
       super();
       this.u = new a(VideoTemplateEditor$aiCutEditorDelegate$1.INSTANCE);
    }
    public void B(EditorDelegate p0,String p1){
       a uoa = this;
       Object obj = p0;
       Object obj1 = p1;
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, uoa, VideoTemplateEditor.class, str)) {
          return;
       }
       String str1 = "delegate";
       a.p(obj, str1);
       a.p(obj1, "subType");
       c uoc = p0.N();
       a.o(uoc, "delegate.workspaceDraft");
       o oo = p0.x();
       a.o(oo, "delegate.editorContext");
       a uoa1 = new a(uoc, oo.f());
       uoa.v = uoa1;
       a.m(uoa1);
       d uod = v14;
       d uod1 = v14;
       String str2 = "subType";
       uod = new d(uoa1, 0, null, false, null, null, false, 126, 0);
       uoa.w = new b(uod1, p0.q());
       super.B(p0, p1);
       VideoTemplateEditor u = uoa.u;
       Objects.requireNonNull(u);
       if (!PatchProxy.applyVoidTwoRefs(obj, obj1, u, a.class, str)) {
          a.p(obj, str1);
          a.p(obj1, str2);
          u.c = obj;
          u.d = obj1;
       }
       return;
    }
    public void C(o p0){
    }
    public void D(boolean p0){
       VideoTemplateEditor videoTemplat = VideoTemplateEditor.class;
       if (PatchProxy.isSupport(videoTemplat) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, videoTemplat, "4")) {
          return;
       }
       this.t(p0);
       this.c(this.q(), false);
       videoTemplat = this.u;
       Objects.requireNonNull(videoTemplat);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), videoTemplat, uoa, "3")) {
          a b = videoTemplat.b;
          if (b != null) {
             b.addSimpleGestureListener("AICutEditorDelegate", null);
          }
          b = videoTemplat.b;
          if (b != null) {
             b.updatePlayerStatusView(true);
          }
          b = videoTemplat.b;
          if (b != null) {
             b.setEnablePlayerStatusChanged(false);
          }
       }
       this.l = false;
       this.u.a().Ah(false);
       return;
    }
    public void G(){
    }
    public void H(){
       a a;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VideoTemplateEditor.class, "3")) {
          return;
       }
       VideoTemplateEditor tu = this.u;
       Objects.requireNonNull(tu);
       String str = "2";
       if (!PatchProxy.applyVoid(objArray, tu, uoa, str)) {
          if (tu.a == null) {
             tu.a = tu.f.invoke();
          }
          a = tu.a;
          a.m(a);
          a c = tu.c;
          if (c == null) {
             a.S("mDelegate");
          }
          a d = tu.d;
          if (d == null) {
             a.S("mSubType");
          }
          a.uh(c, d);
          a = tu.c;
          if (a == null) {
             a.S("mDelegate");
          }
          VideoSDKPlayerView videoSDKPlay1 = f.n(a);
          tu.b = videoSDKPlay1;
          if (videoSDKPlay1 != null) {
             videoSDKPlay1.addSimpleGestureListener("AICutEditorDelegate", tu.e);
          }
          a = tu.b;
          int i = 0;
          if (a != null) {
             a.setVisibility(i);
          }
          a = tu.b;
          if (a != null) {
             a.setEnablePlayerStatusChanged(true);
          }
          a b = tu.b;
          if (b != null) {
             if (b.isPlaying() == true) {
                i = true;
             }
             b.updatePlayerStatusView(i);
          }
       }
       this.f = this.u.a();
       VideoTemplateFragment videoTemplat = this.u.a();
       j ts = this.s;
       a.o(ts, "mEditorHelperContract");
       Objects.requireNonNull(videoTemplat);
       if (!PatchProxy.applyVoidOneRefs(ts, videoTemplat, VideoTemplateFragment.class, "10")) {
          a.p(ts, "editorHelperContract");
          videoTemplat.H = ts;
       }
       videoTemplat = this.u.a();
       VideoTemplateEditor tv = this.v;
       a.m(tv);
       Objects.requireNonNull(videoTemplat);
       if (!PatchProxy.applyVoidOneRefs(tv, videoTemplat, VideoTemplateFragment.class, str)) {
          a.p(tv, "<set-?>");
          videoTemplat.I = tv;
       }
       this.u.a().Ah(this.l);
       j ts1 = this.s;
       a.o(ts1, "mEditorHelperContract");
       EditorDelegate uEditorDeleg = ts1.f();
       a.o(uEditorDeleg, "mEditorHelperContract.editorDelegate");
       if (j.j(uEditorDeleg.N()) && this.l != null) {
          tu = this.u;
          Objects.requireNonNull(tu);
          if (!PatchProxy.applyVoid(objArray, tu, uoa, "8")) {
             uoa = tu.b;
             if (uoa != null) {
                uoa.addSimpleGestureListener("AICutEditorDelegate", objArray);
             }
          }
       }
       VideoTemplateEditor tv1 = this.v;
       if (tv1 != null) {
          EditReduxViewModel uEditReduxVi = this.T();
          Objects.requireNonNull(uEditReduxVi, "null cannot be cast to non-null type com.yxcorp.gifshow.editor.aicutv2.ui.ViewTemplateViewModel");
          tv1.k(uEditReduxVi);
       }
       EditorDelegate uEditorDeleg1 = this.i();
       a.o(uEditorDeleg1, "delegate");
       BaseFragment uBaseFragmen = uEditorDeleg1.q();
       a.o(uBaseFragmen, "delegate.previewFragment");
       e uoe = uBaseFragmen.getChildFragmentManager().beginTransaction();
       a.o(uoe, "delegate.previewFragment¡­anager.beginTransaction\(\)");
       uoe.y(R.anim.arg_RES_7f010105, 0x7f01010d);
       this.a("AICutEditor", uoe);
       this.c(this.q(), true);
       uEditorDeleg1 = this.i();
       a.o(uEditorDeleg1, "delegate");
       EditorDelegate uEditorDeleg2 = this.i();
       a.o(uEditorDeleg2, "delegate");
       this.S(uEditorDeleg1.x(), uEditorDeleg2.O());
       if (PostExperimentUtils.W0()) {
          BaseEditor td = this.d;
          a.o(td, "mDelegate");
          if (td.z() instanceof VideoSDKPlayerView) {
             VideoSDKPlayerView videoSDKPlay = f.n(this.d);
             this.x = videoSDKPlay;
             if (videoSDKPlay != null) {
                videoSDKPlay.setLoop(true);
             }
             this.u.c();
          }
       }
       return;
    }
    public EditReduxViewModel U(){
       BaseEditor obj = PatchProxy.apply(null, this, VideoTemplateEditor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       a.o(obj, "mDelegate");
       ViewModel viewModel = ViewModelProviders.of(obj.q(), new VideoTemplateEditor$a(this)).get(s.class);
       a.o(viewModel, "ViewModelProviders.of\(mD¡­ateViewModel::class.java\)");
       return viewModel;
    }
    public BaseEditor$a d(){
       Object obj = PatchProxy.apply(null, this, VideoTemplateEditor.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BaseEditor$a(this, 20, this.i);
    }
    public int q(){
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c obj = PatchProxy.apply(null, this, VideoTemplateEditor.class, "5");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = c.a;
       j ts = this.s;
       a.o(ts, "mEditorHelperContract");
       EditorDelegate uEditorDeleg = ts.f();
       a.o(uEditorDeleg, "mEditorHelperContract.editorDelegate");
       c uoc = uEditorDeleg.N();
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(uoc, obj, c.class, "1");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          b = false;
          if (uoc == null || (!j.h(uoc.T0()) && (uoc.a1() != Workspace$Type.AI_CUT || (uoc.T0() != Workspace$Source.IMPORT && (j.n(uoc.a1(), uoc.T0()) || j.n(uoc.b1(), uoc.T0())))))) {
             b = true;
          }
       }
       if (b) {
          b = 0x7f070387;
       }else {
          j ts1 = this.s;
          a.o(ts1, "mEditorHelperContract");
          EditorDelegate uEditorDeleg1 = ts1.f();
          a.o(uEditorDeleg1, "mEditorHelperContract.editorDelegate");
          if (j.j(uEditorDeleg1.N())) {
             b = (this.l != null)? 0x7f070388: 0x7f0703a0;
          }else {
             b = 0x7f070385;
          }
       }
       return b;
    }
    public boolean s(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       VideoTemplateFragment obj = PatchProxy.apply(objArray, this, VideoTemplateEditor.class, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.u.a();
       Objects.requireNonNull(obj);
       String obj1 = PatchProxy.apply(objArray, obj, VideoTemplateFragment.class, "11");
       boolean b = false;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else {
          VideoTemplateFragment g = obj.G;
          obj1 = "viewModel";
          if (g == null) {
             a.S(obj1);
          }
          b value = g.r0().getValue();
          if (value != null) {
             a uoa = value.e();
             if (uoa != null && uoa.e() == true) {
                EditorDelegate uEditorDeleg = obj.kh();
                a.o(uEditorDeleg, "editorDelegate");
                b1 = g7.a(uEditorDeleg.N());
                VideoTemplateFragment g1 = obj.G;
                if (g1 == null) {
                   a.S(obj1);
                }
                g1.t0(new VideoTemplateLoadingEditAction((b1 ^ 0x01), b1));
                if (!b1) {
                   g = obj.G;
                   if (g == null) {
                      a.S(obj1);
                   }
                   g.t0(new VideoTemplateLoadListAction());
                }
                b1 = true;
             }
          }
          if (!PatchProxy.applyVoid(objArray, obj, VideoTemplateFragment.class, "12") && obj.K != null) {
             View view = obj.q.findViewById(R.id.opview);
             a.o(view, "mViewRoot.findViewById<View>\(R.id.opview\)");
             if (!view.isShown()) {
                Iterator iterator = obj.qh().iterator();
                while (iterator.hasNext()) {
                   iterator.next().yd();
                }
                iterator = obj.ih().iterator();
                while (iterator.hasNext()) {
                   iterator.next().d();
                }
             }
          }
          b1 = false;
       }
       if (b1 || super.s()) {
          b = true;
       }
       return b;
    }
    public boolean y(){
       j obj = PatchProxy.apply(null, this, VideoTemplateEditor.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.s;
       a.o(obj, "mEditorHelperContract");
       EditorDelegate uEditorDeleg = obj.f();
       a.o(uEditorDeleg, "mEditorHelperContract.editorDelegate");
       boolean b = true;
       if (j.j(uEditorDeleg.N())) {
          if (this.l != null || this.m != null) {
             b = false;
          }
          return b;
       }else if(PostExperimentUtils.W0()){
          return (this.m ^ b);
       }else {
          return false;
       }
    }
    public boolean z(){
       Object obj = PatchProxy.apply(null, this, VideoTemplateEditor.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (PostExperimentUtils.W0()) {
          return false;
       }
       return super.z();
    }
}
