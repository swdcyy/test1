package com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$q;
import erd.g;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3;
import brd.v;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.middleware.resourcemanager.cache.type.Result;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import faa.a;
import q87.c;
import kotlin.jvm.internal.a;
import ood.e;
import brd.g;

public final class TextTemplateRepoV3$q implements g	// class@000c32
{
    public final TextTemplateRepoV3 b;
    public final v c;

    public void TextTemplateRepoV3$q(TextTemplateRepoV3 p0,v p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTemplateRepoV3$q.class, "1")) {
       }else {
          this.b.d = p0.getSecond();
          this.b.h();
          p0 = p0.getFirst();
          int i = 0;
          String str = "TextTemplateRepoV3";
          if (!q.f(p0)) {
             Object[] objArray = new Object[i];
             a.D().w(str, "loadItemList has result", objArray);
             ArrayList uArrayList = new ArrayList();
             if (a.g(this.b.h, "DESIGN_FONT_TEMPLATE")) {
                uArrayList.add(e.b);
             }
             uArrayList.addAll(p0);
             this.c.onNext(uArrayList);
          }else {
             Object[] objArray1 = new Object[i];
             a.D().w(str, "loadItemList empty", objArray1);
             this.c.onNext(new ArrayList());
          }
          this.c.onComplete();
       }
       return;
    }
}
