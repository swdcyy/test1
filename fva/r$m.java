package fva.r$m;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class r$m extends Accessor	// class@002a26
{

    public void r$m(){
       super();
    }
    public Object get(){
       Boolean uBoolean = PatchProxy.apply(null, this, r$m.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          uBoolean = Boolean.FALSE;
       }
       return uBoolean;
    }
}
