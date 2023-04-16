package com.yxcorp.gifshow.share.j;
import com.yxcorp.gifshow.share.i$b;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Map;
import ohc.l;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import msa.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShareEvent;
import k2b.u1;

public class j implements i$b	// class@001bc5
{

    public void j(){
       super();
    }
    public void a(QPhoto p0,Map p1){
    }
    public void b(l p0,ShareInitResponse$SharePanelElement p1){
    }
    public void c(l p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, null, d.class, "13")) {
          ClientEvent$ShareEvent shareEvent = new ClientEvent$ShareEvent();
          shareEvent.source = 3;
          u1.f0(shareEvent);
       }
       return;
    }
}
