package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerPicturePreviewViewBinder$e;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.c$a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerPicturePreviewViewBinder;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import nmd.v;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerPicturePreviewViewBinder$a;

public final class StickerPicturePreviewViewBinder$e implements c$a	// class@000ac3
{
    public final StickerPicturePreviewViewBinder a;

    public void StickerPicturePreviewViewBinder$e(StickerPicturePreviewViewBinder p0){
       this.a = p0;
       super();
    }
    public final void b(StickerDetailInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerPicturePreviewViewBinder$e.class, "1")) {
          return;
       }
       a.o(p0, "stickerDetailInfo");
       int i = 0x7f11066a;
       if (!p0.isTagSticker() && (p0.isInteractiveSticker() && this.a.c0())) {
          i.d(i, a1.p(R.string.arg_RES_7f1016e1));
          return;
       }else if(p0.isTagSticker() && this.a.d0()){
          i.d(i, a1.p(R.string.arg_RES_7f104beb));
          return;
       }else {
          StickerPicturePreviewViewBinder m = this.a.M;
          if (!m instanceof StickerPicturePreviewViewBinder$a) {
             m = null;
          }
          if (m != null) {
             m.b(p0);
          }
          return;
       }
    }
}
