package bb1.p;
import bb1.a;
import lp3.a;
import bb1.e;
import bb1.a$a;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import eb1.h;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import crd.b;
import lnc.b9;
import com.kuaishou.live.core.show.admin.model.LiveAdminAssistantConfig;
import java.util.ArrayList;
import androidx.collection.ArrayMap;
import java.util.Map;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.live.core.show.admin.model.LiveAdminAbilityModel;
import bb1.b;
import db1.a;

public class p extends a implements a	// class@000341
{
    public final e d;

    public void p(){
       super();
       this.d = new e();
    }
    public void Bk(a$a p0){
    }
    public List Ch(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.Ch(p0);
    }
    public void D8(a$a p0){
    }
    public void Ro(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, p.class, "6")) {
          return;
       }
       p td = this.d;
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoid(objArray, td, e.class, "11")) {
          e d = td.d;
          Objects.requireNonNull(d);
          if (!PatchProxy.applyVoid(objArray, d, h.class, "3")) {
             Iterator iterator = d.a.iterator();
             while (iterator.hasNext()) {
                b9.a(iterator.next().get());
             }
          }
       }
       return;
    }
    public List Sm(){
       Object obj = PatchProxy.apply(null, this, p.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.b;
    }
    public void So(LiveAdminAssistantConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "5")) {
          return;
       }
       if (p0 == null) {
          this.d.r(new ArrayList(), new ArrayMap());
          return;
       }else {
          this.d.r(p0.mAllAbilities, p0.getSceneAbilityConfig());
          return;
       }
    }
    public boolean W7(int p0){
       boolean b;
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, op, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       op = this.d;
       Objects.requireNonNull(op);
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), op, uoe, "7");
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else if(op.rg(p0) != null){
             b = true;
          }else {
             b = false;
          }
       }else {
          goto label_003d ;
       }
       return b;
    }
    public LiveAdminAbilityModel rg(int p0){
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, op, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.d.rg(p0);
    }
    public List x8(String p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, p.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.x8(p0, p1);
    }
    public a zl(int p0,b p1){
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, op, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.d.zl(p0, p1);
    }
}
