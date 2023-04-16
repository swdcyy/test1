package ddd.a;
import ddd.e;
import java.lang.Object;
import java.util.HashMap;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import ddd.c;
import uy5.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Collection;
import java.util.Set;
import java.lang.Boolean;
import y8c.g;
import y8c.f$b;

public class a implements e	// class@00211b
{
    public HashMap a;

    public void a(){
       super();
       this.a = new HashMap();
    }
    public f a(ViewGroup p0,int p1){
       c obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.a.get(Integer.valueOf(p1));
       int i = 0;
       if (obj == null) {
          Object[] objArray = new Object[i];
          a.C().t("SearchCardFactory", "not found factory for viewType:"+p1, objArray);
          return null;
       }else {
          Object[] objArray1 = new Object[i];
          a.C().t("SearchCardFactory", "createPresenter for viewType:"+p1+"  factory:"+obj.getClass().getSimpleName(), objArray1);
          return this.a.get(Integer.valueOf(p1)).a(p0, p1);
       }
    }
    public Collection b(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.keySet();
    }
    public void c(int p0,c p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "3")) {
          return;
       }
       if (this.a.keySet().contains(Integer.valueOf(p0))) {
          Object[] objArray = new Object[0];
          a.C().t("SearchCardFactory", "failed to register duplicate viewType:"+p0+"  factory1:"+p1.getClass().getSimpleName()+" factory2:"+this.a.get(Integer.valueOf(p0)).getClass().getSimpleName(), objArray);
          return;
       }else {
          this.a.put(Integer.valueOf(p0), p1);
          return;
       }
    }
    public boolean d(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.a.keySet().contains(Integer.valueOf(p0));
    }
    public f$b e(g p0,int p1,f$b p2){
       c obj;
       Object[] objArray;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, a.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.a.keySet().contains(Integer.valueOf(p1))) {
          obj = this.a.get(Integer.valueOf(p1));
          f$b uob = obj.b(p0, p2);
          if (uob != null) {
             objArray = new Object[0];
             a.C().t("SearchCardFactory", "getCallerContext for viewType:"+p1+"  factory:"+obj.getClass().getSimpleName()+"  context:"+uob.getClass().getSimpleName(), objArray);
          }else {
             objArray = new Object[0];
             a.C().t("SearchCardFactory", "getCallerContext factory:"+obj.getClass().getSimpleName()+" not need context", objArray);
          }
          return uob;
       }else {
          Object[] objArray1 = new Object[0];
          a.C().t("SearchCardFactory", "getCallerContext for not support viewType:"+p1, objArray1);
          return null;
       }
    }
}
