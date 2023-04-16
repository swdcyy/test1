package com.kuaishou.android.security.base.util.j$a;
import java.lang.Runnable;
import java.io.File;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kuaishou.android.security.base.util.j;
import com.kuaishou.android.security.base.log.d;
import com.kuaishou.android.security.base.perf.d$b;
import java.lang.Throwable;
import com.kuaishou.android.security.base.perf.b;
import com.kuaishou.android.security.base.perf.d;
import android.os.ConditionVariable;

public final class j$a implements Runnable	// class@000f21
{
    public final File a;
    public final String b;
    public final String c;

    public void j$a(File p0,String p1,String p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       String str1;
       if (PatchProxy.applyVoid(null, this, j$a.class, "1")) {
          return;
       }
       if (!this.a.exists()) {
          this.a.mkdir();
       }
       String separator = File.separator;
       File uFile = new File(this.a.getAbsolutePath()+separator+this.b);
       String str = this.a.getAbsolutePath()+separator;
       str = str+this.b+"_bak";
       if (uFile.exists()) {
          j.a(uFile, new File(str));
          uFile.delete();
       }
       j.a(this.c, uFile);
       if (uFile.exists()) {
          uFile = new File(str);
          if (uFile.exists()) {
             uFile.delete();
          }
          str1 = "download file success";
       }else {
          File uFile1 = new File(str);
          if (uFile1.exists()) {
             j.a(uFile1, uFile);
          }
          uFile1.delete();
          str1 = "download file fail";
       }
       d.a(str1);
       j.a().open();
       return;
    }
}
