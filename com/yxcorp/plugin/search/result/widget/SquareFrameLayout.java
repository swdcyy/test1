package com.yxcorp.plugin.search.result.widget.SquareFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout$LayoutParams;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import lnc.a1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import com.facebook.drawee.generic.RoundingParams;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import android.graphics.Typeface;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;

public class SquareFrameLayout extends FrameLayout	// class@000764
{
    public int b;
    public AppCompatTextView c;
    public KwaiImageView d;
    public boolean e;

    public void SquareFrameLayout(Context p0){
       super(p0);
       this.b = 1;
       this.a(p0);
    }
    public void SquareFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 1;
       this.a(p0);
    }
    public void SquareFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 1;
       this.a(p0);
    }
    public final void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SquareFrameLayout.class, "1")) {
          return;
       }
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
       layoutParams.gravity = 17;
       AppCompatTextView uAppCompatTe = new AppCompatTextView(p0);
       this.c = uAppCompatTe;
       uAppCompatTe.setLayoutParams(layoutParams);
       this.c.setTextSize(15.00f);
       this.c.setTextColor(ContextCompat.getColor(p0, R.color.arg_RES_7f0607de));
       layoutParams = new FrameLayout$LayoutParams(a1.e(26.00f), a1.e(14.00f));
       layoutParams.gravity = 5;
       KwaiImageView kwaiImageVie = new KwaiImageView(p0);
       this.d = kwaiImageVie;
       kwaiImageVie.setLayoutParams(layoutParams);
       this.d.setVisibility(8);
       RoundingParams roundingPara = new RoundingParams();
       float f = (float)a1.e(4.00f);
       roundingPara.m(0, f, 0, f);
       this.d.getHierarchy().L(roundingPara);
       GradientDrawable gradientDraw = new GradientDrawable();
       gradientDraw.setColor(ContextCompat.getColor(p0, R.color.arg_RES_7f0608ba));
       gradientDraw.setCornerRadius(f);
       this.setBackground(gradientDraw);
       this.addView(this.c);
       this.addView(this.d);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(SquareFrameLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, SquareFrameLayout.class, "3")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (this.e == null) {
          FrameLayout$LayoutParams layoutParams = this.d.getLayoutParams();
          p1 = (int)(((double)(this.getMeasuredWidth() * 23) * 0x3ff0000000000000) / 48.00f);
          layoutParams.width = p1;
          layoutParams.height = (int)(((double)(p1 * 14) * 0x3ff0000000000000) / 26.00f);
          this.d.setLayoutParams(layoutParams);
          this.e = true;
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(SquareFrameLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SquareFrameLayout.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       p0 = this.getMeasuredWidth();
       int i = View$MeasureSpec.makeMeasureSpec(p0, 0x40000000);
       this.setMeasuredDimension(View$MeasureSpec.getSize(i), View$MeasureSpec.getSize(View$MeasureSpec.makeMeasureSpec((p0 * this.b), 0x40000000)));
       return;
    }
    public void setFontFamily(Typeface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SquareFrameLayout.class, "7")) {
          return;
       }
       this.c.setTypeface(p0);
       return;
    }
    public void setImageCdnUrl(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SquareFrameLayout.class, "6")) {
          return;
       }
       this.d.setVisibility(0);
       this.d.U(p0);
       return;
    }
    public void setImageUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SquareFrameLayout.class, "5")) {
          return;
       }
       this.d.setVisibility(0);
       this.d.L(p0);
       return;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SquareFrameLayout.class, "4")) {
          return;
       }
       this.c.setText(p0);
       return;
    }
}
