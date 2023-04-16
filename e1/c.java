package e1.c;
import java.lang.String;
import java.lang.Throwable;
import java.lang.StackTraceElement;
import java.lang.StringBuilder;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import android.view.ViewGroup;
import java.lang.Math;

public class c	// class@001e7f
{

    public static String a(){
       object oobject = new Throwable().getStackTrace()[1];
       return ".\("+oobject.getFileName()+":"+oobject.getLineNumber()+"\)";
    }
    public static String b(Context p0,int p1){
       try{
          if (p1 != -1) {
             return p0.getResources().getResourceEntryName(p1);
          }
          return "UNKNOWN";
       }catch(java.lang.Exception e0){
          return "?"+p1;
       }
    }
    public static String c(View p0){
       try{
          return p0.getContext().getResources().getResourceEntryName(p0.getId());
       }catch(java.lang.Exception e0){
          return "UNKNOWN";
       }
    }
    public static String d(MotionLayout p0,int p1){
       if (p1 == -1) {
          return "UNDEFINED";
       }
       return p0.getContext().getResources().getResourceEntryName(p1);
    }
    public static void e(String p0,String p1,int p2){
       StackTraceElement[] stackTrace = new Throwable().getStackTrace();
       int i = 1;
       int i1 = Math.min(p2, (stackTrace.length - i));
       String str = " ";
       for (; i <= i1; i = i + 1) {
          stackTrace[i].getFileName();
          stackTrace[i].getLineNumber();
          stackTrace[i].getMethodName();
          str+" ";
       }
       return;
    }
}
