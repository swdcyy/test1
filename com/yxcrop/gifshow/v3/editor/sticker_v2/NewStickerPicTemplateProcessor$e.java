package com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor$e;
import erd.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.pic.SaveTemplateStickerAction;
import xvc.b;

public final class NewStickerPicTemplateProcessor$e implements a	// class@000a45
{
    public final NewStickerPicTemplateProcessor b;
    public final c c;

    public void NewStickerPicTemplateProcessor$e(NewStickerPicTemplateProcessor p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, NewStickerPicTemplateProcessor$e.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("StickerPicTemplateProcessorV2", "commit: ", objArray);
       this.b.m(this.c);
       this.b.l(new SaveTemplateStickerAction());
       return;
    }
}
