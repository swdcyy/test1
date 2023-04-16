package l3.g;
import k3.l;
import java.lang.String;
import k3.h;
import l3.i;
import androidx.work.ExistingWorkPolicy;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Object;
import java.util.Collection;
import androidx.work.e;
import java.util.Set;
import java.util.HashSet;
import androidx.work.b$a;
import androidx.work.impl.workers.CombineContinuationsWorker;
import java.lang.Class;
import androidx.work.ArrayCreatingInputMerger;
import androidx.work.e$a;
import androidx.work.b;
import java.util.Collections;
import k3.i;
import v3.b;
import x3.a;
import java.lang.Runnable;
import java.lang.CharSequence;
import java.lang.Iterable;
import android.text.TextUtils;
import java.lang.Throwable;
import xk.d;
import v3.k;
import androidx.lifecycle.LiveData;

public class g extends l	// class@002504
{
    public final i a;
    public final String b;
    public final ExistingWorkPolicy c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public boolean h;
    public i i;
    public static final String j;

    static {
       g.j = h.f("WorkContinuationImpl");
    }
    public void g(i p0,String p1,ExistingWorkPolicy p2,List p3){
       super(p0, p1, p2, p3, null);
    }
    public void g(i p0,String p1,ExistingWorkPolicy p2,List p3,List p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.g = p4;
       this.e = new ArrayList(p3.size());
       this.f = new ArrayList();
       if (p4 != null) {
          Iterator iterator = p4.iterator();
          while (iterator.hasNext()) {
             this.f.addAll(iterator.next().f);
          }
       }
       for (int i = 0; i < p3.size(); i++) {
          p1 = p3.get(i).a();
          this.e.add(p1);
          this.f.add(p1);
       }
       return;
    }
    public void g(i p0,List p1){
       super(p0, null, ExistingWorkPolicy.KEEP, p1, null);
    }
    public static boolean m(g p0,Set p1){
       p1.addAll(p0.g());
       Set set = g.p(p0);
       Iterator iterator = p1.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (set.contains(iterator.next())) {
                return true;
             }
             continue ;
          }else {
             List list = p0.i();
             if (list != null && !list.isEmpty()) {
                Iterator iterator1 = list.iterator();
                while (iterator1.hasNext()) {
                   if (g.m(iterator1.next(), p1)) {
                      return true;
                   }else {
                      continue ;
                   }
                }
             }
             break ;
          }
       }
       p1.removeAll(p0.g());
       return false;
    }
    public static Set p(g p0){
       HashSet hashSet = new HashSet();
       List list = p0.i();
       if (list != null && !list.isEmpty()) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             hashSet.addAll(iterator.next().g());
          }
       }
       return hashSet;
    }
    public l a(List p0){
       b$a uoa = new b$a(CombineContinuationsWorker.class);
       uoa.i(ArrayCreatingInputMerger.class);
       b uob = uoa.b();
       ArrayList uArrayList = new ArrayList(p0.size());
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next());
       }
       g og = new g(this.a, null, ExistingWorkPolicy.KEEP, Collections.singletonList(uob), uArrayList);
       return iterator;
    }
    public i b(){
       if (this.h == null) {
          b uob = new b(this);
          this.a.J().d(uob);
          this.i = uob.d();
       }else {
          Object[] objArray = new Object[]{TextUtils.join(", ", this.e)};
          Throwable[] throwableArr = new Throwable[0];
          h.c().h(g.j, String.format("Already enqueued work ids \(%s\)", objArray), throwableArr);
       }
       return this.i;
    }
    public d c(){
       k ok = k.a(this.a, this.f);
       this.a.J().d(ok);
       return ok.f();
    }
    public LiveData d(){
       return this.a.I(this.f);
    }
    public l e(List p0){
       if (p0.isEmpty()) {
          return this;
       }
       g og = new g(this.a, this.b, ExistingWorkPolicy.KEEP, p0, Collections.singletonList(this));
       return v0;
    }
    public ExistingWorkPolicy f(){
       return this.c;
    }
    public List g(){
       return this.e;
    }
    public String h(){
       return this.b;
    }
    public List i(){
       return this.g;
    }
    public List j(){
       return this.d;
    }
    public i k(){
       return this.a;
    }
    public boolean l(){
       return g.m(this, new HashSet());
    }
    public boolean n(){
       return this.h;
    }
    public void o(){
       this.h = true;
    }
}
