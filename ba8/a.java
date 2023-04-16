package ba8.a;
import w78.c;
import com.mini.ipc.interminiappmgr.InterMiniAppManagerImpl;
import java.lang.Object;
import android.os.Message;
import java.util.Objects;
import android.os.Bundle;
import java.lang.String;
import android.os.Parcelable;
import com.mini.inter.InterMiniAppIPCParams;
import com.mini.d;
import java.lang.StringBuilder;
import com.mini.app.model.MainLaunchPageInfo;
import com.mini.pms.packagemanager.model.MiniAppInfo;
import com.mini.app.model.page.LaunchPageInfo;
import l98.h;
import com.mini.env.MiniAppEnv;
import zi8.g1;
import com.mini.app.model.TriggerStartAppStatModel;
import zh8.e;
import android.app.Activity;
import ve8.c;
import n88.a;
import w78.d;
import n88.b;
import com.mini.channel.b;

public final class a implements c	// class@000322
{
    public final InterMiniAppManagerImpl a;

    public void a(InterMiniAppManagerImpl p0){
       this.a = p0;
    }
    public final void a(Message p0){
       a ta = this.a;
       Objects.requireNonNull(ta);
       if (p0 != null && p0.getData() != null) {
          InterMiniAppIPCParams parcelable = p0.getData().getParcelable("key_channel_param");
          if (parcelable != null) {
             if (d.f()) {
                d.a("#NavigateMini#", "handleNavigateBack: "+parcelable);
             }
             MainLaunchPageInfo mainLaunchPa = new MainLaunchPageInfo();
             mainLaunchPa.e.d = parcelable.d;
             MainLaunchPageInfo b = mainLaunchPa.b;
             b.b = parcelable.e;
             b.d = ta.T6(parcelable);
             mainLaunchPa.b.J = MiniAppEnv.getHostEnvManager().k();
             mainLaunchPa.b.I = MiniAppEnv.getHostEnvManager().x();
             mainLaunchPa.b.L = MiniAppEnv.getHostEnvManager().h();
             mainLaunchPa.b.M = MiniAppEnv.getHostEnvManager().E();
             long l = g1.a();
             mainLaunchPa.b.u.b = l;
             mainLaunchPa.a(l);
             mainLaunchPa.b.p = true;
             e.a.A(null, mainLaunchPa.e.d, mainLaunchPa);
             Bundle uBundle = new Bundle();
             uBundle.putBoolean("key_channel_result", true);
             ta.mCF.j().W3(p0.arg1).d("channel_key_auth_navigate_back_response", uBundle);
          }
       }
       return;
    }
}
