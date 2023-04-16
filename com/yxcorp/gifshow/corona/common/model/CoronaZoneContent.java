package com.yxcorp.gifshow.corona.common.model.CoronaZoneContent;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import com.yxcorp.gifshow.corona.common.model.CoronaZoneContent$a;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;

public final class CoronaZoneContent extends SyncableProviderContainer	// class@00122c
{
    public boolean mCanSlideToScheme;
    public CDNUrl[] mDarkModeLeftTopIcon;
    public List mFeeds;
    public CDNUrl[] mLeftTopIcon;
    public String mMiniAppServerParams;
    public String mName;
    public int mPage;
    public String mScheme;
    public int mTabId;
    public String mZoneUpRightName;
    public CoronaZoneContent$a parameter;
    public static final long serialVersionUID = 0x8bcc0ea376ead704;

    public void CoronaZoneContent(){
       super();
       this.parameter = new CoronaZoneContent$a();
       this.mPage = 0;
    }
    public void startSyncWithFragment(t p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoronaZoneContent.class, "1")) {
          return;
       }
       super.startSyncWithFragment(p0);
       CoronaZoneContent tmFeeds = this.mFeeds;
       if (tmFeeds != null) {
          Iterator iterator = tmFeeds.iterator();
          while (iterator.hasNext()) {
             QPhoto qPhoto = iterator.next();
             if (qPhoto != null) {
                qPhoto.startSyncWithFragment(p0);
             }
          }
       }
       return;
    }
}
