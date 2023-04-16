package com.yxcorp.gifshow.gamecenter.api.model.GameCenterJsSendLogParams$ContentPackage;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterJsSendLogParams$ContentPackage$UserPackage;
import java.lang.StringBuilder;

public class GameCenterJsSendLogParams$ContentPackage implements Serializable	// class@00129e
{
    public GameCenterJsSendLogParams$ContentPackage$UserPackage mUserPackage;
    public static final long serialVersionUID = 0x8f8525666375478d;

    public void GameCenterJsSendLogParams$ContentPackage(){
       super();
    }
    public ClientContent$ContentPackage toClientContent(){
       Object[] objArray = null;
       ClientContent$ContentPackage obj = PatchProxy.apply(objArray, this, GameCenterJsSendLogParams$ContentPackage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       GameCenterJsSendLogParams$ContentPackage tmUserPackag = this.mUserPackage;
       if (tmUserPackag != null) {
          objArray = tmUserPackag.toUserPackage();
       }
       obj.userPackage = objArray;
       return obj;
    }
    public String toString(){
       StringBuilder obj = PatchProxy.apply(null, this, GameCenterJsSendLogParams$ContentPackage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "ContentPackage{userPackage=";
       GameCenterJsSendLogParams$ContentPackage tmUserPackag = this.mUserPackage;
       if (tmUserPackag == null) {
          tmUserPackag = "NULL";
       }
       return obj+tmUserPackag+'}';
    }
}
