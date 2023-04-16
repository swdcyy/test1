package ind.a;
import voc.n;
import com.yxcorp.gifshow.v3.EditorActivity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ind.a$a;
import java.util.ArrayList;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextKeyboardDataViewModelV3;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import ind.a$b;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import tvc.f;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.keyboard.TextKeyBoardPanelViewBinder;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.previewer.EditorBasePreviewFragment;
import uwc.a;
import com.yxcorp.gifshow.v3.f;
import nwc.e;
import nwc.a;
import java.util.List;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder;
import yld.k;
import und.l;
import tnd.b;
import amd.c;
import rnd.g;
import rnd.l;
import java.util.Map;
import com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener;
import t36.f;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder;
import nnd.a;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcrop.gifshow.v3.editor.text_v2.action.RecoTextFetchActionV3;
import nsd.u;
import xvc.b;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import android.app.Activity;
import android.content.Intent;
import ekd.j0;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import pb9.q;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.EditAbilityConfig$TextParam;
import com.kuaishou.android.post.EditAbilityConfig;
import android.graphics.RectF;
import java.lang.Integer;
import com.yxcrop.gifshow.v3.editor.text_v2.action.TextInitActionV3;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import voc.o;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo;
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
import und.m;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3;
import xvc.f;
import androidx.lifecycle.ViewModelProvider$Factory;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.Workspace$Source;
import java.lang.Number;

public final class a extends n	// class@001027
{
    public final q u;
    public final List v;
    public TextKeyboardDataViewModelV3 w;
    public final Observer x;
    public TextVideoPreviewViewBinder y;
    public final EditorActivity z;

