package hc9.e;
import hc9.g;
import hc9.f;
import java.lang.Object;
import java.util.ArrayList;
import hc9.e$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.lang.Integer;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import w46.b;
import nc9.a;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import ad9.i$e;
import java.lang.CharSequence;
import android.text.TextUtils;

public class e implements g	// class@002587
{
    public int a;
    public Object b;
    public Object c;
    public List d;
    public int e;
    public f f;
    public boolean g;
    public i$e h;

    public void e(f p0){
       super();
       this.d = new ArrayList();
       this.f = p0;
       this.a = 0;
    }
    public final f a(){
       return this.f;
    }
    public void b(e$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "6")) {
          return;
       }
       if (this.d.contains(p0)) {
          return;
       }
       this.d.add(p0);
       return;
    }
    public void c(Object p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "4")) {
          return;
       }
       this.e = p1;
       this.d(7, p0);
       return;
    }
    public void d(int p0,Object p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoe, "3")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("AutoApplyStateManager", "state change:"+p0, objArray);
       int i1 = 7;
       if (this.g() == i1 && p0) {
          if (p0 == i1) {
             p1 = new Object[i];
             a.D().w("AutoApplyStateManager", "change state error: has already been close state", p1);
             return;
          }else {
             p1 = new Object[i];
             a.D().t("AutoApplyStateManager", "change state error", p1);
             return;
          }
       }else {
          Object[] objArray1 = new Object[i];
          a.D().w("AutoApplyStateManager", "changeStatus:"+a.a(p1), objArray1);
          this.a = p0;
          this.b = p1;
          Iterator iterator = new ArrayList(this.d).iterator();
          while (iterator.hasNext()) {
             iterator.next().onStateChanged(p0);
          }
          if (p0 == 3 || p0 == 5) {
             this.c = p1;
          }
          return;
       }
    }
    public int e(){
       return this.e;
    }
    public Object f(){
       return this.b;
    }
    public int g(){
       return this.a;
    }
    public Object h(){
       return this.c;
    }
    public void i(e$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "7")) {
          return;
       }
       this.d.remove(p0);
       return;
    }
    public void j(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("AutoApplyStateManager", "setWaiting:"+p0, objArray);
       this.g = p0;
       return;
    }
    public boolean k(boolean p0){
       String obj;
       Object[] objArray1;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoe, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("AutoApplyStateManager", "start force:"+p0, objArray);
       obj = "start failed";
       if (!p0 && (this.g != null || this.g())) {
          objArray1 = new Object[0];
          a.D().w("AutoApplyStateManager", obj, objArray1);
          return 0;
       }else if(this.g() == 7){
          this.d(0, null);
       }
       if (this.g()) {
          objArray1 = new Object[0];
          a.D().w("AutoApplyStateManager", obj, objArray1);
          return 0;
       }else if(this.f.i() != -1){
          e th = this.h;
          if (th != null) {
             th.a(this.f.i());
          }
       }
       boolean b = true;
       if (this.f.c() != null) {
          int i = (this.f.s())? 2: 1;
          this.d(i, this.f.c());
          return b;
       }else if(!TextUtils.isEmpty(this.f.d())){
          this.d(b, this.f.e());
          return b;
       }else {
          Object[] objArray2 = new Object[0];
          a.D().w("AutoApplyStateManager", "start failed, not found valid data", objArray2);
          return 0;
       }
    }
    public void l(f p0){
       this.f = p0;
    }
}
