package com.yxcorp.gifshow.widget.rank.TopUserView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.lang.Integer;
import android.view.View;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.content.res.Resources;
import android.graphics.BitmapFactory;

public class TopUserView extends KwaiImageView	// class@0019a9
{
    public boolean A;
    public Matrix x;
    public Paint y;
    public Bitmap z;

    public void TopUserView(Context p0){
       super(p0);
       this.A = true;
       this.p0();
    }
    public void TopUserView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.A = true;
       this.p0();
    }
    public void TopUserView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.A = true;
       this.p0();
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TopUserView.class, "3")) {
          return;
       }
       super.onDraw(p0);
       if (this.A != null) {
          this.setLayerType(2, null);
          p0.drawColor(0);
          p0.drawBitmap(this.z, this.x, this.y);
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(TopUserView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, TopUserView.class, "2")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.x.reset();
       float f = (float)p0 * 0x3f800000;
       float f1 = f / (float)this.z.getWidth();
       this.x.setScale(f1, (f / (float)this.z.getWidth()));
       return;
    }
    public final void p0(){
       if (PatchProxy.applyVoid(null, this, TopUserView.class, "1")) {
          return;
       }
       this.x = new Matrix();
       Paint paint = new Paint(1);
       this.y = paint;
       paint.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_IN));
       this.z = BitmapFactory.decodeResource(this.getResources(), 0x7f0823e0);
       return;
    }
    public void setNeedMask(boolean p0){
       this.A = p0;
    }
}
