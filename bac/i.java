package bac.i;
import im8.g;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.List;
import fac.c;
import io.reactivex.subjects.PublishSubject;
import fac.b;
import java.util.LinkedHashSet;
import g9c.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.RecoUser;
import qvb.i;
import java.util.Iterator;
import java.util.Set;
import ml8.c;
import y8c.f$b;
import bac.i$a;
import java.lang.Number;
import bac.l;
import java.util.Map;
import java.util.HashMap;
import android.view.ViewGroup;
import y8c.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.relation.explore.presenter.v;
import android.view.View;
import i2b.a;
import hac.h1;

public class i extends g implements g	// class@00040b
{
    public c A;
    public b B;
    public PublishSubject C;
    public PublishSubject D;
    public RecoUser w;
    public final Set x;
    public BaseFragment y;
    public c z;

    public void i(BaseFragment p0,List p1,c p2,PublishSubject p3,PublishSubject p4,b p5){
       super();
       this.x = new LinkedHashSet();
       this.p1(true);
       this.e = p1;
       this.y = p0;
       this.A = p2;
       this.C = p3;
       this.D = p4;
       this.B = p5;
    }
    public a S0(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oi, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.n.remove(this.N0(p0));
       return super.S0(p0);
    }
    public void Z0(){
       if (PatchProxy.applyVoid(null, this, i.class, "5")) {
          return;
       }
       Iterator iterator = this.x.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          if (uoc != null) {
             uoc.destroy();
          }
       }
       this.x.clear();
       return;
    }
    public f$b d1(f$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.f = this.y;
       i$a uoa = new i$a(p0, this.A, this.C, this.D, this.B, this);
       return obj;
    }
    public int f0(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oi, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       RecoUser recoUser = this.N0(p0);
       if (recoUser != null) {
          return recoUser.mType;
       }else {
          return 0;
       }
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new l();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, i.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(i.class, new l());
       }else {
          obj.put(i.class, null);
       }
       return obj;
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       View view;
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oi, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       if (p1 == 2) {
          obj.U7(new v());
          view = a.i(p0, R.layout.arg_RES_7f0d040b);
       }else {
          obj.U7(new h1());
          view = a.i(p0, R.layout.arg_RES_7f0d00fd);
       }
       return new f(view, obj);
    }
    public void j1(boolean p0,boolean p1,List p2){
    }
}
