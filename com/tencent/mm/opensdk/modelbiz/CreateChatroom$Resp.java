package com.tencent.mm.opensdk.modelbiz.CreateChatroom$Resp;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import android.os.Bundle;
import java.lang.String;

public class CreateChatroom$Resp extends BaseResp	// class@000e8f
{
    public String extMsg;

    public void CreateChatroom$Resp(){
       super();
    }
    public void CreateChatroom$Resp(Bundle p0){
       super().fromBundle(p0);
    }
    public boolean checkArgs(){
       return true;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.extMsg = p0.getString("_wxapi_create_chatroom_ext_msg");
    }
    public int getType(){
       return 14;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxapi_create_chatroom_ext_msg", this.extMsg);
    }
}
