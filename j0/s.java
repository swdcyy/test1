package j0.s;
import i0.f;
import java.util.concurrent.Executor;
import java.lang.Object;

public final class s extends f	// class@00220e
{
    public final f b;

    public void s(f p0){
       super(p0.a());
       this.b = p0;
    }
    public Executor a(){
       return this.b.a();
    }
    public void b(int p0,long p1,int p2){
       this.b.b(p0, p1, p2);
    }
    public boolean equals(Object p0){
       if (p0 == null || !p0 instanceof s) {
          return false;
       }
       return this.b.equals(p0.b);
    }
    public int hashCode(){
       return this.b.hashCode();
    }
}
