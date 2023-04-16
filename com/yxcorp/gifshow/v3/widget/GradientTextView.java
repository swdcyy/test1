package com.yxcorp.gifshow.v3.widget.GradientTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import java.lang.String;
import android.graphics.Typeface;
import ekd.d0;
import android.widget.TextView;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.text.TextPaint;
import java.lang.CharSequence;
import android.graphics.Paint;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import java.lang.RuntimeException;

public class GradientTextView extends AppCompatTextView	// class@00164d
{
    public LinearGradient f;
    public Paint g;
    public int h;
    public int i;
    public Rect j;
    public int[] k;
    public boolean l;

    public void GradientTextView(Context p0){
       super(p0, null);
    }
    public void GradientTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.h = 0;
       this.i = 0;
       this.j = new Rect();
       this.k = new int[2]{0xfff8eba4,0xfff6c372};
       this.setTypeface(d0.a("alte-din.ttf", p0));
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GradientTextView.class, "1")) {
          return;
       }
       this.i = (this.l != null)? this.getMeasuredHeight(): this.getMeasuredWidth();
       this.g = this.getPaint();
       String str = this.getText().toString();
       this.g.getTextBounds(str, 0, str.length(), this.j);
       LinearGradient linearGradie = new LinearGradient(0, 0, (float)this.h, (float)this.i, this.k, null, Shader$TileMode.CLAMP);
       this.f = v1;
       this.g.setShader(v1);
       p0.drawText(str, (float)((this.getMeasuredWidth() / 2) - (this.j.width() / 2)), (float)((this.getMeasuredHeight() / 2) + (this.j.height() / 2)), this.g);
       return;
    }
    public void setColorList(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GradientTextView.class, "2")) {
          return;
       }
       if (p0 != null && p0.length < 2) {
          throw new RuntimeException("ColorList\'s length must be > 2");
       }
       this.k = p0;
       return;
    }
    public void setVertail(boolean p0){
       this.l = p0;
    }
}
