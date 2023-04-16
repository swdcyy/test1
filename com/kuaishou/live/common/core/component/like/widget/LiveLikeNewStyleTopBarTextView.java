package com.kuaishou.live.common.core.component.like.widget.LiveLikeNewStyleTopBarTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.text.TextPaint;
import android.widget.TextView;
import android.graphics.Paint$FontMetrics;
import android.graphics.Paint;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Shader;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import android.view.View;
import android.graphics.LinearGradient;
import android.graphics.Color;
import android.graphics.Shader$TileMode;

public class LiveLikeNewStyleTopBarTextView extends AppCompatTextView	// class@00147e
{
    public LinearGradient f;
    public Paint g;
    public String h;
    public Paint$FontMetrics i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;

    public void LiveLikeNewStyleTopBarTextView(Context p0){
       super(p0, null);
    }
    public void LiveLikeNewStyleTopBarTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveLikeNewStyleTopBarTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       TextPaint paint = this.getPaint();
       this.g = paint;
       this.i = paint.getFontMetrics();
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLikeNewStyleTopBarTextView.class, "2")) {
          return;
       }
       this.g.setShader(this.f);
       if (!TextUtils.isEmpty(this.h)) {
          p0.drawText(this.h, this.n, this.l, this.g);
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveLikeNewStyleTopBarTextView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveLikeNewStyleTopBarTextView.class, "1")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       LinearGradient linearGradie = new LinearGradient(0, 0, (float)this.getMeasuredWidth(), 0, Color.parseColor("#FF9933"), Color.parseColor("#FF429D"), Shader$TileMode.REPEAT);
       this.f = p0;
       if (this.getText() != null) {
          this.h = this.getText().toString();
          LiveLikeNewStyleTopBarTextView ti = this.i;
          this.j = ti.top;
          this.k = ti.bottom;
          LiveLikeNewStyleTopBarTextView tk = this.k;
          this.l = (float)(this.getHeight() / 2) + (((tk - this.j) / 2.00f) - tk);
          this.m = this.g.measureText(this.h);
          this.n = (float)(this.getWidth() / 2) - (this.m / 2.00f);
       }
       return;
    }
}
