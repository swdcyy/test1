package a7.d;
import java.lang.Throwable;
import java.util.ArrayList;
import java.io.StringWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import x6.a;
import java.lang.StringBuffer;
import java.util.Iterator;
import java.lang.StringBuilder;
import java.io.File;
import java.io.FileWriter;

public final class d	// class@0000fe
{
    public static String a = "";
    public static String b = "";
    public static String c = "";

    public static synchronized void a(Throwable p0){
       String str;
       _monitor_enter(d.class);
       ArrayList uArrayList = new ArrayList();
       if (p0 != null) {
          StringWriter stringWriter = new StringWriter();
          p0.printStackTrace(new PrintWriter(stringWriter));
          str = stringWriter.toString();
       }else {
          str = "";
       }
       uArrayList.add(str);
       d.b(uArrayList);
       _monitor_exit(d.class);
       return;
    }
    public static synchronized void b(List p0){
       _monitor_enter(d.class);
       if (a.c(d.b) || a.c(d.c)) {
          _monitor_exit(d.class);
          return;
       }else {
          StringBuffer str = d.c;
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             str = str+", "+iterator.next();
          }
          String str1 = "\n";
          try{
             str+str1;
             File uFile = new File(d.a);
             if (!uFile.exists()) {
                uFile.mkdirs();
             }
             uFile = new File(d.a, d.b);
             if (!uFile.exists()) {
                uFile.createNewFile();
             }
             FileWriter uFileWriter = (((long)str.length() + uFile.length()) - 0xc800 <= 0)? new FileWriter(uFile, true): new FileWriter(uFile);
             uFileWriter.write(str);
             uFileWriter.flush();
             uFileWriter.close();
             _monitor_exit(d.class);
             return;
          }catch(java.lang.Exception e0){
             _monitor_exit(e0);
             return;
          }
       }
    }
}
