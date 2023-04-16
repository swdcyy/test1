package com.yxcorp.gifshow.v3.editor.music_v2.action.RapStyleProgressAction;
import xvc.b;
import com.yxcorp.gifshow.v3.editor.music_v2.state.LoadStatus;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;

public final class RapStyleProgressAction extends b	// class@001087
{
    public final int progress;
    public final LoadStatus status;

    public void RapStyleProgressAction(int p0,LoadStatus p1){
       a.p(p1, "status");
       super();
       this.progress = p0;
       this.status = p1;
    }
    public void RapStyleProgressAction(int p0,LoadStatus p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = LoadStatus.IDLE;
       }
       super(p0, p1);
       return;
    }
    public final int getProgress(){
       return this.progress;
    }
    public final LoadStatus getStatus(){
       return this.status;
    }
}
