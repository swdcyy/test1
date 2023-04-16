package end.e$h;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import end.e;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextV3Element;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import wpc.k;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import a17.b$b;
import a17.b$a;
import hnd.f;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import zmd.a;
import uvc.a;
import xld.a;
import mod.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public final class e$h implements EditDecorationContainerView$b	// class@000dae
{
    public final e a;
    public final EditorDelegate b;

    public void e$h(e p0,EditorDelegate p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public boolean a(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e$h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof NewEditTextV3Element && !p0 instanceof NewEditStickerBaseDrawer) {
          return k.a(this, p0);
       }
       boolean b = true;
       if (p0.isSubtitle()) {
          if (this.b.H() == null && (this.a.h0() && (this.b.H() != EditorItemFunc.SUBTITLE_V2 || (this.a.u0() && p0.mIsSelected == null)))) {
          label_0064 :
             b = false;
          }
       }else if(this.b.H() == null && (!this.a.u0() || p0.mIsSelected != null)){
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
       a obj = PatchProxy.applyOneRefs(p0, this, e$h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.s0().o0();
       double d = obj.a().c();
       boolean b = false;
       obj = (p0 != null && (obj.C().f() && p0.getLayerIndex() != obj.o()))? 0: 1;
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
