package com.kwai.components.nearbymodel.model.CityHotSpotFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import com.kwai.components.nearbymodel.model.CityHotSpotMeta;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fi5.j;
import java.util.Map;
import java.io.ObjectInputStream;
import com.smile.gifmaker.mvps.utils.SyncableProvider;

public class CityHotSpotFeed extends BaseFeed	// class@000c6b
{
    public CityHotSpotMeta mCityHotSpotModel;
    public CommonMeta mCommonMeta;
    public CoverMeta mCoverMeta;
    public ExtMeta mExtMeta;
    public static final long serialVersionUID = 0x3957d15e07c356f7;

    public void CityHotSpotFeed(){
       super();
    }
    public String getId(){
       return this.mCityHotSpotModel.mHotspotId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CityHotSpotFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, CityHotSpotFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(CityHotSpotFeed.class, new j());
       }else {
          obj.put(CityHotSpotFeed.class, null);
       }
       return obj;
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CityHotSpotFeed.class, "1")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
}
