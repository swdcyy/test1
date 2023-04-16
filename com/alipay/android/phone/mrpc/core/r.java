package com.alipay.android.phone.mrpc.core.r;
import java.io.Closeable;

public final class r	// class@000e58
{

    public static void a(Closeable p0){
       if (p0 != null) {
          try{
             p0.close();
          }catch(java.io.IOException e0){
          }
       }
       return;
    }
}
