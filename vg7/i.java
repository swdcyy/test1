package vg7.i;
import android.os.Build$VERSION;
import java.lang.String;
import vg7.i$a;
import java.io.RandomAccessFile;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Long;
import java.lang.Integer;
import java.io.IOException;
import com.kwai.performance.monitor.base.MonitorBuildConfig;

public class i	// class@0026ac
{

    public static boolean a(int p0){
       boolean b = (Build$VERSION.SDK_INT >= p0)? true: false;
       return b;
    }
    public static String b(String p0,String p1){
       int i = p1.length();
       int i1 = -1;
       while (true) {
          if (i < p0.length()) {
             char c = p0.charAt(i);
             if (c >= '0' && c <= '9') {
                if (i1 == -1) {
                   i1 = i;
                }
             }else if(i1 != -1){
             label_0023 :
                if (i1 == -1) {
                   p0 = null;
                   break ;
                }else if(i == -1){
                   p0 = p0.substring(i1);
                   break ;
                }else {
                   p0 = p0.substring(i1, i);
                   break ;
                }
             }
             i++;
          }else {
             i = -1;
             goto label_0023 ;
          }
       }
       return p0;
    }
    public static i$a c(){
       String str = "Threads:";
       i$a uoa = new i$a();
       try{
          int i = 0;
          RandomAccessFile randomAccess = new RandomAccessFile("/proc/self/status", "r");
          try{
             String str1 = randomAccess.readLine();
             while (str1 != null) {
                if (TextUtils.isEmpty(str1)) {
                   continue ;
                }else if(str1.startsWith("VmSize") && str1.contains("kB")){
                   str1 = i.b(str1, "VmSize");
                   if (str1 != null) {
                      uoa.b = Long.valueOf(str1).longValue();
                   }
                }else if(str1.startsWith("VmRSS:") && str1.contains("kB")){
                   str1 = i.b(str1, "VmRSS:");
                   if (str1 != null) {
                      uoa.c = Long.valueOf(str1).longValue();
                   }
                }else if(str1.startsWith(str)){
                   str1 = i.b(str1, str);
                   if (str1 != null) {
                      uoa.f = Integer.valueOf(str1).intValue();
                   }
                }
             }
             randomAccess.close();
          label_008a :
             return uoa;
          }catch(java.io.IOException e0){
             RandomAccessFile randomAccess1 = randomAccess;
          }
          e0.printStackTrace();
          if (!i) {
             return uoa;
          }
          i.close();
          goto label_008a ;
       }catch(java.io.IOException e0){
          goto label_0082 ;
       }catch(java.io.IOException e0){
       }
    }
    public static boolean d(){
       return (MonitorBuildConfig.e()).contains("EMUI");
    }
}
