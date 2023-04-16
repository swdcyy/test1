package dwa.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import dwa.h;
import dwa.b;
import java.lang.Object;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;

public class c extends Accessor	// class@00258c
{
    public final b c;
    public final h d;

    public void c(h p0,b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.j;
    }
    public void set(Object p0){
       this.c.j = p0;
    }
}
