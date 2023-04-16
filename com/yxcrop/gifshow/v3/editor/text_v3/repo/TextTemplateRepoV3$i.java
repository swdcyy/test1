package com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$i;
import erd.g;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3;
import brd.v;
import lod.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$i$a;
import java.lang.Runnable;
import ekd.k1;

public final class TextTemplateRepoV3$i implements g	// class@000c2a
{
    public final TextTemplateRepoV3 b;
    public final v c;
    public final a d;

    public void TextTemplateRepoV3$i(TextTemplateRepoV3 p0,v p1,a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTemplateRepoV3$i.class, "1")) {
          return;
       }
       k1.o(new TextTemplateRepoV3$i$a(this));
       return;
    }
}
