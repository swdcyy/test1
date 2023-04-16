package jz8.p0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import wz8.f;

public class p0 extends Accessor	// class@002a37
{
    public final n c;
    public final c4 d;

    public void p0(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.j2;
    }
    public void set(Object p0){
       this.c.j2 = p0;
    }
}
