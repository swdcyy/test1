package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.style.widget.TextColorViewV2;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.style.widget.TextColorBaseViewV3;
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
import android.graphics.Paint;
import android.graphics.Paint$Style;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$TextColors;

public class TextColorViewV2 extends TextColorBaseViewV3	// class@000bb6
{

    public void TextColorViewV2(Context p0){
       super(p0);
    }
    public void TextColorViewV2(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void TextColorViewV2(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextColorViewV2.class, "1")) {
          return;
       }
       super.onDraw(p0);
       int height = this.getHeight();
       int width = this.getWidth();
       float f = 2.00f;
       float f1 = ((float)Math.min(height, width) * 0x3f333333) / f;
       float e = (this.b.b != null)? TextColorBaseViewV3.e: TextColorBaseViewV3.d;
       e = e + f1;
       this.c.setColor(-1);
       this.c.setStyle(Paint$Style.FILL);
       if (this.b.a.equals(TextStyleDataManager.b) && this.b.b != null) {
          this.c.setStyle(Paint$Style.STROKE);
          float f2 = TextColorBaseViewV3.f;
          this.c.setStrokeWidth(f2);
          e = f1 + f2;
       }
       float f3 = (float)width / f;
       float f4 = (float)height / f;
       p0.drawCircle(f3, f4, e, this.c);
       this.c.setColor(this.b.a.c);
       this.c.setStyle(Paint$Style.FILL);
       p0.drawCircle(f3, f4, f1, this.c);
       return;
    }
}
