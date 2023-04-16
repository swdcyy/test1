package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder$f$a;
import a17.b$b;
import java.lang.Object;
import a17.c;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class TextVideoPreviewViewBinder$f$a implements b$b	// class@000b2e
{
    public final b$b a;

    public void TextVideoPreviewViewBinder$f$a(b$b p0){
       this.a = p0;
       super();
    }
    public void a(c p0,View p1,int p2){
       if (PatchProxy.isSupport(TextVideoPreviewViewBinder$f$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, TextVideoPreviewViewBinder$f$a.class, "1")) {
          return;
       }
       a.p(p0, "sheet");
       if (!p2) {
          TextVideoPreviewViewBinder$f$a ta = this.a;
          if (ta != null) {
             ta.a(p0, p1, p2);
          }
       }
       return;
    }
}
