package lv1.f;
import h3.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import android.view.ViewGroup;
import java.lang.Number;
import qq5.a;
import android.view.View;
import android.view.ViewParent;
import java.util.Collections;

public class f extends a	// class@003064
{
    public List d;
    public int e;

    public void f(List p0){
       super();
       this.d = p0;
    }
    public static Object A(List p0,int p1){
       f uof = f.class;
       Object obj = null;
       if (PatchProxy.isSupport(uof)) {
          Object obj1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), obj, uof, "5");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (!q.f(p0)) {
          obj = p0.get((p1 % p0.size()));
       }
       return obj;
    }
    public void h(ViewGroup p0,int p1,Object p2){
    }
    public int j(){
       f obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.d;
       int i = 1;
       if (obj == null || !obj.size()) {
          i = 0;
       }else if(this.d.size() == i){
          i = Integer.MAX_VALUE;
       }
       if (i != this.e) {
          this.e = i;
          this.q();
       }
       this.e = i;
       return i;
    }
    public int k(Object p0){
       return -2;
    }
    public Object o(ViewGroup p0,int p1){
       View obj;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uof, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uof = this.d;
       if (uof == null || uof.isEmpty()) {
          return null;
       }else {
          obj = f.A(this.d, p1).f();
          p0.removeView(obj);
          ViewParent parent = obj.getParent();
          if (parent instanceof ViewGroup) {
             parent.removeView(obj);
          }
          p0.addView(obj);
          obj.setTag(Integer.valueOf(p1));
          return obj;
       }
    }
    public boolean p(View p0,Object p1){
       boolean b = (p0 == p1)? true: false;
       return b;
    }
    public List z(){
       List list;
       f obj = PatchProxy.apply(null, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          list = Collections.emptyList();
       }
       return list;
    }
}
