package id.w$a;
import id.w;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArraySet;
import id.i;
import id.c0;
import android.util.Pair;
import java.util.List;
import id.d;
import java.io.Closeable;
import id.v;
import id.d0;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.util.Iterator;
import com.facebook.imagepipeline.common.Priority;
import id.w$a$a;
import id.e0;
import java.lang.String;
import java.util.Map;
import id.b;
import java.lang.Integer;
import com.facebook.common.util.TriState;
import java.lang.Boolean;
import ab.e;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest$RequestLevel;
import vc.h;
import id.b0;
import java.util.ArrayList;
import java.util.Collection;

public class w$a	// class@0021cf
{
    public final Object a;
    public final CopyOnWriteArraySet b;
    public Closeable c;
    public float d;
    public int e;
    public d f;
    public w$a$a g;
    public final w h;

    public void w$a(w p0,Object p1){
       this.h = p0;
       super();
       this.b = new CopyOnWriteArraySet();
       this.a = p1;
    }
    public boolean a(i p0,c0 p1){
       Pair pair = Pair.create(p0, p1);
       _monitor_enter(this);
       if (this.h.getExistingMultiplexer(this.a) != this) {
          _monitor_exit(this);
          return false;
       }else {
          this.b.add(pair);
          w$a tc = this.c;
          w$a td = this.d;
          w$a te = this.e;
          _monitor_exit(this);
          d.r(this.k());
          d.s(this.l());
          d.a(this.j());
          _monitor_enter(pair);
          _monitor_enter(this);
          if (tc != this.c) {
             tc = null;
          }else if(tc != null){
             tc = this.h.cloneOrNull(tc);
          }
          _monitor_exit(this);
          if (tc != null) {
             if (td > 0) {
                p0.a(td);
             }
             p0.d(tc, te);
             this.b(tc);
          }
          _monitor_exit(pair);
          p1.k(new v(this, pair));
          return true;
       }
    }
    public final void b(Closeable p0){
       if (p0 != null) {
          try{
             p0.close();
          }catch(java.io.IOException e2){
             throw new RuntimeException(e2);
          }
       }
       return;
    }
    public synchronized final boolean c(){
       Iterator iterator = this.b.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (iterator.next().second.i()) {
             break ;
          }
       }
       return true;
    }
    public synchronized final boolean d(){
       Iterator iterator = this.b.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          if (!iterator.next().second.p()) {
             break ;
          }
       }
       return false;
    }
    public synchronized final Priority e(){
       Priority lOW = Priority.LOW;
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          lOW = Priority.getHigherPriority(lOW, iterator.next().second.getPriority());
       }
       return lOW;
    }
    public void f(w$a$a p0,Throwable p1){
       _monitor_enter(this);
       if (this.g != p0) {
          _monitor_exit(this);
          return;
       }else {
          Iterator iterator = this.b.iterator();
          this.b.clear();
          this.h.removeMultiplexer(this.a, this);
          this.b(this.c);
          this.c = null;
          _monitor_exit(this);
          while (iterator.hasNext()) {
             Pair pair = iterator.next();
             _monitor_enter(pair);
             pair.second.l().onProducerFinishWithFailure(pair.second, this.h.mProducerName, p1, null);
             pair.first.onFailure(p1);
             _monitor_exit(pair);
          }
          return;
       }
    }
    public void g(w$a$a p0,Closeable p1,int p2){
       _monitor_enter(this);
       if (this.g != p0) {
          _monitor_exit(this);
          return;
       }else {
          this.b(this.c);
          this.c = null;
          Iterator iterator = this.b.iterator();
          int i = this.b.size();
          if (b.f(p2)) {
             this.c = this.h.cloneOrNull(p1);
             this.e = p2;
          }else {
             this.b.clear();
             this.h.removeMultiplexer(this.a, this);
          }
          _monitor_exit(this);
          while (iterator.hasNext()) {
             Pair pair = iterator.next();
             _monitor_enter(pair);
             if (b.e(p2)) {
                pair.second.l().onProducerFinishWithSuccess(pair.second, this.h.mProducerName, null);
                w$a tf = this.f;
                if (tf != null) {
                   pair.second.f(tf.getExtras());
                }
                pair.second.m(this.h.mDedupedRequestsCountKey, Integer.valueOf(i));
             }
             pair.first.d(p1, p2);
             _monitor_exit(pair);
          }
          return;
       }
    }
    public void h(w$a$a p0,float p1){
       _monitor_enter(this);
       if (this.g != p0) {
          _monitor_exit(this);
          return;
       }else {
          this.d = p1;
          Iterator iterator = this.b.iterator();
          _monitor_exit(this);
          while (iterator.hasNext()) {
             Pair pair = iterator.next();
             _monitor_enter(pair);
             pair.first.a(p1);
             _monitor_exit(pair);
          }
          return;
       }
    }
    public void i(TriState p0){
       _monitor_enter(this);
       boolean b = true;
       boolean b1 = (this.f == null)? true: false;
       e.a(Boolean.valueOf(b1));
       if (this.g != null) {
          b = false;
       }
       e.a(Boolean.valueOf(b));
       if (this.b.isEmpty()) {
          this.h.removeMultiplexer(this.a, this);
          _monitor_exit(this);
          return;
       }else {
          Pair second = this.b.iterator().next().second;
          d uod = new d(second.b(), second.getId(), second.l(), second.h(), second.q(), this.d(), this.c(), this.e(), second.c());
          this.f = v11;
          v11.f(second.getExtras());
          if (p0.isSet()) {
             this.f.m("started_as_prefetch", Boolean.valueOf(p0.asBoolean()));
          }
          w$a$a uoa$a = new w$a$a(this);
          this.g = uoa$a;
          _monitor_exit(this);
          this.h.mInputProducer.produceResults(uoa$a, this.f);
          return;
       }
    }
    public synchronized List j(){
       w$a tf = this.f;
       List list = null;
       if (tf == null) {
          return list;
       }
       boolean b = this.c();
       _monitor_enter(tf);
       if (b == tf.j) {
          _monitor_exit(tf);
       }else {
          tf.j = b;
          list = new ArrayList(tf.l);
          _monitor_exit(tf);
       }
       return list;
    }
    public synchronized List k(){
       w$a tf = this.f;
       List list = null;
       if (tf == null) {
          return list;
       }
       boolean b = this.d();
       _monitor_enter(tf);
       if (b == tf.h) {
          _monitor_exit(tf);
       }else {
          tf.h = b;
          list = new ArrayList(tf.l);
          _monitor_exit(tf);
       }
       return list;
    }
    public synchronized List l(){
       w$a tf = this.f;
       if (tf == null) {
          return null;
       }
       return tf.u(this.e());
    }
}
