package bq6.s2;
import erd.g;
import bq6.x2;
import l85.c;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.kwai.chat.sdk.client.MessageSDKException;
import java.lang.String;
import l85.b;
import nq6.s;
import java.util.Map;
import android.util.Pair;
import java.lang.Integer;

public final class s2 implements g	// class@0005b9
{
    public final x2 b;
    public final c c;

    public void s2(x2 p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       s2 tb = this.b;
       s2 tc = this.c;
       Objects.requireNonNull(tb);
       if (p0 instanceof MessageSDKException) {
          MessageSDKException messageSDKEx = p0;
          int errCode = messageSDKEx.getErrCode();
          tb.c(errCode, messageSDKEx.getErrMsg());
       }else {
          tb.c(-1, p0.getMessage());
       }
       b.c(tc.e(p0));
       s os = s.t(tb.a);
       Map map = os.x("IMSDK.ConversationTag.Sync");
       p0 = os.z(p0);
       os.c(map, p0.first.intValue(), p0.second);
       os.B(map, 0.00f);
       return;
    }
}
