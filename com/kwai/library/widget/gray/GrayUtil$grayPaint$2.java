package com.kwai.library.widget.gray.GrayUtil$grayPaint$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.graphics.Paint;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.ColorFilter;
import java.lang.Object;

public final class GrayUtil$grayPaint$2 extends Lambda implements a	// class@00093e
{
    public static final GrayUtil$grayPaint$2 INSTANCE;

    static {
       GrayUtil$grayPaint$2.INSTANCE = new GrayUtil$grayPaint$2();
    }
    public void GrayUtil$grayPaint$2(){
       super(0);
    }
    public final Paint invoke(){
       Paint paint = new Paint();
       ColorMatrix uColorMatrix = new ColorMatrix();
       uColorMatrix.setSaturation(0);
       paint.setColorFilter(new ColorMatrixColorFilter(uColorMatrix));
       return paint;
    }
    public Object invoke(){
       return this.invoke();
    }
}
