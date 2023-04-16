package qsc.a;
import qsc.c;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.String;
import brd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.c;

public abstract class a implements c	// class@0037ba
{
    public final int a;

    public void a(){
       super();
    }
    public a a(c p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a.p(p1, "assetIdentifier");
       a uoa = a.g();
       a.o(uoa, "Completable.complete\(\)");
       return uoa;
    }
    public a b(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a uoa = a.g();
       a.o(uoa, "Completable.complete\(\)");
       return uoa;
    }
    public a c(c p0,String p1,c p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a.p(p1, "assetIdentifier");
       a.p(p2, "templateDraft");
       a uoa = a.g();
       a.o(uoa, "Completable.complete\(\)");
       return uoa;
    }
    public a d(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a uoa = a.g();
       a.o(uoa, "Completable.complete\(\)");
       return uoa;
    }
    public a e(){
       a obj = PatchProxy.apply(null, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.g();
       a.o(obj, "Completable.complete\(\)");
       return obj;
    }
    public a f(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a uoa = a.g();
       a.o(uoa, "Completable.complete\(\)");
       return uoa;
    }
    public final c g(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.D() == true) {
          p0.f();
       }
       return p0;
    }
    public int getPriority(){
       return this.a;
    }
    public final c h(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.D() == true) {
          p0.j();
       }
       return p0;
    }
    public final c i(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && !p0.D()) {
          p0.c0();
       }
       return p0;
    }
}
