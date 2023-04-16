package com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$j;
import erd.g;
import lod.a;
import brd.v;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import ood.d;
import qkd.b;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.a;
import java.lang.Runnable;
import ekd.k1;
import e17.i;
import com.yxcorp.gifshow.util.PostUtils;

public final class TextTemplateRepoV3$j implements g	// class@000c2b
{
    public final a b;
    public final v c;

    public void TextTemplateRepoV3$j(a p0,v p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTemplateRepoV3$j.class, "1")) {
       }else {
          b.p(new File(this.b.o()));
          k1.o(new a(this, p0));
          i.a(R.style.arg_RES_7f11066a, 0x7f1014f1);
          PostUtils.D("TextTemplateRepoV3", "downloadTextTemplate", p0);
       }
       return;
    }
}
