package gx0.f;
import com.kuaishou.live.core.show.blessingbag.c$a;
import com.kuaishou.livestream.message.nano.LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice;
import java.lang.Object;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.String;
import java.lang.Number;
import com.kuaishou.live.audience.component.blessingbag.e;
import java.lang.Boolean;
import d61.l0;

public final class f implements c$a	// class@00259b
{
    public final LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice a;

    public void f(LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice p0){
       this.a = p0;
    }
    public final void a(ClientEvent$ElementPackage p0){
       i3 oi3 = i3.f();
       oi3.c("type", Integer.valueOf(this.a.taskType));
       String str = "1";
       oi3.d("btn_type", str);
       if (e.K.b(Boolean.FALSE).booleanValue()) {
       }else {
          str = "0";
       }
       oi3.d("if_unnotice", str);
       p0.params = oi3.e();
       return;
    }
}
