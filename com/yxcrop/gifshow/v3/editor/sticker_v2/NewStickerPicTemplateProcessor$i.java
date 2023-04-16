package com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor$i;
import erd.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.pic.PicTemplateStartAction;
import xvc.b;
import com.kuaishou.edit.draft.Workspace$Type;
import eba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import qsc.a;

public final class NewStickerPicTemplateProcessor$i implements a	// class@000a49
{
    public final NewStickerPicTemplateProcessor b;
    public final c c;

    public void NewStickerPicTemplateProcessor$i(NewStickerPicTemplateProcessor p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, NewStickerPicTemplateProcessor$i.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("StickerPicTemplateProcessorV2", "start: ", objArray);
       this.b.l(new PicTemplateStartAction());
       if (this.c.a1() == Workspace$Type.SINGLE_PICTURE) {
          this.b.g(this.c.U0());
       }
       this.b.i(this.c.U0());
       return;
    }
}
