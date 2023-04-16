package com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$c;
import com.yxcorp.gifshow.v3.editor.template.data.DefaultPicTemplateProvider;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$a;
import brd.a0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Iterator;
import brd.m;
import ytc.j;
import brd.q;
import kotlin.jvm.internal.a;
import brd.t;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$d;
import erd.o;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$e;
import brd.w;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$f;
import io.reactivex.g;

public final class PicTemplatePageParamBuilderPresenter	// class@00130b
{
    public final PicTemplatePageParamBuilderPresenter$c a;
    public final DefaultPicTemplateProvider b;
    public List c;
    public PicTemplatePageParamBuilderPresenter$b d;

    public void PicTemplatePageParamBuilderPresenter(){
       super();
       this.a = new PicTemplatePageParamBuilderPresenter$c();
       this.b = new DefaultPicTemplateProvider(1);
    }
    public final a0 a(PicTemplatePageParamBuilderPresenter$a p0,PicTemplatePageParamBuilderPresenter$c p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, PicTemplatePageParamBuilderPresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = CollectionsKt___CollectionsKt.L1(p0.b()).iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          m om = PatchProxy.applyTwoRefs(str, p1, this, PicTemplatePageParamBuilderPresenter.class, "5");
          if (om != PatchProxyResult.class) {
          }else {
             om = m.E(new j(this, str, p1));
             a.o(om, "Maybe.wrap { up ->\n     ¡­       }\n        }\)\n    }");
          }
          obj.add(om);
       }
       a0 uoa0 = t.fromIterable(obj).flatMapMaybe(PicTemplatePageParamBuilderPresenter$d.b).onErrorResumeNext(PicTemplatePageParamBuilderPresenter$e.b).toList();
       a.o(uoa0, "Observable.fromIterable\(¡­\n      }\)\n      .toList\(\)");
       return uoa0;
    }
    public final t b(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplatePageParamBuilderPresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       t ot = t.create(new PicTemplatePageParamBuilderPresenter$f(p0));
       a.o(ot, "Observable.create { emit¡­s.dispose\(\)\n      }\n    }");
       return ot;
    }
}
