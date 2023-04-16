package az9.c;
import erd.g;
import az9.i0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mhc.l2;
import brd.a0;
import az9.z;
import erd.r;
import brd.m;
import az9.v;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class c implements g	// class@00031f
{
    public final i0 b;

    public void c(i0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, i0.class, "24")) {
       }else if(tb.v == null){
          l2.a.a().t(z.b).y(new v(tb), Functions.d());
       }
       return;
    }
}
