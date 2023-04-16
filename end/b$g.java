package end.b$g;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import end.b;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement;
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
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public final class b$g implements EditDecorationContainerView$b	// class@000da2
{
    public final b a;
    public final EditorDelegate b;

    public void b$g(b p0,EditorDelegate p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public boolean a(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof NewEditTextElement && !p0 instanceof NewEditStickerBaseDrawer) {
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
       Object obj = PatchProxy.applyOneRefs(p0, this, b$g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return EditDecorationContainerView.s0(p0, this.a.s0().o0().a().c());
    }
    public boolean e(EditDecorationBaseDrawer p0){
       return k.b(this, p0);
    }
    public boolean f(EditDecorationBaseDrawer p0){
       return k.c(this, p0);
    }
}
