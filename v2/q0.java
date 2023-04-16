package v2.q0;
import androidx.room.RoomDatabase;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import a3.f;
import java.lang.String;

public abstract class q0	// class@00265a
{
    public final AtomicBoolean a;
    public final RoomDatabase b;
    public f c;

    public void q0(RoomDatabase p0){
       super();
       this.a = new AtomicBoolean(false);
       this.b = p0;
    }
    public f a(){
       this.b();
       return this.e(this.a.compareAndSet(false, true));
    }
    public void b(){
       this.b.c();
    }
    public final f c(){
       return this.b.h(this.d());
    }
    public abstract String d();
    public final f e(boolean p0){
       q0 tc;
       if (p0) {
          if (this.c == null) {
             this.c = this.c();
          }
          tc = this.c;
       }else {
          tc = this.c();
       }
       return tc;
    }
    public void f(f p0){
       if (p0 == this.c) {
          this.a.set(false);
       }
       return;
    }
}
