package add.i0;
import java.lang.Object;
import com.kwai.feature.component.entry.SearchSceneSource;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import com.yxcorp.plugin.search.SearchPage;
import add.i0$a;
import java.lang.Enum;

public class i0	// class@0000ea
{

    public void i0(){
       super();
    }
    public static String a(SearchSceneSource p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == SearchSceneSource.TAG) {
          return a1.p(0x7f104be2);
       }
       if (p0 == SearchSceneSource.LIVE_STREAM) {
          return a1.p(0x7f1045db);
       }
       if (p0 == SearchSceneSource.HYPERMARKET) {
          return a1.p(0x7f10454b);
       }
       return a1.p(0x7f10454a);
    }
    public static SearchPage b(SearchSceneSource p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       switch (i0$a.a[p0.ordinal()]){
           case 1:
             return SearchPage.VERTICAL_TAG;
           case 2:
             return SearchPage.LIVE;
           case 3:
           case 4:
             return SearchPage.PHOTO;
           case 5:
             return SearchPage.ATLAS;
           case 6:
             return SearchPage.MUSIC;
           case 7:
             return SearchPage.USER;
           case 8:
             return SearchPage.GROUP;
           case 9:
           case 10:
             return SearchPage.COMMODITY;
           case 11:
             return SearchPage.POSITION;
           case 12:
             return SearchPage.HISTORY_PAGE;
           default:
             return null;
       }
    }
}
