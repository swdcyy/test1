package az6.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import az6.f;
import az6.a;
import java.lang.Object;
import java.lang.String;

public class d extends Accessor	// class@0003af
{
    public final a c;
    public final f d;

    public void d(f p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mSlidePlayId;
    }
    public void set(Object p0){
       this.c.mSlidePlayId = p0;
    }
}
