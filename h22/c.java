package h22.c;
import p22.a$a;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketFragment$b;
import java.lang.Object;
import androidx.lifecycle.ViewModel;
import r22.a;
import androidx.lifecycle.LifecycleOwner;
import o22.b;

public final class c implements a$a	// class@002bef
{
    public final LiveActivityRedPacketFragment$b a;

    public void c(LiveActivityRedPacketFragment$b p0){
       this.a = p0;
    }
    public final ViewModel create(){
       c ta = this.a;
       return new a(ta, ta.D);
    }
}
