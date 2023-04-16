package fja.k;
import ok.x;
import java.lang.Object;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Boolean;

public final class k implements x	// class@002956
{
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf((QCurrentUser.ME.isLogined() ^ 0x01));
    }
}
