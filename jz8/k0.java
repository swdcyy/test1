package jz8.k0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import com.kwai.feature.api.danmaku.c;

public class k0 extends Accessor	// class@002a19
{
    public final n c;
    public final c4 d;

    public void k0(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.m2;
    }
    public void set(Object p0){
       this.c.m2 = p0;
    }
}
