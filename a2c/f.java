package a2c.f;
import erd.g;
import a2c.a;
import java.io.File;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import r16.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.models.QMedia;
import lxa.a;
import m26.a$a;
import java.util.ArrayList;
import ekd.j;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import a2c.e;
import g46.a;
import z36.d$a;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundFeedClickHelper$modifyVideo$1$mixImportParams$2;
import com.kwai.feature.post.api.feature.mix.model.IMixImportTimeLineTextFormatter;
import m26.a;
import n3d.a;

public final class f implements g	// class@000041
{
    public final a b;
    public final File c;
    public final GifshowActivity d;

    public void f(a p0,File p1,GifshowActivity p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else {
          a.p(p0, "plugin");
          QMedia qMedia = new QMedia((long)this.c.hashCode(), this.c.getAbsolutePath(), 0, a.a(this.c.lastModified(), this.c.getAbsolutePath()), 1);
          a$a uoa = new a$a();
          QMedia[] qMediaArray = new QMedia[]{v0};
          uoa.p(j.a(qMediaArray));
          uoa.n(0);
          uoa.r(0);
          uoa.s(0);
          uoa.i(0);
          uoa.k(1);
          uoa.o(j0.a(this.d.getIntent(), "INTENT_GO_HOME_ON_POST_COMPLETE", 1));
          a$a uoa1 = uoa.e(new e(this, p0));
          uoa1.y("noOperation");
          uoa1.h(57.00f);
          uoa1.w(3.00f);
          uoa1.q(new ProfileBackgroundFeedClickHelper$modifyVideo$1$mixImportParams$2());
          p0.WF(this.d, 769, uoa1.f(), null);
       }
       return;
    }
}
