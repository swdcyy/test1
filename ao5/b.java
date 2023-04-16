package ao5.b;
import com.kwai.kcube.TabIdentifier;
import java.util.List;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.String;
import wq6.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Map;
import as6.a;
import ao5.a;
import z0.a;
import java.util.Iterator;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;

public class b	// class@00030b
{
    public final Map a;
    public final List b;
    public final TabIdentifier c;
    public int d;
    public boolean e;
    public boolean f;

    public void b(TabIdentifier p0,List p1){
       super();
       this.a = new HashMap();
       this.c = p0;
       this.b = new ArrayList(p1);
    }
    public static String b(int p0){
       String str;
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                if (p0 != 4) {
                   str = (p0 != 10)? "default": "others";
                }else {
                   str = "local_cache";
                }
             }else {
                str = "last_startup";
             }
          }else {
             str = "realtime";
          }
       }else {
          str = "uri_link";
       }
       return str;
    }
    public void a(h p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       if (this.a.isEmpty()) {
          this.d = p1;
       }
       h oh = a.m(p0);
       oh = p0;
       p0 = oh;
       while (p0 != null && !this.a.containsKey(p0.M2())) {
          this.a.put(p0.M2(), new a(p0.M2(), oh.M2(), p1));
          this.b.remove(p0.M2());
          oh = a.m(p0);
       }
       return;
    }
    public void c(int p0,a p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "3")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          h oh = p1.apply(iterator.next());
          if (oh == null) {
             continue ;
          }else {
             iterator.remove();
             h oh1 = a.m(oh);
             TabIdentifier tabIdentifie = oh1.M2();
             this.a.put(tabIdentifie, new a(oh1.M2(), oh.M2(), p0));
          }
       }
       return;
    }
    public a d(TabIdentifier p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.get(p0);
    }
    public TabIdentifier e(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.get(this.c);
       a uoa = obj;
       Object[] objArray1 = objArray;
       while (uoa != null) {
          obj = this.a.get(uoa.a);
       }
       return objArray1.a;
    }
    public int f(){
       return this.d;
    }
    public String g(){
       Object obj = PatchProxy.apply(null, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.b(this.d);
    }
    public boolean h(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (!this.b.size())? true: false;
       return b;
    }
    public boolean i(){
       Object obj = PatchProxy.apply(null, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.isEmpty();
    }
    public boolean j(){
       boolean b = true;
       if (this.d != b && this.e != null) {
          b = false;
       }
       return b;
    }
    public boolean k(TabIdentifier p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return p0.equals(this.e());
    }
    public boolean l(){
       return this.f;
    }
    public void m(boolean p0){
       this.f = p0;
    }
    public void n(boolean p0){
       this.e = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{priorityTabList="+this.a+", reason="+this.d+"}";
    }
}
