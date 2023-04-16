package com.kwai.framework.model.kcube.TabViewInfo$TabIcon;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.j;

public class TabViewInfo$TabIcon	// class@000bbb
{
    public CDNUrl[] mDarkDefaultTabIconUrls;
    public CDNUrl[] mLightDefaultTabIconUrls;
    public CDNUrl[] mSelectedTabIconUrl;

    public void TabViewInfo$TabIcon(){
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, TabViewInfo$TabIcon.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (j.h(this.mSelectedTabIconUrl) && (!j.h(this.mDarkDefaultTabIconUrls) || !j.h(this.mLightDefaultTabIconUrls)))? true: false;
       return b;
    }
}
