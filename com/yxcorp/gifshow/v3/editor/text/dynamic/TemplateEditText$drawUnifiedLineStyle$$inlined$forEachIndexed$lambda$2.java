package com.yxcorp.gifshow.v3.editor.text.dynamic.TemplateEditText$drawUnifiedLineStyle$$inlined$forEachIndexed$lambda$2;
import msd.r;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams$c;
import com.yxcorp.gifshow.v3.editor.text.dynamic.TemplateEditText;
import android.graphics.Paint;
import java.lang.String;
import android.text.Layout;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import kotlin.jvm.internal.a;
import android.graphics.Rect;
import java.lang.Character;

public final class TemplateEditText$drawUnifiedLineStyle$$inlined$forEachIndexed$lambda$2 extends Lambda implements r	// class@0013c1
{
    public final Canvas $canvas$inlined;
    public final int $index;
    public final Layout $layout$inlined;
    public final float $lineHeight;
    public final DynamicTextParams$c $oneLayer;
    public final Paint $paint$inlined;
    public final String $text$inlined;
    public final float $textAscent;
    public final TemplateEditText this$0;

    public void TemplateEditText$drawUnifiedLineStyle$$inlined$forEachIndexed$lambda$2(float p0,DynamicTextParams$c p1,int p2,float p3,TemplateEditText p4,Paint p5,String p6,Layout p7,Canvas p8){
       this.$lineHeight = p0;
       this.$oneLayer = p1;
       this.$index = p2;
       this.$textAscent = p3;
       this.this$0 = p4;
       this.$paint$inlined = p5;
       this.$text$inlined = p6;
       this.$layout$inlined = p7;
       this.$canvas$inlined = p8;
       super(4);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3){
       this.invoke(p0.intValue(), p1, p2.floatValue(), p3.floatValue());
       return l1.a;
    }
    public final void invoke(int p0,String p1,float p2,float p3){
       if (PatchProxy.isSupport2(TemplateEditText$drawUnifiedLineStyle$$inlined$forEachIndexed$lambda$2.class, "1") && PatchProxy.applyVoidFourRefsWithListener(Integer.valueOf(p0), p1, Float.valueOf(p2), Float.valueOf(p3), this, TemplateEditText$drawUnifiedLineStyle$$inlined$forEachIndexed$lambda$2.class, "1")) {
          return;
       }
       a.p(p1, "line");
       TemplateEditText$drawUnifiedLineStyle$$inlined$forEachIndexed$lambda$2 t$oneLayer = this.$oneLayer;
       a.o(t$oneLayer, "oneLayer");
       this.this$0.l(t$oneLayer, this.$paint$inlined, new Rect((int)p2, (int)p3, (int)(this.$paint$inlined.measureText(p1) + p2), (int)(this.$lineHeight + p3)), this.$index);
       TemplateEditText$drawUnifiedLineStyle$$inlined$forEachIndexed$lambda$2 t$oneLayer1 = this.$oneLayer;
       a.o(t$oneLayer1, "oneLayer");
       this.this$0.c(t$oneLayer1, this.$index, this.$paint$inlined);
       p0 = 0;
       while (p0 < p1.length()) {
          int b = Character.isSupplementaryCodePoint(p1.codePointAt(p0));
          int i = (b)? p0 + 2: p0 + 1;
          String str = p1.substring(p0, i);
          a.o(str, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
          if (!b) {
             float f = p3 - this.$textAscent;
             this.$canvas$inlined.drawText(str, p2, f, this.$paint$inlined);
          }
          p2 = p2 + (float)(int)this.$paint$inlined.measureText(str);
          b = (b)? 2: 1;
          p0 = p0 + b;
       }
       PatchProxy.onMethodExit(TemplateEditText$drawUnifiedLineStyle$$inlined$forEachIndexed$lambda$2.class, "1");
       return;
    }
}
