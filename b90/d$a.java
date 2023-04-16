package b90.d$a;
import androidx.lifecycle.Observer;
import b90.d;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import b90.e;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import java.lang.StringBuilder;
import lnc.a1;
import z80.c;
import com.kwai.feature.post.api.mediascene.MediaSceneLaunchParams;
import java.util.List;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.widget.ProgressBar;

public final class d$a implements Observer	// class@000af0
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       e d;
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
       }else {
          d$a tb = this.b;
          a.o(p0, "progress");
          int i = p0.intValue();
          Objects.requireNonNull(tb);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          e uoe = e.class;
          if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, d.class, "8")) {
             if (tb.q.t0()) {
                d c = tb.c;
                Object[] objArray = null;
                if (!c instanceof KwaiLoadingView) {
                   c = objArray;
                }
                if (c != null) {
                   StringBuilder str = "";
                   d q = tb.q;
                   Objects.requireNonNull(q);
                   String str1 = PatchProxy.apply(objArray, q, uoe, "4");
                   if (str1 != patchProxyRe) {
                   }else {
                      str1 = a1.p(R.string.arg_RES_7f103de8);
                      MediaSceneLaunchParams mediaSceneLa1 = c.j.u();
                      if (mediaSceneLa1 != null) {
                         mediaSceneLa1 = mediaSceneLa1.mLoadingTitles;
                         if (mediaSceneLa1 != null) {
                            if (mediaSceneLa1.isEmpty()) {
                               a.o(str1, "defaultTitle");
                            }else {
                               q.u0();
                               d = q.d;
                               if (d >= null && d < mediaSceneLa1.size()) {
                                  Object obj1 = mediaSceneLa1.get(q.d);
                                  a.o(obj1, "titleList[mLoadingTitleIndex]");
                                  str1 = obj1;
                               }else {
                                  a.o(str1, "defaultTitle");
                               }
                            }
                         }
                      }
                      a.o(str1, "defaultTitle");
                   }
                   c.setLoadingText(str+str1+' '+i+'%');
                }
                i = tb.q;
                Objects.requireNonNull(i);
                Object obj = PatchProxy.apply(objArray, i, uoe, "5");
                if (obj != patchProxyRe) {
                   objArray = obj;
                }else {
                   MediaSceneLaunchParams mediaSceneLa = c.j.u();
                   if (mediaSceneLa != null) {
                      mediaSceneLa = mediaSceneLa.mLoadingSubTitles;
                      if (mediaSceneLa != null && !mediaSceneLa.isEmpty()) {
                         i.u0();
                         uoe = i.e;
                         if (uoe >= null && uoe < mediaSceneLa.size()) {
                            objArray = mediaSceneLa.get(i.e);
                         }
                      }
                   }
                }
                if (TextUtils.x(objArray)) {
                   tb.d.setVisibility(8);
                }else {
                   tb.d.setVisibility(0);
                   tb.d.setText(objArray);
                }
             }else {
                tb.e.setProgress(i);
                tb.i.setText(String.valueOf(i));
             }
          }
       }
       return;
    }
}
