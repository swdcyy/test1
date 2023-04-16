package bp6.e2$f;
import java.lang.Object;
import java.util.ArrayList;
import hp6.h;
import java.util.List;
import bp6.e2;
import java.util.Comparator;
import java.util.Collections;
import java.lang.Math;
import java.lang.StringBuilder;
import java.lang.String;
import l85.b;
import java.util.Objects;

public class e2$f	// class@000515
{
    public List a;

    public void e2$f(){
       super();
       this.a = new ArrayList();
    }
    public void a(h p0){
       if (p0 != null && p0.d()) {
          if (this.a.isEmpty()) {
             this.a.add(p0);
          }else {
             this.a.add(p0);
             Collections.sort(this.a, e2.j);
             ArrayList uArrayList = new ArrayList();
             int i = 0;
             long l = this.a.get(i).b();
             long l1 = this.a.get(i).a();
             while (i < this.a.size()) {
                if (this.a.get(i).a() - l >= 0) {
                   l = Math.min(l, this.a.get(i).b());
                }else {
                   uArrayList.add(new h(l, l1));
                   l = this.a.get(i).b();
                   l1 = this.a.get(i).a();
                }
                i = i + 1;
             }
             uArrayList.add(new h(l, l1));
             this.a = uArrayList;
          }
       }
       return;
    }
    public boolean b(long p0,long p1,boolean p2){
       long l;
       e2$f uof1;
       int i1;
       e2$f uof = this;
       int b = p2;
       String str = "KwaiMessageDataSourceManager";
       b.i(str, "isConsecutiveSeq enableNewMsgCacheSeqConsecutive: "+b);
       h oh = null;
       boolean b1 = true;
       boolean b2 = false;
       if (!b) {
          e2$f a = uof.a;
          if (a != null && !a.isEmpty()) {
             b = 0;
             while (true) {
                if (b < uof.a.size()) {
                   h oh1 = uof.a.get(b);
                   l = oh1.b();
                   long l1 = oh1.a();
                   if (l - oh > 0) {
                      l = l - 1;
                      if (p0 - l >= 0) {
                         l1 = l1 + 1;
                         if (p0 - l1 <= 0) {
                         label_005d :
                            uof1 = 1;
                         label_0060 :
                            if (uof1) {
                               break ;
                            }else {
                               b = b + 1;
                            }
                         }
                      }
                   }else if(p0 - l >= 0){
                      l1 = l1 + 1;
                      if (p0 - l1 <= 0) {
                         goto label_005d ;
                      }
                   }
                   uof1 = null;
                   goto label_0060 ;
                }
             }
             return b1;
          }
       label_0066 :
          b1 = false;
          goto label_0067 ;
       }else {
          h oh2 = null;
          if (!uof.a.isEmpty()) {
             b = oh2;
             int i = 0;
             l = p1;
             while (i < uof.a.size()) {
                h oh3 = uof.a.get(i);
                Objects.requireNonNull(oh3);
                if (l - oh > 0) {
                   long l2 = l - 1;
                   if (oh3.c - l2 >= 0 && oh3.b - l < 0) {
                      i1 = 1;
                   label_009e :
                      if (i1) {
                         l = oh3.b();
                         h oh4 = oh3;
                      }
                      i = i + 1;
                   }
                }
                i1 = 0;
                goto label_009e ;
             }
             oh2 = b;
          }
          b.i(str, "getLastConsecutivePlaceHolder resultPlaceHolder = "+oh2);
          if (oh2 == null) {
             return b2;
          }else if(p0 - oh <= 0){
             if (p0 - (oh2.b - 1) < 0) {
                b1 = 0;
             }
             b2 = b1;
          }
          return b2;
       }
    }
}
