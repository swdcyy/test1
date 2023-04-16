package bq6.m;
import io.reactivex.g;
import java.util.Set;
import java.lang.Object;
import brd.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import brd.g;

public final class m implements g	// class@0005a1
{
    public final Set b;

    public void m(Set p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       m tb = this.b;
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList(tb);
       int i = 0;
       while (i < tb.size()) {
          int i1 = i % 999;
          if (!i1) {
             HashSet hashSet = new HashSet(999);
             hashSet.add(uArrayList1.get(i));
             uArrayList.add(hashSet);
          }else {
             i1 = i / 999;
             uArrayList.get(i1).add(uArrayList1.get(i));
          }
          i = i + 1;
       }
       p0.onNext(uArrayList);
       p0.onComplete();
       return;
    }
}
