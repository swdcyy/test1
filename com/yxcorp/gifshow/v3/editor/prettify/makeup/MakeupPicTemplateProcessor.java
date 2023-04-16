package com.yxcorp.gifshow.v3.editor.prettify.makeup.MakeupPicTemplateProcessor;
import qsc.a;
import com.yxcorp.gifshow.v3.editor.prettify.makeup.MakeupPicTemplateProcessor$a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.String;
import brd.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.prettify.makeup.MakeupPicTemplateProcessor$c;
import erd.a;
import com.yxcorp.gifshow.v3.editor.prettify.makeup.MakeupPicTemplateProcessor$commit$1;
import com.yxcorp.gifshow.v3.editor.prettify.makeup.MakeupPicTemplateProcessor$b;
import brd.e;
import com.yxcorp.gifshow.v3.editor.prettify.makeup.MakeupPicTemplateProcessor$e;
import com.yxcorp.gifshow.v3.editor.prettify.makeup.MakeupPicTemplateProcessor$d;

public final class MakeupPicTemplateProcessor extends a	// class@00118e
{
    public static final MakeupPicTemplateProcessor$a b;

    static {
       MakeupPicTemplateProcessor.b = new MakeupPicTemplateProcessor$a(null);
    }
    public void MakeupPicTemplateProcessor(){
       super();
    }
    public a a(c p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MakeupPicTemplateProcessor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a.p(p1, "assetIdentifier");
       a uoa = a.q(new MakeupPicTemplateProcessor$c(this, p0, p1));
       a.o(uoa, "Completable.fromAction {¡­ft.safeCommitEdit\(\)\n    }");
       return uoa;
    }
    public a b(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MakeupPicTemplateProcessor.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a uoa = a.q(new MakeupPicTemplateProcessor$commit$1(this, p0));
       a.o(uoa, "Completable.fromAction {¡­se, true\) }\n      }\n    }");
       return uoa;
    }
    public a c(c p0,String p1,c p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MakeupPicTemplateProcessor.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a.p(p1, "assetIdentifier");
       a.p(p2, "templateDraft");
       a uoa = this.a(p0, p1).b(a.q(new MakeupPicTemplateProcessor$b(this, p2, p0, p1)));
       a.o(uoa, "clear\(projectDraft, asse¡­safeCommitEdit\(\)\n      }\)");
       return uoa;
    }
    public a d(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MakeupPicTemplateProcessor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a uoa = a.q(new MakeupPicTemplateProcessor$e(this, p0));
       a.o(uoa, "Completable.fromAction {¡­aft.safeStartEdit\(\)\n    }");
       return uoa;
    }
    public a f(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MakeupPicTemplateProcessor.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a uoa = a.q(new MakeupPicTemplateProcessor$d(this, p0));
       a.o(uoa, "Completable.fromAction {¡­t.safeDiscardEdit\(\)\n    }");
       return uoa;
    }
}
