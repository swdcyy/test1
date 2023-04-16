package com.kuaishou.live.core.voiceparty.micseats.pendant.UserNamePendantViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.UserNamePendantViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.UserNamePendantViewController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.UserNamePendantViewController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import it2.h1;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.UserNamePendantViewController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.StyleKt;
import msd.l;
import android.view.View;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import androidx.lifecycle.LifecycleOwner;
import xh3.g;

public final class UserNamePendantViewController extends ViewController	// class@001754
{
    public final p j;
    public final MicSeatStyle k;

    public void UserNamePendantViewController(f p0,MicSeatStyle p1,LiveData p2){
       a.p(p0, "micSeatStateService");
       a.p(p1, "style");
       a.p(p2, "micSeatId");
       super();
       this.k = p1;
       this.j = new ViewModelLazy(m0.d(h1.class), new UserNamePendantViewController$viewModelDelegate$$inlined$viewModels$2(new UserNamePendantViewController$viewModelDelegate$$inlined$viewModels$1(this)), new UserNamePendantViewController$$special$$inlined$viewModelDelegate$1(new UserNamePendantViewController$viewModel$2(p0, p2)));
    }
    public void F2(){
       UserNamePendantViewController userNamePend = UserNamePendantViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, userNamePend, "2")) {
          return;
       }
       this.S2(StyleKt.c(R.layout.arg_RES_7f0d16c9, StyleKt.b(this.k)));
       if (!PatchProxy.applyVoid(objArray, this, userNamePend, "3")) {
          TextView textView = this.A2(R.id.title_view);
          h1 oh1 = PatchProxy.apply(objArray, this, userNamePend, "1");
          if (oh1 == PatchProxyResult.class) {
             oh1 = this.j.getValue();
          }
          g.a(textView, this, oh1.x0());
       }
       return;
    }
}
