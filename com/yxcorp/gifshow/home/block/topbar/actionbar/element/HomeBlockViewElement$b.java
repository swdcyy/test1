package com.yxcorp.gifshow.home.block.topbar.actionbar.element.HomeBlockViewElement$b;
import im8.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.home.block.topbar.actionbar.element.e;
import java.util.Map;
import java.util.HashMap;

public final class HomeBlockViewElement$b implements g	// class@001651
{
    public TextView b;
    public PagerSlidingTabStrip$d c;
    public h d;

    public void HomeBlockViewElement$b(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HomeBlockViewElement$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, HomeBlockViewElement$b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(HomeBlockViewElement$b.class, new e());
       }else {
          obj.put(HomeBlockViewElement$b.class, null);
       }
       return obj;
    }
}
