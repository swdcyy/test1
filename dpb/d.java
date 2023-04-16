package dpb.d;
import com.kwai.feature.component.searchhistory.SearchLayout$d;
import dpb.b;
import java.lang.Object;
import androidx.fragment.app.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import dpb.i;
import androidx.fragment.app.Fragment;

public final class d implements SearchLayout$d	// class@0024db
{
    public final b a;

    public void d(b p0){
       this.a = p0;
       super();
    }
    public final c b(){
       Object[] objArray = null;
       Object obj = PatchProxy.applyWithListener(objArray, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a.f.c().getHost() != null) {
          objArray = this.a.f.c().getChildFragmentManager();
       }
       PatchProxy.onMethodExit(d.class, "1");
       return objArray;
    }
}
