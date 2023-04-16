package com.kwai.feature.api.social.message.imshare.model.IMShareCardObject;
import com.kwai.feature.api.social.message.imshare.model.IMShareLinkInfoObject;
import com.yxcorp.gifshow.entity.LinkInfo;
import java.lang.String;

public class IMShareCardObject extends IMShareLinkInfoObject	// class@001150
{
    public static final long serialVersionUID = 0xa3110b510a6e2a63;

    public void IMShareCardObject(LinkInfo p0,String p1){
       super(p0, p1);
    }
    public int getShareAction(){
       return 6;
    }
}
