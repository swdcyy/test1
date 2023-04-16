package bh3.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;

public class a	// class@0003b6
{
    public String mAryaConfig;
    public List mCalledUserIdList;
    public String mChatId;
    public String mExtraInfo;
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
       return "CallResponse{chatId=\'"+this.mChatId+'''+"sessionId=\'"+this.mSessionId+'''+", calledUserIdList="+this.mCalledUserIdList+", aryaConfig is empty="+TextUtils.isEmpty(this.mAryaConfig)+", extraInfo ="+this.mExtraInfo+", timeoutMs ="+this.mTimeoutMs+'}';
    }
}
