package com.yxcorp.gifshow.decoration.widget.DecorationView;
import android.view.View;
import lnc.a1;
import android.content.Context;
import android.graphics.Paint;
import aw9.a0;
import java.lang.Runnable;
import t45.c;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import java.lang.Object;
import java.util.Objects;
import android.graphics.BitmapFactory$Options;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Rect;
import xv9.b;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.DrawFilter;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;

public class DecorationView extends View	// class@0012b9
{
    public DecorationDrawer b;
    public Bitmap c;
    public Bitmap d;
    public Bitmap e;
    public Paint f;
    public Paint g;
    public static final int h;

    static {
       DecorationView.h = a1.d(0x7f070187);
    }
    public void DecorationView(Context p0){
       super(p0);
       this.f = new Paint();
       this.g = null;
       c.a(new a0(this));
       this.f.setColor(a1.a(R.color.arg_RES_7f061c32));
       this.f.setStyle(Paint$Style.STROKE);
       this.f.setAntiAlias(true);
       this.f.setStrokeWidth((float)DecorationView.h);
    }
    public void DecorationView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.f = new Paint();
       this.g = null;
       c.a(new a0(this));
       this.f.setColor(a1.a(R.color.arg_RES_7f061c32));
       this.f.setStyle(Paint$Style.STROKE);
       this.f.setAntiAlias(true);
       this.f.setStrokeWidth((float)DecorationView.h);
    }
    public void DecorationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = new Paint();
       this.g = null;
       c.a(new a0(this));
       this.f.setColor(a1.a(R.color.arg_RES_7f061c32));
       this.f.setStyle(Paint$Style.STROKE);
       this.f.setAntiAlias(true);
       this.f.setStrokeWidth((float)DecorationView.h);
    }
    public static void a(DecorationView p0){
       Objects.requireNonNull(p0);
       BitmapFactory$Options options = new BitmapFactory$Options();
       int dECORATION_R = BaseDrawer.DECORATION_REMOVE_ICON_WIDTH;
       options.outHeight = dECORATION_R;
       options.outWidth = dECORATION_R;
       p0.c = BitmapFactory.decodeResource(a.a().a().getResources(), 0x7f081c64, options);
       dECORATION_R = BaseDrawer.DECORATION_SCALE_ROTATE_ICON_WIDTH;
       options.outHeight = dECORATION_R;
       options.outWidth = dECORATION_R;
       p0.d = BitmapFactory.decodeResource(a.a().a().getResources(), 0x7f081b3d, options);
       options.outHeight = dECORATION_R;
       options.outWidth = dECORATION_R;
       p0.e = BitmapFactory.decodeResource(a.a().a().getResources(), 0x7f081b25, options);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationView.class, "1")) {
          return;
       }
       super.onDraw(p0);
       if (this.b == null) {
          return;
       }
       p0.save();
       p0.rotate(this.b.getFinalRotate(), (float)this.b.getContentRect().centerX(), (float)this.b.getContentRect().centerY());
       int i = 0;
       if (!this.b.isEnableSelectBox()) {
          Paint a = b.a;
       }else {
          Rect outBoxRect = this.b.getOutBoxRect();
          DecorationView tg = this.g;
          if (tg != null) {
             p0.drawRect(outBoxRect, tg);
          }else {
             p0.drawRect(outBoxRect, this.f);
          }
          p0.setDrawFilter(new PaintFlagsDrawFilter(i, 3));
       }
       if (this.c != null && this.b.isRemoveEnable()) {
          p0.drawBitmap(this.c, new Rect(i, i, this.c.getWidth(), this.c.getHeight()), this.b.getRemoveButtonRect(), this.f);
       }
       if (this.d != null && (this.b.isScaleEnable() && this.b.isRotateEnable())) {
          p0.drawBitmap(this.d, new Rect(i, i, this.d.getWidth(), this.d.getHeight()), this.b.getScaleOrRotateButtonRect(), this.f);
       }
    label_00b9 :
       if (this.e != null && (this.b.isScaleEnable() && !this.b.isRotateEnable())) {
          p0.drawBitmap(this.e, new Rect(i, i, this.e.getWidth(), this.e.getHeight()), this.b.getScaleOrRotateButtonRect(), this.f);
       }
    label_00eb :
       p0.restore();
       return;
    }
    public void setDecorationDrawer(DecorationDrawer p0){
       this.b = p0;
    }
}
