package be1.f;
import lf3.g;
import be1.j;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatClosed;
import java.util.Objects;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;
import java.lang.String;
import fq1.b;
import lf3.f;

public final class f implements g	// class@00035a
{
    public final j b;

    public void f(j p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.bizIdentity.bizType == tb.f && !b.e(p0.extraInfo)) {
          tb.Xo();
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
