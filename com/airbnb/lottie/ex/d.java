package com.airbnb.lottie.ex.d;
import java.util.concurrent.Callable;
import android.content.Context;
import java.lang.Object;
import com.airbnb.lottie.ex.a;
import android.content.res.Resources;
import java.io.InputStream;
import java.lang.String;
import a5.k;
import java.lang.Throwable;

public final class d implements Callable	// class@000da5
{
    public final Context b;
    public final int c;

    public void d(Context p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       k ok;
       d tb = this.b;
       d tc = this.c;
       Map a = a.a;
       try{
          ok = a.b(tb.getResources().openRawResource(tc), a.g(tc));
       }catch(android.content.res.Resources$NotFoundException e0){
          ok = new k(e0);
       }
       return ok;
    }
}
