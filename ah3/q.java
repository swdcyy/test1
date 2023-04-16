package ah3.q;
import lf3.g;
import ah3.v;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatApplyAccept;
import java.lang.String;
import oh3.f;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;
import java.lang.CharSequence;
import android.text.TextUtils;
import lh3.b;
import lf3.f;

public final class q implements g	// class@0000d6
{
    public final v b;

    public void q(v p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       q tb = this.b;
       tb.d.e("SCInteractiveChatApplyAccept", p0);
       if (!TextUtils.equals(p0.bizIdentity.chatId, tb.j)) {
       }else {
          tb.e.o(p0.aryaConfig, tb.h, tb.j, tb.k);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
