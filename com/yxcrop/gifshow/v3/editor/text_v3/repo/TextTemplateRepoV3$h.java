package com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$h;
import erd.a;
import lod.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ood.d;
import bod.a;

public final class TextTemplateRepoV3$h implements a	// class@000c28
{
    public final a b;

    public void TextTemplateRepoV3$h(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       String str;
       if (PatchProxy.applyVoid(null, this, TextTemplateRepoV3$h.class, "1")) {
          return;
       }
       TextTemplateRepoV3$h tb = this.b;
       TextTemplateRepoV3$h oh = tb;
       a uoa = tb.j();
       if (uoa != null) {
          str = uoa.e();
          if (str != null) {
          label_0022 :
             oh.s(str);
             this.b.t(Integer.MAX_VALUE);
             return;
          }
       }
       str = "";
       goto label_0022 ;
    }
}
