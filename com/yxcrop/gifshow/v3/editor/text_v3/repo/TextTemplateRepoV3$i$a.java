package com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$i$a;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ood.d;
import java.util.Objects;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import java.lang.Integer;
import brd.g;

public final class TextTemplateRepoV3$i$a implements Runnable	// class@000c29
{
    public final TextTemplateRepoV3$i b;

    public void TextTemplateRepoV3$i$a(TextTemplateRepoV3$i p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TextTemplateRepoV3$i$a.class, "1")) {
          return;
       }
       TextTemplateRepoV3$i$a tb = this.b;
       TextTemplateRepoV3$i c = tb.c;
       TextTemplateRepoV3$i b = tb.b;
       TextTemplateRepoV3$i d = tb.d;
       Objects.requireNonNull(b);
       Object obj = PatchProxy.applyOneRefs(d, b, TextTemplateRepoV3.class, "9");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): (int)(((float)Math.min(Math.max(d.l(), 0), 100) * 0x3f000000) + ((float)Math.min(Math.max(d.m(), 0), 100) * 0x3f000000));
       c.onNext(Integer.valueOf(i));
       return;
    }
}
