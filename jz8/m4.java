package jz8.m4;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.t4;
import jz8.f4;
import java.lang.Object;
import brd.t;

public class m4 extends Accessor	// class@002a29
{
    public final f4 c;
    public final t4 d;

    public void m4(t4 p0,f4 p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.m;
    }
    public void set(Object p0){
       this.c.m = p0;
    }
}