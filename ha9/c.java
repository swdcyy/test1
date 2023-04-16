package ha9.c;
import androidx.lifecycle.MediatorLiveData;
import ha9.c$a;
import nsd.u;
import ha9.b;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.base.livedata.UpdateType;
import ha9.a;
import androidx.lifecycle.MutableLiveData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import androidx.lifecycle.LiveData;
import java.util.Collection;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;

public class c extends MediatorLiveData	// class@00257b
{
    public boolean a;
    public int b;
    public int c;
    public static final c$a d;

    static {
       c.d = new c$a(null);
    }
    public void c(){
       super(new b(null, 1, null));
    }
    public void c(b p0){
       a.q(p0, "listHolder");
       super();
       this.c = -1;
       p0.e(UpdateType.CHANGE_ALL);
       this.setValue(p0);
    }
    public final void q(Object p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "5")) {
          return;
       }
       b value = this.getValue();
       if (value != null) {
          b uob = b.class;
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), value, uob, "3")) {
             value.g.add(p1, p0);
             value.d(p1);
             value.b = 1;
             value.e(UpdateType.ADD);
          }
       }
       if (this.a == null) {
          this.v();
       }else {
          this.b = this.b + 1;
          if (this.c < null) {
             this.c = p1;
          }
       }
       return;
    }
    public final void r(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       String str = "allItem";
       a.q(p0, str);
       b value = this.getValue();
       if (value != null && !PatchProxy.applyVoidOneRefs(p0, value, b.class, "1")) {
          a.q(p0, str);
          value.g.clear();
          value.g.addAll(p0);
          value.d(-2);
          value.e(UpdateType.CHANGE_ALL);
       }
       this.v();
       return;
    }
    public final Object s(int p0){
       b obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.getValue();
       Object obj1 = null;
       if (obj != null) {
          List list = obj.g();
          if (list != null) {
             int i = 1;
             if (p0 < 0 || p0 > (list.size() - i)) {
                i = 0;
             }
             if (!i) {
                list = obj1;
             }
             if (list != null) {
                obj1 = list.get(p0);
             }
          }
       }
       return obj1;
    }
    public final List t(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getValue();
       if (obj != null) {
          objArray = obj.g();
       }
       return objArray;
    }
    public final int u(){
       b obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.getValue();
       int i = (obj != null)? obj.f(): 0;
       return i;
    }
    public final void v(){
       if (PatchProxy.applyVoid(null, this, c.class, "13")) {
          return;
       }
       this.setValue(this.getValue());
       return;
    }
    public final boolean w(Object p0){
       int i;
       b obj = PatchProxy.applyOneRefs(p0, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getValue();
       if (obj != null) {
          List list = obj.g();
          if (list != null) {
             i = list.indexOf(p0);
          label_0028 :
             if (i == -1) {
                return false;
             }else {
                return this.x(i);
             }
          }
       }
       i = -1;
       goto label_0028 ;
    }
    public final boolean x(int p0){
       b obj;
       Object obj1;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "7");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = this.getValue();
       if (obj != null) {
          b uob = b.class;
          if (PatchProxy.isSupport(uob)) {
             obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, uob, "4");
             if (obj1 == patchProxyRe) {
             }
          }else {
          }
       }else {
          obj1 = null;
       }
       if (obj1 != null) {
          this.v();
       }
       b = (obj1 != null)? true: false;
       return b;
    }
    public final void y(int p0,Object p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "8")) {
          return;
       }
       b value = this.getValue();
       if (value != null) {
          b uob = (p0 >= 0 && p0 < value.f())? 1: null;
          if (!uob) {
             value = null;
          }
          if (value != null) {
             uob = b.class;
             if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, value, uob, "5")) {
                value.g.set(p0, p1);
                value.d(p0);
                value.e(UpdateType.CHANGE);
             }
             this.v();
          }
       }
       return;
    }
}
