package hm2.i;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.WealthHighGradeEnterRoom;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserInfo;

public class i	// class@002dd5
{
    public UserInfo a;
    public int b;
    public LiveAudienceState c;
    public int d;

    public void i(){
       super();
    }
    public void i(WealthHighGradeEnterRoom p0){
       super();
       WealthHighGradeEnterRoom senderState = p0.senderState;
       int i = (senderState == null)? 0: senderState.assistantType;
       this.a = UserInfo.convertFromProto(p0.user, i);
       senderState = p0.senderState;
       this.b = senderState.wealthGrade;
       this.d = p0.displayType;
       this.c = senderState;
       return;
    }
}
