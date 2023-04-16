package com.kwai.sdk.kbar.core.ScanBoxView;
import android.view.View;
import android.content.Context;
import android.graphics.Paint;
import java.lang.String;
import android.graphics.Color;
import do7.a;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.text.TextPaint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import android.text.StaticLayout;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.graphics.RectF;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.graphics.Point;
import android.text.Layout$Alignment;

public class ScanBoxView extends View	// class@001614
{
    public int A;
    public boolean B;
    public String C;
    public String D;
    public String E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public Drawable O;
    public Bitmap P;
    public float Q;
    public float R;
    public Bitmap S;
    public Bitmap T;
    public Bitmap U;
    public StaticLayout U0;
    public Bitmap V;
    public int V0;
    public float W;
    public boolean W0;
    public int b;
    public int c;
    public Rect d;
    public float e;
    public float f;
    public Paint g;
    public TextPaint h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public Drawable u;
    public Bitmap v;
    public int w;
    public int x;
    public int y;
    public boolean z;

    public void ScanBoxView(Context p0){
       super(p0);
       Paint paint = new Paint();
       this.g = paint;
       paint.setAntiAlias(true);
       this.i = Color.parseColor("#33FFFFFF");
       this.j = -1;
       this.k = a.e(p0, 20.00f);
       this.l = a.e(p0, 3.00f);
       this.q = a.e(p0, 0x3f800000);
       this.r = -1;
       this.p = a.e(p0, 90.00f);
       this.m = a.e(p0, 200.00f);
       this.o = a.e(p0, 140.00f);
       this.s = 0;
       this.t = false;
       this.u = null;
       this.v = null;
       this.w = a.e(p0, 0x3f800000);
       this.x = -1;
       this.y = 500;
       this.z = false;
       this.A = 0;
       this.B = false;
       this.b = a.e(p0, 2.00f);
       this.E = null;
       this.F = (int)TypedValue.applyDimension(2, 14.00f, c.c(p0.getResources()));
       this.G = -1;
       this.H = false;
       this.I = a.e(p0, 20.00f);
       this.J = false;
       this.K = Color.parseColor("#22000000");
       this.L = false;
       this.M = false;
       this.N = false;
       TextPaint textPaint = new TextPaint();
       this.h = textPaint;
       textPaint.setAntiAlias(true);
       this.V0 = a.e(p0, 4.00f);
       this.W0 = false;
    }
    public final void a(){
       float f;
       int i = (this.getWidth() - this.m) / 2;
       ScanBoxView tp = this.p;
       Rect rect = new Rect(i, tp, (this.m + i), (this.n + tp));
       this.d = rect;
       if (this.B != null) {
          f = ((float)rect.left + this.W) + 0x3f000000;
          this.f = f;
          this.R = f;
       }else {
          f = ((float)rect.top + this.W) + 0x3f000000;
          this.e = f;
          this.Q = f;
       }
       return;
    }
    public Rect b(int p0){
       Rect rect = new Rect(this.d);
       float f = ((float)p0 * 0x3f800000) / (float)this.getMeasuredHeight();
       rect.left = (int)((float)rect.left * f);
       rect.right = (int)((float)rect.right * f);
       rect.top = (int)((float)rect.top * f);
       rect.bottom = (int)((float)rect.bottom * f);
       return rect;
    }
    public int getAnimTime(){
       return this.y;
    }
    public String getBarCodeTipText(){
       return this.D;
    }
    public int getBarcodeRectHeight(){
       return this.o;
    }
    public int getBorderColor(){
       return this.x;
    }
    public int getBorderSize(){
       return this.w;
    }
    public int getCornerColor(){
       return this.j;
    }
    public int getCornerLength(){
       return this.k;
    }
    public int getCornerSize(){
       return this.l;
    }
    public Drawable getCustomScanLineDrawable(){
       return this.u;
    }
    public float getHalfCornerSize(){
       return this.W;
    }
    public boolean getIsBarcode(){
       return this.B;
    }
    public int getMaskColor(){
       return this.i;
    }
    public String getQRCodeTipText(){
       return this.C;
    }
    public int getRectHeight(){
       return this.n;
    }
    public int getRectWidth(){
       return this.m;
    }
    public Bitmap getScanLineBitmap(){
       return this.v;
    }
    public int getScanLineColor(){
       return this.r;
    }
    public int getScanLineMargin(){
       return this.s;
    }
    public int getScanLineSize(){
       return this.q;
    }
    public int getTipBackgroundColor(){
       return this.K;
    }
    public int getTipBackgroundRadius(){
       return this.V0;
    }
    public String getTipText(){
       return this.E;
    }
    public int getTipTextColor(){
       return this.G;
    }
    public int getTipTextMargin(){
       return this.I;
    }
    public int getTipTextSize(){
       return this.F;
    }
    public StaticLayout getTipTextSl(){
       return this.U0;
    }
    public int getToolbarHeight(){
       return this.A;
    }
    public int getTopOffset(){
       return this.p;
    }
    public void onDraw(Canvas p0){
       ScanBoxView td;
       float f1;
       float f2;
       float f3;
       float f4;
       ScanBoxView tW;
       float f5;
       RectF rectF;
       Rect rect1;
       ScanBoxView td1;
       ScanBoxView tW1;
       float f6;
       Rect rect2;
       RectF rectF1;
       if (this.d == null) {
          return;
       }
       int width = p0.getWidth();
       int height = p0.getHeight();
       if (this.i != null) {
          this.g.setStyle(Paint$Style.FILL);
          this.g.setColor(this.i);
          float f = (float)width;
          p0.drawRect(0, 0, f, (float)this.d.top, this.g);
          td = this.d;
          p0.drawRect(0, (float)td.top, (float)td.left, (float)(td.bottom + 1), this.g);
          td = this.d;
          f1 = f;
          p0.drawRect((float)(td.right + 1), (float)td.top, f1, (float)(td.bottom + 1), this.g);
          p0.drawRect(0, (float)(this.d.bottom + 1), f1, (float)height, this.g);
       }
       if (this.w > null) {
          this.g.setStyle(Paint$Style.STROKE);
          this.g.setColor(this.x);
          this.g.setStrokeWidth((float)this.w);
          p0.drawRect(this.d, this.g);
       }
       Rect rect = null;
       if (this.W - rect > 0) {
          this.g.setStyle(Paint$Style.STROKE);
          this.g.setColor(this.j);
          this.g.setStrokeWidth((float)this.l);
          td = this.d;
          f2 = (float)td.left - this.W;
          f3 = (float)td.top;
          p0.drawLine(f2, f3, (f2 + (float)this.k), f3, this.g);
          td = this.d;
          f1 = (float)td.left;
          f4 = (float)td.top - this.W;
          p0.drawLine(f1, f4, f1, (f4 + (float)this.k), this.g);
          td = this.d;
          f2 = (float)td.right + this.W;
          f3 = (float)td.top;
          p0.drawLine(f2, f3, (f2 - (float)this.k), f3, this.g);
          td = this.d;
          f1 = (float)td.right;
          f4 = (float)td.top - this.W;
          p0.drawLine(f1, f4, f1, (f4 + (float)this.k), this.g);
          td = this.d;
          f2 = (float)td.left - this.W;
          f3 = (float)td.bottom;
          p0.drawLine(f2, f3, (f2 + (float)this.k), f3, this.g);
          td = this.d;
          f1 = (float)td.left;
          f4 = (float)td.bottom + this.W;
          p0.drawLine(f1, f4, f1, (f4 - (float)this.k), this.g);
          td = this.d;
          f2 = (float)td.right + this.W;
          f3 = (float)td.bottom;
          p0.drawLine(f2, f3, (f2 - (float)this.k), f3, this.g);
          td = this.d;
          f1 = (float)td.right;
          f4 = (float)td.bottom + this.W;
          p0.drawLine(f1, f4, f1, (f4 - (float)this.k), this.g);
       }
       ScanBoxView scanBoxView = null;
       int i = 0;
       if (this.B != null) {
          if (this.P != null) {
             scanBoxView = this.d;
             tW = this.W;
             f5 = (float)this.s;
             rectF = new RectF((((float)scanBoxView.left + tW) + 0x3f000000), (((float)scanBoxView.top + tW) + f5), this.R, (((float)scanBoxView.bottom - tW) - f5));
             rect1 = new Rect((int)((float)this.P.getWidth() - rectF.width()), i, this.P.getWidth(), this.P.getHeight());
             if (rect1.left < null) {
                rect1.left = i;
                rectF.left = rectF.right - (float)rect1.width();
             }
             p0.drawBitmap(this.P, rect1, rectF, this.g);
          }else if(this.v != null){
             td1 = this.f;
             rectF = new RectF(td1, (((float)this.d.top + this.W) + (float)this.s), ((float)this.v.getWidth() + td1), (((float)this.d.bottom - this.W) - (float)this.s));
             p0.drawBitmap(this.v, scanBoxView, rectF, this.g);
          }else {
             this.g.setStyle(Paint$Style.FILL);
             this.g.setColor(this.r);
             scanBoxView = this.f;
             td = this.d;
             tW = this.W;
             f3 = (float)this.s;
             f4 = ((float)td.top + tW) + f3;
             p0.drawRect(scanBoxView, f4, ((float)this.q + scanBoxView), (((float)td.bottom - tW) - f3), this.g);
          }
       }else if(this.P != null){
          scanBoxView = this.d;
          tW = this.W;
          f3 = (float)this.s;
          rectF = new RectF((((float)scanBoxView.left + tW) + f3), (((float)scanBoxView.top + tW) + 0x3f000000), (((float)scanBoxView.right - tW) - f3), this.Q);
          rect1 = new Rect(i, (int)((float)this.P.getHeight() - rectF.height()), this.P.getWidth(), this.P.getHeight());
          if (rect1.top < null) {
             rect1.top = i;
             rectF.top = rectF.bottom - (float)rect1.height();
          }
          p0.drawBitmap(this.P, rect1, rectF, this.g);
       }else if(this.v != null){
          td1 = this.d;
          tW1 = this.W;
          f5 = (float)this.s;
          ScanBoxView te = this.e;
          p0.drawBitmap(this.v, scanBoxView, new RectF((((float)td1.left + tW1) + f5), te, (((float)td1.right - tW1) - f5), ((float)this.v.getHeight() + te)), this.g);
       }else {
          this.g.setStyle(Paint$Style.FILL);
          this.g.setColor(this.r);
          td = this.d;
          td1 = this.W;
          f1 = (float)this.s;
          f2 = ((float)td.left + td1) + f1;
          tW1 = this.e;
          td1 = tW1;
          p0.drawRect(f2, td1, (((float)td.right - td1) - f1), (tW1 + (float)this.q), this.g);
       }
       if (!TextUtils.isEmpty(this.E) && this.U0 != null) {
          if (this.H != null) {
             if (this.L != null) {
                this.g.setColor(this.K);
                this.g.setStyle(Paint$Style.FILL);
                if (this.J != null) {
                   rect2 = new Rect();
                   td1 = this.E;
                   this.h.getTextBounds(td1, i, td1.length(), rect2);
                   f2 = (float)(((p0.getWidth() - rect2.width()) / 2) - this.V0);
                   rectF1 = new RectF(f2, (float)((this.d.bottom + this.I) - this.V0), (((float)rect2.width() + f2) + (float)(this.V0 * 2)), (float)(((this.d.bottom + this.I) + this.U0.getHeight()) + this.V0));
                   p0.drawRoundRect(rectF1, (float)this.V0, (float)this.V0, this.g);
                }else {
                   scanBoxView = this.d;
                   int i1 = scanBoxView.bottom + this.I;
                   p0.drawRoundRect(new RectF((float)scanBoxView.left, (float)(i1 - this.V0), (float)scanBoxView.right, (float)((i1 + this.U0.getHeight()) + this.V0)), (float)this.V0, (float)this.V0, this.g);
                }
             }
             p0.save();
             if (this.J != null) {
                p0.translate(rect, (float)(this.d.bottom + this.I));
             }else {
                td = this.d;
                p0.translate((float)(td.left + this.V0), (float)(td.bottom + this.I));
             }
             this.U0.draw(p0);
             p0.restore();
          }else if(this.L != null){
             this.g.setColor(this.K);
             this.g.setStyle(Paint$Style.FILL);
             if (this.J != null) {
                rect2 = new Rect();
                td1 = this.E;
                this.h.getTextBounds(td1, i, td1.length(), rect2);
                f2 = (float)(((p0.getWidth() - rect2.width()) / 2) - this.V0);
                tW1 = this.V0;
                rectF1 = new RectF(f2, (float)(((this.d.top - this.I) - this.U0.getHeight()) - this.V0), (((float)rect2.width() + f2) + (float)(tW1 * 2)), (float)((this.d.top - this.I) + tW1));
                p0.drawRoundRect(rectF1, (float)this.V0, (float)this.V0, this.g);
             }else {
                scanBoxView = this.d;
                tW = this.V0;
                tW1 = this.d;
                p0.drawRoundRect(new RectF((float)scanBoxView.left, (float)(((scanBoxView.top - this.I) - this.U0.getHeight()) - tW), (float)tW1.right, (float)((tW1.top - this.I) + tW)), (float)this.V0, (float)this.V0, this.g);
             }
          }
          p0.save();
          if (this.J != null) {
             p0.translate(rect, (float)((this.d.top - this.I) - this.U0.getHeight()));
          }else {
             td = this.d;
             p0.translate((float)(td.left + this.V0), (float)((td.top - this.I) - this.U0.getHeight()));
          }
          this.U0.draw(p0);
          p0.restore();
       }
       if (this.B != null) {
          if (this.P == null) {
             this.f = this.f + (float)this.b;
             td = this.q;
             scanBoxView = this.v;
             if (scanBoxView != null) {
                width = scanBoxView.getWidth();
             }
             if (this.M != null) {
                scanBoxView = this.f;
                td1 = this.d;
                tW1 = this.W;
                if (((float)width + scanBoxView) - ((float)td1.right - tW1) > 0 || scanBoxView - ((float)td1.left + tW1) < 0) {
                   this.b = - this.b;
                }
             }else {
                td = this.d;
                tW = this.W;
                if ((this.f + (float)width) - ((float)td.right - tW) > 0) {
                   this.f = ((float)td.left + tW) + 0x3f000000;
                }
             }
          }else {
             f6 = this.R + (float)this.b;
             this.R = f6;
             scanBoxView = this.d;
             tW = this.W;
             if (f6 - ((float)scanBoxView.right - tW) > 0) {
                this.R = ((float)scanBoxView.left + tW) + 0x3f000000;
             }
          }
       }else if(this.P == null){
          this.e = this.e + (float)this.b;
          td = this.q;
          scanBoxView = this.v;
          if (scanBoxView != null) {
             width = scanBoxView.getHeight();
          }
          if (this.M != null) {
             scanBoxView = this.e;
             td1 = this.d;
             tW1 = this.W;
             if (((float)width + scanBoxView) - ((float)td1.bottom - tW1) > 0 || scanBoxView - ((float)td1.top + tW1) < 0) {
                this.b = - this.b;
             }
          }else {
             td = this.d;
             tW = this.W;
             if ((this.e + (float)width) - ((float)td.bottom - tW) > 0) {
                this.e = ((float)td.top + tW) + 0x3f000000;
             }
          }
       }else {
          f6 = this.Q + (float)this.b;
          this.Q = f6;
          scanBoxView = this.d;
          tW = this.W;
          if (f6 - ((float)scanBoxView.bottom - tW) > 0) {
             this.Q = ((float)scanBoxView.top + tW) + 0x3f000000;
          }
       }
       td = this.d;
       td1 = this.W;
       f1 = (float)this.s;
       this.postInvalidateDelayed((long)this.c, (int)(((float)td.left + td1) + f1), td.top, (int)(((float)td.right - td1) - f1), td.bottom);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       this.a();
    }
    public void setAnimTime(int p0){
       this.y = p0;
    }
    public void setBarCodeTipText(String p0){
       this.D = p0;
    }
    public void setBarcodeRectHeight(int p0){
       this.o = p0;
    }
    public void setBorderColor(int p0){
       this.x = p0;
    }
    public void setBorderSize(int p0){
       this.w = p0;
    }
    public void setCenterVertical(boolean p0){
       this.z = p0;
    }
    public void setCornerColor(int p0){
       this.j = p0;
    }
    public void setCornerLength(int p0){
       this.k = p0;
    }
    public void setCornerSize(int p0){
       this.l = p0;
    }
    public void setCustomScanLineDrawable(Drawable p0){
       this.u = p0;
    }
    public void setHalfCornerSize(float p0){
       this.W = p0;
    }
    public void setIsBarcode(boolean p0){
       ScanBoxView a;
       ScanBoxView scanBoxView = this;
       boolean b = p0;
       scanBoxView.B = b;
       if (scanBoxView.O != null || scanBoxView.N != null) {
          scanBoxView.P = (b)? scanBoxView.V: scanBoxView.U;
       }else if(scanBoxView.u != null || scanBoxView.t != null){
          scanBoxView.v = (b)? scanBoxView.T: scanBoxView.S;
       }
    label_002e :
       float f = 0x3f800000;
       if (b) {
          scanBoxView.E = scanBoxView.D;
          scanBoxView.n = scanBoxView.o;
          scanBoxView.c = (int)((((float)scanBoxView.y * f) * (float)scanBoxView.b) / (float)scanBoxView.m);
       }else {
          scanBoxView.E = scanBoxView.C;
          ScanBoxView m = scanBoxView.m;
          scanBoxView.n = m;
          scanBoxView.c = (int)((((float)scanBoxView.y * f) * (float)scanBoxView.b) / (float)m);
       }
       if (!TextUtils.isEmpty(scanBoxView.E)) {
          if (scanBoxView.J != null) {
             StaticLayout staticLayout = new StaticLayout(scanBoxView.E, scanBoxView.h, a.f(this.getContext()).x, Layout$Alignment.ALIGN_CENTER, 0x3f800000, 0, true);
             scanBoxView.U0 = b;
          }else {
             StaticLayout staticLayout1 = new StaticLayout(scanBoxView.E, scanBoxView.h, (scanBoxView.m - (scanBoxView.V0 * 2)), Layout$Alignment.ALIGN_CENTER, 0x3f800000, 0, true);
             scanBoxView.U0 = b;
          }
       }
       if (scanBoxView.z != null) {
          Point y = a.f(this.getContext()).y;
          a = scanBoxView.A;
          scanBoxView.p = (a == null)? (y - scanBoxView.n) / 2: ((y - scanBoxView.n) / 2) + (a / 2);
       }
    label_00cc :
       this.a();
       this.postInvalidate();
       return;
    }
    public void setMaskColor(int p0){
       this.i = p0;
    }
    public void setOnlyDecodeScanBoxArea(boolean p0){
       this.W0 = p0;
    }
    public void setQRCodeTipText(String p0){
       this.C = p0;
    }
    public void setRectHeight(int p0){
       this.n = p0;
    }
    public void setRectWidth(int p0){
       this.m = p0;
    }
    public void setScanLineBitmap(Bitmap p0){
       this.v = p0;
    }
    public void setScanLineColor(int p0){
       this.r = p0;
    }
    public void setScanLineMargin(int p0){
       this.s = p0;
    }
    public void setScanLineReverse(boolean p0){
       this.M = p0;
    }
    public void setScanLineSize(int p0){
       this.q = p0;
    }
    public void setShowDefaultGridScanLineDrawable(boolean p0){
       this.N = p0;
    }
    public void setShowDefaultScanLineDrawable(boolean p0){
       this.t = p0;
    }
    public void setShowTipBackground(boolean p0){
       this.L = p0;
    }
    public void setShowTipTextAsSingleLine(boolean p0){
       this.J = p0;
    }
    public void setTipBackgroundColor(int p0){
       this.K = p0;
    }
    public void setTipBackgroundRadius(int p0){
       this.V0 = p0;
    }
    public void setTipText(String p0){
       this.E = p0;
    }
    public void setTipTextBelowRect(boolean p0){
       this.H = p0;
    }
    public void setTipTextColor(int p0){
       this.G = p0;
    }
    public void setTipTextMargin(int p0){
       this.I = p0;
    }
    public void setTipTextSize(int p0){
       this.F = p0;
    }
    public void setTipTextSl(StaticLayout p0){
       this.U0 = p0;
    }
    public void setToolbarHeight(int p0){
       this.A = p0;
    }
    public void setTopOffset(int p0){
       this.p = p0;
    }
}
