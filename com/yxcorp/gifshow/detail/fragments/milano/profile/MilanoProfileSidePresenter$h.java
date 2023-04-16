package com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter$h;
import p1a.a$a;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter;
import java.lang.String;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;

public class MilanoProfileSidePresenter$h extends a$a	// class@00153d
{
    public final User x;
    public final MilanoProfileSidePresenter y;

    public void MilanoProfileSidePresenter$h(MilanoProfileSidePresenter p0,int p1,int p2,String p3,User p4){
       this.y = p0;
       this.x = p4;
       super(p1, p2, p3);
    }
    public ClientContent$ContentPackage d(ClientContent$ContentPackage p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MilanoProfileSidePresenter$h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.userPackage = this.y.P8(this.x);
       return p0;
    }
}
