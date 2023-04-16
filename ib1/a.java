package ib1.a;
import lf3.g;
import com.kuaishou.live.common.core.component.admin.user.a;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCAssistantPrivilegeChanged;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.String;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lf3.f;

public final class a implements g	// class@002883
{
    public final a b;

    public void a(a p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (TextUtils.n(QCurrentUser.me().getId(), String.valueOf(p0.user.userId))) {
          tb.Uo(true);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
