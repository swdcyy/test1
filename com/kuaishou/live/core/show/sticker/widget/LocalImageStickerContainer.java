package com.kuaishou.live.core.show.sticker.widget.LocalImageStickerContainer;
import ml8.d;
import com.kuaishou.live.core.show.sticker.widget.ImageStickerContainer;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.sticker.widget.BaseStickerContainer;
import com.kuaishou.live.core.show.sticker.model.StickerInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import i2b.a;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.util.List;

public class LocalImageStickerContainer extends ImageStickerContainer implements d	// class@0010be
{
    public KwaiImageView s;

    public void LocalImageStickerContainer(Context p0){
       super(p0, null);
    }
    public void LocalImageStickerContainer(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LocalImageStickerContainer(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LocalImageStickerContainer.class, "1")) {
       }else {
          this.c(false);
          this.d(true);
       }
       return;
    }
    public static LocalImageStickerContainer j(Context p0,StickerInfo p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, LocalImageStickerContainer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LocalImageStickerContainer.k(p0, p1, true);
    }
    public static LocalImageStickerContainer k(Context p0,StickerInfo p1,boolean p2){
       if (PatchProxy.isSupport(LocalImageStickerContainer.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, LocalImageStickerContainer.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       LocalImageStickerContainer localImageSt = a.a(p0, R.layout.arg_RES_7f0d09d5);
       localImageSt.e(p2);
       localImageSt.setStickerInfo(p1);
       return localImageSt;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalImageStickerContainer.class, "5")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a3b60);
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LocalImageStickerContainer.class, "4")) {
          return;
       }
       super.onAttachedToWindow();
       this.doBindView(this);
       if (!TextUtils.x(this.getStickInfo().mLocalPath)) {
          this.s.v(new File(this.getStickInfo().mLocalPath), 0, 0);
       }else {
          this.s.P(this.getStickInfo().mImageUrls);
       }
       return;
    }
}
