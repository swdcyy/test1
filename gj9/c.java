package gj9.c;
import e9c.h$d;
import com.yxcorp.gifshow.channel.stagger.HotChannelFragment;
import java.lang.Object;
import hka.k;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.kwai.component.homepage_interface.homeitemfragment.a;

public final class c implements h$d	// class@0024b1
{
    public final HotChannelFragment a;

    public void c(HotChannelFragment p0){
       this.a = p0;
    }
    public final boolean a(k p0){
       return this.a.J.g(RefreshType.PULL_DOWN, true);
    }
}
