package cia.w;
import im8.g;
import vl8.c;
import java.util.HashSet;
import com.google.common.collect.o;
import cia.w$c;
import java.util.Set;
import cia.w$b;
import k2b.e0;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;
import java.lang.Boolean;
import cia.w$a;
import xl8.b;
import com.trello.rxlifecycle3.android.FragmentEvent;
import cia.x;
import java.util.Map;
import java.util.HashMap;

public class w extends c implements g	// class@00051c
{
    public a c;
    public BaseFragment d;
    public e0 e;
    public e f;
    public b g;
    public g h;
    public u i;
    public d j;
    public List k;
    public w$a l;
    public final Set m;
    public final Set n;
    public final w$c o;
    public final w$b p;

    public void w(){
       super();
       HashSet hashSet = o.h();
       this.m = hashSet;
       HashSet hashSet1 = o.h();
       this.n = hashSet1;
       this.o = new w$c(hashSet);
       this.p = new w$b(hashSet1);
    }
    public e0 N(){
       w td = this.d;
       if (td != null) {
          return td;
       }
       return this.e;
    }
    public SlidePlayViewModel O(){
       Object[] objArray = null;
       w obj = PatchProxy.apply(objArray, this, w.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj != null) {
          return SlidePlayViewModel.S0(obj);
       }
       obj = this.c;
       if (obj instanceof SlidePlayViewModel) {
          objArray = obj;
       }
       return objArray;
    }
    public boolean P(){
       w obj = PatchProxy.apply(null, this, w.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d;
       if (obj != null) {
          return obj.isResumed();
       }
       obj = this.l;
       boolean b = false;
       if (obj != null && obj.b.a() == FragmentEvent.RESUME) {
          b = true;
       }
       return b;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, w.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("injector")) {
          return new x();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, w.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("injector")) {
          obj.put(w.class, new x());
       }else {
          obj.put(w.class, null);
       }
       return obj;
    }
}
