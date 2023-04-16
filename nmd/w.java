package nmd.w;
import java.lang.Runnable;
import nmd.v$d;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nmd.v;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElement;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import cq.a;
import java.lang.StringBuilder;
import q87.c;
import smd.d;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.UpdateSelectedLayerAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class w implements Runnable	// class@001e87
{
    public final v$d b;
    public final EditDecorationBaseDrawer c;

    public void w(v$d p0,EditDecorationBaseDrawer p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       if (this.b.a.g0()) {
          w tc = this.c;
          if (tc instanceof NewTagStickerElement || (!tc instanceof NewVoteStickerDrawer && !tc instanceof NewRelayStickerDrawer)) {
          label_0070 :
             tc = this.c;
             if (!tc instanceof NewTagStickerElement && (tc instanceof NewVoteStickerDrawer || tc instanceof NewRelayStickerDrawer)) {
                this.b.a.o0();
             }
             return;
          }
       }
       this.c.setAcceptTouchEvent(true);
       this.b.a.P().x0(this.c, false);
       Object[] objArray = new Object[false];
       a.D().w("StickerPreviewBaseViewBinder", "onAdd: UpdateSelectedLayerAction: "+this.c.getLayerIndex(), objArray);
       this.b.a.b0().t0(new UpdateSelectedLayerAction(this.c.getLayerIndex()));
       goto label_0070 ;
    }
}
