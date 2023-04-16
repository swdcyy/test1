package be1.h;
import lf3.g;
import be1.j;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatUserInfo;
import java.util.Objects;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;
import java.lang.String;
import fq1.b;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserInfoIdentity;
import lf3.f;

public final class h implements g	// class@00035c
{
    public final j b;

    public void h(j p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.bizIdentity.bizType == tb.f && !b.e(p0.extraInfo)) {
          tb.Zo(p0.userInfo, p0.extraInfo);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
