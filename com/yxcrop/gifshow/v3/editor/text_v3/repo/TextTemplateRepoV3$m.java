package com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$m;
import erd.o;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import brd.t;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;

public final class TextTemplateRepoV3$m implements o	// class@000c2e
{
    public final TextTemplateRepoV3 b;
    public final CachePolicy c;

    public void TextTemplateRepoV3$m(TextTemplateRepoV3 p0,CachePolicy p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, TextTemplateRepoV3$m.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          ot = this.b.c.a(this.c);
       }
       return ot;
    }
}
