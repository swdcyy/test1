package h73.h;
import erd.g;
import h73.t;
import com.kwai.framework.model.user.User;
import java.lang.String;
import z1.a;
import java.lang.Object;
import java.util.Objects;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;
import h73.n;

public final class h implements g	// class@002cb5
{
    public final t b;
    public final User c;
    public final int d;
    public final String e;
    public final a f;
    public final a g;
    public final String h;

    public void h(t p0,User p1,int p2,String p3,a p4,a p5,String p6){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
    }
    public final void accept(Object p0){
       h tb = this.b;
       h td = this.d;
       h te = this.e;
       h tf = this.f;
       h tg = this.g;
       h th = this.h;
       Objects.requireNonNull(tb);
       f.m(this.c, User$FollowStatus.FOLLOWING);
       if (tb.i(td, "LITE_ROOM_JOIN_FANS_GROUP")) {
          tb.b();
          tb.f("JoinDialog", (long)td);
       }else {
          tb.g(tf, new n(tb, te), tg, th);
       }
       return;
    }
}
