package ch3.n;
import lf3.g;
import ch3.t;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatMatched;
import java.lang.String;
import oh3.f;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;
import lh3.b;
import ch3.i;
import z1.a;
import oh3.a;
import java.util.Objects;
import jh3.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import lnc.i3;
import java.lang.Number;
import kotlin.jvm.internal.a;
import ih3.b;
import lf3.f;

public final class n implements g	// class@000557
{
    public final t b;

    public void n(t p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       n tb = this.b;
       String str = "SCInteractiveChatMatched";
       tb.d.e(str, p0);
       if (!TextUtils.isEmpty(tb.l)) {
          tb.d.c(str, "matchId", tb.l);
          if (TextUtils.equals(p0.matchId, tb.l)) {
          label_0030 :
             tb.T();
             if (!TextUtils.isEmpty(p0.aryaConfig)) {
                SCInteractiveChatMatched bizIdentity = p0.bizIdentity;
                tb.c.o(p0.aryaConfig, bizIdentity.bizType, bizIdentity.chatId, p0.sessionId);
             }
             tb.Q(new i(tb));
             t g = tb.g;
             InteractiveChatBizIdentity bizType = p0.bizIdentity.bizType;
             Objects.requireNonNull(g);
             a uoa = a.class;
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(bizType), g, uoa, "15")) {
                i3 oi3 = i3.f();
                oi3.c("biz", Integer.valueOf(bizType));
                oi3.d("status", "SUCCESS");
                oi3.d("moduleName", "MATCHED");
                a.o(oi3, "builder");
                g.a.e(oi3);
             }
          }
       }else if(p0.bizIdentity.bizType != tb.i){
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
