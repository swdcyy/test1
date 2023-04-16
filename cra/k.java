package cra.k;
import java.lang.Runnable;
import android.net.Uri;
import java.lang.String;
import java.lang.Object;
import wkd.b;
import yma.a;
import yma.b;
import o56.a;
import brd.t;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import crd.b;

public final class k implements Runnable	// class@002383
{
    public final Uri b;
    public final String c;

    public void k(Uri p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       b.a(-1257347683).b().m(a.a, a.x, this.b.toString(), this.c).map(new e()).observeOn(d.c).subscribe();
    }
}
