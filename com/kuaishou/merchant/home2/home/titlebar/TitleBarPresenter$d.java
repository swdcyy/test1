package com.kuaishou.merchant.home2.home.titlebar.TitleBarPresenter$d;
import oy5.b;
import com.kuaishou.merchant.home2.home.titlebar.TitleBarPresenter;
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

public final class TitleBarPresenter$d implements b	// class@0017e1
{
    public final TitleBarPresenter a;

    public void TitleBarPresenter$d(TitleBarPresenter p0){
       this.a = p0;
       super();
    }
    public SearchEntryParams a(int p0){
       SearchEntryParams obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TitleBarPresenter$d uod = TitleBarPresenter$d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "1");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       uod = this.a;
       Objects.requireNonNull(uod);
       if (PatchProxy.isSupport(TitleBarPresenter.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), uod, TitleBarPresenter.class, "6");
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
       if (PatchProxy.isSupport(TitleBarPresenter$d.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TitleBarPresenter$d.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new i();
       obj.b = TitleBarPresenter.P8(this.a);
       return obj;
    }
    public void c(e p0){
    }
}
