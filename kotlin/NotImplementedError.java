package kotlin.NotImplementedError;
import java.lang.Error;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class NotImplementedError extends Error	// class@001812
{

    public void NotImplementedError(){
       super(null, 1, null);
    }
    public void NotImplementedError(String p0){
       a.p(p0, "message");
       super(p0);
    }
    public void NotImplementedError(String p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = "An operation is not implemented.";
       }
       super(p0);
       return;
    }
}
