package nh.a$a;
import ok.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;

public final class a$a implements x	// class@002709
{
    public static final a$a b;

    static {
       a$a.b = new a$a();
    }
    public void a$a(){
       super();
    }
    public Object get(){
       Boolean uBoolean = PatchProxy.apply(null, this, a$a.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          uBoolean = Boolean.valueOf(a.t().d("enableHidePendantWithSerialAutoPlay", true));
       }
       return uBoolean;
    }
}
