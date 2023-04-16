package com.facebook.react.views.image.ReactImageView$e;
import jd.a;
import com.facebook.react.views.image.ReactImageView;
import android.graphics.Bitmap;
import sc.d;
import com.facebook.common.references.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Rect;
import android.widget.ImageView;
import android.graphics.Matrix;
import xb.t$b;
import android.graphics.Paint;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.Canvas;

public class ReactImageView$e extends a	// class@0013c1
{
    public final ReactImageView c;

    public void ReactImageView$e(ReactImageView p0){
       this.c = p0;
       super();
    }
    public a b(Bitmap p0,d p1){
       Rect obj = PatchProxy.applyTwoRefs(p0, p1, this, ReactImageView$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Rect(0, 0, this.c.getWidth(), this.c.getHeight());
       Matrix v0 = ReactImageView.V0;
       this.c.v.a(v0, obj, p0.getWidth(), p0.getHeight(), 0, 0);
       Paint paint = new Paint();
       paint.setAntiAlias(true);
       BitmapShader uBitmapShade = new BitmapShader(p0, this.c.w, this.c.w);
       uBitmapShade.setLocalMatrix(v0);
       paint.setShader(uBitmapShade);
       a uoa = p1.b(this.c.getWidth(), this.c.getHeight());
       new Canvas(uoa.j()).drawRect(obj, paint);
       a.f(uoa);
       return uoa.a();
    }
}