    public void a(EditorActivity p0){
       a.p(p0, "requireActivity");
       super();
       this.z = p0;
       this.u = new a$a(this);
       this.v = new ArrayList();
       ViewModel viewModel = ViewModelProviders.of(p0).get(TextKeyboardDataViewModelV3.class);
       a.o(viewModel, "ViewModelProviders.of\(re¡­aViewModelV3::class.java\)");
       this.w = viewModel;
       this.x = new a$b(this);
    }
    public void B(EditorDelegate p0,String p1){
       View view1;
       a ty;
       View view2;
       RectF rectF;
       int i;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a.p(p0, "delegate");
       a.p(p1, "subType");
       super.B(p0, p1);
       BaseFragment uBaseFragmen = p0.q();
       a.o(uBaseFragmen, "previewFragment");
       this.T().r0().observe(uBaseFragmen, this.x);
       View view = uBaseFragmen.requireView();
       String str = "previewFragment.requireView\(\)";
       a.o(view, str);
       TextKeyBoardPanelViewBinder textKeyBoard = new TextKeyBoardPanelViewBinder(view, uBaseFragmen, p0);
       BaseFragment uBaseFragmen1 = uBaseFragmen;
       a uoa = f.h(uBaseFragmen1);
       a.o(uoa, "EditUtils.getBaseEditPre¡­ditorBasePreviewFragment\)");
       uoa.s0().b(textKeyBoard);
       this.v.add(textKeyBoard);
       String str1 = "EditUtils.getBaseEditPre¡­iewModel\(previewFragment\)";
       if (!f.E(p0.getType())) {
          view1 = uBaseFragmen.requireView();
          a.o(view1, str);
          TextVideoPreviewViewBinder textVideoPre = new TextVideoPreviewViewBinder(view1, uBaseFragmen, p0);
          this.y = textVideoPre;
          a.m(textVideoPre);
          this.v.add(textVideoPre);
          ty = this.y;
          a.m(ty);
          view2 = uBaseFragmen.requireView();
          a.o(view2, str);
          this.v.add(new k(view2, uBaseFragmen, p0, b.d(uBaseFragmen)));
          View view3 = uBaseFragmen.requireView();
          a.o(view3, str);
          g og = new g(view3, uBaseFragmen, false);
          a uoa1 = f.h(uBaseFragmen1);
          a.o(uoa1, str1);
          uoa1.s0().b(og);
          this.v.add(og);
          view2 = uBaseFragmen.requireView();
          a.o(view2, str);
          this.v.add(new l(view2, uBaseFragmen, false));
          f.o0(this.y, p0.u(), VideoFrameChangeListener.class);
       }else {
          view1 = uBaseFragmen.requireView();
          a.o(view1, str);
          ty = new PicturePreviewViewBinder(view1, uBaseFragmen, p0);
          this.v.add(ty);
       }
       a uoa2 = f.h(uBaseFragmen1);
       a.o(uoa2, str1);
       uoa2.s0().b(ty);
       View view4 = uBaseFragmen.requireView();
       a.o(view4, str);
       a uoa3 = new a(view4, uBaseFragmen, p0, EditorItemFunc.TEXT_V2, false);
       this.v.add(uoa2);
       if (PostExperimentUtils.b0() && !f.A(p0.getType())) {
          RecoTextFetchActionV3 recoTextFetc = new RecoTextFetchActionV3("", 0, 2, null);
          this.T().t0(view2);
          BaseEditor td = this.d;
          a.o(td, "mDelegate");
          Activity context = td.getContext();
          a.o(context, "mDelegate.context");
          str1 = j0.f(context.getIntent(), "editSessionId");
          Object[] objArray = new Object[false];
          a.D().w("TextEditorV2", "enableTextContentRecommend sessionId = "+str1, objArray);
          if (!TextUtils.isEmpty(str1)) {
             a.m(str1);
             RecoTextFetchActionV3 recoTextFetc1 = new RecoTextFetchActionV3(str1, 0, 2, null);
             this.T().t0(TextUtils.isEmpty(str1));
          }else {
             f.p0(p0.u(), q.class).d(this.u);
          }
       }
       EditAbilityConfig$TextParam textParam = EditAbilityConfig.getTextParam(i.g());
       EditAbilityConfig$TextParam textParam1 = null;
       EditAbilityConfig$TextParam mContainerLi = (textParam != null)? textParam.mContainerLimitRect: textParam1;
       if (mContainerLi != null && textParam.mContainerLimitRect.length == 4) {
          EditAbilityConfig$TextParam mContainerLi1 = textParam.mContainerLimitRect;
          rectF = new RectF(mContainerLi1[0], mContainerLi1[1], mContainerLi1[2], mContainerLi1[3]);
       }else {
          rectF = textParam1;
       }
       if (textParam != null) {
          textParam1 = Integer.valueOf(textParam.mTextNumberLimit);
       }
       a.m(textParam1);
       textParam = (textParam1.intValue() > 0)? textParam.mTextNumberLimit: -1;
       this.T().t0(new TextInitActionV3(textParam, rectF));
       Iterator iterator = this.v.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       return;
    }
    public void C(o p0){
    }
    public void D(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "8")) {
          return;
       }
       if (!this.W()) {
          return;
       }
       this.t(p0);
       this.c(this.q(), false);
       return;
    }
    public boolean E(EditorDelegate p0,View p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "9");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       a.p(p0, "delegate");
       this.w.q0().l();
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
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       Iterator iterator = this.v.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       this.T().t0(new DecorationReleaseAction());
       a ty = this.y;
       if (ty != null) {
          EditorDelegate uEditorDeleg = this.i();
          a.o(uEditorDeleg, "delegate");
          f.t0(ty, uEditorDeleg.u(), VideoFrameChangeListener.class);
          this.y = null;
       }
       return;
    }
    public void H(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       if (!this.W()) {
          return;
       }
       BaseEditor td = this.d;
       String str = "mDelegate";
       a.o(td, str);
       BaseFragment uBaseFragmen = td.q();
       a.o(uBaseFragmen, "mDelegate.previewFragment");
       c childFragmen = uBaseFragmen.getChildFragmentManager();
       a.o(childFragmen, "mDelegate.previewFragment.childFragmentManager");
       if (this.f == null) {
          BaseEditorFragment uBaseEditorF = this.f(childFragmen, "TextEditorV2", ReEditTextFragment.class);
          this.f = uBaseEditorF;
          if (uBaseEditorF == null) {
             this.f = new ReEditTextFragment();
          }
          this.f.uh(this.d, this.i);
       }
       e uoe = childFragmen.beginTransaction();
       a.o(uoe, "fragmentManager.beginTransaction\(\)");
       BaseEditor td1 = this.d;
       a.o(td1, str);
       if (td1.p()) {
          uoe.y(R.anim.arg_RES_7f0100d4, 0x7f0100d4);
       }else {
          uoe.y(R.anim.arg_RES_7f010105, 0x7f01010d);
       }
       this.b("TextEditorV2", uoe);
       this.c(this.q(), true);
       return;
    }
    public EditReduxViewModel U(){
       BaseEditor td;
       Object[] objArray = null;
       EditorDelegate obj = PatchProxy.apply(objArray, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i();
       String str = "delegate";
       a.o(obj, str);
       boolean b = f.E(obj.getType());
       String str1 = "mDelegate";
       if (!b) {
          td = this.d;
          a.o(td, str1);
          BaseFragment uBaseFragmen1 = td.q();
          Objects.requireNonNull(uBaseFragmen1, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment");
          objArray = uBaseFragmen1.Rh();
       }
       Object[] objArray1 = objArray;
       td = this.d;
       a.o(td, str1);
       BaseFragment uBaseFragmen = td.q();
       EditorDelegate uEditorDeleg = this.i();
       a.o(uEditorDeleg, str);
       f uof = uEditorDeleg.f();
       a.o(uof, "delegate.editRepo");
       m om = new m(this.w.p0(), this.w.q0(), b, uof, objArray1);
       ViewModelProvider viewModelPro = ViewModelProviders.of(uBaseFragmen, td);
       ViewModel viewModel = viewModelPro.get(l.class);
       a.o(viewModel, "ViewModelProviders.of\(\n ¡­tViewModelV2::class.java\)");
       return viewModel;
    }
    public List V(){
       EditorItemFunc[] obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new EditorItemFunc[]{EditorItemFunc.CLIP_V3,EditorItemFunc.EFFECT_V2,EditorItemFunc.MUSIC_V2,EditorItemFunc.BEAT_SYNC};
       return CollectionsKt__CollectionsKt.r(obj);
    }
    public final boolean W(){
       boolean b;
       BaseEditor obj = PatchProxy.apply(null, this, a.class, "10");
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
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BaseEditor$a(this, 10, this.i);
    }
    public int q(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.W())? 0x7f070383: 0;
       return i;
    }
    public boolean y(){
       BaseEditor obj = PatchProxy.apply(null, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d;
       a.o(obj, "mDelegate");
       return (f.E(obj.getType()) ^ 0x01);
    }
}
