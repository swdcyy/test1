package com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$s;
import erd.g;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3;
import brd.v;
import java.lang.Object;
import com.kwai.middleware.resourcemanager.cache.type.Result;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.ArrayList;
import brd.g;

public final class TextTemplateRepoV3$s implements g	// class@000c34
{
    public final TextTemplateRepoV3 b;
    public final v c;

    public void TextTemplateRepoV3$s(TextTemplateRepoV3 p0,v p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTemplateRepoV3$s.class, "1")) {
       }else {
          TextTemplateRepoV3$s tb = this.b;
          tb.d = p0;
          tb.h();
          tb = this.c;
          if (p0 != null) {
             p0 = p0.a();
             if (p0 != null) {
             label_0024 :
                tb.onNext(p0);
                this.c.onComplete();
             }
          }
          p0 = new ArrayList();
          goto label_0024 ;
       }
       return;
    }
}
