package bq6.k0;
import erd.o;
import to6.r;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import l85.c;
import java.lang.String;
import java.lang.StringBuilder;
import l85.b;
import rh0.a$b;
import oh0.a$b;
import oh0.a$c;
import com.google.protobuf.nano.MessageNano;
import java.lang.Class;
import brd.t;
import zp6.f;

public final class k0 implements o	// class@000595
{
    public final r b;

    public void k0(r p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       k0 tb = this.b;
       long l = p0.longValue();
       Objects.requireNonNull(tb);
       b.a(new c("KwaiIMConversationFolderClient#syncFolders").d(l));
       p0 = new a$b();
       p0.a = l;
       a$b uob = new a$b();
       uob.a = p0;
       return tb.a.b("Session.Folder.Sync", uob, a$c.class);
    }
}
