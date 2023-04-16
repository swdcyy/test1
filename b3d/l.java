package b3d.l;
import u07.u;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.yxcorp.login.util.f;
import com.kwai.library.widget.popup.common.c;

public final class l implements u	// class@000335
{
    public final LoginUserResponse b;

    public void l(LoginUserResponse p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       f.b(this.b);
       p0.q(3);
       f.e(1, false);
    }
}
