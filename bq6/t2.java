package bq6.t2;
import erd.o;
import to6.u;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import l85.c;
import to6.s;
import io.reactivex.g;
import brd.t;
import to6.t;

public final class t2 implements o	// class@0005bd
{
    public final u b;

    public void t2(u p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       t2 tb = this.b;
       Objects.requireNonNull(tb);
       return t.create(new s(p0)).flatMap(new t(tb, new c("KwaiIMConversationTagClient#syncTags")));
    }
}
