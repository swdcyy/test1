package jc9.l;
import java.lang.Runnable;
import jc9.b0;
import java.lang.Object;
import java.util.Objects;
import j8c.a;
import java.lang.String;
import q87.c;
import hc9.e;

public final class l implements Runnable	// class@002944
{
    public final b0 b;

    public void l(b0 p0){
       this.b = p0;
    }
    public final void run(){
       l tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.D().w("AutoDownloadBarHandler", "disappear", objArray);
       tb.e.c(null, 0);
       tb.e();
    }
}
