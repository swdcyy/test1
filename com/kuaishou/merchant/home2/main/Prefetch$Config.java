package com.kuaishou.merchant.home2.main.Prefetch$Config;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.merchant.home2.main.Prefetch$a;

public class Prefetch$Config implements Serializable	// class@001806
{
    public long mEffectiveDuration;
    public long mRequestInterval;
    public long reportDelayDuration;
    public static final long serialVersionUID = 0xf8ef4799e361120d;

    public void Prefetch$Config(){
       super();
       this.mRequestInterval = 0x2bf20;
       this.mEffectiveDuration = 0x2710;
       this.reportDelayDuration = 2000;
    }
    public void Prefetch$Config(Prefetch$a p0){
       super();
    }
}
