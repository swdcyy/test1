package com.loc.eb;
import java.lang.Throwable;
import com.loc.dq;
import java.lang.String;
import java.net.UnknownHostException;
import java.io.StringWriter;
import java.io.PrintWriter;
import java.io.Writer;

public final class eb	// class@0013fb
{

    public static void a(Throwable p0){
       if (dq.a) {
          eb.b(p0);
       }
       return;
    }
    public static String b(Throwable p0){
       String str = "";
       if (p0 == null) {
          return str;
       }
       Throwable throwable = p0;
       while (true) {
          if (throwable != null) {
             if (throwable instanceof UnknownHostException) {
                break ;
             }else {
                throwable = throwable.getCause();
             }
          }else {
             StringWriter stringWriter = new StringWriter();
             PrintWriter printWriter = new PrintWriter(stringWriter);
             p0.printStackTrace(printWriter);
             printWriter.flush();
             return stringWriter.toString();
          }
       }
       return str;
    }
}
