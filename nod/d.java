package nod.d;
import voc.n;
import com.yxcorp.gifshow.v3.EditorActivity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nod.d$a;
import java.util.ArrayList;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextKeyboardDataViewModelV3;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import nod.d$b;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import tvc.f;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainViewBinderV3;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.previewer.EditorBasePreviewFragment;
import uwc.a;
import com.yxcorp.gifshow.v3.f;
import nwc.e;
import nwc.a;
import java.util.List;
import com.kuaishou.edit.draft.Workspace$Type;
import ui.preview.TextVideoPreviewViewBinderV3;
import yld.k;
import xod.f;
import yod.k;
import amd.c;
import rnd.g;
import rnd.l;
import java.util.Map;
import com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener;
import t36.f;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder;
import sod.a;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcrop.gifshow.v3.editor.text_v2.action.RecoTextFetchActionV3;
import nsd.u;
import xvc.b;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import android.app.Activity;
import android.content.Intent;
import ekd.j0;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import pb9.q;
import com.yxcrop.gifshow.v3.editor.text_v2.action.TextInitActionV3;
import android.graphics.RectF;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import voc.o;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import mnd.a;
import java.util.Objects;
import k2b.e0;
import com.yxcorp.gifshow.v3.editor.BaseEditor$a;
import ooc.g1;
import com.yxcrop.gifshow.v3.editor.decoration_v2.action.DecorationReleaseAction;
import androidx.fragment.app.c;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.reedit.ReEditTextFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import yod.l;
import lod.b;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3;
import xvc.f;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.Workspace$Source;
import boc.b;
import com.yxcorp.gifshow.util.resource.Category;
import java.lang.Number;

public final class d extends n	// class@001e9d
{
    public final q u;
    public final List v;
    public TextKeyboardDataViewModelV3 w;
    public final Observer x;
    public TextVideoPreviewViewBinderV3 y;

