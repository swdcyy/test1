package bu7.g;
import java.util.concurrent.Callable;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.plugin.kwaitoken.KwaiToken;
import java.lang.Boolean;

public final class g implements Callable	// class@000488
{
    public final String b;

    public void g(String p0){
       this.b = p0;
    }
    public final Object call(){
       return Boolean.valueOf(KwaiToken.k().z1(this.b));
    }
}
