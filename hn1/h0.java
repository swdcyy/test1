package hn1.h0;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import hn1.h0$a;
import hn1.f0;
import androidx.recyclerview.widget.RecyclerView$r;
import in1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import qrd.l1;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import androidx.recyclerview.widget.s;

public final class h0	// class@002734
{
    public boolean a;
    public Integer b;
    public final h0$a c;
    public final f0 d;
    public final RecyclerView e;
    public final boolean f;
    public final boolean g;

    public void h0(RecyclerView p0,boolean p1,boolean p2){
       a.p(p0, "recyclerView");
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.b = Integer.valueOf(0);
       h0$a uoa = new h0$a(this);
       this.c = uoa;
       f0 uof0 = new f0();
       this.d = uof0;
       uof0.b(p0);
       p0.addOnScrollListener(uoa);
    }
    public final a a(Integer p0){
       a obj = PatchProxy.applyOneRefs(p0, this, h0.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 != null) {
          RecyclerView$ViewHolder viewHolder = this.e.findViewHolderForAdapterPosition(p0.intValue());
          if (viewHolder instanceof a) {
             RecyclerView$ViewHolder viewHolder1 = viewHolder;
          }
       }
       return obj;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, h0.class, "6")) {
          return;
       }
       a uoa = this.a(this.b);
       if (uoa != null) {
          uoa.startPlay();
          uoa.mute(this.g);
       }
       return;
    }
    public final void c(int p0){
       l1 a;
       h0 oh0 = h0.class;
       if (PatchProxy.isSupport(oh0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh0, "4")) {
          return;
       }
       oh0 = this.b;
       if (oh0 != null && p0 == oh0.intValue()) {
          this.b();
          return;
       }else {
          a uoa = this.a(this.b);
          if (uoa != null) {
             uoa.stopPlay();
          }
          if (this.a(Integer.valueOf(p0)) != null) {
             this.b = Integer.valueOf(p0);
             this.b();
          }else {
             this.a = true;
             a = l1.a;
          }
          oh0 = this.d;
          Objects.requireNonNull(oh0);
          f0 uof0 = f0.class;
          if (!PatchProxy.isSupport(uof0) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), oh0, uof0, "2")) {
             uof0 = oh0.g;
             if (uof0 != null) {
                RecyclerView$LayoutManager layoutManage = uof0.getLayoutManager();
                if (layoutManage != null) {
                   a.o(layoutManage, "recyclerView?.layoutManager ?: return");
                   View view = layoutManage.findViewByPosition(p0);
                   if (view != null) {
                      a.o(view, "it");
                      view = oh0.s(view, oh0.q(layoutManage));
                      f0 g = oh0.g;
                      if (g != null) {
                         g.smoothScrollBy(view, 0);
                      }
                   }
                }
             }
          }
          return;
       }
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, h0.class, "2")) {
          return;
       }
       a uoa = this.a(this.b);
       if (uoa != null) {
          uoa.stopPlay();
       }
       return;
    }
}
