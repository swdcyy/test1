package ch7.h;
import android.content.ComponentCallbacks2;
import ch7.i;
import java.lang.Object;
import android.content.res.Configuration;
import ch7.h$a;
import java.lang.System;
import java.lang.Long;
import jh7.c;

public class h implements ComponentCallbacks2	// class@000557
{
    public final i b;

    public void h(i p0){
       this.b = p0;
       super();
    }
    public void onConfigurationChanged(Configuration p0){
    }
    public void onLowMemory(){
    }
    public void onTrimMemory(int p0){
       this.b.b(new h$a(this, Long.valueOf(System.currentTimeMillis()), p0));
    }
}
