package kotlin.collections.SlidingWindowKt;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.util.Iterator;
import kotlin.jvm.internal.a;
import trd.c0;
import kotlin.collections.SlidingWindowKt$windowedIterator$1;
import asd.c;
import msd.p;
import wsd.q;
import wsd.m;
import kotlin.collections.SlidingWindowKt$a;

public final class SlidingWindowKt	// class@001856
{

    public static final void a(int p0,int p1){
       String str = (p0 > 0 && p1 > 0)? 1: null;
       if (!str) {
          String str1 = (p0 != p1)? "Both size "+p0+" and step "+p1+" must be greater than zero.": "size "+p0+" must be greater than zero.";
          throw new IllegalArgumentException(str1.toString());
       }else {
          return;
       }
    }
    public static final Iterator b(Iterator p0,int p1,int p2,boolean p3,boolean p4){
       a.p(p0, "iterator");
       if (!p0.hasNext()) {
          return c0.b;
       }
       SlidingWindowKt$windowedIterator$1 owindowedIte = new SlidingWindowKt$windowedIterator$1(p1, p2, p0, p4, p3, null);
       return q.d(v7);
    }
    public static final m c(m p0,int p1,int p2,boolean p3,boolean p4){
       a.p(p0, "$this$windowedSequence");
       SlidingWindowKt.a(p1, p2);
       SlidingWindowKt$a uoa = new SlidingWindowKt$a(p0, p1, p2, p3, p4);
       return v0;
    }
}
