package m9a.t;
import java.util.ArrayList;
import java.util.LinkedList;
import m9a.t$b;
import java.lang.String;
import m9a.t$a;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import el5.l;
import ekd.q;
import java.util.Collection;
import java.util.Iterator;
import bk5.c;
import m9a.t$c;
import java.lang.Boolean;
import ak5.j;
import com.yxcorp.gifshow.detail.model.QuickCommentEmotionConfig;
import java.lang.reflect.Type;
import uw9.c;

public class t	// class@002f95
{
    public static final List a;
    public static final List b;
    public static final List c;
    public static final LinkedList d;

    static {
       t.a = new ArrayList();
       t.b = new ArrayList();
       ArrayList uArrayList = new ArrayList();
       t.c = uArrayList;
       LinkedList linkedList = new LinkedList();
       t.d = linkedList;
       uArrayList.add(new t$b("5xae83hqrwsvqk4", null));
       uArrayList.add(new t$b("5xvbtx8kqb5w34k", null));
       uArrayList.add(new t$b("5xm48kbmya4a83u", null));
       linkedList.add("5xm48kbmya4a83u");
       linkedList.add("5xuf77jtvs2tqf6");
       linkedList.add("5x8wqwxwfr6uwuq");
       linkedList.add("5xvbtx8kqb5w34k");
    }
    public void t(){
       super();
    }
    public static List a(){
       Object obj = PatchProxy.apply(null, null, t.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!t.c()) {
          return null;
       }
       return t.a;
    }
    public static List b(){
       ArrayList uArrayList1;
       Iterator iterator1;
       boolean b;
       ArrayList uArrayList2;
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, objArray, t.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = t.a();
       if (obj == null || obj.isEmpty()) {
          return objArray;
       }
       ArrayList uArrayList = new ArrayList(q.i(l.b().c()));
       if (uArrayList.isEmpty()) {
          return obj;
       }
       int i = 0;
       if (uArrayList.size() < 3) {
          uArrayList1 = new ArrayList();
          Iterator iterator = obj.iterator();
          iterator1 = uArrayList.iterator();
          while (true) {
             if (iterator1.hasNext()) {
                c uoc = iterator1.next();
                if (uoc == null) {
                   continue ;
                }else {
                   Iterator iterator2 = obj.iterator();
                label_005e :
                   if (iterator2.hasNext()) {
                      if ((iterator2.next().a.b).equals(uoc.b)) {
                         b = true;
                      }else {
                         goto label_005e ;
                      }
                   }else {
                      b = false;
                   }
                   if (b) {
                      return obj;
                   }else if(iterator.hasNext()){
                      iterator.next();
                   }
                   uArrayList1.add(new t$c(uoc));
                   if (uArrayList1.size() < 3) {
                      continue ;
                   }
                }
             }
             while (uArrayList1.size() < 3 && iterator.hasNext()) {
                uArrayList1.add(iterator.next());
             }
             if (uArrayList1.size() == 3) {
                uArrayList2 = uArrayList1;
             }
          }
          return uArrayList2;
       }else {
          uArrayList1 = new ArrayList();
          iterator1 = uArrayList.subList(i, 3).iterator();
          while (iterator1.hasNext()) {
             uArrayList1.add(new t$c(iterator1.next()));
          }
          if (uArrayList1.size() == 3) {
             uArrayList2 = uArrayList1;
          }
          return uArrayList2;
       }
    }
    public static boolean c(){
       Iterator iterator;
       Iterator iterator1;
       c uoc;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = t.class;
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, objArray, ot, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (!PatchProxy.applyVoid(objArray, objArray, ot, "1") && j.o().t()) {
          obj = t.a;
          if (obj.size() != 3) {
             obj.clear();
             ArrayList uArrayList = new ArrayList(j.o().j());
             if (!uArrayList.isEmpty()) {
                String obj1 = PatchProxy.apply(objArray, objArray, ot, "3");
                if (obj1 != patchProxyRe) {
                   objArray = obj1;
                }else {
                   QuickCommentEmotionConfig quickComment = c.m(QuickCommentEmotionConfig.class);
                   if (quickComment != null) {
                      objArray = quickComment.mQuickCommentPrefer;
                   }
                }
                if (!q.f(objArray)) {
                   iterator = objArray.iterator();
                   while (iterator.hasNext()) {
                      obj1 = iterator.next();
                      iterator1 = uArrayList.iterator();
                      while (true) {
                         if (iterator1.hasNext()) {
                            uoc = iterator1.next();
                            if (uoc != null && obj1.equals(uoc.b)) {
                               t.a.add(new t$c(uoc));
                            }
                         }else {
                            continue ;
                         }
                      }
                   }
                }else {
                   iterator = t.c.iterator();
                   while (iterator.hasNext()) {
                      t$b uob = iterator.next();
                      iterator1 = uArrayList.iterator();
                      while (true) {
                         if (iterator1.hasNext()) {
                            uoc = iterator1.next();
                            if (uoc != null && (uob.a).equals(uoc.b)) {
                               t.a.add(new t$c(uoc));
                            }
                         }else {
                            continue ;
                         }
                      }
                   }
                }
             }
          }
       }
       if (j.o().t()) {
          List a = t.a;
          if (a.size() == 3) {
             iterator = a.iterator();
             while (true) {
                if (!iterator.hasNext()) {
                   return true;
                }
                if (!j.o().w(iterator.next().a.a)) {
                   break ;
                }
             }
             return false;
          }
       }
       return false;
    }
}
