package a96.m;
import io7.a;
import com.kwai.framework.krn.init.preload.e;
import java.lang.Object;
import java.lang.String;
import io7.f;
import java.util.Timer;
import a96.q;
import java.util.TimerTask;

public final class m implements a	// class@00004f
{
    public final e b;

    public void m(e p0){
       this.b = p0;
    }
    public final void a(String p0,f p1){
       m tb = this.b;
       tb.k();
       tb.a.cancel();
       q oq = new q(tb);
       tb.a.scheduleAtFixedRate(oq, 0, (long)tb.c);
    }
}
