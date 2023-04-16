package com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateConfigHelper$a;
import erd.o;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateConfigHelper;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import brd.t;
import java.util.Objects;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.HashMap;
import java.util.Iterator;
import java.lang.Iterable;
import d0c.a;
import java.lang.Integer;
import com.yxcorp.gifshow.postfont.repo.FontLineSpaceManager;
import java.lang.Boolean;
import qrd.p;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextRepo;
import t45.d;
import brd.z;
import lod.l;

public final class TextTemplateConfigHelper$a implements o	// class@000be5
{
    public final TextTemplateConfigHelper b;
    public final boolean c;

    public void TextTemplateConfigHelper$a(TextTemplateConfigHelper p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       Object[] obj;
       TextTemplateConfigHelper textTemplate = TextTemplateConfigHelper.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = PatchProxy.applyOneRefs(p0, this, TextTemplateConfigHelper$a.class, "1");
       if (ot != patchProxyRe) {
       }else {
          a.p(p0, "it");
          if (p0.isEmpty()) {
             p0 = t.empty();
          }else {
             TextTemplateConfigHelper$a tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidOneRefs(p0, tb, textTemplate, "6")) {
                obj = new Object[0];
                a.D().w("TextTemplateConfigHelper", "handleFontLineSpace: "+p0.size(), obj);
                HashMap hashMap = new HashMap();
                Iterator iterator = p0.iterator();
                while (iterator.hasNext()) {
                   a uoa = iterator.next();
                   String str = uoa.c();
                   if (str != null) {
                      hashMap.put(str, Integer.valueOf(uoa.f()));
                   }
                }
                FontLineSpaceManager.c.b(hashMap);
             }
             tb = this.b;
             TextTemplateConfigHelper$a tc = this.c;
             Objects.requireNonNull(tb);
             if (PatchProxy.isSupport(textTemplate)) {
                obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(tc), tb, textTemplate, "5");
                if (obj != patchProxyRe) {
                   ot = obj;
                }
             }
             DynamicTextRepo uDynamicText = PatchProxy.apply(null, tb, textTemplate, "2");
             if (uDynamicText == patchProxyRe) {
                uDynamicText = tb.b.getValue();
             }
             p0 = uDynamicText.a(tc, true).subscribeOn(d.c).flatMap(new l(tb, p0));
             a.o(p0, "templateConfigFetcher.fe¡­tStyleItemList\)\n        }");
          }
          ot = p0;
       }
       return ot;
    }
}
