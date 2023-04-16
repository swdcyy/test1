package ah3.p;
import lf3.g;
import ah3.v;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatApplyReject;
import java.lang.String;
import oh3.f;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;
import java.lang.CharSequence;
import android.text.TextUtils;
import ah3.k;
import z1.a;
import oh3.a;
import jh3.a;
import lf3.f;

public final class p implements g	// class@0000d5
{
    public final v b;

    public void p(v p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       p tb = this.b;
       tb.d.e("SCInteractiveChatApplyReject", p0);
       if (!TextUtils.equals(p0.bizIdentity.chatId, tb.j)) {
       }else {
          tb.T(false);
          tb.Q(new k(tb));
          tb.g.a(tb.h, 1, tb.i);
          tb.S();
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
