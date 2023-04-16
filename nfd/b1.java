package nfd.b1;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gbd.d;
import sy5.a;
import com.yxcorp.plugin.search.entity.SearchFilter;
import java.lang.Integer;
import com.search.common.entity.SearchBaseItem;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import k2b.e0;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import gbd.t;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.StringBuilder;
import android.os.SystemClock;
import q2b.h$b;
import fbd.j;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.plugin.search.response.SearchResultResponse;
import com.yxcorp.plugin.search.result.SearchKeywordContext;
import com.yxcorp.plugin.search.response.BaseSearchResultResponse;

public class b1	// class@001d8f
{

    public void b1(){
       super();
    }
    public static ClientEvent$ElementPackage a(String p0,String p1){
       d obj = PatchProxy.applyTwoRefs(p0, p1, null, b1.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.r();
       obj.s();
       obj = d.r();
       obj.a(p0);
       obj.h(obj.n("search_session_id", p1).e().i());
       return obj.d();
    }
    public static ClientEvent$ElementPackage b(SearchFilter p0,int p1,int p2){
       d obj;
       if (PatchProxy.isSupport(b1.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, b1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = d.r();
       obj.k(p0.mFilterType);
       obj.q(p0.mName);
       obj.s();
       obj = obj.n("search_session_id", p0.mSessionId);
       if (p1 >= 0) {
          obj.t(p1);
       }
       String str = obj.e().i();
       obj = d.r();
       String str1 = (p0.isCityFilter != null && p2 == 1)? "FILTER_CITY_BUTTON": "FILTER_BUTTON";
       obj.a(str1);
       obj.h(str);
       return obj.d();
    }
    public static void c(SearchResultFragment p0,String p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, b1.class, "10")) {
          return;
       }
       d uod = d.r();
       uod.s();
       uod.k(p1);
       uod.q(p2);
       d uod1 = d.r();
       uod1.a(p3);
       uod1.h(uod.n("search_session_id", p0.Uh()).e().i());
       ClientEvent$ElementPackage uElementPack = uod1.d();
       t.l(1, p0, uElementPack, t.a(p0, "FILTER", null));
       return;
    }
    public static void d(SearchResultFragment p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b1.class, "8")) {
          return;
       }
       t.l(1, p0, b1.a(p1, p0.Uh()), t.a(p0, "FILTER", null));
       return;
    }
    public static void e(SearchResultFragment p0,boolean p1,long p2,long p3){
       if (PatchProxy.isSupport(b1.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Long.valueOf(p2), Long.valueOf(p3), null, b1.class, "9")) {
          return;
       }
       d uod = d.r();
       uod.s();
       uod = uod.n("search_session_id", p0.Uh());
       StringBuilder str = "";
       long l = SystemClock.elapsedRealtime();
       if (!p1) {
          p2 = p3;
       }
       d uod1 = uod.n("duration", str+(l - p2)+"");
       String str1 = (p1)? "CITY": "ALL";
       uod1 = d.r();
       uod1.a("FILTER_FUNCTION_DURATION");
       uod1.h(uod1.n("table_name", str1).e().i());
       ClientEvent$ElementPackage uElementPack = uod1.d();
       h$b uob = h$b.e(7, "FILTER_FUNCTION_DURATION");
       uob.k(uElementPack);
       uob.f(t.a(p0, "FILTER", null));
       j.i(p0, uob);
       return;
    }
    public static void f(List p0,SearchResultFragment p1,int p2){
       if (PatchProxy.isSupport(b1.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, b1.class, "5")) {
          return;
       }
       if (!q.f(p0) && p1 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             List list = iterator.next();
             if (q.f(list)) {
             }else {
                for (int i = 0; i < list.size(); i = i + 1) {
                   b1.g(p1, p2, list, i);
                }
             }
          }
       }
       return;
    }
    public static void g(SearchResultFragment p0,int p1,List p2,int p3){
       if (PatchProxy.isSupport(b1.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, Integer.valueOf(p3), null, b1.class, "6")) {
          return;
       }
       SearchFilter searchFilter = p2.get(p3);
       if (searchFilter.mIsShow == null) {
          t.l(p1, p0, b1.b(searchFilter, (p3 + 1), p1), t.a(p0, "FILTER", null));
          searchFilter.mIsShow = true;
       }
       return;
    }
    public static void h(List p0,SearchResultResponse p1,SearchKeywordContext p2,boolean p3){
       if (PatchProxy.isSupport(b1.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, b1.class, "4")) {
          return;
       }
       if (q.f(p0) || (p1 != null && p2 != null)) {
          for (int i = 0; i < p0.size(); i = i + 1) {
             SearchFilter searchFilter = p0.get(i);
             searchFilter.mSessionId = p1.mUssid;
             searchFilter.mKeywordContext = p2;
             searchFilter.mRequestId = p1.mRequestId;
             searchFilter.isCityFilter = p3;
          }
       }
       return;
    }
    public static void i(List p0,SearchResultResponse p1,SearchKeywordContext p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b1.class, "3")) {
          return;
       }
       if (q.f(p0) || (p1 != null && p2 != null)) {
          int i = 0;
          while (i < p0.size()) {
             if (!q.f(p0.get(i))) {
                b1.h(p0.get(i), p1, p2, false);
             }
             i = i + 1;
          }
       }
       return;
    }
}
