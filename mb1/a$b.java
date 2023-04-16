package mb1.a$b;
import lf3.g;
import mb1.a;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.SCLiveConditionRedPackOpened;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.protobuf.livestream.nano.DisplayWinnerUser;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import lf3.f;

public final class a$b implements g	// class@003140
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          SCLiveConditionRedPackOpened displayWinne = p0.displayWinnerUser;
          if (displayWinne != null) {
             int len = displayWinne.length;
             for (int i = 0; i < len; i = i + 1) {
                this.b.a(displayWinne[i].userInfo);
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
