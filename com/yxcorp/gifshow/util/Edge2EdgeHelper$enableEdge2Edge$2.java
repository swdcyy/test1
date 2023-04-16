package com.yxcorp.gifshow.util.Edge2EdgeHelper$enableEdge2Edge$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import o56.c;
import o56.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Build$VERSION;
import com.kwai.sdk.switchconfig.a;
import xf6.d;

public final class Edge2EdgeHelper$enableEdge2Edge$2 extends Lambda implements a	// class@001ee7
{
    public static final Edge2EdgeHelper$enableEdge2Edge$2 INSTANCE;

    static {
       Edge2EdgeHelper$enableEdge2Edge$2.INSTANCE = new Edge2EdgeHelper$enableEdge2Edge$2();
    }
    public void Edge2EdgeHelper$enableEdge2Edge$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       boolean b = true;
       if (!uoc.c()) {
          if (Build$VERSION.SDK_INT < 29 || !a.t().d("enableEdge2Edge", false)) {
          label_0024 :
             b = false;
          }
       }else {
          boolean i = d.B();
          if (i != b) {
             i = (i != 2)? a.t().d("enableEdge2Edge", false): false;
          }else {
             i = true;
          }
          if (!i || Build$VERSION.SDK_INT < 29) {
          }
       }
       return b;
    }
}
