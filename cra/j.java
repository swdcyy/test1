package cra.j;
import java.lang.Runnable;
import android.net.Uri;
import java.lang.Object;
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

public final class j implements Runnable	// class@002382
{
    public final Uri b;

    public void j(Uri p0){
       this.b = p0;
    }
    public final void run(){
       b.a(-1257347683).b().k(this.b.toString()).map(new e()).observeOn(d.c).subscribe();
    }
}
