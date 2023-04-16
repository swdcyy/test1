package com.yxcorp.gifshow.init.module.KSUploaderKitLogInit$Companion;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.init.module.KSUploaderKitLogInit;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.init.module.KSUploaderKitLogInit$Holder;
import java.util.Objects;

public final class KSUploaderKitLogInit$Companion	// class@001984
{

    public void KSUploaderKitLogInit$Companion(){
       super();
    }
    public void KSUploaderKitLogInit$Companion(u p0){
       super();
    }
    public final KSUploaderKitLogInit a(){
       Object obj = PatchProxy.applyWithListener(null, this, KSUploaderKitLogInit$Companion.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(KSUploaderKitLogInit$Holder.b);
       PatchProxy.onMethodExit(KSUploaderKitLogInit$Companion.class, "1");
       return KSUploaderKitLogInit$Holder.a;
    }
}
