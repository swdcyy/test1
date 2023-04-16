package com.yxcorp.image.network.c$b;
import okhttp3.Callback;
import com.yxcorp.image.network.c;
import q0d.g;
import com.facebook.imagepipeline.producers.n$a;
import java.lang.Object;
import okhttp3.Call;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import java.io.IOException;
import okhttp3.Response;
import okhttp3.ResponseBody;
import ab.e;
import com.yxcorp.image.network.OkHttpException;
import java.util.Objects;
import q0d.a;
import android.os.SystemClock;
import com.yxcorp.image.network.ImageHttpStatistics;
import java.io.InputStream;

public class c$b implements Callback	// class@001a20
{
    public final g a;
    public final n$a b;
    public final c c;

    public void c$b(c p0,g p1,n$a p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public final void a(Call p0,Exception p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$b.class, "3")) {
          return;
       }
       if (p0.isCanceled()) {
          this.b.b();
       }else {
          this.b.onFailure(p1);
       }
       return;
    }
    public void onFailure(Call p0,IOException p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$b.class, "2")) {
          return;
       }
       this.a(p0, p1);
       return;
    }
    public void onResponse(Call p0,Response p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$b.class, "1")) {
          return;
       }
       OkHttpException okHttpExcept = null;
       ResponseBody responseBody = p1.body();
       e.d(responseBody);
       if (!p1.isSuccessful()) {
          okHttpExcept = new OkHttpException(p1);
       }else {
          c$b tc = this.c;
          c$b ta = this.a;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoidOneRefs(ta, tc, a.class, "4")) {
             ta.f.mMillisResponse = SystemClock.elapsedRealtime();
          }
          try{
             tc = this.a;
             tc.g = responseBody;
             tc.f.mCdnCache = p1.header("X-Ks-Cache");
             this.b.c(responseBody.byteStream(), (int)responseBody.contentLength());
          }catch(java.lang.Exception e8){
             okHttpExcept = e8;
          }
       }
    }
}
