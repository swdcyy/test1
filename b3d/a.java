package b3d.a;
import u07.u;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import java.lang.String;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.yxcorp.login.util.f;
import com.kwai.library.widget.popup.common.c;

public final class a implements u	// class@00031b
{
    public final GifshowActivity b;
    public final LoginUserResponse c;
    public final String d;

    public void a(GifshowActivity p0,LoginUserResponse p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void a(t p0,View p1){
       f.e(4, false);
       p0.q(3);
       f.j(this.b, this.c, this.d, false);
    }
}