package androidx.room.RoomDatabase$c;
import java.lang.Object;
import java.util.HashMap;
import w2.c;
import java.lang.Integer;
import java.util.TreeMap;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Iterator;

public class RoomDatabase$c	// class@000264
{
    public HashMap a;

    public void RoomDatabase$c(){
       super();
       this.a = new HashMap();
    }
    public final void a(c p0){
       c a = p0.a;
       c b = p0.b;
       TreeMap treeMap = this.a.get(Integer.valueOf(a));
       if (treeMap == null) {
          treeMap = new TreeMap();
          this.a.put(Integer.valueOf(a), treeMap);
       }
       a = treeMap.get(Integer.valueOf(b));
       if (a != null) {
          "Overriding migration "+a+" with "+p0;
       }
       treeMap.put(Integer.valueOf(b), p0);
       return;
    }
    public void b(c[] p0){
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          this.a(p0[i]);
       }
       return;
    }
    public List c(int p0,int p1){
       if (p0 == p1) {
          return Collections.emptyList();
       }
       boolean b = (p1 > p0)? true: false;
       return this.d(new ArrayList(), b, p0, p1);
    }
    public final List d(List p0,boolean p1,int p2,int p3){
       NavigableSet navigableSet;
       while (true) {
          if (p1) {
             if (p2 < p3) {
             label_0007 :
                TreeMap treeMap = this.a.get(Integer.valueOf(p2));
                if (treeMap == null) {
                   return null;
                }else if(p1){
                   navigableSet = treeMap.descendingKeySet();
                }else {
                   navigableSet = treeMap.keySet();
                }
                Iterator iterator = navigableSet.iterator();
                int i = 0;
                while (iterator.hasNext()) {
                   int i1 = iterator.next().intValue();
                   if (p1) {
                      if (i1 <= p3 && i1 > p2) {
                      label_0043 :
                         i = 1;
                      }
                   }else if(i1 >= p3 && i1 < p2){
                      goto label_0043 ;
                   }
                   if (i) {
                      p0.add(treeMap.get(Integer.valueOf(i1)));
                      p2 = i1;
                      i = 1;
                      break ;
                   }
                }
                if (!i) {
                   return null;
                }
                continue ;
             }
          }else if(p2 > p3){
             goto label_0007 ;
          }
          break ;
       }
       return p0;
    }
}
