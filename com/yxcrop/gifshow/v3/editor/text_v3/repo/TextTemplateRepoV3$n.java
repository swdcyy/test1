package com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$n;
import io.reactivex.g;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3;

public final class TextTemplateRepoV3$n implements g	// class@000c2f
{
    public final TextTemplateRepoV3 b;

    public void TextTemplateRepoV3$n(TextTemplateRepoV3 p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTemplateRepoV3$n.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       this.b.i.d(p0, Integer.valueOf(4));
       return;
    }
}
