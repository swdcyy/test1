package nfd.s1;
import nfd.s1$a;
import ok.x;
import com.google.common.base.Suppliers;
import com.yxcorp.plugin.search.utils.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.model.config.InternalNegativeFeedbackConfig;
import java.lang.Number;
import java.util.List;
import nfd.s1$b;
import java.lang.reflect.Type;
import el.a;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import com.yxcorp.plugin.search.result.SearchTabEntity;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.plugin.search.SearchPage;
import nfd.k2;
import x6d.z;
import nfd.s1$c;

public class s1	// class@001e05
{
    public static final x a;
    public static final x b;
    public static k2 c;

    static {
       s1.a = Suppliers.a(new s1$a());
       s1.b = Suppliers.a(s.b);
    }
    public void s1(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, s1.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (a.t().d("enableGoodsDecisionOpt", b) || s1.e()) {
          b = true;
       }
       return b;
    }
    public static boolean b(){
       Object obj = PatchProxy.apply(null, null, s1.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableSearchHomeOpt", false);
    }
    public static boolean c(){
       Object obj = PatchProxy.apply(null, null, s1.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!a.t().b("searchHorizontalAutoPlay", -1) - 1)? true: false;
       return b;
    }
    public static boolean d(){
       InternalNegativeFeedbackConfig obj = PatchProxy.apply(null, null, s1.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = s1.b.get();
       boolean b = false;
       if (obj != null && obj.mFeedBackEnabled == 1) {
          b = true;
       }
       return b;
    }
    public static boolean e(){
       Object obj = PatchProxy.apply(null, null, s1.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableSearchGoodsCardNewCoupon", false);
    }
    public static boolean f(){
       Object obj = PatchProxy.apply(null, null, s1.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableSearchInnerRerank", false);
    }
    public static boolean g(){
       Object obj = PatchProxy.apply(null, null, s1.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("searchSugSwip", false);
    }
    public static int h(){
       Object obj = PatchProxy.apply(null, null, s1.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("searchGoodsTileStylePlayType", 0);
    }
    public static List i(){
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, objArray, s1.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.t().getValue("searchHoldoutConfig", new s1$b().getType(), objArray);
       ArrayList uArrayList = new ArrayList();
       if (!q.f(obj)) {
          int i = 0;
          while (i < obj.size()) {
             SearchTabEntity searchTabEnt = obj.get(i);
             if (searchTabEnt != null && !TextUtils.isEmpty(searchTabEnt.mType)) {
                SearchPage searchPage = SearchPage.ofTabType(searchTabEnt.mType);
                if (!TextUtils.isEmpty(searchTabEnt.mName)) {
                   searchPage.setName(searchTabEnt.mName);
                }
                uArrayList.add(searchPage);
             }
             i = i + 1;
          }
       }
       if (q.f(uArrayList)) {
          uArrayList.add(SearchPage.USER);
          uArrayList.add(SearchPage.MUSIC);
          uArrayList.add(SearchPage.TAG);
       }
       return uArrayList;
    }
    public static boolean j(){
       Object obj = PatchProxy.apply(null, null, s1.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableNewPageLaunchMonitor", false);
    }
    public static long k(){
       Object obj = PatchProxy.apply(null, null, s1.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.t().b("searchHotRankAutoRefreshTimeInterval", 0x1d4c0);
    }
    public static int l(){
       Object obj = PatchProxy.apply(null, null, s1.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("enableClientProfileV2Version", -1);
    }
    public static int m(){
       Object obj = PatchProxy.apply(null, null, s1.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("searchHoldoutLiveTabPreview", 0);
    }
    public static k2 n(){
       Object obj = PatchProxy.apply(null, null, s1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (s1.c == null) {
          s1.c = a.t().getValue("searchOptConfig", k2.class, new k2());
       }
       return s1.c;
    }
    public static z o(){
       Object obj = PatchProxy.apply(null, null, s1.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("searchResultAutoPlayParams", z.class, new z());
    }
    public static List p(){
       Object obj = PatchProxy.apply(null, null, s1.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("userSignalConfig", new s1$c().getType(), null);
    }
    public static boolean q(){
       Object obj = PatchProxy.apply(null, null, s1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (a.t().d("disableSearchNewImage", true) ^ true);
    }
}
