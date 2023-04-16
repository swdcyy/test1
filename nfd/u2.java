package nfd.u2;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import qvb.i;
import com.yxcorp.plugin.search.response.SearchResultResponse;

public class u2	// class@001e13
{

    public void u2(){
       super();
    }
    public static boolean a(RecyclerFragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, u2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       if (p0.q().L0() instanceof SearchResultResponse) {
          SearchResultResponse searchResult = p0.q().L0();
          if (searchResult != null) {
             return searchResult.mRecoPymkFlag;
          }
       }
       return false;
    }
}
