package dn2.b;
import dn2.c$c;
import dn2.c;
import java.lang.Object;

public final class b implements c$c	// class@002552
{
    public final c a;

    public void b(c p0){
       this.a = p0;
    }
    public final void onFinish(){
       b ta = this.a;
       _monitor_enter(ta);
       ta.d = ta.d - 1;
       ta.b();
       _monitor_exit(ta);
    }
}
