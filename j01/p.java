package j01.p;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import j01.r;
import j01.m;
import java.lang.Object;
import j01.m$b;

public class p extends Accessor	// class@002a06
{
    public final m c;
    public final r d;

    public void p(r p0,m p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.z;
    }
    public void set(Object p0){
       this.c.z = p0;
    }
}
