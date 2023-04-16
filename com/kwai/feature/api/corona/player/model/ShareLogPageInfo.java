package com.kwai.feature.api.corona.player.model.ShareLogPageInfo;
import java.lang.Object;
import k2b.e0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class ShareLogPageInfo	// class@000e2a
{
    public int category;
    public String logExtraName;
    public int page;
    public String page2;

    public void ShareLogPageInfo(){
       super();
    }
    public static ShareLogPageInfo create(e0 p0){
       ShareLogPageInfo obj = PatchProxy.applyOneRefs(p0, null, ShareLogPageInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ShareLogPageInfo();
       obj.category = p0.M();
       obj.page = p0.getPage();
       obj.page2 = p0.o();
       obj.logExtraName = p0.h5();
       return obj;
    }
}
