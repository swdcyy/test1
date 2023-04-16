package jz8.s1;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import sc6.c;

public class s1 extends Accessor	// class@002a4a
{
    public final n c;
    public final c4 d;

    public void s1(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.P1;
    }
    public void set(Object p0){
       this.c.P1 = p0;
    }
}
