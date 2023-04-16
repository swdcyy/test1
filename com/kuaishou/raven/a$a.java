package com.kuaishou.raven.a$a;
import okhttp3.Callback;
import com.kuaishou.raven.a;
import com.kuaishou.raven.b$a;
import java.lang.Object;
import okhttp3.Call;
import java.io.IOException;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import com.google.common.base.b;
import retrofit2.HttpException;
import java.lang.Exception;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class a$a implements Callback	// class@000e94
{
    public final b$a a;
    public final a b;

    public void a$a(a p0,b$a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onFailure(Call p0,IOException p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "1")) {
          return;
       }
       Throwable throwable = b.c(p1);
       int i = -213;
       if (throwable instanceof HttpException) {
          i = throwable.code();
       }
       this.a.a(i, p1);
       return;
    }
    public void onResponse(Call p0,Response p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "2")) {
          return;
       }
       this.a.b(p1.code(), p1.body().bytes());
       return;
    }
}
