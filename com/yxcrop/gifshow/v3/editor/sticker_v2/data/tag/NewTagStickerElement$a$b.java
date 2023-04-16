package com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElement$a$b;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElement$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElement;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import umd.b;

public final class NewTagStickerElement$a$b implements Runnable	// class@000a83
{
    public final NewTagStickerElement$a b;
    public final String c;

    public void NewTagStickerElement$a$b(NewTagStickerElement$a p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, NewTagStickerElement$a$b.class, "1")) {
          return;
       }
       this.b.a.textChangeListener.a(null, CollectionsKt__CollectionsKt.E(), this.c, 3);
       return;
    }
}
