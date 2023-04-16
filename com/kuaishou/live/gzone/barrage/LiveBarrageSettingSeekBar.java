package com.kuaishou.live.gzone.barrage.LiveBarrageSettingSeekBar;
import com.kwai.library.widget.seekbar.KwaiSeekBar;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar;
import android.content.res.Resources;
import lnc.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.Canvas;
import android.graphics.Rect;
import java.lang.Boolean;

public class LiveBarrageSettingSeekBar extends KwaiSeekBar	// class@001c2c
{
    public Drawable r;
    public Drawable s;
    public Paint t;
    public int u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    public void LiveBarrageSettingSeekBar(Context p0){
       super(p0);
    }
    public void LiveBarrageSettingSeekBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveBarrageSettingSeekBar(Context p0,AttributeSet p1,int p2){
       int color;
       LayerDrawable layerDrawabl;
       super(p0, p1, p2);
       this.r = this.getProgressDrawable();
       Resources resources = p0.getResources();
       p2 = resources.getColor(R.color.arg_RES_7f060c8f);
       color = resources.getColor(R.color.arg_RES_7f060c8f);
       float f = (float)a1.e(3.00f);
       if (PatchProxy.isSupport(LiveBarrageSettingSeekBar.class)) {
          layerDrawabl = PatchProxy.applyThreeRefs(Integer.valueOf(p2), Integer.valueOf(color), Float.valueOf(f), null, LiveBarrageSettingSeekBar.class, "3");
          if (layerDrawabl != PatchProxyResult.class) {
          label_00b4 :
             this.s = layerDrawabl;
             Paint paint = new Paint();
             this.t = paint;
             paint.setStyle(Paint$Style.FILL);
             this.t.setColor(resources.getColor(R.color.arg_RES_7f062044));
             return;
          }
       }
       RectF rectF = new RectF(0, 0, 0, 0);
       float[] uofloatArray = new float[]{f,f,f,f,f,f,f,f};
       ShapeDrawable shapeDrawabl = new ShapeDrawable(new RoundRectShape(uofloatArray, rectF, uofloatArray));
       shapeDrawabl.getPaint().setColor(p2);
       shapeDrawabl.getPaint().setStyle(Paint$Style.FILL);
       ShapeDrawable shapeDrawabl1 = new ShapeDrawable(new RoundRectShape(uofloatArray, rectF, uofloatArray));
       shapeDrawabl1.getPaint().setColor(color);
       shapeDrawabl1.getPaint().setStyle(Paint$Style.FILL);
       Drawable[] uDrawableArr = new Drawable[]{shapeDrawabl,new ClipDrawable(shapeDrawabl1, 3, 1)};
       layerDrawabl = new LayerDrawable(uDrawableArr);
       layerDrawabl.setId(0, 0x1020000);
       layerDrawabl.setId(1, 0x102000d);
       goto label_00b4 ;
    }
    public synchronized void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBarrageSettingSeekBar.class, "2")) {
          return;
       }
       super.onDraw(p0);
       int i = this.getMax() + 1;
       this.u = i;
       if (i > 10) {
          return;
       }
       this.v = (float)this.getProgressDrawable().getBounds().height() / 2.00f;
       this.w = (float)this.getHeight() / 2.00f;
       this.x = (float)this.getPaddingLeft() + this.v;
       float f = ((float)this.getWidth() - this.v) - (float)this.getPaddingRight();
       this.y = f;
       this.z = (f - this.x) / (float)(this.u - 1);
       i = 0;
       while (i < this.u) {
          if (i != this.getProgress()) {
             float f1 = (float)i * this.z;
             float f2 = this.x + f1;
             p0.drawCircle(f2, this.w, this.v, this.t);
          }
          i = i + 1;
       }
       return;
    }
    public void setEnabled(boolean p0){
       if (PatchProxy.isSupport(LiveBarrageSettingSeekBar.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveBarrageSettingSeekBar.class, "1")) {
          return;
       }
       Rect bounds = this.getProgressDrawable().getBounds();
       if (p0) {
          this.setProgressDrawable(this.r);
          this.t.setColor(a1.a(R.color.arg_RES_7f062044));
       }else {
          this.setProgressDrawable(this.s);
          this.t.setColor(a1.a(R.color.arg_RES_7f06203d));
       }
       this.getProgressDrawable().setBounds(bounds);
       super.setEnabled(p0);
       return;
    }
}
