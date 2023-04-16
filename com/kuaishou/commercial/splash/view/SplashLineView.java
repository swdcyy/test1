package com.kuaishou.commercial.splash.view.SplashLineView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Path;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import com.yxcorp.utility.n;
import java.lang.Integer;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Canvas;

public class SplashLineView extends View	// class@001637
{
    public int b;
    public int c;
    public Paint d;
    public Path e;

    public void SplashLineView(Context p0){
       super(p0);
       this.a();
    }
    public void SplashLineView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, SplashLineView.class, "1")) {
          return;
       }
       this.e = new Path();
       this.b = a.a().a().getResources().getColor(0x7f060788);
       int i = n.c(this.getContext(), 4.00f);
       this.c = i;
       this.b(this.b, i);
       return;
    }
    public void b(int p0,int p1){
       if (PatchProxy.isSupport(SplashLineView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SplashLineView.class, "2")) {
          return;
       }
       this.b = p0;
       this.c = p1;
       Paint paint = new Paint();
       this.d = paint;
       paint.setStyle(Paint$Style.STROKE);
       this.d.setStrokeWidth((float)this.c);
       this.d.setColor(this.b);
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashLineView.class, "3")) {
          return;
       }
       super.onDraw(p0);
       p0.drawPath(this.e, this.d);
       return;
    }
}
