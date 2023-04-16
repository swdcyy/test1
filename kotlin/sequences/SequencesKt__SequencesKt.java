package kotlin.sequences.SequencesKt__SequencesKt;
import wsd.r;
import msd.a;
import wsd.m;
import kotlin.sequences.SequencesKt__SequencesKt$a;
import java.util.Iterator;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.sequences.SequencesKt__SequencesKt$b;
import wsd.a;
import wsd.g;
import msd.p;
import msd.l;
import kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1;
import asd.c;
import wsd.q;
import kotlin.sequences.SequencesKt__SequencesKt$flatten$1;
import wsd.w;
import wsd.i;
import kotlin.sequences.SequencesKt__SequencesKt$flatten$3;
import kotlin.sequences.SequencesKt__SequencesKt$flatten$2;
import wsd.j;
import kotlin.sequences.SequencesKt__SequencesKt$generateSequence$2;
import kotlin.sequences.SequencesKt__SequencesKt$generateSequence$1;
import kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1;
import kotlin.collections.ArraysKt___ArraysKt;
import ssd.e;
import kotlin.sequences.SequencesKt__SequencesKt$shuffled$1;
import kotlin.Pair;
import java.util.ArrayList;
import qrd.r0;

public class SequencesKt__SequencesKt extends r	// class@0018c4
{

    public void SequencesKt__SequencesKt(){
       super();
    }
    public static final m g(a p0){
       return new SequencesKt__SequencesKt$a(p0);
    }
    public static final m h(Iterator p0){
       a.p(p0, "$this$asSequence");
       return SequencesKt__SequencesKt.i(new SequencesKt__SequencesKt$b(p0));
    }
    public static final m i(m p0){
       a.p(p0, "$this$constrainOnce");
       if (p0 instanceof a) {
       }else {
          a uoa = new a(p0);
       }
       return p0;
    }
    public static final m j(){
       return g.a;
    }
    public static final m k(m p0,p p1,l p2){
       a.p(p0, "source");
       a.p(p1, "transform");
       a.p(p2, "iterator");
       return q.e(new SequencesKt__SequencesKt$flatMapIndexed$1(p0, p1, p2, null));
    }
    public static final m l(m p0){
       a.p(p0, "$this$flatten");
       return SequencesKt__SequencesKt.m(p0, SequencesKt__SequencesKt$flatten$1.INSTANCE);
    }
    public static final m m(m p0,l p1){
       if (p0 instanceof w) {
          return p0.c(p1);
       }
       return new i(p0, SequencesKt__SequencesKt$flatten$3.INSTANCE, p1);
    }
    public static final m n(m p0){
       a.p(p0, "$this$flatten");
       return SequencesKt__SequencesKt.m(p0, SequencesKt__SequencesKt$flatten$2.INSTANCE);
    }
    public static final m o(Object p0,l p1){
       a.p(p1, "nextFunction");
       p0 = (p0 == null)? g.a: new j(new SequencesKt__SequencesKt$generateSequence$2(p0), p1);
       return p0;
    }
    public static final m p(a p0){
       a.p(p0, "nextFunction");
       return SequencesKt__SequencesKt.i(new j(p0, new SequencesKt__SequencesKt$generateSequence$1(p0)));
    }
    public static final m q(a p0,l p1){
       a.p(p0, "seedFunction");
       a.p(p1, "nextFunction");
       return new j(p0, p1);
    }
    public static final m r(m p0,a p1){
       a.p(p0, "$this$ifEmpty");
       a.p(p1, "defaultValue");
       return q.e(new SequencesKt__SequencesKt$ifEmpty$1(p0, p1, null));
    }
    public static final m s(m p0){
       if (p0 != null) {
       }else {
          p0 = SequencesKt__SequencesKt.j();
       }
       return p0;
    }
    public static final m t(Object[] p0){
       a.p(p0, "elements");
       int i = (!p0.length)? 1: 0;
       m om = (i)? SequencesKt__SequencesKt.j(): ArraysKt___ArraysKt.h5(p0);
       return om;
    }
    public static final m u(m p0){
       a.p(p0, "$this$shuffled");
       return SequencesKt__SequencesKt.v(p0, e.b);
    }
    public static final m v(m p0,e p1){
       a.p(p0, "$this$shuffled");
       a.p(p1, "random");
       return q.e(new SequencesKt__SequencesKt$shuffled$1(p0, p1, null));
    }
    public static final Pair w(m p0){
       a.p(p0, "$this$unzip");
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Pair pair = iterator.next();
          uArrayList.add(pair.getFirst());
          uArrayList1.add(pair.getSecond());
       }
       return r0.a(uArrayList, uArrayList1);
    }
}
