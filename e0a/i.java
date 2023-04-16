package e0a.i;
import ok.x;
import java.lang.Object;
import e0a.j;
import java.lang.String;
import xf6.b;
import com.kwai.sdk.switchconfig.a;
import java.lang.Boolean;

public final class i implements x	// class@002035
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final Object get(){
       Boolean uBoolean;
       int i = b.b("enableSerialDetailOpt");
       if (i != 1) {
          uBoolean = (i != 2)? Boolean.valueOf(a.t().d("ksEnableDetailJumpWithSerialPhoto", false)): Boolean.FALSE;
       }else {
          uBoolean = Boolean.TRUE;
       }
       return uBoolean;
    }
}
