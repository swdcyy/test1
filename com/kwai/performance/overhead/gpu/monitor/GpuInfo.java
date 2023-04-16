package com.kwai.performance.overhead.gpu.monitor.GpuInfo;
import com.kwai.performance.overhead.gpu.monitor.GpuInfo$a;
import nsd.u;
import java.lang.Object;
import java.util.LinkedHashMap;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;
import kotlin.Result;
import java.lang.Float;
import java.lang.String;
import java.util.Collection;
import java.lang.Throwable;
import qrd.j0;
import java.lang.StringBuilder;
import cg7.b;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Iterator;
import com.kwai.performance.overhead.gpu.monitor.GpuInfo$SampleData;

public final class GpuInfo	// class@001147
{
    public final Map a;
    public final Gson b;
    public int c;
    public float d;
    public GpuInfo$SampleData e;
    public String f;
    public double g;
    public double h;
    public GpuInfo$SampleData i;
    public ArrayList j;
    public int k;
    public static final GpuInfo$a l;

    static {
       GpuInfo.l = new GpuInfo$a(null);
    }
    public void GpuInfo(){
       super();
       this.a = new LinkedHashMap();
       this.b = new Gson();
       this.j = new ArrayList(20);
    }
    public final JSONObject a(Map p0){
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("gpu_busy_load", Float.valueOf(this.d));
       jSONObject.put("scene", this.f);
       jSONObject.put("gfxMem", this.g);
       jSONObject.put("nativePss", this.h);
       int i = 1;
       if (this.j.isEmpty() ^ i) {
          jSONObject.put("sampleDataList", this.b.q(this.j));
       }
       if (p0 != null && !p0.isEmpty()) {
          i = 0;
       }
       if (!i) {
          jSONObject.put("custom_extra_info", this.b.q(p0));
       }
       JSONObject jSONObject1 = Result.constructor-impl(jSONObject);
       StringBuilder str = "upload ";
       String str1 = (Result.isFailure-impl(jSONObject1))? "": jSONObject1;
       str = str+str1;
       if (Result.isFailure-impl(jSONObject1)) {
          jSONObject1 = null;
       }
       return jSONObject1;
    }
    public final boolean b(){
       return b.h.c();
    }
    public final boolean c(){
       b h = b.h;
       Objects.requireNonNull(h);
       a.q(this.a, "logData");
       ArrayList uArrayList = new ArrayList();
       uArrayList.add("/sys/devices/platform/gpusysfs");
       uArrayList.add("/sys/class/devfreq/gpufreq");
       uArrayList.add("/sys/class/devfreq/gpufreq/power");
       File[] uFileArray = new File("/sys/class/platform").listFiles(b.f);
       int i = 0;
       if (uFileArray != null) {
       }else {
          uFileArray = new File[i];
       }
       int len = uFileArray.length;
       while (i < len) {
          object oobject = uFileArray[i];
          if (oobject.exists()) {
             a.h(oobject, "maliDetailFile");
             if (oobject.isDirectory()) {
                String absolutePath = oobject.getAbsolutePath();
                a.h(absolutePath, "maliDetailFile.absolutePath");
                uArrayList.add(absolutePath);
             }
          }
          i = i + 1;
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          b.d(h, iterator.next(), linkedHashMa, null, 4, null);
       }
       return (this.a.isEmpty() ^ 0x01);
    }
    public final boolean d(){
       double d;
       if (this.j.isEmpty()) {
          return false;
       }
       Iterator iterator = this.j.iterator();
       while (iterator.hasNext()) {
          GpuInfo$SampleData sampleData = iterator.next();
          GpuInfo$SampleData gpuBusy = sampleData.gpuBusy;
          d = (double)gpuBusy;
          if (d >= 0 && d - 0x3ff0000000000000 <= 0) {
             float f = this.d + gpuBusy;
             this.d = f;
          }
          double d1 = this.g + sampleData.graphicsMemory;
          this.g = d1;
          d1 = this.h + sampleData.nativePss;
          this.h = d1;
       }
       int i = this.j.size();
       if (i) {
          this.d = this.d / (float)i;
          d = (double)i;
          this.g = this.g / d;
          this.h = this.h / d;
       }
       return true;
    }
}
