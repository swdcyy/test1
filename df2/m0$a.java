package df2.m0$a;
import bb1.d;
import df2.m0;
import java.lang.Object;
import java.lang.Throwable;
import com.kwai.framework.model.live.LiveAdminPrivilege$PrivilegeType;
import bb1.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.framework.model.user.UserProfile;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import bb1.f;
import java.lang.Integer;
import java.lang.Long;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import k2b.u1;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.lang.Number;
import erd.g;
import com.kuaishou.live.core.show.profilecard.b;

public class m0$a implements d	// class@0024fc
{
    public final m0 a;

    public void m0$a(m0 p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,boolean p1,Throwable p2,LiveAdminPrivilege$PrivilegeType p3){
       c.g(this, p0, p1, p2, p3);
    }
    public void b(boolean p0,Throwable p1){
       m0$a uoa = m0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "7")) {
          return;
       }
       if (p0) {
          m0$a ta = this.a;
          ta.X9(ta.x.getUserProfile(), LiveApiParams$AssistantType.AUDIENCE);
       }else {
          this.a.c9(p1);
       }
       return;
    }
    public void c(boolean p0,Throwable p1){
       m0$a uoa = m0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "6")) {
          return;
       }
       if (p0) {
          LiveApiParams$AssistantType aDMIN = LiveApiParams$AssistantType.ADMIN;
          this.a.x.setTargetUserAssType(aDMIN);
          m0$a ta = this.a;
          ta.X9(ta.x.getUserProfile(), aDMIN);
       }else {
          this.a.c9(p1);
       }
       return;
    }
    public void d(boolean p0,Throwable p1){
       m0$a uoa = m0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "4")) {
          return;
       }
       if (p0) {
          m0$a ta = this.a;
          ta.X9(ta.x.getUserProfile(), LiveApiParams$AssistantType.AUDIENCE);
       }else {
          this.a.c9(p1);
       }
       return;
    }
    public void e(String p0,boolean p1,Throwable p2,int p3,boolean p4,long p5){
       UserProfile mProfile;
       ClientEvent$ElementPackage uElementPack;
       ClientContent$ContentPackage uContentPack;
       ClientContent$LiveStreamPackage liveStreamPa1;
       JsonObject jsonObject;
       ClientContent$ContentPackage uContentPack1;
       Object obj = this;
       m0$a uoa = m0$a.class;
       f uof = f.class;
       int i = 1;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2,Integer.valueOf(p3),Boolean.valueOf(p4),Long.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, obj, uoa, "2")) {
             return;
          }
       }
       String str = "administrator_type";
       String str1 = "MUTE_GRADE_SELECT_CARD";
       if (p3 == i) {
          if (obj.a.x.getOriginUserAssType() == LiveApiParams$AssistantType.PUSHER) {
             mProfile = obj.a.x.getUserProfile().mProfile;
             ClientContent$LiveStreamPackage liveStreamPa = obj.a.m9();
             if (!PatchProxy.applyVoidTwoRefs(mProfile, liveStreamPa, null, uof, "10")) {
                uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = str1;
                uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = liveStreamPa;
                uContentPack.userPackage = f.a(mProfile);
                u1.u0(9, uElementPack, uContentPack);
             }
          }else {
             UserProfile mProfile1 = obj.a.x.getUserProfile().mProfile;
             String str2 = obj.a.h9();
             liveStreamPa1 = obj.a.m9();
             if (!PatchProxy.applyVoidThreeRefs(mProfile1, str2, liveStreamPa1, 0, f.class, "16")) {
                ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
                uElementPack1.action2 = str1;
                jsonObject = new JsonObject();
                jsonObject.c0(str, str2);
                uElementPack1.params = jsonObject.toString();
                uContentPack1 = new ClientContent$ContentPackage();
                uContentPack1.liveStreamPackage = liveStreamPa1;
                uContentPack1.userPackage = f.a(mProfile1);
                u1.u0(9, uElementPack1, uContentPack1);
             }
          }
       }else if(p1){
          obj.a.Y9(i);
       }
       if (obj.a.x.getOriginUserAssType() == LiveApiParams$AssistantType.PUSHER) {
          mProfile = obj.a.x.getUserProfile().mProfile;
          liveStreamPa1 = obj.a.m9();
          if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidThreeRefs(Long.valueOf(p5), mProfile, liveStreamPa1, null, f.class, "11")) {
             uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = str1;
             jsonObject = new JsonObject();
             jsonObject.a0("mute_duration", Long.valueOf(p5));
             uElementPack.params = jsonObject.toString();
             uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa1;
             uContentPack.userPackage = f.a(mProfile);
             u1.u(i, uElementPack, uContentPack);
          }
       }else {
          UserProfile mProfile2 = obj.a.x.getUserProfile().mProfile;
          String str3 = obj.a.h9();
          ClientContent$LiveStreamPackage liveStreamPa2 = obj.a.m9();
          if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidFourRefs(mProfile2, str3, Long.valueOf(p5), liveStreamPa2, null, f.class, "17")) {
             uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = str1;
             jsonObject = new JsonObject();
             jsonObject.c0(str, str3);
             jsonObject.a0("mute_duration", Long.valueOf(p5));
             uElementPack.params = jsonObject.toString();
             uContentPack1 = new ClientContent$ContentPackage();
             uContentPack1.liveStreamPackage = liveStreamPa2;
             uContentPack1.userPackage = f.a(mProfile2);
             u1.u(i, uElementPack, uContentPack1);
          }
       }
    label_019d :
       return;
    }
    public void f(boolean p0,Throwable p1){
       m0$a uoa = m0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "8")) {
          return;
       }
       if (!p0) {
          this.a.c9(p1);
       }
       return;
    }
    public void g(boolean p0,Throwable p1){
       m0$a uoa = m0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       if (p0) {
          this.a.E9();
       }else {
          this.a.c9(p1);
       }
       return;
    }
    public void h(boolean p0,Throwable p1){
       m0$a uoa = m0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "5")) {
          return;
       }
       if (p0) {
          LiveApiParams$AssistantType sUPER_ADMIN = LiveApiParams$AssistantType.SUPER_ADMIN;
          this.a.x.setTargetUserAssType(sUPER_ADMIN);
          m0$a ta = this.a;
          ta.X9(ta.x.getUserProfile(), sUPER_ADMIN);
       }else {
          this.a.c9(p1);
       }
       return;
    }
    public void i(String p0,boolean p1,Throwable p2){
       if (PatchProxy.isSupport(m0$a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, m0$a.class, "3")) {
          return;
       }
       if (p1) {
          this.a.Y9(false);
       }else {
          b.f("permitComment failed");
       }
       return;
    }
}
