package com.yxcorp.gifshow.v3.editor.text.font.TextFontViewBinder$a;
import yuc.d;
import com.yxcorp.gifshow.v3.editor.text.font.TextFontViewBinder;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class TextFontViewBinder$a implements d	// class@00142d
{
    public final TextFontViewBinder a;

    public void TextFontViewBinder$a(TextFontViewBinder p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextFontViewBinder$a.class, "1")) {
          return;
       }
       a.p(p0, "fontFileName");
       this.a.G(p0);
       return;
    }
}
