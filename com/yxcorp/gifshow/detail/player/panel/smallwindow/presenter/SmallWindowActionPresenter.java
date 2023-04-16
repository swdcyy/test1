package com.yxcorp.gifshow.detail.player.panel.smallwindow.presenter.SmallWindowActionPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.presenter.SmallWindowActionPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.presenter.SmallWindowActionPresenter$mReceiver$1;
import m3a.t;
import java.lang.String;
import kotlin.jvm.internal.a;
import m3a.s;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import m3a.c;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.content.IntentFilter;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.ActionType;
import android.content.BroadcastReceiver;
import android.content.Intent;

public final class SmallWindowActionPresenter extends PresenterV2	// class@001646
{
    public t p;
    public s q;
    public final SmallWindowActionPresenter$mReceiver$1 r;
    public static final SmallWindowActionPresenter$a s;

    static {
       SmallWindowActionPresenter.s = new SmallWindowActionPresenter$a(null);
    }
    public void SmallWindowActionPresenter(){
       super();
       this.r = new SmallWindowActionPresenter$mReceiver$1(this);
    }
    public static final t P8(SmallWindowActionPresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mPlayController");
       }
       return p0;
    }
    public static final s R8(SmallWindowActionPresenter p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mSmallWindowParam");
       }
       return p0;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, SmallWindowActionPresenter.class, "2")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          SmallWindowActionPresenter tr = this.r;
          c a = c.a;
          a.o(activity, "this");
          Objects.requireNonNull(a);
          IntentFilter intentFilter = PatchProxy.applyOneRefs(activity, a, c.class, "4");
          if (intentFilter != PatchProxyResult.class) {
          }else {
             a.p(activity, "activity");
             intentFilter = new IntentFilter();
             ActionType[] uActionTypeA = ActionType.values();
             int len = uActionTypeA.length;
             for (int i = 0; i < len; i = i + 1) {
                intentFilter.addAction(a.c(activity, uActionTypeA[i]));
             }
          }
          activity.registerReceiver(tr, intentFilter);
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, SmallWindowActionPresenter.class, "3")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          activity.unregisterReceiver(this.r);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SmallWindowActionPresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("play_controller");
       a.o(obj, "inject\(SmallWindowAccessIds.PLAY_CONTROLLER\)");
       this.p = obj;
       obj = this.r8("small_window_param");
       a.o(obj, "inject\(SmallWindowAccessIds.SMALL_WINDOW_PARAM\)");
       this.q = obj;
       return;
    }
}
