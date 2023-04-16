package com.tachikoma.core.component.text.c$a;
import android.text.style.ClickableSpan;
import com.tachikoma.core.component.text.c;
import hp8.g;
import com.tachikoma.core.bridge.d;
import android.widget.TextView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.V8Object;
import tx4.y;
import java.lang.Throwable;
import wp8.a;
import android.text.TextPaint;
import android.graphics.Color;

public class c$a extends ClickableSpan	// class@000d9a
{
    public final g b;
    public final d c;
    public final TextView d;
    public final c e;

    public void c$a(c p0,g p1,d p2,TextView p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       JsValueRef jsValueRef = this.e.b.get(this.b);
       if (jsValueRef == null) {
          return;
       }
       V8Function v8Function = jsValueRef.get();
       if (y.a(v8Function)) {
          Object[] objArray = new Object[0];
          v8Function.call(null, objArray);
       }
       return;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "2")) {
          return;
       }
       super.updateDrawState(p0);
       g e = this.b.e;
       if (e != null) {
          p0.setColor(Color.parseColor(e));
       }else {
          p0.setColor(this.d.getCurrentTextColor());
       }
       p0.setUnderlineText(false);
       return;
    }
}
