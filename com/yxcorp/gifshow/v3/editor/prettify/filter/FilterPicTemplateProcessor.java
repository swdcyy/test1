package com.yxcorp.gifshow.v3.editor.prettify.filter.FilterPicTemplateProcessor;
import qsc.a;
import com.yxcorp.gifshow.v3.editor.prettify.filter.FilterPicTemplateProcessor$a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.String;
import brd.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.prettify.filter.FilterPicTemplateProcessor$c;
import erd.a;
import com.yxcorp.gifshow.v3.editor.prettify.filter.FilterPicTemplateProcessor$commit$1;
import com.yxcorp.gifshow.v3.editor.prettify.filter.FilterPicTemplateProcessor$b;
import brd.e;
import com.yxcorp.gifshow.v3.editor.prettify.filter.FilterPicTemplateProcessor$e;
import com.yxcorp.gifshow.v3.editor.prettify.filter.FilterPicTemplateProcessor$d;

public final class FilterPicTemplateProcessor extends a	// class@001168
{
    public static final FilterPicTemplateProcessor$a b;

    static {
       FilterPicTemplateProcessor.b = new FilterPicTemplateProcessor$a(null);
    }
    public void FilterPicTemplateProcessor(){
       super();
    }
    public a a(c p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, FilterPicTemplateProcessor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a.p(p1, "assetIdentifier");
       a uoa = a.q(new FilterPicTemplateProcessor$c(this, p0, p1));
       a.o(uoa, "Completable.fromAction {¡­ft.safeCommitEdit\(\)\n    }");
       return uoa;
    }
    public a b(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FilterPicTemplateProcessor.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a uoa = a.q(new FilterPicTemplateProcessor$commit$1(this, p0));
       a.o(uoa, "Completable.fromAction {¡­T\n        \)\n      }\n    }");
       return uoa;
    }
    public a c(c p0,String p1,c p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, FilterPicTemplateProcessor.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a.p(p1, "assetIdentifier");
       a.p(p2, "templateDraft");
       a uoa = this.a(p0, p1).b(a.q(new FilterPicTemplateProcessor$b(this, p2, p0, p1)));
       a.o(uoa, "clear\(projectDraft, asse¡­safeCommitEdit\(\)\n      }\)");
       return uoa;
    }
    public a d(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FilterPicTemplateProcessor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a uoa = a.q(new FilterPicTemplateProcessor$e(this, p0));
       a.o(uoa, "Completable.fromAction {¡­aft.safeStartEdit\(\)\n    }");
       return uoa;
    }
    public a f(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FilterPicTemplateProcessor.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a uoa = a.q(new FilterPicTemplateProcessor$d(this, p0));
       a.o(uoa, "Completable.fromAction {¡­t.safeDiscardEdit\(\)\n    }");
       return uoa;
    }
}
