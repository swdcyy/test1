package g33.e;
import java.lang.Runnable;
import com.kuaishou.live.external.p;
import android.app.Activity;
import java.lang.String;
import java.lang.Object;
import os5.l;

public final class e implements Runnable	// class@002a4f
{
    public final p b;
    public final Activity c;
    public final String d;

    public void e(p p0,Activity p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       this.b.n().SC(this.c, this.d);
    }
}
