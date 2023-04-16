package gj9.d;
import erd.g;
import com.yxcorp.gifshow.channel.stagger.HotChannelFragment;
import java.lang.Object;
import hlb.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class d implements g	// class@0024b2
{
    public final HotChannelFragment b;

    public void d(HotChannelFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       if (p0.equals(tb.G)) {
       }else {
          tb.G = p0;
          tb.b2(1);
       }
       return;
    }
}
