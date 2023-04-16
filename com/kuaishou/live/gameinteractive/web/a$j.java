package com.kuaishou.live.gameinteractive.web.a$j;
import erd.o;
import com.kuaishou.live.gameinteractive.web.a;
import java.util.Set;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.gameinteractive.web.model.GameWebLiveInfo;
import com.kuaishou.live.gameinteractive.web.model.GameWebLiveInfo$GameWebRoomInfo;
import t02.a0;
import p91.m;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.live.gameinteractive.web.model.GameWebLiveInfo$GameWebAnchorInfo;
import com.kwai.framework.model.user.User;
import com.kuaishou.live.gameinteractive.web.model.GameWebLiveInfo$GameWebUserInfo;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Integer;
import com.kuaishou.live.gameinteractive.web.model.GameWebLiveInfo$GameWebHostInfo;
import o56.a;
import lnc.l1;
import com.kuaishou.live.gameinteractive.auth.model.GameLiveAuthPermissionException;

public class a$j implements o	// class@001c03
{
    public final boolean b;
    public final Set c;
    public final a d;

    public void a$j(a p0,boolean p1,Set p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public Object apply(Object p0){
       GameWebLiveInfo gameWebLiveI = PatchProxy.applyOneRefs(p0, this, a$j.class, "1");
       if (gameWebLiveI != PatchProxyResult.class) {
       }else if(p0.booleanValue()){
          gameWebLiveI = new GameWebLiveInfo();
          p0 = new GameWebLiveInfo$GameWebRoomInfo();
          p0.liveStreamId = this.d.p.Z2.getLiveStreamId();
          a0 e = this.d.p.e;
          QLivePlayConfig mSubType = (e != null)? e.mSubType: 0;
          p0.subType = mSubType;
          gameWebLiveI.roomInfo = p0;
          p0 = new GameWebLiveInfo$GameWebAnchorInfo();
          User user = this.d.p.Z2.I();
          if (user != null && this.b != null) {
             p0.anchorUserId = user.mId;
             p0.anchorUserName = user.mName;
             gameWebLiveI.anchorInfo = p0;
          }
          p0 = new GameWebLiveInfo$GameWebUserInfo();
          if (QCurrentUser.me() != null) {
             if (this.c.contains(Integer.valueOf(1))) {
                p0.nick = QCurrentUser.me().getName();
             }
             if (this.c.contains(Integer.valueOf(2))) {
                p0.avatar = QCurrentUser.me().getAvatar();
             }
             if (this.c.contains(Integer.valueOf(3))) {
                p0.gender = QCurrentUser.me().getSex();
             }
             if (this.b != null) {
                p0.uid = QCurrentUser.me().getId();
             }
             gameWebLiveI.userInfo = p0;
          }
          p0 = new GameWebLiveInfo$GameWebHostInfo();
          p0.hostType = a.A;
          String str = (l1.a())? "horizontal": "vertical";
          p0.layout = str;
          p0.version = a.m;
          gameWebLiveI.hostInfo = p0;
          this.d.V8(gameWebLiveI);
       }else {
          throw new GameLiveAuthPermissionException();
       }
       return gameWebLiveI;
    }
}
