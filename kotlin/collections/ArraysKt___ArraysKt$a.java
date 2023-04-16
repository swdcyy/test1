package kotlin.collections.ArraysKt___ArraysKt$a;
import java.lang.Iterable;
import osd.a;
import java.lang.Object;
import java.util.Iterator;
import nsd.h;

public final class ArraysKt___ArraysKt$a implements Iterable, a	// class@00182f
{
    public final Object[] b;

    public void ArraysKt___ArraysKt$a(Object[] p0){
       this.b = p0;
       super();
    }
    public Iterator iterator(){
       return h.a(this.b);
    }
}
