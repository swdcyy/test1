package androidx.room.b0;
import a3.f;
import androidx.room.RoomDatabase$e;
import java.lang.String;
import java.util.concurrent.Executor;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import a3.d;
import java.lang.Double;
import java.lang.Long;
import java.io.Closeable;
import v2.h0;
import java.lang.Runnable;
import v2.i0;
import v2.j0;
import v2.k0;
import v2.g0;

public final class b0 implements f	// class@00094f
{
    public final f b;
    public final RoomDatabase$e c;
    public final String d;
    public final List e;
    public final Executor f;

    public void b0(f p0,RoomDatabase$e p1,String p2,Executor p3){
       super();
       this.e = new ArrayList();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.f = p3;
    }
    public static void a(b0 p0){
       p0.l();
    }
    public static void b(b0 p0){
       p0.f();
    }
    public static void c(b0 p0){
       p0.g();
    }
    public static void d(b0 p0){
       p0.j();
    }
    public static void e(b0 p0){
       p0.k();
    }
    private void f(){
       this.c.a(this.d, this.e);
    }
    private void g(){
       this.c.a(this.d, this.e);
    }
    private void j(){
       this.c.a(this.d, this.e);
    }
    private void k(){
       this.c.a(this.d, this.e);
    }
    private void l(){
       this.c.a(this.d, this.e);
    }
    public void bindBlob(int p0,byte[] p1){
       this.o(p0, p1);
       this.b.bindBlob(p0, p1);
    }
    public void bindDouble(int p0,double p1){
       this.o(p0, Double.valueOf(p1));
       this.b.bindDouble(p0, p1);
    }
    public void bindLong(int p0,long p1){
       this.o(p0, Long.valueOf(p1));
       this.b.bindLong(p0, p1);
    }
    public void bindNull(int p0){
       this.o(p0, this.e.toArray());
       this.b.bindNull(p0);
    }
    public void bindString(int p0,String p1){
       this.o(p0, p1);
       this.b.bindString(p0, p1);
    }
    public void clearBindings(){
       this.e.clear();
       this.b.clearBindings();
    }
    public void close(){
       this.b.close();
    }
    public void execute(){
       this.f.execute(new h0(this));
       this.b.execute();
    }
    public long executeInsert(){
       this.f.execute(new i0(this));
       return this.b.executeInsert();
    }
    public int executeUpdateDelete(){
       this.f.execute(new j0(this));
       return this.b.executeUpdateDelete();
    }
    public final void o(int p0,Object p1){
       p0--;
       if (p0 >= this.e.size()) {
          for (int i = this.e.size(); i <= p0; i = i + 1) {
             this.e.add(null);
          }
       }
       this.e.set(p0, p1);
       return;
    }
    public long simpleQueryForLong(){
       this.f.execute(new k0(this));
       return this.b.simpleQueryForLong();
    }
    public String simpleQueryForString(){
       this.f.execute(new g0(this));
       return this.b.simpleQueryForString();
    }
}
