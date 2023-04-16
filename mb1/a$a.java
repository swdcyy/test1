package mb1.a$a;
import lf3.g;
import mb1.a;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveRedPackMessage$SCAudienceRedPackShow;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.LiveRedPackMessage$AudienceRedPack;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import lf3.f;

public final class a$a implements g	// class@00313f
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          LiveRedPackMessage$SCAudienceRedPackShow redPack = p0.redPack;
          if (redPack != null) {
             int len = redPack.length;
             for (int i = 0; i < len; i = i + 1) {
                this.b.a(redPack[i].sendUser);
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
