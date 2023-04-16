package com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateConfigHelper;
import java.lang.Object;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateConfigHelper$fontConfigFetcher$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateConfigHelper$templateConfigFetcher$2;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateConfigHelper$localConfigList$2;
import bod.d;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import d0c.a;
import nuc.a;
import kotlin.jvm.internal.a;
import bod.e;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import com.yxcorp.gifshow.postfont.repo.RemoteFontRepo;
import t45.d;
import brd.z;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateConfigHelper$a;
import erd.o;

public final class TextTemplateConfigHelper	// class@000be9
{
    public final p a;
    public final p b;
    public final p c;

    public void TextTemplateConfigHelper(){
       super();
       this.a = s.c(TextTemplateConfigHelper$fontConfigFetcher$2.INSTANCE);
       this.b = s.c(TextTemplateConfigHelper$templateConfigFetcher$2.INSTANCE);
       this.c = s.c(TextTemplateConfigHelper$localConfigList$2.INSTANCE);
    }
    public final void a(d p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextTemplateConfigHelper.class, "7")) {
          return;
       }
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          if (a.g(uoa.d(), p0.k().e())) {
             p0.l(uoa);
             e.a(p0);
          }
       }
       return;
    }
    public final t b(boolean p0){
       CachePolicy obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TextTemplateConfigHelper textTemplate = TextTemplateConfigHelper.class;
       if (PatchProxy.isSupport(textTemplate)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, textTemplate, "4");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = (p0)? CachePolicy.NETWORK_ELSE_CACHE: CachePolicy.CACHE_ELSE_NETWORK;
       Object obj1 = PatchProxy.apply(null, this, textTemplate, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.a.getValue();
       }
       t ot = obj1.c(obj).subscribeOn(d.c).flatMap(new TextTemplateConfigHelper$a(this, p0));
       a.o(ot, "fontConfigFetcher.fetchC¡­st\)\n          }\n        }");
       return ot;
    }
}
