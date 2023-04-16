package com.kwai.middleware.azeroth.network.interceptor.a;
import java.lang.Throwable;
import okhttp3.Request;
import okhttp3.Response;
import com.kwai.middleware.azeroth.network.AzerothApiException;
import java.lang.String;
import java.io.IOException;
import java.lang.StringBuilder;
import java.lang.Object;

public class a	// class@000f14
{

    public static void a(Throwable p0,Request p1,Response p2){
       String str;
       IOException iOException;
       if (p0 instanceof AzerothApiException) {
          throw p0;
       }
       int i = 0;
       if (p2 != null) {
          i = p2.code();
          str = p2.header("Expires");
          if (!p2.isSuccessful()) {
             iOException = new IOException("Request failed with response: "+p2, p0);
          }
       }else {
          str = "";
       }
       throw new AzerothApiException(iOException, p1, i, str);
    }
}
