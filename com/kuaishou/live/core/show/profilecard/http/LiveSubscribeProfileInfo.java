package com.kuaishou.live.core.show.profilecard.http.LiveSubscribeProfileInfo;
import java.io.Serializable;
import java.lang.Object;

public class LiveSubscribeProfileInfo implements Serializable	// class@000dcf
{
    public String mSubscribeDescription;
    public String mSubscribeId;
    public int mSubscribeStatus;
    public static final long serialVersionUID = 0xac4b226c7214b793;

    public void LiveSubscribeProfileInfo(){
       super();
       this.mSubscribeStatus = 1;
    }
}
