package com.vivo.push.util.k;
import android.os.AsyncTask;
import android.content.Context;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.d.r$a;
import java.lang.String;
import java.util.List;
import com.vivo.push.util.p;
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.io.InputStream;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.lang.Object;
import com.vivo.push.util.l;
import java.lang.Runnable;
import com.vivo.push.m;

public final class k extends AsyncTask	// class@0010b9
{
    public Context a;
    public InsideNotificationItem b;
    public long c;
    public boolean d;
    public int e;
    public r$a f;

    public void k(Context p0,InsideNotificationItem p1,long p2,boolean p3,r$a p4){
       super();
       this.e = 0;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.f = p4;
    }
    public static InsideNotificationItem a(k p0){
       return p0.b;
    }
    public static long b(k p0){
       return p0.c;
    }
    public static Context c(k p0){
       return p0.a;
    }
    public static int d(k p0){
       return p0.e;
    }
    public static r$a e(k p0){
       return p0.f;
    }
    public final List a(String[] p0){
       InputStream inputStream;
       List list;
       this.e = this.b.getNotifyDisplayStatus();
       if (this.d == null) {
          p.d("ImageDownTask", "bitmap is not display by forbid net");
          return null;
       }else {
          ArrayList uArrayList = new ArrayList();
          int i = 0;
          while (i < 2) {
             object oobject = p0[i];
             p.d("ImageDownTask", "imgUrl="+oobject+" i="+i);
             if (!TextUtils.isEmpty(oobject)) {
                try{
                   HttpURLConnection httpURLConne = new URL(oobject).openConnection();
                   httpURLConne.setConnectTimeout(0x7530);
                   httpURLConne.setDoInput(true);
                   httpURLConne.setUseCaches(false);
                   httpURLConne.connect();
                   int responseCode = httpURLConne.getResponseCode();
                   p.c("ImageDownTask", ("code=").concat(String.valueOf(responseCode)));
                   if (responseCode == 200) {
                      inputStream = httpURLConne.getInputStream();
                      try{
                         list = BitmapFactory.decodeStream(inputStream);
                      label_007a :
                         if (inputStream != null) {
                            try{
                               inputStream.close();
                            }catch(java.lang.Exception e0){
                            }
                         }
                      }catch(java.net.MalformedURLException e0){
                         p.a("ImageDownTask", "MalformedURLException");
                         if (inputStream) {
                         }
                      }catch(java.io.IOException e0){
                         p.a("ImageDownTask", "IOException");
                         if (inputStream) {
                         }
                         list = null;
                      }
                      try{
                         inputStream.close();
                         goto label_0097 ;
                      }catch(java.lang.Exception e0){
                      }
                   }else {
                      List list1 = null;
                      list = list1;
                      goto label_007a ;
                   }
                }catch(java.net.MalformedURLException e0){
                   inputStream = null;
                   goto label_008f ;
                }catch(java.io.IOException e0){
                   inputStream = null;
                   goto label_0083 ;
                }
             }else if(!i){
                uArrayList.add(null);
             }
             i = i + 1;
          }
          return uArrayList;
       }
    }
    public final Object doInBackground(Object[] p0){
       return this.a(p0);
    }
    public final void onPostExecute(Object p0){
       super.onPostExecute(p0);
       p.c("ImageDownTask", "onPostExecute");
       m.c(new l(this, p0));
    }
}
