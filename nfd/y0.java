package nfd.y0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ua6.b;
import ua6.b$a;
import ia0.c;
import java.lang.CharSequence;
import com.kwai.framework.abtest.f;
import com.kwai.sdk.switchconfig.a;
import java.lang.Number;
import java.lang.reflect.Type;
import nfd.s1;
import j06.a;
import xf6.d;
import com.yxcorp.plugin.search.SearchPage;

public final class y0	// class@001e26
{

    public void y0(){
       super();
    }
    public static boolean A(){
       Object obj = PatchProxy.apply(null, null, y0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("OPPO\(OPPO A57\),vivo\(vivo Y66\),OPPO\(OPPO A59s\),OPPO\(OPPO A37m\),vivo\(vivo Y71A\),OPPO\(OPPO R9m\),Xiaomi\(Redmi 4A\)").contains(b.c.a().e().g());
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, y0.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("enableCollectionContinuePlay02");
    }
    public static boolean b(){
       Object obj = PatchProxy.apply(null, null, y0.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (a.t().a("enableSearchElementShow", i) == 1) {
          i = true;
       }
       return i;
    }
    public static int c(){
       Object obj = PatchProxy.apply(null, null, y0.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("enableMusicItemLyric", 0);
    }
    public static boolean d(){
       Object obj = PatchProxy.apply(null, null, y0.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("SearchFilterNewTest2");
    }
    public static boolean e(){
       Object obj = PatchProxy.apply(null, null, y0.class, "29");
       if (obj == PatchProxyResult.class) {
          obj = f.b("enable_musicplayerholdout", Boolean.class, Boolean.TRUE);
       }
       return obj.booleanValue();
    }
    public static int f(){
       Object obj = PatchProxy.apply(null, null, y0.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("searchResultRecoReasonType", 0);
    }
    public static int g(){
       Object obj = PatchProxy.apply(null, null, y0.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("SearchLiveUserHeadPortraitApp", 0);
    }
    public static boolean h(){
       Object obj = PatchProxy.apply(null, null, y0.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (f.f("enableSearchCollectionOptimization", i) == 1) {
          i = true;
       }
       return i;
    }
    public static boolean i(){
       Object obj = PatchProxy.apply(null, null, y0.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (s1.h() <= b) {
          b = false;
       }
       return b;
    }
    public static boolean j(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, y0.class, "35");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, s1.class, "36");
       boolean b = false;
       boolean b1 = (obj != patchProxyRe)? obj.booleanValue(): a.t().d("enableSearchGoodsTileStyle", b);
       if (b1 && !y0.n()) {
          b = true;
       }
       return b;
    }
    public static boolean k(){
       Object obj = PatchProxy.apply(null, null, y0.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("enableSearchHashTagFeedTwoColumn");
    }
    public static boolean l(){
       Object obj = PatchProxy.apply(null, null, y0.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableSearchHistoryWordSearchLogicOpt", false);
    }
    public static boolean m(){
       Object obj = PatchProxy.apply(null, null, y0.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (a.b() || d.j())? true: false;
       return b;
    }
    public static boolean n(){
       Object obj = PatchProxy.apply(null, null, y0.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (f.f("enable_shield_search_app", i) == 1) {
          i = true;
       }
       return i;
    }
    public static boolean o(){
       Object obj = PatchProxy.apply(null, null, y0.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (a.t().a("searchResultTimeLikeShowType", i) == 1) {
          i = true;
       }
       return i;
    }
    public static boolean p(){
       Object obj = PatchProxy.apply(null, null, y0.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("user_new_card_guanzhu");
    }
    public static boolean q(){
       Object obj = PatchProxy.apply(null, null, y0.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableShowSearchSlideGuideTips", false);
    }
    public static int r(){
       Object obj = PatchProxy.apply(null, null, y0.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("searchCollectionPlayCacheCount", 0);
    }
    public static int s(){
       Object obj = PatchProxy.apply(null, null, y0.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (s1.h() == 2) {
          return 5;
       }
       if (s1.h() == 3) {
          return 10;
       }
       return 0;
    }
    public static int t(){
       Object obj = PatchProxy.apply(null, null, y0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return f.e("SearchAlertAuto");
    }
    public static int u(){
       Object obj = PatchProxy.apply(null, null, y0.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return f.e("SearchAutoVoice2");
    }
    public static int v(){
       Object obj = PatchProxy.apply(null, null, y0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return f.e("SearchcollectionAuto2");
    }
    public static int w(){
       Object obj = PatchProxy.apply(null, null, y0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return f.e("SearchLiveAuto2");
    }
    public static int x(){
       Object obj = PatchProxy.apply(null, null, y0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return f.e("SearchPhotoAuto2");
    }
    public static int y(){
       Object obj = PatchProxy.apply(null, null, y0.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("searchDetailReoLoadMoreThreshold", 3);
    }
    public static boolean z(SearchPage p0){
       boolean b = (p0 == SearchPage.AGGREGATE)? true: false;
       return b;
    }
}
