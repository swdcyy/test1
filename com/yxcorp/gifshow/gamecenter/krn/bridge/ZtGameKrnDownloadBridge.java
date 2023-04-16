package com.yxcorp.gifshow.gamecenter.krn.bridge.ZtGameKrnDownloadBridge;
import com.yxcorp.gifshow.gamecenter.krn.base.ZtGameKrnBaseBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams;
import com.kuaishou.krn.base.KrnBridge;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterPlugin;
import js6.b;
import q87.c;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadInfo;
import com.yxcorp.gifshow.gamecenter.krn.bridge.ZtGameKrnDownloadBridge$a;
import yka.c;

public class ZtGameKrnDownloadBridge extends ZtGameKrnBaseBridge	// class@0012b3
{

    public void ZtGameKrnDownloadBridge(ReactApplicationContext p0){
       super(p0);
    }
    public void downloadGame(String p0,Callback p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ZtGameKrnDownloadBridge.class, "3")) {
          return;
       }
       GameCenterDownloadParams gameCenterDo = this.convertJsonToBean(p0, GameCenterDownloadParams.class);
       int i = -1986139969;
       if (gameCenterDo.isGameResource() && !d.a(i).allowDownloadGameResource(gameCenterDo)) {
          Object[] objArray = new Object[0];
          b.c.A("ZtGameKrnDownloadBridge", "refuse download game resource", objArray);
          this.errorCallbackToJS(p1, 1, "refuse download game resource");
          return;
       }else {
          d.a(i).handleGameToBDownload(this.getCurrentActivity(), gameCenterDo);
          this.successCallbackToJS(p1, null);
          return;
       }
    }
    public String getName(){
       return "GameDownloadBridge";
    }
    public void registerGameDownloadListener(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ZtGameKrnDownloadBridge.class, "1")) {
          return;
       }
       GameCenterDownloadParams gameCenterDo = this.convertJsonToBean(p0, GameCenterDownloadParams.class);
       d.a(-1986139969).registerGameCenterDownloadListener(gameCenterDo.mDownloadUrl, gameCenterDo.mDownloadId, new ZtGameKrnDownloadBridge$a(this));
       return;
    }
    public void unregisterGameDownloadListener(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ZtGameKrnDownloadBridge.class, "2")) {
          return;
       }
       d.a(-1986139969).clearDownloadListeners(this.convertJsonToBean(p0, GameCenterDownloadParams.class).mDownloadUrl);
       return;
    }
}
