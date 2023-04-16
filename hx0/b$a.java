package hx0.b$a;
import lf3.g;
import hx0.b;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import java.lang.Long;
import o63.d;
import lp3.e;
import lp3.a;
import xp5.g;
import lp3.c;
import com.kwai.framework.model.user.User;
import fg6.a;
import f71.b;
import com.kwai.framework.model.user.UserInfo;
import f71.b$a;
import com.google.gson.Gson;
import vb1.c;
import com.kwai.robust.PatchProxyResult;
import p63.a;
import p63.a$a;
import p63.a$b;
import oa1.a;
import nsd.u;
import lnc.a1;
import oa1.b;
import o63.a;
import com.kuaishou.live.jsbridge.LiveKrnPageKey;
import msd.l;
import lf3.f;

public final class b$a implements g	// class@00279a
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       b$a b;
       String str;
       d uod;
       UserInfo userInfo;
       Object obj = this;
       LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, b$a.class, "1")) {
       }else {
          a.p(obj1, "chatServiceCall");
          b.Z(LiveCommonLogTag.BLIND_DATE, "openChatServicePage");
          b = obj.b;
          LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall sessionId = obj1.sessionId;
          a.o(sessionId, "chatServiceCall.sessionId");
          LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall countDownMil = obj1.countDownMillis;
          LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceCall title = obj1.title;
          a.o(title, "chatServiceCall.title");
          obj1 = obj1.content;
          a.o(obj1, "chatServiceCall.content");
          Objects.requireNonNull(b);
          if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidFourRefs(sessionId, Long.valueOf(countDownMil), title, obj1, b, b.class, "8")) {
             b j = b.j;
             if (j != null) {
                j.L();
             }
             e uoe = b.Po();
             if (uoe != null) {
                c uoc = b.Po().a(g.class);
                a.o(uoc, "serviceManager.getServic¡­eInfoManager::class.java\)");
                User user = uoc.I();
                if (user == null) {
                   str = "";
                }else {
                   userInfo = UserInfo.convertFromQUser(user);
                   a.o(userInfo, "UserInfo.convertFromQUser\(anchorUser\)");
                   str = a.a.q(b.a.a(userInfo));
                }
                String str1 = "userInfo";
                a.o(str, str1);
                c uoc1 = c.class;
                if (PatchProxy.isSupport(uoc1)) {
                   Object[] objArray = new Object[]{uoe,sessionId,Long.valueOf(countDownMil),title,obj1,str};
                   uod = PatchProxy.apply(objArray, null, uoc1, "3");
                   if (uod != PatchProxyResult.class) {
                   label_014f :
                      b.j = uod;
                   }
                }
                a.p(uoe, "liveServiceManager");
                a.p(sessionId, "sessionId");
                a.p(title, "title");
                a.p(obj1, "content");
                a.p(str, str1);
                obj1.e(String.valueOf(a1.a(R.color.arg_RES_7f06060a)));
                obj1.b(0x3f000000);
                obj1.d(16);
                c uoc2 = uoe.a(a.class);
                a.o(uoc2, "liveServiceManager.getSe¡­rvice::class.java\n      \)");
                uod = b.d(b.a, uoc2, LiveKrnPageKey.LiveBlindDateAudienceChatService, a.b.a().a("sessionId", sessionId).a("countDownMillis", String.valueOf((countDownMil / 1000))).a("serviceTitle", title).a("content", obj1).a(str1, str).b(), new a(0, 0, 0, 0, 0, 0, null, false, 0, 511, null), null, 16, null);
                goto label_014f ;
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
