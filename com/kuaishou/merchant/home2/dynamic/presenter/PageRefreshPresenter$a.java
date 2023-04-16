package com.kuaishou.merchant.home2.dynamic.presenter.PageRefreshPresenter$a;
import erd.g;
import com.kuaishou.merchant.home2.dynamic.presenter.PageRefreshPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.y;

public final class PageRefreshPresenter$a implements g	// class@001762
{
    public final PageRefreshPresenter b;

    public void PageRefreshPresenter$a(PageRefreshPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PageRefreshPresenter$a.class, "1")) {
       }else {
          p0 = this.b;
          if (p0.t != null) {
             p0.t = false;
          }else {
             p0.r.onNext(Boolean.TRUE);
          }
       }
       return;
    }
}
