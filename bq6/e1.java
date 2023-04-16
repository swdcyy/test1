package bq6.e1;
import erd.a;
import bq6.p2;
import l85.c;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import l85.b;

public final class e1 implements a	// class@00057e
{
    public final p2 b;
    public final c c;

    public void e1(p2 p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       e1 tb = this.b;
       Objects.requireNonNull(tb);
       b.a(this.c.b());
       tb.n(0, "Sync conversation folder successfully");
    }
}
