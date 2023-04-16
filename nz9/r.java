package nz9.r;
import erd.g;
import nz9.z0;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import uw9.o;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;

public final class r implements g	// class@003243
{
    public final z0 b;

    public void r(z0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       o.C().w("AvatarAndFollowBaseElement", "subscribeUpdateFollowState: "+p0, objArray);
       tb.M = false;
       tb.P0();
    }
}
