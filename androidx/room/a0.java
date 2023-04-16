package androidx.room.a0;
import a3.c$c;
import androidx.room.RoomDatabase$e;
import java.util.concurrent.Executor;
import java.lang.Object;
import a3.c$b;
import a3.c;
import androidx.room.z;

public final class a0 implements c$c	// class@00094d
{
    public final c$c a;
    public final RoomDatabase$e b;
    public final Executor c;

    public void a0(c$c p0,RoomDatabase$e p1,Executor p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public c a(c$b p0){
       return new z(this.a.a(p0), this.b, this.c);
    }
}
