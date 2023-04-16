package bp6.v;
import erd.g;
import com.kwai.imsdk.internal.o;
import com.kwai.imsdk.msg.KwaiMsg;
import l85.c;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.String;
import pq6.a;
import com.kwai.imsdk.msg.state.SendMsgThrowable;
import nq6.s;
import com.kwai.imsdk.internal.trace.ImTraceManager;
import java.lang.Integer;
import l85.b;
import java.lang.StringBuilder;

public final class v implements g	// class@000556
{
    public final o b;
    public final KwaiMsg[] c;
    public final c d;

    public void v(o p0,KwaiMsg[] p1,c p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       Object[] objArray;
       v tb = this.b;
       v tc = this.c;
       v td = this.d;
       Objects.requireNonNull(tb);
       object oobject = tc[0];
       if (oobject != null && p0 != null) {
          String str = a.d(oobject);
          if (p0 instanceof SendMsgThrowable) {
             SendMsgThrowable sendMsgThrow = p0;
             s.t(tb.g).R(str, oobject, sendMsgThrow.mErrorCode, sendMsgThrow.mErrorMessage);
             ImTraceManager.getInstance(tb.g).stopSegmentWithErrorForMessage(oobject, "SendComplete", sendMsgThrow.mErrorMessage, sendMsgThrow.mErrorCode);
             objArray = new Object[]{Integer.valueOf(sendMsgThrow.mErrorCode),sendMsgThrow.mErrorMessage};
             b.a(String.format("sendMessage fail errorCode = %d errorMsg = %s", objArray));
          }else {
             s.t(tb.g).R(str, oobject, -1, p0.getMessage());
             ImTraceManager.getInstance(tb.g).stopSegmentWithErrorForMessage(oobject, "SendComplete", p0.getMessage(), -1);
             objArray = new Object[]{Integer.valueOf(-1),p0.getMessage()};
             b.a(String.format("sendMessage fail errorCode = %d errorMsg = %s", objArray));
          }
       }
       b.c(td.e(p0)+" kwaiMsg: "+tc[0]);
       return;
    }
}
