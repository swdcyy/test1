package com.yxcorp.gifshow.social.profile.EmptyProfileViewHelper$Companion$fillMaterial$1$a;
import erd.o;
import java.lang.Object;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.graphics.Matrix;
import qsd.d;
import com.yxcorp.gifshow.social.profile.d;
import lnc.a1;
import java.util.Objects;
import com.yxcorp.gifshow.social.profile.d$a;
import java.lang.Integer;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;

public final class EmptyProfileViewHelper$Companion$fillMaterial$1$a implements o	// class@001d66
{
    public static final EmptyProfileViewHelper$Companion$fillMaterial$1$a b;

    static {
       EmptyProfileViewHelper$Companion$fillMaterial$1$a.b = new EmptyProfileViewHelper$Companion$fillMaterial$1$a();
    }
    public void EmptyProfileViewHelper$Companion$fillMaterial$1$a(){
       super();
    }
    public Object apply(Object p0){
       Bitmap obj = p0;
       p0 = PatchProxyResult.class;
       d$a obj1 = PatchProxy.applyOneRefs(obj, this, EmptyProfileViewHelper$Companion$fillMaterial$1$a.class, "1");
       if (obj1 != p0) {
       }else {
          a.p(obj, "it");
          Matrix matrix = new Matrix();
          matrix.postScale(0x3fa3d70a, 0x3fa3d70a);
          int width = obj.getWidth();
          int i = (d.H0(((float)width * 0x3fa3d70a)) / 2) - (width / 2);
          obj = Bitmap.createBitmap(Bitmap.createBitmap(obj, 0, 0, width, width, matrix, true), i, i, width, width, null, true);
          obj1 = d.a;
          a.o(obj, "outputBitmap");
          int i1 = a1.d(0x7f070429) / 2;
          Objects.requireNonNull(obj1);
          d$a uoa = d$a.class;
          if (PatchProxy.isSupport(uoa)) {
             obj1 = PatchProxy.applyTwoRefs(obj, Integer.valueOf(i1), obj1, uoa, "8");
             if (obj1 != p0) {
             }
          }
          p0 = Bitmap.createBitmap(obj.getWidth(), obj.getHeight(), Bitmap$Config.ARGB_8888);
          Canvas uCanvas = new Canvas(p0);
          Paint paint = new Paint();
          Rect rect = new Rect(0, 0, obj.getWidth(), obj.getHeight());
          paint.setAntiAlias(true);
          uCanvas.drawARGB(0, 0, 0, 0);
          paint.setColor((int)0xff424242);
          uCanvas.drawRoundRect(new RectF(rect), (float)i1, (float)i1, paint);
          paint.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.SRC_IN));
          uCanvas.drawBitmap(obj, rect, rect, paint);
          obj1 = p0;
       }
       return obj1;
    }
}
