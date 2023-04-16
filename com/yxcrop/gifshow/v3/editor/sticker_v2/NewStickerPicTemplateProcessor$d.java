package com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor$d;
import erd.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.pic.ClearTemplateStickerAction;
import xvc.b;

public final class NewStickerPicTemplateProcessor$d implements a	// class@000a44
{
    public final NewStickerPicTemplateProcessor b;
    public final String c;

    public void NewStickerPicTemplateProcessor$d(NewStickerPicTemplateProcessor p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, NewStickerPicTemplateProcessor$d.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("StickerPicTemplateProcessorV2", "clear: ", objArray);
       this.b.l(new ClearTemplateStickerAction(this.c));
       return;
    }
}
