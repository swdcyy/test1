package bq6.i;
import erd.o;
import bq6.l;
import l85.c;
import com.kwai.imsdk.d;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.StringBuilder;
import l85.b;
import to6.h;
import io.reactivex.g;
import brd.t;
import to6.b;
import to6.q;

public final class i implements o	// class@000590
{
    public final l b;
    public final c c;
    public final d d;

    public void i(l p0,c p1,d p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       i tb = this.b;
       i td = this.d;
       Objects.requireNonNull(tb);
       b.a(this.c.d("offset: "+p0));
       l c = tb.c;
       Objects.requireNonNull(c);
       return t.create(new h(td, p0)).flatMap(new b(c, td, new c("KwaiIMAttachmentClient#syncMessageAttachments")));
    }
}
