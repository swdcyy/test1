package nfd.s1$a;
import ok.x;
import java.lang.Object;
import com.yxcorp.plugin.search.SearchPage;
import java.lang.String;
import java.lang.Integer;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import nfd.r1;
import java.lang.reflect.Type;
import el.a;
import java.util.Map;

public class s1$a implements x	// class@001e02
{
    public final Map b;

    public void s1$a(){
       super();
       SearchPage pROFILE_FEED = SearchPage.PROFILE_FEED;
       pROFILE_FEED = SearchPage.PROFILE_LIKE;
       pROFILE_FEED = SearchPage.PROFILE_COLLECT;
       this.b = ImmutableMap.of(String.valueOf(pROFILE_FEED.mTabId), Integer.valueOf(pROFILE_FEED.mTabId), String.valueOf(pROFILE_FEED.mTabId), Integer.valueOf(pROFILE_FEED.mTabId), String.valueOf(pROFILE_FEED.mTabId), Integer.valueOf(pROFILE_FEED.mTabId));
    }
    public Object get(){
       Map map = PatchProxy.apply(null, this, s1$a.class, "1");
       if (map != PatchProxyResult.class) {
       }else {
          map = a.t().getValue("myProfileTabIdMapping", new r1(this).getType(), this.b);
       }
       return map;
    }
}
