package bh3.n;
import lf3.g;
import bh3.s;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatGuestRejected;
import java.lang.String;
import oh3.f;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserInfoIdentity;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import bh3.s$d;
import bh3.s$c;
import jh3.a;
import lf3.f;

public final class n implements g	// class@0003c6
{
    public final s b;

    public void n(s p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       s d;
       n tb = this.b;
       tb.e.e("SCInteractiveChatGuestRejected", p0);
       if (!TextUtils.equals(p0.bizIdentity.chatId, tb.j)) {
       }else {
          SCInteractiveChatGuestRejected guest = p0.guest;
          int len = guest.length;
          int i = 0;
          while (i < len) {
             if (TextUtils.equals(String.valueOf(guest[i].userInfo.userId), tb.d.c)) {
                tb.e.a("receiveReject");
                s f = tb.f;
                int i1 = 1;
                if (f != null) {
                   d = tb.d;
                   f.d(d.a, d.c, tb.i, i1);
                }
                d = tb.d;
                tb.h.g(d.a, d.c, i1, tb.a());
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
