package com.kuaishou.live.common.core.component.gift.domain.effect.bean.ActionData;
import java.io.Serializable;
import java.lang.Object;
import nsd.u;
import java.lang.System;

public class ActionData implements Serializable	// class@001197
{
    public final int actionType;
    public final long timestamp;

    public void ActionData(int p0,long p1){
       super();
       this.actionType = p0;
       this.timestamp = p1;
    }
    public void ActionData(int p0,long p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = System.currentTimeMillis();
       }
       super(p0, p1);
       return;
    }
    public final int getActionType(){
       return this.actionType;
    }
    public final long getTimestamp(){
       return this.timestamp;
    }
}
