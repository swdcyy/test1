package com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$r;
import erd.g;
import java.lang.Object;
import brd.v;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.PostUtils;
import brd.g;

public final class TextTemplateRepoV3$r implements g	// class@000c33
{
    public final Object b;
    public final v c;

    public void TextTemplateRepoV3$r(Object p0,v p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTemplateRepoV3$r.class, "1")) {
       }else {
          a.p(p0, "throwable");
          PostUtils.D("TextTemplateRepoV3", "loadItemList fetch, payload:"+this.b, p0);
          this.c.onError(p0);
       }
       return;
    }
}
