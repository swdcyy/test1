package com.tencent.mm.opensdk.modelbiz.JoinChatroom$Resp;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import android.os.Bundle;
import java.lang.String;

public class JoinChatroom$Resp extends BaseResp	// class@000e96
{
    public String extMsg;

    public void JoinChatroom$Resp(){
       super();
    }
    public void JoinChatroom$Resp(Bundle p0){
       super().fromBundle(p0);
    }
    public boolean checkArgs(){
       return true;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.extMsg = p0.getString("_wxapi_join_chatroom_ext_msg");
    }
    public int getType(){
       return 15;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxapi_join_chatroom_ext_msg", this.extMsg);
    }
}
