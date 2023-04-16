package com.kuaishou.live.core.show.sticker.widget.ImageStickerContainer;
import com.kuaishou.live.core.show.sticker.widget.BaseStickerContainer;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.sticker.model.StickerInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import i2b.a;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public class ImageStickerContainer extends BaseStickerContainer	// class@0010bd
{
    public KwaiImageView r;

    public void ImageStickerContainer(Context p0){
       super(p0, null);
    }
    public void ImageStickerContainer(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ImageStickerContainer(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, ImageStickerContainer.class, "1")) {
       }else {
          this.d(false);
          this.c(false);
       }
       return;
    }
    public static ImageStickerContainer h(Context p0,StickerInfo p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ImageStickerContainer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ImageStickerContainer.i(p0, p1, true);
    }
    public static ImageStickerContainer i(Context p0,StickerInfo p1,boolean p2){
       KwaiImageView obj;
       if (PatchProxy.isSupport(ImageStickerContainer.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, ImageStickerContainer.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ImageStickerContainer imageSticker = a.a(p0, R.layout.arg_RES_7f0d09d4);
       obj = imageSticker.findViewById(R.id.sticker_background);
       imageSticker.r = obj;
       obj.P(p1.mImageUrls);
       imageSticker.e(p2);
       imageSticker.setStickerInfo(p1);
       return imageSticker;
    }
}
