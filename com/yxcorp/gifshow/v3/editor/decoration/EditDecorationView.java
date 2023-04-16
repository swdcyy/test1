package com.yxcorp.gifshow.v3.editor.decoration.EditDecorationView;
import com.yxcorp.gifshow.decoration.widget.DecorationView;
import lnc.a1;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Rect;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import h80.c;
import h80.k;
import h80.m;
import android.graphics.Canvas;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import android.graphics.Bitmap;
import android.graphics.Paint$Style;
import android.graphics.Paint$Cap;
import android.graphics.Typeface;
import android.graphics.Paint$FontMetrics;
import java.lang.Math;
import com.yxcorp.gifshow.v3.editor.decoration.d;
import java.lang.Runnable;
import t45.c;

public class EditDecorationView extends DecorationView	// class@000f06
{
    public String i;
    public Paint j;
    public RectF k;
    public Bitmap l;
    public Rect m;
    public RectF n;
    public static final int o;
    public static final int p;
    public static final int q;

    static {
       EditDecorationView.o = a1.a(0x7f0601be);
       EditDecorationView.p = a1.a(0x7f060947);
       EditDecorationView.q = a1.a(0x7f060946);
    }
    public void EditDecorationView(Context p0){
       super(p0);
       this.i = "";
       this.j = new Paint();
       this.k = new RectF();
       this.m = new Rect();
       this.n = new RectF();
       this.c();
    }
    public void EditDecorationView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.i = "";
       this.j = new Paint();
       this.k = new RectF();
       this.m = new Rect();
       this.n = new RectF();
       this.c();
    }
    public void EditDecorationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.i = "";
       this.j = new Paint();
       this.k = new RectF();
       this.m = new Rect();
       this.n = new RectF();
       this.c();
    }
    public final int b(int p0){
       DecorationView obj;
       if (PatchProxy.isSupport(EditDecorationView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, EditDecorationView.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.b;
       float f = (obj == null)? 0x3f800000: obj.getGlobalScale();
       return (int)((float)a1.e((float)p0) / f);
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, EditDecorationView.class, "1")) {
          return;
       }
       this.g = k.a().b().a;
       this.j.setAntiAlias(true);
       return;
    }
    public void d(String p0){
       this.i = p0;
    }
    public void onDraw(Canvas p0){
       int i2;
       float f;
       if (PatchProxy.applyVoidOneRefs(p0, this, EditDecorationView.class, "3")) {
          return;
       }
       if (TextUtils.x(this.i) && this.l == null) {
          super.onDraw(p0);
          return;
       }else if(this.b == null){
          super.onDraw(p0);
          return;
       }else {
          p0.save();
          p0.rotate(this.b.getFinalRotate(), (float)this.b.getContentRect().centerX(), (float)this.b.getContentRect().centerY());
          DecorationView tb = this.b;
          int i = 0;
          if (tb instanceof EditDecorationBaseDrawer) {
             tb.setOutBoxAdditionalWidth(i);
          }
          float globalScale = this.b.getGlobalScale();
          this.j.setTextSize((float)this.b(11));
          Rect outBoxRect = this.b.getOutBoxRect();
          int i1 = 1;
          if (this.l != null && !TextUtils.x(this.i)) {
             i2 = ((int)((float)this.l.getWidth() / globalScale) + this.b(i1)) + (this.b(5) * 4);
             f = this.j.measureText(this.i);
          }else if(this.l != null && TextUtils.x(this.i)){
             i2 = (int)((float)this.l.getWidth() / globalScale);
          label_00bb :
             float f1 = 2.00f;
             this.k.set((float)outBoxRect.left, ((float)outBoxRect.bottom - ((float)this.b(24) / f1)), (float)(outBoxRect.left + i2), ((float)outBoxRect.bottom + ((float)this.b(24) / f1)));
             this.j.setColor(-1);
             this.j.setStyle(Paint$Style.FILL);
             this.j.setStrokeWidth(0);
             this.j.setShadowLayer((float)this.b(10), 0, 0, EditDecorationView.p);
             p0.drawRoundRect(this.k, (float)this.b(100), (float)this.b(100), this.j);
             this.j.setShadowLayer(0, 0, 0, i);
             int i3 = this.b(5) * 2;
             EditDecorationView tl = this.l;
             if (tl != null) {
                EditDecorationView tk = this.k;
                RectF left = tk.left;
                this.n.set(left, tk.top, (((float)tl.getWidth() / globalScale) + left), (this.k.top + ((float)this.l.getHeight() / globalScale)));
                p0.drawBitmap(this.l, this.m, this.n, this.j);
                this.j.setColor(EditDecorationView.q);
                this.j.setStyle(Paint$Style.STROKE);
                this.j.setStrokeWidth((float)this.b(i1));
                this.j.setStrokeCap(Paint$Cap.ROUND);
                p0.drawLine(((this.k.left + ((float)this.l.getWidth() / globalScale)) + (float)this.b(5)), (this.k.top + (float)this.b(8)), ((this.k.left + ((float)this.l.getWidth() / globalScale)) + (float)this.b(5)), (this.k.bottom - (float)this.b(8)), this.j);
                i3 = (this.b(5) * 2) + ((int)((float)this.l.getWidth() / globalScale) + this.b(i1));
             }
             if (!TextUtils.x(this.i)) {
                this.j.setColor(EditDecorationView.o);
                this.j.setStyle(Paint$Style.FILL);
                this.j.setStrokeWidth(0);
                this.j.setTypeface(Typeface.DEFAULT_BOLD);
                tl = this.k;
                p0.drawText(this.i, ((float)i3 + tl.left), ((tl.top + (float)this.b(6)) - this.j.getFontMetrics().ascent), this.j);
             }
             tb = this.b;
             if (tb instanceof EditDecorationBaseDrawer) {
                tb.setOutBoxAdditionalWidth((int)Math.max(((this.k.right + (float)this.b(12)) - (float)this.b.getScaleOrRotateButtonRect().left), 0));
             }
             p0.restore();
             super.onDraw(p0);
             return;
          }else {
             i2 = this.b(5) * 4;
             f = this.j.measureText(this.i);
          }
          i2 = i2 + (int)f;
          goto label_00bb ;
       }
    }
    public void setIconImageRes(int p0){
       if (PatchProxy.isSupport(EditDecorationView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, EditDecorationView.class, "2")) {
          return;
       }
       if (!p0) {
          this.l = null;
          return;
       }else {
          c.a(new d(this, p0));
          return;
       }
    }
}
