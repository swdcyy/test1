package hk9.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.comment.CommentParams;
import com.yxcorp.gifshow.comment.CommentConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.comment.e;
import mrd.a;
import com.kwai.component.tabs.panel.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.comment.common.CommonCommentsFragment;
import android.os.Bundle;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import ik9.i;
import ik9.g;
import ik9.f;
import ik9.d;
import ek9.t0;
import hk9.c$b;
import yg5.a;
import hk9.c$c;
import com.kwai.component.tabs.panel.h$d;
import hk9.c$d;
import com.kwai.component.tabs.panel.h$a;
import hk9.d;
import al9.a;

public final class c	// class@00269f
{
    public a a;
    public k0 b;
    public h$a c;
    public e d;
    public t0 e;
    public a f;
    public a g;
    public f h;
    public a i;
    public x j;
    public x k;
    public g l;
    public d m;
    public h$c n;
    public String o;
    public final QPhoto p;
    public final CommentParams q;
    public final CommentConfig r;
    public final int s;

    public void c(QPhoto p0,CommentParams p1,CommentConfig p2,int p3){
       a.p(p0, "mPhoto");
       a.p(p1, "mCommentParams");
       a.p(p2, "mCommentConfig");
       super();
       this.p = p0;
       this.q = p1;
       this.r = p2;
       this.s = p3;
       this.d = new e();
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<C¡­elShowHideEventWrapper>\(\)");
       this.f = uoa;
       uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<Boolean>\(\)");
       this.g = uoa;
    }
    public final h a(){
       h obj = PatchProxy.apply(null, this, c.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new h(CommonCommentsFragment.class, CommentsFragment.Ih(this.p, this.q, this.r), "COMMENT_AREA", this.s);
       i oi = new i();
       oi.o(this.d);
       oi.c = this.g;
       oi.a = this.f;
       oi.e = this.i;
       oi.f = this.j;
       oi.g = this.k;
       oi.p(this.l);
       oi.r(this.h);
       oi.s(this.m);
       oi.n(this.e);
       obj.h(new c$b(this, oi));
       obj.k(new c$c(this, obj, oi));
       obj.j = this.n;
       obj.j(new c$d(this));
       return obj;
    }
    public final c b(d p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "provider");
       this.m = p0;
       return this;
    }
    public final c c(t0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "observer");
       this.e = p0;
       return this;
    }
    public final c d(e p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "helper");
       this.d = p0;
       return this;
    }
    public final c e(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "pageList");
       this.i = p0;
       return this;
    }
    public final c f(f p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "creator");
       this.h = p0;
       return this;
    }
}
