package com.tachikoma.core.component.text.b;
import java.lang.Runnable;
import com.tachikoma.core.component.text.c;
import hp8.g;
import hp8.o;
import android.widget.TextView;
import java.lang.Object;
import java.util.Objects;
import java.net.URL;
import java.lang.String;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.io.InputStream;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import hp8.i;
import iq8.x;
import java.lang.Throwable;
import zp8.a;

public final class b implements Runnable	// class@000d99
{
    public final c b;
    public final g c;
    public final o d;
    public final TextView e;

    public void b(c p0,g p1,o p2,TextView p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       int i;
       int i1;
       Throwable throwable;
       InputStream inputStream;
       b tb = this.b;
       b tc = this.c;
       b td = this.d;
       b te = this.e;
       Objects.requireNonNull(tb);
       try{
          i = 0;
          HttpURLConnection httpURLConne = new URL(tc.i).openConnection();
          httpURLConne.setConnectTimeout(5000);
          httpURLConne.connect();
          if (httpURLConne.getResponseCode() == 200) {
             InputStream inputStream1 = httpURLConne.getInputStream();
             try{
                i oi = new i(tb, BitmapFactory.decodeStream(inputStream1), tc, td, te);
                x.f(v8);
                inputStream = inputStream1;
             label_0040 :
                if (inputStream != null) {
                   try{
                   label_0052 :
                      inputStream.close();
                   }catch(java.io.IOException e0){
                      a.g("fetchSpanBitmap close io", e0);
                   }
                }
             }catch(java.lang.Exception e0){
             }
             a.g("fetchSpanBitmap", throwable);
             if (i1) {
                inputStream = i1;
                goto label_0052 ;
             }
          }else {
             goto label_0040 ;
          }
       }catch(java.lang.Exception e1){
          i1 = i;
          throwable = e1;
          goto label_004a ;
       }
    }
}
