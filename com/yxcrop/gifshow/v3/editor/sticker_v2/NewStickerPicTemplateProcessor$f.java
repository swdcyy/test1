package com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor$f;
import erd.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.pic.DiscardTemplateStickerAction;
import xvc.b;

public final class NewStickerPicTemplateProcessor$f implements a	// class@000a46
{
    public final NewStickerPicTemplateProcessor b;
    public final c c;

    public void NewStickerPicTemplateProcessor$f(NewStickerPicTemplateProcessor p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, NewStickerPicTemplateProcessor$f.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("StickerPicTemplateProcessorV2", "discard: ", objArray);
       this.b.m(this.c);
       this.b.l(new DiscardTemplateStickerAction());
       return;
    }
}
