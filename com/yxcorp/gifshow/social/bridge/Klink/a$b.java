package com.yxcorp.gifshow.social.bridge.Klink.a$b;
import o75.j0;
import com.yxcorp.gifshow.social.bridge.Klink.a;
import f55.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.os.Bundle;
import com.kwai.chat.kwailink.data.PacketData;
import com.yxcorp.gifshow.social.bridge.Klink.KlinkBridgeResponseParams;
import android.util.Base64;

public class a$b implements j0	// class@001d4f
{
    public final g a;
    public final a b;

    public void a$b(a p0,g p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onFailed(int p0,String p1){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "2")) {
          return;
       }
       this.a.a(p0, p1, null);
       return;
    }
    public void onResponse(PacketData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       KlinkBridgeResponseParams klinkBridgeR = new KlinkBridgeResponseParams();
       klinkBridgeR.mCommand = p0.a();
       klinkBridgeR.mErrorCode = p0.c();
       klinkBridgeR.mErrorMessage = p0.e();
       klinkBridgeR.mLogParam = Base64.encodeToString(p0.h(), 2);
       klinkBridgeR.mResponseData = Base64.encodeToString(p0.b(), 2);
       klinkBridgeR.mSubBiz = p0.k();
       this.a.onSuccess(klinkBridgeR);
       return;
    }
}
