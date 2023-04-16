package hk9.c$a;
import com.kwai.component.tabs.panel.h$b;
import hk9.c$a$a;
import nsd.u;
import com.kwai.component.tabs.panel.h;
import al9.a;
import com.yxcorp.gifshow.comment.e;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import hk9.c$a$b;
import hk9.c$a$e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.u1;
import com.yxcorp.gifshow.comment.e$b;
import qvb.q;
import qvb.j;
import hk9.c$a$c;
import android.view.View$OnClickListener;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import com.yxcorp.gifshow.event.CommentsEvent;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.event.CommentsEvent$Operation;
import hk9.c$a$d;
import java.lang.Integer;
import java.lang.Runnable;
import ekd.k1;

public final class c$a extends h$b	// class@00269b
{
    public final QPhoto A;
    public final String B;
    public final c$a$b w;
    public final q x;
    public final a y;
    public final e z;
    public static final c$a$a C;

    static {
       c$a.C = new c$a$a(null);
    }
    public void c$a(h p0,a p1,e p2,QPhoto p3,String p4){
       a.p(p0, "tabsPanelPageBuilder");
       a.p(p1, "mPageList");
       a.p(p2, "mCommentHelper");
       a.p(p3, "mPhoto");
       super(p0);
       this.y = p1;
       this.z = p2;
       this.A = p3;
       this.B = p4;
       this.w = new c$a$b(this);
       this.x = new c$a$e(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       super.E8();
       u1.a(this);
       this.c9();
       this.z.b(this.w);
       this.y.h(this.x);
       this.Y8(new c$a$c(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "3")) {
          return;
       }
       this.z.j(this.w);
       this.y.f(this.x);
       u1.b(this);
       return;
    }
    public final QPhoto b9(){
       return this.A;
    }
    public final void c9(){
       long l;
       c$a uoa = c$a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "4")) {
          return;
       }
       c$a tB = this.B;
       String str = "5";
       if (tB != null) {
          if (!PatchProxy.applyVoidTwoRefs(tB, tB, this, h$b.class, str)) {
             if (this.S8()) {
                this.Z8(tB);
             }else {
                this.Z8(tB);
             }
          }
       }else {
          tB = this.A;
          Object obj = PatchProxy.applyOneRefs(tB, this, uoa, str);
          if (obj != PatchProxyResult.class) {
             l = obj.longValue();
          }else {
             a.m(tB);
             l = (long)tB.numberOfComments();
          }
          this.X8(l, a1.r(R.string.arg_RES_7f10366d, ""), a1.p(R.string.arg_RES_7f10076c));
       }
       return;
    }
    public final void onMainThread(CommentsEvent p0){
       CommentsEvent a;
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "2")) {
          return;
       }
       a.p(p0, "event");
       if (a.g(this.A, p0.b) && this.getActivity() != null) {
          a = p0.a;
          Activity activity = this.getActivity();
          int i = (activity != null)? activity.hashCode(): 0;
          if (a == i) {
             p0 = p0.c;
             if (p0 != CommentsEvent$Operation.ADD && (p0 == CommentsEvent$Operation.ADD_SUB || p0 == CommentsEvent$Operation.DELETE)) {
                k1.p(new c$a$d(this), Integer.valueOf(1));
             }
          }
       }
    label_004b :
       return;
    }
}
