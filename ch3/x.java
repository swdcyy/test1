package ch3.x;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class x	// class@000564
{
    public String mExtraInfo;
    public String mMatchId;
    public long mTimeoutMs;

    public void x(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, x.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MatchResponse{extraInfo ="+this.mExtraInfo+", timeoutMs ="+this.mTimeoutMs+'}';
    }
}
