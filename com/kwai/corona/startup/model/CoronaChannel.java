package com.kwai.corona.startup.model.CoronaChannel;
import java.io.Serializable;
import java.lang.Object;

public class CoronaChannel implements Serializable	// class@000ce9
{
    public String mChannelId;
    public int mEntranceType;
    public int mId;
    public String mName;
    public int mRealIndex;
    public int mType;
    public int mUploadIndex;
    public static final long serialVersionUID = 0xf4978a7182e029b5;

    public void CoronaChannel(){
       super();
       this.mId = 0;
       this.mName = "";
       this.mRealIndex = 0;
       this.mUploadIndex = 1;
       this.mEntranceType = 1;
    }
    public boolean isRecommendChannel(){
       boolean b = (this.mId == null)? true: false;
       return b;
    }
}
