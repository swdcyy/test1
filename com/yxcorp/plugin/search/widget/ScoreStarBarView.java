package com.yxcorp.plugin.search.widget.ScoreStarBarView;
import android.view.View;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Bitmap$Config;
import com.yxcorp.plugin.search.utils.j0;
import android.graphics.Canvas;
import java.lang.Integer;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.plugin.search.widget.ScoreStarBarView$a;
import zf6.j;
import java.lang.Float;
import java.lang.Math;

public class ScoreStarBarView extends View	// class@0007d2
{
    public int b;
    public int c;
    public int d;
    public float e;
    public Bitmap f;
    public Drawable g;
    public ScoreStarBarView$a h;
    public Paint i;
    public boolean j;
    public boolean k;
    public static int l = 102;

    public void ScoreStarBarView(Context p0,int p1,int p2){
       super(p0);
       this.b = 0;
       this.c = 5;
       this.d = 20;
       this.e = 0;
       this.j = false;
       this.k = false;
       this.g = p0.getResources().getDrawable(p1);
       this.f = BitmapFactory.decodeResource(p0.getResources(), p2);
       Paint paint = new Paint();
       this.i = paint;
       paint.setAntiAlias(true);
       this.i.setShader(new BitmapShader(this.f, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP));
    }
    public void ScoreStarBarView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 0;
       this.c = 5;
       this.d = 20;
       this.e = 0;
       this.j = false;
       this.k = false;
       this.a(p0, p1);
    }
    public void ScoreStarBarView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0;
       this.c = 5;
       this.d = 20;
       this.e = 0;
       this.j = false;
       this.k = false;
       this.a(p0, p1);
    }
    public final void a(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ScoreStarBarView.class, "1")) {
          return;
       }
       this.setClickable(true);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.w4);
       this.b = (int)typedArray.getDimension(true, 0);
       this.d = (int)typedArray.getDimension(4, 20.00f);
       this.c = typedArray.getInteger(0, 5);
       this.g = typedArray.getDrawable(2);
       this.f = j0.f(typedArray.getDrawable(3), this.d, this.d, Bitmap$Config.ARGB_4444);
       typedArray.recycle();
       Paint paint = new Paint();
       this.i = paint;
       paint.setAntiAlias(true);
       this.i.setShader(new BitmapShader(this.f, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP));
       return;
    }
    public float getStarMark(){
       return this.e;
    }
    public void onDraw(Canvas p0){
       ScoreStarBarView tb;
       float f2;
       if (PatchProxy.applyVoidOneRefs(p0, this, ScoreStarBarView.class, "5")) {
          return;
       }
       super.onDraw(p0);
       if (this.f != null && this.g != null) {
          int i = 0;
          for (int i1 = 0; i1 < this.c; i1 = i1 + 1) {
             tb = this.b;
             ScoreStarBarView td = this.d;
             int i2 = tb + td;
             i2 = i2 * i1;
             int i3 = tb + td;
             i3 = i3 * i1;
             i3 = i3 + td;
             this.g.setBounds(i2, i, i3, td);
             this.g.draw(p0);
          }
          ScoreStarBarView te = this.e;
          float f = 0x3f800000;
          if (te - f > 0) {
             te = this.d;
             float f1 = (float)te;
             f2 = (float)te;
             p0.drawRect(0, 0, f1, f2, this.i);
             te = this.e;
             if (!(te - (float)(int)te)) {
                int i4 = 1;
                while ((float)i4 - this.e < 0) {
                   i = this.b + this.d;
                   p0.translate((float)i, 0);
                   te = this.d;
                   f1 = (float)te;
                   f2 = (float)te;
                   p0.drawRect(0, 0, f1, f2, this.i);
                   i4 = i4 + 1;
                }
             }else {
                int i5 = 1;
                float f3 = this.e - f;
                while ((float)i5 - f3 < 0) {
                   i = this.b + this.d;
                   p0.translate((float)i, 0);
                   te = this.d;
                   f1 = (float)te;
                   f2 = (float)te;
                   p0.drawRect(0, 0, f1, f2, this.i);
                   i5 = i5 + 1;
                }
                p0.translate((float)(this.b + this.d), 0);
                te = this.d;
                f2 = (float)te;
                p0.drawRect(0, 0, ((float)te * 0x3f000000), f2, this.i);
             }
          }else {
             tb = this.d;
             float f4 = (float)tb;
             f2 = f4;
             p0.drawRect(0, 0, ((float)tb * te), f2, this.i);
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(ScoreStarBarView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ScoreStarBarView.class, "4")) {
          return;
       }
       super.onMeasure(p0, p1);
       ScoreStarBarView td = this.d;
       ScoreStarBarView tc = this.c;
       int i = td * tc;
       tc--;
       this.setMeasuredDimension((i + (this.b * tc)), td);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ScoreStarBarView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.k == null) {
          return super.onTouchEvent(p0);
       }
       int i = (int)p0.getX();
       if (i < 0) {
          i = 0;
       }
       if (i > this.getMeasuredWidth()) {
          i = this.getMeasuredWidth();
       }
       int action = p0.getAction();
       float f = 0x3f800000;
       if (action) {
          if (action == 2) {
             this.setStarMark((((float)i * f) / (((float)this.getMeasuredWidth() * f) / (float)this.c)));
          }
       }else {
          this.setStarMark((((float)i * f) / (((float)this.getMeasuredWidth() * f) / (float)this.c)));
       }
       this.invalidate();
       return super.onTouchEvent(p0);
    }
    public void setIntegerMark(boolean p0){
       this.j = p0;
    }
    public void setOnStarChangeListener(ScoreStarBarView$a p0){
       this.h = p0;
    }
    public void setStarDistance(int p0){
       this.b = p0;
    }
    public void setStarLevel(int p0){
       int i;
       if (PatchProxy.isSupport(ScoreStarBarView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ScoreStarBarView.class, "3")) {
          return;
       }
       Context context = this.getContext();
       Shader$TileMode tileMode = 0x7f081ed6;
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                i = (p0 != 101 && p0 != 102)? 0x7f081ed6: 0x7f081f10;
             }else {
                i = 0x7f081f2c;
             }
          }else {
             i = 0x7f081ed8;
          }
       }else {
          i = 0x7f081ed7;
       }
       this.f = j0.f(context.getDrawable(i), this.d, this.d, Bitmap$Config.ARGB_4444);
       i = 0x7f081f0f;
       if (p0 == ScoreStarBarView.l) {
          this.g = j.j(i, 2);
       }else {
          Resources resources = this.getContext().getResources();
          if (p0 == 101 || p0 == 102) {
             tileMode = 0x7f081f0f;
          }
          this.g = resources.getDrawable(tileMode);
       }
       this.i.setShader(new BitmapShader(this.f, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP));
       return;
    }
    public void setStarMark(float p0){
       if (PatchProxy.isSupport(ScoreStarBarView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ScoreStarBarView.class, "2")) {
          return;
       }
       if (this.j != null) {
          this.e = (float)(int)Math.ceil((double)p0);
       }else {
          float f = 10.00f;
          this.e = ((float)Math.round((p0 * f)) * 0x3f800000) / f;
       }
       ScoreStarBarView th = this.h;
       if (th != null) {
          th.a(this.e);
       }
       this.invalidate();
       return;
    }
    public void setStarSize(int p0){
       this.d = p0;
    }
}
