package com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$t;
import erd.g;
import brd.v;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.PostUtils;
import brd.g;

public final class TextTemplateRepoV3$t implements g	// class@000c35
{
    public final v b;

    public void TextTemplateRepoV3$t(v p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTemplateRepoV3$t.class, "1")) {
       }else {
          a.p(p0, "throwable");
          PostUtils.D("TextTemplateRepoV3", "loadTab fetch", p0);
          this.b.onError(p0);
       }
       return;
    }
}
