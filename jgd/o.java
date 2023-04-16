package jgd.o;
import erd.g;
import java.lang.Object;
import com.kwai.framework.model.user.QCurrentUser;

public final class o implements g	// class@0016eb
{
    public final boolean b;

    public void o(boolean p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       QCurrentUser.ME.setShakeFriendEnable(this.b);
    }
}
