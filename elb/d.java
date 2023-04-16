package elb.d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class d	// class@002744
{
    public String mAutoInit;
    public boolean mLazyLoadSecondFragment;
    public boolean mLazyLoadThirdFragment;
    public String mManualInit;
    public String mPreCreateSecondPlayerTime;

    public void d(){
       super();
       this.mLazyLoadSecondFragment = false;
       this.mPreCreateSecondPlayerTime = "none";
       this.mManualInit = "slideup";
       this.mAutoInit = "tti_low";
       this.mLazyLoadThirdFragment = false;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DelayDetailFragmentConfig{mLazyLoadSecondFragment="+this.mLazyLoadSecondFragment+", mPreCreateSecondPlayerTime=\'"+this.mPreCreateSecondPlayerTime+'''+", mManualInit=\'"+this.mManualInit+'''+", mAutoInit=\'"+this.mAutoInit+'''+", mLazyLoadThirdFragment="+this.mLazyLoadThirdFragment+'}';
    }
}
