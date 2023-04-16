package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.NasaSidebarFeedPresenter$d;
import p1a.a$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.NasaSidebarFeedPresenter;
import java.lang.String;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import im8.f;
import java.lang.Boolean;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.utility.TextUtils;

public class NasaSidebarFeedPresenter$d extends a$a	// class@0017f6
{
    public final User x;
    public final NasaSidebarFeedPresenter y;

    public void NasaSidebarFeedPresenter$d(NasaSidebarFeedPresenter p0,int p1,int p2,String p3,User p4){
       this.y = p0;
       this.x = p4;
       super(p1, p2, p3);
    }
    public ClientContent$ContentPackage d(ClientContent$ContentPackage p0){
       NasaSidebarFeedPresenter obj = PatchProxy.applyOneRefsWithListener(p0, this, NasaSidebarFeedPresenter$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.userPackage = this.y.P8(this.x);
       if (this.y.c1.get().booleanValue()) {
          obj = this.y.d1;
          if (obj != null) {
             AvatarInfoResponse mPhoto = obj.mPhoto;
             if (mPhoto != null) {
                ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
                liveStreamPa.identity = TextUtils.k(mPhoto.getLiveStreamId());
                p0.liveStreamPackage = liveStreamPa;
             }
          }
       }
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter$d.class, "1");
       return p0;
    }
}
