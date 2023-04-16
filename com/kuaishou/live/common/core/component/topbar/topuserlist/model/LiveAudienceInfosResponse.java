package com.kuaishou.live.common.core.component.topbar.topuserlist.model.LiveAudienceInfosResponse;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class LiveAudienceInfosResponse implements Serializable	// class@001797
{
    public int result;
    public List userInfos;

    public void LiveAudienceInfosResponse(){
       super();
       this.userInfos = new ArrayList();
    }
}
