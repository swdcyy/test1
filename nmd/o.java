package nmd.o;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerFrameChangeViewBinder;
import mmd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.UpdateStickerAttachInfoAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class o implements Runnable	// class@001e68
{
    public final StickerFrameChangeViewBinder b;
    public final a c;

    public void o(StickerFrameChangeViewBinder p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.b.f.t0(new UpdateStickerAttachInfoAction(this.c));
       return;
    }
}
