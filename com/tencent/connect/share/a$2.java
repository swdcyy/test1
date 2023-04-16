package com.tencent.connect.share.a$2;
import java.lang.Runnable;
import java.lang.String;
import android.os.Handler;
import android.content.Context;
import java.lang.Object;
import android.graphics.Bitmap;
import com.tencent.connect.share.a;
import java.io.File;
import com.tencent.open.utils.f;
import java.lang.StringBuilder;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import android.os.Message;
import com.tencent.open.utils.k;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.ArrayList;
import java.lang.Throwable;

public final class a$2 implements Runnable	// class@000e53
{
    public final String a;
    public final Handler b;
    public final Context c;

    public void a$2(String p0,Handler p1,Context p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       String separator;
       CharSequence uCharSequenc;
       String str1;
       Message message1;
       String str2;
       String str = "openSDK_LOG.AsynScaleCompressImage";
       int i = 102;
       try{
          int i1 = 840;
          Bitmap uBitmap = a.a(this.a, i1);
          if (uBitmap != null) {
             File uFile = f.a("Images");
             a$2 u2 = null;
             if (uFile != null) {
                separator = File.separator;
                separator = uFile.getAbsolutePath()+separator+Constants.QQ_SHARE_TEMP_DIR+separator;
                uCharSequenc = u2;
             }else {
                uFile = f.d();
                if (uFile == null) {
                   SLog.i(str, "scaleCompressImage\(\) getCacheDir = null,return error");
                   message1 = this.b.obtainMessage();
                   message1.arg1 = i;
                   this.b.sendMessage(message1);
                   return;
                }else {
                   separator = uFile.getAbsolutePath();
                   str1 = File.separator;
                   String str3 = separator+str1+Constants.QQ_SHARE_TEMP_DIR+str1;
                   SLog.i(str, "scaleCompressImage\(\) use cache dir="+str3);
                   String str4 = str3;
                   str3 = separator;
                   separator = str4;
                }
             }
             str1 = "share2qq_temp"+k.g(this.a)+".jpg";
             a$2 ta = this.a;
             if (!a.a(ta, i1, i1)) {
                SLog.i(str, "scaleCompressImage\(\) not out of bound,not compress!");
             }else {
                SLog.i(str, "scaleCompressImage\(\) out of bound,compress!");
                str2 = a.a(uBitmap, separator, str1);
                if (!TextUtils.isEmpty(str2)) {
                   ta = str2;
                }
             }
             int b = k.n(ta);
             SLog.i(str, "scaleCompressImage\(\) check file isAppSpecificDir="+b);
             ArrayList uArrayList = new ArrayList(2);
             if (b) {
                u2 = ta;
             }else if(TextUtils.isEmpty(uCharSequenc)){
                str2 = separator+str1;
                boolean b1 = k.a(this.c, ta, str2);
                SLog.i(str, "scaleCompressImage\(\) sd permission not denied. copy to app sepcific:"+str2+",isSuccess="+b1);
                if (b1) {
                   u2 = str2;
                }
             }
             uArrayList.add(ta);
             uArrayList.add(u2);
             if (uArrayList.size() >= 2) {
                b = 0;
                if (uArrayList.get(b) != null || uArrayList.get(1) != null) {
                   SLog.i(str, "scaleCompressImage\(\) return success ! destFilePath=["+uArrayList.get(b)+","+uArrayList.get(1)+"]");
                   message1 = this.b.obtainMessage(101);
                   message1.obj = uArrayList;
                   this.b.sendMessage(message1);
                   return;
                }
             }
          }
       }catch(java.lang.Exception e2){
          SLog.e(str, "scaleCompressImage runnable exception e:", e2);
       }
       SLog.d(str, "scaleCompressImage\(\) return failed!");
       Message message = this.b.obtainMessage(i);
       message.arg1 = 3;
       this.b.sendMessage(message);
       return;
    }
}
