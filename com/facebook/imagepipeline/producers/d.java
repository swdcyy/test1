package com.facebook.imagepipeline.producers.d;
import java.lang.Runnable;
import com.facebook.imagepipeline.producers.f;
import com.facebook.imagepipeline.producers.f$a;
import com.facebook.imagepipeline.producers.n$a;
import java.lang.Object;
import java.util.Objects;
import android.net.Uri;
import id.s;
import java.net.HttpURLConnection;
import hb.b;
import java.io.InputStream;
import java.lang.Throwable;

public class d implements Runnable	// class@001130
{
    public final f$a b;
    public final n$a c;
    public final f d;

    public void d(f p0,f$a p1,n$a p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       int i;
       HttpURLConnection httpURLConne;
       d td = this.d;
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(td);
       try{
          i = 0;
          httpURLConne = td.f(tb.f(), 5);
          try{
             tb.g = td.e.now();
             if (httpURLConne != null) {
                InputStream inputStream = httpURLConne.getInputStream();
                tc.c(inputStream, -1);
             label_0025 :
                if (inputStream != null) {
                   try{
                      inputStream.close();
                   }catch(java.io.IOException e0){
                   }
                }
             }else {
                goto label_0025 ;
             }
          label_0047 :
             return;
          }catch(java.io.IOException e0){
          }
          tc.onFailure(e0);
          if (i) {
             try{
                i.close();
             }catch(java.io.IOException e0){
             }
          }
       }catch(java.io.IOException e0){
          httpURLConne = i;
          goto label_0038 ;
       }
    }
}
