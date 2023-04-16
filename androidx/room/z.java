package androidx.room.z;
import a3.c;
import v2.o;
import androidx.room.RoomDatabase$e;
import java.util.concurrent.Executor;
import java.lang.Object;
import a3.b;
import androidx.room.y;
import java.lang.String;

public final class z implements c, o	// class@000983
{
    public final c b;
    public final RoomDatabase$e c;
    public final Executor d;

    public void z(c p0,RoomDatabase$e p1,Executor p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void close(){
       this.b.close();
    }
    public b e0(){
       return new y(this.b.e0(), this.c, this.d);
    }
    public String getDatabaseName(){
       return this.b.getDatabaseName();
    }
    public c getDelegate(){
       return this.b;
    }
    public void setWriteAheadLoggingEnabled(boolean p0){
       this.b.setWriteAheadLoggingEnabled(p0);
    }
    public b z3(){
       return new y(this.b.z3(), this.c, this.d);
    }
}
