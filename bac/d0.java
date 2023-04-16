package bac.d0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bac.e0;
import bac.p$a;
import java.lang.Object;
import com.kwai.framework.model.user.RecoUser;

public class d0 extends Accessor	// class@0003fc
{
    public final p$a c;
    public final e0 d;

    public void d0(e0 p0,p$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.d;
    }
    public void set(Object p0){
       this.c.d = p0;
    }
}
