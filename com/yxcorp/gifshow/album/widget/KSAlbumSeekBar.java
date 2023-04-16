package com.yxcorp.gifshow.album.widget.KSAlbumSeekBar;
import com.kwai.library.widget.seekbar.KwaiSeekBar;
import android.content.Context;
import android.util.AttributeSet;
import lnc.a1;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
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
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ClipDrawable;

public class KSAlbumSeekBar extends KwaiSeekBar	// class@001b06
{

    public void KSAlbumSeekBar(Context p0,AttributeSet p1){
       super(p0, p1);
       this.setProgressDrawable(this.c((float)a1.e(36.00f)));
    }
    public void KSAlbumSeekBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.setProgressDrawable(this.c((float)a1.e(36.00f)));
    }
    public final Drawable c(float p0){
       RectF obj;
       if (PatchProxy.isSupport(KSAlbumSeekBar.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, KSAlbumSeekBar.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new RectF(0, 0, 0, 0);
       float[] uofloatArray = new float[]{p0,p0,p0,p0,p0,p0,p0,p0};
       ShapeDrawable shapeDrawabl = new ShapeDrawable(new RoundRectShape(uofloatArray, null, null));
       shapeDrawabl.getPaint().setColor(0x4cffffff);
       shapeDrawabl.getPaint().setStyle(Paint$Style.FILL);
       ShapeDrawable shapeDrawabl1 = new ShapeDrawable(new RoundRectShape(uofloatArray, null, null));
       shapeDrawabl1.getPaint().setColor(0xf000000);
       shapeDrawabl1.getPaint().setStyle(Paint$Style.STROKE);
       shapeDrawabl1.getPaint().setStrokeWidth(0x3f800000);
       shapeDrawabl1.getPaint().setShadowLayer((float)a1.e(4.00f), 0, 0, 0x40000000);
       Drawable[] uDrawableArr = new Drawable[]{shapeDrawabl,shapeDrawabl1};
       shapeDrawabl1 = new ShapeDrawable(new RoundRectShape(uofloatArray, null, null));
       shapeDrawabl1.getPaint().setColor(-1);
       shapeDrawabl1.getPaint().setStyle(Paint$Style.FILL);
       InsetDrawable insetDrawabl = new InsetDrawable(shapeDrawabl1, 0, 0, 0, 0);
       ClipDrawable uClipDrawabl = new ClipDrawable(uofloatArray, 3, 1);
       Drawable[] uDrawableArr1 = new Drawable[]{new LayerDrawable(uDrawableArr),uClipDrawabl};
       LayerDrawable layerDrawabl = new LayerDrawable(uDrawableArr1);
       layerDrawabl.setId(0, 0x1020000);
       layerDrawabl.setId(1, 0x102000d);
       return layerDrawabl;
    }
}
