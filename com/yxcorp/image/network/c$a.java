package com.yxcorp.image.network.c$a;
import id.e;
import com.yxcorp.image.network.c;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Looper;
import okhttp3.Dispatcher;
import java.util.concurrent.ExecutorService;
import java.util.Objects;
import q0d.i;
import java.lang.Runnable;

public class c$a extends e	// class@001a1f
{
    public final Call a;
    public final OkHttpClient b;
    public final c c;

    public void c$a(c p0,Call p1,OkHttpClient p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       if (Looper.myLooper() != Looper.getMainLooper()) {
          this.a.cancel();
       }else {
          c$a ta = this.a;
          Objects.requireNonNull(ta);
          this.b.dispatcher().executorService().execute(new i(ta));
       }
       return;
    }
}
