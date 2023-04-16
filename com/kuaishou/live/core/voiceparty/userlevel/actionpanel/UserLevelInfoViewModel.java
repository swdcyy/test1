package com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoViewModel;
import yh3.a;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import java.lang.Boolean;
import pt2.b;
import java.lang.Float;
import zh3.c;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import bs2.a;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import brd.t;
import cjd.e;
import erd.o;
import brd.x;
import rh3.b;
import t45.d;
import brd.z;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoViewModel$a;
import erd.a;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoViewModel$b;
import sfc.a;
import erd.g;
import crd.b;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoViewModel$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoViewModel$c$a;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoViewModel$ClickSource;
import com.kuaishou.live.core.voiceparty.model.MicSeatLevelInfo;
import java.util.Objects;
import java.lang.Integer;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger$logPrivilegeBadgeClick$1;
import msd.p;
import yx2.d;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger$logPrivilegeButtonClick$1;

public final class UserLevelInfoViewModel extends a	// class@001a6c
{
    public MicSeatLevelInfo a;
    public final LiveData b;
    public final LiveData c;
    public final LiveData d;
    public final LiveData e;
    public final LiveData f;
    public final LiveData g;
    public final LiveData h;
    public final LiveData i;
    public final LiveData j;
    public final LiveData k;
    public final LiveData l;
    public final LiveEvent m;
    public final boolean n;
    public final VoicePartyMicSeatData o;
    public final UserMicSeatLevelLogger p;

    public void UserLevelInfoViewModel(boolean p0,VoicePartyMicSeatData p1,UserMicSeatLevelLogger p2){
       String str1;
       a.p(p1, "seatData");
       a.p(p2, "logger");
       super();
       this.n = p0;
       this.o = p1;
       this.p = p2;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.b = mutableLiveD;
       Boolean tRUE = Boolean.TRUE;
       mutableLiveD = new MutableLiveData(tRUE);
       this.o0(mutableLiveD);
       this.c = mutableLiveD;
       VoicePartyMicSeatData mMicUser = p1.mMicUser;
       String str = "";
       if (mMicUser != null) {
          str1 = mMicUser.b();
          if (str1 != null) {
          label_0039 :
             mutableLiveD = new MutableLiveData(str1);
             this.o0(mutableLiveD);
             this.d = mutableLiveD;
             mutableLiveD = new MutableLiveData();
             this.o0(mutableLiveD);
             this.e = mutableLiveD;
             mutableLiveD = new MutableLiveData();
             this.o0(mutableLiveD);
             this.f = mutableLiveD;
             mutableLiveD = new MutableLiveData();
             this.o0(mutableLiveD);
             this.g = mutableLiveD;
             mutableLiveD = new MutableLiveData(Float.valueOf(0x3f000000));
             this.o0(mutableLiveD);
             this.h = mutableLiveD;
             mutableLiveD = new MutableLiveData();
             this.o0(mutableLiveD);
             this.i = mutableLiveD;
             mutableLiveD = new MutableLiveData();
             this.o0(mutableLiveD);
             this.j = mutableLiveD;
             mutableLiveD = new MutableLiveData();
             this.o0(mutableLiveD);
             this.k = mutableLiveD;
             mutableLiveD = new MutableLiveData(tRUE);
             this.o0(mutableLiveD);
             this.l = mutableLiveD;
             c uoc = new c();
             this.p0(uoc);
             this.m = uoc;
             if (p0) {
                str = p1.getUserId();
             }
             LiveVoicePartyApi.b().a(str).map(new e()).compose(b.a(this)).observeOn(d.a).doOnComplete(new UserLevelInfoViewModel$a(this)).subscribe(new UserLevelInfoViewModel$b(this), new a());
             return;
          }
       }
       str1 = str;
       goto label_0039 ;
    }
    public final LiveData u0(){
       return this.l;
    }
    public void v0(UserLevelInfoViewModel$c p0){
       UserLevelInfoViewModel tp;
       MicSeatLevelInfo level;
       MicSeatLevelInfo subLevel;
       UserMicSeatLevelLogger userMicSeatL = UserMicSeatLevelLogger.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, UserLevelInfoViewModel.class, "1")) {
          return;
       }
       a.p(p0, "intent");
       UserLevelInfoViewModel ta = this.a;
       if (ta != null) {
          String userId = this.o.getUserId();
          if (userId == null) {
             userId = "";
          }
          a.o(userId, "seatData.userId ?: \"\"");
          if (p0.a == UserLevelInfoViewModel$ClickSource.CLICK_BADGE) {
             tp = this.p;
             level = ta.level;
             subLevel = ta.subLevel;
             Objects.requireNonNull(tp);
             if (!PatchProxy.isSupport(userMicSeatL) || !PatchProxy.applyVoidThreeRefs(userId, Integer.valueOf(level), Integer.valueOf(subLevel), tp, UserMicSeatLevelLogger.class, "5")) {
                a.p(userId, "uid");
                tp.a("MIC_PRIVILEGE_BADGE_ICON", userId, new UserMicSeatLevelLogger$logPrivilegeBadgeClick$1(level, subLevel)).f();
             }
          }else {
             tp = this.p;
             level = ta.level;
             subLevel = ta.subLevel;
             Objects.requireNonNull(tp);
             if (!PatchProxy.isSupport(userMicSeatL) || !PatchProxy.applyVoidThreeRefs(userId, Integer.valueOf(level), Integer.valueOf(subLevel), tp, UserMicSeatLevelLogger.class, "7")) {
                a.p(userId, "uid");
                tp.a("SEE_MIC_PRIVILEGE_BUTTON", userId, new UserMicSeatLevelLogger$logPrivilegeButtonClick$1(level, subLevel)).f();
             }
          }
          this.s0(this.m).q(userId);
       }
       return;
    }
    public final LiveData w0(){
       return this.c;
    }
}
