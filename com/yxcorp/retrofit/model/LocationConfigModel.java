package com.yxcorp.retrofit.model.LocationConfigModel;
import java.io.Serializable;
import java.lang.Object;

public class LocationConfigModel implements Serializable	// class@0013e1
{
    public boolean mAllowLLSwitch;
    public boolean mAllowLatLonSwitch;
    public Map mBizTypeModelMap;
    public List mConfigModelList;
    public static final long serialVersionUID = 0x9555a65592daa091;

    public void LocationConfigModel(){
       super();
       this.mAllowLatLonSwitch = false;
       this.mAllowLLSwitch = false;
    }
}
