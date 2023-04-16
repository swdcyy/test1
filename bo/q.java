package bo.q;
import io.b$a;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.aegon.Aegon;

public final class q implements b$a	// class@000322
{
    public final String a;

    public void q(String p0){
       this.a = p0;
    }
    public final Object get(){
       return Aegon.nativeGetRequestExtraInfo(this.a);
    }
}
