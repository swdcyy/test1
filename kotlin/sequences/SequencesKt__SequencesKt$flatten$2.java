package kotlin.sequences.SequencesKt__SequencesKt$flatten$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Iterable;
import java.util.Iterator;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class SequencesKt__SequencesKt$flatten$2 extends Lambda implements l	// class@0018be
{
    public static final SequencesKt__SequencesKt$flatten$2 INSTANCE;

    static {
       SequencesKt__SequencesKt$flatten$2.INSTANCE = new SequencesKt__SequencesKt$flatten$2();
    }
    public void SequencesKt__SequencesKt$flatten$2(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Iterator invoke(Iterable p0){
       a.p(p0, "it");
       return p0.iterator();
    }
}
