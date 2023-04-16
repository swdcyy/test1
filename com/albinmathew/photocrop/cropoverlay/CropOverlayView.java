package com.albinmathew.photocrop.cropoverlay.CropOverlayView;
import android.view.View;
import java.lang.String;
import android.graphics.Color;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Canvas;
import com.albinmathew.photocrop.cropoverlay.edge.Edge;
import android.graphics.Rect;
import android.graphics.Path$Direction;
import android.graphics.Path;
import android.graphics.Region$Op;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.graphics.RectF;
import android.graphics.Paint$Style;

public class CropOverlayView extends View	// class@000ddb
{
    public float b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public Paint i;
    public Paint j;
    public Paint k;
    public Rect l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public Context t;
    public Path u;
    public RectF v;
    public float w;
    public int x;
    public static final int y;

    static {
       CropOverlayView.y = Color.parseColor("#CC29303F");
    }
    public void CropOverlayView(Context p0){
       super(p0);
       this.b = 0;
       this.c = false;
       this.d = false;
       this.e = 0;
       this.f = 0;
       this.g = -1;
       this.h = 600;
       this.m = 600;
       this.n = 600;
       this.w = 0x3f800000;
       this.t = p0;
    }
    public void CropOverlayView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 0;
       this.c = false;
       this.d = false;
       this.e = 0;
       this.f = 0;
       this.g = -1;
       this.h = 600;
       this.m = 600;
       this.n = 600;
       this.w = 0x3f800000;
       this.t = p0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.i0, false, false);
       this.o = typedArray.getBoolean(3, this.c);
       this.p = typedArray.getBoolean(2, this.d);
       this.q = typedArray.getDimensionPixelSize(5, this.e);
       this.r = typedArray.getDimensionPixelSize(4, this.f);
       this.s = typedArray.getColor(1, this.g);
       this.x = typedArray.getColor(false, CropOverlayView.y);
       typedArray.recycle();
       this.setLayerType(1, null);
    }
    public final void a(Canvas p0){
       float coordinate = Edge.LEFT.getCoordinate();
       float coordinate1 = Edge.TOP.getCoordinate();
       float coordinate2 = Edge.RIGHT.getCoordinate();
       float coordinate3 = Edge.BOTTOM.getCoordinate();
       float f = Edge.getWidth() / 3.00f;
       float f1 = coordinate + f;
       Canvas uCanvas = p0;
       float f2 = coordinate1;
       float f3 = coordinate3;
       uCanvas.drawLine(f1, f2, f1, f3, this.k);
       f1 = coordinate2 - f;
       uCanvas.drawLine(f1, f2, f1, f3, this.k);
       float f4 = Edge.getHeight() / 3.00f;
       f1 = coordinate1 + f4;
       Canvas uCanvas1 = p0;
       float f5 = coordinate;
       f2 = coordinate2;
       uCanvas1.drawLine(f5, f1, f2, f1, this.k);
       f1 = coordinate3 - f4;
       uCanvas1.drawLine(f5, f1, f2, f1, this.k);
    }
    public Rect getImageBounds(){
       return new Rect((int)Edge.LEFT.getCoordinate(), (int)Edge.TOP.getCoordinate(), (int)Edge.RIGHT.getCoordinate(), (int)Edge.BOTTOM.getCoordinate());
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
       if (this.p != null) {
          Edge lEFT = Edge.LEFT;
          Edge rIGHT = Edge.RIGHT;
          float f = (lEFT.getCoordinate() + rIGHT.getCoordinate()) / 2.00f;
          float f1 = (Edge.TOP.getCoordinate() + Edge.BOTTOM.getCoordinate()) / 2.00f;
          float f2 = (rIGHT.getCoordinate() - lEFT.getCoordinate()) / 2.00f;
          this.u.addCircle(f, f1, f2, Path$Direction.CW);
          p0.clipPath(this.u, Region$Op.DIFFERENCE);
          p0.drawColor(this.x);
          p0.save();
          p0.restore();
          p0.drawCircle(f, f1, f2, this.j);
       }else {
          float f3 = TypedValue.applyDimension(1, this.b, c.c(this.t.getResources()));
          this.u.addRoundRect(this.v, f3, f3, Path$Direction.CW);
          p0.clipPath(this.u, Region$Op.DIFFERENCE);
          p0.drawColor(this.x);
          p0.save();
          p0.restore();
          p0.drawRoundRect(this.v, f3, f3, this.j);
       }
       if (this.o != null) {
          this.a(p0);
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (this.u == null || p0) {
          Context context = this.getContext();
          this.u = new Path();
          DisplayMetrics widthPixels = c.c(context.getResources()).widthPixels;
          int i = widthPixels - (this.r * 2);
          this.n = i;
          this.m = (int)((float)i * this.w);
          Paint paint = new Paint();
          paint.setColor(Color.parseColor("#B029303F"));
          this.i = paint;
          Paint paint1 = new Paint();
          paint1.setAntiAlias(1);
          paint1.setColor(Color.parseColor("#FFFFFFFF"));
          paint1.setStrokeWidth(TypedValue.applyDimension(1, 0x3f800000, c.c(context.getResources())));
          paint1.setStyle(Paint$Style.STROKE);
          this.j = paint1;
          paint1.setColor(this.s);
          Paint paint2 = new Paint();
          paint2.setColor(Color.parseColor("#AAFFFFFF"));
          paint2.setStrokeWidth(2.00f);
          this.k = paint2;
          this.l = new Rect(0, 0, widthPixels, widthPixels);
          if (this.v == null) {
             int i1 = this.q + ((this.getHeight() - this.m) / 2);
             CropOverlayView tm = this.m;
             int i2 = (this.q + ((this.getHeight() - tm) / 2)) + tm;
             CropOverlayView tr = this.r;
             int i3 = this.n + tr;
             Edge tOP = Edge.TOP;
             tOP.setCoordinate((float)i1);
             Edge bOTTOM = Edge.BOTTOM;
             bOTTOM.setCoordinate((float)i2);
             Edge lEFT = Edge.LEFT;
             lEFT.setCoordinate((float)tr);
             Edge rIGHT = Edge.RIGHT;
             rIGHT.setCoordinate((float)i3);
             Rect rect = new Rect(tr, i1, i3, i2);
             float coordinate = tOP.getCoordinate();
             this.v = new RectF(lEFT.getCoordinate(), coordinate, rIGHT.getCoordinate(), bOTTOM.getCoordinate());
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       return;
    }
    public void setBorderPaintWidth(int p0){
       this.j.setStrokeWidth((float)p0);
       this.invalidate();
    }
    public void setCornerRadius(float p0){
       this.b = p0;
    }
    public void setDrawCircle(boolean p0){
       this.p = p0;
    }
    public void setMarginSide(int p0){
       this.r = p0;
       this.invalidate();
    }
    public void setOverColor(int p0){
       this.x = p0;
       this.invalidate();
    }
    public void setRectF(RectF p0){
       Edge.TOP.setCoordinate(p0.top);
       Edge.BOTTOM.setCoordinate(p0.bottom);
       Edge.LEFT.setCoordinate(p0.left);
       Edge.RIGHT.setCoordinate(p0.right);
       this.r = (int)p0.left;
       this.v = p0;
    }
    public void setRectRatio(float p0){
       this.w = p0;
    }
}
