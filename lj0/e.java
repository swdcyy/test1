package lj0.e;
import com.kuaishou.krn.experiment.ExpConfigKt;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import java.lang.Boolean;

public final class e	// class@002f7b
{
    public static final boolean a;

    static {
       Boolean uBoolean = PatchProxy.apply(null, null, ExpConfigKt.class, "74");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          uBoolean = ExpConfigKt.n0.getValue();
       }
       e.a = uBoolean.booleanValue();
    }
    public static final boolean a(){
       return e.a;
    }
}
