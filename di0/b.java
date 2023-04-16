package di0.b;
import androidx.lifecycle.MediatorLiveData;
import di0.b$a;
import nsd.u;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.kotlin.livedata.ListHolder$UpdateType;
import androidx.lifecycle.MutableLiveData;
import java.util.List;
import androidx.lifecycle.LiveData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Collection;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class b extends MediatorLiveData	// class@001fa2
{
    public static final b$a a;

    static {
       b.a = new b$a(null);
    }
    public void b(){
       super(null, 1, null);
    }
    public void b(ListHolder p0){
       a.p(p0, "listHolder");
       super();
       p0.b = ListHolder$UpdateType.CHANGE_ALL;
       this.setValue(p0);
    }
    public void b(ListHolder p0,int p1,u p2){
       List list = null;
       if (p1 & 1) {
          list = new ListHolder(list, 1, list);
       }
       super(list);
       return;
    }
    public static void r(b p0,Object p1,int p2,Object p3,int p4,Object p5){
       ListHolder value;
       if (p4 & 0x02) {
          value = p0.getValue();
          value = (value != null)? value.f(): 0;
       }
    label_0012 :
       if (p4 & 0x04) {
          p3 = null;
       }
       p0.q(p1, value, p3);
       return;
    }
    public static void t(b p0,List p1,Object p2,int p3,Object p4){
       p0.s(p1, null);
    }
    public static void x(b p0,int p1,Object p2,int p3,Object p4){
       p0.w(p1, null);
    }
    public static void z(b p0,int p1,Object p2,Object p3,int p4,Object p5){
       p0.y(p1, p2, null);
    }
    public final void q(Object p0,int p1,Object p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, b.class, "4")) {
          return;
       }
       ListHolder value = this.getValue();
       if (value != null && (!PatchProxy.isSupport(ListHolder.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, value, ListHolder.class, "2"))) {
          value.d.add(p1, p0);
          value.a = p1;
          value.b = ListHolder$UpdateType.INSERT;
          value.c = p2;
       }
       this.setValue(this.getValue());
       return;
    }
    public final void s(List p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "3")) {
          return;
       }
       String str = "allItem";
       a.p(p0, str);
       ListHolder value = this.getValue();
       if (value != null && !PatchProxy.applyVoidTwoRefs(p0, p1, value, ListHolder.class, "1")) {
          a.p(p0, str);
          value.d.clear();
          value.d.addAll(p0);
          value.a = -1;
          value.b = ListHolder$UpdateType.CHANGE_ALL;
          value.c = p1;
       }
       this.setValue(this.getValue());
       return;
    }
    public final Object u(int p0){
       Object obj;
       int i;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = null;
       if (p0 >= 0) {
          ListHolder value = this.getValue();
          if (value != null) {
             List list = value.c();
             if (list != null) {
                i = list.size();
             label_002e :
                if (p0 < i) {
                   value = this.getValue();
                   if (value != null) {
                      list = value.c();
                      if (list != null) {
                         obj = list.get(p0);
                      }
                   }
                }
             }
          }
          i = 0;
          goto label_002e ;
       }
    label_0043 :
       return obj;
    }
    public final int v(){
       ListHolder obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.getValue();
       int i = (obj != null)? obj.f(): -1;
       return i;
    }
    public final void w(int p0,Object p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "5")) {
          return;
       }
       ListHolder value = this.getValue();
       if (value != null) {
          ListHolder listHolder = ListHolder.class;
          if (!PatchProxy.isSupport(listHolder) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, value, listHolder, "3")) {
             value.d.remove(p0);
             value.a = p0;
             value.b = ListHolder$UpdateType.REMOVE;
             value.c = p1;
          }
       }
       this.setValue(this.getValue());
       return;
    }
    public final void y(int p0,Object p1,Object p2){
       int i;
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, b.class, "6")) {
          return;
       }
       if (p0 >= 0) {
          ListHolder value = this.getValue();
          if (value != null) {
             List list = value.c();
             if (list != null) {
                i = list.size();
             label_0030 :
                if (p0 < i) {
                   value = this.getValue();
                   if (value != null && (!PatchProxy.isSupport(ListHolder.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, value, ListHolder.class, "4"))) {
                      value.d.set(p0, p1);
                      value.a = p0;
                      value.b = ListHolder$UpdateType.CHANGE;
                      value.c = p2;
                   }
                   this.setValue(this.getValue());
                }
             }
          }
          i = 0;
          goto label_0030 ;
       }
       return;
    }
}
