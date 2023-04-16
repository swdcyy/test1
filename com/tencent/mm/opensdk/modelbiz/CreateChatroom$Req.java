package com.tencent.mm.opensdk.modelbiz.CreateChatroom$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import java.lang.String;
import com.tencent.mm.opensdk.utils.b;
import android.os.Bundle;

public class CreateChatroom$Req extends BaseReq	// class@000e8e
{
    public String chatroomName;
    public String chatroomNickName;
    public String extMsg;
    public String groupId;

    public void CreateChatroom$Req(){
       this.groupId = "";
    }
    public boolean checkArgs(){
       if (b.b(this.groupId)) {
          return false;
       }
       return true;
    }
    public int getType(){
       return 14;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxapi_create_chatroom_group_id", this.groupId);
       p0.putString("_wxapi_create_chatroom_chatroom_name", this.chatroomName);
       p0.putString("_wxapi_create_chatroom_chatroom_nickname", this.chatroomNickName);
       p0.putString("_wxapi_create_chatroom_ext_msg", this.extMsg);
       p0.putString("_wxapi_basereq_openid", this.openId);
    }
}
