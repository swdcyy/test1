package be1.g;
import lf3.g;
import be1.j;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatUserLeaveInfo;
import java.util.Objects;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;
import java.lang.String;
import fq1.b;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserInfoIdentity;
import lf3.f;

public final class g implements g	// class@00035b
{
    public final j b;

    public void g(j p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.bizIdentity.bizType == tb.f) {
          SCInteractiveChatUserLeaveInfo leaveReason = p0.leaveReason;
          if (leaveReason == 1 || (leaveReason == 2 && !b.e(p0.extraInfo))) {
             tb.ap(p0.userInfo);
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
