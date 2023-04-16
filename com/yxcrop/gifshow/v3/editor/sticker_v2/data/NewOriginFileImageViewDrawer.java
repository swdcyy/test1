package com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewOriginFileImageViewDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewOriginFileDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.io.File;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import qkd.b;
import android.graphics.Bitmap;
import com.kwai.imsdk.internal.util.a;
import android.view.View;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.kwai.robust.PatchProxyResult;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import android.widget.AbsoluteLayout$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;

public final class NewOriginFileImageViewDrawer extends NewOriginFileDrawer	// class@000a69
{
    public KwaiImageView c;

    public void NewOriginFileImageViewDrawer(NewStickerElementData p0){
       a.p(p0, "elementData");
       super(p0);
    }
    public void generateDecorationBitmap(){
       if (PatchProxy.applyVoid(null, this, NewOriginFileImageViewDrawer.class, "3")) {
          return;
       }
       if (b.S(new File(this.mBaseDrawerData.k()))) {
          float f = (float)0;
          if (this.mBaseDrawerData.i() - f > 0 && this.mBaseDrawerData.f() - f > 0) {
             this.mDecorationBitmap = a.a(this.mBaseDrawerData.k(), (int)this.mBaseDrawerData.i(), (int)this.mBaseDrawerData.f(), true);
          }else {
          label_005b :
             BaseDrawer tmDecoration = this.mDecorationShowingView;
             String str = "mDecorationShowingView";
             a.o(tmDecoration, str);
             if (tmDecoration.getWidth() > 0) {
                tmDecoration = this.mDecorationShowingView;
                a.o(tmDecoration, str);
                if (tmDecoration.getHeight() > 0) {
                   tmDecoration = this.mDecorationShowingView;
                   a.o(tmDecoration, str);
                   BaseDrawer tmDecoration1 = this.mDecorationShowingView;
                   a.o(tmDecoration1, str);
                   int height = tmDecoration1.getHeight();
                   Bitmap uBitmap = Bitmap.createBitmap(tmDecoration.getWidth(), height, Bitmap$Config.ARGB_8888);
                   BaseDrawer tmDecoration2 = this.mDecorationShowingView;
                   a.m(tmDecoration2);
                   tmDecoration2.draw(new Canvas(uBitmap));
                   this.mDecorationBitmap = uBitmap;
                }
             }
          }
       }else {
          goto label_005b ;
       }
       return;
    }
    public View initView(DecorationContainerView p0){
       AbsoluteLayout$LayoutParams obj = PatchProxy.applyOneRefs(p0, this, NewOriginFileImageViewDrawer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "decorationContainerView");
       this.setContainerView(p0);
       obj = new AbsoluteLayout$LayoutParams((int)this.mBaseDrawerData.i(), (int)this.mBaseDrawerData.f(), 0, 0);
       KwaiImageView kwaiImageVie = new KwaiImageView(p0.getContext());
       this.c = kwaiImageVie;
       kwaiImageVie.v(new File(this.mBaseDrawerData.k()), (int)this.mBaseDrawerData.i(), (int)this.mBaseDrawerData.f());
       NewOriginFileImageViewDrawer tc = this.c;
       if (tc == null) {
          a.S("mStickerView");
       }
       tc.setLayoutParams(obj);
       tc = this.c;
       if (tc == null) {
          a.S("mStickerView");
       }
       return tc;
    }
    public void updateView(EditDecorationContainerViewV2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewOriginFileImageViewDrawer.class, "2")) {
          return;
       }
       a.p(p0, "decorationContainerView");
       AbsoluteLayout$LayoutParams layoutParams = new AbsoluteLayout$LayoutParams((int)this.mBaseDrawerData.i(), (int)this.mBaseDrawerData.f(), 0, 0);
       NewOriginFileImageViewDrawer tc = this.c;
       if (tc == null) {
          a.S("mStickerView");
       }
       tc.setLayoutParams(layoutParams);
       NewOriginFileImageViewDrawer tc1 = this.c;
       if (tc1 == null) {
          a.S("mStickerView");
       }
       tc1.invalidate();
       return;
    }
}
