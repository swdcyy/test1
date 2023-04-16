package com.airbnb.lottie.a$c;
import java.util.concurrent.Callable;
import android.content.Context;
import java.lang.Object;
import com.airbnb.lottie.a;
import android.content.res.Resources;
import java.io.InputStream;
import java.lang.String;
import w4.m;
import java.lang.Throwable;

public final class a$c implements Callable	// class@000d92
{
    public final Context b;
    public final int c;

    public void a$c(Context p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       m om;
       a$c tb = this.b;
       a$c tc = this.c;
       Map a = a.a;
       try{
          om = a.e(tb.getResources().openRawResource(tc), a.m(tc));
       }catch(android.content.res.Resources$NotFoundException e0){
          om = new m(e0);
       }
       return om;
    }
}
