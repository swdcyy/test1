package nfd.n2;
import java.lang.Object;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import com.yxcorp.plugin.search.SearchPage;
import nfd.y0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import e7d.h;
import nfd.g3;
import med.d;
import androidx.recyclerview.widget.RecyclerView$n;
import ufd.m;
import med.b;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateCommodityFeed;
import nfd.s1;
import zed.q;
import java.util.List;
import y8c.g;
import com.yxcorp.plugin.search.result.a;
import cdd.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import qvb.i;
import com.yxcorp.plugin.search.result.hashtag.fragment.SearchTagDetailNativeFragment;
import java.util.Objects;
import g9c.a;
import gbd.u;
import com.yxcorp.plugin.search.result.SubTabItem;
import nfd.r0;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.plugin.search.result.a$a;
import e7d.f;
import joc.c;
import com.yxcorp.plugin.search.utils.PlayRecommendController;
import ha5.e;
import nfd.m2;
import nfd.l2;
import rcd.c;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.yxcorp.plugin.search.result.fragment.VerticalSceneSearchResultFragment;
import com.yxcorp.plugin.search.http.a;
import qvb.n0;
import java.lang.CharSequence;
import com.yxcorp.plugin.search.result.fragment.SearchResultTabFragment;

public class n2	// class@001de5
{

