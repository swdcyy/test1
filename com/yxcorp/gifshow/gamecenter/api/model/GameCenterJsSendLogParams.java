package com.yxcorp.gifshow.gamecenter.api.model.GameCenterJsSendLogParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;

public class GameCenterJsSendLogParams implements Serializable	// class@0012a1
{
    public int mAction;
    public String mCallback;
    public GameCenterJsSendLogParams$ContentPackage mContentPackage;
    public GameCenterJsSendLogParams$ElementPackage mElementPackage;
    public String mEvent;
    public int mType;
    public GameCenterJsSendLogParams$UrlPackage mUrlPackage;

    public void GameCenterJsSendLogParams(){
       super();
    }
    public boolean isClickEvent(){
       Object obj = PatchProxy.apply(null, this, GameCenterJsSendLogParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("click").equals(this.mEvent);
    }
    public boolean isShowEvent(){
       Object obj = PatchProxy.apply(null, this, GameCenterJsSendLogParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("show").equals(this.mEvent);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GameCenterJsSendLogParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GameCenterJsSendLogParams{mEvent="+this.mEvent+", mType="+this.mType+", mAction="+this.mAction+", mUrlPackage="+this.mUrlPackage+", mElementPackage="+this.mElementPackage+", mContentPackage="+this.mContentPackage+", mCallback="+this.mCallback+'}';
    }
}
