package k3.b$a;
import java.lang.Object;
import androidx.work.NetworkType;
import k3.c;
import k3.b;

public final class b$a	// class@00246b
{
    public boolean a;
    public boolean b;
    public NetworkType c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public c h;

    public void b$a(){
       super();
       this.a = false;
       this.b = false;
       this.c = NetworkType.NOT_REQUIRED;
       this.d = false;
       this.e = false;
       this.f = -1;
       this.g = -1;
       this.h = new c();
    }
    public b a(){
       return new b(this);
    }
    public b$a b(NetworkType p0){
       this.c = p0;
       return this;
    }
    public b$a c(boolean p0){
       this.d = p0;
       return this;
    }
    public b$a d(boolean p0){
       this.e = p0;
       return this;
    }
}
