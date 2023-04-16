package b3d.k;
import u07.u;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.yxcorp.login.util.f;
import com.kwai.library.widget.popup.common.c;

public final class k implements u	// class@000333
{
    public final LoginUserResponse b;

    public void k(LoginUserResponse p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       f.b(this.b);
       p0.q(3);
       f.e(3, false);
    }
}
