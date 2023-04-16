package com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextColorView;
import android.view.View;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$a;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$TextColors;

public class TextColorView extends View	// class@0014cf
{
    public TextStyleDataManager$a b;
    public Paint c;
    public static final float d;
    public static final float e;
    public static final float f;

    static {
       TextColorView.d = (float)a1.e(2.00f);
       TextColorView.e = (float)a1.e(3.25f);
       TextColorView.f = (float)a1.e(2.00f);
    }
    public void TextColorView(Context p0){
       super(p0);
    }
    public void TextColorView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void TextColorView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public TextStyleDataManager$a getTextColor(){
       return this.b;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextColorView.class, "3")) {
          return;
       }
       super.onDraw(p0);
       int height = this.getHeight();
       int width = this.getWidth();
       int i = (height >= width)? width: height;
       float f = ((float)i * 0x3f333333) / 2.00f;
       float e = (this.b.b != null)? TextColorView.e: TextColorView.d;
       e = e + f;
       this.c.setColor(-1);
       this.c.setStyle(Paint$Style.FILL);
       if (this.b.a.equals(TextStyleDataManager.b) && this.b.b != null) {
          this.c.setStyle(Paint$Style.STROKE);
          float f1 = TextColorView.f;
          this.c.setStrokeWidth(f1);
          e = f + f1;
       }
       float f2 = (float)(width / 2);
       float f3 = (float)(height / 2);
       p0.drawCircle(f2, f3, e, this.c);
       this.c.setColor(this.b.a.c);
       this.c.setStyle(Paint$Style.FILL);
       p0.drawCircle(f2, f3, f, this.c);
       return;
    }
    public void setTextColor(TextStyleDataManager$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextColorView.class, "1")) {
          return;
       }
       TextColorView tb = this.b;
       if (tb == null || !tb.equals(p0)) {
          this.b = p0;
       }
       this.postInvalidate();
       if (this.c == null) {
          Paint paint = new Paint();
          this.c = paint;
          paint.setColor(this.b.a.c);
          this.c.setStyle(Paint$Style.FILL);
          this.c.setAntiAlias(true);
       }
       return;
    }
}
