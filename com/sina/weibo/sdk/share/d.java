package com.sina.weibo.sdk.share.d;
import android.os.AsyncTask;
import android.content.Context;
import com.sina.weibo.sdk.share.b;
import java.lang.ref.WeakReference;
import java.lang.Object;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.share.c;
import com.sina.weibo.sdk.b.a$a;
import com.sina.weibo.sdk.b.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.ArrayList;
import com.sina.weibo.sdk.api.MultiImageObject;
import java.util.Iterator;
import android.net.Uri;
import java.lang.String;
import com.sina.weibo.sdk.b.b;
import java.io.File;
import android.os.Build$VERSION;
import com.sina.weibo.sdk.share.a;
import java.lang.IllegalArgumentException;
import com.sina.weibo.sdk.api.VideoSourceObject;
import com.kuaishou.webkit.MimeTypeMap;
import com.sina.weibo.sdk.b.c;
import java.lang.Throwable;

public final class d extends AsyncTask	// class@000bd6
{
    public WeakReference B;
    public b C;

    public void d(Context p0,b p1){
       super();
       this.B = new WeakReference(p0);
       this.C = p1;
    }
    public final c a(WeiboMultiMessage[] p0){
       String str;
       int i;
       String str2;
       int i1;
       Context uContext = this.B.get();
       c uoc = null;
       if (uContext == null) {
          return uoc;
       }
       object oobject = p0[0];
       if (oobject == null) {
          return uoc;
       }
       a$a uoa = a.e(uContext);
       uoa = (uoa != null)? uoa.packageName: "";
       if (TextUtils.isEmpty(uoa)) {
          str = "com.sina.weibo";
       }
       c uoc1 = new c();
       if (oobject.imageObject != null && oobject.multiImageObject != null) {
          oobject.imageObject = uoc;
       }
       if (oobject.videoSourceObject != null && (oobject.imageObject != null || oobject.multiImageObject != null)) {
          oobject.imageObject = uoc;
          oobject.multiImageObject = uoc;
       }
       WeiboMultiMessage weiboMultiMe = 24;
       if (oobject.multiImageObject != null) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = oobject.multiImageObject.getImageList().iterator();
          while (true) {
             if (iterator.hasNext()) {
                Uri uri = iterator.next();
                if (uri != null) {
                   String str1 = b.a(uContext, uri);
                   if (!TextUtils.isEmpty(str1)) {
                      File uFile = new File(str1);
                      if (!b.c(uFile)) {
                         str1 = b.b(uFile);
                         if (!TextUtils.isEmpty(str1) && str1.startsWith("image/")) {
                            i = 1;
                         label_0094 :
                            if (i) {
                               if (Build$VERSION.SDK_INT >= weiboMultiMe) {
                                  uArrayList.add(uri);
                                  uContext.grantUriPermission(str, uri, 1);
                               }else {
                                  str2 = a.a(uContext, uri, 1);
                                  if (!TextUtils.isEmpty(str2)) {
                                     uArrayList.add(Uri.fromFile(new File(str2)));
                                  }else {
                                     break ;
                                  }
                               }
                            }
                         }
                      }
                      i = 0;
                      goto label_0094 ;
                   }else {
                      throw new IllegalArgumentException("get image path is null");
                   }
                }
             }else {
                oobject.multiImageObject.imageList = uArrayList;
             }
          }
          throw new IllegalArgumentException("image\'s path is null");
       }
       WeiboMultiMessage videoSourceO = oobject.videoSourceObject;
       if (videoSourceO != null) {
          VideoSourceObject videoPath = videoSourceO.videoPath;
          if (videoPath != null) {
             String str3 = b.a(uContext, videoPath);
             if (!TextUtils.isEmpty(str3)) {
                File uFile1 = new File(str3);
                if (!b.c(uFile1)) {
                   str3 = "*/*";
                   str2 = uFile1.getName();
                   i = str2.lastIndexOf(".");
                   if (i >= 0) {
                      str2 = str2.substring(i);
                      if (!TextUtils.isEmpty(str2) || str2.length() >= 2) {
                         str3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension((str2.substring(1)).toLowerCase());
                      }
                   }
                   if (!TextUtils.isEmpty(str3) && str3.startsWith("video/")) {
                      i1 = 1;
                   label_012b :
                      if (i1) {
                         if (Build$VERSION.SDK_INT >= weiboMultiMe) {
                            weiboMultiMe = oobject.videoSourceObject;
                            weiboMultiMe.videoPath = videoPath;
                            weiboMultiMe.during = b.e(b.b(uContext, videoPath));
                            uContext.grantUriPermission(str, oobject.videoSourceObject.videoPath, 1);
                         }else {
                            String str4 = a.a(uContext, videoPath, 0);
                            c.a("WBShareTag", ("prepare video resource and video\'path is").concat(String.valueOf(str4)));
                            if (!TextUtils.isEmpty(str4)) {
                               oobject.videoSourceObject.videoPath = Uri.fromFile(new File(str4));
                               oobject.videoSourceObject.during = b.e(str4);
                            }else {
                               throw new IllegalArgumentException("video\'s path is null");
                            }
                         }
                      }
                   }
                }
             label_012a :
                i1 = 0;
                goto label_012b ;
             }else {
                throw new IllegalArgumentException("get video path is null");
             }
          }
       }
       uoc1.A = oobject;
       uoc1.z = true;
       return uoc1;
    }
    public final Object doInBackground(Object[] p0){
       return this.a(p0);
    }
    public final void onPostExecute(Object p0){
       super.onPostExecute(p0);
       d tC = this.C;
       if (tC != null) {
          tC.a(p0);
       }
       return;
    }
    public final void onPreExecute(){
       super.onPreExecute();
    }
}
