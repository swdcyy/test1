package add.g;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import com.yxcorp.plugin.search.result.LayoutStyle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import add.h;
import gcd.e;
import gcd.g;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import nfd.n2;
import java.lang.Boolean;
import com.yxcorp.plugin.search.result.SearchKeywordContext;
import com.yxcorp.plugin.search.SearchSource;
import com.yxcorp.plugin.search.response.Layout;

public class g	// class@0000e6
{

    public void g(){
       super();
    }
    public static LayoutStyle a(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LayoutStyle dOUBLE = (g.b(p0).a() == null)? LayoutStyle.DOUBLE: g.b(p0).a();
       return dOUBLE;
    }
    public static h b(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return g.a(p0).c();
    }
    public static void c(SearchResultFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, g.class, "3")) {
          return;
       }
       RecyclerView recyclerView = p0.h0();
       while (recyclerView.getItemDecorationCount() > 0) {
          recyclerView.removeItemDecorationAt(0);
       }
       n2.a(p0, p0.getActivity());
       return;
    }
    public static boolean d(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (g.b(p0).a != null)? true: false;
       return b;
    }
    public static boolean e(SearchKeywordContext p0,SearchSource p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0.isCorrectionWord()) {
          return b;
       }
       if (p1 != SearchSource.SEARCH_REVOKE_CORRECTION && (p1 != SearchSource.SEARCH_RELATED_TAB && (p1 != SearchSource.SEARCH_FILTER && p1 != SearchSource.FILTER))) {
          b = true;
       }
    label_002d :
       return b;
    }
    public static void f(Fragment p0,Layout p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, g.class, "1")) {
          return;
       }
       g.a(p0).e(p1);
       return;
    }
}
