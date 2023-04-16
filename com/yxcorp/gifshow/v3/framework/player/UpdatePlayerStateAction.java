package com.yxcorp.gifshow.v3.framework.player.UpdatePlayerStateAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.player.UpdateTo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;

public final class UpdatePlayerStateAction extends b	// class@001526
{
    public final boolean isPlay;
    public final UpdateTo updateTo;

    public void UpdatePlayerStateAction(boolean p0,UpdateTo p1){
       a.p(p1, "updateTo");
       super();
       this.isPlay = p0;
       this.updateTo = p1;
    }
    public void UpdatePlayerStateAction(boolean p0,UpdateTo p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = UpdateTo.BOTH;
       }
       super(p0, p1);
       return;
    }
    public final UpdateTo getUpdateTo(){
       return this.updateTo;
    }
    public final boolean isPlay(){
       return this.isPlay;
    }
}
