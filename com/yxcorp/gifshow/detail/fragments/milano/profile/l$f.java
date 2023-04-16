package com.yxcorp.gifshow.detail.fragments.milano.profile.l$f;
import p1a.a$a;
import com.yxcorp.gifshow.detail.fragments.milano.profile.l;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;

public class l$f extends a$a	// class@001559
{
    public final QPhoto x;
    public final l y;

    public void l$f(l p0,int p1,int p2,String p3,QPhoto p4){
       this.y = p0;
       this.x = p4;
       super(p1, p2, p3);
    }
    public ClientContent$ContentPackage d(ClientContent$ContentPackage p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l$f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.photoPackage = this.y.R8(this.x);
       p0.liveStreamPackage = this.y.P8(this.x);
       return p0;
    }
}
