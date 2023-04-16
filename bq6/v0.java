package bq6.v0;
import erd.o;
import bq6.p2;
import java.lang.Object;
import oh0.a$c;
import java.util.Objects;
import l85.c;
import java.lang.String;
import l85.b;
import brd.t;
import cp6.u;
import cp6.w;
import brd.w;
import bq6.z;
import com.kwai.middleware.azeroth.network.EmptyResponse;

public final class v0 implements o	// class@0005c3
{
    public final p2 b;

    public void v0(p2 p0){
       super();
       this.b = p0;
    }
    public final Object apply(Object p0){
       v0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.f != null) {
          p0 = new c("KwaiIMConversationFolderManager#cleanLocalData");
          b.a(p0.c());
          p0 = t.merge(tb.b.f(0), tb.b.a(), tb.c.a()).onErrorReturn(new z(p0));
       }else {
          p0 = t.just(new EmptyResponse());
       }
       return p0;
    }
}
