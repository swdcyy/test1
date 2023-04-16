package cra.l;
import java.lang.Runnable;
import com.yxcorp.gifshow.growth.util.a;
import java.lang.Object;
import java.util.Objects;
import wkd.b;
import yma.a;
import yma.b;
import java.lang.String;
import brd.t;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import crd.b;

public final class l implements Runnable	// class@002384
{
    public final a b;

    public void l(a p0){
       this.b = p0;
    }
    public final void run(){
       l tb = this.b;
       Objects.requireNonNull(tb);
       b.a(-1257347683).b().r(tb.b(true, false)).map(new e()).observeOn(d.c).subscribe();
    }
}
