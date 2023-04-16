package com.yxcorp.gifshow.ad.detail.presenter.ad.pop.popvideo.PopShowFragment$b;
import im8.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.popvideo.d;
import java.util.Map;
import java.util.HashMap;

public final class PopShowFragment$b implements g	// class@001607
{
    public PopShowFragment b;
    public BaseFeed c;

    public void PopShowFragment$b(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PopShowFragment$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, PopShowFragment$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(PopShowFragment$b.class, new d());
       }else {
          obj.put(PopShowFragment$b.class, null);
       }
       return obj;
    }
}
