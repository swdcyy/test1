package com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2$g;
import oy5.b;
import com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2;
import java.lang.Object;
import com.kwai.feature.component.entry.SearchEntryParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.component.entry.SearchVerticalParams;
import com.kwai.feature.component.entry.SearchSceneSource;
import oy5.i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import oy5.e;
import oy5.a;

public final class TitleBarPresenterV2$g implements b	// class@001776
{
    public final TitleBarPresenterV2 a;

    public void TitleBarPresenterV2$g(TitleBarPresenterV2 p0){
       this.a = p0;
       super();
    }
    public SearchEntryParams a(int p0){
       SearchEntryParams obj;
       TitleBarPresenterV2$g og = TitleBarPresenterV2$g.class;
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = SearchEntryParams.Instance().entrySource("search_entrance_ksstore");
       SearchVerticalParams searchVertic = new SearchVerticalParams();
       searchVertic.sceneSource(SearchSceneSource.GOODS_PAGE);
       obj.setVerticalParams(searchVertic);
       return obj;
    }
    public i b(int p0,int p1){
       i obj;
       if (PatchProxy.isSupport(TitleBarPresenterV2$g.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TitleBarPresenterV2$g.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new i();
       obj.b = TitleBarPresenterV2.P8(this.a);
       return obj;
    }
    public void c(e p0){
       a.a(this, p0);
    }
}
