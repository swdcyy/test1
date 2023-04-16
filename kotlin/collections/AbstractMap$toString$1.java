package kotlin.collections.AbstractMap$toString$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import kotlin.collections.AbstractMap;
import java.util.Map$Entry;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class AbstractMap$toString$1 extends Lambda implements l	// class@00182d
{
    public final AbstractMap this$0;

    public void AbstractMap$toString$1(AbstractMap p0){
       this.this$0 = p0;
       super(1);
    }
    public final CharSequence invoke(Map$Entry p0){
       a.p(p0, "it");
       return this.this$0.j(p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
