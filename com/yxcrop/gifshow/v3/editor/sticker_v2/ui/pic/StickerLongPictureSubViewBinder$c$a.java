package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerLongPictureSubViewBinder$c$a;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerLongPictureSubViewBinder$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerLongPictureSubViewBinder;
import java.util.List;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;

public final class StickerLongPictureSubViewBinder$c$a implements Runnable	// class@000ab8
{
    public final StickerLongPictureSubViewBinder$c b;

    public void StickerLongPictureSubViewBinder$c$a(StickerLongPictureSubViewBinder$c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, StickerLongPictureSubViewBinder$c$a.class, "1")) {
          return;
       }
       List decorationDr = this.b.b.e.getDecorationDrawerList();
       a.o(decorationDr, "mContainerView.decorationDrawerList");
       Iterator iterator = decorationDr.iterator();
       while (iterator.hasNext()) {
          iterator.next().changeDrawerVisible(true);
       }
       return;
    }
}
