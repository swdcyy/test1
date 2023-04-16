package da1.b;
import ok.o;
import java.lang.Object;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.String;
import ok.k;

public final class b implements o	// class@001f5a
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final boolean apply(Object p0){
       return k.a(p0.mId, QCurrentUser.ME.getId());
    }
}
