package nmd.f0;
import bmd.a;
import yld.a;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import smd.d;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import nmd.f0$b;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerTimelineFragment;
import nmd.f0$a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import com.yxcorp.gifshow.v3.EditorManager$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import nmd.g0;
import amd.c;
import rmd.g;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData$CustomButtonMode;
import cq.a;
import q87.c;
import bmd.e;
import java.util.Objects;
import k2b.e0;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.OpenStickerEditorAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import xld.a;
import mmd.b;
import mod.a;
import voc.o;
import bvc.b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import nmd.h0;
import java.lang.Runnable;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public final class f0 extends a implements a	// class@001e56
{
    public final EditorManager$b l;
    public final d m;
    public final boolean n;
    public final PublishSubject o;

    public void f0(View p0,Fragment p1,EditorDelegate p2,d p3,boolean p4,PublishSubject p5){
       a.p(p0, "rootView");
       a.p(p1, "fragment");
       a.p(p2, "editorDelegate");
       a.p(p3, "viewModel");
       a.p(p5, "mOnClickStickerListener");
       super(p0, p1, p2, EditorItemFunc.STICKER_V2, false);
       this.m = p3;
       this.n = p4;
       this.o = p5;
       this.l = new f0$b(this);
       if (!p4 && this.J() instanceof StickerTimelineFragment) {
          p0.G = p5;
          p0.H = new f0$a(this);
       }
       return;
    }
    public boolean D(BaseDrawer p0){
       return p0 instanceof NewEditStickerBaseDrawer;
    }
    public EditorManager$b F(){
       return this.l;
    }
    public DecorationTimelineFragment L(boolean p0){
       StickerTimelineFragment stickerTimel;
       f0 uof0 = f0.class;
       if (PatchProxy.isSupport(uof0)) {
          stickerTimel = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uof0, "1");
          if (stickerTimel != PatchProxyResult.class) {
          label_002c :
             return stickerTimel;
          }
       }
       stickerTimel = new StickerTimelineFragment();
       stickerTimel.ph(this.E());
       stickerTimel.I = new g0(this);
       goto label_002c ;
    }
    public c M(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "fragment");
       return g.a(p0);
    }
    public void N(EditDecorationBaseDrawer p0){
       e a;
       if (PatchProxy.applyVoidOneRefs(p0, this, f0.class, "4")) {
       }else if(p0 != null){
          int i = 0;
          if (p0.getCustomButtonMode() == BaseDrawerData$CustomButtonMode.TIME_PANEL) {
             Object[] objArray = new Object[i];
             a.D().w("StickerPreviewMenuViewBinder", "handleCustomButtonTap: customButtonMode = TIME_PANEL", objArray);
             this.J().show();
             a = e.a;
             Fragment uFragment = this.G();
             Objects.requireNonNull(uFragment, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidOneRefs(uFragment, a, e.class, "1")) {
                a.p(uFragment, "iLogPage");
                a.a(uFragment, "EDIT_STICKER_TIME_BUTTON", "");
             }
          }else if(p0.getCustomButtonMode() == BaseDrawerData$CustomButtonMode.EDIT_TEXT){
             Object[] objArray1 = new Object[i];
             a.D().w("StickerPreviewMenuViewBinder", "handleCustomButtonTap: customButtonMode = EDIT_TEXT", objArray1);
             if (p0 instanceof NewVoteStickerDrawer) {
                p0.clearFocusEditText();
             }
             p0.enterEditingMode();
          }
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, f0.class, "5")) {
          return;
       }
       if (this.n == null) {
          this.J().show();
       }
       this.m.t0(new OpenStickerEditorAction());
       return;
    }
    public void x(a p0,a p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f0.class, "3")) {
       }else {
          a.p(p0, "newState");
          a.p(p1, "lastState");
          int i = 0;
          if (!p0.y().f()) {
             o oo = this.E().x();
             a.o(oo, "editorDelegate.editorContext");
             if (!oo.b().d() && !p0.s()) {
                b = true;
             label_0045 :
                if (this.I().getMShouldShowStickerCustomButton() != b) {
                   Object[] objArray = new Object[i];
                   a.D().w("StickerPreviewMenuViewBinder", "onStateChange: mShouldShowStickerCustomButton = "+this.I().getMShouldShowStickerCustomButton(), objArray);
                   if (!p0.y().f() && p1.y().f()) {
                      this.I().setShowCustomButton(b);
                      this.I().post(new h0(this, b));
                   }else {
                      this.I().T0(b, this.n);
                   }
                }
                if (p0.s() != p1.s()) {
                   this.I().T();
                }
             }
          }
          b = false;
          goto label_0045 ;
       }
       return;
    }
}
