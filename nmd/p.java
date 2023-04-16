package nmd.p;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerFrameChangeViewBinder;
import mmd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Rect;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import faa.a;
import q87.c;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.UpdateStickerAttachInfoAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import java.lang.StringBuilder;

public final class p implements Runnable	// class@001e69
{
    public final StickerFrameChangeViewBinder b;
    public final a c;

    public void p(StickerFrameChangeViewBinder p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       this.c.f(this.b.e.getEditorRect().width());
       int i = 0;
       String str = "StickerFrameChangeViewBinder";
       if (this.c.c() > 0) {
          objArray = new Object[i];
          a.D().w(str, "updateStickerAttachInfo: handleAction UpdateStickerAttachInfoAction", objArray);
          this.b.f.t0(new UpdateStickerAttachInfoAction(this.c));
       }else {
          objArray = new Object[i];
          a.D().A(str, "updateStickerAttachInfo: newAttachInfo.containerWidth = "+this.c.c(), objArray);
       }
       return;
    }
}
