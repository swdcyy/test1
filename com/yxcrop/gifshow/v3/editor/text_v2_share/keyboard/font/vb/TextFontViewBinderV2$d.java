package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vb.TextFontViewBinderV2$d;
import androidx.lifecycle.Observer;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vb.TextFontViewBinderV2;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import jn9.b;
import mn9.a;
import bod.a;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;

public final class TextFontViewBinderV2$d implements Observer	// class@000ba1
{
    public final TextFontViewBinderV2 b;

    public void TextFontViewBinderV2$d(TextFontViewBinderV2 p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextFontViewBinderV2$d.class, "1")) {
       }else if(p0 == null){
          TextFontViewBinderV2$d tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, TextFontViewBinderV2.class, "7")) {
             TextFontViewBinderV2 textFontView = (!p0.length())? 1: null;
             if (textFontView) {
                p0 = "SourceHanSansCN-Bold.otf";
             }
             int i = tb.e.g(p0);
             if (i >= 0) {
                tb.E(i);
                if (!i) {
                   p0 = tb.e.i(p0);
                   if (!p0 instanceof a) {
                      p0 = null;
                   }
                   if (p0 != null && !p0.c()) {
                      b.E(tb.e, i, false, null, 4, null);
                   }
                }
             label_0059 :
                b.E(tb.e, i, true, null, 4, null);
             }
          }
       }
       return;
    }
}
