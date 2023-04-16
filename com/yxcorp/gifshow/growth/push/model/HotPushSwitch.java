package com.yxcorp.gifshow.growth.push.model.HotPushSwitch;
import java.io.Serializable;
import java.lang.Object;

public class HotPushSwitch implements Serializable	// class@00149d
{
    public int dayMax;
    public int perMax;
    public int period;
    public static final long serialVersionUID = 0x79a79a10f8cbd392;

    public void HotPushSwitch(){
       super();
       this.dayMax = 0;
       this.period = 0;
       this.perMax = 0;
    }
}
