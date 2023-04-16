package com.yxcorp.gifshow.record.album.g;
import erd.g;
import com.yxcorp.gifshow.record.album.LocalAlbumFragmentV2;
import m8c.e;
import java.lang.Object;
import hn6.a$a;
import brd.t;
import k8c.a;
import java.lang.String;
import q87.c;
import lnc.a1;
import t45.d;
import brd.z;
import k8c.q;
import k8c.o;
import crd.b;

public final class g implements g	// class@001724
{
    public final LocalAlbumFragmentV2 b;
    public final e c;

    public void g(LocalAlbumFragmentV2 p0,e p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       g tb = this.b;
       boolean b = false;
       t ot = tb.Ch(this.c, b);
       if (ot == null) {
          Object[] objArray = new Object[b];
          a.D().w("ks://LocalAlbumFragmentV2", "onLaunchSameFrameActivity observable is null", objArray);
       }else {
          tb.Hh(a1.p(R.string.arg_RES_7f102fd4), "progress");
          tb.C = ot.observeOn(d.a).subscribe(new q(tb, p0), new o(tb));
       }
       return;
    }
}
