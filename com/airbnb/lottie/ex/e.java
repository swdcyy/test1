package com.airbnb.lottie.ex.e;
import java.util.concurrent.Callable;
import android.util.JsonReader;
import java.lang.String;
import java.lang.Object;
import a5.k;
import com.airbnb.lottie.ex.a;

public final class e implements Callable	// class@000da6
{
    public final JsonReader b;
    public final String c;

    public void e(JsonReader p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       return a.c(this.b, this.c);
    }
}
