package bac.p;
import im8.g;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.List;
import io.reactivex.subjects.PublishSubject;
import f7c.c;
import a7c.h;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Collection;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import bac.p$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.framework.model.user.RecoUser;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import java.util.Set;
import ml8.c;
import java.lang.Integer;
import java.lang.Number;
import bac.s;
import java.util.Map;
import java.util.HashMap;
import androidx.recyclerview.widget.RecyclerView;
import bac.p$a;
import bac.o;
import ekd.q;

public abstract class p extends RecyclerView$Adapter implements g	// class@000419
{
    public final int e;
    public final Set f;
    public final List g;
    public BaseFragment h;
    public PublishSubject i;
    public c j;
    public PublishSubject k;
    public PublishSubject l;
    public ViewGroup m;
    public h n;

    public void p(int p0,BaseFragment p1,List p2,PublishSubject p3,c p4,PublishSubject p5,PublishSubject p6,h p7){
       super();
       this.f = new LinkedHashSet();
       ArrayList uArrayList = new ArrayList();
       this.g = uArrayList;
       this.e = p0;
       this.h = p1;
       uArrayList.addAll(p2);
       this.i = p3;
       this.j = p4;
       this.k = p5;
       this.l = p6;
       this.n = p7;
    }
    public void E0(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "9")) {
       }else {
          p0.itemView.setTag(R.id.item_view_bind_data, null);
          p0.itemView.setTag(R.id.item_view_position, null);
          p0.a.unbind();
       }
       return;
    }
    public boolean J0(RecoUser p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.g.contains(p0);
    }
    public void K0(){
       if (PatchProxy.applyVoid(null, this, p.class, "11")) {
          return;
       }
       Iterator iterator = this.f.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          if (uoc != null) {
             uoc.destroy();
          }
       }
       this.f.clear();
       return;
    }
    public ArrayList L0(int p0,p$b p1){
       return null;
    }
    public RecoUser M0(int p0){
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, op, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 >= 0 && p0 < this.g.size()) {
          return this.g.get(p0);
       }else {
          return null;
       }
    }
    public void N0(List p0,int p1){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, op, "3")) {
          return;
       }
       this.g.clear();
       this.g.addAll(p0);
       this.t0(p1);
       return;
    }
    public void O0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
          return;
       }
       this.g.clear();
       this.g.addAll(p0);
       this.r0(this.g.size(), p0.size());
       return;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, p.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.g.size();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new s();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, p.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(p.class, new s());
       }else {
          obj.put(p.class, null);
       }
       return obj;
    }
    public void u0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "7")) {
          return;
       }
       this.m = p0;
       return;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       p op = p.class;
       if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, op, "6")) {
          p0.itemView.setTag(R.id.item_view_bind_data, this.g.get(p1));
          p0.itemView.setTag(R.id.item_view_position, Integer.valueOf(p1));
          p$a uoa = new p$a();
          uoa.e = this.h;
          uoa.b = this.e;
          uoa.c = new o(p0);
          uoa.d = this.g.get(p1);
          uoa.f = this.j;
          uoa.g = this.i;
          uoa.h = this.k;
          uoa.j = this.n;
          uoa.i = this.l;
          ArrayList uArrayList = this.L0(p1, p0);
          if (q.f(uArrayList)) {
             Object[] objArray = new Object[]{uoa};
             p0.a.i(objArray);
          }else {
             uArrayList = uArrayList.clone();
             uArrayList.add(0, uoa);
             p0.a.i(uArrayList.toArray());
          }
       }
       return;
    }
    public void z0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "10")) {
          return;
       }
       this.K0();
       this.m = null;
       return;
    }
}
