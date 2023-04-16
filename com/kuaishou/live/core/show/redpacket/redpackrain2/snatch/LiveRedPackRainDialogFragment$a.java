package com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.LiveRedPackRainDialogFragment$a;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.c$b;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.LiveRedPackRainDialogFragment;
import java.lang.Object;
import t02.a0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import d61.g;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import th2.f;
import android.content.Context;
import n3d.a;
import com.kwai.robust.PatchProxyResult;
import ph2.a;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainGrabResult;

public class LiveRedPackRainDialogFragment$a implements c$b	// class@000f17
{
    public final LiveRedPackRainDialogFragment a;

    public void LiveRedPackRainDialogFragment$a(LiveRedPackRainDialogFragment p0){
       this.a = p0;
       super();
    }
    public a0 e(){
       return this.a.y;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LiveRedPackRainDialogFragment$a.class, "3")) {
          return;
       }
       this.a.dismissAllowingStateLoss();
       return;
    }
    public void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveRedPackRainDialogFragment$a.class, "2")) {
          return;
       }
       LiveRedPackRainDialogFragment$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, LiveRedPackRainDialogFragment.class, "10")) {
          FragmentActivity activity = ta.getActivity();
          if (!g.h(activity)) {
             if (!QCurrentUser.me().isLogined()) {
                d.a(-1712118428).x00(activity, 0, new LoginParams$a().a(), new f(ta));
             }else {
                ta.Ah();
             }
          }
       }
       return;
    }
    public Activity h(){
       Object obj = PatchProxy.apply(null, this, LiveRedPackRainDialogFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getActivity();
    }
    public a i(){
       return this.a.z;
    }
    public void j(boolean p0){
       this.a.C = p0;
    }
    public int k(){
       return this.a.s;
    }
    public void l(int p0){
       this.a.s = p0;
    }
    public LiveRedPackRainGrabResult m(){
       return this.a.A;
    }
}
