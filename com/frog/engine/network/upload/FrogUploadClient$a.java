package com.frog.engine.network.upload.FrogUploadClient$a;
import com.frog.engine.network.upload.ProgressRequestBody$Listener;
import com.frog.engine.network.upload.FrogUploadResultCallBack;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import com.frog.engine.network.upload.FrogUploadClient;
import java.lang.Boolean;
import java.util.Map;
import okhttp3.Call;

public final class FrogUploadClient$a implements ProgressRequestBody$Listener	// class@001552
{
    public final FrogUploadResultCallBack a;
    public final String b;

    public void FrogUploadClient$a(FrogUploadResultCallBack p0,String p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onProgress(int p0,long p1,long p2){
       if (PatchProxy.isSupport(FrogUploadClient$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), this, FrogUploadClient$a.class, "1")) {
          return;
       }
       FrogUploadClient$a ta = this.a;
       if (ta != null) {
          ta.onProcessUpdate(p0, p1, p2);
       }
       Map sNeedUploadS = FrogUploadClient.sNeedUploadSeqNo;
       _monitor_enter(sNeedUploadS);
       if (Boolean.FALSE.equals(FrogUploadClient.sNeedUploadSeqNo.get(this.b))) {
          Call uCall = FrogUploadClient.sNeedUploadCall.get(this.b);
          if (uCall != null) {
             uCall.cancel();
             FrogUploadClient.sNeedUploadCall.remove(uCall);
          }
          _monitor_exit(sNeedUploadS);
          return;
       }else {
          _monitor_exit(sNeedUploadS);
          return;
       }
    }
}
