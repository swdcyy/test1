package com.smile.gifshow.post.profile.AvatarCropBorderView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import lnc.a1;

public final class AvatarCropBorderView extends View	// class@000c52
{
    public HashMap b;

    public void AvatarCropBorderView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       a.p(p1, "attrs");
       super(p0, p1);
    }
    public void onDraw(Canvas p0){
       a.p(p0, "canvas");
       Paint paint = new Paint(1);
       paint.setColor(-1);
       paint.setStyle(Paint$Style.STROKE);
       float f = (float)a1.e(2.00f);
       float f1 = (float)2;
       float f2 = ((float)(this.getWidth() - (a1.d(0x7f070271) * 2)) - (f * f1)) / f1;
       paint.setStrokeWidth(f);
       p0.drawCircle((float)(this.getWidth() / 2), (float)(this.getHeight() / 2), f2, paint);
    }
}
