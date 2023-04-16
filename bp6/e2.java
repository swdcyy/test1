package bp6.e2;
import bp6.e2$a;
import bp6.e2$b;
import bp6.e2$c;
import bp6.e2$d;
import java.lang.Object;
import java.util.HashMap;
import java.util.HashSet;
import bp6.e2$f;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import com.kwai.imsdk.msg.KwaiMsg;
import java.lang.String;
import java.lang.StringBuilder;
import hp6.h;
import java.util.Set;
import java.util.Collection;
import bp6.e2$e;
import java.util.Iterator;
import l85.b;
import java.util.Comparator;
import uo6.c;
import qo6.p;
import xp6.p;

public class e2	// class@000516
{
    public final HashMap a;
    public final Set b;
    public final e2$f c;
    public final List d;
    public final List e;
    public h f;
    public long g;
    public long h;
    public boolean i;
    public static final Comparator j;
    public static final Comparator k;
    public static final e2$e l;
    public static final Comparator m;

    static {
       e2.j = new e2$a();
       e2.k = new e2$b();
       e2.l = new e2$c();
       e2.m = new e2$d();
    }
    public void e2(){
       super();
       this.a = new HashMap(32);
       this.b = new HashSet(32);
       this.c = new e2$f();
       this.d = Collections.synchronizedList(new ArrayList());
       this.e = Collections.synchronizedList(new ArrayList());
       this.f = null;
       this.g = -1;
       this.h = -1;
       this.i = false;
    }
    public static String b(KwaiMsg p0){
       if (p0 != null) {
          return new StringBuilder(48)+p0.getSender()+p0.getClientSeq();
       }
       return "";
    }
    public static String c(KwaiMsg p0){
       if (p0 != null) {
          return new StringBuilder(48)+p0.getSender()+p0.getClientSeq()+p0.getSeq();
       }
       return "";
    }
    public void a(List p0){
       if (!p0.isEmpty()) {
          int i = 0;
          while (i < p0.size()) {
             if (!p0.get(i).isDraftOutboundStatus()) {
                this.d(p0.get(i), false, false);
             }
             i = i + 1;
          }
          this.g();
       }
       return;
    }
    public final void d(KwaiMsg p0,boolean p1,boolean p2){
       if (p0 != null) {
          if (p0.isInvisibleMsg()) {
             if (p0.getPlaceHolder() != null) {
                e2 tc = this.c;
                _monitor_enter(tc);
                this.c.a(p0.getPlaceHolder());
                _monitor_exit(tc);
                if (p2) {
                   p0 = this.a.get(e2.c(p0));
                   if (p0 != null) {
                      this.e(p0, false);
                   }
                }
             }
          }else {
             e2 ta = this.a;
             _monitor_enter(ta);
             this.a.put(e2.c(p0), p0.clone());
             this.b.add(e2.b(p0));
             _monitor_exit(ta);
             if (p1) {
                this.g();
             }
          }
       }
       return;
    }
    public final void e(KwaiMsg p0,boolean p1){
       if (p0 != null && !p0.isInvisibleMsg()) {
          ArrayList uArrayList = new ArrayList();
          e2 ta = this.a;
          _monitor_enter(ta);
          ArrayList uArrayList1 = new ArrayList(this.a.values());
          int i = 0;
          while (i < uArrayList1.size()) {
             KwaiMsg kwaiMsg = uArrayList1.get(i);
             if (e2.l.equals(p0, kwaiMsg)) {
                uArrayList.add(kwaiMsg);
             }
             i = i + 1;
          }
          if (!uArrayList.isEmpty()) {
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                this.a.remove(e2.c(iterator.next()));
             }
          }
          _monitor_exit(ta);
          e2 tc = this.c;
          _monitor_enter(tc);
          if (!uArrayList.isEmpty()) {
             Iterator iterator1 = uArrayList.iterator();
             while (iterator1.hasNext()) {
                KwaiMsg kwaiMsg1 = iterator1.next();
                this.c.a(new h(kwaiMsg1.getSeq(), kwaiMsg1.getSeq()));
             }
          }
          _monitor_exit(tc);
          if (p1) {
             this.g();
          }
       }
    label_0090 :
       return;
    }
    public void f(){
       this.f = null;
    }
    public final void g(){
       Object obj1;
       String str2;
       e2 uoe2 = this;
       b.b("KwaiMessageDataSourceManager", "updateNoHollowKwaiMessageList begin mNoHollowKwaiMsgList size = "+uoe2.e.size());
       e2 a = uoe2.a;
       _monitor_enter(a);
       if (!uoe2.a.isEmpty()) {
          ArrayList uArrayList = new ArrayList(uoe2.a.values());
          Collections.sort(uArrayList, e2.k);
          uoe2.d.clear();
          HashSet hashSet = new HashSet(uoe2.a.size());
          int i = 0;
          while (i < uArrayList.size()) {
             KwaiMsg kwaiMsg = uArrayList.get(i);
             if (kwaiMsg != null) {
                String str = kwaiMsg.getSender()+kwaiMsg.getClientSeq();
                if (!hashSet.contains(str)) {
                   uoe2.d.add(kwaiMsg);
                   hashSet.add(str);
                }
             }
             i = i + 1;
          }
          hashSet.clear();
          uoe2.e.clear();
          i = -1;
          long l = i;
          int i1 = 0;
          while (true) {
             if (i1 < uArrayList.size()) {
                Object obj = uArrayList.get(i1);
                if (obj != null) {
                   String str1 = obj.getSender()+obj.getClientSeq();
                   if (!obj.getSeq() && obj.isUnsentOutboundStatus()) {
                      if (!hashSet.contains(str1)) {
                         uoe2.e.add(obj);
                         hashSet.add(str1);
                      }
                   }else if(l - i){
                      long l1 = l - obj.getSeq();
                      long l2 = 1;
                      if (l1 - l2 > 0) {
                         c a1 = c.c().a;
                         int i2 = (a1 != null && a1.W != null)? 1: 0;
                         str2 = str1;
                         obj1 = obj;
                         if (uoe2.c.b(obj.getSeq(), l, i2)) {
                            if (!hashSet.contains(str2)) {
                               uoe2.e.add(obj1);
                               hashSet.add(str2);
                            }
                            l = obj1.getSeq();
                         }else {
                            uoe2.f = new h((obj1.getSeq() + l2), (l - l2));
                         label_0146 :
                            if (uoe2.e.size() > 0) {
                               Collections.sort(uoe2.e, e2.m);
                               p.a(uoe2.g, uoe2.e, uoe2.h, uoe2.i);
                               break ;
                            }
                         }
                      }
                   }
                   str2 = str1;
                   obj1 = obj;
                   if (!hashSet.contains(str2)) {
                      uoe2.e.add(obj1);
                      hashSet.add(str2);
                   }
                   l = obj1.getSeq();
                }
                i1 = i1 + 1;
                obj1 = -1;
             }else {
                goto label_0146 ;
             }
          }
       }else {
          uoe2.e.clear();
       }
       b.b("KwaiMessageDataSourceManager", "updateNoHollowKwaiMessageList finish mNoHollowKwaiMsgList size = "+uoe2.e.size());
       _monitor_exit(a);
       return;
    }
}
