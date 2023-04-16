package com.meizu.cloud.pushsdk.b.e;
import java.lang.Object;
import java.text.SimpleDateFormat;
import java.lang.String;
import com.meizu.cloud.pushsdk.b.d;
import java.io.BufferedWriter;
import java.io.File;
import com.meizu.cloud.pushsdk.b.e$1;
import java.io.FileFilter;
import com.meizu.cloud.pushsdk.b.e$a;
import java.util.Comparator;
import java.util.Arrays;
import java.io.IOException;
import java.lang.StringBuilder;
import java.util.Date;
import java.io.FileWriter;
import java.io.Writer;

public class e	// class@0014b0
{
    public final SimpleDateFormat a;
    public final d b;
    public BufferedWriter c;

    public void e(){
       super();
       this.a = new SimpleDateFormat("yyyy-MM-dd");
       this.b = new d("lo");
    }
    public void a(){
       e tc = this.c;
       if (tc != null) {
          tc.flush();
          this.c.close();
          this.c = null;
       }
       return;
    }
    public void a(File p0){
       File[] uFileArray = p0.listFiles(new e$1(this));
       if (uFileArray != null) {
          int i = 7;
          if (uFileArray.length > i) {
             Arrays.sort(uFileArray, new e$a(this));
             for (; i < uFileArray.length; i = i + 1) {
                uFileArray[i].delete();
             }
          }
       }
       return;
    }
    public void a(String p0){
       File uFile = new File(p0);
       if (!uFile.exists() && !uFile.mkdirs()) {
          throw new IOException("create "+p0+" dir failed!!!");
       }
       File uFile1 = new File(p0, this.a.format(new Date())+".log.txt");
       if (!uFile1.exists() && uFile1.createNewFile()) {
          this.a(uFile);
       }
       this.c = new BufferedWriter(new FileWriter(uFile1, true));
       return;
    }
    public void a(String p0,String p1,String p2){
       if (this.c != null) {
          this.c.write(this.b.a((p0+p1+" "+p2).getBytes()));
          this.c.write("\r\n");
       }
       return;
    }
}
