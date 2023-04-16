package com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElement$b;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElement;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerLayout;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElementData;
import com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerLayout;

public final class NewTagStickerElement$b implements Runnable	// class@000a85
{
    public final NewTagStickerElement b;
    public final NewStickerElementData c;

    public void NewTagStickerElement$b(NewTagStickerElement p0,NewStickerElementData p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, NewTagStickerElement$b.class, "1")) {
          return;
       }
       NewTagStickerElement.access$getMStickerView$p(this.b).f(this.c.S0());
       return;
    }
}
