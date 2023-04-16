package com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$c;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;

public final class TextStyleViewBinder$c implements Observer	// class@0014d8
{
    public final TextStyleViewBinder b;

    public void TextStyleViewBinder$c(TextStyleViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextStyleViewBinder$c.class, "1")) {
       }else {
          int i = p0.getSecond().intValue();
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   if (i == 4) {
                      this.b.H();
                      this.b.F();
                      this.b.G();
                   }
                }else {
                   this.b.G();
                }
             }else {
                this.b.F();
             }
          }else {
             this.b.H();
          }
       }
       return;
    }
}
