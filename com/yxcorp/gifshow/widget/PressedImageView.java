package com.yxcorp.gifshow.widget.PressedImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.net.Uri;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import pb.d;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.DraweeView;
import pb.c;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.view.View;

public class PressedImageView extends KwaiImageView	// class@00189d
{
    public int x;
    public int y;

    public void PressedImageView(Context p0){
       super(p0, null);
    }
    public void PressedImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void PressedImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.x = 153;
       this.y = 153;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.l4);
       this.x = (int)(typedArray.getFloat(1, 0x3f19999a) * 0x437f0000);
       this.y = (int)(typedArray.getFloat(0, 0x3f19999a) * 0x437f0000);
       typedArray.recycle();
    }
    public ImageRequest C(Uri p0,int p1,int p2,boolean p3,b p4){
       if (PatchProxy.isSupport(PressedImageView.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Boolean.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, PressedImageView.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ImageRequest imageRequest = this.p0(this.K(p0, p1, p2, p3));
       this.setController(this.e0(p4, imageRequest).e());
       return imageRequest;
    }
    public ImageRequest h0(Uri p0,int p1,int p2,ImageRequest p3){
       if (PatchProxy.isSupport(PressedImageView.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, PressedImageView.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ImageRequest imageRequest = this.p0(this.J(p0, p1, p2));
       if (p3 != null) {
          d uod = Fresco.newDraweeControllerBuilder();
          uod.x(p3);
          uod.w(imageRequest);
          uod.y(this.getController());
          this.setController(uod.e());
       }
       return imageRequest;
    }
    public final ImageRequest p0(ImageRequest p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PressedImageView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ImageRequestBuilder.d(p0).a();
    }
    public void setDisableAlpha(float p0){
       this.y = (int)(p0 * 0x437f0000);
    }
    public void setEnabled(boolean p0){
       if (PatchProxy.isSupport(PressedImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PressedImageView.class, "2")) {
          return;
       }
       Drawable drawable = this.getDrawable();
       if (drawable != null) {
          int i = (p0)? 255: this.y;
          drawable.setAlpha(i);
       }
       super.setEnabled(p0);
       return;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(PressedImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PressedImageView.class, "1")) {
          return;
       }
       if (this.isEnabled()) {
          Drawable drawable = this.getDrawable();
          if (drawable != null) {
             PressedImageView tx = (p0)? this.x: 255;
             drawable.setAlpha(tx);
          }
       }
       super.setPressed(p0);
       return;
    }
    public void setPressedAlpha(float p0){
       this.x = (int)(p0 * 0x437f0000);
    }
}
