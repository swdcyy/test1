package com.yxcorp.gifshow.photoad.PhotoAdClientLogReport$b;
import java.lang.Runnable;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import kp.r1;
import k2b.u1;

public final class PhotoAdClientLogReport$b implements Runnable	// class@000f65
{
    public final BaseFeed b;
    public final int c;

    public void PhotoAdClientLogReport$b(BaseFeed p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PhotoAdClientLogReport$b.class, "1")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(this.b);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AD_LOG_GENERAL_BUTTON";
       i3 oi3 = i3.f();
       oi3.c("area", Integer.valueOf(this.c));
       uElementPack.params = oi3.e();
       ShowMetaData showMetaData = new ShowMetaData();
       showMetaData.setType(3);
       showMetaData.setElementPackage(uElementPack);
       showMetaData.setContentPackage(uContentPack);
       showMetaData.setFeedLogCtx(r1.O0(this.b));
       u1.B0(showMetaData);
       return;
    }
}
