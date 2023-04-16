package com.tencent.mm.opensdk.modelbiz.JoinChatroom$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import java.lang.String;
import com.tencent.mm.opensdk.utils.b;
import android.os.Bundle;

public class JoinChatroom$Req extends BaseReq	// class@000e95
{
    public String chatroomNickName;
    public String extMsg;
    public String groupId;

    public void JoinChatroom$Req(){
       this.groupId = "";
    }
    public boolean checkArgs(){
       if (b.b(this.groupId)) {
          return false;
       }
       return true;
    }
    public int getType(){
       return 15;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_wxapi_join_chatroom_group_id", this.groupId);
       p0.putString("_wxapi_join_chatroom_chatroom_nickname", this.chatroomNickName);
       p0.putString("_wxapi_join_chatroom_ext_msg", this.extMsg);
       p0.putString("_wxapi_basereq_openid", this.openId);
    }
}
