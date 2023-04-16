package dac.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import dac.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendTabHostFragment;
import androidx.fragment.app.Fragment;

public final class d	// class@00213a
{

    public static final b a(BaseFragment p0){
       Object obj1;
       ExploreFriendTabHostFragment uExploreFrie = null;
       ExploreFriendTabHostFragment obj = PatchProxy.applyOneRefs(p0, uExploreFrie, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "host");
       obj = (!p0 instanceof ExploreFriendTabHostFragment)? uExploreFrie: p0;
       if (obj != null) {
          obj = obj.I;
          if (obj != null) {
             uExploreFrie = obj;
          }else {
          label_0026 :
             Fragment parentFragme = p0.getParentFragment();
             if (parentFragme != null) {
                if (!parentFragme instanceof ExploreFriendTabHostFragment) {
                   parentFragme = uExploreFrie;
                }
                if (parentFragme != null) {
                   uExploreFrie = parentFragme.I;
                }
             }
          }
       }else {
          goto label_0026 ;
       }
       if (uExploreFrie == null) {
          uExploreFrie = new b(p0);
       }
       return uExploreFrie;
    }
}
