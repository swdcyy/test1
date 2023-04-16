package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerLongPictureSubViewBinder$c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerLongPictureSubViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.widget.AbsoluteLayout;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerLongPictureSubViewBinder$c$a;
import java.lang.Runnable;

public final class StickerLongPictureSubViewBinder$c implements ViewTreeObserver$OnGlobalLayoutListener	// class@000ab9
{
    public final StickerLongPictureSubViewBinder b;

    public void StickerLongPictureSubViewBinder$c(StickerLongPictureSubViewBinder p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, StickerLongPictureSubViewBinder$c.class, "1")) {
          return;
       }
       this.b.e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.b.e.post(new StickerLongPictureSubViewBinder$c$a(this));
       return;
    }
}
