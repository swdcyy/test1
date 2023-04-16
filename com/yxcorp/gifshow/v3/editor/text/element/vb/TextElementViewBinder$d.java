package com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$d;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.text.element.vb.a;
import t36.f$a;
import t36.f;

public final class TextElementViewBinder$d implements Observer	// class@001401
{
    public final TextElementViewBinder b;

    public void TextElementViewBinder$d(TextElementViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextElementViewBinder$d.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             p0 = this.b.B;
             if (p0 != null) {
                p0.s0(a.a);
             }
          }
       }
       return;
    }
}
