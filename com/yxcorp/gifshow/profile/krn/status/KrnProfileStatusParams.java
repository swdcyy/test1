package com.yxcorp.gifshow.profile.krn.status.KrnProfileStatusParams;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;

public class KrnProfileStatusParams implements Serializable	// class@001375
{
    public String mHeadUrl;
    public CDNUrl[] mHeadUrls;
    public String mMoodId;
    public String mServerParams;
    public static final long serialVersionUID = 0x65fee54d3ee9aed0;

    public void KrnProfileStatusParams(){
       super();
       CDNUrl[] uCDNUrlArray = new CDNUrl[0];
       this.mHeadUrls = uCDNUrlArray;
    }
}
