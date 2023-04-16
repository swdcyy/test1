package a58.a;
import w78.c;
import h88.g;
import java.lang.Object;
import android.os.Message;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.mini.d;
import android.os.Bundle;
import android.os.Parcelable;
import com.mini.app.installer.InstallEngineSOModel;
import k68.a;
import com.mini.app.runtime.f;
import k68.o;
import p68.b;
import java.lang.StringBuilder;
import com.mini.app.installer.InstallEngineSOMsg;
import com.mini.runtime.HostEnvInfo;
import com.mini.app.model.EngineSoInstallInfo;
import com.mini.app.installer.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Throwable;
import com.mini.app.installer.EngineSOInstallChannelListener$1;
import java.lang.RuntimeException;
import java.util.List;

public class a implements c	// class@00002c
{
    public g a;
    public String b;

    public void a(g p0){
       super();
       this.b = "BOOTFLOW_EngineSOInstallChannelListener";
       this.a = p0;
    }
    public void a(Message p0){
       InstallEngineSOModel d;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "1")) {
          return;
       }
       if (d.f()) {
          d.a("BOOTFLOW", "installKSWebView.B  ");
       }
       if (p0 != null && p0.getData() != null) {
          InstallEngineSOModel parcelable = p0.getData().getParcelable("ipc_key_params");
          if (parcelable != null && (!PatchProxy.applyVoidOneRefs(parcelable, this, uoa, "2") && parcelable.e != a.d.b().R.e())) {
             String str = "onReceiveInstallSO";
             if (parcelable.d != null) {
                d.c(str, "error code : "+parcelable.d.g+" method "+parcelable.d.b);
             }else {
                d.c(str, "installEnginsSoMsg is NULL");
             }
             switch (parcelable.d.b){
                 case 1:
                   if (!PatchProxy.applyVoidOneRefs(parcelable, this, uoa, "3")) {
                      parcelable = parcelable.d;
                      this.a.d(parcelable.c, parcelable.d);
                      if (d.f()) {
                         d.a(this.b, "onBegin "+parcelable.c);
                      }
                   }
                   break;
                 case 2:
                   if (!PatchProxy.applyVoidOneRefs(parcelable, this, uoa, "4")) {
                      parcelable = parcelable.d;
                      this.a.a(parcelable.c, parcelable.f);
                   }
                   break;
                 case 3:
                   if (!PatchProxy.applyVoidOneRefs(parcelable, this, uoa, "5")) {
                      d = parcelable.d;
                      a.h(parcelable.b);
                      this.a.c(d.c, d.d, d.e);
                      if (d.f()) {
                         d.a(this.b, "onSuc "+d.c);
                      }
                   }
                   break;
                 case 4:
                   if (!PatchProxy.applyVoidOneRefs(parcelable, this, uoa, "6")) {
                      parcelable = parcelable.d;
                      this.a.b(parcelable.c, parcelable.d, parcelable.e, new RuntimeException(parcelable.h));
                      if (d.f()) {
                         d.a(this.b, "onFail "+parcelable.c);
                      }
                   }
                   break;
                 case 5:
                   if (!PatchProxy.applyVoidOneRefs(parcelable, this, uoa, "7")) {
                      d = parcelable.d;
                      a.h(parcelable.b);
                      a.g.b(parcelable.c);
                      a.b.f(parcelable);
                      this.a.e(d.i, d.d, d.e);
                      if (d.f()) {
                         d.a(this.b, "onAllSuc "+d.c);
                      }
                   }
                   break;
                 case 6:
                   if (!PatchProxy.applyVoidOneRefs(parcelable, this, uoa, "8")) {
                      InstallEngineSOModel d1 = parcelable.d;
                      a.h(parcelable.b);
                      a.g.b(parcelable.c);
                      a.b.f(parcelable);
                      a ta = this.a;
                      InstallEngineSOMsg i = d1.i;
                      InstallEngineSOMsg j = d1.j;
                      InstallEngineSOMsg d2 = d1.d;
                      InstallEngineSOMsg e = d1.e;
                      EngineSOInstallChannelListener$1 u1 = PatchProxy.applyOneRefs(d1, this, uoa, "9");
                      if (u1 != PatchProxyResult.class) {
                      }else if(d1.g > null){
                         u1 = new EngineSOInstallChannelListener$1(this, d1);
                      }else {
                         u1 = new RuntimeException(d1.h);
                      }
                      Object obj = u1;
                      ta.f(i, j, d2, e, obj);
                      if (d.f()) {
                         d.a(this.b, "onAllFail "+d1.c);
                      }
                   }
                   break;
                 default:
             }
          }
       }
    label_01f5 :
       return;
    }
}
