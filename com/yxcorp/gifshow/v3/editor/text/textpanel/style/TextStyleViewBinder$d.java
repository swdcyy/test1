package com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$d;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class TextStyleViewBinder$d implements Observer	// class@0014d9
{
    public final TextStyleViewBinder b;

    public void TextStyleViewBinder$d(TextStyleViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextStyleViewBinder$d.class, "1")) {
       }else {
          this.b.E(p0);
       }
       return;
    }
}
