package com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoSelfBinding;
import qx2.a;
import android.view.View;
import ox2.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoViewModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoSelfBinding$bindViewModel$1;
import msd.l;
import xh3.g;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoSelfBinding$bindViewModel$2;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoSelfBinding$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoSelfBinding$b;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoSelfBinding$c;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoSelfBinding$d;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoSelfBinding$e;
import android.view.View$OnClickListener;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.IllegalArgumentException;

public final class UserLevelInfoSelfBinding extends a	// class@001a60
{
    public final TextView g;
    public final TextView h;
    public final ConstraintLayout i;
    public final View j;
    public final TextView k;
    public final TextView l;
    public final View m;

    public void UserLevelInfoSelfBinding(View p0,d p1){
       a.p(p0, "rootView");
       a.p(p1, "launcher");
       super(p0, p1);
       this.g = p0.findViewById(0x7f0a2dc2);
       this.h = p0.findViewById(0x7f0a2dc3);
       this.i = p0.findViewById(0x7f0a0dad);
       this.j = p0.findViewById(0x7f0a0dac);
       this.k = p0.findViewById(0x7f0a0a22);
       this.l = p0.findViewById(0x7f0a2ab1);
       this.m = p0.findViewById(0x7f0a395a);
    }
    public void a(LifecycleOwner p0,UserLevelInfoViewModel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserLevelInfoSelfBinding.class, "1")) {
          return;
       }
       a.p(p0, "lifecycleOwner");
       a.p(p1, "viewModel");
       super.a(p0, p1);
       UserLevelInfoSelfBinding tg = this.g;
       a.o(tg, "nextGainExpView");
       g.b(tg, p0, LiveDataOperators.c(p1.j, p1.u0()), UserLevelInfoSelfBinding$bindViewModel$1.INSTANCE);
       tg = this.h;
       a.o(tg, "nextGainMinutesView");
       g.b(tg, p0, LiveDataOperators.c(p1.k, p1.u0()), UserLevelInfoSelfBinding$bindViewModel$2.INSTANCE);
       p1.f.observe(p0, new UserLevelInfoSelfBinding$a(this));
       p1.g.observe(p0, new UserLevelInfoSelfBinding$b(this));
       p1.h.observe(p0, new UserLevelInfoSelfBinding$c(this));
       p1.i.observe(p0, new UserLevelInfoSelfBinding$d(this));
       this.m.setOnClickListener(new UserLevelInfoSelfBinding$e(p1));
       return;
    }
    public final int b(int p0,int p1){
       UserLevelInfoSelfBinding userLevelInf = UserLevelInfoSelfBinding.class;
       if (PatchProxy.isSupport(userLevelInf)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, userLevelInf, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 255;
       if (p0 >= 0 && i >= p0) {
          return ((p0 << 24) | (p1 & 0xffffff));
       }else {
          throw new IllegalArgumentException("alpha must be between 0 and 255.");
       }
    }
}
