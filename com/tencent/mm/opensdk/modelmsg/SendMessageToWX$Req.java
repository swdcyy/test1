package com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import android.os.Bundle;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXFileObject;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX$IWXSceneDataObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$Builder;
import java.lang.Class;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.Exception;

public class SendMessageToWX$Req extends BaseReq	// class@000ee4
{
    public WXMediaMessage message;
    public int scene;
    public SendMessageToWX$IWXSceneDataObject sceneDataObject;
    public String userOpenId;

    public void SendMessageToWX$Req(){
       super();
    }
    public void SendMessageToWX$Req(Bundle p0){
       super().fromBundle(p0);
    }
    public boolean checkArgs(){
       String str1;
       SendMessageToWX$Req tmessage = this.message;
       String str = "MicroMsg.SDK.SendMessageToWX.Req";
       boolean b = false;
       if (tmessage == null) {
          str1 = "checkArgs fail ,message is null";
       }else if(tmessage.mediaObject.type() == 6 && this.scene == 2){
          this.message.mediaObject.setContentLengthLimit(0x1900000);
       }
       tmessage = this.scene;
       BaseReq uBaseReq = 3;
       if (tmessage == uBaseReq && this.userOpenId == null) {
          str1 = "Send specifiedContact userOpenId can not be null.";
       }else if(tmessage == uBaseReq && this.openId == null){
          str1 = "Send specifiedContact openid can not be null.";
       }else if(tmessage == 4){
          if (this.sceneDataObject == null) {
             str1 = "checkArgs fail, sceneDataObject is null";
          }else if(this.message.getType() == 1){
             return this.sceneDataObject.checkArgs();
          }else if(this.message.checkArgs() && this.sceneDataObject.checkArgs()){
             b = true;
          }
          return b;
       }else {
          return this.message.checkArgs();
       }
       Log.e(str, str1);
       return b;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.message = WXMediaMessage$Builder.fromBundle(p0);
       this.scene = p0.getInt("_wxapi_sendmessagetowx_req_scene");
       this.userOpenId = p0.getString("_wxapi_sendmessagetowx_req_use_open_id");
       String str = p0.getString("_scene_data_object_identifier");
       if (str != null) {
          try{
             SendMessageToWX$IWXSceneDataObject iWXSceneData = Class.forName(str).newInstance();
             this.sceneDataObject = iWXSceneData;
             iWXSceneData.unserialize(p0);
          }catch(java.lang.Exception e4){
             Log.e("MicroMsg.SDK.SendMessageToWX.Req", "get WXSceneDataObject from bundle failed: unknown ident "+str+", ex = "+e4.getMessage());
          }
       }
    }
    public int getType(){
       return 2;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putAll(WXMediaMessage$Builder.toBundle(this.message));
       p0.putInt("_wxapi_sendmessagetowx_req_scene", this.scene);
       p0.putInt("_wxapi_sendmessagetowx_req_media_type", this.message.getType());
       p0.putString("_wxapi_sendmessagetowx_req_use_open_id", this.userOpenId);
       SendMessageToWX$Req tsceneDataOb = this.sceneDataObject;
       if (tsceneDataOb != null) {
          p0.putString("_scene_data_object_identifier", tsceneDataOb.getClass().getName());
          this.sceneDataObject.serialize(p0);
       }
       return;
    }
}
