package com.kuaishou.live.external.p$g;
import rp.a;
import java.lang.Object;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.live.external.p;
import k2b.u1;
import com.yxcorp.gifshow.log.model.ClickMetaData;

public class p$g implements a	// class@001bb2
{

    public void p$g(){
       super();
    }
    public void a(int p0,ClientEvent$ElementPackage p1,ClientContent$ContentPackage p2,String p3){
       if (PatchProxy.isSupport(p$g.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, p$g.class, "2")) {
          return;
       }
       u1.B0(new ShowMetaData().setType(p0).setElementPackage(p1).setContentPackage(p2).setFeedLogCtx(p.F(p3)));
       return;
    }
    public void b(int p0,ClientEvent$ElementPackage p1,ClientContent$ContentPackage p2,String p3){
       if (PatchProxy.isSupport(p$g.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, p$g.class, "1")) {
          return;
       }
       u1.B(new ClickMetaData().setType(p0).setElementPackage(p1).setContentPackage(p2).setFeedLogCtx(p.F(p3)));
       return;
    }
}
