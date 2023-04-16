package i01.i;
import erd.g;
import i01.j;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import java.util.Objects;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;

public final class i implements g	// class@0027e1
{
    public final j b;
    public final User c;

    public void i(j p0,User p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       f.m(this.c, User$FollowStatus.FOLLOWING);
       tb.X8();
    }
}
