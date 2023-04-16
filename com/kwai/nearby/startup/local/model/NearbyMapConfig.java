package com.kwai.nearby.startup.local.model.NearbyMapConfig;
import java.io.Serializable;
import java.lang.Object;

public class NearbyMapConfig implements Serializable	// class@001028
{
    public boolean mEnablePreload;
    public boolean mEnableShowNearbyMap;
    public boolean mEnableShowUserRole;
    public String mEntryDarkIcon;
    public String mEntryLightIcon;
    public String mEntryMessage;
    public int mLocalMapEntranceGuideCount;
    public Float mMapDefaultLevel;
    public List mMapFilterBoxes;
    public Float mMapMaxLevel;
    public String mMapStyleResource;
    public String mapStyleResourceZip;
    public static final long serialVersionUID = 0x51bbfa420874efd3;

    public void NearbyMapConfig(){
       super();
    }
}
