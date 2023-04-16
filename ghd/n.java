package ghd.n;
import u07.u;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.String;
import k2b.h;
import lnc.i3;
import k2b.e0;

public final class n implements u	// class@000f35
{
    public final GifshowActivity b;

    public void n(GifshowActivity p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       h oh = h.k("ALL_PEOPLE_TOSEE_POPUP");
       i3 oi3 = i3.f();
       oi3.d("click_area", "close");
       oh.n(oi3.e());
       oh.i(this.b);
    }
}
