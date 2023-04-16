package kotlin.collections.AbstractCollection$toString$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import kotlin.collections.AbstractCollection;
import java.lang.Object;
import java.lang.CharSequence;
import java.lang.String;

public final class AbstractCollection$toString$1 extends Lambda implements l	// class@001826
{
    public final AbstractCollection this$0;

    public void AbstractCollection$toString$1(AbstractCollection p0){
       this.this$0 = p0;
       super(1);
    }
    public final CharSequence invoke(Object p0){
       p0 = (p0 == this.this$0)? "\(this Collection\)": String.valueOf(p0);
       return p0;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
