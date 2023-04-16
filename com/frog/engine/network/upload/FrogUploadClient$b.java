package com.frog.engine.network.upload.FrogUploadClient$b;
import okhttp3.Callback;
import com.frog.engine.network.upload.FrogUploadResultCallBack;
import java.lang.Object;
import okhttp3.Call;
import java.io.IOException;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.frog.engine.network.perflogger.KsFrogPerfReportManager;
import okhttp3.Response;
import okhttp3.ResponseBody;

public final class FrogUploadClient$b implements Callback	// class@001553
{
    public final long a;
    public final FrogUploadResultCallBack b;

    public void FrogUploadClient$b(long p0,FrogUploadResultCallBack p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onFailure(Call p0,IOException p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FrogUploadClient$b.class, "1")) {
          return;
       }
       if (KsFrogPerfReportManager.instance().isHttpPerfEnable()) {
          KsFrogPerfReportManager.instance().reportHttpPerfEx(this.a, p1);
       }
       FrogUploadClient$b tb = this.b;
       if (tb != null) {
          tb.onFail(p1.getMessage());
       }
       return;
    }
    public void onResponse(Call p0,Response p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FrogUploadClient$b.class, "2")) {
          return;
       }
       if (KsFrogPerfReportManager.instance().isHttpPerfEnable()) {
          KsFrogPerfReportManager.instance().reportLogObject(this.a);
       }
       String str = (p1.isSuccessful())? p1.body().string(): "";
       FrogUploadClient$b tb = this.b;
       if (tb != null) {
          tb.onResult(p1.code(), str);
       }
       return;
    }
}
