package com.kuaishou.post.story.widget.PureTextBackgroundView;
import android.view.View;
import android.content.Context;
import android.graphics.Paint;
import lq4.a;
import jq4.a;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import rp4.n;
import android.graphics.Shader;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;

public class PureTextBackgroundView extends View	// class@000b88
{
    public Paint b;
    public LinearGradient c;
    public a d;

    public void PureTextBackgroundView(Context p0){
       super(p0);
       this.b = new Paint();
       this.d = a.d.e();
       this.b.setAntiAlias(true);
       this.b.setDither(true);
       this.b.setSubpixelText(true);
       this.b.setStyle(Paint$Style.FILL);
    }
    public void PureTextBackgroundView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new Paint();
       this.d = a.d.e();
       this.b.setAntiAlias(true);
       this.b.setDither(true);
       this.b.setSubpixelText(true);
       this.b.setStyle(Paint$Style.FILL);
    }
    public void PureTextBackgroundView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new Paint();
       this.d = a.d.e();
       this.b.setAntiAlias(true);
       this.b.setDither(true);
       this.b.setSubpixelText(true);
       this.b.setStyle(Paint$Style.FILL);
    }
    public Bitmap a(int p0,int p1){
       Bitmap obj;
       if (PatchProxy.isSupport(PureTextBackgroundView.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, PureTextBackgroundView.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int width = this.getWidth();
       int height = this.getHeight();
       if (width <= 0 || height <= 0) {
          if (p0 <= 0 || p1 <= 0) {
             return null;
          }
       }else {
          p0 = width;
          p1 = height;
       }
       obj = Bitmap.createBitmap(p0, p1, Bitmap$Config.ARGB_8888);
       this.b.setShader(n.b(p0, p1, this.d));
       new Canvas(obj).drawRect(0, 0, (float)p0, (float)p1, this.b);
       return obj;
    }
    public a getBackgroundColorData(){
       return this.d;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PureTextBackgroundView.class, "2")) {
          return;
       }
       super.onDraw(p0);
       if (this.c == null) {
          LinearGradient linearGradie = n.c(this, this.d);
          this.c = linearGradie;
          this.b.setShader(linearGradie);
       }
       p0.drawRect(0, 0, (float)this.getWidth(), (float)this.getHeight(), this.b);
       return;
    }
    public void setBackgroundColorData(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PureTextBackgroundView.class, "1")) {
          return;
       }
       this.d = p0;
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("PureTextBackgroundView", "setBackgroundColorData mBackgroundColorData:"+this.d, objArray);
       if (this.getWidth() && this.getHeight()) {
          LinearGradient linearGradie = n.c(this, this.d);
          this.c = linearGradie;
          this.b.setShader(linearGradie);
       }else {
          this.c = null;
          Object[] objArray1 = new Object[i];
          a.D().w("PureTextBackgroundView", "setBackgroundColorData layout invalid", objArray1);
       }
       this.invalidate();
       return;
    }
}
