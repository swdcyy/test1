package com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo$b;
import io.reactivex.g;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import bod.d;
import bod.e;
import qrd.l1;
import brd.g;

public final class TextTemplateRepo$b implements g	// class@000bef
{
    public final TextTemplateRepo b;

    public void TextTemplateRepo$b(TextTemplateRepo p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTemplateRepo$b.class, "1")) {
          return;
       }
       a.p(p0, "it");
       Iterator iterator = this.b.f.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          a.o(uod, "item");
          e.d(e.b(e.c(uod)));
       }
       p0.onNext(l1.a);
       p0.onComplete();
       return;
    }
}
