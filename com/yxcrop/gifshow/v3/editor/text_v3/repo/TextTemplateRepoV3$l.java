package com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$l;
import erd.o;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import mn9.a;
import kotlin.Pair;
import java.util.Objects;
import bod.a;
import d0c.a;
import java.util.Map;
import qrd.l1;

public final class TextTemplateRepoV3$l implements o	// class@000c2d
{
    public final TextTemplateRepoV3 b;
    public final Object c;

    public void TextTemplateRepoV3$l(TextTemplateRepoV3 p0,Object p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTemplateRepoV3$l.class, "1")) {
       }else {
          a.p(p0, "it");
          Object[] objArray = new Object[0];
          a.D().w("TextTemplateRepoV3", "loadItemList fontSize:"+p0.size()+", payload:"+this.c, objArray);
          ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
          p0 = p0.iterator();
          while (p0.hasNext()) {
             a uoa = p0.next();
             Objects.requireNonNull(uoa, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.model.FontItem");
             String str = uoa.b().d();
             if (str == null) {
                str = "";
             }
             uArrayList.add(new Pair(str, uoa));
          }
          p0 = uArrayList.iterator();
          while (p0.hasNext()) {
             Pair pair = p0.next();
             Object first = pair.getFirst();
             this.b.e.put(first, pair.getSecond());
          }
       }
       return l1.a;
    }
}
