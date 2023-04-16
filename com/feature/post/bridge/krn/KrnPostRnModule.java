package com.feature.post.bridge.krn.KrnPostRnModule;
import com.kuaishou.krn.base.KrnBridge;
import com.feature.post.bridge.krn.KrnPostRnModule$a;
import nsd.u;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import android.content.Intent;
import android.net.Uri;
import qrd.l1;

public final class KrnPostRnModule extends KrnBridge	// class@0014a8
{
    public static final KrnPostRnModule$a Companion;

    static {
       KrnPostRnModule.Companion = new KrnPostRnModule$a(null);
    }
    public void KrnPostRnModule(ReactApplicationContext p0){
       a.p(p0, "reactContext");
       super(p0);
    }
    public String getName(){
       return "KrnPostComponent";
    }
    public final void startLocationSetting(){
       Activity currentActiv = this.getCurrentActivity();
       if (currentActiv != null) {
          Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
          a.o(currentActiv, "it");
          intent.setData(Uri.fromParts("package", currentActiv.getPackageName(), null));
          currentActiv.startActivity(intent);
       }
       return;
    }
}
