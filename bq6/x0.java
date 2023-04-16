package bq6.x0;
import erd.o;
import bq6.p2;
import java.lang.Object;
import oh0.a$c;
import java.util.Objects;
import l85.c;
import java.lang.String;
import l85.b;
import brd.t;
import bq6.v0;
import bq6.m1;
import bq6.n1;
import bq6.o1;
import bq6.q1;
import bq6.r1;
import bq6.l2;
import erd.g;

public final class x0 implements o	// class@0005cb
{
    public final p2 b;

    public void x0(p2 p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       x0 tb = this.b;
       Objects.requireNonNull(tb);
       c uoc = new c("KwaiIMConversationFolderManager#handleConversationFolderSyncResponse");
       b.a(uoc.c());
       return t.just(p0).flatMap(new v0(tb)).flatMap(new m1(tb, uoc, p0)).flatMap(new n1(tb, uoc, p0)).flatMap(new o1(tb, uoc, p0)).flatMap(new q1(tb, uoc, p0)).flatMap(new r1(tb, uoc, p0)).doOnError(new l2(uoc));
    }
}
