package m02.n1;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import m02.o1;
import com.kuaishou.live.core.basic.activity.LivePlayTestActivity;
import java.lang.Object;

public class n1 extends Accessor	// class@0030d0
{
    public final LivePlayTestActivity c;
    public final o1 d;

    public void n1(o1 p0,LivePlayTestActivity p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c;
    }
}
