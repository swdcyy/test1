package com.kuaishou.commercial.splash.view.CommercialRoundRectImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Path;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.graphics.Path$Direction;

public class CommercialRoundRectImageView extends KwaiImageView	// class@00162d
{
    public float A;
    public final RectF B;
    public final Path C;
    public float x;
    public float y;
    public float z;

    public void CommercialRoundRectImageView(Context p0){
       super(p0);
       this.x = 0;
       this.y = 0;
       this.z = 0;
       this.A = 0;
       this.B = new RectF();
       this.C = new Path();
    }
    public void CommercialRoundRectImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void CommercialRoundRectImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.x = 0;
       this.y = 0;
       this.z = 0;
       this.A = 0;
       this.B = new RectF();
       this.C = new Path();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.V);
       this.x = (float)typedArray.getDimensionPixelOffset(1, 0);
       this.y = (float)typedArray.getDimensionPixelOffset(3, 0);
       this.z = (float)typedArray.getDimensionPixelOffset(0, 0);
       this.A = (float)typedArray.getDimensionPixelOffset(2, 0);
    }
    public void onDraw(Canvas p0){
       CommercialRoundRectImageView tx;
       if (PatchProxy.applyVoidOneRefs(p0, this, CommercialRoundRectImageView.class, "1")) {
          return;
       }
       this.B.set(0, 0, (float)this.getWidth(), (float)this.getHeight());
       this.C.reset();
       float[] uofloatArray = new float[]{tx,tx,tx,tx,tx,tx,tx,tx};
       tx = this.x;
       tx = this.y;
       tx = this.z;
       tx = this.A;
       this.C.addRoundRect(this.B, uofloatArray, Path$Direction.CW);
       p0.clipPath(this.C);
       super.onDraw(p0);
       return;
    }
}
