package ah3.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;

public class a	// class@0000c5
{
    public String mAryaConfig;
    public String mChatId;
    public Object mExtraInfo;
    public String mSessionId;
    public long mTimeoutMs;

    public void a(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ApplyResponse{chatId=\'"+this.mChatId+'''+"sessionId=\'"+this.mSessionId+'''+", aryaConfig is empty="+TextUtils.isEmpty(this.mAryaConfig)+", extraInfo ="+this.mExtraInfo+", timeoutMs ="+this.mTimeoutMs+'}';
    }
}
