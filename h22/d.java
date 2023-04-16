package h22.d;
import p22.a$a;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketFragment$b;
import java.lang.Object;
import androidx.lifecycle.ViewModel;
import r22.b;
import p91.m;
import androidx.lifecycle.LifecycleOwner;
import o22.b;

public final class d implements a$a	// class@002bf1
{
    public final LiveActivityRedPacketFragment$b a;

    public void d(LiveActivityRedPacketFragment$b p0){
       this.a = p0;
    }
    public final ViewModel create(){
       d ta = this.a;
       return new b(ta, ta.D, ta.A.e());
    }
}
