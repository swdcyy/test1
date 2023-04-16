package com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX$IWXSceneDataObject;
import java.lang.Object;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject$IWXStateJumpInfo;
import android.os.Bundle;
import java.lang.Class;
import java.lang.StringBuilder;
import java.lang.Exception;

public class WXStateSceneDataObject implements SendMessageToWX$IWXSceneDataObject	// class@000f05
{
    public String stateId;
    public WXStateSceneDataObject$IWXStateJumpInfo stateJumpInfo;
    public String stateTitle;
    public String token;

    public void WXStateSceneDataObject(){
       super();
    }
    public boolean checkArgs(){
       WXStateSceneDataObject tstateId = this.stateId;
       if (tstateId != null && tstateId.length() > 0x2800) {
          Log.e("MicroMsg.SDK.WXStateSceneDataObject", "checkArgs fail, stateId is invalid");
          return false;
       }else {
          tstateId = this.stateTitle;
          if (tstateId != null && tstateId.length() > 0x2800) {
             Log.e("MicroMsg.SDK.WXStateSceneDataObject", "checkArgs fail, stateId is invalid");
             return false;
          }else {
             tstateId = this.token;
             if (tstateId != null && tstateId.length() > 0x2800) {
                Log.e("MicroMsg.SDK.WXStateSceneDataObject", "checkArgs fail, stateId is invalid");
                return false;
             }else {
                tstateId = this.stateJumpInfo;
                if (tstateId != null) {
                   return tstateId.checkArgs();
                }
                Log.e("MicroMsg.SDK.WXStateSceneDataObject", "checkArgs fail, statsJumpInfo is null");
                return false;
             }
          }
       }
    }
    public int getJumpType(){
       WXStateSceneDataObject tstateJumpIn = this.stateJumpInfo;
       int i = (tstateJumpIn != null)? tstateJumpIn.type(): 0;
       return i;
    }
    public void serialize(Bundle p0){
       p0.putString("_wxapi_scene_data_state_id", this.stateId);
       p0.putString("_wxapi_scene_data_state_title", this.stateTitle);
       p0.putString("_wxapi_scene_data_state_token", this.token);
       WXStateSceneDataObject tstateJumpIn = this.stateJumpInfo;
       if (tstateJumpIn != null) {
          p0.putString("_wxapi_scene_data_state_jump_info_identifier", tstateJumpIn.getClass().getName());
          this.stateJumpInfo.serialize(p0);
       }
       return;
    }
    public void unserialize(Bundle p0){
       this.stateId = p0.getString("_wxapi_scene_data_state_id");
       this.stateTitle = p0.getString("_wxapi_scene_data_state_title");
       this.token = p0.getString("_wxapi_scene_data_state_token");
       String str = p0.getString("_wxapi_scene_data_state_jump_info_identifier");
       if (str != null) {
          try{
             WXStateSceneDataObject$IWXStateJumpInfo iWXStateJump = Class.forName(str).newInstance();
             this.stateJumpInfo = iWXStateJump;
             iWXStateJump.unserialize(p0);
          }catch(java.lang.Exception e4){
             Log.e("MicroMsg.SDK.WXStateSceneDataObject", "get WXSceneDataObject from bundle failed: unknown ident "+str+", ex = "+e4.getMessage());
          }
       }
    }
}
