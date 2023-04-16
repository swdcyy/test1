package com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$d;
import erd.a;
import lod.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ood.d;
import java.io.File;
import com.yxcrop.gifshow.v3.editor.text_v3.utils.TextTemplateEnvV3;
import kotlin.jvm.internal.a;
import java.util.Objects;

public final class TextTemplateRepoV3$d implements a	// class@000c22
{
    public final a b;

    public void TextTemplateRepoV3$d(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TextTemplateRepoV3$d.class, "1")) {
          return;
       }
       TextTemplateRepoV3$d tb = this.b;
       TextTemplateRepoV3$d uod = tb;
       String absolutePath = TextTemplateEnvV3.a(tb.getId(), this.b.e()).getAbsolutePath();
       a.o(absolutePath, "TextTemplateEnvV3.getRes¡­emV3.resMd5\).absolutePath");
       Objects.requireNonNull(uod);
       if (!PatchProxy.applyVoidOneRefs(absolutePath, uod, d.class, "8")) {
          a.p(absolutePath, "<set-?>");
          uod.f = absolutePath;
       }
       this.b.u(Integer.MAX_VALUE);
       return;
    }
}
