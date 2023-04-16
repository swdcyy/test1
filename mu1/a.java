package mu1.a;
import com.kuaishou.live.viewcontroller.ViewController;
import du1.d;
import hu1.c;
import mu1.i;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kuaishou.live.common.core.basic.widget.LiveWishListItemView;
import android.widget.TextView;
import mu1.j;
import com.kwai.robust.PatchProxyResult;
import pq1.g;
import jl5.c;
import mu1.a$a;
import mu1.l;
import mu1.g;
import mu1.k;
import androidx.lifecycle.ViewModel;
import mu1.b;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import mu1.c;
import mu1.e;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import xh3.l;

public class a extends ViewController	// class@003218
{
    public final d j;
    public final i k;
    public LiveWishListItemView l;
    public TextView m;
    public l n;
    public k o;
    public final c p;
    public final String q;
    public final String r;
    public final boolean s;

    public void a(d p0,c p1,i p2,String p3,String p4,boolean p5){
       super();
       this.j = p0;
       this.p = p1;
       this.k = p2;
       this.r = p3;
       this.q = p4;
       this.s = p5;
    }
    public void F2(){
       LiveWishListItemView liveWishList = this;
       a uoa = a.class;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, liveWishList, uoa, str)) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, liveWishList, uoa, "2")) {
          liveWishList.Q2(R.layout.arg_RES_7f0d0ccf);
          liveWishList.l = liveWishList.A2(0x7f0a45af);
          liveWishList.m = liveWishList.A2(0x7f0a2866);
       }
       a l = liveWishList.l;
       g og = PatchProxy.apply(objArray, objArray, j.class, str);
       if (og != PatchProxyResult.class) {
       }else {
          g og1 = new g(2, c.c(0x7f070295), c.d(12.00f), c.d(11.00f), c.c(0x7f0702b8), c.c(0x7f0702e3), c.c(0x7f0702e3), c.c(0x7f070334), c.c(0x7f070267), 0, 0);
       }
       l.setWishListParam(og);
       l ol = new l(liveWishList.q, liveWishList.k, new a$a(liveWishList));
       liveWishList.n = ol;
       liveWishList.o = ol.create(k.class);
       if (!PatchProxy.applyVoid(objArray, liveWishList, uoa, "3")) {
          liveWishList.l.setOnClickListener(new b(liveWishList));
          liveWishList.m.setOnClickListener(new c(liveWishList));
          liveWishList.o.a.observe(liveWishList, new e(liveWishList));
          l.d(liveWishList.m, liveWishList, liveWishList.o.e, true);
          l.d(liveWishList.l, liveWishList, liveWishList.o.f, true);
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.k.a();
       return;
    }
}
