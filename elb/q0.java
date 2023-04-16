package elb.q0;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class q0	// class@002762
{
    public final float mConfidence;
    public int mSecurity;

    public void q0(){
       super();
    }
    public final int a(){
       return this.mSecurity;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, q0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "mSecurity="+this.mSecurity+", mConfidence="+this.mConfidence;
    }
}
