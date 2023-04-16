package mb1.a$d;
import lf3.g;
import mb1.a;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.SCLiveConditionAudienceRedPackSend;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.protobuf.livestream.nano.LiveConditionAudienceRedPackSendInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import lf3.f;

public final class a$d implements g	// class@003142
{
    public final a b;

    public void a$d(a p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
       }else {
          SCLiveConditionAudienceRedPackSend audienceRedP = p0.audienceRedPackSendInfo;
          if (audienceRedP != null) {
             int len = audienceRedP.length;
             for (int i = 0; i < len; i = i + 1) {
                object oobject = audienceRedP[i];
                a$d tb = this.b;
                LiveConditionAudienceRedPackSendInfo senderInfo = (oobject != null)? oobject.senderInfo: null;
                tb.a(senderInfo);
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
