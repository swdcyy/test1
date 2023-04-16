package bp6.g0;
import java.util.concurrent.Callable;
import com.kwai.imsdk.internal.q;
import com.kwai.imsdk.d;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import java.lang.Integer;
import op6.a;
import cp6.h;
import java.lang.CharSequence;
import ca7.u;
import com.kwai.imsdk.msg.KwaiMsg;
import java.lang.Class;
import com.kwai.chat.sdk.logreport.utils.GsonUtil;
import bp6.c;
import com.kwai.imsdk.internal.util.i;
import ip6.a;
import java.lang.Throwable;
import l85.b;
import cp6.n;
import com.kwai.imsdk.msg.TextMsg;

public final class g0 implements Callable	// class@00051d
{
    public final q b;
    public final d c;

    public void g0(q p0,d p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       Throwable throwable;
       g0 tb = this.b;
       g0 tc = this.c;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[]{tc.getTarget(),Integer.valueOf(tc.getTargetType())};
       a uoa = h.c(3006, String.format("key_conversation_draft_%s_%s", objArray));
       TextMsg textMsg = null;
       if (uoa != null && !u.c(uoa.d())) {
          try{
             KwaiMsg kwaiMsg = GsonUtil.fromJson(uoa.d(), KwaiMsg.class);
             if (kwaiMsg != null) {
                try{
                   kwaiMsg = i.g().a(kwaiMsg);
                }catch(java.lang.Exception e1){
                   textMsg = kwaiMsg;
                }
                b.g(throwable);
             }
             textMsg = kwaiMsg;
          }catch(java.lang.Exception e0){
             throwable = e0;
             goto label_0053 ;
          }
       }else {
          d uod = n.i(tb.f).p(tc.getTarget(), tc.getTargetType());
          if (uod != null && !u.c(uod.h())) {
             textMsg = new TextMsg(tc.getTargetType(), tc.getTarget(), uod.h());
          }
       }
       return textMsg;
    }
}
