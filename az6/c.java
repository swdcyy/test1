package az6.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import az6.f;
import az6.a;
import java.lang.Object;
import java.lang.Integer;

public class c extends Accessor	// class@0003ae
{
    public final a c;
    public final f d;

    public void c(f p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.mPhotoIndex);
    }
    public void set(Object p0){
       this.c.mPhotoIndex = p0.intValue();
    }
}
