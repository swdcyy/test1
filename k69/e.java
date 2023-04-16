package k69.e;
import java.lang.Object;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import k69.a;
import java.lang.Runnable;
import ekd.k1;
import java.util.List;
import android.os.Looper;
import java.lang.Thread;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import k69.d;
import k69.c;
import k69.e$a;
import java.util.Iterator;
import k69.b;

public class e	// class@002b45
{
    public final List a;
    public boolean b;
    public AtomicBoolean c;

    public void e(){
       super();
       this.a = new LinkedList();
       this.c = new AtomicBoolean(false);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       Log.b("Listeners", "clearListener\(\) called");
       if (this.c.get()) {
          k1.r(new a(this), 0);
          return;
       }else {
          this.a.clear();
          return;
       }
    }
    public void c(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       if (this.b != null && Looper.getMainLooper().getThread() != Thread.currentThread()) {
          throw new RuntimeException("must call this on ui thread");
       }
       String str = "Listeners";
       Log.b(str, "removeListener\(\) called with: listener = ["+p0+"]");
       if (p0 == null) {
          Log.g(str, "removeListener: listener is null");
          return;
       }else if(this.c.get()){
          k1.r(new d(this, p0), 0);
          return;
       }else if(!this.a.contains(p0)){
          Log.n(str, "removeListener: don\'t contain this listener="+p0);
          return;
       }else {
          this.a.remove(p0);
          return;
       }
    }
    public void d(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       if (this.b != null && Looper.getMainLooper().getThread() != Thread.currentThread()) {
          throw new RuntimeException("must call this on ui thread");
       }
       String str = "Listeners";
       Log.b(str, "addListener\(\) called with: listener = ["+p0+"]");
       if (p0 == null) {
          Log.n(str, "addListener: listener is null");
          return;
       }else if(this.c.get()){
          k1.r(new c(this, p0), 0);
          return;
       }else if(this.a.contains(p0)){
          Log.g(str, "addListener: already exist listener="+p0);
          return;
       }else {
          this.a.add(p0);
          return;
       }
    }
    public void y(e$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "5")) {
          return;
       }
       this.c.set(true);
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          p0.apply(iterator.next());
       }
       this.c.set(false);
       return;
    }
    public void z(e$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       if (this.b != null && Looper.getMainLooper().getThread() != Thread.currentThread()) {
          k1.o(new b(this, p0));
       }else {
          this.y(p0);
       }
       return;
    }
}
