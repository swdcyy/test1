package com.kuaishou.gifshow.kuaishan.ui.ColorRoundTextView;
import com.yxcorp.gifshow.widget.EmojiTextView;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import lnc.a1;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import android.widget.TextView;
import android.graphics.Canvas;
import java.lang.Boolean;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;

public final class ColorRoundTextView extends EmojiTextView	// class@001aaa
{
    public final RectF v;
    public final Paint w;
    public float x;

    public void ColorRoundTextView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void ColorRoundTextView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void ColorRoundTextView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.v = new RectF();
       Paint paint = new Paint(1);
       this.w = paint;
       paint.setStyle(Paint$Style.FILL);
       paint.setColor(a1.a(R.color.arg_RES_7f062046));
    }
    public static void v(ColorRoundTextView p0,int p1,float p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = 0xbf800000;
       }
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(ColorRoundTextView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), Float.valueOf(p2), p0, ColorRoundTextView.class, "3")) {
          p0.w.setColor(p1);
          if (p2 - (float)0 >= 0) {
             p0.x = p2;
          }
          p0.invalidate();
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ColorRoundTextView.class, "2")) {
          return;
       }
       a.p(p0, "canvas");
       p0.drawRoundRect(this.v, this.x, this.x, this.w);
       super.onDraw(p0);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(ColorRoundTextView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ColorRoundTextView.class, "1")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.v.set(0, 0, (float)this.getWidth(), (float)this.getHeight());
       this.x = (float)this.getHeight() / 2.00f;
       return;
    }
}
