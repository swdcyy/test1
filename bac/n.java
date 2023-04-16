package bac.n;
import bac.p;
import bac.n$a;
import nsd.u;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.List;
import io.reactivex.subjects.PublishSubject;
import f7c.c;
import a7c.h;
import xl8.b;
import fac.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import im8.c;
import fac.b;
import com.yxcorp.gifshow.pymk.f;
import f7c.d;
import qrd.l1;
import bac.p$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.framework.model.user.RecoUser;
import java.util.Map;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import i2b.a;
import iac.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import iac.r;
import iac.n;
import java.util.Set;
import iac.j;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.d;
import iac.a;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.b;
import iac.k;

public final class n extends p	// class@000415
{
    public final ArrayList o;
    public final b p;
    public final c q;
    public final PublishSubject r;
    public final int s;
    public final PublishSubject t;
    public static final n$a u;

    static {
       n.u = new n$a(null);
    }
    public void n(int p0,BaseFragment p1,List p2,PublishSubject p3,c p4,PublishSubject p5,PublishSubject p6,h p7,b p8,c p9,PublishSubject p10,int p11,PublishSubject p12){
       a.p(p1, "fragment");
       a.p(p2, "recoUsers");
       a.p(p3, "followUserSub");
       a.p(p4, "listener");
       a.p(p5, "followPositionSub");
       a.p(p6, "closeUserSub");
       a.p(p7, "pymkParams");
       a.p(p8, "selectionPosition");
       a.p(p9, "bigCardSizeParam");
       a.p(p10, "buttonSubject");
       a.p(p12, "buttonClickSubject");
       super(p0, p1, p2, p3, p4, p5, p6, p7);
       this.p = p8;
       this.q = p9;
       this.r = p10;
       this.s = p11;
       this.t = p12;
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(new c("relation_select_position", p8));
       uArrayList.add(new c("relation_btn_click", p12));
       uArrayList.add(new c("ADAPTER", this));
       uArrayList.add(new c("PYMK_ACCESS_IDSbigcard_btn", p10));
       uArrayList.add(p9);
       if (p11 == 2) {
          b uob = new b();
          uob.a = p1;
          uob.b = p7.s().r;
          uob.e = p3;
          uob.j = p7;
          uob.i = p7.u();
          uArrayList.add(uob);
       }
       this.o = uArrayList;
       return;
    }
    public ArrayList L0(int p0,p$b p1){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, on, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "holder");
       return this.o;
    }
    public int f0(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, on, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       RecoUser recoUser = this.M0(p0);
       recoUser = (recoUser != null)? recoUser.mType: null;
       if (recoUser == 2) {
          return 3;
       }else if(recoUser == 3){
          return 4;
       }else {
          return this.s;
       }
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(n.class, null);
       return objectsByTag;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       p$b uob;
       View view;
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          uob = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, on, "1");
          if (uob != PatchProxyResult.class) {
          }else {
          label_001a :
             a.p(p0, "parent");
             boolean b = false;
             if (p1 != 2) {
                if (p1 != 3) {
                   if (p1 != 4) {
                      view = a.k(p0, R.layout.arg_RES_7f0d129d, b);
                      uob = new p$b(view);
                      uob.a.U7(new o());
                      uob.a.U7(new r());
                      uob.a.U7(new n());
                      uob.a.f(view);
                      this.f.add(uob.a);
                   }else {
                      view = a.k(p0, R.layout.arg_RES_7f0d040c, b);
                      uob = new p$b(view);
                      uob.a.U7(new j());
                      uob.a.U7(new d());
                      uob.a.f(view);
                      this.f.add(uob.a);
                   }
                }else {
                   view = a.k(p0, R.layout.arg_RES_7f0d040b, b);
                   uob = new p$b(view);
                   uob.a.U7(new a());
                   uob.a.U7(new b());
                   uob.a.f(view);
                   this.f.add(uob.a);
                }
             }else {
                view = a.k(p0, R.layout.arg_RES_7f0d00fd, b);
                uob = new p$b(view);
                uob.a.U7(new k());
                uob.a.f(view);
                this.f.add(uob.a);
             }
          }
       }else {
          goto label_001a ;
       }
       return uob;
    }
}
