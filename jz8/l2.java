package jz8.l2;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import java.lang.String;

public class l2 extends Accessor	// class@002a21
{
    public final n c;
    public final c4 d;

    public void l2(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.i2;
    }
    public void set(Object p0){
       this.c.i2 = p0;
    }
}