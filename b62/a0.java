package b62.a0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b62.f0;
import b62.z;
import java.lang.Object;
import java.lang.Boolean;

public class a0 extends Accessor	// class@000330
{
    public final z c;
    public final f0 d;

    public void a0(f0 p0,z p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.j);
    }
    public void set(Object p0){
       this.c.j = p0.booleanValue();
    }
}
