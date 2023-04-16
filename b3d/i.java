package b3d.i;
import u07.u;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import java.util.Map;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.yxcorp.login.util.f;

public final class i implements u	// class@00032e
{
    public final GifshowActivity b;
    public final LoginUserResponse c;
    public final Map d;

    public void i(GifshowActivity p0,LoginUserResponse p1,Map p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void a(t p0,View p1){
       f.h(this.b, p0, this.c, this.d);
    }
}
