package com.kwai.framework.deviceid.g;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.android.dispatcher.KwaiPush;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import c66.h;
import b66.k;
import wkd.b;
import ob6.p;
import brd.a0;
import com.kwai.framework.deviceid.e;
import com.kwai.framework.deviceid.f;
import erd.g;
import crd.b;
import wu8.p;
import java.util.Objects;
import com.yxcorp.experiment.c;
import wu8.f;
import com.kwai.middleware.leia.degrade.ApiRequestTiming;
import o56.a;
import java.lang.String;
import com.kuaishou.weapon.i.WeaponHI;

public final class g implements Runnable	// class@001528
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final void run(){
       KwaiPush.refreshToken();
       RequestTiming dEFAULT = RequestTiming.DEFAULT;
       h.a(dEFAULT);
       k.a(dEFAULT);
       b.a(0x36463d96).j(dEFAULT).R(e.b, f.b);
       Objects.requireNonNull(p.d());
       c uoc = c.h();
       Objects.requireNonNull(uoc);
       if (!f.c()) {
          uoc.p(true, ApiRequestTiming.COLD_START);
       }
       WeaponHI.setG(a.a);
       return;
    }
}
