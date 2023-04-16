package h63.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import j63.b;
import lnc.a1;
import android.graphics.drawable.Drawable;

public class h extends PresenterV2	// class@002c7f
{
    public View p;

    public void h(){
       super();
    }
    public void doBindView(View p0){
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oh, "1")) {
          return;
       }
       p0 = m1.f(p0, R.id.mock_render_view);
       this.p = p0;
       if (p0 != null) {
          p0 = PatchProxy.apply(null, this, oh, "2");
          boolean b = (p0 != PatchProxyResult.class)? p0.booleanValue(): a.t().d("video_tex_and_x_stream_enable_mock_follow", 0);
          if (b) {
             this.p.setBackground(new b(a1.a(R.color.arg_RES_7f062057)));
             this.p.setVisibility(0);
          }
       }
       return;
    }
}
