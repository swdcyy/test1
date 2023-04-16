package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerPicturePreviewViewBinder$d;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerPicturePreviewViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.EditorManager$b;
import com.yxcorp.gifshow.v3.EditorManager;

public final class StickerPicturePreviewViewBinder$d implements Runnable	// class@000ac2
{
    public final StickerPicturePreviewViewBinder b;

    public void StickerPicturePreviewViewBinder$d(StickerPicturePreviewViewBinder p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, StickerPicturePreviewViewBinder$d.class, "1")) {
          return;
       }
       StickerPicturePreviewViewBinder$d tb = this.b;
       StickerPicturePreviewViewBinder n = tb.N;
       if (n != null) {
          n.f(tb.Q);
       }
       return;
    }
}
