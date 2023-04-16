package a1d.a0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a1d.z;
import erd.r;
import brd.t;
import a1d.y;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.view.View;
import ekd.m1;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.CheckBox;
import a1d.x;
import android.view.View$OnClickListener;
import im8.f;
import io.reactivex.subjects.PublishSubject;

public class a0 extends PresenterV2	// class@000013
{
    public f p;
    public PublishSubject q;
    public f r;
    public f s;
    public ViewGroup t;
    public TextView u;
    public CheckBox v;

    public void a0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "3")) {
          return;
       }
       this.X7(this.q.filter(z.b).subscribe(new y(this), Functions.d()));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a0f95);
       this.u = m1.f(p0, 0x7f0a2e9e);
       this.v = m1.f(p0, 0x7f0a2e9d);
       m1.a(p0, new x(this), R.id.follow_switcher);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "1")) {
          return;
       }
       this.p = this.x8("AUTH_INFO_RESPONSE");
       this.q = this.r8("EVENT_PUBLISH_SUBJECT");
       this.r = this.x8("FOLLOW_SELECTED");
       this.s = this.x8("CURRENT_SHOW_SCOPE");
       return;
    }
}
