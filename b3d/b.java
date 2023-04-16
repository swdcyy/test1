package b3d.b;
import u07.u;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.yxcorp.login.util.f;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import o1d.m;
import com.kwai.library.widget.popup.common.c;

public final class b implements u	// class@00031f
{
    public final LoginUserResponse b;

    public void b(LoginUserResponse p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       f.b(this.b);
       m.a("FREEZE_PRODUCTED_POP", "cancel", null);
       p0.o();
    }
}
