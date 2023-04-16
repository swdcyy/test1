package com.yxcorp.gifshow.v3.framework.player.UpdatePlayerTimeAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.player.UpdateTo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class UpdatePlayerTimeAction extends b	// class@001527
{
    public final double currentTime;
    public final UpdateTo updateTo;

    public void UpdatePlayerTimeAction(double p0,UpdateTo p1){
       a.p(p1, "updateTo");
       super();
       this.currentTime = p0;
       this.updateTo = p1;
    }
    public final double getCurrentTime(){
       return this.currentTime;
    }
    public final UpdateTo getUpdateTo(){
       return this.updateTo;
    }
}
