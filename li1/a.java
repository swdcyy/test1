package li1.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class a	// class@002f73
{
    public int mInteractComboEffectFinishInteractType;
    public boolean mInteractComboEffectGameOver;

    public void a(){
       super();
       this.mInteractComboEffectFinishInteractType = 0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveInteractiveComboEffectSdkMessage{interactComboEffectFinishInteractType="+this.mInteractComboEffectFinishInteractType+", interactComboEffectGameOver="+this.mInteractComboEffectGameOver+'}';
    }
}
