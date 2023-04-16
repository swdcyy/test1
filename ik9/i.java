package ik9.i;
import ik9.c;
import ik9.a;
import ik9.h;
import ik9.g;
import io.reactivex.subjects.CompletableSubject;
import ok.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ik9.f;
import xk9.h;
import com.yxcorp.gifshow.comment.CommentParams;
import com.yxcorp.gifshow.comment.e;
import ek9.t0;
import com.yxcorp.gifshow.comment.CommentPageListConfig;
import al9.a;
import ik9.d;
import mrd.a;

public final class i extends c	// class@002862
{
    public a a;
    public CompletableSubject b;
    public a c;
    public e d;
    public a e;
    public x f;
    public x g;
    public f h;
    public g i;
    public d j;
    public t0 k;
    public h l;

    public void i(){
       super();
       this.f = a.b;
       this.g = h.b;
    }
    public g a(){
       return this.i;
    }
    public CompletableSubject b(){
       return this.b;
    }
    public x c(){
       i obj = PatchProxy.apply(null, this, i.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       if (obj == null) {
          x ox = super.c();
       }
       return obj;
    }
    public x d(){
       i obj = PatchProxy.apply(null, this, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj == null) {
          x ox = super.d();
       }
       return obj;
    }
    public f e(){
       return this.h;
    }
    public h f(){
       return this.l;
    }
    public e g(CommentParams p0){
       i obj = PatchProxy.applyOneRefs(p0, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          e uoe = super.g(p0);
       }
       return obj;
    }
    public t0 h(){
       i obj = PatchProxy.apply(null, this, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       if (obj == null) {
          t0 ot0 = super.h();
       }
       return obj;
    }
    public a i(CommentParams p0,CommentPageListConfig p1){
       i obj = PatchProxy.applyTwoRefs(p0, p1, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj == null) {
          a uoa = super.i(p0, p1);
       }
       return obj;
    }
    public d j(){
       i obj = PatchProxy.apply(null, this, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j;
       if (obj == null) {
          d uod = super.j();
       }
       return obj;
    }
    public a k(){
       return this.c;
    }
    public a l(){
       return this.a;
    }
    public void m(h p0){
       this.l = p0;
    }
    public void n(t0 p0){
       this.k = p0;
    }
    public void o(e p0){
       this.d = p0;
    }
    public void p(g p0){
       this.i = p0;
    }
    public void q(CompletableSubject p0){
       this.b = p0;
    }
    public void r(f p0){
       this.h = p0;
    }
    public void s(d p0){
       this.j = p0;
    }
}
