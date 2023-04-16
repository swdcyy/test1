package kshark.lite.internal.SortedBytesMap$entrySequence$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import kshark.lite.internal.SortedBytesMap;
import java.lang.Object;
import java.lang.Number;
import utd.e;
import std.a;
import utd.h;

public final class SortedBytesMap$entrySequence$1 extends Lambda implements l	// class@001bd1
{
    public final SortedBytesMap this$0;

    public void SortedBytesMap$entrySequence$1(SortedBytesMap p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0.intValue());
    }
    public final e invoke(int p0){
       SortedBytesMap$entrySequence$1 tthis$0 = this.this$0;
       long l = tthis$0.g(p0);
       tthis$0 = this.this$0;
       return h.c(l, new a(tthis$0.f, ((tthis$0.b * p0) + tthis$0.a), tthis$0.e, tthis$0.d));
    }
}
