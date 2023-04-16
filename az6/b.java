package az6.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import az6.f;
import az6.a;
import java.lang.Object;
import java.lang.Integer;

public class b extends Accessor	// class@0003ad
{
    public final a c;
    public final f d;

    public void b(f p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.mFeedPosition);
    }
    public void set(Object p0){
       this.c.mFeedPosition = p0.intValue();
    }
}
