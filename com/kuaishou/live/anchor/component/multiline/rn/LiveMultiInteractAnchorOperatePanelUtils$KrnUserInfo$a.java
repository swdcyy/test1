package com.kuaishou.live.anchor.component.multiline.rn.LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo$a;
import java.lang.Object;
import nsd.u;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.anchor.component.multiline.rn.LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.kuaishou.live.anchor.component.multiline.rn.LiveMultiInteractAnchorOperatePanelUtils$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.List;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kuaishou.socket.nano.UserInfos$PicUrl;

public final class LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo$a	// class@000a2c
{

    public void LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo$a(){
       super();
    }
    public void LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo$a(u p0){
       super();
    }
    public final LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo a(UserInfo p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "userInfo");
       obj = new ArrayList();
       UserInfo mHeadUrls = p0.mHeadUrls;
       a.o(mHeadUrls, "userInfo.mHeadUrls");
       int len = mHeadUrls.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = mHeadUrls[i];
          a.o(oobject, "it");
          String cdn = oobject.getCdn();
          a.o(cdn, "it.cdn");
          String url = oobject.getUrl();
          a.o(url, "it.url");
          obj.add(new LiveMultiInteractAnchorOperatePanelUtils$PicUrl(cdn, url));
       }
       UserInfo mId = p0.mId;
       a.o(mId, "userInfo.mId");
       p0 = p0.mName;
       a.o(p0, "userInfo.mName");
       return new LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo(mId, p0, obj);
    }
    public final LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo b(UserInfos$UserInfo p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "userInfo");
       obj = new ArrayList();
       UserInfos$UserInfo headUrls = p0.headUrls;
       a.o(headUrls, "userInfo.headUrls");
       int len = headUrls.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = headUrls[i];
          UserInfos$PicUrl cdn = oobject.cdn;
          a.o(cdn, "it.cdn");
          UserInfos$PicUrl url = oobject.url;
          a.o(url, "it.url");
          obj.add(new LiveMultiInteractAnchorOperatePanelUtils$PicUrl(cdn, url));
       }
       p0 = p0.userName;
       a.o(p0, "userInfo.userName");
       return new LiveMultiInteractAnchorOperatePanelUtils$KrnUserInfo(String.valueOf(p0.userId), p0, obj);
    }
}
