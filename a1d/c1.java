package a1d.c1;
import n3d.a;
import a1d.d1;
import java.lang.Object;
import android.content.Intent;
import java.lang.Boolean;
import im8.f;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.login.authorization.mode.AuthEvent;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import w0d.g;

public final class c1 implements a	// class@00001a
{
    public final d1 b;

    public void c1(d1 p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       c1 tb = this.b;
       tb.q.set(Boolean.FALSE);
       if (QCurrentUser.ME.isLogined()) {
          tb.p.onNext(AuthEvent.LOGIN_SUCCESS);
       }else {
          d1 r = tb.r;
          if (r != null) {
             r.C2(0x2712, "not login");
          }
       }
       return;
    }
}
