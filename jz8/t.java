package jz8.t;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import brd.t;

public class t extends Accessor	// class@002a54
{
    public final n c;
    public final c4 d;

    public void t(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.p1;
    }
    public void set(Object p0){
       this.c.p1 = p0;
    }
}
