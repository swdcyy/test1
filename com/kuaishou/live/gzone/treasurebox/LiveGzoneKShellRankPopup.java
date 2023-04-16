package com.kuaishou.live.gzone.treasurebox.LiveGzoneKShellRankPopup;
import com.kwai.live.gzone.widget.e;
import android.app.Activity;
import r53.a;
import com.kuaishou.live.gzone.treasurebox.LiveGzoneKShellRankPopup$1;
import com.kwai.live.gzone.widget.e$a;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.utils.a;
import com.kwai.library.widget.popup.common.c$b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import y43.a;
import lnc.a1;
import android.view.View;
import android.os.Bundle;
import oq5.a;
import f37.o0;
import com.kuaishou.live.gzone.treasurebox.LiveGzoneKShellRankListFragment;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import k2b.u1;

public class LiveGzoneKShellRankPopup extends e	// class@001c51
{
    public a A;
    public final DefaultLifecycleObserver B;
    public final Activity x;
    public final a y;
    public Fragment z;

    public void LiveGzoneKShellRankPopup(Activity p0,a p1){
       super(p0);
       this.B = new LiveGzoneKShellRankPopup$1(this);
       this.p.a0(true);
       this.x = p0;
       this.y = p1;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneKShellRankPopup.class, "3")) {
          return;
       }
       LiveGzoneKShellRankPopup tA = this.A;
       if (tA != null) {
          tA.a();
       }
       if (this.z != null) {
          Activity uActivity = this.p.q();
          if (uActivity instanceof FragmentActivity) {
             uActivity.getSupportFragmentManager().beginTransaction().u(this.z).m();
          }
          this.z.getLifecycle().removeObserver(this.B);
       }
       return;
    }
    public int d0(){
       return 0x7f0d0bcf;
    }
    public int e0(){
       int i;
       Activity obj = PatchProxy.apply(null, this, LiveGzoneKShellRankPopup.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = null;
       a y = this.y.y;
       if (y != null) {
          i = y.S(this.u());
       }
       if (!i) {
          i = a1.e(0x43fa0000);
       }
       return i;
    }
    public void f0(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzoneKShellRankPopup.class, "1")) {
          return;
       }
       o0.p(this.q, this.y.o.H2());
       LiveGzoneKShellRankListFragment liveGzoneKSh = new LiveGzoneKShellRankListFragment();
       liveGzoneKSh.F = this.y;
       liveGzoneKSh.I = this;
       e uoe = this.x.getSupportFragmentManager().beginTransaction();
       uoe.f(R.id.live_gzone_kshell_rank_container, liveGzoneKSh);
       this.z = liveGzoneKSh;
       a uoa = new a(uoe);
       this.A = uoa;
       uoa.b();
       this.z.getLifecycle().addObserver(this.B);
       this.l0();
       return;
    }
    public boolean j0(){
       return true;
    }
    public void l0(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneKShellRankPopup.class, "5")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MAOLIANG_LIST_PANEL";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = this.y.a.a();
       u1.u0(4, uElementPack, uContentPack);
       return;
    }
}
