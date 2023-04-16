package c05.b;
import erd.g;
import com.kuaishou.tuna_core.multi_web_page.presenter.TunaMultiWebContentPresenter;
import java.lang.Object;
import android.util.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna_core.multi_web_page.view.TunaMultiWebTitleView;
import androidx.fragment.app.e;
import androidx.fragment.app.c;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import zsd.u;

public final class b implements g	// class@0003f7
{
    public final TunaMultiWebContentPresenter b;

    public void b(TunaMultiWebContentPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b.class, "1")) {
       }else {
          int pos = p0.first.getPos();
          TunaMultiWebContentPresenter s = this.b.s;
          if (s != null) {
             e uoe = s.beginTransaction();
             if (uoe != null) {
                TunaMultiWebContentPresenter s1 = this.b.s;
                if (s1 != null) {
                   List fragments = s1.getFragments();
                   if (fragments != null) {
                      Iterator iterator = fragments.iterator();
                      while (iterator.hasNext()) {
                         Fragment uFragment = iterator.next();
                         a.o(uFragment, "frg");
                         String tag = uFragment.getTag();
                         if (tag != null) {
                            int i = TextUtils.x(tag) ^ 1;
                            if (!i) {
                               tag = null;
                            }
                            if (tag != null) {
                            label_0059 :
                               a.o(tag, "frg.tag?.takeIf { tag ->\x20\x02tils.isEmpty\(tag\) } ?: \"\"\x00");
                               if (u.H1(tag, '_'+pos, false, 2, null)) {
                                  uoe.E(uFragment);
                                  this.b.S8(uFragment, 1);
                               }else {
                                  uoe.s(uFragment);
                                  this.b.S8(uFragment, false);
                               }
                            }
                         }
                         tag = "";
                         goto label_0059 ;
                      }
                   }
                }
                uoe.o();
             }
          }
          PatchProxy.onMethodExit(b.class, "1");
       }
       return;
    }
}
