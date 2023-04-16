package com.kuaishou.merchant.home2.dynamic.titlebar.SearchSwitcherPresenter$c;
import oy5.b;
import com.kuaishou.merchant.home2.dynamic.titlebar.SearchSwitcherPresenter;
import java.lang.Object;
import com.kwai.feature.component.entry.SearchEntryParams;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import xu4.e;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kwai.chat.sdk.logreport.utils.GsonUtil;
import com.kwai.feature.component.entry.SearchVerticalParams;
import com.kwai.feature.component.entry.SearchSceneSource;
import oy5.i;
import kotlin.jvm.internal.a;
import oy5.e;

public final class SearchSwitcherPresenter$c implements b	// class@001766
{
    public final SearchSwitcherPresenter a;

    public void SearchSwitcherPresenter$c(SearchSwitcherPresenter p0){
       this.a = p0;
       super();
    }
    public SearchEntryParams a(int p0){
       SearchVerticalParams obj;
       SearchEntryParams searchEntryP;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SearchSwitcherPresenter$c uoc = SearchSwitcherPresenter$c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       uoc = this.a;
       Objects.requireNonNull(uoc);
       SearchSwitcherPresenter searchSwitch = SearchSwitcherPresenter.class;
       if (PatchProxy.isSupport(searchSwitch)) {
          searchEntryP = PatchProxy.applyOneRefs(Integer.valueOf(p0), uoc, searchSwitch, "16");
          if (searchEntryP != patchProxyRe) {
          label_008c :
             return searchEntryP;
          }
       }
       String obj1 = e.a(uoc.S8(), "list_memory", "merchant_home_agile_mall_tab_search_storage_key");
       if (!obj1 instanceof List) {
          obj1 = null;
       }
       if (obj1 != null) {
          int i = 10;
          obj1 = (obj1.size() >= i)? GsonUtil.toJson(CollectionsKt___CollectionsKt.v5(obj1, i)): GsonUtil.toJson(CollectionsKt___CollectionsKt.v5(obj1, obj1.size()));
       }else {
          obj1 = "";
       }
       String str = (p0 == 2)? "search_entrance_placehoder_mall": "search_entrance_bar_mall";
       obj = new SearchVerticalParams();
       obj.sceneSource(SearchSceneSource.GOODS_PAGE);
       searchEntryP = SearchEntryParams.Instance().entrySource(str).referPhotoList(obj1).setVerticalParams(obj);
       goto label_008c ;
    }
    public i b(int p0,int p1){
       i obj;
       SearchSwitcherPresenter$c uoc = SearchSwitcherPresenter$c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new i();
       SearchSwitcherPresenter p = this.a.p;
       if (p == null) {
          a.S("mFragment");
       }
       obj.b = p;
       return obj;
    }
    public void c(e p0){
    }
}
