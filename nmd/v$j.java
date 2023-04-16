package nmd.v$j;
import java.lang.Runnable;
import nmd.v;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import smd.d;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.action.GenerateInteractStickerFileAction;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import java.util.List;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;
import rmd.c;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import mmd.b;
import xvc.b;

public final class v$j implements Runnable	// class@001e82
{
    public final v b;
    public final EditDecorationBaseDrawer c;
    public final int d;

    public void v$j(v p0,EditDecorationBaseDrawer p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, v$j.class, "1")) {
          return;
       }
       v$j tc = this.c;
       v$j oj = tc;
       GenerateInteractStickerFileAction generateInte = new GenerateInteractStickerFileAction(oj, this.b.N(tc.getAttachIdentifierList()), this.b.L(this.c.getAttachIdentifierList()), this.d, this.b.g0(), c.d(this.c.getElementData(), c.a.b(this.c.getEditStickerType(), this.c.getEditStickerSubType()), (float)this.d), this.b.b0().o0().w());
       this.b.b0().t0(v9);
       return;
    }
}
