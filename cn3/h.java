package cn3.h;
import erd.g;
import cn3.i;
import eo3.g;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import eo3.w;
import eo3.f;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper;
import wkd.b;
import i62.a;
import eo3.b0;

public final class h implements g	// class@0005a7
{
    public final i b;
    public final g c;

    public void h(i p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       h tb = this.b;
       h tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, i.class, "2")) {
       }else if(QCurrentUser.me().isLogined()){
          p0 = tc.getContext().c();
          if (p0 != null) {
             p0.s();
          }
          b.a(0x4c63d520).a(tc.getContext().h().a());
       }
       return;
    }
}
