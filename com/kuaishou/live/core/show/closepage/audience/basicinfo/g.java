package com.kuaishou.live.core.show.closepage.audience.basicinfo.g;
import k51.c;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.g$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import f12.d;
import f12.c;
import androidx.viewpager.widget.ViewPager$i;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import ekd.k1;
import com.yxcorp.gifshow.util.rx.RxBus;
import vs5.h;
import com.kwai.framework.model.user.User;

public class g extends c	// class@000a3c
{
    public d p;
    public LiveStreamFeed q;
    public boolean r;
    public final ViewPager$i s;
    public static String sLivePresenterClassName = "LivePlayClosedEndFilterPresenter";

    public void g(){
       super();
       this.r = false;
       this.s = new g$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity);
       d uod = c.b(activity);
       this.p = uod;
       uod.i(this.s);
       this.q = this.p.N();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       k1.n(this);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       g tq = this.q;
       if (tq != null) {
          RxBus.f.b(new h(tq.mUser.mId, tq.getId()));
       }
       return;
    }
}
