package nmd.v$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import nmd.v;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import smd.d;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import mmd.b;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.StickerScaleAndRotateEndAction;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;
import rmd.c;
import android.graphics.Rect;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import cq.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import q87.c;
import java.util.List;
import tmd.a;
import xvc.b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import nmd.v$d$a;
import java.lang.Runnable;
import android.widget.AbsoluteLayout;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.DeleteStickerAction;
import wnd.j;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationSelectAction;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.StickerLibraryCloseAction;
import bmd.e;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;
import android.view.MotionEvent;
import mod.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationUnSelectAction;
import nsd.u;
import nmd.x;
import android.widget.TextView;
import nmd.y;
import android.view.View$OnTouchListener;
import android.view.View;
import nmd.z;
import nmd.w;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElement;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationMoveEndAction;

public final class v$d extends DecorationContainerView$e	// class@001e7c
{
    public final v a;

    public void v$d(v p0){
       this.a = p0;
       super();
    }
    public final void A(EditDecorationBaseDrawer p0){
       float f;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, v$d.class, "15")) {
          return;
       }
       v$d a = obj.a;
       a.j0(obj1, a.b0().o0());
       if (obj1 != null) {
          v2 = obj1 instanceof NewEditStickerBaseDrawer;
          if (!a) {
             return;
          }else {
             d uod = obj.a.b0();
             StickerScaleAndRotateEndAction obj2 = obj1;
             int layerIndex = obj2.getLayerIndex();
             v$d a1 = obj.a;
             Objects.requireNonNull(a1);
             Object obj3 = PatchProxy.applyOneRefs(obj1, a1, v.class, "27");
             if (obj3 != PatchProxyResult.class) {
                f = obj3.floatValue();
             }else if(!a || p0.isInteractSticker()){
                f = p0.getScale();
             }else {
                Size size = c.d(obj2.getElementData(), c.a.b(obj2.getEditStickerType(), obj2.getEditStickerSubType()), (float)a1.d.getEditorRect().width());
                Object[] objArray = new Object[false];
                a.D().w("StickerPreviewBaseViewBinder", "getDraftScale: scale = "+obj2.getScale()+", contentSize = "+size+", "+"stickerOriginWidth = "+obj2.getStickerOriginWidth()+", containerWidth = "+a1.d.getEditorRect().width(), objArray);
                f = a.a(obj2.getScale(), a1.y, (float)size.b, obj2.getStickerOriginWidth(), a1.N(obj2.getAttachIdentifierList()).b, (float)a1.d.getEditorRect().width(), a1.L(obj2.getAttachIdentifierList()));
             }
             float f1 = f;
             obj2 = new StickerScaleAndRotateEndAction(layerIndex, f1, obj2.getAdditionalScale(), obj2.getFinalRotate(), obj.a.b0().o0().w());
             uod.t0(v10);
             if (obj.a.v != null) {
                this.z(p0);
                obj.a.v = false;
             }
          }
       }
       return;
    }
    public final void B(EditDecorationBaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$d.class, "14")) {
          return;
       }
       v$d ta = this.a;
       ta.k0(p0, ta.b0().o0());
       this.a.P().post(new v$d$a(this));
       return;
    }
    public void b(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$d.class, "11")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("StickerPreviewBaseViewBinder", "onSingleFingerScaleAndRotateEnd: ", objArray);
          super.b(p0);
          this.A(p0);
          this.a.H();
       }
       return;
    }
    public void c(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$d.class, "10")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("StickerPreviewBaseViewBinder", "onSingleFingerScaleAndRotateStart: ", objArray);
          super.c(p0);
          this.B(p0);
          this.a.G();
       }
       return;
    }
    public void d(BaseDrawer p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, v$d.class, "9")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("StickerPreviewBaseViewBinder", "onDelete: ", objArray);
          super.d(p0, p1);
          if (p0 != null) {
             this.a.b0().t0(new DeleteStickerAction(p0.getLayerIndex(), this.a.b0().o0().w()));
             j.a.e(this.a.W(), this.a.P());
          }
       }
       return;
    }
    public void e(BaseDrawer p0){
       this.z(p0);
    }
    public void h(BaseDrawer p0){
       e a;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, v$d.class, str)) {
       }else {
          a.p(p0, "decorationDrawer");
          Object[] objArray = new Object[0];
          a.D().w("StickerPreviewBaseViewBinder", "onSelect: ", objArray);
          super.h(p0);
          p0.setAcceptTouchEvent(true);
          this.a.b0().t0(new DecorationSelectAction(p0.getLayerIndex()));
          if (this.a.b0().o0().B()) {
             this.a.b0().t0(new StickerLibraryCloseAction());
          }
          if (p0.isCustomButtonEnable()) {
             a = e.a;
             Fragment uFragment = this.a.W();
             Objects.requireNonNull(uFragment, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidOneRefs(uFragment, a, e.class, str)) {
                a.p(uFragment, "iLogPage");
                str = "EDIT_STICKER_TIME_BUTTON";
                if (!PatchProxy.applyVoidTwoRefs(uFragment, str, a, e.class, "5")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = str;
                   ShowMetaData showMetaData = new ShowMetaData();
                   showMetaData.setLogPage(uFragment);
                   showMetaData.setElementPackage(uElementPack);
                   u1.B0(showMetaData);
                }
             }
          }
          this.a.G();
       }
       return;
    }
    public void i(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$d.class, "12")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("StickerPreviewBaseViewBinder", "onDoubleFingerScaleAndRotateStart: ", objArray);
          super.i(p0);
          this.B(p0);
          this.a.G();
       }
       return;
    }
    public void k(BaseDrawer p0,MotionEvent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, v$d.class, "5")) {
       }else {
          a.p(p1, "motionEvent");
          Object[] objArray = new Object[0];
          a.D().w("StickerPreviewBaseViewBinder", "onSingleTapBlankScreen: ", objArray);
          super.k(p0, p1);
          if (this.a.b0().o0().B()) {
             this.a.b0().t0(new StickerLibraryCloseAction());
          }else if(this.a.b0().o0().y().f()){
             this.a.I();
          }else {
             this.a.P().R();
          }
       }
       return;
    }
    public void l(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$d.class, "4")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("StickerPreviewBaseViewBinder", "onUnSelect: ", objArray);
          super.l(p0);
          if (p0 != null) {
             p0.setAcceptTouchEvent(0);
          }
          this.a.b0().t0(new DecorationUnSelectAction(0, 1, null));
          if (p0 != null) {
             this.a.J(p0);
          }
          this.a.H();
       }
       return;
    }
    public void p(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$d.class, "6")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("StickerPreviewBaseViewBinder", "onSingleFingerMoveStart: ", objArray);
          super.p(p0);
          v$d ta = this.a;
          ta.k0(p0, ta.b0().o0());
          this.a.P().post(new x(this));
          this.a.n0(0);
          TextView textView = this.a.R();
          if (textView != null && !textView.getVisibility()) {
             this.a.R().setVisibility(8);
          }
          this.a.G();
       }
       return;
    }
    public boolean r(BaseDrawer p0){
       return p0 instanceof NewEditStickerBaseDrawer;
    }
    public void t(BaseDrawer p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, v$d.class, "1")) {
       }else {
          a.p(p0, "decorationDrawer");
          super.t(p0, p1);
          p1 = this.a;
          Objects.requireNonNull(p1);
          int i = 0;
          if (!PatchProxy.applyVoid(null, p1, v.class, "18")) {
             p1.d.Q(i);
             p1.d.C(true);
             v j = p1.j;
             if (j != null) {
                j.setOnTouchListener(y.b);
             }
             p1.d.postDelayed(new z(p1), 500);
          }
          Object[] objArray = new Object[i];
          a.D().w("StickerPreviewBaseViewBinder", "onAdd: isInitFromDraft = "+p0.isInitFromDraft()+", "+"isFromPicTemplate = "+p0.isFromPicTemplate()+", decorationDrawer.scale "+"= "+p0.getScale(), objArray);
          if (!p0.isInitFromDraft() && !p0.isFromPicTemplate()) {
             this.a.P().post(new w(this, p0));
          }
       }
       return;
    }
    public void v(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$d.class, "3")) {
       }else {
          a.p(p0, "decorationDrawer");
          Object[] objArray = new Object[0];
          a.D().w("StickerPreviewBaseViewBinder", "onSelectedTap: ", objArray);
          super.v(p0);
          p0.setAcceptTouchEvent(true);
          if (p0 instanceof NewTagStickerElement) {
             this.a.o0();
          }
       }
       return;
    }
    public void x(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$d.class, "13")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("StickerPreviewBaseViewBinder", "onDoubleFingerScaleRotateEnd: ", objArray);
          super.x(p0);
          this.A(p0);
          this.a.H();
       }
       return;
    }
    public void y(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$d.class, "7")) {
       }else {
          Object[] objArray = new Object[0];
          String str = "StickerPreviewBaseViewBinder";
          a.D().w(str, "onSingleFingerMoveEnd: ", objArray);
          super.y(p0);
          v$d ta = this.a;
          ta.j0(p0, ta.b0().o0());
          if (p0 != null) {
             if (this.a.H.getType() == Workspace$Type.LONG_PICTURE) {
                double d = (double)p0.getMoveY();
                if (d >= 0 && (d - 0x3ff0000000000000 > 0 && !p0 instanceof NewTagStickerElement)) {
                   objArray = new Object[0];
                   a.D().w(str, "onSingleFingerMoveEnd: longPicture not support pictureCrossing of tagSticker", objArray);
                label_008b :
                   this.a.n0(true);
                   if (this.a.v != null) {
                      this.z(p0);
                      p0.v = false;
                   }
                }
             }
             DecorationMoveEndAction uDecorationM = new DecorationMoveEndAction(p0.getLayerIndex(), false, true, p0.getMoveX(), p0.getMoveY(), this.a.b0().o0().w());
             this.a.b0().t0(v9);
             goto label_008b ;
          }
          this.a.H();
       }
       return;
    }
    public void z(EditDecorationBaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$d.class, "8")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "StickerPreviewBaseViewBinder";
       a.D().w(str, "onDecorationTranslationFixed: ", objArray);
       v$d ta = this.a;
       if (ta.u != null) {
          Object[] objArray1 = new Object[i];
          a.D().w(str, "onDecorationTranslationFixed: scale or rotate is in process, pending translation fix", objArray1);
          p0.v = true;
          return;
       }else if(p0 != null){
          DecorationMoveEndAction uDecorationM = new DecorationMoveEndAction(p0.getLayerIndex(), false, true, p0.getMoveX(), p0.getMoveY(), this.a.b0().o0().w());
          ta.b0().t0(v8);
       }
       return;
    }
}
