package com.kuaishou.live.gameinteractive.minigame.data.LiveMiniGameInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.protobuf.gamezone.gameinteractive.gameserver.nano.SCGameInteractionKsmgStatus;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.String;
import java.util.List;

public class LiveMiniGameInfo implements Serializable	// class@001be9
{
    public String appId;
    public String eid;
    public String gameId;
    public String gameName;
    public List iconUrls;
    public String introduction;
    public boolean isOpen;
    public static final long serialVersionUID = 0x446409cde25eb4b2;

    public void LiveMiniGameInfo(){
       super();
    }
    public void LiveMiniGameInfo(SCGameInteractionKsmgStatus p0){
       super();
       int i = 0;
       boolean b = true;
       if (p0.status == b) {
       }else {
          b = false;
       }
       this.isOpen = b;
       this.gameName = p0.gameName;
       this.gameId = p0.gameId;
       this.appId = p0.appId;
       this.introduction = p0.introduction;
       this.iconUrls = new ArrayList();
       p0 = p0.icon;
       int len = p0.length;
       for (; i < len; i = i + 1) {
          object oobject = p0[i];
          this.iconUrls.add(new CDNUrl(oobject.cdn, oobject.url));
       }
       return;
    }
}
