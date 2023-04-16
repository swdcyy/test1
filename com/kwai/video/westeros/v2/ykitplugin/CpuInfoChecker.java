package com.kwai.video.westeros.v2.ykitplugin.CpuInfoChecker;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.IOException;
import java.lang.Boolean;
import java.util.ArrayList;
import android.os.Build$VERSION;
import android.os.Build;
import java.lang.CharSequence;

public class CpuInfoChecker	// class@0010f7
{
    public String hardWare_;

    public void CpuInfoChecker(){
       super();
    }
    public static CpuInfoChecker getCpuInfo(){
       FileReader uFileReader;
       String str;
       Object[] objArray = null;
       CpuInfoChecker obj = PatchProxy.apply(objArray, objArray, CpuInfoChecker.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new CpuInfoChecker();
          uFileReader = new FileReader("/proc/cpuinfo");
       }catch(java.io.FileNotFoundException e2){
          e2.printStackTrace();
          uFileReader = objArray;
       }
       BufferedReader uBufferedRea = new BufferedReader(uFileReader);
       try{
          str = uBufferedRea.readLine();
          while (str != null) {
             obj.setHardWare(str.split(": ", 2)[1]);
          }
          return obj;
       }catch(java.io.IOException e2){
          e2.printStackTrace();
       }
       if (str.indexOf("Hardware") != -1) {
          goto label_003b ;
       }
    }
    public String getHardWare(){
       return this.hardWare_;
    }
    public void setHardWare(String p0){
       this.hardWare_ = p0;
    }
    public boolean supportHiAI(){
       ArrayList obj = PatchProxy.apply(null, this, CpuInfoChecker.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.hardWare_ == null) {
          return false;
       }
       obj = new ArrayList();
       obj.add("Kirin990");
       obj.add("Kirin985");
       obj.add("Kirin810");
       obj.add("Kirin820");
       obj.add("Kirin9000");
       obj.add("kirin990");
       obj.add("kirin985");
       obj.add("kirin810");
       obj.add("kirin820");
       obj.add("kirin9000");
       int i = 0;
       while (true) {
          if (i >= obj.size()) {
             return false;
          }
          if ((this.hardWare_).indexOf(obj.get(i)) != -1) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public boolean supportNeuroPilot(){
       ArrayList obj = PatchProxy.apply(null, this, CpuInfoChecker.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.hardWare_ == null) {
          return false;
       }
       obj = new ArrayList();
       obj.add("mt6889");
       obj.add("MT6889");
       obj.add("mt6885");
       obj.add("MT6885");
       obj.add("mt6873");
       obj.add("MT6873");
       int i = 0;
       while (true) {
          if (i >= obj.size()) {
             return false;
          }
          if ((this.hardWare_).indexOf(obj.get(i)) != -1) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public boolean supportSNPE(){
       String obj = PatchProxy.apply(null, this, CpuInfoChecker.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.hardWare_ == null) {
          return false;
       }
       if (Build$VERSION.SDK_INT >= 30) {
          obj = Build.BRAND;
          if (obj != null && (!obj.contains("Xiaomi") && (!obj.contains("xiaomi") && (obj.contains("Redmi") || obj.contains("redmi"))))) {
             return false;
          }
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.add("SM8350");
       uArrayList.add("SM8250");
       uArrayList.add("SM8150-AC");
       uArrayList.add("SM8150");
       uArrayList.add("SDM845");
       uArrayList.add("SDM765");
       uArrayList.add("SDM765G");
       uArrayList.add("SM7250");
       uArrayList.add("SM7250-AA");
       uArrayList.add("SM7250-AB");
       uArrayList.add("SM7250-AC");
       uArrayList.add("SM7225");
       uArrayList.add("SM7150");
       uArrayList.add("SDM730");
       uArrayList.add("SDM730G");
       uArrayList.add("SM7150");
       uArrayList.add("SM7150-AB");
       uArrayList.add("SM7150-AA");
       uArrayList.add("SM7125");
       uArrayList.add("SDM720G");
       uArrayList.add("SM6350");
       uArrayList.add("SDM690");
       uArrayList.add("SM6150");
       uArrayList.add("SDM675");
       uArrayList.add("SDM670");
       uArrayList.add("SM6125");
       uArrayList.add("SDM665");
       int i = 0;
       while (true) {
          if (i >= uArrayList.size()) {
             return false;
          }
          if ((this.hardWare_).indexOf(uArrayList.get(i)) != -1) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
}
