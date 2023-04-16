package com.kuaishou.live.lite.sidebar.LiteSideBarConfigDataSource$a;
import java.lang.Object;
import nsd.u;
import com.kuaishou.live.core.show.startup.LiveLiteSideBarConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.sidebar.LiteSideBarConfigDataSource;
import qrd.p;
import java.lang.Boolean;
import java.util.Collection;

public final class LiteSideBarConfigDataSource$a	// class@000b1e
{

    public void LiteSideBarConfigDataSource$a(){
       super();
    }
    public void LiteSideBarConfigDataSource$a(u p0){
       super();
    }
    public final LiveLiteSideBarConfig a(){
       Object obj = PatchProxy.apply(null, this, LiteSideBarConfigDataSource$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiteSideBarConfigDataSource.e.getValue();
    }
    public final boolean b(LiveLiteSideBarConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiteSideBarConfigDataSource$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 != null) {
          LiveLiteSideBarConfig mOrderList = p0.mOrderList;
          mOrderList = (mOrderList == null || mOrderList.isEmpty())? 1: 0;
          if (!mOrderList) {
             p0 = p0.mShopLiveOrderList;
             int i = (p0 == null || p0.isEmpty())? 1: 0;
             if (!i) {
             label_0039 :
                return b;
             }
          }
       }
    label_0038 :
       b = false;
       goto label_0039 ;
    }
}
