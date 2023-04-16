package com.kuaishou.live.core.voiceparty.micseats.a$m;
import com.kuaishou.live.core.voiceparty.micseats.widget.action.ActionsController$b;
import com.kuaishou.live.core.voiceparty.micseats.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import xs2.h;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import kotlin.jvm.internal.a;
import pt2.b;
import com.kwai.framework.model.user.UserInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import bb1.o;
import qs2.e;
import java.lang.Enum;

public final class a$m implements ActionsController$b	// class@00156f
{
    public final a a;

    public void a$m(a p0){
       this.a = p0;
       super();
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, a$m.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.b();
    }
    public boolean c(int p0){
       boolean b;
       a$m om = a$m.class;
       if (PatchProxy.isSupport(om)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, om, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       switch (p0){
           case 28:
             b = this.a.l.g();
             break;
           case 29:
           case 30:
             b = this.a.l.h();
             break;
           default:
             b = false;
       }
       return b;
    }
    public boolean d(VoicePartyMicSeatData p0){
       b a;
       VoicePartyMicSeatData obj = PatchProxy.applyOneRefs(p0, this, a$m.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "clickingMicSeatData");
       obj = p0.mMicUser;
       boolean b = true;
       if (obj != null) {
          a.m(obj);
          if (obj.a != null) {
             obj = p0.mMicUser;
             a.m(obj);
             if (!TextUtils.isEmpty(obj.a.mId)) {
                obj = p0.mMicUser;
                a.m(obj);
                QCurrentUser qCurrentUser = QCurrentUser.me();
                String str = "QCurrentUser.me\(\)";
                a.o(qCurrentUser, str);
                if (!a.g(obj.a.mId, qCurrentUser.getId())) {
                   qCurrentUser = QCurrentUser.me();
                   a.o(qCurrentUser, str);
                   LiveApiParams$AssistantType uAssistantTy = this.a.E.d(qCurrentUser.getId());
                   a.o(uAssistantTy, "adminService.getAssistan¡­ype\(QCurrentUser.me\(\).id\)");
                   p0 = p0.mMicUser;
                   a.m(p0);
                   a = p0.a;
                   a.o(a, "clickingMicSeatData.mMicUser!!.mUser");
                   LiveApiParams$AssistantType uAssistantTy1 = LiveApiParams$AssistantType.fromInt(a.getAssistantType());
                   a.o(uAssistantTy1, "LiveApiParams.AssistantT¡­er!!.mUser.assistantType\)");
                   if (uAssistantTy != null && uAssistantTy1 != null) {
                      int i = e.a[uAssistantTy.ordinal()];
                      if (i != b) {
                         if (i != 2) {
                            if (i == 3 && uAssistantTy1 != LiveApiParams$AssistantType.AUDIENCE) {
                            }
                         }else if(uAssistantTy1 == LiveApiParams$AssistantType.ADMIN || uAssistantTy1 == LiveApiParams$AssistantType.AUDIENCE){
                         }
                      }
                   }
                }
             }
          }
       }
       return b;
    }
}
