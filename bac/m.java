package bac.m;
import bac.p;
import bac.m$a;
import nsd.u;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.List;
import io.reactivex.subjects.PublishSubject;
import f7c.c;
import a7c.h;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.framework.model.user.RecoUser;
import java.util.Map;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import bac.p$b;
import android.view.View;
import i2b.a;
import iac.b0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.j;
import iac.a1;
import iac.z0;
import java.util.Set;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.g;
import iac.y;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.e;
import iac.u;

public final class m extends p	// class@000413
{
    public static final m$a o;

    static {
       m.o = new m$a(null);
    }
    public void m(int p0,BaseFragment p1,List p2,PublishSubject p3,c p4,PublishSubject p5,PublishSubject p6,h p7){
       a.p(p1, "fragment");
       a.p(p2, "recoUsers");
       a.p(p3, "followUserSub");
       a.p(p4, "listener");
       a.p(p5, "followPositionSub");
       a.p(p6, "closeUserSub");
       a.p(p7, "pymkParams");
       super(p0, p1, p2, p3, p4, p5, p6, p7);
    }
    public int f0(int p0){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, om, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       RecoUser recoUser = this.M0(p0);
       recoUser = (recoUser != null)? recoUser.mType: -1;
       return recoUser;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(m.class, null);
       return objectsByTag;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       p$b uob;
       View view;
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          uob = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, om, "1");
          if (uob != PatchProxyResult.class) {
          }else {
          label_001a :
             a.p(p0, "parent");
             boolean b = false;
             if (p1 != 2) {
                if (p1 != 3) {
                   view = a.k(p0, R.layout.arg_RES_7f0d040d, b);
                   uob = new p$b(view);
                   uob.a.U7(new b0());
                   uob.a.U7(new j());
                   uob.a.U7(new a1());
                   uob.a.U7(new z0());
                   uob.a.f(view);
                   this.f.add(uob.a);
                }else {
                   view = a.k(p0, R.layout.arg_RES_7f0d00fa, b);
                   uob = new p$b(view);
                   uob.a.U7(new g());
                   uob.a.U7(new y());
                   uob.a.f(view);
                   this.f.add(uob.a);
                }
             }else {
                view = a.k(p0, R.layout.arg_RES_7f0d00f9, b);
                uob = new p$b(view);
                uob.a.U7(new e());
                uob.a.U7(new u());
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
