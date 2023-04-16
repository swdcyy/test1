package com.kuaishou.bowl.data.center.network.AggregationMaterialRequest;
import java.io.Serializable;
import java.lang.Object;

public class AggregationMaterialRequest implements Serializable	// class@0011f5
{
    public String belonging;
    public Map extraParam;
    public String liveStreamId;
    public String pageCode;
    public List pendantCodes;
    public String sellerId;
    public int triggerSource;
    public List triggerTimings;
    public static final long serialVersionUID = 0xbae6b650a38c8924;

    public void AggregationMaterialRequest(){
       super();
    }
}
