package cl9.p2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import lnc.a1;
import java.lang.CharSequence;
import android.view.View;
import nx9.c;
import com.kuaishou.android.model.mix.QComment;
import hl9.t;
import com.yxcorp.gifshow.comment.CommentConfig;
import ekd.m1;

public class p2 extends PresenterV2	// class@000655
{
    public CommentConfig p;
    public View q;
    public View r;
    public View s;
    public View t;
    public View u;
    public QComment v;

    public void p2(){
       super();
    }
    public void E8(){
       p2 op2 = p2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, op2, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, op2, "4") && a.a().c()) {
          op2 = this.t;
          if (op2 != null) {
             op2.setContentDescription(a1.p(R.string.arg_RES_7f101cb3));
          }
       }
       objArray = 2;
       if (c.f()) {
          if (this.v.getStatus() == objArray) {
             if (this.q == null) {
                int i = 0x7f0a3873;
                t.l9(this.m8(), i);
                this.q = t.P8(this.m8(), i);
             }
             op2 = this.q;
             if (op2 != null) {
                op2.setVisibility(0);
             }
             View view = (this.p.mEnableNewLikeDislikeUi != null)? t.P8(this.m8(), R.id.container_like_dislike): t.P8(this.m8(), R.id.comment_like_frame);
             if (view != null) {
                view.setVisibility(8);
             }
          }else {
             op2 = this.q;
             if (op2 != null) {
                op2.setVisibility(8);
             }
          }
       }else if(this.v.getStatus() == objArray){
          this.r.setVisibility(0);
          this.q.setVisibility(0);
          this.t.setVisibility(8);
          this.s.setVisibility(8);
          this.u.setVisibility(8);
       }else {
          this.q.setVisibility(8);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p2.class, "2")) {
          return;
       }
       if (!c.f()) {
          this.q = m1.f(p0, 0x7f0a3873);
       }
       this.r = m1.f(p0, 0x7f0a087d);
       this.s = m1.f(p0, 0x7f0a0933);
       this.t = m1.f(p0, 0x7f0a087b);
       this.u = m1.f(p0, 0x7f0a087c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p2.class, "1")) {
          return;
       }
       this.v = this.q8(QComment.class);
       this.p = this.q8(CommentConfig.class);
       return;
    }
}
