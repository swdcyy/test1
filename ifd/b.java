package ifd.b;
import s99.d;
import ifd.d;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import tkd.b;
import tkd.d;
import os5.l;
import nfd.n2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.plugin.search.result.fragment.SearchResultTabFragment;
import androidx.fragment.app.Fragment;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;

public final class b implements d	// class@001001
{
    public final d a;

    public void b(d p0){
       this.a = p0;
    }
    public final boolean a(String p0){
       boolean b1;
       b ta = this.a;
       Objects.requireNonNull(ta);
       boolean b = true;
       if (d.a(-1492894991).h1()) {
       }else {
          d q = ta.q;
          d uod = null;
          Object obj = PatchProxy.applyOneRefs(q, uod, n2.class, "18");
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else if(q instanceof SearchResultTabFragment){
             uod = q;
          }else if(q.getParentFragment() instanceof SearchResultTabFragment){
             uod = q.getParentFragment();
          }
          if (uod != null) {
             b1 = uod.l1;
          }else {
             b1 = null;
          }
          if (b1 == null && ta.q.Q == null) {
             b = false;
          }
       }
       return b;
    }
}
