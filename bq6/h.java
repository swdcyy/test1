package bq6.h;
import erd.g;
import bq6.l;
import l85.c;
import com.kwai.imsdk.d;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;
import l85.b;

public final class h implements g	// class@00058c
{
    public final l b;
    public final c c;
    public final d d;

    public void h(l p0,c p1,d p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       b.a(this.c.d("range attachments: "+p0.size()));
       tb.b(this.d, p0);
    }
}
