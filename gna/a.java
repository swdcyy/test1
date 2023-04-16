package gna.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerLayout;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import gna.b$b;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import qrd.p;
import gna.b$a;
import java.util.Iterator;
import java.lang.Iterable;
import gna.b;
import qrd.l1;
import java.util.concurrent.ConcurrentHashMap;
import msd.l;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import gna.d;
import gna.d$b;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerAdapter$onBindViewHolder$1;
import gna.d$a;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerAdapter$onBindViewHolder$2;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerAdapter$onBindViewHolder$3;
import msd.p;
import java.lang.ref.WeakReference;
import java.util.Map;
import android.view.ViewGroup;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerViewHolderKt;

public final class a extends RecyclerView$Adapter	// class@002b26
{
    public final b$b e;
    public boolean f;
    public l g;
    public final ConcurrentHashMap h;
    public d$b i;

    public void a(GrowthCleanerLayout p0){
       a.p(p0, "layout");
       super();
       b$b uob = new b$b();
       Objects.requireNonNull(p0);
       Object obj = PatchProxy.apply(null, p0, GrowthCleanerLayout.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.b.getValue();
       }
       if (!PatchProxy.applyVoidOneRefs(obj, uob, b$a.class, "10")) {
          a.p(obj, "sons");
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             uob.u(iterator.next());
          }
       }
       this.e = uob;
       this.h = new ConcurrentHashMap();
       return;
    }
    public final b$b J0(){
       return this.e;
    }
    public final l K0(){
       return this.g;
    }
    public final boolean L0(){
       return this.f;
    }
    public final void M0(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (this.f == p0) {
          return;
       }
       this.f = p0;
       this.k0();
       return;
    }
    public int f0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       b uob = this.e.E(p0);
       uob = (uob != null)? uob.c(): -1;
       return uob;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.x();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "5")) {
          a.p(p0, "holder");
          b uob = this.e.E(p1);
          if (uob != null) {
             p0.g(uob);
             if (p0 instanceof d$b) {
                p0.p(new GrowthCleanerAdapter$onBindViewHolder$1(this));
             }else if(p0 instanceof d$a){
                p0.n = new GrowthCleanerAdapter$onBindViewHolder$2(p0, uob);
             }
             if (p0 instanceof d$a) {
                d$a uoa1 = p0;
                uoa1.m(new GrowthCleanerAdapter$onBindViewHolder$3(this));
                if (this.f != null) {
                   uoa1.n();
                }else {
                   uoa1.k();
                }
             }
             this.h.put(uob, new WeakReference(p0));
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       d uod;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          uod = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "3");
          if (uod != PatchProxyResult.class) {
          label_0022 :
             return uod;
          }
       }
       a.p(p0, "parent");
       uod = GrowthCleanerViewHolderKt.a(p0, p1);
       goto label_0022 ;
    }
}
