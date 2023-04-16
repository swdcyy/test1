package mb1.a$e;
import lf3.g;
import mb1.a;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.SCLiveConditionRedPackInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import lf3.f;

public final class a$e implements g	// class@003143
{
    public final a b;

    public void a$e(a p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "1")) {
       }else {
          this.b.a(p0.senderInfo);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
