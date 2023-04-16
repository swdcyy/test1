package com.yxcorp.gifshow.v3.editor.text.dynamic.TemplateEditText$drawDifferentLineStyle$1;
import msd.r;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.text.dynamic.TemplateEditText;
import android.graphics.Paint;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Number;
import java.lang.String;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import kotlin.jvm.internal.a;
import android.graphics.Rect;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams$TextParams;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams$a;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams$c;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams$PointParams;
import lnc.a1;

public final class TemplateEditText$drawDifferentLineStyle$1 extends Lambda implements r	// class@0013bf
{
    public final Canvas $canvas;
    public final Paint $paint;
    public final TemplateEditText this$0;

    public void TemplateEditText$drawDifferentLineStyle$1(TemplateEditText p0,Paint p1,Canvas p2){
       this.this$0 = p0;
       this.$paint = p1;
       this.$canvas = p2;
       super(4);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3){
       this.invoke(p0.intValue(), p1, p2.floatValue(), p3.floatValue());
       return l1.a;
    }
    public final void invoke(int p0,String p1,float p2,float p3){
       DynamicTextParams$a uoa;
       if (PatchProxy.isSupport(TemplateEditText$drawDifferentLineStyle$1.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Float.valueOf(p2), Float.valueOf(p3), this, TemplateEditText$drawDifferentLineStyle$1.class, "1")) {
          return;
       }
       a.p(p1, "line");
       float f = this.$paint.ascent();
       Rect rect = new Rect((int)p2, (int)p3, (int)(this.$paint.measureText(p1) + p2), (int)((this.$paint.descent() - f) + p3));
       TemplateEditText$drawDifferentLineStyle$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (PatchProxy.isSupport(TemplateEditText.class)) {
          uoa = PatchProxy.applyOneRefs(Integer.valueOf(p0), tthis$0, TemplateEditText.class, "11");
          if (uoa != PatchProxyResult.class) {
          }else {
          label_0064 :
             DynamicTextParams text = tthis$0.n.text;
             DynamicTextParams$TextParams topCount = text.topCount;
             if (p0 < topCount) {
                uoa = text.topLayers.get(p0).layers;
                a.o(uoa, "dynamicParams.text.topLayers[index].layers");
             }else {
                uoa = text.repeatLayers.get(((p0 - topCount) % text.repeatCount)).layers;
                a.o(uoa, "dynamicParams.text.repea¡­ayers[repeatIndex].layers");
             }
          }
       }else {
          goto label_0064 ;
       }
       Iterator iterator = uoa.iterator();
       while (iterator.hasNext()) {
          DynamicTextParams$c uoc = iterator.next();
          this.this$0.l(uoc, this.$paint, rect, p0);
          DynamicTextParams$c offset = uoc.offset;
          TemplateEditText$drawDifferentLineStyle$1 uodrawDiffer = null;
          if (!offset.x - uodrawDiffer && !offset.y - uodrawDiffer) {
             float f1 = p3 - f;
             this.$canvas.drawText(p1, p2, f1, this.$paint);
          }else {
             this.$canvas.save();
             this.$canvas.translate((float)a1.e(uoc.offset.x), (float)a1.e(uoc.offset.y));
             this.this$0.h(p2, p1, this.$paint, this.$canvas, p3, f, false);
             this.$canvas.restore();
          }
       }
       return;
    }
}
