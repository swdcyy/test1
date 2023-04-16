package com.kuaishou.live.audience.component.push.b;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.push.c;
import java.lang.Object;
import java.util.Objects;
import wkd.b;
import com.kuaishou.live.core.show.coverandbackground.cover.b;
import java.io.File;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.t;
import t45.d;
import brd.z;
import v21.b;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s0d.f;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.model.CDNUrl;
import s0d.e;
import java.lang.StringBuilder;
import j80.c;
import com.kuaishou.live.audience.component.push.a;
import io.reactivex.g;

public final class b implements Runnable	// class@000bcb
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       Objects.requireNonNull(tb);
       int i = -1057460702;
       File uFile = b.a(i).b();
       if (uFile != null && uFile.exists()) {
          tb.p = uFile;
       }else {
          b.a(i).h(RequestTiming.DEFAULT);
          z a = d.a;
          tb.X7(b.a(i).d().observeOn(a).subscribe(new b(tb)));
          if (!PatchProxy.applyVoid(null, tb, c.class, "4")) {
             tb.X7(t.create(new a(tb, f.x().r(QCurrentUser.ME.getAvatars()).v(), b.a(-1504323719).c("live_push_avatar_cache").getAbsolutePath()+File.separator+"avatar_cover.jpg")).subscribeOn(d.c).observeOn(a).subscribe());
          }
       }
       return;
    }
}
