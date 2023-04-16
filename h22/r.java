package h22.r;
import com.kuaishou.live.core.show.activityredpacket.user.LiveActivityRedPacketCoupleUserView$a;
import com.kuaishou.live.core.show.activityredpacket.o;
import o22.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import h22.a;
import h22.h;

public class r implements LiveActivityRedPacketCoupleUserView$a	// class@002c0c
{
    public final a a;
    public final o b;

    public void r(o p0,a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       this.b.X8(this.a.b());
       h.c(this.b.Z.a(), this.b.V.a(), this.b.V.d(), this.b.V.b(), "ANCHOR_HEAD", this.b.V.c());
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, r.class, "2")) {
          return;
       }
       this.b.X8(this.a.c());
       h.c(this.b.Z.a(), this.b.V.a(), this.b.V.d(), this.b.V.b(), "SENDGIFT_USER_HEAD", this.b.V.c());
       return;
    }
}
