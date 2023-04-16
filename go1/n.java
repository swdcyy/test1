package go1.n;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.like.i;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.widget.ProgressBar;
import ko1.b0;
import lo1.c;
import com.kuaishou.live.common.core.component.like.h;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import android.graphics.Bitmap;
import java.util.Objects;
import android.animation.AnimatorSet;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import lnc.a1;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.content.res.Resources;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import io1.a;
import go1.s;
import android.animation.Animator$AnimatorListener;

public class n extends AnimatorListenerAdapter	// class@00253c
{
    public final i a;

    public void n(i p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       int i;
       Animator[] uAnimatorArr;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, n.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       n a = obj.a;
       a.r = true;
       a.B.setVisibility(0);
       obj.a.C.setVisibility(0);
       obj.a.B.setScaleX(0.20f);
       obj.a.B.setScaleY(0.20f);
       Bitmap uBitmap = k0.a(obj.a.W.d(), h.a).orNull();
       if (uBitmap == null) {
          obj.a.B.setImageResource(R.drawable.arg_RES_7f081317);
       }else {
          obj.a.B.setImageBitmap(uBitmap);
       }
       float f = 0;
       obj.a.B.setAlpha(f);
       a = obj.a;
       Objects.requireNonNull(a);
       i oi = i.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, a, oi, "15")) {
          AnimatorSet uAnimatorSet = new AnimatorSet();
          long l = 200;
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(a.B, View.SCALE_X, new float[2]{0x3e4ccccd,0x3f666666}).setDuration(l);
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(a.B, View.SCALE_Y, new float[2]{0x3e4ccccd,0x3f666666}).setDuration(l);
          ObjectAnimator objectAnimat2 = j.a(a.B, new float[2]{0,0x3f800000}).setDuration(100);
          i = 4;
          if (!PatchProxy.applyVoid(objArray, a, oi, "11")) {
             a.C.setMax(50);
             try{
                oi = 0x41900000;
                float f1 = (float)a1.e(oi);
                float[] uofloatArray = new float[]{f1,f1,f1,f1,f1,f1,f1,f1};
                ShapeDrawable shapeDrawabl = new ShapeDrawable(new RoundRectShape(uofloatArray, new RectF(f, f, f, f), uofloatArray));
                shapeDrawabl.getPaint().setColor(a1.a(R.color.arg_RES_7f061474));
                shapeDrawabl.getPaint().setStyle(Paint$Style.FILL);
                int[] ointArray = new int[]{Color.parseColor(a.u),Color.parseColor(a.v)};
                GradientDrawable gradientDraw = new GradientDrawable(GradientDrawable$Orientation.LEFT_RIGHT, ointArray);
                gradientDraw.setCornerRadii(uofloatArray);
                gradientDraw.setGradientType(0);
                ClipDrawable uClipDrawabl = new ClipDrawable(gradientDraw, 3, true);
                Drawable[] uDrawableArr = new Drawable[]{shapeDrawabl,uClipDrawabl};
                LayerDrawable layerDrawabl = new LayerDrawable(uDrawableArr);
                layerDrawabl.setId(0, 0x1020000);
                layerDrawabl.setId(true, 0x102000d);
                a.C.setProgressDrawable(layerDrawabl);
             }catch(java.lang.Exception e0){
                a.C.setProgressDrawable(a.l8().getDrawable(R.drawable.arg_RES_7f080240));
             }
          }
       }
       return;
    }
}
