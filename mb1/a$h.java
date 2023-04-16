package mb1.a$h;
import lf3.g;
import mb1.a;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import lf3.f;

public final class a$h implements g	// class@003146
{
    public final a b;

    public void a$h(a p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$h.class, "1")) {
       }else {
          LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos bulletCommen = p0.bulletCommentPushInfo;
          if (bulletCommen != null) {
             int len = bulletCommen.length;
             for (int i = 0; i < len; i = i + 1) {
                this.b.a(bulletCommen[i].userInfo);
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
