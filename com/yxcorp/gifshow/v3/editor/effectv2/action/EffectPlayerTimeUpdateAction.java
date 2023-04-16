package com.yxcorp.gifshow.v3.editor.effectv2.action.EffectPlayerTimeUpdateAction;
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

public final class EffectPlayerTimeUpdateAction extends b	// class@000f34
{
    public final int currentRangeIndex;
    public final double playerCurrentTime;
    public final UpdateTo updateTo;

    public void EffectPlayerTimeUpdateAction(double p0,UpdateTo p1,int p2){
       a.p(p1, "updateTo");
       super();
       this.playerCurrentTime = p0;
       this.updateTo = p1;
       this.currentRangeIndex = p2;
    }
    public void EffectPlayerTimeUpdateAction(double p0,UpdateTo p1,int p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = 0;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final int getCurrentRangeIndex(){
       return this.currentRangeIndex;
    }
    public final double getPlayerCurrentTime(){
       return this.playerCurrentTime;
    }
    public final UpdateTo getUpdateTo(){
       return this.updateTo;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, EffectPlayerTimeUpdateAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EffectPlayerTimeUpdateAction\(playerCurrentTime="+this.playerCurrentTime+", updateTo="+this.updateTo+", currentRangeIndex="+this.currentRangeIndex+')';
    }
}
