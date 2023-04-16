package a1d.d1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import w0d.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.login.authorization.mode.AuthEvent;
import io.reactivex.subjects.PublishSubject;
import java.lang.Boolean;
import im8.f;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Context;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import a1d.c1;
import n3d.a;

public class d1 extends PresenterV2	// class@00001d
{
    public PublishSubject p;
    public f q;
    public g r;

    public void d1(g p0){
       super();
       this.r = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d1.class, "2")) {
          return;
       }
       if (QCurrentUser.ME.isLogined()) {
          this.p.onNext(AuthEvent.LOGIN_SUCCESS);
       }else {
          this.p.onNext(AuthEvent.LOGIN_START);
          this.q.set(Boolean.TRUE);
          d.a(-1712118428).x00(this.getContext(), 127, new LoginParams$a().a(), new c1(this));
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, d1.class, "3")) {
          return;
       }
       this.r = null;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d1.class, "1")) {
          return;
       }
       this.p = this.r8("EVENT_PUBLISH_SUBJECT");
       this.q = this.x8("LOGIN_STATE");
       return;
    }
}
