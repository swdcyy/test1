package cdd.e;
import ddd.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.plugin.search.SearchPage;
import com.yxcorp.plugin.search.result.a;
import h8d.a;
import android.util.SparseArray;
import x7d.a;
import ddd.e;
import ibd.d;
import vdd.a;
import x9d.f;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import uy5.a;
import java.lang.StringBuilder;
import q87.c;
import nfd.r3;
import java.lang.Boolean;
import y8c.g;
import y8c.f$b;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;

public class e extends a	// class@00052f
{
    public SparseArray b;
    public BaseFragment c;

    public void e(BaseFragment p0,SearchPage p1,a p2,a p3){
       super();
       this.b = new SparseArray();
       this.c = p0;
       if (p1 != SearchPage.HASH_TAG_DETAIL) {
          this.f(new a(p1));
          this.f(new d(p0, p1, p2, p3));
       }else {
          this.f(new a(p1));
       }
       this.f(new f(p1, p2, p3));
       return;
    }
    public f a(ViewGroup p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoe, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uoe = this.b.get(p1);
       if (uoe != null) {
          Object[] objArray = new Object[0];
          a.C().t("SearchAllCardFactory", "createPresenter for viewType:"+p1+"  factory:"+uoe.getClass().getSimpleName(), objArray);
          return uoe.a(p0, p1);
       }else {
          return r3.g(p0);
       }
    }
    public boolean d(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (this.b.indexOfKey(p0) >= 0)? true: false;
       return b;
    }
    public f$b e(g p0,int p1,f$b p2){
       e obj;
       if (PatchProxy.isSupport(e.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, e.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p2.a() == null) {
          p2.f = this.c;
       }
       obj = this.b.get(p1);
       if (obj != null) {
          return obj.e(p0, p1, p2);
       }else {
          return null;
       }
    }
    public final void f(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       Collection uCollection = p0.b();
       if (q.f(uCollection)) {
          return;
       }
       Iterator iterator = uCollection.iterator();
       while (iterator.hasNext()) {
          this.b.append(iterator.next().intValue(), p0);
       }
       return;
    }
}
