package com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import sx2.b;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeViewController$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import sx2.v;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeViewController$$special$$inlined$viewModels$2;
import msd.a;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import sx2.s;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import sx2.t;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import sx2.u;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class PrivilegeViewController extends ViewController	// class@001a98
{
    public final p j;
    public final LiveData k;
    public final b l;
    public final UserMicSeatLevelLogger m;

    public void PrivilegeViewController(LiveData p0,b p1,UserMicSeatLevelLogger p2){
       a.p(p0, "interest");
       a.p(p1, "decorationNavigator");
       a.p(p2, "logger");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.j = new ViewModelLazy(m0.d(v.class), new PrivilegeViewController$$special$$inlined$viewModels$2(new PrivilegeViewController$$special$$inlined$viewModels$1(this)), new PrivilegeViewController$viewModel$2(this));
    }
    public void F2(){
       PrivilegeViewController privilegeVie = PrivilegeViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, privilegeVie, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d16d5);
       if (!PatchProxy.applyVoid(objArray, this, privilegeVie, "3")) {
          this.V2().u0().observe(this, new s(this.A2(R.id.privilege_icon), this.A2(R.id.privilege_name)));
          this.V2().b.observe(this, new t(this));
          this.P2().setOnClickListener(new u(this));
       }
       return;
    }
    public final v V2(){
       Object obj = PatchProxy.apply(null, this, PrivilegeViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
