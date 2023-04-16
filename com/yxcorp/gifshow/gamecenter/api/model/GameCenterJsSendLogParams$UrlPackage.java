package com.yxcorp.gifshow.gamecenter.api.model.GameCenterJsSendLogParams$UrlPackage;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class GameCenterJsSendLogParams$UrlPackage implements Serializable	// class@0012a0
{
    public int mPage;
    public String mPage2;
    public String mParams;

    public void GameCenterJsSendLogParams$UrlPackage(){
       super();
       this.mParams = "";
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GameCenterJsSendLogParams$UrlPackage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UrlPackage{page="+this.mPage+", page2="+this.mPage2+", params="+this.mParams+'}';
    }
}
