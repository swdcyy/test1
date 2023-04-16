package androidx.room.d0$a;
import java.lang.Object;
import a3.b;
import androidx.room.d0$b;
import java.lang.String;
import java.lang.UnsupportedOperationException;

public abstract class d0$a	// class@00026b
{
    public final int a;

    public void d0$a(int p0){
       super();
       this.a = p0;
    }
    public abstract void a(b p0);
    public abstract void b(b p0);
    public abstract void c(b p0);
    public abstract void d(b p0);
    public void e(b p0){
    }
    public void f(b p0){
    }
    public d0$b g(b p0){
       this.h(p0);
       return new d0$b(true, null);
    }
    public void h(b p0){
       throw new UnsupportedOperationException("validateMigration is deprecated");
    }
}
