package com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.b;
import ok.h;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackDialogFragment;
import java.lang.Object;
import java.lang.Void;
import java.util.Objects;
import ji2.c;
import ok.x;
import t02.a0;
import java.lang.String;
import p91.m;
import brd.t;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import ki2.e;
import ki2.d;
import erd.g;
import crd.b;

public final class b implements h	// class@000fb3
{
    public final LiveSurpriseRedPackDialogFragment b;

    public void b(LiveSurpriseRedPackDialogFragment p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       p0 = c.a.get();
       LiveSurpriseRedPackDialogFragment z = tb.z;
       String liveStreamId = (z != null)? z.Z2.getLiveStreamId(): "";
       return p0.a(liveStreamId, tb.A, tb.y, tb.z.Z2.d()).subscribeOn(d.b).observeOn(d.a).map(new e()).subscribe(new e(tb), new d(tb));
    }
}
