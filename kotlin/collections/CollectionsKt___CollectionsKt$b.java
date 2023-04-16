package kotlin.collections.CollectionsKt___CollectionsKt$b;
import trd.e0;
import java.lang.Iterable;
import msd.l;
import java.lang.Object;
import java.util.Iterator;

public final class CollectionsKt___CollectionsKt$b implements e0	// class@00184f
{
    public final Iterable a;
    public final l b;

    public void CollectionsKt___CollectionsKt$b(Iterable p0,l p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Iterator a(){
       return this.a.iterator();
    }
    public Object b(Object p0){
       return this.b.invoke(p0);
    }
}
