package kotlin.sequences.SequencesKt___SequencesKt$flatMap$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import java.lang.Iterable;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import java.util.Iterator;
import kotlin.jvm.internal.a;

public final class SequencesKt___SequencesKt$flatMap$1 extends FunctionReferenceImpl implements l	// class@0018d1
{
    public static final SequencesKt___SequencesKt$flatMap$1 INSTANCE;

    static {
       SequencesKt___SequencesKt$flatMap$1.INSTANCE = new SequencesKt___SequencesKt$flatMap$1();
    }
    public void SequencesKt___SequencesKt$flatMap$1(){
       super(1, Iterable.class, "iterator", "iterator\(\)Ljava/util/Iterator;", 0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Iterator invoke(Iterable p0){
       a.p(p0, "p1");
       return p0.iterator();
    }
}
