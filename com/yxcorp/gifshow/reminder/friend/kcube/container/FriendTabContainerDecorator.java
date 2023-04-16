package com.yxcorp.gifshow.reminder.friend.kcube.container.FriendTabContainerDecorator;
import com.kwai.kcube.decorator.IContainerDecorator;
import com.yxcorp.gifshow.reminder.friend.kcube.container.FriendTabContainerDecorator$callerContext$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.ViewGroup;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import br6.a;
import android.content.Context;
import android.view.View;
import i2b.a;
import android.widget.FrameLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import com.kwai.kcube.ext.MvpDecoratorViewHolder;
import com.yxcorp.gifshow.reminder.friend.kcube.container.FriendTabContainerDecorator$createActionBarViewHolder$1;
import ndc.c;
import msd.l;
import com.yxcorp.gifshow.reminder.friend.kcube.container.FriendTabContainerDecorator$createActionBarViewHolder$2;
import z1.a;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import nsd.u;
import trd.t;

public final class FriendTabContainerDecorator extends IContainerDecorator	// class@001aa9
{
    public final p h;

    public void FriendTabContainerDecorator(){
       super();
       this.h = s.c(FriendTabContainerDecorator$callerContext$2.INSTANCE);
    }
    public List g(ViewGroup p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FriendTabContainerDecorator uFriendTabCo = FriendTabContainerDecorator.class;
       View obj = PatchProxy.applyOneRefs(p0, this, uFriendTabCo, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "parent");
       MvpDecoratorViewHolder mvpDecorator = PatchProxy.applyOneRefs(p0, this, uFriendTabCo, "3");
       if (mvpDecorator != patchProxyRe) {
       }else {
          obj = a.a(p0.getContext(), R.layout.arg_RES_7f0d0534);
          a.o(obj, "KwaiLayoutInflater.infla¡­tab_container_action_bar\)");
          obj.setLayoutParams(new FrameLayout$LayoutParams(-1, a1.d(R.dimen.arg_RES_7f070fdf)));
          mvpDecorator = new MvpDecoratorViewHolder(obj, 0, new c(new FriendTabContainerDecorator$createActionBarViewHolder$1(this)), new FriendTabContainerDecorator$createActionBarViewHolder$2(this), null, true, null, 64, null);
       }
       return t.k(mvpDecorator);
    }
}
