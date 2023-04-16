package a1d.t0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a1d.s0;
import erd.r;
import brd.t;
import a1d.r0;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kwai.feature.api.social.login.model.AuthSource;
import im8.f;
import io.reactivex.subjects.PublishSubject;

public class t0 extends PresenterV2	// class@000055
{
    public String p;
    public String q;
    public AuthSource r;
    public f s;
    public f t;
    public PublishSubject u;

    public void t0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, t0.class, "2")) {
          return;
       }
       this.X7(this.u.filter(s0.b).subscribe(new r0(this), Functions.d()));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t0.class, "1")) {
          return;
       }
       this.p = this.r8("PARAM_APP_ID");
       this.q = this.r8("PARAM_REQUEST_SCOPE");
       this.r = this.r8("AUTH_SOURCE");
       this.s = this.x8("CURRENT_SHOW_SCOPE");
       this.t = this.x8("AUTH_INFO_RESPONSE");
       this.u = this.r8("EVENT_PUBLISH_SUBJECT");
       return;
    }
}
