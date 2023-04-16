package com.kuaishou.merchant.live.basic.model.punish.PunishInfo;
import java.io.Serializable;
import java.lang.Object;

public class PunishInfo implements Serializable	// class@00189e
{
    public String mDescription;
    public String mJumpUrl;
    public int mStatus;
    public static final long serialVersionUID = 0x804212c470ce7b50;

    public void PunishInfo(){
       super();
    }
    public boolean isPunished(){
       boolean b = (this.mStatus > null)? true: false;
       return b;
    }
}
