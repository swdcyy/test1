package mb1.a;
import java.lang.String;
import hf3.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import mb1.b;
import mb1.a$g;
import mb1.a$f;
import mb1.a$a;
import mb1.a$e;
import mb1.a$c;
import mb1.a$d;
import mb1.a$b;
import mb1.a$h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCFeedPush;
import lf3.g;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import com.kuaishou.livestream.message.nano.LiveRedPackMessage$SCAudienceRedPackShow;
import com.kuaishou.protobuf.livestream.nano.SCLiveConditionRedPackInfo;
import com.kuaishou.protobuf.livestream.nano.SCLiveConditionRedPackRollUserInfo;
import com.kuaishou.protobuf.livestream.nano.SCLiveConditionAudienceRedPackSend;
import com.kuaishou.protobuf.livestream.nano.SCLiveConditionRedPackOpened;
import com.kuaishou.livestream.message.nano.LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kuaishou.socket.nano.UserInfos$EncryptedInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.o5;
import java.util.Objects;
import android.util.LruCache;

public final class a	// class@003147
{
    public b a;
    public final g b;
    public final g c;
    public final g d;
    public final g e;
    public final g f;
    public final g g;
    public final g h;
    public final g i;
    public final a j;

    public void a(String p0,String p1,String p2,a p3){
       a.p(p0, "token");
       a.p(p1, "ivSpec");
       a.p(p2, "verifyKey");
       a.p(p3, "liveLongConnection");
       super();
       this.j = p3;
       this.a = new b(p0, p1, p2);
       a$g og = new a$g(this);
       this.b = og;
       a$f uof = new a$f(this);
       this.c = uof;
       a$a uoa = new a$a(this);
       this.d = uoa;
       a$e uoe = new a$e(this);
       this.e = uoe;
       a$c uoc = new a$c(this);
       this.f = uoc;
       a$d uod = new a$d(this);
       this.g = uod;
       a$b uob = new a$b(this);
       this.h = uob;
       a$h oh = new a$h(this);
       this.i = oh;
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
       }else {
          p3.J(310, LiveStreamMessages$SCFeedPush.class, og, false);
          p3.J(510, SCActionSignal.class, uof, false);
          p3.J(680, LiveRedPackMessage$SCAudienceRedPackShow.class, uoa, false);
          p3.J(735, SCLiveConditionRedPackInfo.class, uoe, false);
          p3.J(737, SCLiveConditionRedPackRollUserInfo.class, uoc, false);
          p3.J(930, SCLiveConditionAudienceRedPackSend.class, uod, false);
          p3.J(738, SCLiveConditionRedPackOpened.class, uob, false);
          p3.J(888, LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos.class, oh, false);
       }
       return;
    }
    public final void a(UserInfos$UserInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       if (p0 != null) {
          UserInfos$UserInfo encryptedInf = p0.encryptedInfo;
          if (encryptedInf != null) {
             if (!TextUtils.x(encryptedInf.encryptedUserName)) {
                UserInfos$EncryptedInfo encryptedUse = encryptedInf.encryptedUserName;
                a.o(encryptedUse, "_encryptInfo.encryptedUserName");
                String str = this.a.b(encryptedUse);
                if (!TextUtils.x(str)) {
                   p0.userName = str;
                }
             }
             if (!TextUtils.x(encryptedInf.encryptedUserId)) {
                UserInfos$EncryptedInfo encryptedUse1 = encryptedInf.encryptedUserId;
                a.o(encryptedUse1, "_encryptInfo.encryptedUserId");
                String str1 = this.a.b(encryptedUse1);
                if (!TextUtils.x(str1)) {
                   p0.userId = o5.d(str1, p0.userId);
                }
             }
          }
       }
       return;
    }
    public final void b(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          this.j.o(310, this.b);
          this.j.o(510, this.c);
          this.j.o(680, this.d);
          this.j.o(735, this.e);
          this.j.o(737, this.f);
          this.j.o(930, this.g);
          this.j.o(738, this.h);
          this.j.o(888, this.i);
       }
       uoa = this.a;
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoid(objArray, uoa, b.class, "3")) {
          uoa.c.evictAll();
       }
       return;
    }
}
