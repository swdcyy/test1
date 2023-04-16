package fva.r$b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class r$b extends Accessor	// class@002a1b
{

    public void r$b(){
       super();
    }
    public Object get(){
       Boolean uBoolean = PatchProxy.apply(null, this, r$b.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          uBoolean = Boolean.FALSE;
       }
       return uBoolean;
    }
}
