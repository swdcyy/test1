package com.kwai.logger.upload.internal.h;
import java.util.concurrent.atomic.AtomicBoolean;
import v87.a;
import java.util.List;
import java.util.Iterator;
import java.lang.Object;
import java.lang.String;
import t87.f;
import android.content.Context;
import a97.f;
import java.io.File;
import java.lang.StringBuilder;
import v87.d;
import t87.d;
import a97.c;
import java.util.Locale;
import java.lang.Integer;
import com.kwai.logger.upload.internal.k;
import u87.l;
import java.lang.Runnable;
import a97.h;

public class h	// class@000ed3
{
    public static AtomicBoolean a;
    public static c b;
    public static LogStartResponse c;
    public static File d;
    public static String e;

    static {
       h.a = new AtomicBoolean(false);
       h.d = null;
       h.e = "";
    }
    public static void a(a p0){
       List list = p0.e();
       if (list != null && list.size() > 0) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             f.c(f.d, iterator.next(), 1);
          }
       }
       return;
    }
    public static void b(a p0){
       File uFile = p0.f();
       if (uFile != null && uFile.exists()) {
          d.a("ObiwanUploader", "taskId:"+p0.d().a+",reset upload event, delete file "+uFile.getAbsolutePath()+" "+uFile.delete());
       }
       File uFile1 = c.d(f.d);
       if (uFile1.exists()) {
          d.a("ObiwanUploader", "delete "+uFile1.getAbsolutePath()+",result:"+c.c(uFile1));
       }
       uFile1 = h.d;
       if (uFile1 != null && uFile1.exists()) {
          d.a("ObiwanUploader", "delete file temp directory."+h.d.getAbsolutePath()+",result:"+c.c(h.d));
       }
       return;
    }
    public static void c(int p0,String p1,a p2){
       Locale uS = Locale.US;
       Object[] objArray = new Object[]{Integer.valueOf(p0),p1};
       d.a("ObiwanUploader", String.format(uS, "Uploader:upload log failed: %d: %s", objArray));
       Object[] objArray1 = new Object[]{p2.d().a,p2.b()};
       d.a("ObiwanUploader", String.format(uS, "Uploader:upload failed taskId: %s channelType: %s", objArray1));
       k.c(p2, "END");
       k.a(p2, p0, p1);
       h.b(p2);
       h.a(p2);
       h.a.set(0);
       if (h.b != null) {
          h.a(new l(p0, p1));
       }
       h.c = null;
       h.d = null;
       h.e = "";
       return;
    }
}
