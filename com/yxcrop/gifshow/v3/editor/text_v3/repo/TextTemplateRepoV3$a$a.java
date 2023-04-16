package com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$a$a;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import brd.g;

public final class TextTemplateRepoV3$a$a implements Runnable	// class@000c1d
{
    public final TextTemplateRepoV3$a b;

    public void TextTemplateRepoV3$a$a(TextTemplateRepoV3$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TextTemplateRepoV3$a$a.class, "1")) {
          return;
       }
       this.b.d.onNext(Integer.valueOf(100));
       this.b.d.onComplete();
       return;
    }
}
