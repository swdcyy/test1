package com.kwai.performance.stability.crash.monitor.util.CpuInfoUtils;
import java.io.File;
import java.lang.StringBuilder;
import java.lang.String;
import android.os.Process;
import com.kwai.performance.stability.crash.monitor.util.CpuInfoUtils$CpuInfo;
import java.lang.Integer;
import java.lang.Long;
import java.lang.CharSequence;
import android.text.TextUtils;

public class CpuInfoUtils	// class@00120c
{
    public static File a;

    static {
       CpuInfoUtils.a = new File("/proc/"+Process.myPid()+"/task");
    }
    public static CpuInfoUtils$CpuInfo a(String p0){
       String[] stringArray = p0.split("\\s+");
       CpuInfoUtils$CpuInfo uCpuInfo = null;
       int i = 18;
       if (stringArray.length <= i) {
          return uCpuInfo;
       }
       try{
          int i1 = Integer.parseInt(stringArray[0]);
          String str = (stringArray[1]).substring(1, ((stringArray[1]).length() - 1));
          long l = Long.parseLong(stringArray[13]);
          long l1 = Long.parseLong(stringArray[14]);
          if (i1 && !TextUtils.isEmpty(str)) {
             uCpuInfo = new CpuInfoUtils$CpuInfo();
             uCpuInfo.name = str;
             uCpuInfo.tid = i1;
             uCpuInfo.status = stringArray[2];
             uCpuInfo.utm = l;
             uCpuInfo.stm = l1;
             uCpuInfo.nice = Integer.parseInt(stringArray[i]);
             if (stringArray.length > 38) {
                uCpuInfo.cpu = Integer.valueOf(stringArray[38]);
             }
          }
          return uCpuInfo;
       }catch(java.lang.NumberFormatException e0){
       }
    }
}
