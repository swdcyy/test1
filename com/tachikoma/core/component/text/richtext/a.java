package com.tachikoma.core.component.text.richtext.a;
import android.text.style.ClickableSpan;
import com.tachikoma.core.component.text.richtext.RichTextHelper$a;
import com.tachikoma.core.component.text.TKText;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tachikoma.core.bridge.d;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.Throwable;
import wp8.a;
import android.text.TextPaint;
import android.graphics.Color;
import com.tachikoma.core.component.e;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import com.tachikoma.core.component.text.richtext.RichTextHelper;

public final class a extends ClickableSpan	// class@000da4
{
    public final RichTextHelper$a b;
    public final TKText c;

    public void a(RichTextHelper$a p0,TKText p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       RichTextHelper$a q = this.b.q;
       if (q == null) {
          return;
       }
       V8Function v8Function = q.get();
       if (y.a(v8Function)) {
          Object[] objArray = new Object[0];
          v8Function.call(null, objArray);
       }
       return;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       super.updateDrawState(p0);
       RichTextHelper$a b = this.b.b;
       if (b != null) {
          p0.setColor(Color.parseColor(b));
       }else {
          p0.setColor(this.c.getView().getCurrentTextColor());
       }
       if (RichTextHelper.c) {
          if (!"underline".equals(this.b.h)) {
             p0.setUnderlineText(false);
          }
       }else if(!"underline".equals(this.c.getTextDecoration())){
          p0.setUnderlineText(false);
       }
       return;
    }
}
