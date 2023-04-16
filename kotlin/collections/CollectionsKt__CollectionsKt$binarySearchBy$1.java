package kotlin.collections.CollectionsKt__CollectionsKt$binarySearchBy$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Comparable;
import java.lang.Object;
import xrd.b;
import java.lang.Integer;

public final class CollectionsKt__CollectionsKt$binarySearchBy$1 extends Lambda implements l	// class@00184c
{
    public final Comparable $key;
    public final l $selector;

    public void CollectionsKt__CollectionsKt$binarySearchBy$1(l p0,Comparable p1){
       this.$selector = p0;
       this.$key = p1;
       super(1);
    }
    public final int invoke(Object p0){
       return b.f(this.$selector.invoke(p0), this.$key);
    }
    public Object invoke(Object p0){
       return Integer.valueOf(this.invoke(p0));
    }
}
