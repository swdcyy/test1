package dx9.f;
import erd.g;
import java.lang.Object;
import njd.a;
import com.kwai.framework.model.user.QCurrentUser;

public final class f implements g	// class@001fec
{
    public final boolean b;

    public void f(boolean p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       QCurrentUser.me().setAllowCommentMoment(this.b);
    }
}
