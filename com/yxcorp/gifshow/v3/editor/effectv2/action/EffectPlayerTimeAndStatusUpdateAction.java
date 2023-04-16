package com.yxcorp.gifshow.v3.editor.effectv2.action.EffectPlayerTimeAndStatusUpdateAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.player.UpdateTo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class EffectPlayerTimeAndStatusUpdateAction extends b	// class@000f33
{
    public final double playerCurrentTime;
    public final boolean playerState;
    public final UpdateTo updateTo;

    public void EffectPlayerTimeAndStatusUpdateAction(double p0,UpdateTo p1,boolean p2){
       a.p(p1, "updateTo");
       super();
       this.playerCurrentTime = p0;
       this.updateTo = p1;
       this.playerState = p2;
    }
    public void EffectPlayerTimeAndStatusUpdateAction(double p0,UpdateTo p1,boolean p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = 0;
       }
       if (p3 & 0x04) {
          p2 = true;
       }
       super(p0, p1, p2);
       return;
    }
    public final double getPlayerCurrentTime(){
       return this.playerCurrentTime;
    }
    public final boolean getPlayerState(){
       return this.playerState;
    }
    public final UpdateTo getUpdateTo(){
       return this.updateTo;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, EffectPlayerTimeAndStatusUpdateAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EffectPlayerTimeAndStatusUpdateAction\(playerCurrentTime="+this.playerCurrentTime+", updateTo="+this.updateTo+", playerState="+this.playerState+')';
    }
}
