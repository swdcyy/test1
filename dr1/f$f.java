package dr1.f$f;
import erd.g;
import dr1.f;
import java.lang.Object;
import nh3.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.SystemUtil;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import f02.a;
import java.util.Objects;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaLiveState;
import dr1.g;
import android.os.Message;
import w12.a;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.common.core.component.multiline.model.a;
import tq1.b;
import pq1.b;
import androidx.lifecycle.LiveData;
import dr1.d;
import androidx.lifecycle.MutableLiveData;
import ls1.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import java.util.Map$Entry;
import dr1.e;

public final class f$f implements g	// class@002002
{
    public final f b;

    public void f$f(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       a uoa1;
       if (PatchProxy.applyVoidOneRefs(p0, this, f$f.class, "1")) {
       }else if(SystemUtil.I()){
          b.P(f.s, "roomInfoUpdateConsumer: "+p0);
       }
       if (p0 != null) {
          f$f tb = this.b;
          p0 = a.d(p0);
          Objects.requireNonNull(tb);
          f uof = f.class;
          if (!PatchProxy.applyVoidOneRefs(p0, tb, uof, "5")) {
             int i = 0;
             int i1 = (p0 != null)? p0.size(): 0;
             a uoa = null;
             if (i1 < 3) {
                p0 = f.s;
                b.r(p0, "responseCellInfoListUpdate, list invalid!");
                tb.n = uoa;
                if (tb.j.u() != LiveMultiLineArenaLiveState.IDLE) {
                   b.P(p0, "responseCellInfoListUpdate, trigger idle");
                   p0 = tb.j;
                   p0.p(p0.j(i));
                }
             }else {
                b.P(f.s, "responseCellInfoListUpdate");
                a.m(p0);
                p0 = p0.iterator();
                while (true) {
                   if (p0.hasNext()) {
                      uoa1 = p0.next();
                      if (!b.a.g(uoa1)) {
                         continue ;
                      }
                   }else {
                      uoa1 = uoa;
                   }
                   tb.n = uoa1;
                   p0 = tb.e.getValue();
                   if (p0 != null) {
                      p0.e = tb.n;
                      b.b(tb.e).setValue(p0);
                      if (p0.f() && tb.j.u() != LiveMultiLineArenaLiveState.SHOW_END) {
                         String str = p0.e();
                         f n = tb.n;
                         String str1 = (n != null)? n.a(): uoa;
                         if (TextUtils.n(str, str1)) {
                            b.P(f.s, "responseCellInfoListUpdate, trigger show end");
                            p0 = tb.j;
                            p0.p(p0.j(2));
                            break ;
                         }
                      }
                   label_00e9 :
                      if (!p0.f() && tb.j.u() != LiveMultiLineArenaLiveState.SHOWING) {
                         p0 = p0.c();
                         Map$Entry obj = PatchProxy.applyOneRefs(p0, tb, uof, "7");
                         if (obj != PatchProxyResult.class) {
                         }else {
                            p0 = p0.entrySet().iterator();
                            while (true) {
                               if (p0.hasNext()) {
                                  obj = p0.next();
                                  if (obj.getValue().d() == 2) {
                                     obj = obj.getKey();
                                  }else {
                                     continue ;
                                  }
                               }else {
                                  obj = uoa;
                               }
                            }
                         }
                         p0 = tb.n;
                         if (p0 != null) {
                            uoa = p0.a();
                         }
                         if (TextUtils.n(obj, uoa)) {
                            b.P(f.s, "responseCellInfoListUpdate, trigger showing");
                            p0 = tb.j;
                            p0.p(p0.j(1));
                            break ;
                         }
                      }
                   }
                }
             }
          }
       }
    label_0152 :
       return;
    }
}
