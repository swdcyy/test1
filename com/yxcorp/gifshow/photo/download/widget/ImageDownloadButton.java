package com.yxcorp.gifshow.photo.download.widget.ImageDownloadButton;
import androidx.appcompat.widget.AppCompatButton;
import com.yxcorp.gifshow.photo.download.widget.ImageDownloadButton$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.graphics.drawable.GradientDrawable;
import android.graphics.Rect;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.res.Resources;
import android.util.StateSet;
import android.content.res.ColorStateList;
import ywb.e;
import java.lang.Throwable;
import q87.c;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.graphics.Canvas;
import android.widget.TextView;
import java.lang.Integer;
import android.view.View;
import ekd.n1;

public final class ImageDownloadButton extends AppCompatButton	// class@000f3d
{
    public int d;
    public final GradientDrawable e;
    public final GradientDrawable f;
    public final GradientDrawable g;
    public final Rect h;
    public static final ImageDownloadButton$a i;

    static {
       ImageDownloadButton.i = new ImageDownloadButton$a(null);
    }
    public void ImageDownloadButton(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void ImageDownloadButton(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void ImageDownloadButton(Context p0,AttributeSet p1,int p2){
       int[] ointArray2;
       a.p(p0, "context");
       super(p0, p1, p2);
       GradientDrawable gradientDraw = new GradientDrawable();
       this.e = gradientDraw;
       this.f = new GradientDrawable();
       this.g = new GradientDrawable();
       this.h = new Rect();
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ImageDownloadButton.class, "1")) {
       }else {
          int color = p0.getResources().getColor(R.color.arg_RES_7f0604ba);
          int color1 = p0.getResources().getColor(R.color.arg_RES_7f060acc);
          int[][] ointArray = new int[][2]{ointArray2,StateSet.WILD_CARD};
          int[] ointArray1 = new int[]{p0.getResources().getColor(0x7f0604c6),p0.getResources().getColor(0x7f060751)};
          ointArray2 = new int[]{0x10100a7};
          gradientDraw.setColor(new ColorStateList(ointArray, ointArray1));
          this.g.setColor(color);
          this.f.setColor(color1);
          this.setBackground(this.e);
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageDownloadButton.class, "3")) {
          return;
       }
       a.p(p0, "canvas");
       ImageDownloadButton td = this.d;
       if (td >= null) {
          float f = 100.00f;
          if ((float)td - f < 0) {
             p0.save();
             this.h.set(0, 0, (int)((float)this.getMeasuredWidth() * ((float)this.d / f)), this.getMeasuredHeight());
             p0.clipRect(this.h);
             this.g.draw(p0);
             p0.restore();
          }
       }
       super.onDraw(p0);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ImageDownloadButton.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ImageDownloadButton.class, "2")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       float f = (float)n1.d(this.getMeasuredHeight());
       this.e.setCornerRadius(f);
       this.f.setCornerRadius(f);
       this.g.setCornerRadius(f);
       this.g.setBounds(0, 0, p0, p1);
       return;
    }
    public final void setStatus(int p0){
       ImageDownloadButton te;
       if (PatchProxy.isSupport(ImageDownloadButton.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ImageDownloadButton.class, "4")) {
          return;
       }
       this.d = p0;
       if ((float)p0 - 0x42c80000 >= 0) {
          this.setBackground(this.f);
       }else if(p0 < 0){
          te = this.e;
       }else {
          te = this.f;
       }
       this.setBackground(te);
       this.invalidate();
       return;
    }
}
