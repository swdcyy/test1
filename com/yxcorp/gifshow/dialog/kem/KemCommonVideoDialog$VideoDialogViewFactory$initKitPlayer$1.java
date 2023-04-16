package com.yxcorp.gifshow.dialog.kem.KemCommonVideoDialog$VideoDialogViewFactory$initKitPlayer$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.video.wayne.player.builder.PlayerCommonBuildData;

public final class KemCommonVideoDialog$VideoDialogViewFactory$initKitPlayer$1 extends Lambda implements l	// class@001aa9
{
    public static final KemCommonVideoDialog$VideoDialogViewFactory$initKitPlayer$1 INSTANCE;

    static {
       KemCommonVideoDialog$VideoDialogViewFactory$initKitPlayer$1.INSTANCE = new KemCommonVideoDialog$VideoDialogViewFactory$initKitPlayer$1();
    }
    public void KemCommonVideoDialog$VideoDialogViewFactory$initKitPlayer$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(WayneBuildData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KemCommonVideoDialog$VideoDialogViewFactory$initKitPlayer$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       p0.setBizType("cny_2023");
       p0.setBizFt(":ks-kernels:kuaishou-design");
       p0.setMediaCodecPolicy(1);
       return;
    }
}
