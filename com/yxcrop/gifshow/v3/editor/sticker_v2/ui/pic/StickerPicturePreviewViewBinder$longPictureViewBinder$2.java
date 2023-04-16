package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerPicturePreviewViewBinder$longPictureViewBinder$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerPicturePreviewViewBinder;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerLongPictureSubViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lwc.h;
import nmd.v;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;

public final class StickerPicturePreviewViewBinder$longPictureViewBinder$2 extends Lambda implements a	// class@000ac4
{
    public final Fragment $fragment;
    public final View $rootView;
    public final StickerPicturePreviewViewBinder this$0;

    public void StickerPicturePreviewViewBinder$longPictureViewBinder$2(StickerPicturePreviewViewBinder p0,View p1,Fragment p2){
       this.this$0 = p0;
       this.$rootView = p1;
       this.$fragment = p2;
       super(0);
    }
    public final StickerLongPictureSubViewBinder invoke(){
       Object obj = PatchProxy.apply(null, this, StickerPicturePreviewViewBinder$longPictureViewBinder$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       StickerPicturePreviewViewBinder$longPictureViewBinder$2 tthis$0 = this.this$0;
       return new StickerLongPictureSubViewBinder(this.$rootView, this.$fragment, tthis$0.R, tthis$0.X());
    }
    public Object invoke(){
       return this.invoke();
    }
}
