package g41.c$b;
import s99.i;
import g41.c;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import w99.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.HashMap;
import u99.d;
import ba9.a;
import v99.a;
import g41.e;
import xl8.b;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.autoplay.widget.FrameAutoPlayCard;
import android.view.View;
import t99.w;
import android.view.ViewGroup;
import s99.h;

public class c$b implements i	// class@00241b
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public boolean C(RecyclerView p0,int p1){
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob)) {
          p0 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "3");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       c$b tb = this.b;
       d.h(tb.a, "acceptPlayFocus", d.c(tb.b.mEntity, tb.e, tb.c, "direction=${direction}", tb.d(p1).toString()));
       if (this.b.d(p1).booleanValue() && !this.b.b.isCloseLive()) {
          tb = this.b;
          if (tb.d.e(tb.o, "focus_dispatch")) {
             tb = this.b;
             tb.d.u("focus_dispatch", tb.o);
             if (this.b.i.a()) {
                tb = this.b;
                tb.d.h(tb.o);
             }else {
                this.b.i.c();
             }
             return true;
          }
       }
       this.b.f();
       return false;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "1")) {
          return;
       }
       d.d(this.b.a, "onAttached");
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "2")) {
          return;
       }
       c h = this.b.h;
       if (h != null && (h.a() != null && (this.b.h.a().booleanValue() && !this.b.c.isResumed()))) {
          d.g(this.b.a, "onDetached", "isResume", "view is not visible");
          return;
       }else {
          this.b.g("detach");
          this.b.i.b();
          return;
       }
    }
    public void c(int p0,int p1,int p2,int p3,int p4,int p5){
       if (PatchProxy.isSupport(c$b.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, c$b.class, "4")) {
             return;
          }
       }
       c$b tb = this.b;
       w.d(tb.o, tb.o, tb.b.getEntity());
       tb = this.b;
       if (tb.d.g(tb.o) && !this.b.d(p2).booleanValue()) {
          this.b.g("scrolled");
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "5")) {
          return;
       }
       this.b.g("dispatch_interrupted");
       return;
    }
    public boolean i(ViewGroup p0,int p1){
       return h.a(this, p0, p1);
    }
    public void n(){
       h.f(this);
    }
    public void onScrollStateChanged(int p0){
       h.g(this, p0);
    }
}
