package dcc.a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import o07.o;
import java.lang.Integer;
import java.util.Iterator;
import java.lang.Iterable;
import dcc.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import msd.l;

public final class a extends RecyclerView$Adapter implements PopupInterface$h	// class@002168
{
    public c e;
    public final List f;
    public final List g;
    public final Runnable h;

    public void a(List p0,Runnable p1){
       a.p(p0, "items");
       super();
       this.g = p0;
       this.h = p1;
       this.f = new ArrayList();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       a.p(p0, "popup");
       o.e(this, p0);
       this.e = p0;
       return;
    }
    public void H(c p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "5")) {
          return;
       }
       a.p(p0, "popup");
       o.b(this, p0, p1);
       a th = this.h;
       if (th != null) {
          th.run();
       }
       Iterator iterator = this.f.iterator();
       while (iterator.hasNext()) {
          iterator.next().c();
       }
       this.f.clear();
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public int f0(int p0){
       return p0;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.g.size();
    }
    public void p(c p0){
       o.d(this, p0);
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, a.class, "3")) {
          a.p(p0, "holder");
          p0.c();
          p0.a();
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       c uoc;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          uoc = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2");
          if (uoc != PatchProxyResult.class) {
          label_004f :
             return uoc;
          }
       }
       a.p(p0, "parent");
       View view = a.k(p0, R.layout.arg_RES_7f0d0147, false);
       a.o(view, "view");
       c uoc1 = this.g.get(p1).invoke(view);
       uoc = uoc1;
       uoc.e = this.e;
       uoc.setIsRecyclable(false);
       this.f.add(uoc);
       goto label_004f ;
    }
}
