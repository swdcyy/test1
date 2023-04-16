package gx0.i;
import com.kuaishou.live.core.show.blessingbag.c$a;
import com.kuaishou.livestream.message.nano.LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice;
import java.lang.Object;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.String;
import java.lang.Number;

public final class i implements c$a	// class@00259e
{
    public final LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice a;

    public void i(LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice p0){
       this.a = p0;
    }
    public final void a(ClientEvent$ElementPackage p0){
       i3 oi3 = i3.f();
       oi3.c("type", Integer.valueOf(this.a.taskType));
       p0.params = oi3.e();
    }
}
