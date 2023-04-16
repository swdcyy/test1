package com.smile.gifshow.post.profile.BackgroundBlackCoverView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Canvas;
import android.graphics.Paint;
import lnc.a1;
import android.graphics.Paint$Style;
import android.graphics.Rect;

public final class BackgroundBlackCoverView extends View	// class@000c53
{
    public HashMap b;

    public void BackgroundBlackCoverView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       a.p(p1, "attrs");
       super(p0, p1);
    }
    public void onDraw(Canvas p0){
       float f = (float)2;
       float f1 = ((float)this.getWidth() * 0x3f200000) / f;
       float f2 = ((float)this.getWidth() * 0.36f) / f;
       int i = (int)((float)(this.getHeight() / 2) - f1);
       int i1 = (int)((float)(this.getHeight() / 2) - f2);
       Paint paint = new Paint(3);
       paint.setColor(a1.a(R.color.arg_RES_7f061d74));
       paint.setStyle(Paint$Style.FILL);
       if (p0 != null) {
          p0.drawRect(new Rect(0, i, this.getWidth(), i1), paint);
       }
       return;
    }
}
