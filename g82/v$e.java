package g82.v$e;
import vq5.b;
import g82.v;
import java.lang.Object;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g82.e0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import t02.a0;
import com.kwai.framework.model.feed.BaseFeed;
import jga.c;
import wca.b;
import y41.i$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import p91.m;
import com.kwai.framework.model.user.User;
import com.kuaishou.live.core.basic.utils.e;
import erd.g;
import y41.i;

public class v$e implements b	// class@002abe
{
    public final v a;

    public void v$e(v p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return this.a.r;
    }
    public void b(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$e.class, "1")) {
          return;
       }
       i$a uoa = new i$a(this.a.getActivity(), this.a.p.Z2.getLiveStreamId());
       uoa.o(this.a.p.Z2.I());
       uoa.m(e.j(this.a.p.c));
       uoa.n(39);
       uoa.f(b.c(this.a.p.j0().mEntity));
       uoa.r(true);
       uoa.j(new e0(this, p0.getQueryParameter("source")));
       uoa.a().c();
       return;
    }
}
