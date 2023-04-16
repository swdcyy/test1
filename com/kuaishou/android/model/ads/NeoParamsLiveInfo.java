package com.kuaishou.android.model.ads.NeoParamsLiveInfo;
import com.kuaishou.android.model.ads.NeoParamsBaseInfo;

public class NeoParamsLiveInfo extends NeoParamsBaseInfo	// class@00087d
{
    public int mChannel;
    public int mDisplayType;
    public static final long serialVersionUID = 0x417d6dbfc7dc4e2b;

    public void NeoParamsLiveInfo(){
       super();
       this.mDisplayType = 0;
       this.mChannel = 0;
    }
}
