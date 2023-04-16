package com.kwai.performance.stability.policy.GCSemiSpaceTrimmer$a;
import java.lang.Runnable;
import com.kwai.performance.stability.policy.GCSemiSpaceTrimmer;
import java.lang.Object;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.lang.String;
import java.io.InputStream;
import java.io.Reader;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.Long;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import android.os.Handler;
import com.yxcorp.utility.AbiUtil;
import java.lang.StringBuilder;
import ig7.c;
import ig7.b;

public class GCSemiSpaceTrimmer$a implements Runnable	// class@00127b
{
    public final GCSemiSpaceTrimmer b;

    public void GCSemiSpaceTrimmer$a(GCSemiSpaceTrimmer p0){
       this.b = p0;
       super();
    }
    public void run(){
       GCSemiSpaceTrimmer$a tb;
       long l1;
       long l = -1;
       BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/self/status")));
       while (true) {
          String str = uBufferedRea.readLine();
          if (str != null) {
             str = str.toLowerCase();
             if (str.contains("vmsize")) {
                l = Long.parseLong((GCSemiSpaceTrimmer.i.matcher(str).replaceAll("")).trim()) * 1024;
             }
          }
          uBufferedRea.close();
          if (l - null < 0) {
             Log.d("GCSemiSpaceTrimmer", "Fail to read vss size, skip checking this time.");
             tb = this.b;
             tb.d.postDelayed(this, tb.b);
             break ;
          }else if(AbiUtil.c()){
             l1 = 0x100000000;
          }else {
             l1 = 0xc0000000;
          }
          str = ", critical_ratio: ";
          if ((float)l - ((float)l1 * this.b.a) > 0) {
             Log.g("GCSemiSpaceTrimmer", "VmSize usage reaches above critical level, trigger native install. vmsize: "+l+str+this.b.a);
             boolean b = this.b.nativeInstall();
             if (b) {
                Log.g("GCSemiSpaceTrimmer", "nativeInstall triggered successfully.");
             }else {
                Log.g("GCSemiSpaceTrimmer", "Fail to trigger nativeInstall.");
             }
             this.b.f.a(new c(2, (b ^ 0x01)));
             break ;
          }else {
             Log.g("GCSemiSpaceTrimmer", "VmSize usage is under critical level, check next time. vmsize: "+l+str+this.b.a);
             tb = this.b;
             tb.d.postDelayed(this, tb.b);
             break ;
          }
       }
       return;
    }
}
