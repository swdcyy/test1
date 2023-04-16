package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.style.widget.TextColorViewV3;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.style.widget.TextColorBaseViewV3;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.Math;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$a;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$TextColors;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import com.yxcorp.gifshow.v3.editor.text.model.a;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager;

public class TextColorViewV3 extends TextColorBaseViewV3	// class@000bb7
{
    public static final float h;

    static {
       TextColorViewV3.h = (float)a1.e(0x3f800000);
    }
    public void TextColorViewV3(Context p0){
       super(p0);
    }
    public void TextColorViewV3(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void TextColorViewV3(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextColorViewV3.class, "1")) {
          return;
       }
       super.onDraw(p0);
       int height = this.getHeight();
       int width = this.getWidth();
       float f = (((float)Math.min(height, width) * 0x3f333333) / 2.00f) + TextColorBaseViewV3.d;
       this.c.setColor(this.b.a.c);
       this.c.setStyle(Paint$Style.FILL);
       float f1 = (float)width / 2.00f;
       float f2 = (float)height / 2.00f;
       p0.drawCircle(f1, f2, f, this.c);
       if (this.b.a.equals(a.e)) {
          this.c.setStyle(Paint$Style.STROKE);
          this.c.setStrokeWidth(TextColorBaseViewV3.g);
          this.c.setColor(TextStyleDataManager.b(R.color.arg_RES_7f0600a8));
          p0.drawCircle(f1, f2, f, this.c);
       }
       if (this.b.b != null) {
          this.c.setStyle(Paint$Style.STROKE);
          float h = TextColorViewV3.h;
          this.c.setStrokeWidth(h);
          this.c.setColor(TextStyleDataManager.b(R.color.arg_RES_7f0604b6));
          p0.drawCircle(f1, f2, f, this.c);
          f = f - h;
          this.c.setColor(TextStyleDataManager.b(R.color.arg_RES_7f060725));
          p0.drawCircle(f1, f2, f, this.c);
       }
       return;
    }
}
