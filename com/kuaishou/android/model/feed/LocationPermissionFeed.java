package com.kuaishou.android.model.feed.LocationPermissionFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yp.j0;
import java.util.Map;
import java.io.ObjectInputStream;
import com.smile.gifmaker.mvps.utils.SyncableProvider;

public class LocationPermissionFeed extends BaseFeed	// class@000b1b
{
    public CommonMeta mCommonMeta;
    public LocationPermissionMeta mLocationPermissionMeta;
    public static final long serialVersionUID = 0xae89598769dfab6c;

    public void LocationPermissionFeed(){
       super();
    }
    public String getId(){
       CommonMeta mFeedId = this.mCommonMeta.mFeedId;
       if (mFeedId == null) {
          mFeedId = "";
       }
       return mFeedId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LocationPermissionFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, LocationPermissionFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(LocationPermissionFeed.class, new j0());
       }else {
          obj.put(LocationPermissionFeed.class, null);
       }
       return obj;
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocationPermissionFeed.class, "1")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
}
