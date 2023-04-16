package com.yxcorp.gifshow.widget.thanos.search.SearchHotWordMarqueeTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.graphics.Canvas;
import android.widget.TextView;
import android.graphics.Paint;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.text.TextPaint;
import lnc.a1;
import java.lang.Boolean;
import java.lang.Integer;
import android.graphics.Paint$FontMetrics;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import szc.i;
import java.lang.Runnable;
import java.lang.Float;
import java.lang.StringBuilder;
import szc.j;

public class SearchHotWordMarqueeTextView extends AppCompatTextView	// class@0019d5
{
    public int f;
    public float g;
    public int h;
    public String i;
    public float j;
    public float k;
    public Bitmap l;
    public float m;
    public Paint n;
    public Paint o;
    public static final int p;

    public void SearchHotWordMarqueeTextView(Context p0){
       super(p0);
       this.m = 0x3f800000;
       this.p(p0);
    }
    public void SearchHotWordMarqueeTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.m = 0x3f800000;
       this.p(p0);
    }
    public void SearchHotWordMarqueeTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.m = 0x3f800000;
       this.p(p0);
    }
    public Bitmap getBitmap(){
       return this.l;
    }
    public int getPadding(){
       return this.f;
    }
    public float getTextWidth(){
       return this.j;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, SearchHotWordMarqueeTextView.class, "8")) {
          return;
       }
       super.onDetachedFromWindow();
       this.r();
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchHotWordMarqueeTextView.class, "4")) {
          return;
       }
       p0.saveLayer(0, 0, (float)this.getWidth(), (float)this.getHeight(), null, 31);
       super.onDraw(p0);
       if (TextUtils.isEmpty(this.i)) {
          this.i = "";
       }
       SearchHotWordMarqueeTextView tl = this.l;
       int height = (tl != null)? tl.getHeight(): 0;
       TextPaint paint = this.getPaint();
       paint.setAlpha((int)(this.m * 0x437f0000));
       float f = 0;
       if (((this.j + (float)height) + (float)this.f) - (float)this.h < 0) {
          this.k = f;
          if (this.l != null) {
             p0.drawBitmap(this.l, (- this.k), (float)((this.getHeight() / 2) - (this.l.getHeight() / 2)), paint);
             p0.drawText(this.i, ((- this.k) + (float)this.l.getWidth()), this.g, paint);
          }else {
             p0.drawText(this.i, (- f), this.g, paint);
          }
       }else if(this.l != null){
          float f1 = (float)((this.getHeight() / 2) - (this.l.getHeight() / 2));
          p0.drawBitmap(this.l, (- this.k), f1, paint);
          p0.drawText(this.i, ((- this.k) + (float)this.l.getWidth()), this.g, paint);
          if ((this.k + (float)this.h) - ((this.j + (float)this.f) + (float)this.l.getWidth()) > 0) {
             float f2 = ((this.j + (float)this.f) + (float)this.l.getWidth()) - this.k;
             p0.drawBitmap(this.l, f2, f1, paint);
             p0.drawText(this.i, (f2 + (float)this.l.getWidth()), this.g, paint);
          }
       }else {
          p0.drawText(this.i, (- this.k), this.g, paint);
          tl = this.k;
          SearchHotWordMarqueeTextView tj = this.j;
          SearchHotWordMarqueeTextView tf = this.f;
          if (((float)this.h + tl) - ((float)tf + tj) > 0) {
             p0.drawText(this.i, ((tj + (float)tf) - tl), this.g, paint);
          }
       }
       int i = 0x7f07034b;
       if (this.k - f > 0) {
          p0.drawRect(0, 0, (float)a1.d(i), (float)this.getHeight(), this.n);
       }
       p0.drawRect((float)(this.getWidth() - a1.d(i)), 0, (float)this.getWidth(), (float)this.getHeight(), this.o);
       p0.restore();
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(SearchHotWordMarqueeTextView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, SearchHotWordMarqueeTextView.class, "3")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.g = (float)(int)((float)(this.getHeight() / 2) - ((this.getPaint().getFontMetrics().top + this.getPaint().getFontMetrics().bottom) / 2.00f));
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       SearchHotWordMarqueeTextView searchHotWor = this;
       int i = p0;
       if (PatchProxy.isSupport(SearchHotWordMarqueeTextView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, SearchHotWordMarqueeTextView.class, "2")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       searchHotWor.n.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_IN));
       int[] ointArray = new int[]{a1.a(0x7f06202f),0xff000000};
       LinearGradient linearGradie = new LinearGradient(0, 0, (float)a1.d(0x7f07034b), 0, ointArray, null, Shader$TileMode.CLAMP);
       searchHotWor.n.setShader(v0);
       searchHotWor.o.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_IN));
       int[] ointArray1 = new int[]{0xff000000,a1.a(0x7f06202f)};
       LinearGradient linearGradie1 = new LinearGradient((float)(i - a1.d(0x7f07034b)), 0, (float)i, 0, ointArray1, null, Shader$TileMode.CLAMP);
       searchHotWor.o.setShader(v0);
       return;
    }
    public final void p(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchHotWordMarqueeTextView.class, "1")) {
          return;
       }
       this.f = a1.e(20.00f);
       Paint paint = new Paint();
       this.n = paint;
       paint.setAntiAlias(true);
       paint = new Paint();
       this.o = paint;
       paint.setAntiAlias(true);
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, SearchHotWordMarqueeTextView.class, "6")) {
          return;
       }
       this.post(new i(this));
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, SearchHotWordMarqueeTextView.class, "7")) {
          return;
       }
       if (this.k) {
          this.k = 0;
          this.invalidate();
       }
       return;
    }
    public void setAlpha(float p0){
       if (PatchProxy.isSupport(SearchHotWordMarqueeTextView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SearchHotWordMarqueeTextView.class, "10")) {
          return;
       }
       this.m = p0;
       this.invalidate();
       return;
    }
    public void setBitmap(Bitmap p0){
       if (p0 != null) {
          this.l = p0;
       }
       return;
    }
    public void setMarqueeText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchHotWordMarqueeTextView.class, "5")) {
          return;
       }
       this.i = " "+p0;
       this.j = this.getPaint().measureText(this.i);
       this.post(new j(this));
       return;
    }
    public void setScroll(float p0){
       if (PatchProxy.isSupport(SearchHotWordMarqueeTextView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SearchHotWordMarqueeTextView.class, "9")) {
          return;
       }
       this.k = p0;
       this.invalidate();
       return;
    }
}
