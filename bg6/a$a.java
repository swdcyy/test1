package bg6.a$a;
import zf6.k$b;
import bg6.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;

public class a$a implements k$b	// class@000498
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public String getUid(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return QCurrentUser.me().getId();
    }
}
