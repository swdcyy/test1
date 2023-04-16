package gn2.l;
import u61.b;
import com.kuaishou.live.bottombar.component.widget.d;
import lnc.a1;
import jn2.d;
import gn2.j;
import jn2.d$d;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gn2.k;
import msd.a;
import k51.b;
import mn2.c;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.core.show.wishlight.spring.view.LiveBottomBarWishLightGiftView;
import z61.b;
import gn2.i;
import java.util.Objects;
import java.util.List;
import com.kuaishou.android.live.log.b;
import ht5.a;
import lp3.c;
import lp3.e;
import lk1.a;
import eg1.e;
import dg1.a;
import lk1.a$a;
import com.kuaishou.live.core.basic.model.LiveWishLightGiftGuideConfig;
import in2.a;
import androidx.lifecycle.MutableLiveData;
import gn2.l$b;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import gn2.l$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModel;

public class l extends d implements b	// class@002b5a
{
    public final d k;
    public c l;
    public LiveBottomBarWishLightGiftView m;
    public SubLifecycleController n;
    public static final int o;

    static {
       l.o = a1.d(0x7f070a3a);
    }
    public void l(){
       super();
       this.k = new d(new j(this));
    }
    public View C(Context p0,ViewGroup p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.b("LiveBottomBarWishLightGiftViewItem::createView", new k(this, p0, p1));
    }
    public void D(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "3")) {
          return;
       }
       this.m.b(this.l, this.n);
       return;
    }
    public void F(b p0){
       d e;
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "4")) {
          return;
       }
       if (!p0 instanceof i) {
          return;
       }
       l tk = this.k;
       i c = p0.c;
       Objects.requireNonNull(tk);
       if (!PatchProxy.applyVoidOneRefs(c, tk, d.class, "6")) {
          if (c == null) {
             b.P(d.q, "liveServiceManager is null");
          }else {
             tk.h = c;
             if (tk.d == null) {
                tk.d = c.a(a.class);
             }
             if (tk.e == null) {
                tk.e = c.a(a.class);
             }
             if (tk.f == null) {
                tk.f = c.a(e.class);
             }
             if (tk.g == null) {
                tk.g = c.a(a.class);
             }
             if (!PatchProxy.applyVoid(null, tk, d.class, "7") && tk.o == null) {
                e = tk.e;
                if (e != null) {
                   e.Gc(tk.p);
                   tk.o = true;
                }
             }
          }
       }
       this.k.e(p0.b);
       this.k.f(p0.d);
       return;
    }
    public int t(){
       return l.o;
    }
    public void y(LifecycleOwner p0,MutableLiveData p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "1")) {
          return;
       }
       super.y(p0, p1);
       if (this.l == null) {
          l$b uob = new l$b(this.j);
          this.n = uob;
          this.l = new ViewModelProvider(uob.getViewModelStore(), new l$a(this)).get(c.class);
          this.n.e();
       }
       return;
    }
}
