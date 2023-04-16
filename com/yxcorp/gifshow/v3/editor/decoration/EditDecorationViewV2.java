package com.yxcorp.gifshow.v3.editor.decoration.EditDecorationViewV2;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationViewV2$a;
import nsd.u;
import lnc.a1;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationViewV2$b;
import java.lang.Runnable;
import t45.c;
import com.yxcorp.gifshow.decoration.widget.DecorationView;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import android.view.View;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import android.graphics.Rect;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.DrawFilter;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData$CustomButtonMode;
import com.kwai.robust.PatchProxyResult;
import wpc.t;
import java.lang.Enum;

public final class EditDecorationViewV2 extends EditDecorationView	// class@000f09
{
    public Bitmap r;
    public Bitmap s;
    public Bitmap t;
    public HashMap u;
    public static final int v;
    public static final EditDecorationViewV2$a w;

    static {
       EditDecorationViewV2.w = new EditDecorationViewV2$a(null);
       EditDecorationViewV2.v = a1.d(0x7f070187);
    }
    public void EditDecorationViewV2(Context p0){
       a.p(p0, "context");
       super(p0);
       this.c();
    }
    public void EditDecorationViewV2(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.c();
    }
    public void EditDecorationViewV2(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.c();
    }
    private final void c(){
       if (PatchProxy.applyVoid(null, this, EditDecorationViewV2.class, "1")) {
          return;
       }
       c.a(new EditDecorationViewV2$b(this));
       if (this.g == null) {
          Paint paint = new Paint(1);
          this.g = paint;
          a.o(paint, "selectBoxPaint");
          paint.setStyle(Paint$Style.STROKE);
          DecorationView tg = this.g;
          a.o(tg, "selectBoxPaint");
          tg.setStrokeWidth((float)EditDecorationViewV2.v);
          tg = this.g;
          a.o(tg, "selectBoxPaint");
          tg.setColor(a1.a(R.color.arg_RES_7f061c3e));
       }
       return;
    }
    public void draw(Canvas p0){
       DecorationView tc;
       DecorationView tc1;
       EditDecorationViewV2 tt;
       if (PatchProxy.applyVoidOneRefs(p0, this, EditDecorationViewV2.class, "2")) {
          return;
       }
       a.p(p0, "canvas");
       if (this.b == null) {
          super.draw(p0);
          return;
       }else {
          p0.save();
          DecorationView tb = this.b;
          String str = "mDecorationDrawer";
          a.o(tb, str);
          DecorationView tb1 = this.b;
          a.o(tb1, str);
          DecorationView tb2 = this.b;
          a.o(tb2, str);
          p0.rotate(tb.getFinalRotate(), (float)tb1.getContentRect().centerX(), (float)tb2.getContentRect().centerY());
          tb = this.b;
          int i = 3;
          if (tb.mIsSelected != null) {
             a.o(tb, str);
             p0.drawRect(tb.getOutBoxRect(), this.g);
             p0.setDrawFilter(new PaintFlagsDrawFilter(0, i));
          }
          if (this.c != null) {
             tb = this.b;
             a.o(tb, str);
             if (tb.isRemoveEnable()) {
                tc = this.c;
                a.o(tc, "mRemoveButtonBitmap");
                tc1 = this.c;
                a.o(tc1, "mRemoveButtonBitmap");
                tc = this.b;
                a.o(tc, str);
                p0.drawBitmap(this.c, new Rect(0, 0, tc.getWidth(), tc1.getHeight()), tc.getRemoveButtonRect(), this.f);
             }
          }
          if (this.e != null) {
             tb = this.b;
             a.o(tb, str);
             if (tb.isScaleEnable()) {
                tb = this.b;
                a.o(tb, str);
                if (!tb.isRotateEnable()) {
                   tc = this.e;
                   a.o(tc, "mScaleButtonBitmap");
                   tc1 = this.e;
                   a.o(tc1, "mScaleButtonBitmap");
                   tc = this.b;
                   a.o(tc, str);
                   p0.drawBitmap(this.e, new Rect(0, 0, tc.getWidth(), tc1.getHeight()), tc.getScaleOrRotateButtonRect(), this.f);
                }
             }
          }
          if (this.d != null) {
             tb = this.b;
             a.o(tb, str);
             if (tb.isScaleEnable()) {
                tb = this.b;
                a.o(tb, str);
                if (tb.isRotateEnable()) {
                   tc = this.d;
                   a.o(tc, "mScaleAndRotateButtonBitmap");
                   tc1 = this.d;
                   a.o(tc1, "mScaleAndRotateButtonBitmap");
                   tc = this.b;
                   a.o(tc, str);
                   p0.drawBitmap(this.d, new Rect(0, 0, tc.getWidth(), tc1.getHeight()), tc.getScaleOrRotateButtonRect(), this.f);
                }
             }
          }
          tb = this.b;
          a.o(tb, str);
          BaseDrawerData$CustomButtonMode customButton = tb.getCustomButtonMode();
          a.o(customButton, "mDecorationDrawer.customButtonMode");
          EditDecorationViewV2 uEditDecorat = PatchProxy.applyOneRefs(customButton, this, EditDecorationViewV2.class, "3");
          if (uEditDecorat != PatchProxyResult.class) {
          }else {
             int i1 = t.a[customButton.ordinal()];
             if (i1 != 1) {
                if (i1 != 2) {
                   tb = (i1 != i)? null: this.t;
                }else {
                   tt = this.s;
                }
             }else {
                tt = this.r;
             }
             uEditDecorat = tb;
          }
          tb = this.b;
          a.o(tb, str);
          if (tb.isCustomButtonEnable() && uEditDecorat != null) {
             tb2 = this.b;
             a.o(tb2, str);
             Rect customButton1 = tb2.getCustomButtonRect();
             p0.drawBitmap(uEditDecorat, new Rect(0, 0, uEditDecorat.getWidth(), uEditDecorat.getHeight()), customButton1, this.f);
          }
          p0.restore();
          return;
       }
    }
}
