package f11.h;
import lo1.c;
import android.view.View;
import t02.a0;
import wo1.a;
import n52.t;
import java.lang.Object;
import jo1.a;
import crd.a;
import f11.h$a;
import ekd.m1;
import android.view.ViewGroup;
import g11.e;
import com.kwai.framework.model.user.User;
import p91.m;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import df1.a;
import h11.b;
import g11.d;
import g11.a;
import ok.o;
import z1.a;
import bf1.j;
import df1.e;
import h11.e;
import g11.b;
import brd.t;
import ry1.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.x;
import f11.f;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import f11.e;
import f11.g;
import android.view.View$OnTouchListener;
import lo1.b;
import android.view.MotionEvent;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Runnable;
import e93.f;
import f11.i;
import ko1.b0;

public class h implements c	// class@002274
{
    public final a0 b;
    public final a c;
    public final a d;
    public final e e;
    public final ViewGroup f;
    public final a g;
    public LiveLikeNewStyleConfig h;
    public boolean i;
    public boolean j;
    public final Runnable k;

    public void h(View p0,a0 p1,a p2,t p3){
       super();
       a uoa = new a();
       this.d = uoa;
       a uoa1 = new a();
       this.g = uoa1;
       this.j = false;
       this.k = new h$a(this);
       this.b = p1;
       this.c = p2;
       this.f = m1.f(p0, 0x7f0a2006);
       uoa.e(m1.f(p0, R.id.live_like_new_style_container));
       e uoe = new e(p3);
       this.e = uoe;
       User user = p1.Z2.I();
       Objects.requireNonNull(uoe);
       if (PatchProxy.applyVoidOneRefs(user, uoe, e.class, "1")) {
       }else {
          uoe.f.a(a.class, new b(new d(uoe), new a(uoe), user));
          uoe.f.a(e.class, new e(new b(uoe), user));
       }
       if (!PatchProxy.applyVoid(null, this, h.class, "3")) {
          p1.b3.W().compose(p1.Z2.b().ge()).subscribe(new f(this), e.b);
          uoa1.c(p1.b3.T3().subscribe(new e(this), g.b));
       }
       return;
    }
    public void a(View$OnTouchListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       this.f.setOnTouchListener(p0);
       return;
    }
    public void b(boolean p0){
       b.a(this, p0);
    }
    public boolean c(MotionEvent p0,boolean p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, oh, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.j != null) {
          return false;
       }else if(!p1){
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, oh, "4")) {
             f.f(this.k);
             f.k("HighFluencyMessage.resetDoubleClickedCount", this.k, this, i.a);
             this.i = true;
             h te = this.e;
             Objects.requireNonNull(te);
             if (!PatchProxy.applyVoid(objArray, te, e.class, "2")) {
                te.b = te.b + true;
                te.b();
             }
          }
       }
       if (this.i == null || (!PatchProxy.applyVoidOneRefs(p0, this, oh, "5") && p0 != null)) {
          this.d.b(p0.getRawX(), p0.getRawY(), false);
       }
    label_0074 :
       h tc = this.c;
       if (tc != null) {
          tc.a();
       }
       return true;
    }
    public b0 d(){
       return null;
    }
}
