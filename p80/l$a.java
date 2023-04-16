package p80.l$a;
import com.kuaishou.webkit.extension.KwSdk$InstallCallback;
import p80.l;
import java.lang.Object;
import e35.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.kuaishou.gifshow.kswebview.KsWebViewInstallException;
import com.kuaishou.gifshow.kswebview.KsWebViewInstaller2;
import java.lang.CharSequence;
import kotlin.jvm.internal.a;

public final class l$a implements KwSdk$InstallCallback	// class@0028d4
{
    public final l a;

    public void l$a(l p0){
       this.a = p0;
       super();
    }
    public void onFinish(boolean p0,boolean p1){
       a.a(this, p0, p1);
    }
    public void onFinishWithError(boolean p0,boolean p1,String p2){
       if (PatchProxy.isSupport(l$a.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, this, l$a.class, "1")) {
          return;
       }
       Log.g("KsWebView", "install kernel callback succeed "+p0+", isNewVersion "+p1+", error "+p2);
       p1 = true;
       if (p0) {
          this.a.b.d(p1, null);
       }else if(p2 == null || !p2.length()){
          p1 = false;
       }
       if (p1) {
          p2 = "Unknown failed install KsWebView";
       }else {
          a.m(p2);
       }
       this.a.b.d(false, new KsWebViewInstallException(0x30da8, p2));
       return;
    }
}
