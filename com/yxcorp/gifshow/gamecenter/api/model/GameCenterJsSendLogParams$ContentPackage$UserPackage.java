package com.yxcorp.gifshow.gamecenter.api.model.GameCenterJsSendLogParams$ContentPackage$UserPackage;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class GameCenterJsSendLogParams$ContentPackage$UserPackage implements Serializable	// class@00129d
{
    public int mAccountType;
    public String mAvatarStatus;
    public String mIdentity;
    public int mIndex;
    public String mKwaiId;
    public String mParams;
    public boolean mPromotionTag;
    public static final long serialVersionUID = 0x310426b18e9c6806;

    public void GameCenterJsSendLogParams$ContentPackage$UserPackage(){
       super();
       this.mIdentity = "";
       this.mKwaiId = "";
       this.mParams = "";
       this.mAvatarStatus = "";
    }
    public ClientContent$UserPackage toUserPackage(){
       ClientContent$UserPackage obj = PatchProxy.apply(null, this, GameCenterJsSendLogParams$ContentPackage$UserPackage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$UserPackage();
       obj.identity = this.mIdentity;
       obj.kwaiId = this.mKwaiId;
       obj.index = this.mIndex;
       obj.params = this.mParams;
       obj.promotionTag = this.mPromotionTag;
       obj.accountType = this.mAccountType;
       obj.avatarStatus = this.mAvatarStatus;
       return obj;
    }
}
