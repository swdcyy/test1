package com.kuaishou.live.gzone.widget.LiveGzoneDownloadProgressView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.RectF;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import ll8.c$b;
import android.content.res.TypedArray;
import com.yxcorp.utility.n;
import android.content.res.Resources;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class LiveGzoneDownloadProgressView extends View	// class@001cf6
{
    public Bitmap b;
    public Canvas c;
    public int d;
    public Paint e;
    public String f;
    public Paint g;
    public Paint h;
    public Paint i;
    public Paint j;
    public int k;
    public int l;
    public RectF m;
    public RectF n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;

    public void LiveGzoneDownloadProgressView(Context p0){
       super(p0, null);
    }
    public void LiveGzoneDownloadProgressView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGzoneDownloadProgressView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.m = new RectF();
       this.n = new RectF();
       boolean b = true;
       this.t = b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzoneDownloadProgressView.class, "1")) {
       }else {
          Paint paint = new Paint();
          this.i = paint;
          paint.setAntiAlias(b);
          paint = new Paint();
          this.j = paint;
          paint.setStyle(Paint$Style.FILL);
          this.j.setAntiAlias(b);
          paint = new Paint();
          this.g = paint;
          paint.setStyle(Paint$Style.FILL);
          this.g.setAntiAlias(b);
          this.g.setFakeBoldText(b);
          int i = 0x7f061b4e;
          float f = 12.00f;
          float f1 = 20.00f;
          if (p1 != null) {
             TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.C2);
             this.l = typedArray.getDimensionPixelOffset(7, n.c(p0, f1));
             this.g.setTextSize((float)typedArray.getDimensionPixelOffset(5, n.c(p0, f)));
             this.k = typedArray.getColor(3, this.getResources().getColor(i));
             this.o = typedArray.getColor(4, -1);
             this.p = typedArray.getColor(b, -1);
             this.q = typedArray.getColor(2, this.getResources().getColor(0x7f061793));
             this.r = typedArray.getColor(0, this.getResources().getColor(0x7f061793));
             this.s = typedArray.getColor(8, this.getResources().getColor(0x7f061793));
             this.t = typedArray.getBoolean(6, b);
             typedArray.recycle();
          }else {
             this.l = n.c(p0, f1);
             this.g.setTextSize((float)n.c(p0, f));
             this.k = this.getResources().getColor(i);
             this.o = -1;
             this.p = -1;
             this.q = this.getResources().getColor(0x7f061793);
             this.r = this.getResources().getColor(0x7f061793);
             this.s = this.getResources().getColor(0x7f061793);
          }
          Paint paint1 = new Paint();
          this.e = paint1;
          paint1.setStyle(Paint$Style.FILL);
          this.e.setAntiAlias(b);
          this.e.setColor(this.k);
          if (this.t != null) {
             paint1 = new Paint();
             this.h = paint1;
             paint1.setStyle(Paint$Style.FILL);
             this.h.setColor(this.k);
             this.h.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.SRC_IN));
          }
          if (this.isEnabled()) {
             this.g.setColor(this.o);
             this.j.setColor(this.q);
          }else {
             this.g.setColor(this.p);
             this.j.setColor(this.r);
          }
          if (this.isSelected()) {
             this.j.setColor(this.s);
          }
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneDownloadProgressView.class, "2")) {
          return;
       }
       super.onDraw(p0);
       int width = this.getWidth();
       int height = this.getHeight();
       if (width > 0 && height > 0) {
          if (this.isEnabled()) {
             this.g.setColor(this.o);
             this.j.setColor(this.q);
          }else {
             this.g.setColor(this.p);
             this.j.setColor(this.r);
          }
          if (this.isSelected()) {
             this.j.setColor(this.s);
          }
          float f = 0;
          if (this.b == null) {
             this.b = Bitmap.createBitmap(width, height, Bitmap$Config.ARGB_8888);
             this.i.setShader(new BitmapShader(this.b, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP));
             this.n.set(f, f, (float)width, (float)height);
          }
          LiveGzoneDownloadProgressView tl = this.l;
          float f1 = (float)tl;
          p0.drawRoundRect(this.n, f1, (float)tl, this.j);
          if (this.c == null) {
             this.c = new Canvas(this.b);
          }
          this.c.drawColor(0, PorterDuff$Mode.CLEAR);
          float f2 = (float)width;
          f1 = (float)(int)((((float)this.d * 0x3f800000) / 100.00f) * f2);
          float f3 = (float)height;
          this.m.set(f, f, f1, f3);
          this.c.drawRect(this.m, this.e);
          this.c.drawText(this.f, ((f2 - this.g.measureText(this.f)) / 2.00f), ((f3 - (this.g.descent() + this.g.ascent())) / 2.00f), this.g);
          if (this.t != null) {
             this.c.drawRect(f1, 0, f2, f3, this.h);
          }
          LiveGzoneDownloadProgressView tl1 = this.l;
          float f4 = (float)tl1;
          p0.drawRoundRect(this.n, f4, (float)tl1, this.i);
       }
       return;
    }
    public void setBackgroundProgress(int p0){
       if (PatchProxy.isSupport(LiveGzoneDownloadProgressView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGzoneDownloadProgressView.class, "4")) {
          return;
       }
       if (this.d != p0) {
          this.d = p0;
          this.invalidate();
       }
       return;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneDownloadProgressView.class, "3")) {
          return;
       }
       if (!TextUtils.n(this.f, p0)) {
          this.f = p0;
          this.invalidate();
       }
       return;
    }
}
