package a58.p;
import java.lang.Runnable;
import com.mini.app.installer.i;
import com.mini.pms.packagemanager.model.MiniAppInfo;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import com.mini.app.installer.f;
import com.mini.app.runtime.f;
import r58.b;

public final class p implements Runnable	// class@00003c
{
    public final i b;
    public final boolean c;
    public final MiniAppInfo d;
    public final String e;
    public final String f;
    public final MiniAppInfo g;
    public final int h;
    public final String i;

    public void p(i p0,boolean p1,MiniAppInfo p2,String p3,String p4,MiniAppInfo p5,int p6,String p7){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
    }
    public final void run(){
       p tb = this.b;
       p td = this.d;
       p te = this.e;
       p tf = this.f;
       p tg = this.g;
       p th = this.h;
       p ti = this.i;
       Objects.requireNonNull(tb);
       if (this.c != null) {
          td.k(te, true);
       }
       tb.f.k.y.o.l(tf, tg);
       tb.f(th, ti);
       return;
    }
}
