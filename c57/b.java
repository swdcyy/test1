package c57.b;
import h47.b;
import c57.f;
import java.lang.Object;
import com.kwai.live.gzone.common.LiveGzoneConfigResponse;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b57.c;
import b57.b;
import brd.t;
import cjd.e;
import erd.o;
import c57.d;
import c57.e;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class b implements b	// class@0004e6
{
    public final f a;

    public void b(f p0){
       this.a = p0;
    }
    public final void a(LiveGzoneConfigResponse p0){
       b ta = this.a;
       if (ta.u.getLivePlayConfig().mIsFromLiveMate != null && (p0.mDisableGzoneLiveEmotion == null && !PatchProxy.applyVoid(null, ta, f.class, "4"))) {
          ta.X7(b.a().b(ta.u.getUserId()).map(new e()).subscribe(new d(ta), e.b));
       }
    label_0042 :
       return;
    }
}
