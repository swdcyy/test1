package nmd.l0$b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import nmd.l0;
import smd.d;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextBaseElement;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import wpc.k;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import mmd.b;
import a17.b$b;
import a17.b$a;
import xld.a;
import uvc.a;
import java.util.List;
import mod.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public final class l0$b implements EditDecorationContainerView$b	// class@001e63
{
    public final l0 a;
    public final d b;

    public void l0$b(l0 p0,d p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public boolean a(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l0$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof NewEditTextBaseElement && !p0 instanceof NewEditStickerBaseDrawer) {
          return k.a(this, p0);
       }
       boolean b = true;
       if (p0.isSubtitle()) {
          if (this.a.p0().H() == null && (this.a.f0() && (this.a.p0().H() != EditorItemFunc.SUBTITLE_V2 || (this.a.s0() && p0.mIsSelected == null)))) {
          label_00a5 :
             b = false;
          }
       }else if(p0.isSticker()){
          if (this.a.p0().H() != null || (this.a.s0() && (p0.mIsSelected == null || this.b.o0().B()))) {
          }
       }else if(this.a.p0().H() == null && (!this.a.f0() && (!this.a.s0() || p0.mIsSelected != null))){
       }
       return b;
    }
    public boolean b(EditDecorationBaseDrawer p0){
       return true;
    }
    public void c(b$b p0,b$a p1){
       k.d(this, p0, p1);
    }
    public boolean d(EditDecorationBaseDrawer p0){
       b obj = PatchProxy.applyOneRefs(p0, this, l0$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.o0();
       double d = (obj.t())? obj.a().c() % ((double)obj.c().size() * 2.00f): obj.a().c();
       boolean b = false;
       obj = (p0 instanceof NewEditTextBaseElement || (p0 instanceof NewEditStickerBaseDrawer && (obj.y().f() && p0.getLayerIndex() != obj.o())))? 0: 1;
       if (EditDecorationContainerView.s0(p0, d) && obj) {
          b = true;
       }
       return b;
    }
    public boolean e(EditDecorationBaseDrawer p0){
       return k.b(this, p0);
    }
    public boolean f(EditDecorationBaseDrawer p0){
       return k.c(this, p0);
    }
}
