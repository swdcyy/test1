package com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo$c;
import erd.g;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class TextTemplateRepo$c implements g	// class@000bf0
{
    public final TextTemplateRepo b;

    public void TextTemplateRepo$c(TextTemplateRepo p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTemplateRepo$c.class, "1")) {
       }else {
          this.b.k(new ArrayList(this.b.f));
          p0.h = false;
       }
       return;
    }
}
