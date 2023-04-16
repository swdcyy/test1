package com.kuaishou.live.model.LiveBasicInfo$LongConnectInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.android.live.model.Race;

public class LiveBasicInfo$LongConnectInfo implements Serializable	// class@000cee
{
    public String mAttach;
    public String mExpTag;
    public boolean mIsFirstEnterRoom;
    public String mLocale;
    public Race mRace;
    public static final long serialVersionUID = 0xb13f5775a81472ad;

    public void LiveBasicInfo$LongConnectInfo(){
       super();
       this.mRace = new Race();
       this.mLocale = "";
       this.mAttach = "";
       this.mExpTag = "";
       this.mIsFirstEnterRoom = true;
    }
}
