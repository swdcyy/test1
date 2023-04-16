package m3a.t$b;
import qvb.q;
import m3a.t;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import qvb.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.jvm.internal.a;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;

public final class t$b implements q	// class@002f22
{
    public final t b;

    public void t$b(t p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       t$b uob = t$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       p.b(this, p0, p1);
       QPhoto qPhoto = this.b.a();
       this.b.b.clear();
       List items = this.b.e.getItems();
       int i = 0;
       if (items != null) {
          t b = this.b.b;
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = items.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             Object obj1 = obj;
             if (!a.g(obj1, this.b.f)) {
                a.o(obj1, "it");
                if (!obj1.isVideoType() || (obj1.isAd() || (obj1.isLiveStream() || this.b.c(obj1)))) {
                   obj1 = null;
                label_007b :
                   if (obj1) {
                      uArrayList.add(obj);
                   }
                }
             }
             obj1 = 1;
             goto label_007b ;
          }
          b.addAll(uArrayList);
       }
       t$b tb = this.b;
       tb.a = CollectionsKt___CollectionsKt.M2(tb.b, qPhoto);
       tb = this.b;
       if (tb.a == -1) {
          if (qPhoto != null) {
             tb.b.add(i, qPhoto);
          }
          qPhoto.a = i;
       }
       Object[] objArray = new Object[i];
       o.C().w("SmallWindowPlayController", "update photo list, index "+this.b.a, objArray);
       return;
    }
}
