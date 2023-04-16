package com.tachikoma.core.component.text.richtext.d;
import erd.g;
import com.tachikoma.core.component.text.richtext.RichTextHelper$a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import zp8.a;

public final class d implements g	// class@000da7
{
    public final RichTextHelper$a b;

    public void d(RichTextHelper$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          a.g("richText loadDrawable request exception, image: "+this.b.i, p0);
       }
       return;
    }
}
