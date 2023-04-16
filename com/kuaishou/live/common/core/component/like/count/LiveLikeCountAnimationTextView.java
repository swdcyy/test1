package com.kuaishou.live.common.core.component.like.count.LiveLikeCountAnimationTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.TextPaint;
import android.widget.TextView;
import d61.f0;
import android.graphics.LinearGradient;
import lnc.a1;
import android.graphics.Shader$TileMode;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.Paint;

public class LiveLikeCountAnimationTextView extends AppCompatTextView	// class@001454
{
    public LinearGradient f;
    public Paint g;

    public void LiveLikeCountAnimationTextView(Context p0){
       super(p0, null);
    }
    public void LiveLikeCountAnimationTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveLikeCountAnimationTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveLikeCountAnimationTextView.class, "1")) {
       }else {
          this.g = this.getPaint();
          this.setAlpha(0x3f800000);
          this.setScaleX(0);
          this.setScaleY(0);
          f0.e(this);
          this.setIncludeFontPadding(false);
          this.setTextSize(1, 22.00f);
          LinearGradient linearGradie = new LinearGradient(0, 0, 0, (float)a1.e((float)0x7f0702e8), a1.a(0x7f060685), a1.a(0x7f060357), Shader$TileMode.CLAMP);
          this.f = 1;
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLikeCountAnimationTextView.class, "2")) {
          return;
       }
       this.g.setShader(null);
       this.setShadowLayer(0x3f800000, 0, 0x3f800000, a1.a(R.color.arg_RES_7f060199));
       super.onDraw(p0);
       this.g.clearShadowLayer();
       this.g.setShader(this.f);
       super.onDraw(p0);
       return;
    }
}
