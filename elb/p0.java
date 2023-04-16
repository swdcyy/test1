package elb.p0;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class p0	// class@002760
{
    public final int mConfidence;
    public List mPosition;
    public final List mSubObjects;
    public final List mSubScenes;
    public String mType;

    public void p0(){
       super();
    }
    public final int a(){
       return this.mConfidence;
    }
    public final List b(){
       return this.mPosition;
    }
    public final List c(){
       return this.mSubObjects;
    }
    public final List d(){
       return this.mSubScenes;
    }
    public final String e(){
       return this.mType;
    }
    public final void f(List p0){
       this.mPosition = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, p0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "YcnnObject mType="+this.mType+" mConfidence="+this.mConfidence;
    }
}
