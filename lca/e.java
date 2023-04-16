package lca.e;
import qsc.a;
import lca.e$a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.String;
import brd.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import lca.e$c;
import erd.a;
import lca.e$d;
import lca.e$b;
import lca.e$f;
import lca.e$e;

public final class e extends a	// class@002db3
{
    public static final e$a b;

    static {
       e.b = new e$a(null);
    }
    public void e(){
       super();
    }
    public a a(c p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a.p(p1, "assetIdentifier");
       a uoa = a.q(new e$c(p0, p1));
       a.o(uoa, "Completable.fromAction {¡­arFineTuningParam\(\)\n    }");
       return uoa;
    }
    public a b(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a uoa = a.q(new e$d(this, p0));
       a.o(uoa, "Completable.fromAction {¡­ projectDraft.type\)\n    }");
       return uoa;
    }
    public a c(c p0,String p1,c p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a.p(p1, "assetIdentifier");
       a.p(p2, "templateDraft");
       a uoa = a.q(new e$b(p0, p1, p2));
       a.o(uoa, "Completable.fromAction {¡­r\(\).build\(\)\n      }\n    }");
       return uoa;
    }
    public a d(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a uoa = a.q(new e$f(this, p0));
       a.o(uoa, "Completable.fromAction {¡­aft.safeStartEdit\(\)\n    }");
       return uoa;
    }
    public a f(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a uoa = a.q(new e$e(this, p0));
       a.o(uoa, "Completable.fromAction {¡­t.safeDiscardEdit\(\)\n    }");
       return uoa;
    }
}
