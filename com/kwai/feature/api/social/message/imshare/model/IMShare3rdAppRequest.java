package com.kwai.feature.api.social.message.imshare.model.IMShare3rdAppRequest;
import com.kwai.feature.api.social.message.imshare.model.IMShareRequest;
import java.lang.String;
import java.util.List;

public class IMShare3rdAppRequest extends IMShareRequest	// class@00114f
{
    public final String appId;
    public final String appName;
    public static final long serialVersionUID = 0xc7e44725108ade2f;

    public void IMShare3rdAppRequest(String p0,String p1,String p2,List p3,List p4){
       super(p2, p3, p4);
       this.appId = p0;
       this.appName = p1;
    }
}
