package androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.q$b;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.ConcatAdapter$Config;
import java.lang.Object;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import androidx.recyclerview.widget.e$a;
import androidx.recyclerview.widget.c0$a;
import androidx.recyclerview.widget.c0$b;
import androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode;
import androidx.recyclerview.widget.a0$b;
import androidx.recyclerview.widget.a0$a;
import androidx.recyclerview.widget.a0$c;
import java.lang.IllegalArgumentException;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.q;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.util.List;
import z1.h;
import androidx.recyclerview.widget.a0$d;
import androidx.recyclerview.widget.a0;
import androidx.recyclerview.widget.c0;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.IndexOutOfBoundsException;
import androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy;
import android.view.ViewGroup;

public class e implements q$b	// class@0008fb
{
    public final ConcatAdapter a;
    public final c0 b;
    public List c;
    public final IdentityHashMap d;
    public List e;
    public e$a f;
    public final ConcatAdapter$Config$StableIdMode g;
    public final a0 h;

    public void e(ConcatAdapter p0,ConcatAdapter$Config p1){
       super();
       this.c = new ArrayList();
       this.d = new IdentityHashMap();
       this.e = new ArrayList();
       this.f = new e$a();
       this.a = p0;
       this.b = (p1.a != null)? new c0$a(): new c0$b();
       ConcatAdapter$Config b = p1.b;
       this.g = b;
       if (b == ConcatAdapter$Config$StableIdMode.NO_STABLE_IDS) {
          this.h = new a0$b();
       }else if(b == ConcatAdapter$Config$StableIdMode.ISOLATED_STABLE_IDS){
          this.h = new a0$a();
       }else if(b == ConcatAdapter$Config$StableIdMode.SHARED_STABLE_IDS){
          this.h = new a0$c();
       }else {
          throw new IllegalArgumentException("unknown stable id mode");
       }
       return;
    }
    public boolean A(RecyclerView$ViewHolder p0){
       q oq = this.d.remove(p0);
       if (oq != null) {
          return oq.c.A0(p0);
       }
       throw new IllegalStateException("Cannot find wrapper for "+p0+", seems like it is not bound by this adapter: "+this);
    }
    public void B(RecyclerView$ViewHolder p0){
       this.s(p0).c.B0(p0);
    }
    public void C(RecyclerView$ViewHolder p0){
       this.s(p0).c.D0(p0);
    }
    public void D(RecyclerView$ViewHolder p0){
       q oq = this.d.remove(p0);
       if (oq == null) {
          throw new IllegalStateException("Cannot find wrapper for "+p0+", seems like it is not bound by this adapter: "+this);
       }
       oq.c.E0(p0);
       return;
    }
    public final void E(e$a p0){
       p0.c = false;
       p0.a = null;
       p0.b = -1;
       this.f = p0;
    }
    public void a(q p0,int p1,int p2){
       int i = this.l(p0);
       this.a.o0((p1 + i), (p2 + i));
    }
    public void b(q p0){
       this.j();
    }
    public void c(q p0,int p1,int p2,Object p3){
       this.a.q0((p1 + this.l(p0)), p2, p3);
    }
    public void d(q p0,int p1,int p2){
       this.a.p0((p1 + this.l(p0)), p2);
    }
    public void e(q p0,int p1,int p2){
       this.a.s0((p1 + this.l(p0)), p2);
    }
    public void f(q p0,int p1,int p2){
       this.a.r0((p1 + this.l(p0)), p2);
    }
    public void g(q p0){
       this.a.k0();
       this.j();
    }
    public boolean h(int p0,RecyclerView$Adapter p1){
       if (p0 < 0 || p0 > this.e.size()) {
          throw new IndexOutOfBoundsException("Index must be between 0 and "+this.e.size()+". Given:"+p0);
       }
       if (this.t()) {
          h.b(p1.j0(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
       }else {
          p1.j0();
       }
       if (this.n(p1) != null) {
          return false;
       }else {
          q oq = new q(p1, this, this.b, this.h.a());
          this.e.add(p0, oq);
          Iterator iterator = this.c.iterator();
          while (iterator.hasNext()) {
             RecyclerView recyclerView = iterator.next().get();
             if (recyclerView != null) {
                p1.u0(recyclerView);
             }
          }
          if (oq.a() > 0) {
             this.a.r0(this.l(oq), oq.a());
          }
          this.j();
          return true;
       }
    }
    public boolean i(RecyclerView$Adapter p0){
       return this.h(this.e.size(), p0);
    }
    public final void j(){
       RecyclerView$Adapter$StateRestorationPolicy uAdapter$Sta = this.k();
       if (uAdapter$Sta != this.a.g0()) {
          this.a.K0(uAdapter$Sta);
       }
       return;
    }
    public final RecyclerView$Adapter$StateRestorationPolicy k(){
       RecyclerView$Adapter$StateRestorationPolicy pREVENT;
       Iterator iterator = this.e.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return RecyclerView$Adapter$StateRestorationPolicy.ALLOW;
          }
          q oq = iterator.next();
          RecyclerView$Adapter$StateRestorationPolicy uAdapter$Sta = oq.c.g0();
          pREVENT = RecyclerView$Adapter$StateRestorationPolicy.PREVENT;
          if (uAdapter$Sta == pREVENT) {
             break ;
          }else if(uAdapter$Sta == RecyclerView$Adapter$StateRestorationPolicy.PREVENT_WHEN_EMPTY && !oq.a()){
             return pREVENT;
          }
       }
       return pREVENT;
    }
    public final int l(q p0){
       Iterator iterator = this.e.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          q oq = iterator.next();
          if (oq != p0) {
             i = i + oq.a();
          }else {
             break ;
          }
       }
       return i;
    }
    public final e$a m(int p0){
       e tf = this.f;
       tf = (tf.c != null)? new e$a(): true;
       Iterator iterator = this.e.iterator();
       int i = p0;
       while (iterator.hasNext()) {
          q oq = iterator.next();
          if (oq.a() > i) {
             tf.a = oq;
             tf.b = i;
             break ;
          }
          i = i - oq.a();
       }
       if (tf.a != null) {
          return tf;
       }else {
          throw new IllegalArgumentException("Cannot find wrapper for "+p0);
       }
    }
    public final q n(RecyclerView$Adapter p0){
       int i = this.u(p0);
       if (i == -1) {
          return null;
       }
       return this.e.get(i);
    }
    public long o(int p0){
       e$a uoa = this.m(p0);
       this.E(uoa);
       return uoa.a.b(uoa.b);
    }
    public int p(int p0){
       e$a uoa = this.m(p0);
       this.E(uoa);
       return uoa.a.c(uoa.b);
    }
    public int q(RecyclerView$Adapter p0,RecyclerView$ViewHolder p1,int p2){
       q oq = this.d.get(p1);
       if (oq == null) {
          return -1;
       }
       p2 = p2 - this.l(oq);
       int itemCount = oq.c.getItemCount();
       if (p2 >= 0 && p2 < itemCount) {
          return oq.c.c0(p0, p1, p2);
       }
       throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to "+p2+" which is out of bounds for the adapter with size "+itemCount+".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:"+p1+"adapter:"+p0);
    }
    public int r(){
       Iterator iterator = this.e.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          i = i + iterator.next().a();
       }
       return i;
    }
    public final q s(RecyclerView$ViewHolder p0){
       q oq = this.d.get(p0);
       if (oq != null) {
          return oq;
       }
       throw new IllegalStateException("Cannot find wrapper for "+p0+", seems like it is not bound by this adapter: "+this);
    }
    public boolean t(){
       boolean b = (this.g != ConcatAdapter$Config$StableIdMode.NO_STABLE_IDS)? true: false;
       return b;
    }
    public final int u(RecyclerView$Adapter p0){
       int i = this.e.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return -1;
          }
          if (this.e.get(i1).c == p0) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return i1;
    }
    public final boolean v(RecyclerView p0){
       Iterator iterator = this.c.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (iterator.next().get() == p0) {
             break ;
          }
       }
       return true;
    }
    public void w(RecyclerView p0){
       if (this.v(p0)) {
          return;
       }
       this.c.add(new WeakReference(p0));
       Iterator iterator = this.e.iterator();
       while (iterator.hasNext()) {
          iterator.next().c.u0(p0);
       }
       return;
    }
    public void x(RecyclerView$ViewHolder p0,int p1){
       e$a uoa = this.m(p1);
       this.d.put(p0, uoa.a);
       uoa.a.d(p0, uoa.b);
       this.E(uoa);
    }
    public RecyclerView$ViewHolder y(ViewGroup p0,int p1){
       return this.b.a(p1).e(p0, p1);
    }
    public void z(RecyclerView p0){
       int i = this.c.size() - 1;
       while (true) {
          if (i >= 0) {
             WeakReference weakReferenc = this.c.get(i);
             if (weakReferenc.get() == null) {
                this.c.remove(i);
             }else if(weakReferenc.get() == p0){
                this.c.remove(i);
             label_002d :
                Iterator iterator = this.e.iterator();
                while (iterator.hasNext()) {
                   iterator.next().c.z0(p0);
                }
                return;
             }
             i = i - 1;
          }else {
             goto label_002d ;
          }
       }
    }
}
