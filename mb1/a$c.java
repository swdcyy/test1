package mb1.a$c;
import lf3.g;
import mb1.a;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.SCLiveConditionRedPackRollUserInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import lf3.f;

public final class a$c implements g	// class@003141
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          SCLiveConditionRedPackRollUserInfo rollUser = p0.rollUser;
          if (rollUser != null) {
             int len = rollUser.length;
             for (int i = 0; i < len; i = i + 1) {
                this.b.a(rollUser[i]);
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
