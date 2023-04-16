package com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$f;
import io.reactivex.g;
import java.util.List;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;
import crd.a;
import java.util.concurrent.CountDownLatch;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import brd.w;
import brd.t;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$f$a;
import brd.y;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$f$b;
import erd.f;

public final class PicTemplatePageParamBuilderPresenter$f implements g	// class@001303
{
    public final List b;

    public void PicTemplatePageParamBuilderPresenter$f(List p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplatePageParamBuilderPresenter$f.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       int i = this.b.size();
       Float[] uFloatArray = new Float[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          uFloatArray[i1] = Float.valueOf(0);
       }
       a uoa = new a();
       CountDownLatch uCountDownLa = new CountDownLatch(this.b.size());
       Iterator iterator = this.b.iterator();
       i1 = 0;
       while (iterator.hasNext()) {
          PicTemplatePageParamBuilderPresenter$f$a obj = iterator.next();
          int i2 = i1 + 1;
          if (i1 < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          obj = new PicTemplatePageParamBuilderPresenter$f$a(i1, this, uoa, p0, uCountDownLa, uFloatArray);
          t.wrap(obj).subscribe(v13);
          i1 = i2;
       }
       p0.setCancellable(new PicTemplatePageParamBuilderPresenter$f$b(uoa));
       return;
    }
}
