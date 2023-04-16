package trd.u;
import kotlin.collections.CollectionsKt__CollectionsKt;
import msd.a;
import java.lang.Iterable;
import trd.u$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.lang.Integer;
import java.util.Set;
import java.util.HashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import trd.y;
import kotlin.Pair;
import qrd.r0;

public class u extends CollectionsKt__CollectionsKt	// class@002588
{

    public void u(){
       super();
    }
    public static final Iterable X(a p0){
       return new u$a(p0);
    }
    public static final int Y(Iterable p0,int p1){
       a.p(p0, "$this$collectionSizeOrDefault");
       if (p0 instanceof Collection) {
          p1 = p0.size();
       }
       return p1;
    }
    public static final Integer Z(Iterable p0){
       a.p(p0, "$this$collectionSizeOrNull");
       Integer integer = (p0 instanceof Collection)? Integer.valueOf(p0.size()): null;
       return integer;
    }
    public static final Collection a0(Iterable p0){
       HashSet hashSet;
       a.p(p0, "$this$convertToSetForSetOperation");
       if (p0 instanceof Set) {
       }else if(p0 instanceof Collection){
          Collection uCollection = p0;
          hashSet = (u.d0(uCollection))? CollectionsKt___CollectionsKt.E5(p0): uCollection;
       }else {
          hashSet = CollectionsKt___CollectionsKt.E5(p0);
       }
       return p0;
    }
    public static final Collection b0(Iterable p0,Iterable p1){
       HashSet hashSet;
       a.p(p0, "$this$convertToSetForSetOperationWith");
       a.p(p1, "source");
       if (p0 instanceof Set) {
       }else if(p0 instanceof Collection){
          if (p1 instanceof Collection && p1.size() < 2) {
          }else {
             Collection uCollection = p0;
             hashSet = (u.d0(uCollection))? CollectionsKt___CollectionsKt.E5(p0): uCollection;
          }
       }else {
          hashSet = CollectionsKt___CollectionsKt.E5(p0);
       }
       return p0;
    }
    public static final List c0(Iterable p0){
       a.p(p0, "$this$flatten");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          y.q0(uArrayList, iterator.next());
       }
       return uArrayList;
    }
    public static final boolean d0(Collection p0){
       boolean b = (p0.size() > 2 && p0 instanceof ArrayList)? true: false;
       return b;
    }
    public static final Pair e0(Iterable p0){
       a.p(p0, "$this$unzip");
       int i = u.Y(p0, 10);
       ArrayList uArrayList = new ArrayList(i);
       ArrayList uArrayList1 = new ArrayList(i);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Pair pair = iterator.next();
          uArrayList.add(pair.getFirst());
          uArrayList1.add(pair.getSecond());
       }
       return r0.a(uArrayList, uArrayList1);
    }
}
