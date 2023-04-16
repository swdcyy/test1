package com.kuaishou.bowl.data.center.network.LiveMaterialRequest;
import java.io.Serializable;
import java.lang.Object;

public class LiveMaterialRequest implements Serializable	// class@0011f7
{
    public Map extraParam;
    public String liveStreamId;
    public List pendantCodes;
    public String sellerId;
    public List triggerTimings;
    public static final long serialVersionUID = 0xf926c072f5bf0c3a;

    public void LiveMaterialRequest(){
       super();
    }
}
