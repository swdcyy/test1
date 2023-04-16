package gsa.b0$b;
import java.lang.Runnable;
import gsa.b0;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import java.util.Iterator;
import java.util.List;
import com.kwai.kcube.TabIdentifier;
import java.lang.StringBuilder;
import on5.a;
import com.kwai.component.homepage_interface.pagelist.prefetch.HomePrefetchConfigUtils;
import com.kwai.component.homepage_interface.pagelist.model.PhotoPage;
import lnc.e1;
import android.app.Activity;
import wkd.b;
import ob5.a;
import jb5.d;

public final class b0$b implements Runnable	// class@002bdf
{
    public final int b;
    public final WeakReference c;
    public final b0 d;

    public void b0$b(b0 p0,int p1,WeakReference p2){
       a.p(p2, "activityRef");
       this.d = p0;
       super();
       this.b = p1;
       this.c = p2;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, b0$b.class, "1")) {
          return;
       }
       Log.b(b0.d, "prefetch after launch event");
       Iterator iterator = this.d.a.iterator();
       while (iterator.hasNext()) {
          TabIdentifier tabIdentifie = iterator.next();
          String d = b0.d;
          Log.b(d, "homeTab : "+tabIdentifie);
          int i = a.a(tabIdentifie);
          if (this.b == i || !HomePrefetchConfigUtils.b.a(this.d.b(i))) {
             Log.b(d, "hint launch cache tabId, continue current prefetch :"+i);
          }else if(e1.b.a() && i == 3){
             Log.b(d, "命中发现页ctr预取开关&&tab是发现页,需要在#CtrPredictorPrefetchHelper中触发预取");
          }else {
             Log.b(d, "create prefetch pagelist :"+i);
             Activity uActivity = this.c.get();
             if (uActivity != null) {
                a.o(uActivity, "it");
                if (!uActivity.isFinishing()) {
                   b.a(-1684107285).c(i, this.d.a(i, uActivity), true);
                }
             }
          }
       }
       return;
    }
}
