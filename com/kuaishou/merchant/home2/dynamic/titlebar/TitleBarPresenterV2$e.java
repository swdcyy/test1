package com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2$e;
import oy5.b;
import com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2;
import java.lang.Object;
import com.kwai.feature.component.entry.SearchEntryParams;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import com.kwai.feature.component.entry.SearchVerticalParams;
import com.kwai.feature.component.entry.SearchSceneSource;
import oy5.i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import oy5.e;

public final class TitleBarPresenterV2$e implements b	// class@001774
{
    public final TitleBarPresenterV2 a;

    public void TitleBarPresenterV2$e(TitleBarPresenterV2 p0){
       this.a = p0;
       super();
    }
    public SearchEntryParams a(int p0){
       SearchEntryParams obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TitleBarPresenterV2$e uoe = TitleBarPresenterV2$e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "1");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       uoe = this.a;
       Objects.requireNonNull(uoe);
       if (PatchProxy.isSupport(TitleBarPresenterV2.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), uoe, TitleBarPresenterV2.class, "6");
          if (obj != patchProxyRe) {
          label_0052 :
             return obj;
          }
       }
       String str = (p0 == 2)? "search_entrance_ksstore_placehoder": "search_entrance_ksstore";
       obj = SearchEntryParams.Instance().entrySource(str);
       SearchVerticalParams searchVertic = new SearchVerticalParams();
       searchVertic.sceneSource(SearchSceneSource.GOODS_PAGE);
       obj.setVerticalParams(searchVertic);
       goto label_0052 ;
    }
    public i b(int p0,int p1){
       i obj;
       if (PatchProxy.isSupport(TitleBarPresenterV2$e.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TitleBarPresenterV2$e.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new i();
       obj.b = TitleBarPresenterV2.P8(this.a);
       return obj;
    }
    public void c(e p0){
    }
}
