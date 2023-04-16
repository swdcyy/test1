package e02.a;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import nh3.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatRoomInfo;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import nh3.c;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserInfoIdentity;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatLayoutConfig;

public final class a	// class@00207b
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final b a(SCInteractiveChatRoomInfo p0){
       a a;
       ArrayList uArrayList;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       SCInteractiveChatRoomInfo obj = PatchProxy.applyOneRefs(p0, null, uoa, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "scInteractiveChatRoomInfo");
       obj = p0.roomInfo;
       SCInteractiveChatRoomInfo extraInfoPb = p0.extraInfoPb;
       InteractiveChatRoomInfo bizIdentity = obj.bizIdentity;
       InteractiveChatBizIdentity bizId = bizIdentity.bizId;
       InteractiveChatBizIdentity chatId = bizIdentity.chatId;
       InteractiveChatBizIdentity bizType = bizIdentity.bizType;
       a = a.a;
       InteractiveChatRoomInfo userInfo = obj.userInfo;
       a.o(userInfo, "chatRoomInfo.userInfo");
       Objects.requireNonNull(a);
       Object obj1 = PatchProxy.applyOneRefs(userInfo, a, uoa, "2");
       if (obj1 != patchProxyRe) {
          uArrayList = obj1;
       }else {
          ArrayList uArrayList1 = new ArrayList();
          int len = userInfo.length;
          for (int i = 0; i < len; i = i + 1) {
             uArrayList1.add(new c(userInfo[i]));
          }
          uArrayList = uArrayList1;
       }
       b uob = new b(bizId, chatId, bizType, uArrayList, obj.layoutConfig, obj.version, extraInfoPb);
       return p0;
    }
}
