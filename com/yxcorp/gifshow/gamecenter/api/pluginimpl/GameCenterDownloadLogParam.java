package com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterDownloadLogParam;
import java.io.Serializable;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class GameCenterDownloadLogParam implements Serializable	// class@0012ab
{
    public String authorId;
    public String gameId;
    public String imeiId;
    public String mFansTopExt;
    public String photoId;
    public String profileId;
    public String refer;
    public String referPhotoId;
    public String sceneId;
    public String userId;
    public static final long serialVersionUID = 0x6099fc652700d0a7;

    public void GameCenterDownloadLogParam(){
       super();
    }
    public JSONObject toElementPackageParam(){
       JSONObject obj = PatchProxy.apply(null, this, GameCenterDownloadLogParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          obj.put("sceneId", this.sceneId);
          obj.put("photoId", this.photoId);
          obj.put("authorId", this.authorId);
          obj.put("userId", this.userId);
          obj.put("imeiOrIdfa", this.imeiId);
          obj.put("refer", this.refer);
          obj.put("gameId", this.gameId);
          obj.put("profileId", this.profileId);
          obj.put("refer_photo_id", this.referPhotoId);
          obj.put("fans_top_ext", this.mFansTopExt);
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
}
