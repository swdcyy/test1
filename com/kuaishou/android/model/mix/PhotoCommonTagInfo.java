package com.kuaishou.android.model.mix.PhotoCommonTagInfo;
import java.io.Serializable;
import java.lang.Object;

public class PhotoCommonTagInfo implements Serializable	// class@000d3e
{
    public String mActionUrl;
    public int mBizType;
    public PhotoCommonTagIconInfo mIconInfo;
    public String mKeyWord;
    public int mMatchType;
    public static final long serialVersionUID = 0x8a10351e57f948e1;

    public void PhotoCommonTagInfo(){
       super();
       this.mActionUrl = "";
    }
}
