package lld.e;
import qsc.a;
import lld.e$a;
import nsd.u;
import t36.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import brd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lld.e$d;
import erd.a;
import lld.e$e;
import lld.e$c;
import io.reactivex.a;
import lld.e$g;
import lld.e$b;
import lld.e$f;
import com.kuaishou.edit.draft.c;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.kuaishou.edit.draft.CropOptions;
import brd.c;
import lld.e$h;
import brd.d;

public final class e extends a	// class@001c52
{
    public final int b;
    public final f c;
    public static final e$a d;

    static {
       e.d = new e$a(null);
    }
    public void e(f p0){
       a.p(p0, "cropActionListeners");
       super();
       this.c = p0;
       this.b = -1;
    }
    public a a(c p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a.p(p1, "assetIdentifier");
       a uoa = a.q(new e$d(this, p0, p1));
       a.o(uoa, "Completable.fromAction {¡­e\n        \)\n      }\n    }");
       return uoa;
    }
    public a b(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a uoa = a.q(new e$e(this, p0));
       a.o(uoa, "Completable.fromAction {¡­oMeta\(projectDraft\)\n    }");
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
       a uoa = a.k(new e$c(this, p2, p0, p1));
       a.o(uoa, "Completable.create { emi¡­.subscribe\(emitter\)\n    }");
       return uoa;
    }
    public a d(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a uoa = a.q(new e$g(this, p0));
       a.o(uoa, "Completable.fromAction {¡­aft.safeStartEdit\(\)\n    }");
       return uoa;
    }
    public a e(){
       a obj = PatchProxy.apply(null, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.q(new e$b(this));
       a.o(obj, "Completable.fromAction {¡­ashMapOf\(\)\)\n      }\n    }");
       return obj;
    }
    public a f(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a uoa = a.q(new e$f(this, p0));
       a.o(uoa, "Completable.fromAction {¡­ropDataMap\)\n      }\n    }");
       return uoa;
    }
    public int getPriority(){
       return this.b;
    }
    public final Size j(c p0){
       int i;
       int i1;
       CropOptions cropOptions;
       CropOptions obj = PatchProxy.applyOneRefs(p0, this, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getCropOptions();
       String str = "cropOptions";
       a.o(obj, str);
       if (obj.getWidth()) {
          obj = p0.getCropOptions();
          a.o(obj, str);
          if (obj.getHeight()) {
             obj = p0.getCropOptions();
             a.o(obj, str);
             i = obj.getWidth();
             cropOptions = p0.getCropOptions();
             a.o(cropOptions, str);
             i1 = cropOptions.getHeight();
          label_004d :
             if (i <= 0 || i1 <= 0) {
                return null;
             }else {
                return new Size(i, i1);
             }
          }
       }
       i = (int)p0.getOriginPicWidth();
       i1 = (int)p0.getOriginPicHeight();
       goto label_004d ;
    }
    public final Size k(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = (int)p0.getOriginPicWidth();
       int i1 = (int)p0.getOriginPicHeight();
       if (i <= 0 || i1 <= 0) {
          return null;
       }
       return new Size(i, i1);
    }
    public final float l(Size p0){
       return ((float)p0.b / (float)p0.c);
    }
    public final void m(a p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "11")) {
          return;
       }
       p0.a(new e$h(p1));
       return;
    }
}
