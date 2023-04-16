package b2a.a;
import android.content.DialogInterface$OnDismissListener;
import com.kwai.library.network.detector.model.NetworkDetectConfig;
import java.lang.Object;
import android.content.DialogInterface;
import wkd.b;
import by6.e;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import by6.b;
import java.util.Collection;
import ekd.q;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.util.List;
import by6.d;
import java.util.Map;
import by6.f;
import by6.a;
import by6.f$b;

public final class a implements DialogInterface$OnDismissListener	// class@000354
{
    public final NetworkDetectConfig b;

    public void a(NetworkDetectConfig p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       boolean b;
       StringBuilder str1;
       a tb = this.b;
       e uoe = b.a(0x2e66f141);
       Objects.requireNonNull(uoe);
       String str = "4";
       if (PatchProxy.applyVoidOneRefs(tb, uoe, e.class, str)) {
       }else {
          b.a("cancel");
          b = true;
          if (q.f(uoe.a) || tb == null) {
             str1 = "cancel empty:"+q.f(uoe.a)+" networkDetectConfig==null:";
             if (tb != null) {
                b = false;
             }
             b.a(str1+b);
          }else {
             str1 = "cancel id:"+tb.id+" cancel:";
             boolean b1 = (tb.mMode == null)? true: false;
             b.a(str1+b1);
             Iterator iterator = uoe.a.iterator();
             while (iterator.hasNext()) {
                d uod = iterator.next();
                if ((uod.a().id).equals(tb.id)) {
                   b.a("cancel has running detector");
                   if (!PatchProxy.applyVoid(null, uod, d.class, str)) {
                      d c = uod.c;
                      if (c != null) {
                         c.clear();
                      }
                      if (!q.f(uod.b)) {
                         Iterator iterator1 = uod.b.iterator();
                         while (iterator1.hasNext()) {
                            f uof = iterator1.next();
                            Objects.requireNonNull(uof);
                            if (PatchProxy.applyVoid(null, uof, f.class, "5")) {
                               continue ;
                            }else {
                               uof.f = b;
                               f c1 = uof.c;
                               if (c1 != null) {
                                  c1.a();
                                  uof.c = null;
                               }
                               StringBuilder str2 = "NetworkTaskGroupDetector cancel currentDetectTaskPosition:";
                               f b2 = uof.b;
                               int i = (b2 == null)? -1: b2.a();
                               b.a(str2+i);
                               uof.g = false;
                            }
                         }
                         uod.b.clear();
                      }
                   }
                   uoe.a.remove(uod);
                   break ;
                }
             }
          }
       }
       return;
    }
}
