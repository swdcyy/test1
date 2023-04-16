package bmd.b;
import voc.n;
import com.yxcorp.gifshow.v3.EditorActivity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import bmd.b$d;
import bmd.b$b;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import tvc.f;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import io.reactivex.subjects.PublishSubject;
import bmd.b$c;
import erd.g;
import crd.b;
import brd.t;
import nmd.q;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.previewer.EditorBasePreviewFragment;
import uwc.a;
import com.yxcorp.gifshow.v3.f;
import nwc.e;
import nwc.a;
import java.util.List;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerPicturePreviewViewBinder;
import java.util.Objects;
import smd.d;
import yld.k;
import amd.c;
import nmd.l0;
import java.util.Map;
import com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener;
import t36.f;
import fmd.a;
import nmd.v;
import nmd.f0;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.d;
import rmd.g;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerFrameChangeViewBinder;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import ooc.j0;
import androidx.lifecycle.ViewModel;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import voc.o;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import faa.a;
import q87.c;
import lq.i;
import com.kuaishou.android.post.PostArguments;
import com.kuaishou.android.post.SerialArg;
import com.kuaishou.android.post.PostPageArg;
import oa0.a;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.StringBuilder;
import tvc.e;
import mmd.b;
import mmd.a;
import com.yxcorp.gifshow.v3.framework.player.UpdatePlayerStateAction;
import com.yxcorp.gifshow.v3.framework.player.UpdateTo;
import xvc.b;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.StickerLibraryShowAction;
import com.yxcorp.gifshow.v3.framework.player.UpdatePlayerTimeAction;
import bmd.a;
import android.app.Activity;
import k2b.e0;
import com.yxcorp.gifshow.v3.editor.BaseEditor$a;
import ooc.g1;
import com.yxcrop.gifshow.v3.editor.decoration_v2.action.DecorationReleaseAction;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import smd.e;
import xvc.f;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.StickerInitAction;
import android.view.ViewTreeObserver;
import android.widget.AbsoluteLayout;
import bmd.b$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public final class b extends n	// class@00027b
{
    public final r0 A;
    public v B;
    public final EditorActivity C;
    public final long u;
    public final List v;
    public j0 w;
    public boolean x;
    public long y;
    public final Observer z;

    public void b(EditorActivity p0){
       a.p(p0, "requireActivity");
       super();
       this.C = p0;
       this.u = 500;
       this.v = new ArrayList();
       this.z = new b$d(this);
       this.A = new b$b(this);
    }
    public void B(EditorDelegate p0,String p1){
       View view1;
       EditReduxViewModel uEditReduxVi;
       b tB;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       a.p(p0, "delegate");
       a.p(p1, "subType");
       super.B(p0, p1);
       BaseFragment uBaseFragmen = p0.q();
       a.o(uBaseFragmen, "previewFragment");
       this.T().r0().observe(uBaseFragmen, this.z);
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<StickerDetailInfo>\(\)");
       publishSubje.subscribe(new b$c(this));
       View view = uBaseFragmen.requireView();
       a.o(view, "previewFragment.requireView\(\)");
       q oq = new q(uBaseFragmen, view, p0);
       BaseFragment uBaseFragmen1 = uBaseFragmen;
       a uoa = f.h(uBaseFragmen1);
       a.o(uoa, "EditUtils.getBaseEditPre¡­ditorBasePreviewFragment\)");
       uoa.s0().b(oq);
       this.v.add(oq);
       String str = "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.vm.StickerViewModelV2";
       if (f.E(p0.getType())) {
          view1 = uBaseFragmen.requireView();
          a.o(view1, "previewFragment.requireView\(\)");
          uEditReduxVi = this.T();
          Objects.requireNonNull(uEditReduxVi, str);
          StickerPicturePreviewViewBinder stickerPictu = new StickerPicturePreviewViewBinder(view1, uBaseFragmen, p0, uEditReduxVi);
          this.B = stickerPictu;
          a.m(stickerPictu);
          this.v.add(stickerPictu);
       }else {
          View view2 = uBaseFragmen.requireView();
          a.o(view2, "previewFragment.requireView\(\)");
          EditReduxViewModel uEditReduxVi2 = this.T();
          Objects.requireNonNull(uEditReduxVi2, str);
          this.v.add(new k(view2, uBaseFragmen, p0, uEditReduxVi2));
          view1 = uBaseFragmen.requireView();
          a.o(view1, "previewFragment.requireView\(\)");
          uEditReduxVi = this.T();
          Objects.requireNonNull(uEditReduxVi, str);
          l0 ol0 = new l0(view1, uBaseFragmen, p0, uEditReduxVi);
          this.B = ol0;
          a.m(ol0);
          this.v.add(ol0);
          tB = this.B;
          Objects.requireNonNull(tB, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerVideoPreviewViewBinder");
          f.o0(tB, p0.u(), VideoFrameChangeListener.class);
       }
       tB = this.B;
       if (tB != null) {
          oq.k0(tB.Y());
       }
       a uoa1 = f.h(uBaseFragmen1);
       a.o(uoa1, "EditUtils.getBaseEditPre¡­iewModel\(previewFragment\)");
       tB = this.B;
       a.m(tB);
       uoa1.s0().b(tB);
       view = uBaseFragmen.requireView();
       a.o(view, "previewFragment.requireView\(\)");
       EditReduxViewModel uEditReduxVi1 = this.T();
       Objects.requireNonNull(uEditReduxVi1, str);
       uEditReduxVi = uEditReduxVi1;
       BaseFragment uBaseFragmen2 = uBaseFragmen;
       EditorDelegate uEditorDeleg = p0;
       f0 uof0 = new f0(view, uBaseFragmen2, uEditorDeleg, uEditReduxVi, f.E(p0.getType()), publishSubje);
       this.v.add(v12);
       view = uBaseFragmen.requireView();
       a.o(view, "previewFragment.requireView\(\)");
       d uod = new d(view, uBaseFragmen2, uEditorDeleg, g.a(uBaseFragmen), publishSubje);
       this.v.add(v7);
       a uoa2 = f.h(uBaseFragmen1);
       a.o(uoa2, "EditUtils.getBaseEditPre¡­iewModel\(previewFragment\)");
       uoa2.s0().b(v7);
       view = uBaseFragmen.requireView();
       a.o(view, "previewFragment.requireView\(\)");
       this.v.add(new StickerFrameChangeViewBinder(view, uBaseFragmen, p0));
       b tC = this.C;
       a.m(tC);
       j0 oj0 = ViewModelProviders.of(tC).get(j0.class);
       this.w = oj0;
       if (oj0 != null) {
          f uof = oj0.o0();
          if (uof != null) {
             uof.d(this.A);
          }
       }
       Iterator iterator = this.v.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       return;
    }
    public void C(o p0){
    }
    public void D(boolean p0){
    }
    public boolean E(EditorDelegate p0,View p1){
       boolean b;
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "6");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       a.p(p0, "delegate");
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "StickerEditorV2";
       a.D().w(str, "onItemSelected: ", objArray);
       if (i.h() && (i.g().getStickerParam().get() != null && i.m().z("STICKER_PANEL_HAS_OPEND") == null)) {
          i.m().Q("STICKER_PANEL_HAS_OPEND", Boolean.TRUE);
          a.A1((a.x0() + 1));
       }
    label_0058 :
       this.Y();
       BaseEditor td = this.d;
       a.o(td, "mDelegate");
       c uoc = td.N();
       a.o(uoc, "mDelegate.workspaceDraft");
       b = f.E(uoc.a1());
       Object[] objArray1 = new Object[i];
       a.D().w(str, "libraryHasShowed: "+this.x+", isPictureType: "+b, objArray1);
       if (this.T().o0().A() == null) {
          this.X();
       }
       if (this.x == null || b) {
          this.T().t0(new StickerLibraryShowAction());
          UpdateTo bOTH = UpdateTo.BOTH;
          this.T().t0(new UpdatePlayerStateAction(i, bOTH));
          this.T().t0(new UpdatePlayerTimeAction(0, bOTH));
          this.x = true;
       }else {
          this.T().t0(new UpdatePlayerStateAction(i, UpdateTo.BOTH));
       }
       i.m().Q("STICKER_PANEL_HAS_OPEND", Boolean.TRUE);
       Iterator iterator = this.v.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          if (uoa instanceof a) {
             uoa.c();
          }
       }
       Activity context = p0.getContext();
       Objects.requireNonNull(context, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
       g1.d(context, this.j().a, this.j().b, "sticker");
       return 1;
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       Iterator iterator = this.v.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       this.T().t0(new DecorationReleaseAction());
       b tw = this.w;
       if (tw != null) {
          f uof = tw.o0();
          if (uof != null) {
             uof.c(this.A);
          }
       }
       return;
    }
    public void H(){
    }
    public EditReduxViewModel U(){
       boolean b;
       Object[] objArray = null;
       EditorDelegate obj = PatchProxy.apply(objArray, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i();
       String str = "delegate";
       a.o(obj, str);
       b = f.E(obj.getType());
       String str1 = "mDelegate";
       if (!b) {
          BaseEditor td1 = this.d;
          a.o(td1, str1);
          BaseFragment uBaseFragmen1 = td1.q();
          Objects.requireNonNull(uBaseFragmen1, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment");
          objArray = uBaseFragmen1.Rh();
       }
       BaseEditor td = this.d;
       a.o(td, str1);
       BaseFragment uBaseFragmen = td.q();
       EditorDelegate uEditorDeleg = this.i();
       a.o(uEditorDeleg, str);
       f uof = uEditorDeleg.f();
       a.o(uof, "delegate.editRepo");
       ViewModel viewModel = ViewModelProviders.of(uBaseFragmen, new e(b, uof, objArray)).get(d.class);
       a.o(viewModel, "ViewModelProviders.of\(\n ¡­rViewModelV2::class.java\)");
       return viewModel;
    }
    public List V(){
       EditorItemFunc[] obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new EditorItemFunc[]{EditorItemFunc.CLIP_V3,EditorItemFunc.EFFECT_V2,EditorItemFunc.MUSIC_V2,EditorItemFunc.BEAT_SYNC};
       return CollectionsKt__CollectionsKt.r(obj);
    }
    public final EditDecorationContainerViewV2 W(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.findViewById(R.id.new_text_decoration_editor_view);
       a.o(p0, "rootView.findViewById\(R.¡­t_decoration_editor_view\)");
       return p0;
    }
    public final void X(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "11")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       a.D().w("StickerEditorV2", "initStickerAttachInfo: ", objArray1);
       b tB = this.B;
       if (tB != null) {
          objArray = tB.F();
       }
       this.T().t0(new StickerInitAction(objArray));
       Object[] objArray2 = new Object[i];
       a.D().w("StickerEditorV2", "attachInfo = "+objArray, objArray2);
       if (objArray == null || objArray.c() <= 0) {
          Object[] objArray3 = new Object[i];
          a.D().w("StickerEditorV2", "attachInfo = "+objArray, objArray3);
          BaseEditor td = this.d;
          a.o(td, "mDelegate");
          View view = td.q().requireView();
          a.o(view, "mDelegate.previewFragment.requireView\(\)");
          EditDecorationContainerViewV2 uEditDecorat = this.W(view);
          uEditDecorat.getViewTreeObserver().addOnGlobalLayoutListener(new b$a(this, uEditDecorat));
       }
       return;
    }
    public final void Y(){
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       BaseEditor td = this.d;
       a.o(td, "mDelegate");
       View view = td.q().requireView();
       a.o(view, "mDelegate.previewFragment.requireView\(\)");
       this.W(view).R();
       return;
    }
    public BaseEditor$a d(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BaseEditor$a(this, 7, this.i);
    }
    public int q(){
       return 0;
    }
    public boolean y(){
       BaseEditor obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d;
       a.o(obj, "mDelegate");
       return (f.E(obj.getType()) ^ 0x01);
    }
}
