package fd3.n;
import com.kuaishou.live.lite.sidebar.e;
import java.lang.Object;
import vd3.c;
import java.util.PriorityQueue;
import androidx.lifecycle.MutableLiveData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o56.a;
import w51.a;
import com.kuaishou.live.lite.sidebar.e$a;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import z1.a;
import java.util.Iterator;
import java.util.Collection;
import fd3.n$a;
import fd3.k;
import androidx.lifecycle.LiveData;

public abstract class n implements e	// class@002870
{
    public final c b;
    public final PriorityQueue c;
    public final MutableLiveData d;
    public final MutableLiveData e;

    public void n(){
       boolean b;
       super();
       this.b = new c();
       this.c = new PriorityQueue();
       Object obj = PatchProxy.apply(null, this, n.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(a.d() && a.b()){
          b = true;
       }else {
          b = false;
       }
       this.d = new MutableLiveData(Boolean.valueOf(b));
       this.e = new MutableLiveData(Boolean.FALSE);
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, n.class, "6")) {
          return;
       }
       this.e.setValue(Boolean.TRUE);
       return;
    }
    public void b(e$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "3")) {
          return;
       }
       a.p(p0, "sideBarItem");
       b.c0(LiveLiteLogTag.SIDE_BAR, "LiveLiteSideBarPresenter.addSideBarItem", "item", Integer.valueOf(p0.j()));
       this.b.a(p0);
       return;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "12")) {
          return;
       }
       a.p(p0, "listener");
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          if (a.g(iterator.next().a(), p0)) {
             iterator.remove();
          }
       }
       return;
    }
    public void d(e$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "4")) {
          return;
       }
       a.p(p0, "sideBarItem");
       b.c0(LiveLiteLogTag.SIDE_BAR, "LiveLiteSideBarPresenter.removeSideBarItem", "item", Integer.valueOf(p0.j()));
       this.b.d(p0);
       return;
    }
    public void e(a p0){
       k.a(this, p0);
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, n.class, "5")) {
          return;
       }
       this.e.setValue(Boolean.FALSE);
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, n.class, "9")) {
          return;
       }
       this.d.setValue(Boolean.TRUE);
       return;
    }
    public boolean j(){
       Object obj = PatchProxy.apply(null, this, n.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.g(this.e.getValue(), Boolean.TRUE);
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, n.class, "10")) {
          return;
       }
       this.d.setValue(Boolean.FALSE);
       return;
    }
    public void l(a p0,int p1){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, on, "11")) {
          return;
       }
       a.p(p0, "listener");
       this.c.offer(new n$a(p0, p1));
       return;
    }
    public final void m(boolean p0){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, on, "2")) {
          return;
       }
       PriorityQueue priorityQueu = new PriorityQueue(this.c);
       while (!priorityQueu.isEmpty()) {
          n$a uoa = priorityQueu.poll();
          a uoa1 = (uoa != null)? uoa.a(): null;
          if (uoa1 != null) {
             uoa1.accept(Boolean.valueOf(p0));
          }
       }
       return;
    }
}
