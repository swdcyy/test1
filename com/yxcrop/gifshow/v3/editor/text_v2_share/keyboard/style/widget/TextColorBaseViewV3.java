package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.style.widget.TextColorBaseViewV3;
import android.view.View;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$TextColors;
import android.graphics.Paint$Style;

public class TextColorBaseViewV3 extends View	// class@000bb5
{
    public TextStyleDataManager$a b;
    public Paint c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;

    static {
       TextColorBaseViewV3.d = (float)a1.e(2.00f);
       TextColorBaseViewV3.e = (float)a1.e(3.25f);
       TextColorBaseViewV3.f = (float)a1.e(2.00f);
       TextColorBaseViewV3.g = (float)a1.e(0x3f800000);
    }
    public void TextColorBaseViewV3(Context p0){
       super(p0);
    }
    public void TextColorBaseViewV3(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void TextColorBaseViewV3(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public TextStyleDataManager$a getTextColor(){
       return this.b;
    }
    public void setTextColor(TextStyleDataManager$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextColorBaseViewV3.class, "1")) {
          return;
       }
       TextColorBaseViewV3 tb = this.b;
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
