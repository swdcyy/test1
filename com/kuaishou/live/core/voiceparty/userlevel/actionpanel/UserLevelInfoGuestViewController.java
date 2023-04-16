package com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoGuestViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger;
import ox2.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoGuestViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoGuestViewController$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoViewModel;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoGuestViewController$$special$$inlined$viewModels$2;
import msd.a;
import com.kwai.robust.PatchProxy;
import qx2.a;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import androidx.lifecycle.LifecycleOwner;

public final class UserLevelInfoGuestViewController extends ViewController	// class@001a58
{
    public final p j;
    public final VoicePartyMicSeatData k;
    public final UserMicSeatLevelLogger l;
    public final d m;

    public void UserLevelInfoGuestViewController(VoicePartyMicSeatData p0,UserMicSeatLevelLogger p1,d p2){
       a.p(p0, "seatData");
       a.p(p1, "logger");
       a.p(p2, "launcher");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.j = new ViewModelLazy(m0.d(UserLevelInfoViewModel.class), new UserLevelInfoGuestViewController$$special$$inlined$viewModels$2(new UserLevelInfoGuestViewController$$special$$inlined$viewModels$1(this)), new UserLevelInfoGuestViewController$viewModel$2(this));
    }
    public void F2(){
       UserLevelInfoGuestViewController userLevelInf = UserLevelInfoGuestViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, userLevelInf, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0e31);
       a uoa = new a(this.P2(), this.m);
       UserLevelInfoViewModel userLevelInf1 = PatchProxy.apply(objArray, this, userLevelInf, "1");
       if (userLevelInf1 == PatchProxyResult.class) {
          userLevelInf1 = this.j.getValue();
       }
       uoa.a(this, userLevelInf1);
       return;
    }
}
