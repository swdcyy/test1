package a3d.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import a3d.h;
import a3d.a;
import java.lang.Object;
import mrd.c;

public class e extends Accessor	// class@00007a
{
    public final a c;
    public final h d;

    public void e(h p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.f;
    }
    public void set(Object p0){
       this.c.f = p0;
    }
}
