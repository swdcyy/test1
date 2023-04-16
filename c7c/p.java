package c7c.p;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import c7c.p$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import io.reactivex.subjects.PublishSubject;
import a7c.h;
import android.view.View;
import c7c.p$b;
import android.view.View$OnClickListener;
import c7c.p$c;
import com.yxcorp.gifshow.pymk.f;
import qvb.q;
import qvb.a;
import com.yxcorp.gifshow.pymk.log.PymkLogSender;
import ekd.m1;

public class p extends PresenterV2	// class@000550
{
    public h p;
    public View q;
    public View r;
    public boolean s;
    public final q t;

    public void p(){
       super();
       this.s = false;
       this.t = new p$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p.class, "4")) {
          return;
       }
       if (this.p.n() != null) {
          p tp = this.p;
          int i = 0;
          if (tp != null && tp.g()) {
             this.q.setVisibility(8);
             this.r.setVisibility(i);
             this.r.setOnClickListener(new p$b(this));
          }else {
             this.r.setVisibility(8);
             this.q.setVisibility(i);
             this.q.setOnClickListener(new p$c(this));
          }
          this.p.s().h(this.t);
          if (this.s == null) {
             PymkLogSender.pymkCloseBtnShow(this.p.s().l2());
             this.s = true;
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, p.class, "3")) {
          return;
       }
       this.p.s().f(this.t);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a079a);
       this.r = m1.f(p0, 0x7f0a0795);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       this.p = this.r8("PYMK_ACCESS_IDSPYMK_PARAMS");
       return;
    }
}
