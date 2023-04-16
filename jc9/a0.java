package jc9.a0;
import java.lang.Runnable;
import jc9.b0;
import java.lang.Object;
import java.util.Objects;
import j8c.a;
import java.lang.String;
import q87.c;
import hc9.e;

public final class a0 implements Runnable	// class@002933
{
    public final b0 b;

    public void a0(b0 p0){
       this.b = p0;
    }
    public final void run(){
       a0 tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.D().w("AutoDownloadBarHandler", "disappear", objArray);
       tb.e.c(null, 0);
       tb.e();
    }
}
