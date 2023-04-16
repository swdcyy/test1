package gsa.h0;
import androidx.fragment.app.Fragment;
import com.kwai.kcube.TabIdentifier;
import gsa.i0;

public final class h0	// class@002bed
{

    public static TabIdentifier a(Fragment p0){
       if (p0 == null) {
          return null;
       }
       if (p0 instanceof i0) {
          return p0.Ua();
       }
       return h0.a(p0.getParentFragment());
    }
}
