package com.kuaishou.nearby_poi.poi.model.PoiModel;
import java.io.Serializable;
import com.kwai.framework.model.user.AdBusinessInfo$Location;
import java.lang.Object;

public class PoiModel implements Serializable	// class@000a32
{
    public AdBusinessInfo$Location mLocation;
    public long mPoiId;
    public static final long serialVersionUID = 0xb24ca8a06bee7e1d;

    public void PoiModel(long p0,AdBusinessInfo$Location p1){
       super();
       this.mPoiId = p0;
       this.mLocation = p1;
    }
    public AdBusinessInfo$Location getLocation(){
       return this.mLocation;
    }
    public long getPoiId(){
       return this.mPoiId;
    }
}
