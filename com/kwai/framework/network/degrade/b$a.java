package com.kwai.framework.network.degrade.b$a;
import okhttp3.Callback;
import com.kwai.framework.network.degrade.b;
import byd.a;
import java.lang.Object;
import okhttp3.Call;
import java.io.IOException;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import retrofit2.a;
import java.lang.Throwable;
import okhttp3.Response;
import retrofit2.p;
import byd.f;

public class b$a implements Callback	// class@0017b8
{
    public final a a;
    public final b b;

    public void b$a(b p0,a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onFailure(Call p0,IOException p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$a.class, "2")) {
          return;
       }
       this.a.onFailure(this.b, p1);
       return;
    }
    public void onResponse(Call p0,Response p1){
       b$a uoa = b$a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "1")) {
          return;
       }
       p op = f.a(this.b.b, p1);
       if (!PatchProxy.applyVoidOneRefs(op, this, uoa, "4")) {
          this.a.onResponse(this.b, op);
       }
       return;
    }
}
