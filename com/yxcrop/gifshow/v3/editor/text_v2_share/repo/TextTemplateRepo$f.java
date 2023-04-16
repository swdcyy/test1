package com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo$f;
import erd.g;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class TextTemplateRepo$f implements g	// class@000bf3
{
    public final TextTemplateRepo b;

    public void TextTemplateRepo$f(TextTemplateRepo p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTemplateRepo$f.class, "1")) {
       }else {
          TextTemplateRepo$f tb = this.b;
          tb.h = false;
          a.o(p0, "it");
          tb.j(p0);
       }
       return;
    }
}
