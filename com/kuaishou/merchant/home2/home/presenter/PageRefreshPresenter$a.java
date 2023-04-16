package com.kuaishou.merchant.home2.home.presenter.PageRefreshPresenter$a;
import erd.o;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.basic.model.HomePage;
import com.kuaishou.merchant.home2.basic.stability.ExceptionCluesTags;
import fg6.a;
import bx3.c;
import java.lang.reflect.Type;
import com.google.gson.Gson;

public class PageRefreshPresenter$a implements o	// class@0017d8
{

    public void PageRefreshPresenter$a(){
       super();
    }
    public Object apply(Object p0){
       HomePage homePage = PatchProxy.applyOneRefs(p0, this, PageRefreshPresenter$a.class, "1");
       if (homePage != PatchProxyResult.class) {
       }else {
          ExceptionCluesTags.setHomePageJson(p0.a());
          homePage = a.a.i(p0.a(), c.class);
          if (homePage != null) {
             homePage.mResponseStr = p0.a();
          }
       }
       return homePage;
    }
}
