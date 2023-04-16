package com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.Friend;
import java.io.Serializable;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class Friend implements Serializable	// class@000a74
{
    public String localFile;
    public final String nickName;
    public final String userAvatar;
    public final String userId;
    public final String userName;

    public void Friend(){
       super(null, null, null, null, 15, null);
    }
    public void Friend(String p0,String p1,String p2,String p3){
       a.p(p0, "userId");
       super();
       this.userId = p0;
       this.userName = p1;
       this.userAvatar = p2;
       this.nickName = p3;
    }
    public void Friend(String p0,String p1,String p2,String p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = "";
       }
       if (p4 & 0x02) {
          p1 = "";
       }
       if (p4 & 0x04) {
          p2 = "";
       }
       if (p4 & 0x08) {
          p3 = "";
       }
       super(p0, p1, p2, p3);
       return;
    }
    public final String getLocalFile(){
       return this.localFile;
    }
    public final String getNickName(){
       return this.nickName;
    }
    public final String getUserAvatar(){
       return this.userAvatar;
    }
    public final String getUserId(){
       return this.userId;
    }
    public final String getUserName(){
       return this.userName;
    }
    public final void setLocalFile(String p0){
       this.localFile = p0;
    }
}
