package com.kuaishou.tuna.plc.dynamic_container.bridge.model.PlcDynamicContainerStatusInfo;
import java.io.Serializable;
import java.lang.Object;

public class PlcDynamicContainerStatusInfo implements Serializable	// class@000fda
{
    public PlcDynamicContainerStatusInfo$AvailableSize mAvailableSize;
    public PlcDynamicContainerStatusInfo$ContainerRect mContainerRect;
    public PlcDynamicContainerStatusInfo$SafeArea mSafeArea;
    public int mStatus;
    public static final long serialVersionUID = 0xc9cad9f2891fbcbe;

    public void PlcDynamicContainerStatusInfo(){
       super();
    }
}
