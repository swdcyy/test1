package ae1.d;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserInfoIdentity;
import java.lang.Object;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserInfo;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class d	// class@000068
{
    public UserInfo a;
    public String b;
    public int c;

    public void d(InteractiveChatUserInfoIdentity p0){
       super();
       this.b = p0.sessionId;
       this.c = p0.mediaType;
       this.a = UserInfo.convertFromProto(p0.userInfo);
    }
    public void d(String p0,int p1,UserInfo p2){
       super();
       this.b = p0;
       this.c = p1;
       this.a = p2;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "InteractiveChatUserInfoIdentityExt{userInfo="+this.a+", sessionId=\'"+this.b+'''+", mediaType="+this.c+'}';
    }
}
