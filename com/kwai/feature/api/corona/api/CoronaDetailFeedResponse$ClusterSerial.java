package com.kwai.feature.api.corona.api.CoronaDetailFeedResponse$ClusterSerial;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class CoronaDetailFeedResponse$ClusterSerial implements Serializable, Cloneable	// class@000dda
{
    public String mId;
    public int mSubCount;
    public String mTitle;
    public int mType;

    public void CoronaDetailFeedResponse$ClusterSerial(){
       super();
    }
    public Object clone(){
       Object obj = PatchProxy.apply(null, this, CoronaDetailFeedResponse$ClusterSerial.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.clone();
    }
}
