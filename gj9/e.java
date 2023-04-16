package gj9.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import gj9.j;
import com.yxcorp.gifshow.channel.stagger.HotChannelFragment;
import java.lang.Object;
import java.lang.Integer;

public class e extends Accessor	// class@0024b3
{
    public final HotChannelFragment c;
    public final j d;

    public void e(j p0,HotChannelFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.O);
    }
    public void set(Object p0){
       this.c.O = p0.intValue();
    }
}
