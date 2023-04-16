package mp1.a$a;
import fh3.d;
import mp1.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import lp1.d;
import fh3.c;
import java.lang.Throwable;
import java.lang.Boolean;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import be1.k;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserInfoIdentity;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatCall;
import mp1.c;
import fq1.b;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonElement;
import com.google.gson.c;
import com.google.gson.JsonObject;
import wp1.c;
import com.kuaishou.live.basic.model.StreamType;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;
import mp1.b;
import rd1.d;
import lp1.b;

public final class a$a implements d	// class@0031d9
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(int p0,String p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       a.p(p1, "targetUserId");
       if (p0 == 1) {
          this.a.l.g();
       }
       return;
    }
    public void b(int p0,String p1,int p2,int p3){
       c.b(this, p0, p1, p2, p3);
    }
    public void c(int p0,String p1,boolean p2,Throwable p3){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), p3, this, a$a.class, "3")) {
          return;
       }
       a.p(p1, "targetUserId");
       if (p0 == 1) {
          b.d0(LiveCommonLogTag.NEW_MULTI_CHAT, "ChatOnInvite onAcceptResponse", "targetUserId", p1, "success", Boolean.valueOf(p2));
          if (!p2) {
             k.b("n/live/interactiveChat/accept", p3);
          }
       }
       return;
    }
    public void d(int p0,InteractiveChatUserInfoIdentity p1){
       c.d(this, p0, p1);
    }
    public void e(int p0,String p1,SCInteractiveChatCall p2){
       object this;
       SCInteractiveChatCall extraInfo;
       boolean b;
       c b1;
       c uoc = c.class;
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, a$a.class, "1")) {
          return;
       }
       a.p(p1, "targetUserId");
       a.p(p2, "callMsg");
       LiveCommonLogTag nEW_MULTI_CH = LiveCommonLogTag.NEW_MULTI_CHAT;
       b.c0(nEW_MULTI_CH, "ChatOnInvite signal", "extraInfo", p2.extraInfo);
       int i = 1;
       if (p0 == i && b.e(p2.extraInfo)) {
          b.Z(nEW_MULTI_CH, "ChatOnInvite chatSignal");
          SCInteractiveChatCall guest = p2.guest;
          a.o(guest, "callMsg.guest");
          int len = guest.length;
          int i1 = 0;
          while (true) {
             if (i1 < len) {
                this = guest[i1];
                QCurrentUser mE = QCurrentUser.ME;
                a.o(mE, "QCurrentUser.ME");
                if (a.g(String.valueOf(this.userInfo.userId), mE.getId())) {
                label_006f :
                   if (this != null) {
                      b.Z(LiveCommonLogTag.NEW_MULTI_CHAT, "ChatOnInvite chatSignal find self");
                      a$a ta = this.a;
                      extraInfo = p2.extraInfo;
                      a.o(extraInfo, "callMsg.extraInfo");
                      InteractiveChatUserInfoIdentity mediaType = this.mediaType;
                      Objects.requireNonNull(ta);
                      if (PatchProxy.isSupport(a.class)) {
                         b = PatchProxy.applyTwoRefs(extraInfo, Integer.valueOf(mediaType), ta, a.class, "7");
                         if (b != PatchProxyResult.class) {
                         }else {
                            try{
                               b1 = new c();
                               JsonElement jsonElement = c.d(extraInfo);
                               a.o(jsonElement, "JsonParser.parseString\(extraInfo\)");
                               JsonObject jsonObject = jsonElement.r();
                               mE = QCurrentUser.me();
                               a.o(mE, "QCurrentUser.me\(\)");
                               JsonElement jsonElement1 = jsonObject.m0("allowVideo").e0(mE.getId());
                               a.o(jsonElement1, "jsonObject.getAsJsonObje¡­o\"\)[QCurrentUser.me\(\).id]");
                               b1.f(jsonElement1.d());
                               jsonElement1 = jsonObject.e0("source");
                               a.o(jsonElement1, "jsonObject[\"source\"]");
                               boolean b2 = (jsonElement1.p() == i)? true: false;
                               b1.b = b2;
                               jsonElement = jsonObject.e0("autoAccept");
                               a.o(jsonElement, "jsonObject[\"autoAccept\"]");
                               b1.c = jsonElement.d();
                            }catch(java.lang.Exception e2){
                               b.I(LiveCommonLogTag.NEW_MULTI_CHAT, "OnInvite getOnInviteExtra", e2);
                            }
                            b1.g(mediaType);
                            if (mediaType == null) {
                               ta = ta.l.V0();
                               if (!b1.a() || (ta != StreamType.VIDEO.toInt() && ta != StreamType.LINE_LIVE.toInt())) {
                                  i = false;
                               }
                               b1.f(i);
                            }else if(2 == mediaType){
                               i = false;
                            }
                            b1.f(i);
                         }
                      }else {
                         goto label_009e ;
                      }
                      Objects.requireNonNull(b);
                      String str = "<set-?>";
                      if (!PatchProxy.applyVoidOneRefs(p1, b, uoc, "1")) {
                         a.p(p1, str);
                         b.e = p1;
                      }
                      InteractiveChatBizIdentity chatId = p2.bizIdentity.chatId;
                      if (chatId == null) {
                         chatId = "";
                      }
                      if (!PatchProxy.applyVoidOneRefs(chatId, b, uoc, "2")) {
                         a.p(chatId, str);
                         b.f = chatId;
                      }
                      b.g = (int)(p2.countdownMs / (long)1000);
                      ta = this.a;
                      Objects.requireNonNull(ta);
                      if (!PatchProxy.applyVoidOneRefs(b, ta, a.class, "3")) {
                         b.c0(LiveCommonLogTag.NEW_MULTI_CHAT, "ChatOnInvite received invited signal", "onInviteExtra", b);
                         if (b.c != null) {
                            ta.V2(b);
                         }else if(PatchProxy.applyVoidOneRefs(b, ta, a.class, "6")){
                            ta.l.m(b, new b(ta, b));
                         }
                      }
                      if (!b.c()) {
                         this.a.m.Y1();
                         break ;
                      }
                   }
                }else {
                   i1 = i1 + 1;
                }
             }else {
                this = null;
                goto label_006f ;
             }
          }
       }
       return;
    }
    public void f(int p0,String p1,boolean p2,Throwable p3,boolean p4){
       c.f(this, p0, p1, p2, p3, p4);
    }
}
