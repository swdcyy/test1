package com.sina.weibo.sdk.share.a;
import android.content.Context;
import android.net.Uri;
import java.lang.String;
import com.sina.weibo.sdk.b.a$a;
import com.sina.weibo.sdk.b.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.io.File;
import android.os.Environment;
import java.util.Calendar;
import java.lang.Object;
import android.content.ContentResolver;
import android.database.Cursor;
import java.lang.Exception;
import com.sina.weibo.sdk.b.c;
import android.os.ParcelFileDescriptor;
import java.io.FileDescriptor;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.Throwable;

public final class a	// class@000bd3
{

    public static String a(Context p0,Uri p1,int p2){
       Cursor uCursor;
       CharSequence uCharSequenc;
       StringBuilder str = "_display_name";
       int i = 0;
       try{
          a$a uoa = a.e(p0);
          String str1 = "";
          if (uoa != null) {
             str1 = uoa.packageName;
          }
          if (TextUtils.isEmpty(str1)) {
             str1 = "com.sina.weibo";
          }
          String str2 = "/Android/data/"+str1+"/files/.composerTem/";
          new File(Environment.getExternalStorageDirectory().getAbsolutePath()+str2).mkdirs();
          Calendar instance = Calendar.getInstance();
          try{
             if (("file").equals(p1.getScheme())) {
                uCharSequenc = instance.getTimeInMillis()+p1.getLastPathSegment();
                uCursor = i;
             }else {
                String[] stringArray = new String[]{str};
                uCursor = p0.getContentResolver().query(p1, stringArray, null, null, null);
                uCharSequenc = (uCursor != null && uCursor.moveToFirst())? uCursor.getString(uCursor.getColumnIndex(str)): i;
             }
             if (uCursor != null) {
                uCursor.close();
             label_00c0 :
                if (TextUtils.isEmpty(uCharSequenc)) {
                   str = Calendar.getInstance().getTimeInMillis();
                   String str3 = (!p2)? "_sdk_temp.mp4": "_sdk_temp.jpg";
                   uCharSequenc = str+str3;
                }
                FileInputStream uFileInputSt = new FileInputStream(p0.getContentResolver().openFileDescriptor(p1, "r").getFileDescriptor());
                try{
                   BufferedInputStream uBufferedInp = new BufferedInputStream(uFileInputSt);
                   File uFile = new File(Environment.getExternalStorageDirectory().getAbsolutePath()+str2+uCharSequenc);
                   if (uFile.exists()) {
                      uFile.delete();
                   }
                   FileOutputStream uFileOutputS = new FileOutputStream(uFile);
                   try{
                      uCharSequenc = 1444;
                      byte[] uobyteArray = new byte[uCharSequenc];
                      i = uBufferedInp.read(uobyteArray);
                      while (i != -1) {
                         uFileOutputS.write(uobyteArray, 0, i);
                      }
                      String path = uFile.getPath();
                      try{
                         uBufferedInp.close();
                         uFileOutputS.close();
                      }catch(java.lang.Exception e11){
                         e11.printStackTrace();
                      }
                      return path;
                   }catch(java.lang.Exception e10){
                   }
                   i = uBufferedInp;
                }catch(java.lang.Exception e10){
                   uFileInputSt = i;
                   goto label_0153 ;
                }
             }else {
                goto label_00c0 ;
             }
          }catch(java.lang.Exception e0){
             uCursor = i;
          }catch(java.lang.Exception e0){
          }catch(java.lang.Exception e10){
             p2 = i;
          }
          c.b("WBShareTag", "share util and error is "+e10.getMessage());
          throw new Throwable(e10);
       }catch(java.lang.Exception e10){
       }
    }
}
