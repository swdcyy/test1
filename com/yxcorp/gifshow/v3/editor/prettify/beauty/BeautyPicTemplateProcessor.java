package com.yxcorp.gifshow.v3.editor.prettify.beauty.BeautyPicTemplateProcessor;
import qsc.a;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.BeautyPicTemplateProcessor$a;
import nsd.u;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.e;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.String;
import brd.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.BeautyPicTemplateProcessor$c;
import erd.a;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.BeautyPicTemplateProcessor$commit$1;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.BeautyPicTemplateProcessor$b;
import brd.e;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.BeautyPicTemplateProcessor$e;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.BeautyPicTemplateProcessor$f;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.BeautyPicTemplateProcessor$d;

public final class BeautyPicTemplateProcessor extends a	// class@00114e
{
    public final e b;
    public static final BeautyPicTemplateProcessor$a c;

    static {
       BeautyPicTemplateProcessor.c = new BeautyPicTemplateProcessor$a(null);
    }
    public void BeautyPicTemplateProcessor(){
       super();
       this.b = new e();
    }
    public a a(c p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, BeautyPicTemplateProcessor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a.p(p1, "assetIdentifier");
       a uoa = a.q(new BeautyPicTemplateProcessor$c(this, p0, p1));
       a.o(uoa, "Completable.fromAction {¡­ft.safeCommitEdit\(\)\n    }");
       return uoa;
    }
    public a b(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BeautyPicTemplateProcessor.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a uoa = a.q(new BeautyPicTemplateProcessor$commit$1(this, p0));
       a.o(uoa, "Completable.fromAction {¡­mConfig\(it\)\n      }\n    }");
       return uoa;
    }
    public a c(c p0,String p1,c p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, BeautyPicTemplateProcessor.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a.p(p1, "assetIdentifier");
       a.p(p2, "templateDraft");
       a uoa = this.a(p0, p1).b(a.q(new BeautyPicTemplateProcessor$b(this, p2, p0, p1)));
       a.o(uoa, "clear\(projectDraft, asse¡­safeCommitEdit\(\)\n      }\)");
       return uoa;
    }
    public a d(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BeautyPicTemplateProcessor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a uoa = a.q(new BeautyPicTemplateProcessor$e(this)).w(d.c).s(d.a).l(new BeautyPicTemplateProcessor$f(this, p0));
       a.o(uoa, "Completable\n      .fromA\x20\x02?.safeStartEdit\(\)\n      }\x00");
       return uoa;
    }
    public a f(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BeautyPicTemplateProcessor.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a uoa = a.q(new BeautyPicTemplateProcessor$d(this, p0));
       a.o(uoa, "Completable.fromAction {¡­t.safeDiscardEdit\(\)\n    }");
       return uoa;
    }
}
