package com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$b;
import erd.g;
import lod.a;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ood.d;
import kotlin.jvm.internal.a;
import java.lang.RuntimeException;

public final class TextTemplateRepoV3$b implements g	// class@000c1f
{
    public final a b;

    public void TextTemplateRepoV3$b(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTemplateRepoV3$b.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.u(p0.intValue());
          if (p0.intValue() == -2) {
             throw new RuntimeException("downloadTextTemplate template download failed");
          }
       }
       return;
    }
}
