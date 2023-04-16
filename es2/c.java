package es2.c;
import ds2.d;
import qu2.a;
import com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager;
import co2.f2;
import com.kuaishou.live.core.voiceparty.b;
import bb1.o;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import es2.c$a;
import es2.c$d;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import androidx.lifecycle.LiveData;
import yh3.a;
import es2.c$c;
import es2.c$b;
import zo2.l;
import co2.r;
import bb1.o$a;
import bb1.o$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import yx2.d;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import com.kwai.framework.model.live.LiveAdminPrivilege;

public final class c extends d	// class@0027d1
{
    public final o$a i;
    public final o$b j;
    public final LiveData k;
    public final c$c l;
    public final c$b m;
    public final a n;
    public final AudienceVoicePartyManager o;
    public final f2 p;
    public final b q;
    public final o r;

    public void c(a p0,AudienceVoicePartyManager p1,f2 p2,b p3,o p4){
       a.p(p0, "liveContextWrapper");
       a.p(p1, "voicePartyManager");
       a.p(p2, "voicePartyContext");
       a.p(p3, "micSeatDispatcher");
       a.p(p4, "adminService");
       super(p0, p2);
       this.n = p0;
       this.o = p1;
       this.p = p2;
       this.q = p3;
       this.r = p4;
       c$a uoa = new c$a(this);
       this.i = uoa;
       c$d uod = new c$d(this);
       this.j = uod;
       MutableLiveData mutableLiveD = new MutableLiveData(Boolean.FALSE);
       this.o0(mutableLiveD);
       this.k = mutableLiveD;
       c$c uoc = new c$c(this);
       this.l = uoc;
       c$b uob = new c$b(this);
       this.m = uob;
       p1.m(uoc);
       p3.a(uob);
       p4.f(uoa);
       p4.h(uod);
       this.z0();
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       super.onCleared();
       this.o.o(this.l);
       this.q.b(this.m);
       this.r.b(this.i);
       this.r.e(this.j);
       return;
    }
    public void w0(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       new d("VOICE_PARTY_BOTTOM_INVITE_MIC_BUTTON", null, this.n).f();
       return;
    }
    public final void z0(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       LiveApiParams$AssistantType uAssistantTy = this.r.d(qCurrentUser.getId());
       a.o(uAssistantTy, "adminService.getAssistan¡­ype\(QCurrentUser.me\(\).id\)");
       if (uAssistantTy.isAdmin() || uAssistantTy.isSuperAdmin()) {
          qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          LiveAdminPrivilege liveAdminPri = this.r.a(qCurrentUser.getId());
          a.o(liveAdminPri, "adminService.getAssistan¡­ege\(QCurrentUser.me\(\).id\)");
          this.r0(this.k).setValue(Boolean.valueOf(liveAdminPri.mControl));
       }else {
          this.r0(this.k).setValue(Boolean.FALSE);
       }
       return;
    }
}
