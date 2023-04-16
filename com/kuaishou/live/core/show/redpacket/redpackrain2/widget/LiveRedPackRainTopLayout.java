package com.kuaishou.live.core.show.redpacket.redpackrain2.widget.LiveRedPackRainTopLayout;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.graphics.Matrix;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.utility.n;
import android.os.Build$VERSION;
import android.graphics.Canvas;
import android.view.View;

public class LiveRedPackRainTopLayout extends RelativeLayout	// class@000f32
{
    public Paint b;
    public Matrix c;
    public Shader d;
    public int e;
    public boolean f;

    public void LiveRedPackRainTopLayout(Context p0){
       super(p0, null);
    }
    public void LiveRedPackRainTopLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveRedPackRainTopLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       boolean b = false;
       this.f = b;
       if (PatchProxy.applyVoid(null, this, LiveRedPackRainTopLayout.class, "1")) {
       }else {
          this.setWillNotDraw(b);
          this.b = new Paint();
          LinearGradient linearGradie = new LinearGradient(0, 0, 0, 0x3f800000, 0xff000000, 0, Shader$TileMode.CLAMP);
          this.d = new Paint();
          this.b.setShader(new Paint());
          this.b.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
          this.c = new Matrix();
          this.e = n.c(a.a().a(), 45.00f);
          if (!PatchProxy.applyVoid(null, this, LiveRedPackRainTopLayout.class, "4") && this.b()) {
             this.setLayerType(2, null);
          }
       }
       return;
    }
    public void a(boolean p0){
       this.f = p0;
    }
    public final boolean b(){
       boolean b = (Build$VERSION.SDK_INT >= 23)? true: false;
       return b;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRedPackRainTopLayout.class, "2")) {
          return;
       }
       super.draw(p0);
       if (this.e <= null || (!this.b() || (this.f != null && !PatchProxy.applyVoidOneRefs(p0, this, LiveRedPackRainTopLayout.class, "3")))) {
          int top = this.getTop();
          LiveRedPackRainTopLayout te = this.e;
          this.c.setScale(0x3f800000, (float)te);
          float f = (float)0;
          this.c.postTranslate(f, (float)top);
          this.d.setLocalMatrix(this.c);
          this.b.setShader(this.d);
          p0.drawRect(f, 0, (float)this.getRight(), (float)(top + te), this.b);
       }
    label_0059 :
       return;
    }
}