    public void d(EditorActivity p0){
       a.p(p0, "requireActivity");
       super();
       this.u = new d$a(this);
       this.v = new ArrayList();
       ViewModel viewModel = ViewModelProviders.of(p0).get(TextKeyboardDataViewModelV3.class);
       a.o(viewModel, "ViewModelProviders.of\(re¡­aViewModelV3::class.java\)");
       this.w = viewModel;
       this.x = new d$b(this);
    }
    public void B(EditorDelegate p0,String p1){
       Object[] objArray1;
       View view1;
       d ty;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "1")) {
          return;
       }
       a.p(p0, "delegate");
       a.p(p1, "subType");
       super.B(p0, p1);
       Object[] objArray = new Object[0];
       String str = "TextEditorV3";
       a.D().w(str, "onCreated", objArray);
       BaseFragment uBaseFragmen = p0.q();
       a.o(uBaseFragmen, "previewFragment");
       this.T().r0().observe(uBaseFragmen, this.x);
       View view = uBaseFragmen.requireView();
       String str1 = "previewFragment.requireView\(\)";
       a.o(view, str1);
       TextMainViewBinderV3 textMainView = new TextMainViewBinderV3(view, uBaseFragmen, p0);
       BaseFragment uBaseFragmen1 = uBaseFragmen;
       a uoa = f.h(uBaseFragmen1);
       a.o(uoa, "EditUtils.getBaseEditPre¡­ditorBasePreviewFragment\)");
       uoa.s0().b(textMainView);
       this.v.add(textMainView);
       String str2 = "EditUtils.getBaseEditPre¡­iewModel\(previewFragment\)";
       if (!f.E(p0.getType())) {
          objArray1 = new Object[0];
          a.D().w(str, "onCreated video", objArray1);
          view1 = uBaseFragmen.requireView();
          a.o(view1, str1);
          TextVideoPreviewViewBinderV3 textVideoPre = new TextVideoPreviewViewBinderV3(view1, uBaseFragmen, p0);
          this.y = textVideoPre;
          a.m(textVideoPre);
          this.v.add(textVideoPre);
          ty = this.y;
          a.m(ty);
          View view2 = uBaseFragmen.requireView();
          a.o(view2, str1);
          this.v.add(new k(view2, uBaseFragmen, p0, f.a.g(uBaseFragmen)));
          View view3 = uBaseFragmen.requireView();
          a.o(view3, str1);
          g og = new g(view3, uBaseFragmen, true);
          a uoa1 = f.h(uBaseFragmen1);
          a.o(uoa1, str2);
          uoa1.s0().b(og);
          this.v.add(og);
          View view4 = uBaseFragmen.requireView();
          a.o(view4, str1);
          this.v.add(new l(view4, uBaseFragmen, true));
          f.o0(this.y, p0.u(), VideoFrameChangeListener.class);
       }else {
          objArray1 = new Object[0];
          a.D().w(str, "onCreated picture", objArray1);
          view1 = uBaseFragmen.requireView();
          a.o(view1, str1);
          ty = new PicturePreviewViewBinder(view1, uBaseFragmen, p0);
          this.v.add(ty);
       }
       a uoa2 = f.h(uBaseFragmen1);
       a.o(uoa2, str2);
       uoa2.s0().b(ty);
       View view5 = uBaseFragmen.requireView();
       a.o(view5, str1);
       this.v.add(new a(view5, uBaseFragmen, p0));
       if (PostExperimentUtils.b0() && !f.A(p0.getType())) {
          RecoTextFetchActionV3 recoTextFetc = new RecoTextFetchActionV3("", 0, 2, null);
          this.T().t0(ty);
          BaseEditor td = this.d;
          a.o(td, "mDelegate");
          Activity context = td.getContext();
          a.o(context, "mDelegate.context");
          str1 = j0.f(context.getIntent(), "editSessionId");
          Object[] objArray2 = new Object[0];
          a.D().w(str, "enableTextContentRecommend sessionId = "+str1, objArray2);
          if (!TextUtils.isEmpty(str1)) {
             a.m(str1);
             recoTextFetc = new RecoTextFetchActionV3(str1, 0, 2, null);
             this.T().t0(TextUtils.isEmpty(str1));
          }else {
             f.p0(p0.u(), q.class).d(this.u);
          }
       }
       this.T().t0(new TextInitActionV3(0, null, 3, null));
       Iterator iterator = this.v.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       return;
    }
    public void C(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TextEditorV3", "onEditorContextUpdated", objArray);
       return;
    }
    public void D(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "10")) {
          return;
       }
       int i = 0;
       if (!this.W()) {
          Object[] objArray = new Object[i];
          a.D().w("TextEditorV3", "onFinish return", objArray);
          return;
       }else {
          this.t(p0);
          this.c(this.q(), i);
          return;
       }
    }
    public boolean E(EditorDelegate p0,View p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "11");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       a.p(p0, "delegate");
       if (!this.w(p0.getContext(), true)) {
          return false;
       }
       Iterator iterator = this.v.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          if (uoa instanceof a) {
             uoa.c();
          }
       }
       Activity context = p0.getContext();
       Objects.requireNonNull(context, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
       g1.d(context, this.j().a, this.j().b, "text");
       return true;
    }
    public boolean F(EditorDelegate p0,View p1){
       return true;
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TextEditorV3", "onRelease", objArray);
       Iterator iterator = this.v.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       this.T().t0(new DecorationReleaseAction());
       d ty = this.y;
       if (ty != null) {
          EditorDelegate uEditorDeleg = this.i();
          a.o(uEditorDeleg, "delegate");
          f.t0(ty, uEditorDeleg.u(), VideoFrameChangeListener.class);
          this.y = null;
       }
       return;
    }
    public void H(){
       if (PatchProxy.applyVoid(null, this, d.class, "9")) {
          return;
       }
       String str = "TextEditorV3";
       if (!this.W()) {
          Object[] objArray = new Object[0];
          a.D().w(str, "onStart return", objArray);
          return;
       }else {
          BaseEditor td = this.d;
          String str1 = "mDelegate";
          a.o(td, str1);
          BaseFragment uBaseFragmen = td.q();
          a.o(uBaseFragmen, "mDelegate.previewFragment");
          c childFragmen = uBaseFragmen.getChildFragmentManager();
          a.o(childFragmen, "mDelegate.previewFragment.childFragmentManager");
          if (this.f == null) {
             BaseEditorFragment uBaseEditorF = this.f(childFragmen, str, ReEditTextFragment.class);
             this.f = uBaseEditorF;
             if (uBaseEditorF == null) {
                this.f = new ReEditTextFragment();
             }
             this.f.uh(this.d, this.i);
          }
          e uoe = childFragmen.beginTransaction();
          a.o(uoe, "fragmentManager.beginTransaction\(\)");
          BaseEditor td1 = this.d;
          a.o(td1, str1);
          if (td1.p()) {
             uoe.y(R.anim.arg_RES_7f0100d4, 0x7f0100d4);
          }else {
             uoe.y(R.anim.arg_RES_7f010105, 0x7f01010d);
          }
          this.b(str, uoe);
          this.c(this.q(), true);
          return;
       }
    }
    public EditReduxViewModel U(){
       BaseEditor td;
       Object[] objArray = null;
       EditorDelegate obj = PatchProxy.apply(objArray, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i();
       String str = "delegate";
       a.o(obj, str);
       boolean b = f.E(obj.getType());
       Object[] objArray1 = new Object[0];
       a.D().w("TextEditorV3", "getViewModel isPhoto:"+b, objArray1);
       String str1 = "mDelegate";
       if (!b) {
          td = this.d;
          a.o(td, str1);
          BaseFragment uBaseFragmen1 = td.q();
          Objects.requireNonNull(uBaseFragmen1, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment");
          objArray = uBaseFragmen1.Rh();
       }
       Object[] objArray2 = objArray;
       td = this.d;
       a.o(td, str1);
       BaseFragment uBaseFragmen = td.q();
       b uob = this.w.r0();
       Objects.requireNonNull(uob, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3");
       b uob1 = uob;
       uob = this.w.o0();
       Objects.requireNonNull(uob, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3");
       b uob2 = uob;
       EditorDelegate uEditorDeleg = this.i();
       a.o(uEditorDeleg, str);
       f uof = uEditorDeleg.f();
       a.o(uof, "delegate.editRepo");
       b uob3 = uob1;
       uob1 = uob2;
       l ol = new l(uob3, uob1, this.w.p0(), b, uof, objArray2);
       ViewModelProvider viewModelPro = ViewModelProviders.of(uBaseFragmen, td);
       ViewModel viewModel = viewModelPro.get(k.class);
       a.o(viewModel, "ViewModelProviders.of\(\n ¡­tViewModelV3::class.java\)");
       return viewModel;
    }
    public List V(){
       EditorItemFunc[] obj = PatchProxy.apply(null, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new EditorItemFunc[]{EditorItemFunc.CLIP_V3,EditorItemFunc.EFFECT_V2,EditorItemFunc.MUSIC_V2,EditorItemFunc.BEAT_SYNC};
       return CollectionsKt__CollectionsKt.r(obj);
    }
    public final boolean W(){
       boolean b;
       BaseEditor obj = PatchProxy.apply(null, this, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d;
       String str = "mDelegate";
       a.o(obj, str);
       if (obj.getType() == Workspace$Type.SINGLE_PICTURE) {
          obj = this.d;
          a.o(obj, str);
          c uoc = obj.N();
          a.o(uoc, "mDelegate.workspaceDraft");
          if (uoc.T0() == Workspace$Source.REEDIT) {
             b = true;
          label_003c :
             return b;
          }
       }
       b = false;
       goto label_003c ;
    }
    public BaseEditor$a d(){
       Object obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BaseEditor$a(this, 10, this.i);
    }
    public List o(){
       b[] obj = PatchProxy.apply(null, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b[]{Category.TEXT};
       return CollectionsKt__CollectionsKt.P(obj);
    }
    public int q(){
       Object obj = PatchProxy.apply(null, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (this.W()) {
          Object[] objArray = new Object[i];
          a.D().w("TextEditorV3", "isSinglePictureReEdit", objArray);
          i = 0x7f070383;
       }
       return i;
    }
    public boolean y(){
       BaseEditor obj = PatchProxy.apply(null, this, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d;
       a.o(obj, "mDelegate");
       return (f.E(obj.getType()) ^ 0x01);
    }
}