    public void n2(){
       super();
    }
    public static void a(SearchResultFragment p0,Context p1){
       boolean b;
       n2 on2 = n2.class;
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, on2, "1")) {
          return;
       }
       CustomRecyclerView uCustomRecyc = p0.h0();
       SearchPage searchPage = p0.kc();
       if (!y0.z(p0.kc())) {
          Object obj1 = PatchProxy.applyOneRefs(p0, obj, on2, "23");
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else if(!g3.q(p0.b1) && (p0.kc() == SearchPage.NEWEST || p0.kc() == SearchPage.HISTORY_PAGE)){
             b = true;
          }else {
             b = false;
          }
          if (b) {
          label_0066 :
             uCustomRecyc.addItemDecoration(new b(p0));
          }else if(searchPage == SearchPage.COMMODITY){
             uCustomRecyc.addItemDecoration(new d());
          }else {
             uCustomRecyc.addItemDecoration(new m());
          }
       }else {
          goto label_0066 ;
       }
       return;
    }
    public static boolean b(SearchPage p0){
       boolean b = (p0 != SearchPage.USER && (p0 != SearchPage.POSITION && (p0 != SearchPage.PHOTO && (p0 != SearchPage.MUSIC && (p0 == SearchPage.TAG || p0 == SearchPage.GROUP)))))? true: false;
       return b;
    }
    public static boolean c(SearchResultFragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, n2.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       SearchPage searchPage = p0.kc();
       if (searchPage != SearchPage.AGGREGATE && (searchPage == SearchPage.LIVE || n2.b(searchPage))) {
          return true;
       }
       return false;
    }
    public static boolean d(TemplateBaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, n2.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof TemplateCommodityFeed && y0.i())? true: false;
       return b;
    }
    public static boolean e(TemplateBaseFeed p0){
       boolean b1;
       Object obj = PatchProxy.applyOneRefs(p0, null, n2.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 instanceof TemplateCommodityFeed) {
          p0 = PatchProxy.apply(null, null, y0.class, "38");
          if (p0 != PatchProxyResult.class) {
             b1 = p0.booleanValue();
          }else if(s1.h() == b){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
          label_0038 :
             return b;
          }
       }
       b = false;
       goto label_0038 ;
    }
    public static boolean f(SearchResultFragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, n2.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null || (p0.kc() != null && p0.Y == null)) {
          if (p0.kc() == SearchPage.COMMODITY) {
             return true;
          }else if(p0.kc() == SearchPage.LIVE){
             b = true;
          }
       }
       return b;
    }
    public static boolean g(SearchPage p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, n2.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!y0.n() && (y0.e() && SearchPage.HASH_TAG_DETAIL != p0))? true: false;
       return b;
    }
    public static g h(SearchResultFragment p0,q p1,List p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, null, null, n2.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       d uod = new d(p0, n2.k(p0), p0.f(), p0.kc(), p1, null);
       return p2;
    }
    public static List i(BaseFragment p0){
       List obj = PatchProxy.applyOneRefs(p0, null, n2.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof SearchResultFragment) {
          return p0.q().getItems();
       }
       if (!p0 instanceof SearchTagDetailNativeFragment) {
          return null;
       }
       Objects.requireNonNull(p0);
       obj = PatchProxy.apply(null, p0, SearchTagDetailNativeFragment.class, "8");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.F1.Q0();
       }
       return obj;
    }
    public static String j(h p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, n2.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.F() != null) {
          SubTabItem subTabItem = p0.F().a();
          if (p0.z().f()) {
             if (p0.z().h() && p0.F().b()) {
                return "";
             }else if(subTabItem != null){
                return TextUtils.I(subTabItem.mKeyword);
             }
          }
          if (subTabItem == null || (subTabItem.mPosition != 1 && subTabItem.mType == null)) {
             return TextUtils.I(subTabItem.mKeyword);
          }
       }
    label_005e :
       return "";
    }
    public static a k(SearchResultFragment p0){
       m2 om2;
       n2 on2 = n2.class;
       l2 obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, on2, "5");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       SearchPage searchPage = p0.kc();
       boolean b = (searchPage != SearchPage.AGGREGATE && (searchPage != SearchPage.GROUP && (searchPage == SearchPage.USER || searchPage == SearchPage.COMMODITY)))? true: false;
       b = (!b && (!y0.z(searchPage) && (searchPage == SearchPage.ATLAS || searchPage == SearchPage.MUSIC)))? true: false;
       a$a uoa = new a$a();
       uoa.g(p0.b1);
       uoa.f(p0);
       uoa.e(searchPage);
       uoa.c(p0.i1);
       uoa.i = p0.g1;
       uoa.j = p0.Th();
       if (PatchProxy.isSupport(on2)) {
          om2 = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(b), obj, on2, "7");
          if (om2 != PatchProxyResult.class) {
          label_0077 :
             uoa.g = om2;
             SearchResultFragment b1 = p0.b1;
             obj = PatchProxy.applyThreeRefs(p0, b1, searchPage, null, n2.class, "6");
             if (obj != PatchProxyResult.class) {
             }else {
                obj = new l2(p0, b1);
             }
             uoa.h = obj;
             uoa.h(true);
             uoa.b(true);
             uoa.a = p0.m1;
             if (b) {
                uoa.d(p0.h1);
             }
             return uoa.a();
          }
       }
       om2 = new m2(b, p0);
       goto label_0077 ;
    }
    public static boolean l(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, n2.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.isFinishing() || p0.isDestroyed()))? true: false;
       return b;
    }
    public static boolean m(SearchResultFragment p0,TemplateBaseFeed p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, n2.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.kc() == SearchPage.COMMODITY || p1 instanceof TemplateCommodityFeed)? true: false;
       return b;
    }
    public static boolean n(Fragment p0){
       return p0 instanceof VerticalSceneSearchResultFragment;
    }
    public static boolean o(SearchPage p0){
       boolean b = (p0 == SearchPage.AGGREGATE || p0 == SearchPage.LIVE)? true: false;
       return b;
    }
    public static boolean p(SearchPage p0){
       boolean b = (p0 != SearchPage.AGGREGATE && (p0 == SearchPage.NEWEST || p0 == SearchPage.HISTORY_PAGE))? true: false;
       return b;
    }
    public static boolean q(SearchResultFragment p0){
       boolean b = (p0.q() instanceof a && (p0.q().K() && TextUtils.x(n2.j(p0.b1))))? true: false;
       return b;
    }
    public static void r(BaseFragment p0,boolean p1){
       n2 on2 = n2.class;
       Object obj = null;
       if (PatchProxy.isSupport(on2) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), obj, on2, "17")) {
          return;
       }
       if (p0 instanceof SearchResultTabFragment) {
          obj = p0;
       }else if(p0.getParentFragment() instanceof SearchResultTabFragment){
          obj = p0.getParentFragment();
       }
       if (obj != null) {
          obj.l1 = p1;
       }
       return;
    }
}
