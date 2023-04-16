package gqb.h;
import com.yxcorp.gifshow.widget.h$a;
import gqb.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import android.view.View;
import tyc.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import com.kwai.feature.api.router.social.profile.ProfileStartParam$CollectionSub;
import tkd.b;
import tkd.d;
import vu5.b;
import android.app.Activity;
import e17.i;

public final class h implements h$a	// class@002b79
{
    public final g a;
    public final GifshowActivity b;

    public void h(g p0,GifshowActivity p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(View p0){
       t.b(this, p0);
    }
    public void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       a.p(p0, "v");
       return;
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       a.p(p0, "v");
       h ta = this.a;
       h tb = this.b;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(tb, ta, g.class, "10")) {
          ProfileStartParam profileStart = ProfileStartParam.i().u(true);
          a.o(profileStart, "ProfileStartParam.newMyP¡­JumpToCollectionTab\(true\)");
          profileStart.t(ProfileStartParam$CollectionSub.TAB_COLLECTION_MUSIC);
          d.a(-1718536792).Kp(tb, profileStart);
       }
       i oi = i.l();
       if (oi != null && oi.s()) {
          oi.h();
       }
       return;
    }
}
