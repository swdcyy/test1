package com.yxcorp.gifshow.v3.editor.text.dynamic.TemplateEditText$drawUnifiedLineStyle$$inlined$forEachIndexed$lambda$1;
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

public final class TemplateEditText$drawUnifiedLineStyle$$inlined$forEachIndexed$lambda$1 extends Lambda implements r	// class@0013c0
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

    public void TemplateEditText$drawUnifiedLineStyle$$inlined$forEachIndexed$lambda$1(float p0,DynamicTextParams$c p1,int p2,float p3,TemplateEditText p4,Paint p5,String p6,Layout p7,Canvas p8){
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
       TemplateEditText$drawUnifiedLineStyle$$inlined$forEachIndexed$lambda$1 uodrawUnifie = this;
       Object obj = p1;
       float f = p2;
       float f1 = p3;
       String str = "1";
       if (PatchProxy.isSupport2(TemplateEditText$drawUnifiedLineStyle$$inlined$forEachIndexed$lambda$1.class, str) && PatchProxy.applyVoidFourRefsWithListener(Integer.valueOf(p0), p1, Float.valueOf(p2), Float.valueOf(p3), this, TemplateEditText$drawUnifiedLineStyle$$inlined$forEachIndexed$lambda$1.class, "1")) {
          return;
       }
       a.p(obj, "line");
       TemplateEditText$drawUnifiedLineStyle$$inlined$forEachIndexed$lambda$1 $oneLayer = uodrawUnifie.$oneLayer;
       a.o($oneLayer, "oneLayer");
       uodrawUnifie.this$0.l($oneLayer, uodrawUnifie.$paint$inlined, new Rect((int)f, (int)f1, (int)(uodrawUnifie.$paint$inlined.measureText(obj) + f), (int)(uodrawUnifie.$lineHeight + f1)), uodrawUnifie.$index);
       TemplateEditText$drawUnifiedLineStyle$$inlined$forEachIndexed$lambda$1 $oneLayer1 = uodrawUnifie.$oneLayer;
       a.o($oneLayer1, "oneLayer");
       uodrawUnifie.this$0.c($oneLayer1, uodrawUnifie.$index, uodrawUnifie.$paint$inlined);
       uodrawUnifie.this$0.h(p2, p1, uodrawUnifie.$paint$inlined, uodrawUnifie.$canvas$inlined, p3, uodrawUnifie.$textAscent, 1);
       PatchProxy.onMethodExit(TemplateEditText$drawUnifiedLineStyle$$inlined$forEachIndexed$lambda$1.class, str);
       return;
    }
}
