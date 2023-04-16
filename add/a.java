package add.a;
import java.lang.Object;
import com.google.gson.JsonObject;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.SearchPage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.result.SubTabItem;
import com.yxcorp.plugin.search.result.SearchKeywordContext;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import fbd.j;
import com.kwai.framework.model.user.User;
import com.search.common.entity.SearchBaseItem;

public class a	// class@0000da
{
    public static final String a = "type";

    public void a(){
       super();
    }
    public static void a(JsonObject p0,SearchItem p1,SearchPage p2){
       JsonObject jsonObject;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "8")) {
          return;
       }
       if (p2 == SearchPage.USER) {
          return;
       }
       SubTabItem minorKeyword = p1.mKeywordContext.getMinorKeyword();
       if (minorKeyword == null) {
          return;
       }
       if (!TextUtils.x(minorKeyword.mKeyword)) {
          SubTabItem mKeyword = minorKeyword.mKeyword;
          minorKeyword = minorKeyword.mPosition;
          a uoa = a.class;
          if (PatchProxy.isSupport(uoa)) {
             jsonObject = PatchProxy.applyTwoRefs(mKeyword, Integer.valueOf(minorKeyword), null, uoa, "9");
             if (jsonObject != PatchProxyResult.class) {
             label_0056 :
                p0.G("tab_lv2", jsonObject);
             }
          }
          jsonObject = new JsonObject();
          jsonObject.c0("name", mKeyword);
          jsonObject.a0("pos", Integer.valueOf(minorKeyword));
          goto label_0056 ;
       }
       return;
    }
    public static void b(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "7")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = p0;
       uElementPack.params = p1;
       ClientEvent$AreaPackage uAreaPackage = null;
       if (!TextUtils.x(p2)) {
          uAreaPackage = j.a(p2);
       }
       j.d(1, uElementPack, uAreaPackage);
       return;
    }
    public static void c(SearchItem p0,SearchPage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "5")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("parent_pos", Integer.valueOf(p0.mPosition));
       jsonObject.c0("parent_id", p0.mUser.mId);
       jsonObject.c0("session_id", p0.mSessionId);
       jsonObject.c0("parent_type", "user");
       jsonObject.c0("type", "follow");
       jsonObject.a0("result_count_type", Integer.valueOf(p0.mResultCountType));
       jsonObject.a0("recommend_result_type", Integer.valueOf(p0.mRecommendType));
       a.a(jsonObject, p0, p1);
       String str = jsonObject.toString();
       String str1 = (p1 == SearchPage.AGGREGATE || p0.mIsEmptyRecommended != null)? "RECOMMEND": "LIST";
       a.b("SEARCH_CARD", str, str1);
       return;
    }
}
