package ba8.b;
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
import zi8.g1;
import java.lang.CharSequence;
import android.text.TextUtils;
import l88.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import l98.h;
import com.mini.env.MiniAppEnv;
import com.mini.app.model.TriggerStartAppStatModel;
import zh8.e;
import android.app.Activity;
import ve8.c;
import n88.a;
import w78.d;
import n88.b;
import com.mini.channel.b;

public final class b implements c	// class@000323
{
    public final InterMiniAppManagerImpl a;

    public void b(InterMiniAppManagerImpl p0){
       this.a = p0;
    }
    public final void a(Message p0){
       b ta = this.a;
       Objects.requireNonNull(ta);
       if (p0 != null && p0.getData() != null) {
          InterMiniAppIPCParams parcelable = p0.getData().getParcelable("key_channel_param");
          if (parcelable != null) {
             if (d.f()) {
                d.a("#NavigateMini#", "handleNavigateTo: "+parcelable);
             }
             MainLaunchPageInfo mainLaunchPa = new MainLaunchPageInfo();
             mainLaunchPa.e.d = parcelable.d;
             MainLaunchPageInfo b = mainLaunchPa.b;
             b.b = parcelable.e;
             b.i = parcelable.b;
             b.j = parcelable.c;
             b.g = parcelable.g;
             b.n = g1.a()+"";
             mainLaunchPa.b.d = ta.T6(parcelable);
             if (TextUtils.isEmpty(mainLaunchPa.b.m)) {
                mainLaunchPa.b.m = "launch";
             }
             MainLaunchPageInfo b1 = mainLaunchPa.b;
             String str = PatchProxy.apply(null, null, d.class, "5");
             if (str != PatchProxyResult.class) {
             }else if(MiniAppEnv.getHostEnvManager().T()){
                str = "011016";
             }else {
                str = "021016";
             }
             b1.E = str;
             mainLaunchPa.b.J = MiniAppEnv.getHostEnvManager().k();
             mainLaunchPa.b.I = MiniAppEnv.getHostEnvManager().x();
             mainLaunchPa.b.L = MiniAppEnv.getHostEnvManager().h();
             mainLaunchPa.b.M = MiniAppEnv.getHostEnvManager().E();
             long l = g1.a();
             mainLaunchPa.b.u.b = l;
             mainLaunchPa.a(l);
             e.a.A(null, mainLaunchPa.e.d, mainLaunchPa);
             Bundle uBundle = new Bundle();
             uBundle.putBoolean("key_channel_result", true);
             ta.mCF.j().W3(p0.arg1).d("channel_key_auth_navigate_to_response", uBundle);
          }
       }
       return;
    }
}
