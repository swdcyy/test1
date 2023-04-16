package com.tencent.open.utils.c$2;
import java.lang.Runnable;
import com.tencent.open.utils.c;
import java.lang.Object;
import java.lang.String;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.k;
import java.lang.StringBuilder;
import java.io.File;
import android.os.Handler;
import android.os.Message;
import java.lang.System;
import android.graphics.Bitmap;

public class c$2 implements Runnable	// class@000f77
{
    public final c a;

    public void c$2(c p0){
       this.a = p0;
       super();
    }
    public void run(){
       boolean b;
       String str = "AsynLoadImg";
       SLog.v(str, "saveFileRunnable:");
       String str1 = "share_qq_"+k.g(c.b(this.a))+".jpg";
       String str2 = c.a()+str1;
       Message message = c.c(this.a).obtainMessage();
       int i = 0;
       if (new File(str2).exists()) {
          message.arg1 = i;
          message.obj = str2;
          SLog.v(str, "file exists: time:"+(System.currentTimeMillis() - c.d(this.a)));
       }else {
          Bitmap uBitmap = c.a(c.b(this.a));
          if (uBitmap != null) {
             b = this.a.a(uBitmap, str1);
          }else {
             SLog.v(str, "saveFileRunnable:get bmp fail---");
             b = false;
          }
          if (b) {
             message.arg1 = i;
             message.obj = str2;
          }else {
             message.arg1 = 1;
          }
          SLog.v(str, "file not exists: download time:"+(System.currentTimeMillis() - c.d(this.a)));
       }
       c.c(this.a).sendMessage(message);
       return;
    }
}
