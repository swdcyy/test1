package li1.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class b	// class@002f74
{
    public boolean mIsRecognizedGesture;
    public String mMagicFaceId;

    public void b(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EffectData{magicFaceId=\'"+this.mMagicFaceId+'''+", mIsRecognizedGesture="+this.mIsRecognizedGesture+'}';
    }
}
