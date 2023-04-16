package a3d.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import a3d.h;
import a3d.a;
import java.lang.Object;
import mrd.c;

public class c extends Accessor	// class@000078
{
    public final a c;
    public final h d;

    public void c(h p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.d;
    }
    public void set(Object p0){
       this.c.d = p0;
    }
}
