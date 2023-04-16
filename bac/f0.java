package bac.f0;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.List;
import fac.c;
import io.reactivex.subjects.PublishSubject;
import fac.b;
import java.util.ArrayList;
import g9c.a;
import java.util.Collection;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.RecoUser;
import qvb.i;
import ekd.j;
import im8.c;
import y8c.f$b;
import bac.f0$a;
import android.view.ViewGroup;
import com.yxcorp.gifshow.relation.explore.presenter.w;
import hac.l1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.relation.explore.presenter.y;
import android.view.View;
import i2b.a;
import ml8.c;
import z99.a;
import java.util.Iterator;
import androidx.recyclerview.widget.RecyclerView;

public class f0 extends g	// class@000401
{
    public PublishSubject A;
    public PublishSubject B;
    public final BaseFragment w;
    public final c x;
    public final b y;
    public ArrayList z;

    public void f0(BaseFragment p0,List p1,c p2,PublishSubject p3,PublishSubject p4,b p5){
       super();
       this.p1(true);
       ArrayList uArrayList = new ArrayList();
       this.e = uArrayList;
       uArrayList.addAll(this.r1(p1));
       this.w = p0;
       this.x = p2;
       this.A = p3;
       this.B = p4;
       this.y = p5;
    }
    public void B0(RecyclerView$ViewHolder p0){
       this.k1(p0);
    }
    public void D0(RecyclerView$ViewHolder p0){
       this.l1(p0);
    }
    public a S0(int p0){
       f0 uof0 = f0.class;
       if (PatchProxy.isSupport(uof0)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof0, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.n.remove(this.N0(p0));
       return super.S0(p0);
    }
    public void W0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0.class, "2")) {
          return;
       }
       this.e.clear();
       this.e.addAll(this.r1(p0));
       return;
    }
    public ArrayList a1(int p0,f p1){
       Object[] obj;
       f0 uof0 = f0.class;
       if (PatchProxy.isSupport(uof0)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uof0, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.z == null) {
          obj = new Object[]{this};
          ArrayList uArrayList = j.a(obj);
          this.z = uArrayList;
          uArrayList.add(new c("PYMK_ACCESS_IDSbigcard_btn", this.A));
          this.z.add(new c("PYMK_ACCESS_IDScard_play", this.B));
       }
       return this.z;
    }
    public f$b d1(f$b p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f0 uof0 = f0.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uof0, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = this.N0(p0.b);
       f0$a uoa = PatchProxy.applyTwoRefs(p0, obj1, this, uof0, "10");
       if (uoa != patchProxyRe) {
       }else {
          p0.f = this.w;
          f0$a uoa1 = new f0$a(this, p0, obj1, this.x, this.y);
       }
       return uoa;
    }
    public f h1(ViewGroup p0,int p1){
       w obj;
       f0 uof0 = f0.class;
       if (PatchProxy.isSupport(uof0)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uof0, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new w();
       obj.U7(new l1());
       obj.U7(new y());
       return new f(a.i(p0, 0x7f0d129d), obj);
    }
    public void j1(boolean p0,boolean p1,List p2){
    }
    public void k1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0.class, "5")) {
          return;
       }
       a.a(p0.itemView, R.id.play_view_container);
       super.k1(p0);
       return;
    }
    public void l1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0.class, "6")) {
          return;
       }
       a.b(p0.itemView, R.id.play_view_container);
       super.l1(p0);
       return;
    }
    public final List r1(List p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, f0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.iterator();
       while (obj.hasNext()) {
          RecoUser mFeedList = obj.next().mFeedList;
          if (mFeedList == null || !mFeedList.size()) {
             obj.remove();
          }
       }
       return p0;
    }
    public void z0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0.class, "7")) {
          return;
       }
       a.c(p0, R.id.play_view_container);
       super.z0(p0);
       return;
    }
}
