package j0.d;
import aegon.chrome.net.impl.j$a;
import aegon.chrome.net.impl.CronetUrlRequest;
import java.lang.Object;
import java.util.Objects;
import aegon.chrome.net.impl.CronetUrlRequest$k;
import aegon.chrome.net.impl.h;
import aegon.chrome.net.impl.CronetUrlRequestContext;
import java.lang.String;
import K.S;
import java.lang.Long;

public final class d implements j$a	// class@001994
{
    public final CronetUrlRequest a;

    public void d(CronetUrlRequest p0){
       this.a = p0;
    }
    public final Object get(){
       d ta = this.a;
       Objects.requireNonNull(ta);
       h.i();
       long l = ta.h.o();
       CronetUrlRequest l1 = ta.l;
       CronetUrlRequest m = ta.m;
       CronetUrlRequest r = ta.r;
       CronetUrlRequest s = ta.s;
       boolean b = (ta.h.p() || ta.x != null)? true: false;
       return Long.valueOf(S.MuOIsMvf(ta, l, l1, m, r, s, b, ta.t, ta.u, ta.v, ta.w, ta.n));
    }
}
