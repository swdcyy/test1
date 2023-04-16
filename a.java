package a;
import tw5.e;
import java.lang.Object;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import java.lang.Boolean;

public class a implements e	// class@000107
{

    public void a(){
       super();
    }
    public boolean a(){
       Boolean uBoolean = PatchProxy.apply(null, null, LocalConfigKeyHelper.class, "6");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          uBoolean = LocalConfigKeyHelper.f.getValue();
       }
       return uBoolean.booleanValue();
    }
}
