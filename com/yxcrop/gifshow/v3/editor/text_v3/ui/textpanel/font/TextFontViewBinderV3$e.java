package com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.font.TextFontViewBinderV3$e;
import androidx.lifecycle.Observer;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.font.TextFontViewBinderV3;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import jn9.b;
import mn9.a;
import bod.a;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;

public final class TextFontViewBinderV3$e implements Observer	// class@000c58
{
    public final TextFontViewBinderV3 b;

    public void TextFontViewBinderV3$e(TextFontViewBinderV3 p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextFontViewBinderV3$e.class, "1")) {
       }else if(p0 == null){
          TextFontViewBinderV3$e tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, TextFontViewBinderV3.class, "7")) {
             TextFontViewBinderV3 textFontView = (!p0.length())? 1: null;
             if (textFontView) {
                p0 = "SourceHanSansCN-Bold.otf";
             }
             int i = tb.h.g(p0);
             if (i >= 0) {
                tb.E(i);
                if (!i) {
                   p0 = tb.h.i(p0);
                   if (!p0 instanceof a) {
                      p0 = null;
                   }
                   if (p0 != null && !p0.c()) {
                      b.E(tb.h, i, false, null, 4, null);
                   }
                }
             label_0059 :
                b.E(tb.h, i, true, null, 4, null);
             }else {
                tb.h.d();
             }
          }
       }
       return;
    }
}
