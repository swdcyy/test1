package com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor$g;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor;
import xvc.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import mmd.b;
import mmd.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.StickerInitAction;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.UpdateStickerAttachInfoAction;

public final class NewStickerPicTemplateProcessor$g implements Runnable	// class@000a47
{
    public final NewStickerPicTemplateProcessor b;
    public final b c;

    public void NewStickerPicTemplateProcessor$g(NewStickerPicTemplateProcessor p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       NewStickerPicTemplateProcessor$g tb;
       if (PatchProxy.applyVoid(null, this, NewStickerPicTemplateProcessor$g.class, "1")) {
          return;
       }
       if (this.b.e.o0().A() == null) {
          tb = this.b;
          tb.e.t0(new StickerInitAction(tb.j()));
       }else {
          tb = this.b;
          tb.e.t0(new UpdateStickerAttachInfoAction(tb.j()));
       }
       this.b.e.t0(this.c);
       return;
    }
}
