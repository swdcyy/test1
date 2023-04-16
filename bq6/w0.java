package bq6.w0;
import erd.o;
import bq6.p2;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import l85.c;
import java.lang.String;
import java.util.Collection;
import com.kwai.imsdk.internal.util.b;
import cp6.n;
import brd.t;
import bq6.o2;
import erd.g;
import bq6.u1;

public final class w0 implements o	// class@0005c7
{
    public final p2 b;

    public void w0(p2 p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       w0 tb = this.b;
       Objects.requireNonNull(tb);
       c uoc = new c("KwaiIMConversationFolderManager#fetchConversationsByConversationFolderReference");
       p0 = (!b.c(p0))? n.i(tb.a).w(p0).doOnError(new o2(uoc)).flatMap(new u1(tb, p0)): t.just(p0);
       return p0;
    }
}
