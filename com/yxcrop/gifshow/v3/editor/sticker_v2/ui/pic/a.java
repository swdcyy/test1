package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.a;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerAtlasOrSinglePictureSubViewBinder$a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerAtlasOrSinglePictureSubViewBinder;

public final class a implements Runnable	// class@000ac7
{
    public final StickerAtlasOrSinglePictureSubViewBinder$a b;
    public final EditDecorationBaseDrawer c;

    public void a(StickerAtlasOrSinglePictureSubViewBinder$a p0,EditDecorationBaseDrawer p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.b.a.J(this.c);
       return;
    }
}
