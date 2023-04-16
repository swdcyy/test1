package com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.ClipPanelInitializedAttachAction;
import xvc.b;
import apc.a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class ClipPanelInitializedAttachAction extends b	// class@000db2
{
    public final a timelinePanelConfig;

    public void ClipPanelInitializedAttachAction(){
       super(null, 1, null);
    }
    public void ClipPanelInitializedAttachAction(a p0){
       a.p(p0, "timelinePanelConfig");
       super();
       this.timelinePanelConfig = p0;
    }
    public void ClipPanelInitializedAttachAction(a p0,int p1,u p2){
       if (p1 & 1) {
          p0 = new a(0, 1, null);
       }
       super(p0);
       return;
    }
    public final a getTimelinePanelConfig(){
       return this.timelinePanelConfig;
    }
}
