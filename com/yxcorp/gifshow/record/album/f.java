package com.yxcorp.gifshow.record.album.f;
import erd.g;
import com.yxcorp.gifshow.record.album.LocalAlbumFragmentV2;
import m8c.e;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import brd.t;
import k8c.a;
import java.lang.String;
import q87.c;
import lnc.a1;
import java.util.concurrent.atomic.AtomicReference;
import k8c.c0;
import erd.a;
import k8c.v;
import k8c.n;
import crd.b;

public final class f implements g	// class@001721
{
    public final LocalAlbumFragmentV2 b;
    public final e c;

    public void f(LocalAlbumFragmentV2 p0,e p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       f tb = this.b;
       f tc = this.c;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          p0 = tb.Ch(tc, true);
          if (p0 == null) {
             Object[] objArray = new Object[0];
             a.D().w("ks://LocalAlbumFragmentV2", "onShareProject project is null", objArray);
          }else {
             tb.Hh(a1.p(R.string.arg_RES_7f102fd4), "progress");
             AtomicReference uAtomicRefer = new AtomicReference();
             v ov = new v(tb, uAtomicRefer);
             tb.C = p0.doOnDispose(new c0(uAtomicRefer)).subscribe(ov, new n(tb));
          }
       }
       return;
    }
}
