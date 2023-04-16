package c77.b;
import vq5.b;
import c77.d;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import c77.s;
import d61.y;
import oq5.b;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;
import c77.p;

public final class b implements b	// class@0004f6
{
    public final d a;

    public void b(d p0){
       this.a = p0;
    }
    public boolean a(){
       return a.a(this);
    }
    public final void b(Uri p0){
       b ta = this.a;
       Objects.requireNonNull(ta);
       LiveLogTag gZONE = LiveLogTag.GZONE;
       b.c0(gZONE, "LiveGzoneTabRouterPresenter try handle uri", "uri", p0.toString());
       if (p0.isHierarchical() && a1.i(ta.getActivity())) {
          d s = ta.s;
          if (s != null && !s.b()) {
             ta.v = p0;
             b.c0(gZONE, "LiveGzoneTabRouterPresenter tab not show", "uri", p0.toString());
             if (y.d(ta.getActivity())) {
                ta.t.d();
             }
          }else {
             ta.q.W8(p0.getQueryParameter("tab"), p0.getQueryParameter("subtab"), LiveGzoneTabSource.OTHERS, true);
             b.c0(gZONE, "LiveGzoneTabRouterPresenter real handle", "uri", p0.toString());
          }
       }
       return;
    }
}
