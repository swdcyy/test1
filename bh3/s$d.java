package bh3.s$d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class s$d	// class@0003ce
{
    public int a;
    public int b;
    public String c;
    public String d;
    public String e;

    public void s$d(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, s$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveInteractInviteInnerParam{mCurrentBiz="+this.a+", mMediaType="+this.b+", mCurrentInviteUser="+this.c+", mLiveStreamId="+this.d+", mBizExtraInfo="+this.e+'}';
    }
}
