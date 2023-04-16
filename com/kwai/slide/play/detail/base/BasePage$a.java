package com.kwai.slide.play.detail.base.BasePage$a;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o56.a;
import xf6.d;
import xf6.l;
import com.kwai.slide.play.detail.base.BasePage;

public final class BasePage$a	// class@00172b
{

    public void BasePage$a(){
       super();
    }
    public void BasePage$a(u p0){
       super();
    }
    public final boolean a(){
       boolean i;
       Object obj = PatchProxy.apply(null, this, BasePage$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (a.d()) {
          i = l.e("KEY_DISABLE_PAGE_DISPATCH", -1);
          if (i != -1) {
             i = (i)? true: false;
          }else {
             i = BasePage.T;
          }
       }else {
          i = BasePage.T;
       }
       return i;
    }
    public final int b(){
       return BasePage.Q;
    }
}
