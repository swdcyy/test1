package bz0.f;
import bz0.g;
import cz0.k;
import cz0.b;
import cz0.g;
import cz0.c;
import cz0.l;
import cz0.j;
import java.lang.Object;
import com.yxcorp.gifshow.models.Gift;
import t02.a0;
import f92.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.gift.GiftMessage;
import wj1.a;
import p91.m;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import bb1.o;
import java.lang.Enum;
import com.kuaishou.live.basic.model.QLiveMessage;
import ht5.b;
import java.lang.Throwable;
import ht5.d;
import java.util.Objects;
import java.util.Map;
import lm1.i;
import com.kwai.framework.model.user.User;
import lm1.f;
import com.kwai.framework.model.user.UserInfo;
import bz0.e;
import k2b.u1;
import wo1.a;

public class f	// class@000436
{
    public static final g a;
    public static final g b;

    static {
       g og = new g();
       f.a = og;
       og.a(new k());
       og.a(new g());
       og.a(new c());
       og = new g();
       f.b = og;
       og.a(new l());
       og.a(new j());
       og.a(new c());
    }
    public void f(){
       super();
    }
    public static b a(Gift p0,int p1,int p2,int p3,a0 p4,boolean p5,boolean p6,int p7){
       int[] obj;
       object oobject = p0;
       object oobject1 = p4;
       f uof = f.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),oobject1,Boolean.valueOf(p5),Boolean.valueOf(p6),Integer.valueOf(p7)};
          obj = PatchProxy.apply(objArray, null, uof, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       GiftMessage giftMessage = GiftMessage.createSelfGiftMessage(oobject.mId, oobject.mGiftType, p1, p2, p3);
       obj = a.a(giftMessage);
       giftMessage.mNewGiftSlotStyle = obj[i1];
       giftMessage.mDisplayDuration = obj[i];
       b uob = new b(oobject1.Z2.getLiveStreamId(), giftMessage, p0, p1, p5, p6, p7);
       v9.b.mLiveAssistantType = oobject1.b2.d(QCurrentUser.me().getId()).ordinal();
       return v9;
    }
    public static boolean b(b p0,Throwable p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0 = p0.n;
       boolean b = (p0 != null && p0.onError(p1))? true: false;
       return b;
    }
    public static void c(b p0,int p1,a0 p2,boolean p3){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, Boolean.valueOf(p3), null, f.class, "1")) {
          return;
       }
       String str = "key_send_gift_context";
       Objects.requireNonNull(p0);
       User obj = PatchProxy.applyOneRefs(str, p0, b.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = p0.p.get(str);
       }
       Object obj1 = null;
       if (obj instanceof i) {
          obj1 = obj;
          obj = p2.Z2.I();
          if (obj != null) {
             obj1.b().q(UserInfo.convertFromQUser(obj));
          }
       }
       e uoe = new e(obj1, p0, p2, u1.f(), p3);
       if (p1 == 2) {
          f.b.b(obj1);
       }else {
          f.a.b(obj1);
       }
       a0 w2 = p2.W2;
       if (w2 != null) {
          w2.a();
       }
       return;
    }
}
