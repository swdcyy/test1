package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder$f$b;
import a17.b$a;
import java.lang.Object;
import a17.c;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class TextVideoPreviewViewBinder$f$b implements b$a	// class@000b2f
{
    public final b$a a;

    public void TextVideoPreviewViewBinder$f$b(b$a p0){
       this.a = p0;
       super();
    }
    public void a(c p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextVideoPreviewViewBinder$f$b.class, "1")) {
          return;
       }
       a.p(p0, "sheet");
       a.p(p1, "view");
       TextVideoPreviewViewBinder$f$b ta = this.a;
       if (ta != null) {
          ta.a(p0, p1);
       }
       return;
    }
}
