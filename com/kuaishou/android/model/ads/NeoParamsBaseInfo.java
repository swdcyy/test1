package com.kuaishou.android.model.ads.NeoParamsBaseInfo;
import com.kuaishou.android.model.ads.AdNeoInfo;

public class NeoParamsBaseInfo extends AdNeoInfo	// class@00087c
{
    public boolean mAutoReport;
    public long mBusinessId;
    public boolean mEnableCountdownReport;
    public String mExtParams;
    public static final long serialVersionUID = 0x2db99252dd016a4a;

    public void NeoParamsBaseInfo(){
       super();
       this.mEnableCountdownReport = false;
       this.mAutoReport = false;
    }
}
