package cn3.g;
import sx1.c;
import cn3.i;
import eo3.g;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import i62.j0;
import java.util.Set;
import java.lang.StringBuilder;
import cn3.b;
import crd.b;
import oh3.j;
import java.lang.Boolean;
import brd.t;
import t45.d;
import brd.z;
import cn3.h;
import erd.g;
import io.reactivex.internal.functions.Functions;

public final class g implements c	// class@0005a6
{
    public final i a;
    public final g b;

    public void g(i p0,g p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(String p0){
       g ta = this.a;
       g tb = this.b;
       Objects.requireNonNull(ta);
       if (p0 != null && j0.i.contains(p0)) {
          ta.n(tb, "onShareStart, but channel is illegal, channelId"+p0);
       }else {
          j.a(ta.g);
          ta.g = t.just(Boolean.TRUE).observeOn(d.a).subscribe(new h(ta, tb), Functions.d());
       }
       return;
    }
}
