package com.yxcorp.gifshow.corona.common.widget.CommonPanelBackgroundView;
import android.view.View;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;

public class CommonPanelBackgroundView extends View	// class@00127c
{
    public float[] b;
    public int[] c;
    public final Paint d;
    public LinearGradient e;
    public int f;
    public int g;

    public void CommonPanelBackgroundView(Context p0){
       super(p0);
       this.d = new Paint();
       this.a();
    }
    public void CommonPanelBackgroundView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = new Paint();
       this.a();
    }
    public void CommonPanelBackgroundView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = new Paint();
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, CommonPanelBackgroundView.class, "1")) {
          return;
       }
       this.setWillNotDraw(false);
       return;
    }
    public void b(float[] p0,int[] p1){
       this.b = p0;
       this.c = p1;
    }
    public void onDraw(Canvas p0){
       int i = this;
       if (PatchProxy.applyVoidOneRefs(p0, i, CommonPanelBackgroundView.class, "2")) {
          return;
       }
       super.onDraw(p0);
       i.g = this.getMeasuredHeight();
       i.f = this.getMeasuredWidth();
       if (i.b != null) {
          LinearGradient linearGradie = new LinearGradient(0, 0, (float)i.f, 0, i.c, i.b, Shader$TileMode.CLAMP);
          i.e = v1;
       }else {
          CommonPanelBackgroundView c = i.c;
          LinearGradient linearGradie1 = new LinearGradient(0, 0, (float)i.f, 0, c[0], c[1], Shader$TileMode.CLAMP);
          i.e = v1;
       }
       i.d.setShader(i.e);
       p0.drawRect(0, 0, (float)i.f, (float)i.g, i.d);
       return;
    }
}
