package kotlinx.coroutines.flow.FlowKt__CollectionKt;
import jtd.d;
import java.util.Collection;
import asd.c;
import java.lang.Object;
import kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlinx.coroutines.flow.FlowKt__CollectionKt$a;
import jtd.e;
import java.util.List;
import jtd.f;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;

public final class FlowKt__CollectionKt	// class@0019d8
{

    public static final Object a(d p0,Collection p1,c p2){
       FlowKt__CollectionKt$toCollection$1 otoCollectio;
       FlowKt__CollectionKt$toCollection$1 otoCollectio1;
       if (p2 instanceof FlowKt__CollectionKt$toCollection$1) {
          otoCollectio = p2;
          FlowKt__CollectionKt$toCollection$1 label = otoCollectio.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             otoCollectio.label = label - i;
          label_0018 :
             FlowKt__CollectionKt$toCollection$1 result = otoCollectio.result;
             Object obj = b.h();
             FlowKt__CollectionKt$toCollection$1 label1 = otoCollectio.label;
             if (label1 != null) {
                if (label1 == 1) {
                   otoCollectio1 = otoCollectio.L$1;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                otoCollectio.L$0 = p0;
                otoCollectio.L$1 = p1;
                otoCollectio.L$2 = p0;
                otoCollectio.label = 1;
                if (p0.b(new FlowKt__CollectionKt$a(p1), otoCollectio) == obj) {
                   return obj;
                }
             }
             return otoCollectio1;
          }
       }
       otoCollectio = new FlowKt__CollectionKt$toCollection$1(p2);
       goto label_0018 ;
    }
    public static final Object b(d p0,List p1,c p2){
       return f.O1(p0, p1, p2);
    }
    public static Object c(d p0,List p1,c p2,int p3,Object p4){
       ArrayList uArrayList;
       if (p3 & 0x01) {
          uArrayList = new ArrayList();
       }
       return f.P1(p0, uArrayList, p2);
    }
    public static final Object d(d p0,Set p1,c p2){
       return f.O1(p0, p1, p2);
    }
    public static Object e(d p0,Set p1,c p2,int p3,Object p4){
       LinkedHashSet linkedHashSe;
       if (p3 & 0x01) {
          linkedHashSe = new LinkedHashSet();
       }
       return f.R1(p0, linkedHashSe, p2);
    }
}
