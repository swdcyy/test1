package com.yxcorp.gifshow.gamecenter.api.model.GameCenterJsSendLogParams$ElementPackage;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class GameCenterJsSendLogParams$ElementPackage implements Serializable	// class@00129f
{
    public int mAction;
    public String mAction2;
    public int mIndex;
    public String mName;
    public String mParams;
    public int mStatus;
    public int mType;
    public double mValue;

    public void GameCenterJsSendLogParams$ElementPackage(){
       super();
       this.mAction2 = "";
       this.mParams = "";
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GameCenterJsSendLogParams$ElementPackage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ElementPackage{action="+this.mAction+", name="+this.mName+", mAction2="+this.mAction2+", mParams="+this.mParams+", mValue="+this.mValue+", index="+this.mIndex+", status="+this.mStatus+", type="+this.mType+'}';
    }
}
