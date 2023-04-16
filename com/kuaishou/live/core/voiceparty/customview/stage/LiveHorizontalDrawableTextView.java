package com.kuaishou.live.core.voiceparty.customview.stage.LiveHorizontalDrawableTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import lnc.a1;
import androidx.core.graphics.drawable.a;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.TextPaint;
import java.lang.CharSequence;

public class LiveHorizontalDrawableTextView extends AppCompatTextView	// class@0014c8
{

    public void LiveHorizontalDrawableTextView(Context p0){
       super(p0, null, 0);
    }
    public void LiveHorizontalDrawableTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveHorizontalDrawableTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.E2);
       int i = 0;
       ColorStateList colorStateLi = typedArray.getColorStateList(i);
       object oobject = this.getCompoundDrawables()[i];
       int dimensionPix = typedArray.getDimensionPixelSize(2, a1.e(16.00f));
       int dimensionPix1 = typedArray.getDimensionPixelSize(1, a1.e(16.00f));
       if (oobject != null && colorStateLi != null) {
          oobject.setBounds(i, i, dimensionPix, dimensionPix1);
          oobject = a.r(oobject);
          a.o(oobject, colorStateLi);
       }
       if (oobject != null) {
          this.setCompoundDrawables(oobject, null, null, null);
       }
       typedArray.recycle();
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHorizontalDrawableTextView.class, "1")) {
          return;
       }
       object oobject = this.getCompoundDrawables()[0];
       if (oobject != null) {
          p0.translate((((float)this.getWidth() - (float)(((int)this.getPaint().measureText(this.getText().toString()) + this.getCompoundDrawablePadding()) + oobject.getIntrinsicWidth())) / 2.00f), 0);
       }
       super.onDraw(p0);
       return;
    }
}
