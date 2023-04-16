package be1.i;
import lf3.g;
import be1.j;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatCall;
import java.util.Objects;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;
import java.lang.String;
import fq1.b;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserInfoIdentity;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import lf3.f;

public final class i implements g	// class@00035d
{
    public final j b;

    public void i(j p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.bizIdentity.bizType == tb.f && !b.e(p0.extraInfo)) {
          SCInteractiveChatCall guest = p0.guest;
          int len = guest.length;
          int i = 0;
          while (i < len) {
             object oobject = guest[i];
             if ((QCurrentUser.me().getId()).equals(String.valueOf(oobject.userInfo.userId))) {
                tb.bp(oobject.sessionId, p0.countdownMs, oobject.mediaType, p0.bizIdentity.chatId, p0.extraInfo);
             }
             i = i + 1;
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
