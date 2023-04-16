package gy2.f;
import gy2.f$a;
import java.util.WeakHashMap;
import gy2.d;
import gy2.f$b;
import android.app.Application;
import o56.a;
import android.app.Application$ActivityLifecycleCallbacks;
import java.lang.Object;
import android.app.Activity;
import gy2.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gy2.g;
import java.util.Objects;
import gy2.g$a;
import java.lang.Boolean;
import com.yxcorp.utility.SystemUtil;
import com.kwai.framework.abtest.f;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class f	// class@002bc8
{
    public static final c a;
    public static final WeakHashMap b;
    public static final d c;
    public static final f$b d;
    public static final f e;

    static {
       f.e = new f();
       f.a = f$a.b;
       f.b = new WeakHashMap();
       f.c = new d();
       f$b uob = new f$b();
       f.d = uob;
       a.b().registerActivityLifecycleCallbacks(uob);
    }
    public void f(){
       super();
    }
    public final c a(Activity p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g$a obj = PatchProxy.applyOneRefs(p0, this, f.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = g.a;
       Objects.requireNonNull(obj);
       Object[] objArray = null;
       Object obj1 = PatchProxy.apply(objArray, obj, g$a.class, "9");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(SystemUtil.K() || f.a("enableAndroidDialogStackableOptimizeV4")){
          b = true;
       }else {
          b = false;
       }
       if (b && p0 != null) {
          objArray = f.b.get(p0);
       }
       if (objArray == null) {
          objArray = f.c;
       }
       return objArray;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       b.Z(f.a, "map size "+f.b.size());
       return;
    }
}
