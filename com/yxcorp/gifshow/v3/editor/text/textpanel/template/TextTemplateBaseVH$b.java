package com.yxcorp.gifshow.v3.editor.text.textpanel.template.TextTemplateBaseVH$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.text.textpanel.template.TextTemplateBaseVH;
import ypc.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class TextTemplateBaseVH$b implements View$OnClickListener	// class@0014dd
{
    public final TextTemplateBaseVH b;
    public final a c;

    public void TextTemplateBaseVH$b(TextTemplateBaseVH p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTemplateBaseVH$b.class, "1")) {
          return;
       }
       this.b.j(this.c, false);
       return;
    }
}
